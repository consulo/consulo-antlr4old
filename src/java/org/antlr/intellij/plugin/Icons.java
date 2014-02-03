package org.antlr.intellij.plugin;

import javax.swing.Icon;

import com.intellij.openapi.util.IconLoader;

public interface Icons
{
	Icon FILE = IconLoader.getIcon("/org/antlr/intellij/plugin/antlr.png");
	Icon LEXER_RULE = IconLoader.getIcon("/org/antlr/intellij/plugin/lexer-rule.png");
	Icon PARSER_RULE = IconLoader.getIcon("/org/antlr/intellij/plugin/parser-rule.png");
}
