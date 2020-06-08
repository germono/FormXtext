package oliv.form.xtext.fix.e3;

import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject project = root.getProject("Projet");
		try {
			if (!project.exists()) {
				project.create(new NullProgressMonitor());
			}
			project.open(null);
			IFolder folder = project.getFolder("Dossier");
			if (!folder.exists())
				folder.create(true, true, null);
			 IFile fichier = folder.getFile("courbe.fix");
			 if(!fichier.exists()) 
				 fichier.create(new ByteArrayInputStream(("//Salut\n" + 
				 		"*Courbe bob\n" + 
				 		"       0       0\n" + 
				 		"       1       1\n" + 
				 		"       2       1   \n" + 
				 		"       3       2\n" + 
				 		"       4       3\n" + 
				 		"       5       3\n" + 
				 		"1234568504562543\n" + 
				 		"\n"+
				 		"").getBytes()), true, null);
			 
			 
		} catch (CoreException e) {
			// nothing to do
		}
		//
		Display display = PlatformUI.createDisplay();
		try {
			int returnCode = PlatformUI.createAndRunWorkbench(display, new ApplicationWorkbenchAdvisor());
			
			if (returnCode == PlatformUI.RETURN_RESTART)
				return IApplication.EXIT_RESTART;
			else
				return IApplication.EXIT_OK;
		} finally {
			display.dispose();
		}

	}

	@Override
	public void stop() {
		if (!PlatformUI.isWorkbenchRunning())
			return;
		final IWorkbench workbench = PlatformUI.getWorkbench();
		final Display display = workbench.getDisplay();
		display.syncExec(() -> {
			if (!display.isDisposed())
				workbench.close();
		});
	}
}
