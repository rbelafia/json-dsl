/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.jsonDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strict Inequality Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.StrictInequalityExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.StrictInequalityExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getStrictInequalityExpression()
 * @model
 * @generated
 */
public interface StrictInequalityExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getStrictInequalityExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jsonDsl.StrictInequalityExpression#getLeft <em>Left</em>}' containment reference.
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
   * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getStrictInequalityExpression_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jsonDsl.StrictInequalityExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // StrictInequalityExpression
