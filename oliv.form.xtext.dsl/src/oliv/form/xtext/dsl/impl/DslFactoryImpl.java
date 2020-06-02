/**
	 * generated by Xtext 2.21.0
*/
package oliv.form.xtext.dsl.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import oliv.form.xtext.dsl.DslFactory;


// This factory  renames the generated factory interface to use it as an overriden factory
public class DslFactoryImpl extends MDslFactoryImpl implements DslFactory
{
	
	public static DslFactory init() {
		
		try {
			Object fact = MDslFactoryImpl.init();
			if ((fact != null) && (fact instanceof DslFactory))
					return (DslFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DslFactoryImpl(); 
		 }
	

}