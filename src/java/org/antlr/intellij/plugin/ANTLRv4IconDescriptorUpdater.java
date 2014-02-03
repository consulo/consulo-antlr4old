package org.antlr.intellij.plugin;

import org.antlr.intellij.plugin.psi.LexerRuleRefNode;
import org.antlr.intellij.plugin.psi.ParserRuleRefNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.ide.IconDescriptor;
import com.intellij.ide.IconDescriptorUpdater;
import com.intellij.psi.PsiElement;

/**
 * @author VISTALL
 * @since 03.02.14
 */
public class ANTLRv4IconDescriptorUpdater implements IconDescriptorUpdater
{
	@Override
	public void updateIcon(@NotNull IconDescriptor iconDescriptor, @NotNull PsiElement element, int i)
	{
		if(element instanceof LexerRuleRefNode)
		{
			iconDescriptor.setMainIcon(Icons.LEXER_RULE);
		}
		else if(element instanceof ParserRuleRefNode)
		{
			iconDescriptor.setMainIcon(Icons.PARSER_RULE);
		}
	}
}
