/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.jsonDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.Rename#getCall <em>Call</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.Rename#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.Rename#getNfields <em>Nfields</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getRename()
 * @model
 * @generated
 */
public interface Rename extends FunctionCall
{
  /**
   * Returns the value of the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call</em>' containment reference.
   * @see #setCall(VariableCall)
   * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getRename_Call()
   * @model containment="true"
   * @generated
   */
  VariableCall getCall();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jsonDsl.Rename#getCall <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call</em>' containment reference.
   * @see #getCall()
   * @generated
   */
  void setCall(VariableCall value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' attribute list.
   * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getRename_Fields()
   * @model unique="false"
   * @generated
   */
  EList<String> getFields();

  /**
   * Returns the value of the '<em><b>Nfields</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nfields</em>' attribute list.
   * @see org.xtext.example.mydsl.jsonDsl.JsonDslPackage#getRename_Nfields()
   * @model unique="false"
   * @generated
   */
  EList<String> getNfields();

} // Rename
