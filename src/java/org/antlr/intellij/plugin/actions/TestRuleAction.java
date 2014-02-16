package org.antlr.intellij.plugin.actions;

import java.util.List;

import org.antlr.intellij.plugin.ANTLRv4FileRoot;
import org.antlr.intellij.plugin.ANTLRv4ProjectComponent;
import org.antlr.intellij.plugin.preview.ParseTreePanel;
import org.antlr.intellij.plugin.preview.ParseTreeWindowFactory;
import org.antlr.intellij.plugin.psi.ParserRuleRefNode;
import org.antlr.intellij.plugin.psi.ParserRuleSpecNode;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import com.intellij.openapi.vfs.newvfs.BulkFileListener;
import com.intellij.openapi.vfs.newvfs.events.VFileEvent;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.messages.MessageBusConnection;

public class TestRuleAction extends AnAction implements DumbAware
{
	BulkFileListener.Adapter fileSaveListener;

	/**
	 * Only show if selection is a grammar
	 */
	@Override
	public void update(AnActionEvent e)
	{
		VirtualFile file = getGrammarFile(e);
		boolean grammarFound = file != null;

		PsiElement selectedPsiRuleNode = e.getData(LangDataKeys.PSI_ELEMENT);
		if(selectedPsiRuleNode == null)
		{
			return; // we clicked somewhere outside text
		}
		String ruleName = selectedPsiRuleNode.getText();
		if(StringUtil.isEmpty(ruleName))
		{
			return;
		}
		boolean parserRuleFound = Character.isLowerCase(ruleName.charAt(0));

		// enable action if we're looking at grammar file
		Presentation presentation = e.getPresentation();
		presentation.setEnabled(grammarFound && parserRuleFound);
		presentation.setVisible(grammarFound); // grey out of lexer rule
	}

	@Override
	public void actionPerformed(final AnActionEvent e)
	{
		//		System.out.println("exec "+e);
		Project project = getEventProject(e);
		if(project == null)
		{
			return; // whoa!
		}
		PsiElement selectedPsiRuleNode = e.getData(LangDataKeys.PSI_ELEMENT);
		if(selectedPsiRuleNode == null)
		{
			return; // we clicked somewhere outside text
		}
		String ruleName = selectedPsiRuleNode.getText();
		if(selectedPsiRuleNode instanceof ParserRuleSpecNode)
		{
			ParserRuleRefNode r = PsiTreeUtil.findChildOfType(selectedPsiRuleNode, ParserRuleRefNode.class);
			ruleName = r.getText();
		}

		VirtualFile file = getGrammarFile(e);
		if(file == null)
		{
			return; // no files?
		}

		FileDocumentManager docMgr = FileDocumentManager.getInstance();
		Document doc = docMgr.getDocument(file);
		docMgr.saveDocument(doc);

		final ParseTreePanel viewerPanel = ANTLRv4ProjectComponent.getInstance(project).getViewerPanel();
		String inputText = viewerPanel.getInputText(); // reuse input if any is around already
		viewerPanel.setInputAndGrammar(inputText, file.getPath(), ruleName);

		if(fileSaveListener == null)
		{
			fileSaveListener = new BulkFileListener.Adapter()
			{
				@Override
				public void after(List<? extends VFileEvent> events)
				{
					//					System.out.println("file changed");
					viewerPanel.refresh();
				}
			};
			MessageBusConnection msgBus = project.getMessageBus().connect(project);
			msgBus.subscribe(VirtualFileManager.VFS_CHANGES, fileSaveListener);
		}

		ToolWindowManager toolWindowManager = ToolWindowManager.getInstance(project);
		ToolWindow toolWindow = toolWindowManager.getToolWindow(ParseTreeWindowFactory.ID);
		toolWindow.show(null);
	}

	public VirtualFile getGrammarFile(AnActionEvent e)
	{
		Project project = getEventProject(e);
		if(project == null)
		{
			return null; // whoa!
		}
		VirtualFile[] files = LangDataKeys.VIRTUAL_FILE_ARRAY.getData(e.getDataContext());
		if(files == null)
		{
			return null; // no files?
		}
		PsiManager manager = PsiManager.getInstance(project);
		for(VirtualFile file : files)
		{
			//			System.out.println(file);
			if(manager.findFile(file) instanceof ANTLRv4FileRoot)
			{
				return file;
			}
		}
		return null;
	}

}
