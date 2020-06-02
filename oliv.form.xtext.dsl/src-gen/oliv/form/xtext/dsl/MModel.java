/**
 * generated by Xtext 2.21.0
 */
package oliv.form.xtext.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oliv.form.xtext.dsl.MModel#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see oliv.form.xtext.dsl.MDslPackage#getModel()
 * @model
 * @generated
 */
public interface MModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link oliv.form.xtext.dsl.Truc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see oliv.form.xtext.dsl.MDslPackage#getModel_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Truc> getVariables();

} // MModel