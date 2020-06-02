/**
 * generated by Xtext 2.21.0
 */
package oliv.form.xtext.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oliv.form.xtext.dsl.MMinus#getLeft <em>Left</em>}</li>
 *   <li>{@link oliv.form.xtext.dsl.MMinus#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see oliv.form.xtext.dsl.MDslPackage#getMinus()
 * @model
 * @generated
 */
public interface MMinus extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see oliv.form.xtext.dsl.MDslPackage#getMinus_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link oliv.form.xtext.dsl.MMinus#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see oliv.form.xtext.dsl.MDslPackage#getMinus_Right()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link oliv.form.xtext.dsl.MMinus#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // MMinus
