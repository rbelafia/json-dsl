/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.jsonDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.ArrayCall#getCallee <em>Callee</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.ArrayCall#getSpecifier <em>Specifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getArrayCall()
 * @model
 * @generated
 */
public interface ArrayCall extends Expression
{
  /**
   * Returns the value of the '<em><b>Callee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Callee</em>' containment reference.
   * @see #setCallee(Expression)
   * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getArrayCall_Callee()
   * @model containment="true"
   * @generated
   */
  Expression getCallee();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jsonDsl.ArrayCall#getCallee <em>Callee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Callee</em>' containment reference.
   * @see #getCallee()
   * @generated
   */
  void setCallee(Expression value);

  /**
   * Returns the value of the '<em><b>Specifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifier</em>' containment reference.
   * @see #setSpecifier(ArraySpecifier)
   * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getArrayCall_Specifier()
   * @model containment="true"
   * @generated
   */
  ArraySpecifier getSpecifier();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jsonDsl.ArrayCall#getSpecifier <em>Specifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specifier</em>' containment reference.
   * @see #getSpecifier()
   * @generated
   */
  void setSpecifier(ArraySpecifier value);

} // ArrayCall
