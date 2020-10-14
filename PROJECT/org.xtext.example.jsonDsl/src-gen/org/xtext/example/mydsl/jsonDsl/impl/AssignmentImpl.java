/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.jsonDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.jsonDsl.Assignment;
import org.xtext.example.mydsl.jsonDsl.Expression;
import org.xtext.example.mydsl.jsonDsl.JsonDslPackage;
import org.xtext.example.mydsl.jsonDsl.VariableCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.AssignmentImpl#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jsonDsl.impl.AssignmentImpl#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends SimpleStatementImpl implements Assignment
{
  /**
   * The cached value of the '{@link #getLeftHandSide() <em>Left Hand Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftHandSide()
   * @generated
   * @ordered
   */
  protected VariableCall leftHandSide;

  /**
   * The cached value of the '{@link #getRightHandSide() <em>Right Hand Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightHandSide()
   * @generated
   * @ordered
   */
  protected Expression rightHandSide;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentImpl()
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
    return JsonDslPackage.Literals.ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableCall getLeftHandSide()
  {
    return leftHandSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftHandSide(VariableCall newLeftHandSide, NotificationChain msgs)
  {
    VariableCall oldLeftHandSide = leftHandSide;
    leftHandSide = newLeftHandSide;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonDslPackage.ASSIGNMENT__LEFT_HAND_SIDE, oldLeftHandSide, newLeftHandSide);
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
  public void setLeftHandSide(VariableCall newLeftHandSide)
  {
    if (newLeftHandSide != leftHandSide)
    {
      NotificationChain msgs = null;
      if (leftHandSide != null)
        msgs = ((InternalEObject)leftHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.ASSIGNMENT__LEFT_HAND_SIDE, null, msgs);
      if (newLeftHandSide != null)
        msgs = ((InternalEObject)newLeftHandSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.ASSIGNMENT__LEFT_HAND_SIDE, null, msgs);
      msgs = basicSetLeftHandSide(newLeftHandSide, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonDslPackage.ASSIGNMENT__LEFT_HAND_SIDE, newLeftHandSide, newLeftHandSide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getRightHandSide()
  {
    return rightHandSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightHandSide(Expression newRightHandSide, NotificationChain msgs)
  {
    Expression oldRightHandSide = rightHandSide;
    rightHandSide = newRightHandSide;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonDslPackage.ASSIGNMENT__RIGHT_HAND_SIDE, oldRightHandSide, newRightHandSide);
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
  public void setRightHandSide(Expression newRightHandSide)
  {
    if (newRightHandSide != rightHandSide)
    {
      NotificationChain msgs = null;
      if (rightHandSide != null)
        msgs = ((InternalEObject)rightHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.ASSIGNMENT__RIGHT_HAND_SIDE, null, msgs);
      if (newRightHandSide != null)
        msgs = ((InternalEObject)newRightHandSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonDslPackage.ASSIGNMENT__RIGHT_HAND_SIDE, null, msgs);
      msgs = basicSetRightHandSide(newRightHandSide, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonDslPackage.ASSIGNMENT__RIGHT_HAND_SIDE, newRightHandSide, newRightHandSide));
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
      case JsonDslPackage.ASSIGNMENT__LEFT_HAND_SIDE:
        return basicSetLeftHandSide(null, msgs);
      case JsonDslPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
        return basicSetRightHandSide(null, msgs);
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
      case JsonDslPackage.ASSIGNMENT__LEFT_HAND_SIDE:
        return getLeftHandSide();
      case JsonDslPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
        return getRightHandSide();
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
      case JsonDslPackage.ASSIGNMENT__LEFT_HAND_SIDE:
        setLeftHandSide((VariableCall)newValue);
        return;
      case JsonDslPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
        setRightHandSide((Expression)newValue);
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
      case JsonDslPackage.ASSIGNMENT__LEFT_HAND_SIDE:
        setLeftHandSide((VariableCall)null);
        return;
      case JsonDslPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
        setRightHandSide((Expression)null);
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
      case JsonDslPackage.ASSIGNMENT__LEFT_HAND_SIDE:
        return leftHandSide != null;
      case JsonDslPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
        return rightHandSide != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignmentImpl