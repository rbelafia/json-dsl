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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.jsonDsl.ArraySpecifier;
import org.xtext.example.mydsl.jsonDsl.Expression;
import org.xtext.example.mydsl.jsonDsl.JsonDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.ArraySpecifierImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.ArraySpecifierImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.ArraySpecifierImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArraySpecifierImpl extends MinimalEObjectImpl.Container implements ArraySpecifier
{
  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected EList<Expression> index;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Expression> fields;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArraySpecifierImpl()
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
    return JsonDslPackage.Literals.ARRAY_SPECIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getIndex()
  {
    if (index == null)
    {
      index = new EObjectContainmentEList<Expression>(Expression.class, this, JsonDslPackage.ARRAY_SPECIFIER__INDEX);
    }
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Expression>(Expression.class, this, JsonDslPackage.ARRAY_SPECIFIER__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonDslPackage.ARRAY_SPECIFIER__CONDITION, oldCondition, newCondition);
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
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.ARRAY_SPECIFIER__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.ARRAY_SPECIFIER__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonDslPackage.ARRAY_SPECIFIER__CONDITION, newCondition, newCondition));
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
      case JsonDslPackage.ARRAY_SPECIFIER__INDEX:
        return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
      case JsonDslPackage.ARRAY_SPECIFIER__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case JsonDslPackage.ARRAY_SPECIFIER__CONDITION:
        return basicSetCondition(null, msgs);
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
      case JsonDslPackage.ARRAY_SPECIFIER__INDEX:
        return getIndex();
      case JsonDslPackage.ARRAY_SPECIFIER__FIELDS:
        return getFields();
      case JsonDslPackage.ARRAY_SPECIFIER__CONDITION:
        return getCondition();
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
      case JsonDslPackage.ARRAY_SPECIFIER__INDEX:
        getIndex().clear();
        getIndex().addAll((Collection<? extends Expression>)newValue);
        return;
      case JsonDslPackage.ARRAY_SPECIFIER__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Expression>)newValue);
        return;
      case JsonDslPackage.ARRAY_SPECIFIER__CONDITION:
        setCondition((Expression)newValue);
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
      case JsonDslPackage.ARRAY_SPECIFIER__INDEX:
        getIndex().clear();
        return;
      case JsonDslPackage.ARRAY_SPECIFIER__FIELDS:
        getFields().clear();
        return;
      case JsonDslPackage.ARRAY_SPECIFIER__CONDITION:
        setCondition((Expression)null);
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
      case JsonDslPackage.ARRAY_SPECIFIER__INDEX:
        return index != null && !index.isEmpty();
      case JsonDslPackage.ARRAY_SPECIFIER__FIELDS:
        return fields != null && !fields.isEmpty();
      case JsonDslPackage.ARRAY_SPECIFIER__CONDITION:
        return condition != null;
    }
    return super.eIsSet(featureID);
  }

} //ArraySpecifierImpl
