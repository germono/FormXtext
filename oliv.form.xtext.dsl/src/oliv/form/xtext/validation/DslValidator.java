/*
 * generated by Xtext 2.21.0
 */
package oliv.form.xtext.validation;

import org.eclipse.xtext.validation.Check;

import oliv.form.xtext.dsl.DslPackage;
import oliv.form.xtext.dsl.VariableCalcule;
import oliv.form.xtext.dsl.VariableDirect;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class DslValidator extends AbstractDslValidator {
	
//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					DslPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
	public static final String MIN_SUP_MAX = "minSuperieurAuMax";
	@Check
	public void checkMaxSupMin(VariableDirect greeting) {
		if (greeting.getAlpha()<greeting.getBeta()) {
			warning("Le maximum doit être plus grand que le minimum",
					DslPackage.Literals.VARIABLE_DIRECT__ALPHA,
					MIN_SUP_MAX);
		}
	}
	public static final String EXRPRESSIONEQUAL = "expressionEqual";
	@Check
	public void checkExpression(VariableCalcule variable) {
		if (variable.getExpression().equals(variable.getExpression2())) {
			warning("Les deux expression sont identique",
					DslPackage.Literals.VARIABLE_CALCULE__EXPRESSION,
					EXRPRESSIONEQUAL);
		}
	}
}
