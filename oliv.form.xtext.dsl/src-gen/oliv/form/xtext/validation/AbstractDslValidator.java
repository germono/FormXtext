/*
 * generated by Xtext 2.21.0
 */
package oliv.form.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(oliv.form.xtext.dsl.DslPackage.eINSTANCE);
		return result;
	}
}