package org.antlr.intellij.plugin.actions;

import org.antlr.intellij.plugin.ANTLRv4FileRoot;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.changes.BackgroundFromStartOption;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;

// learned how to do from Grammar-Kit by Gregory Shrago
public class GenerateAction extends AnAction implements DumbAware {
	/** Only show if selection is a grammar */
	@Override
	public void update(AnActionEvent e) {
		Project project = getEventProject(e);
		if ( project==null ) return; // whoa!
		VirtualFile[] files = e.getData(LangDataKeys.VIRTUAL_FILE_ARRAY);
		if ( files==null ) return; // no files?
		boolean grammarFound = false;
		PsiManager manager = PsiManager.getInstance(project);
		for (VirtualFile file : files) {
//			System.out.println(file);
			if ( manager.findFile(file) instanceof ANTLRv4FileRoot ) {
				grammarFound = true;
				break;
			}
		}
		e.getPresentation().setEnabled(grammarFound); // enable action if we're looking at grammar file
		e.getPresentation().setVisible(grammarFound);
	}

	@Override
	public void actionPerformed(final AnActionEvent e) {
//		System.out.println("exec "+e);
		Project project = getEventProject(e);
		if ( project==null ) return; // whoa!
		VirtualFile[] files = e.getData(LangDataKeys.VIRTUAL_FILE_ARRAY);
		if ( files==null ) return; // no files?
		String title = "ANTLR Code Generation";
		boolean canBeCancelled = true;
		Task.Backgroundable gen = new RunANTLROnGrammarFile(files,
															project,
															title,
															canBeCancelled,
															new BackgroundFromStartOption());
		ProgressManager.getInstance().run(gen);
	}
}
