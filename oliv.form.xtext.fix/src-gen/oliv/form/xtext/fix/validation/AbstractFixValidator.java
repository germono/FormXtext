/*
 * generated by Xtext 2.21.0
 */
package oliv.form.xtext.fix.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractFixValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(oliv.form.xtext.fix.fix.FixPackage.eINSTANCE);
		return result;
	}
}