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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.jsonDsl.ArithFunctions;
import org.xtext.example.mydsl.jsonDsl.Expression;
import org.xtext.example.mydsl.jsonDsl.JsonDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arith Functions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.ArithFunctionsImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.ArithFunctionsImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.ArithFunctionsImpl#getWhereExpression <em>Where Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArithFunctionsImpl extends ExpressionImpl implements ArithFunctions
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

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
   * The cached value of the '{@link #getWhereExpression() <em>Where Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhereExpression()
   * @generated
   * @ordered
   */
  protected Expression whereExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArithFunctionsImpl()
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
    return JsonDslPackage.Literals.ARITH_FUNCTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonDslPackage.ARITH_FUNCTIONS__EXPRESSION, oldExpression, newExpression);
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
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.ARITH_FUNCTIONS__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.ARITH_FUNCTIONS__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonDslPackage.ARITH_FUNCTIONS__EXPRESSION, newExpression, newExpression));
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
      fields = new EObjectContainmentEList<Expression>(Expression.class, this, JsonDslPackage.ARITH_FUNCTIONS__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getWhereExpression()
  {
    return whereExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhereExpression(Expression newWhereExpression, NotificationChain msgs)
  {
    Expression oldWhereExpression = whereExpression;
    whereExpression = newWhereExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonDslPackage.ARITH_FUNCTIONS__WHERE_EXPRESSION, oldWhereExpression, newWhereExpression);
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
  public void setWhereExpression(Expression newWhereExpression)
  {
    if (newWhereExpression != whereExpression)
    {
      NotificationChain msgs = null;
      if (whereExpression != null)
        msgs = ((InternalEObject)whereExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.ARITH_FUNCTIONS__WHERE_EXPRESSION, null, msgs);
      if (newWhereExpression != null)
        msgs = ((InternalEObject)newWhereExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.ARITH_FUNCTIONS__WHERE_EXPRESSION, null, msgs);
      msgs = basicSetWhereExpression(newWhereExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonDslPackage.ARITH_FUNCTIONS__WHERE_EXPRESSION, newWhereExpression, newWhereExpression));
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
      case JsonDslPackage.ARITH_FUNCTIONS__EXPRESSION:
        return basicSetExpression(null, msgs);
      case JsonDslPackage.ARITH_FUNCTIONS__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case JsonDslPackage.ARITH_FUNCTIONS__WHERE_EXPRESSION:
        return basicSetWhereExpression(null, msgs);
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
      case JsonDslPackage.ARITH_FUNCTIONS__EXPRESSION:
        return getExpression();
      case JsonDslPackage.ARITH_FUNCTIONS__FIELDS:
        return getFields();
      case JsonDslPackage.ARITH_FUNCTIONS__WHERE_EXPRESSION:
        return getWhereExpression();
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
      case JsonDslPackage.ARITH_FUNCTIONS__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case JsonDslPackage.ARITH_FUNCTIONS__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Expression>)newValue);
        return;
      case JsonDslPackage.ARITH_FUNCTIONS__WHERE_EXPRESSION:
        setWhereExpression((Expression)newValue);
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
      case JsonDslPackage.ARITH_FUNCTIONS__EXPRESSION:
        setExpression((Expression)null);
        return;
      case JsonDslPackage.ARITH_FUNCTIONS__FIELDS:
        getFields().clear();
        return;
      case JsonDslPackage.ARITH_FUNCTIONS__WHERE_EXPRESSION:
        setWhereExpression((Expression)null);
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
      case JsonDslPackage.ARITH_FUNCTIONS__EXPRESSION:
        return expression != null;
      case JsonDslPackage.ARITH_FUNCTIONS__FIELDS:
        return fields != null && !fields.isEmpty();
      case JsonDslPackage.ARITH_FUNCTIONS__WHERE_EXPRESSION:
        return whereExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //ArithFunctionsImpl
