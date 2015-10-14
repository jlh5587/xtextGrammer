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
import org.xtext.comp7290.agent.agentDSL.Outcome;
import org.xtext.comp7290.agent.agentDSL.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.comp7290.agent.agentDSL.impl.TaskImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.comp7290.agent.agentDSL.impl.TaskImpl#getOutcome <em>Outcome</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends TypeImpl implements Task
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
   * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutcome()
   * @generated
   * @ordered
   */
  protected Outcome outcome;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
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
    return AgentDSLPackage.Literals.TASK;
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
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, AgentDSLPackage.TASK__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Outcome getOutcome()
  {
    return outcome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutcome(Outcome newOutcome, NotificationChain msgs)
  {
    Outcome oldOutcome = outcome;
    outcome = newOutcome;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgentDSLPackage.TASK__OUTCOME, oldOutcome, newOutcome);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutcome(Outcome newOutcome)
  {
    if (newOutcome != outcome)
    {
      NotificationChain msgs = null;
      if (outcome != null)
        msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgentDSLPackage.TASK__OUTCOME, null, msgs);
      if (newOutcome != null)
        msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgentDSLPackage.TASK__OUTCOME, null, msgs);
      msgs = basicSetOutcome(newOutcome, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgentDSLPackage.TASK__OUTCOME, newOutcome, newOutcome));
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
      case AgentDSLPackage.TASK__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case AgentDSLPackage.TASK__OUTCOME:
        return basicSetOutcome(null, msgs);
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
      case AgentDSLPackage.TASK__ATTRIBUTES:
        return getAttributes();
      case AgentDSLPackage.TASK__OUTCOME:
        return getOutcome();
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
      case AgentDSLPackage.TASK__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case AgentDSLPackage.TASK__OUTCOME:
        setOutcome((Outcome)newValue);
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
      case AgentDSLPackage.TASK__ATTRIBUTES:
        getAttributes().clear();
        return;
      case AgentDSLPackage.TASK__OUTCOME:
        setOutcome((Outcome)null);
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
      case AgentDSLPackage.TASK__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case AgentDSLPackage.TASK__OUTCOME:
        return outcome != null;
    }
    return super.eIsSet(featureID);
  }

} //TaskImpl
