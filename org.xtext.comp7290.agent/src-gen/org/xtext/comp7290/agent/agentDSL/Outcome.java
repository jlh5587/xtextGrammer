/**
 */
package org.xtext.comp7290.agent.agentDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.comp7290.agent.agentDSL.Outcome#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.comp7290.agent.agentDSL.Outcome#getGoal <em>Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.comp7290.agent.agentDSL.AgentDSLPackage#getOutcome()
 * @model
 * @generated
 */
public interface Outcome extends Type
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.comp7290.agent.agentDSL.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.xtext.comp7290.agent.agentDSL.AgentDSLPackage#getOutcome_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Goal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal</em>' containment reference.
   * @see #setGoal(Goal)
   * @see org.xtext.comp7290.agent.agentDSL.AgentDSLPackage#getOutcome_Goal()
   * @model containment="true"
   * @generated
   */
  Goal getGoal();

  /**
   * Sets the value of the '{@link org.xtext.comp7290.agent.agentDSL.Outcome#getGoal <em>Goal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal</em>' containment reference.
   * @see #getGoal()
   * @generated
   */
  void setGoal(Goal value);

} // Outcome
