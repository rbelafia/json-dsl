/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.jsonDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.RangeSpecifier#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.RangeSpecifier#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getRangeSpecifier()
 * @model
 * @generated
 */
public interface RangeSpecifier extends ArraySpecifier
{
  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(int)
   * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getRangeSpecifier_From()
   * @model
   * @generated
   */
  int getFrom();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jsonDsl.RangeSpecifier#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(int value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(int)
   * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getRangeSpecifier_To()
   * @model
   * @generated
   */
  int getTo();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jsonDsl.RangeSpecifier#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(int value);

} // RangeSpecifier