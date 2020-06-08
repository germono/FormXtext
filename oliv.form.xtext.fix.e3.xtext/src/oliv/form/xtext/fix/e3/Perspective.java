package oliv.form.xtext.fix.e3;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	@Override	
	public void createInitialLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();
		IFolderLayout fl = layout.createFolder("left", IPageLayout.LEFT, 0.25f, editorArea) ;
		fl.addView(IPageLayout.ID_OUTLINE);
		IFolderLayout fl2 = layout.createFolder("bas", IPageLayout.BOTTOM, 0.75f, "left") ;
		fl2.addView(IPageLayout.ID_PROJECT_EXPLORER);
		//layout.addView("org.eclipse.ui.views.ContentOutline", IPageLayout.RIGHT, 0.5f, IPageLayout.ID_EDITOR_AREA);
//		layout.addView("org.eclipse.ui.navigator.ProjectExplorer", IPageLayout.LEFT, 0.5f, IPageLayout.ID_EDITOR_AREA);
		} 
}
