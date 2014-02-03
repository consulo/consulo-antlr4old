package org.antlr.intellij.plugin;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

import org.antlr.intellij.plugin.adaptors.ANTLRUtils;
import org.antlr.intellij.plugin.adaptors.LexerAdaptor;
import org.antlr.intellij.plugin.parser.ANTLRv4Lexer;
import org.antlr.intellij.plugin.parser.ANTLRv4TokenTypes;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.jetbrains.annotations.NotNull;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;

public class ANTLRv4SyntaxHighlighter extends SyntaxHighlighterBase
{
	public static final TextAttributesKey RULENAME = createTextAttributesKey("RULENAME", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
	public static final TextAttributesKey TOKENNAME = createTextAttributesKey("TOKENNAME", DefaultLanguageHighlighterColors.KEYWORD);
	public static final TextAttributesKey STRING = createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING);
	public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
	public static final TextAttributesKey JAVADOC_COMMENT = createTextAttributesKey("JAVADOC_COMMENT",
			DefaultLanguageHighlighterColors.BLOCK_COMMENT);
	public static final TextAttributesKey BLOCK_COMMENT = createTextAttributesKey("BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);

	static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

	private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
	private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
	private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{
			LINE_COMMENT,
			JAVADOC_COMMENT,
			BLOCK_COMMENT
	};

	@NotNull
	@Override
	public Lexer getHighlightingLexer()
	{
		final ANTLRv4Lexer lexer = new ANTLRv4Lexer(null);
		LexerATNSimulator sim = ANTLRUtils.getLexerATNSimulator(lexer, ANTLRv4Lexer._ATN, lexer.getInterpreter().decisionToDFA,
				lexer.getInterpreter().getSharedContextCache());
		lexer.setInterpreter(sim);
		return new LexerAdaptor(lexer);
	}

	@NotNull
	@Override
	public TextAttributesKey[] getTokenHighlights(IElementType tokenType)
	{
		//		if ( ANTLRv4TokenTypeAdaptor.KEYWORDS.contains(tokenType) ){
		//			return new TextAttributesKey[]{KEYWORD};
		//		}
		//		else

		if(tokenType == ANTLRv4TokenTypes.TOKEN_REF)
		{
			return new TextAttributesKey[]{TOKENNAME};
		}
		else if(tokenType == ANTLRv4TokenTypes.RULE_REF)
		{
			return new TextAttributesKey[]{RULENAME};
		}
		else if(tokenType == ANTLRv4TokenTypes.STRING_LITERAL)
		{
			return STRING_KEYS;
		}
		else if(tokenType == ANTLRv4TokenTypes.BLOCK_COMMENT)
		{
			return COMMENT_KEYS;
		}
		else if(tokenType == ANTLRv4TokenTypes.DOC_COMMENT)
		{
			return COMMENT_KEYS;
		}
		else if(tokenType == ANTLRv4TokenTypes.LINE_COMMENT)
		{
			return COMMENT_KEYS;
		}
		else if(tokenType == ANTLRv4TokenTypes.BAD_TOKEN)
		{
			return BAD_CHAR_KEYS;
		}
		else
		{
			return EMPTY;
		}
	}
}
