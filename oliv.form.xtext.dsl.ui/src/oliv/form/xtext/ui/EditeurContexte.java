package oliv.form.xtext.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import oliv.form.xtext.DslStandaloneSetup;
import oliv.form.xtext.dsl.Model;



public class EditeurContexte  extends XtextEditor {
	IEclipseContext context;
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		DslStandaloneSetup.doSetup();
		Bundle e4Bundle = Platform.getBundle("org.eclipse.e4.ui.workbench");
		BundleContext e4BundleContext = e4Bundle.getBundleContext();
		context = EclipseContextFactory.getServiceContext(e4BundleContext);
		
	}
	
	@Override
	protected void editorSaved() {
		super.editorSaved();		
		Model nouveauModel =this.getDocument().readOnly(res -> 
		res.getContents().size()!=0?
			(Model)res.getContents().get(0):
			null);
		context.set(Model.class, nouveauModel);
	}
	
	
	@Override
	public void setFocus() {
		super.setFocus();
		context.set(EditeurContexte.class, this);
		
		
	}
	

}
