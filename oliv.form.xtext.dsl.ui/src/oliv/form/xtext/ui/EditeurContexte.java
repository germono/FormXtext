package oliv.form.xtext.ui;

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



public class EditeurContexte  extends XtextEditor {
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		DslStandaloneSetup.doSetup();
	}

	
	
	@Override
	public void setFocus() {
		super.setFocus();
		Bundle e4Bundle = Platform.getBundle("org.eclipse.e4.ui.workbench");
		BundleContext e4BundleContext = e4Bundle.getBundleContext();
		IEclipseContext context = EclipseContextFactory.getServiceContext(e4BundleContext);
		context.set(EditeurContexte.class, this);
		
		
	}
	

}
