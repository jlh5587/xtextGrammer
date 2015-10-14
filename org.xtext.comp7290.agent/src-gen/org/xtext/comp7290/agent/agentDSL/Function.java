/**
 */
package org.xtext.comp7290.agent.agentDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.comp7290.agent.agentDSL.Function#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.comp7290.agent.agentDSL.AgentDSLPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Type
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
   * @see org.xtext.comp7290.agent.agentDSL.AgentDSLPackage#getFunction_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Function
