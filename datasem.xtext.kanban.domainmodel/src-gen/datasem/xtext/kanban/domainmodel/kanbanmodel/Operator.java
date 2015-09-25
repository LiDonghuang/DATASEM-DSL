/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isEqualTo <em>Equal To</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isLargerThan <em>Larger Than</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isSmallerThan <em>Smaller Than</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isLargerOrEqualTo <em>Larger Or Equal To</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isSmallerOrEqualTo <em>Smaller Or Equal To</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isNotEqualTo <em>Not Equal To</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends EObject
{
  /**
   * Returns the value of the '<em><b>Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equal To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equal To</em>' attribute.
   * @see #setEqualTo(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getOperator_EqualTo()
   * @model
   * @generated
   */
  boolean isEqualTo();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isEqualTo <em>Equal To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equal To</em>' attribute.
   * @see #isEqualTo()
   * @generated
   */
  void setEqualTo(boolean value);

  /**
   * Returns the value of the '<em><b>Larger Than</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Larger Than</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Larger Than</em>' attribute.
   * @see #setLargerThan(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getOperator_LargerThan()
   * @model
   * @generated
   */
  boolean isLargerThan();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isLargerThan <em>Larger Than</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Larger Than</em>' attribute.
   * @see #isLargerThan()
   * @generated
   */
  void setLargerThan(boolean value);

  /**
   * Returns the value of the '<em><b>Smaller Than</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Smaller Than</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Smaller Than</em>' attribute.
   * @see #setSmallerThan(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getOperator_SmallerThan()
   * @model
   * @generated
   */
  boolean isSmallerThan();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isSmallerThan <em>Smaller Than</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Smaller Than</em>' attribute.
   * @see #isSmallerThan()
   * @generated
   */
  void setSmallerThan(boolean value);

  /**
   * Returns the value of the '<em><b>Larger Or Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Larger Or Equal To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Larger Or Equal To</em>' attribute.
   * @see #setLargerOrEqualTo(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getOperator_LargerOrEqualTo()
   * @model
   * @generated
   */
  boolean isLargerOrEqualTo();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isLargerOrEqualTo <em>Larger Or Equal To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Larger Or Equal To</em>' attribute.
   * @see #isLargerOrEqualTo()
   * @generated
   */
  void setLargerOrEqualTo(boolean value);

  /**
   * Returns the value of the '<em><b>Smaller Or Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Smaller Or Equal To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Smaller Or Equal To</em>' attribute.
   * @see #setSmallerOrEqualTo(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getOperator_SmallerOrEqualTo()
   * @model
   * @generated
   */
  boolean isSmallerOrEqualTo();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isSmallerOrEqualTo <em>Smaller Or Equal To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Smaller Or Equal To</em>' attribute.
   * @see #isSmallerOrEqualTo()
   * @generated
   */
  void setSmallerOrEqualTo(boolean value);

  /**
   * Returns the value of the '<em><b>Not Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not Equal To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Equal To</em>' attribute.
   * @see #setNotEqualTo(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getOperator_NotEqualTo()
   * @model
   * @generated
   */
  boolean isNotEqualTo();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isNotEqualTo <em>Not Equal To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Equal To</em>' attribute.
   * @see #isNotEqualTo()
   * @generated
   */
  void setNotEqualTo(boolean value);

} // Operator
