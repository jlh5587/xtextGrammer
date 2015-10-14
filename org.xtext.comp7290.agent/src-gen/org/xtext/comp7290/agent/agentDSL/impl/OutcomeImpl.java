/**
 */
package org.xtext.comp7290.agent.agentDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.comp7290.agent.agentDSL.AgentDSLPackage;
import org.xtext.comp7290.agent.agentDSL.Attribute;
import org.xtext.comp7290.agent.agentDSL.Goal;
import org.xtext.comp7290.agent.agentDSL.Outcome;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outcome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.comp7290.agent.agentDSL.impl.OutcomeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.comp7290.agent.agentDSL.impl.OutcomeImpl#getGoal <em>Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutcomeImpl extends TypeImpl implements Outcome
{
  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoal()
   * @generated
   * @ordered
   */
  protected Goal goal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutcomeImpl()
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
    return AgentDSLPackage.Literals.OUTCOME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, AgentDSLPackage.OUTCOME__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal getGoal()
  {
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGoal(Goal newGoal, NotificationChain msgs)
  {
    Goal oldGoal = goal;
    goal = newGoal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgentDSLPackage.OUTCOME__GOAL, oldGoal, newGoal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoal(Goal newGoal)
  {
    if (newGoal != goal)
    {
      NotificationChain msgs = null;
      if (goal != null)
        msgs = ((InternalEObject)goal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgentDSLPackage.OUTCOME__GOAL, null, msgs);
      if (newGoal != null)
        msgs = ((InternalEObject)newGoal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgentDSLPackage.OUTCOME__GOAL, null, msgs);
      msgs = basicSetGoal(newGoal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgentDSLPackage.OUTCOME__GOAL, newGoal, newGoal));
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
      case AgentDSLPackage.OUTCOME__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case AgentDSLPackage.OUTCOME__GOAL:
        return basicSetGoal(null, msgs);
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
      case AgentDSLPackage.OUTCOME__ATTRIBUTES:
        return getAttributes();
      case AgentDSLPackage.OUTCOME__GOAL:
        return getGoal();
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
      case AgentDSLPackage.OUTCOME__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case AgentDSLPackage.OUTCOME__GOAL:
        setGoal((Goal)newValue);
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
      case AgentDSLPackage.OUTCOME__ATTRIBUTES:
        getAttributes().clear();
        return;
      case AgentDSLPackage.OUTCOME__GOAL:
        setGoal((Goal)null);
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
      case AgentDSLPackage.OUTCOME__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case AgentDSLPackage.OUTCOME__GOAL:
        return goal != null;
    }
    return super.eIsSet(featureID);
  }

} //OutcomeImpl
