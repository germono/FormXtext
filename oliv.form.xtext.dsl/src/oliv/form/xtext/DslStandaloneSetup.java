/*
 * generated by Xtext 2.21.0
 */
package oliv.form.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DslStandaloneSetup extends DslStandaloneSetupGenerated {

	public static void doSetup() {
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
