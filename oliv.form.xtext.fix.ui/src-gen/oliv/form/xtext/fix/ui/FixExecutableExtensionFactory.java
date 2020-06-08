/*
 * generated by Xtext 2.21.0
 */
package oliv.form.xtext.fix.ui;

import com.google.inject.Injector;
import oliv.form.xtext.fix.ui.internal.FixActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FixExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(FixActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		FixActivator activator = FixActivator.getInstance();
		return activator != null ? activator.getInjector(FixActivator.OLIV_FORM_XTEXT_FIX_FIX) : null;
	}

}
