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
import org.xtext.example.mydsl.jsonDsl.JsonDslPackage;
import org.xtext.example.mydsl.jsonDsl.Sum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.SumImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.SumImpl#getAuxiliar <em>Auxiliar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SumImpl extends FunctionCallImpl implements Sum
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
  protected SumImpl()
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
    return JsonDslPackage.Literals.SUM;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonDslPackage.SUM__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.SUM__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.SUM__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonDslPackage.SUM__EXPRESSION, newExpression, newExpression));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonDslPackage.SUM__AUXILIAR, oldAuxiliar, newAuxiliar);
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
        msgs = ((InternalEObject)auxiliar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.SUM__AUXILIAR, null, msgs);
      if (newAuxiliar != null)
        msgs = ((InternalEObject)newAuxiliar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.SUM__AUXILIAR, null, msgs);
      msgs = basicSetAuxiliar(newAuxiliar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonDslPackage.SUM__AUXILIAR, newAuxiliar, newAuxiliar));
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
      case JsonDslPackage.SUM__EXPRESSION:
        return basicSetExpression(null, msgs);
      case JsonDslPackage.SUM__AUXILIAR:
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
      case JsonDslPackage.SUM__EXPRESSION:
        return getExpression();
      case JsonDslPackage.SUM__AUXILIAR:
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
      case JsonDslPackage.SUM__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case JsonDslPackage.SUM__AUXILIAR:
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
      case JsonDslPackage.SUM__EXPRESSION:
        setExpression((Expression)null);
        return;
      case JsonDslPackage.SUM__AUXILIAR:
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
      case JsonDslPackage.SUM__EXPRESSION:
        return expression != null;
      case JsonDslPackage.SUM__AUXILIAR:
        return auxiliar != null;
    }
    return super.eIsSet(featureID);
  }

} //SumImpl
