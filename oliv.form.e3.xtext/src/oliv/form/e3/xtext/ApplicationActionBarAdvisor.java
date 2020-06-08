package oliv.form.e3.xtext;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IWorkbenchAction preferencesAction;

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}
	
	@Override
	protected void makeActions(IWorkbenchWindow window) {
	super.makeActions(window);
	{
	preferencesAction = ActionFactory.PREFERENCES.create(window);
	register(preferencesAction);
	}
	} 
	
	@Override
	protected void fillMenuBar(IMenuManager menuBar) {
	super.fillMenuBar(menuBar);

	MenuManager menuManager = new MenuManager("New MenuManager");
	menuManager.setMenuText("window");
	menuBar.add(menuManager);
	menuManager.add(preferencesAction);
	} 
	
	@Override
	protected void fillCoolBar(ICoolBarManager coolBar) {
		super.fillCoolBar(coolBar);
	}

}

