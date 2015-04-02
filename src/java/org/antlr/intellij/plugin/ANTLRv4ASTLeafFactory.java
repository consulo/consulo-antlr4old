package org.antlr.intellij.plugin;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.intellij.plugin.parser.ANTLRv4TokenTypes;
import org.antlr.intellij.plugin.psi.AtAction;
import org.antlr.intellij.plugin.psi.GrammarSpecNode;
import org.antlr.intellij.plugin.psi.LexerRuleRefNode;
import org.antlr.intellij.plugin.psi.LexerRuleSpecNode;
import org.antlr.intellij.plugin.psi.MyPsiUtils;
import org.antlr.intellij.plugin.psi.ParserRuleRefNode;
import org.antlr.intellij.plugin.psi.ParserRuleSpecNode;
import org.antlr.intellij.plugin.psi.RulesNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTLeafFactory;
import com.intellij.lang.ASTNode;
import com.intellij.lang.LanguageVersion;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.impl.source.tree.LeafElement;
import com.intellij.psi.tree.IElementType;

public class ANTLRv4ASTLeafFactory implements ASTLeafFactory
{
	public static Map<ANTLRv4TokenType, Class> tokenTypeToPsiNode = new HashMap<ANTLRv4TokenType, Class>();

	static
	{ // later auto gen with tokens from some spec in grammar?
		tokenTypeToPsiNode.put(ANTLRv4TokenTypes.rules, RulesNode.class);
		tokenTypeToPsiNode.put(ANTLRv4TokenTypes.parserRuleSpec, ParserRuleSpecNode.class);
		tokenTypeToPsiNode.put(ANTLRv4TokenTypes.lexerRule, LexerRuleSpecNode.class);
		tokenTypeToPsiNode.put(ANTLRv4TokenTypes.grammarSpec, GrammarSpecNode.class);
		tokenTypeToPsiNode.put(ANTLRv4TokenTypes.action, AtAction.class);
	}

	/**
	 * Create PSI nodes out of tokens so even parse tree sees them as such.
	 * Does not see whitespace tokens.
	 */
	@NotNull
	@Override
	public LeafElement createLeaf(@NotNull IElementType type, @NotNull LanguageVersion<?> languageVersion, @NotNull CharSequence text)
	{
		if(type == ANTLRv4TokenTypes.RULE_REF)
		{
			return new ParserRuleRefNode(type, text);
		}
		else if(type == ANTLRv4TokenTypes.TOKEN_REF)
		{
			return new LexerRuleRefNode(type, text);
		}
		else
		{
			return null;
		}
	}

	@Override
	public boolean apply(@Nullable IElementType elementType)
	{
		return elementType == ANTLRv4TokenTypes.RULE_REF || elementType == ANTLRv4TokenTypes.TOKEN_REF;
	}

	// refactored from ANTLRv4ParserDefinition
	public static PsiElement createInternalParseTreeNode(ASTNode node)
	{
		IElementType tokenType = node.getElementType();
		Class clazz = tokenTypeToPsiNode.get(tokenType);
		PsiElement t;
		if(clazz != null)
		{
			try
			{
				Constructor ctor = clazz.getConstructor(ASTNode.class);
				t = (PsiElement) ctor.newInstance(node);
			}
			catch(Exception e)
			{
				System.err.println("can't create psi node");
				t = new ASTWrapperPsiElement(node);
			}
		}
		else
		{
			t = new ASTWrapperPsiElement(node);
		}
		//		System.out.println("PSI createElement "+t+" from "+elementType);
		return t;
	}

	public static String findPackageIfAny(ANTLRv4FileRoot gfile)
	{
		// Want to gen in package; look for:
		// @header { package org.foo.x; } which is an AtAction
		PsiElement[] hdrActions = MyPsiUtils.collectAtActions(gfile, "header");
		if(hdrActions.length > 0)
		{
			PsiElement h = hdrActions[0];
			PsiElement p = h.getContext();
			PsiElement action = p.getNextSibling();
			if(action instanceof PsiWhiteSpace)
			{
				action = action.getNextSibling();
			}
			String text = action.getText();
			Pattern pattern = Pattern.compile("\\{\\s*package\\s+(.*?);\\s*.*");
			Matcher matcher = pattern.matcher(text);
			if(matcher.matches())
			{
				String pack = matcher.group(1);
				return pack;
			}
		}
		return null;
	}

	// Look for stuff like: options { tokenVocab=ANTLRv4Lexer; superClass=Foo; }
	public static String findTokenVocabIfAny(ANTLRv4FileRoot file)
	{
		String vocabName = null;
		PsiElement[] options = MyPsiUtils.collectNodesWithName(file, "option");
		for(PsiElement o : options)
		{
			PsiElement[] tokenVocab = MyPsiUtils.collectChildrenWithText(o, "tokenVocab");
			if(tokenVocab.length > 0)
			{
				PsiElement optionNode = tokenVocab[0].getParent();// tokenVocab[0] is id node
				PsiElement[] ids = MyPsiUtils.collectChildrenOfType(optionNode, ANTLRv4TokenTypes.optionValue);
				vocabName = ids[0].getText();
			}
		}
		return vocabName;
	}


}
