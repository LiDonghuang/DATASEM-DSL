/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getPath <em>Path</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getServiceProviders <em>Service Providers</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getWorkSources <em>Work Sources</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getWorkItemNetworks <em>Work Item Networks</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getWINReplicationSetting <em>WIN Replication Setting</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getIndicators <em>Indicators</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getExperimentModel()
 * @model
 * @generated
 */
public interface ExperimentModel extends EObject
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getExperimentModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getExperimentModel_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Service Providers</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Providers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Providers</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getExperimentModel_ServiceProviders()
   * @model containment="true"
   * @generated
   */
  EList<ServiceProvider> getServiceProviders();

  /**
   * Returns the value of the '<em><b>Work Sources</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Sources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Sources</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getExperimentModel_WorkSources()
   * @model containment="true"
   * @generated
   */
  EList<WorkSource> getWorkSources();

  /**
   * Returns the value of the '<em><b>Work Item Networks</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Item Networks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Item Networks</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getExperimentModel_WorkItemNetworks()
   * @model containment="true"
   * @generated
   */
  EList<WorkItemNetwork> getWorkItemNetworks();

  /**
   * Returns the value of the '<em><b>WIN Replication Setting</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WIN Replication Setting</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WIN Replication Setting</em>' containment reference.
   * @see #setWINReplicationSetting(WINReplicationSetting)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getExperimentModel_WINReplicationSetting()
   * @model containment="true"
   * @generated
   */
  WINReplicationSetting getWINReplicationSetting();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getWINReplicationSetting <em>WIN Replication Setting</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>WIN Replication Setting</em>' containment reference.
   * @see #getWINReplicationSetting()
   * @generated
   */
  void setWINReplicationSetting(WINReplicationSetting value);

  /**
   * Returns the value of the '<em><b>Indicators</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indicators</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indicators</em>' containment reference.
   * @see #setIndicators(Indicators)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getExperimentModel_Indicators()
   * @model containment="true"
   * @generated
   */
  Indicators getIndicators();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getIndicators <em>Indicators</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indicators</em>' containment reference.
   * @see #getIndicators()
   * @generated
   */
  void setIndicators(Indicators value);

} // ExperimentModel
