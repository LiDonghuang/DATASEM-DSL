/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getSystemLibraries <em>System Libraries</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getUserLibraries <em>User Libraries</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getExperimentModel <em>Experiment Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getModelBuilder()
 * @model
 * @generated
 */
public interface ModelBuilder extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getModelBuilder_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getModelBuilder_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>System Libraries</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System Libraries</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Libraries</em>' containment reference.
   * @see #setSystemLibraries(SystemLibraries)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getModelBuilder_SystemLibraries()
   * @model containment="true"
   * @generated
   */
  SystemLibraries getSystemLibraries();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getSystemLibraries <em>System Libraries</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System Libraries</em>' containment reference.
   * @see #getSystemLibraries()
   * @generated
   */
  void setSystemLibraries(SystemLibraries value);

  /**
   * Returns the value of the '<em><b>User Libraries</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Libraries</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Libraries</em>' containment reference.
   * @see #setUserLibraries(UserLibraries)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getModelBuilder_UserLibraries()
   * @model containment="true"
   * @generated
   */
  UserLibraries getUserLibraries();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getUserLibraries <em>User Libraries</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Libraries</em>' containment reference.
   * @see #getUserLibraries()
   * @generated
   */
  void setUserLibraries(UserLibraries value);

  /**
   * Returns the value of the '<em><b>Experiment Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Experiment Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Experiment Model</em>' containment reference.
   * @see #setExperimentModel(ExperimentModel)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getModelBuilder_ExperimentModel()
   * @model containment="true"
   * @generated
   */
  ExperimentModel getExperimentModel();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getExperimentModel <em>Experiment Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Experiment Model</em>' containment reference.
   * @see #getExperimentModel()
   * @generated
   */
  void setExperimentModel(ExperimentModel value);

} // ModelBuilder
