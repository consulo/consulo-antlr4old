package org.antlr.intellij.plugin.structview;

import org.antlr.intellij.plugin.ANTLRv4FileRoot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.TreeBasedStructureViewBuilder;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;

public class ANTLRv4StructureViewFactory implements PsiStructureViewFactory
{
	@Nullable
	@Override
	public StructureViewBuilder getStructureViewBuilder(final PsiFile psiFile)
	{
		return new TreeBasedStructureViewBuilder()
		{
			@NotNull
			@Override
			public StructureViewModel createStructureViewModel(@Nullable Editor editor)
			{
				return new ANTLRv4StructureViewModel((ANTLRv4FileRoot) psiFile);
			}
		};
	}
}
