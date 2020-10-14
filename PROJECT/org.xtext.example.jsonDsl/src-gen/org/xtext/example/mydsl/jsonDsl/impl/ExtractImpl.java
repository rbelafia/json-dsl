/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.jsonDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.jsonDsl.ArithmeticAuxiliar;
import org.xtext.example.mydsl.jsonDsl.Expression;
import org.xtext.example.mydsl.jsonDsl.Extract;
import org.xtext.example.mydsl.jsonDsl.JsonDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.ExtractImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.ExtractImpl#getAuxiliar <em>Auxiliar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtractImpl extends FunctionCallImpl implements Extract
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Expression value;

  /**
   * The cached value of the '{@link #getAuxiliar() <em>Auxiliar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuxiliar()
   * @generated
   * @ordered
   */
  protected ArithmeticAuxiliar auxiliar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtractImpl()
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
    return JsonDslPackage.Literals.EXTRACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs)
  {
    Expression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonDslPackage.EXTRACT__VALUE, oldValue, newValue);
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
  public void setValue(Expression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.EXTRACT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.EXTRACT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonDslPackage.EXTRACT__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithmeticAuxiliar getAuxiliar()
  {
    return auxiliar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAuxiliar(ArithmeticAuxiliar newAuxiliar, NotificationChain msgs)
  {
    ArithmeticAuxiliar oldAuxiliar = auxiliar;
    auxiliar = newAuxiliar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonDslPackage.EXTRACT__AUXILIAR, oldAuxiliar, newAuxiliar);
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
  public void setAuxiliar(ArithmeticAuxiliar newAuxiliar)
  {
    if (newAuxiliar != auxiliar)
    {
      NotificationChain msgs = null;
      if (auxiliar != null)
        msgs = ((InternalEObject)auxiliar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.EXTRACT__AUXILIAR, null, msgs);
      if (newAuxiliar != null)
        msgs = ((InternalEObject)newAuxiliar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.EXTRACT__AUXILIAR, null, msgs);
      msgs = basicSetAuxiliar(newAuxiliar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonDslPackage.EXTRACT__AUXILIAR, newAuxiliar, newAuxiliar));
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
      case JsonDslPackage.EXTRACT__VALUE:
        return basicSetValue(null, msgs);
      case JsonDslPackage.EXTRACT__AUXILIAR:
        return basicSetAuxiliar(null, msgs);
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
      case JsonDslPackage.EXTRACT__VALUE:
        return getValue();
      case JsonDslPackage.EXTRACT__AUXILIAR:
        return getAuxiliar();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JsonDslPackage.EXTRACT__VALUE:
        setValue((Expression)newValue);
        return;
      case JsonDslPackage.EXTRACT__AUXILIAR:
        setAuxiliar((ArithmeticAuxiliar)newValue);
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
      case JsonDslPackage.EXTRACT__VALUE:
        setValue((Expression)null);
        return;
      case JsonDslPackage.EXTRACT__AUXILIAR:
        setAuxiliar((ArithmeticAuxiliar)null);
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
      case JsonDslPackage.EXTRACT__VALUE:
        return value != null;
      case JsonDslPackage.EXTRACT__AUXILIAR:
        return auxiliar != null;
    }
    return super.eIsSet(featureID);
  }

} //ExtractImpl