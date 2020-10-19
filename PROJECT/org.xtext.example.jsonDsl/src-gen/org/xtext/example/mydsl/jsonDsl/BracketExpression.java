/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.jsonDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bracket Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.BracketExpression#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getBracketExpression()
 * @model
 * @generated
 */
public interface BracketExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' containment reference.
   * @see #setSub(Expression)
   * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getBracketExpression_Sub()
   * @model containment="true"
   * @generated
   */
  Expression getSub();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jsonDsl.BracketExpression#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(Expression value);

} // BracketExpression