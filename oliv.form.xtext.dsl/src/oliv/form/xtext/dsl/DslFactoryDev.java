/**
	 * generated by Xtext 2.21.0
*/
package oliv.form.xtext.dsl;

import oliv.form.xtext.dsl.impl.DslFactoryDevImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface DslFactoryDev extends DslFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	DslFactoryDev eINSTANCE = DslFactoryDevImpl.init();
				
}
