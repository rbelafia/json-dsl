/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.jsonDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.jsonDsl.JsonDslPackage;
import org.xtext.example.mydsl.jsonDsl.Rename;
import org.xtext.example.mydsl.jsonDsl.VariableCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.RenameImpl#getCall <em>Call</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.RenameImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.RenameImpl#getNfields <em>Nfields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenameImpl extends FunctionCallImpl implements Rename
{
  /**
   * The cached value of the '{@link #getCall() <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCall()
   * @generated
   * @ordered
   */
  protected VariableCall call;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<String> fields;

  /**
   * The cached value of the '{@link #getNfields() <em>Nfields</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNfields()
   * @generated
   * @ordered
   */
  protected EList<String> nfields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RenameImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JsonDslPackage.Literals.RENAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableCall getCall()
  {
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCall(VariableCall newCall, NotificationChain msgs)
  {
    VariableCall oldCall = call;
    call = newCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonDslPackage.RENAME__CALL, oldCall, newCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCall(VariableCall newCall)
  {
    if (newCall != call)
    {
      NotificationChain msgs = null;
      if (call != null)
        msgs = ((InternalEObject)call).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.RENAME__CALL, null, msgs);
      if (newCall != null)
        msgs = ((InternalEObject)newCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.RENAME__CALL, null, msgs);
      msgs = basicSetCall(newCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonDslPackage.RENAME__CALL, newCall, newCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getFields()
  {
    if (fields == null)
    {
      fields = new EDataTypeEList<String>(String.class, this, JsonDslPackage.RENAME__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getNfields()
  {
    if (nfields == null)
    {
      nfields = new EDataTypeEList<String>(String.class, this, JsonDslPackage.RENAME__NFIELDS);
    }
    return nfields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JsonDslPackage.RENAME__CALL:
        return basicSetCall(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JsonDslPackage.RENAME__CALL:
        return getCall();
      case JsonDslPackage.RENAME__FIELDS:
        return getFields();
      case JsonDslPackage.RENAME__NFIELDS:
        return getNfields();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JsonDslPackage.RENAME__CALL:
        setCall((VariableCall)newValue);
        return;
      case JsonDslPackage.RENAME__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends String>)newValue);
        return;
      case JsonDslPackage.RENAME__NFIELDS:
        getNfields().clear();
        getNfields().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JsonDslPackage.RENAME__CALL:
        setCall((VariableCall)null);
        return;
      case JsonDslPackage.RENAME__FIELDS:
        getFields().clear();
        return;
      case JsonDslPackage.RENAME__NFIELDS:
        getNfields().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JsonDslPackage.RENAME__CALL:
        return call != null;
      case JsonDslPackage.RENAME__FIELDS:
        return fields != null && !fields.isEmpty();
      case JsonDslPackage.RENAME__NFIELDS:
        return nfields != null && !nfields.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (fields: ");
    result.append(fields);
    result.append(", nfields: ");
    result.append(nfields);
    result.append(')');
    return result.toString();
  }

} //RenameImpl
