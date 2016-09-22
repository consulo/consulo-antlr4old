package consulo.antlr;

import org.antlr.intellij.plugin.Icons;
import org.antlr.intellij.plugin.psi.LexerRuleRefNode;
import org.antlr.intellij.plugin.psi.ParserRuleRefNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.psi.PsiElement;
import consulo.ide.IconDescriptor;
import consulo.ide.IconDescriptorUpdater;

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
