/**
 */
package org.xtext.comp7290.agent.agentDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.comp7290.agent.agentDSL.AgentDSLFactory
 * @model kind="package"
 * @generated
 */
public interface AgentDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "agentDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/comp7290/agent/AgentDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "agentDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AgentDSLPackage eINSTANCE = org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.comp7290.agent.agentDSL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.comp7290.agent.agentDSL.impl.ModelImpl
   * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TYPES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.comp7290.agent.agentDSL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.comp7290.agent.agentDSL.impl.TypeImpl
   * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.comp7290.agent.agentDSL.impl.TypeDefImpl <em>Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.comp7290.agent.agentDSL.impl.TypeDefImpl
   * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getTypeDef()
   * @generated
   */
  int TYPE_DEF = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Mapped Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__MAPPED_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.comp7290.agent.agentDSL.impl.JAVAIDImpl <em>JAVAID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.comp7290.agent.agentDSL.impl.JAVAIDImpl
   * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getJAVAID()
   * @generated
   */
  int JAVAID = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVAID__NAME = 0;

  /**
   * The number of structural features of the '<em>JAVAID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVAID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.comp7290.agent.agentDSL.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.comp7290.agent.agentDSL.impl.EntityImpl
   * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_ENTITY = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.comp7290.agent.agentDSL.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.comp7290.agent.agentDSL.impl.TaskImpl
   * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getTask()
   * @generated
   */
  int TASK = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ATTRIBUTES = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outcome</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__OUTCOME = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.comp7290.agent.agentDSL.impl.OutcomeImpl <em>Outcome</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.comp7290.agent.agentDSL.impl.OutcomeImpl
   * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getOutcome()
   * @generated
   */
  int OUTCOME = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME__ATTRIBUTES = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Goal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME__GOAL = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Outcome</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.comp7290.agent.agentDSL.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.comp7290.agent.agentDSL.impl.GoalImpl
   * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.comp7290.agent.agentDSL.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.comp7290.agent.agentDSL.impl.FunctionImpl
   * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ATTRIBUTES = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.comp7290.agent.agentDSL.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.comp7290.agent.agentDSL.impl.AttributeImpl
   * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MANY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.comp7290.agent.agentDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.comp7290.agent.agentDSL.Model#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Model#getTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Types();

  /**
   * Returns the meta object for class '{@link org.xtext.comp7290.agent.agentDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.comp7290.agent.agentDSL.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.comp7290.agent.agentDSL.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Def</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.TypeDef
   * @generated
   */
  EClass getTypeDef();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.comp7290.agent.agentDSL.TypeDef#getMappedType <em>Mapped Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapped Type</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.TypeDef#getMappedType()
   * @see #getTypeDef()
   * @generated
   */
  EReference getTypeDef_MappedType();

  /**
   * Returns the meta object for class '{@link org.xtext.comp7290.agent.agentDSL.JAVAID <em>JAVAID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JAVAID</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.JAVAID
   * @generated
   */
  EClass getJAVAID();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.comp7290.agent.agentDSL.JAVAID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.JAVAID#getName()
   * @see #getJAVAID()
   * @generated
   */
  EAttribute getJAVAID_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.comp7290.agent.agentDSL.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the reference '{@link org.xtext.comp7290.agent.agentDSL.Entity#getSuperEntity <em>Super Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Entity</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Entity#getSuperEntity()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.comp7290.agent.agentDSL.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.comp7290.agent.agentDSL.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.comp7290.agent.agentDSL.Task#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Task#getAttributes()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.comp7290.agent.agentDSL.Task#getOutcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Outcome</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Task#getOutcome()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Outcome();

  /**
   * Returns the meta object for class '{@link org.xtext.comp7290.agent.agentDSL.Outcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Outcome</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Outcome
   * @generated
   */
  EClass getOutcome();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.comp7290.agent.agentDSL.Outcome#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Outcome#getAttributes()
   * @see #getOutcome()
   * @generated
   */
  EReference getOutcome_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.comp7290.agent.agentDSL.Outcome#getGoal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Goal</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Outcome#getGoal()
   * @see #getOutcome()
   * @generated
   */
  EReference getOutcome_Goal();

  /**
   * Returns the meta object for class '{@link org.xtext.comp7290.agent.agentDSL.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.comp7290.agent.agentDSL.Goal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Goal#getName()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.comp7290.agent.agentDSL.Goal#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Goal#getAttributes()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.comp7290.agent.agentDSL.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.comp7290.agent.agentDSL.Function#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Function#getAttributes()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.comp7290.agent.agentDSL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the reference '{@link org.xtext.comp7290.agent.agentDSL.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.comp7290.agent.agentDSL.Attribute#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Attribute#isMany()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Many();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.comp7290.agent.agentDSL.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.comp7290.agent.agentDSL.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AgentDSLFactory getAgentDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.comp7290.agent.agentDSL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.comp7290.agent.agentDSL.impl.ModelImpl
     * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TYPES = eINSTANCE.getModel_Types();

    /**
     * The meta object literal for the '{@link org.xtext.comp7290.agent.agentDSL.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.comp7290.agent.agentDSL.impl.TypeImpl
     * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.comp7290.agent.agentDSL.impl.TypeDefImpl <em>Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.comp7290.agent.agentDSL.impl.TypeDefImpl
     * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getTypeDef()
     * @generated
     */
    EClass TYPE_DEF = eINSTANCE.getTypeDef();

    /**
     * The meta object literal for the '<em><b>Mapped Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEF__MAPPED_TYPE = eINSTANCE.getTypeDef_MappedType();

    /**
     * The meta object literal for the '{@link org.xtext.comp7290.agent.agentDSL.impl.JAVAIDImpl <em>JAVAID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.comp7290.agent.agentDSL.impl.JAVAIDImpl
     * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getJAVAID()
     * @generated
     */
    EClass JAVAID = eINSTANCE.getJAVAID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVAID__NAME = eINSTANCE.getJAVAID_Name();

    /**
     * The meta object literal for the '{@link org.xtext.comp7290.agent.agentDSL.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.comp7290.agent.agentDSL.impl.EntityImpl
     * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Super Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_ENTITY = eINSTANCE.getEntity_SuperEntity();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.comp7290.agent.agentDSL.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.comp7290.agent.agentDSL.impl.TaskImpl
     * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__ATTRIBUTES = eINSTANCE.getTask_Attributes();

    /**
     * The meta object literal for the '<em><b>Outcome</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__OUTCOME = eINSTANCE.getTask_Outcome();

    /**
     * The meta object literal for the '{@link org.xtext.comp7290.agent.agentDSL.impl.OutcomeImpl <em>Outcome</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.comp7290.agent.agentDSL.impl.OutcomeImpl
     * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getOutcome()
     * @generated
     */
    EClass OUTCOME = eINSTANCE.getOutcome();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTCOME__ATTRIBUTES = eINSTANCE.getOutcome_Attributes();

    /**
     * The meta object literal for the '<em><b>Goal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTCOME__GOAL = eINSTANCE.getOutcome_Goal();

    /**
     * The meta object literal for the '{@link org.xtext.comp7290.agent.agentDSL.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.comp7290.agent.agentDSL.impl.GoalImpl
     * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__ATTRIBUTES = eINSTANCE.getGoal_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.comp7290.agent.agentDSL.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.comp7290.agent.agentDSL.impl.FunctionImpl
     * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__ATTRIBUTES = eINSTANCE.getFunction_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.comp7290.agent.agentDSL.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.comp7290.agent.agentDSL.impl.AttributeImpl
     * @see org.xtext.comp7290.agent.agentDSL.impl.AgentDSLPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MANY = eINSTANCE.getAttribute_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

  }

} //AgentDSLPackage
