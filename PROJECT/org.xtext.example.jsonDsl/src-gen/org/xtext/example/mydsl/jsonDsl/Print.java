/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.jsonDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.Print#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getPrint()
 * @model
 * @generated
 */
public interface Print extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getPrint_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jsonDsl.Print#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Print
