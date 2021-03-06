/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder;
import datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries;
import datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ModelBuilderImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ModelBuilderImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ModelBuilderImpl#getSystemLibraries <em>System Libraries</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ModelBuilderImpl#getUserLibraries <em>User Libraries</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ModelBuilderImpl#getExperimentModel <em>Experiment Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelBuilderImpl extends MinimalEObjectImpl.Container implements ModelBuilder
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getSystemLibraries() <em>System Libraries</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemLibraries()
   * @generated
   * @ordered
   */
  protected SystemLibraries systemLibraries;

  /**
   * The cached value of the '{@link #getUserLibraries() <em>User Libraries</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserLibraries()
   * @generated
   * @ordered
   */
  protected UserLibraries userLibraries;

  /**
   * The cached value of the '{@link #getExperimentModel() <em>Experiment Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExperimentModel()
   * @generated
   * @ordered
   */
  protected ExperimentModel experimentModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelBuilderImpl()
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
    return KanbanmodelPackage.Literals.MODEL_BUILDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MODEL_BUILDER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MODEL_BUILDER__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemLibraries getSystemLibraries()
  {
    return systemLibraries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystemLibraries(SystemLibraries newSystemLibraries, NotificationChain msgs)
  {
    SystemLibraries oldSystemLibraries = systemLibraries;
    systemLibraries = newSystemLibraries;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MODEL_BUILDER__SYSTEM_LIBRARIES, oldSystemLibraries, newSystemLibraries);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystemLibraries(SystemLibraries newSystemLibraries)
  {
    if (newSystemLibraries != systemLibraries)
    {
      NotificationChain msgs = null;
      if (systemLibraries != null)
        msgs = ((InternalEObject)systemLibraries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.MODEL_BUILDER__SYSTEM_LIBRARIES, null, msgs);
      if (newSystemLibraries != null)
        msgs = ((InternalEObject)newSystemLibraries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.MODEL_BUILDER__SYSTEM_LIBRARIES, null, msgs);
      msgs = basicSetSystemLibraries(newSystemLibraries, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MODEL_BUILDER__SYSTEM_LIBRARIES, newSystemLibraries, newSystemLibraries));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserLibraries getUserLibraries()
  {
    return userLibraries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUserLibraries(UserLibraries newUserLibraries, NotificationChain msgs)
  {
    UserLibraries oldUserLibraries = userLibraries;
    userLibraries = newUserLibraries;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MODEL_BUILDER__USER_LIBRARIES, oldUserLibraries, newUserLibraries);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUserLibraries(UserLibraries newUserLibraries)
  {
    if (newUserLibraries != userLibraries)
    {
      NotificationChain msgs = null;
      if (userLibraries != null)
        msgs = ((InternalEObject)userLibraries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.MODEL_BUILDER__USER_LIBRARIES, null, msgs);
      if (newUserLibraries != null)
        msgs = ((InternalEObject)newUserLibraries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.MODEL_BUILDER__USER_LIBRARIES, null, msgs);
      msgs = basicSetUserLibraries(newUserLibraries, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MODEL_BUILDER__USER_LIBRARIES, newUserLibraries, newUserLibraries));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExperimentModel getExperimentModel()
  {
    return experimentModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExperimentModel(ExperimentModel newExperimentModel, NotificationChain msgs)
  {
    ExperimentModel oldExperimentModel = experimentModel;
    experimentModel = newExperimentModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MODEL_BUILDER__EXPERIMENT_MODEL, oldExperimentModel, newExperimentModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExperimentModel(ExperimentModel newExperimentModel)
  {
    if (newExperimentModel != experimentModel)
    {
      NotificationChain msgs = null;
      if (experimentModel != null)
        msgs = ((InternalEObject)experimentModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.MODEL_BUILDER__EXPERIMENT_MODEL, null, msgs);
      if (newExperimentModel != null)
        msgs = ((InternalEObject)newExperimentModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.MODEL_BUILDER__EXPERIMENT_MODEL, null, msgs);
      msgs = basicSetExperimentModel(newExperimentModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MODEL_BUILDER__EXPERIMENT_MODEL, newExperimentModel, newExperimentModel));
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
      case KanbanmodelPackage.MODEL_BUILDER__SYSTEM_LIBRARIES:
        return basicSetSystemLibraries(null, msgs);
      case KanbanmodelPackage.MODEL_BUILDER__USER_LIBRARIES:
        return basicSetUserLibraries(null, msgs);
      case KanbanmodelPackage.MODEL_BUILDER__EXPERIMENT_MODEL:
        return basicSetExperimentModel(null, msgs);
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
      case KanbanmodelPackage.MODEL_BUILDER__NAME:
        return getName();
      case KanbanmodelPackage.MODEL_BUILDER__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.MODEL_BUILDER__SYSTEM_LIBRARIES:
        return getSystemLibraries();
      case KanbanmodelPackage.MODEL_BUILDER__USER_LIBRARIES:
        return getUserLibraries();
      case KanbanmodelPackage.MODEL_BUILDER__EXPERIMENT_MODEL:
        return getExperimentModel();
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
      case KanbanmodelPackage.MODEL_BUILDER__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.MODEL_BUILDER__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.MODEL_BUILDER__SYSTEM_LIBRARIES:
        setSystemLibraries((SystemLibraries)newValue);
        return;
      case KanbanmodelPackage.MODEL_BUILDER__USER_LIBRARIES:
        setUserLibraries((UserLibraries)newValue);
        return;
      case KanbanmodelPackage.MODEL_BUILDER__EXPERIMENT_MODEL:
        setExperimentModel((ExperimentModel)newValue);
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
      case KanbanmodelPackage.MODEL_BUILDER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.MODEL_BUILDER__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.MODEL_BUILDER__SYSTEM_LIBRARIES:
        setSystemLibraries((SystemLibraries)null);
        return;
      case KanbanmodelPackage.MODEL_BUILDER__USER_LIBRARIES:
        setUserLibraries((UserLibraries)null);
        return;
      case KanbanmodelPackage.MODEL_BUILDER__EXPERIMENT_MODEL:
        setExperimentModel((ExperimentModel)null);
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
      case KanbanmodelPackage.MODEL_BUILDER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.MODEL_BUILDER__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.MODEL_BUILDER__SYSTEM_LIBRARIES:
        return systemLibraries != null;
      case KanbanmodelPackage.MODEL_BUILDER__USER_LIBRARIES:
        return userLibraries != null;
      case KanbanmodelPackage.MODEL_BUILDER__EXPERIMENT_MODEL:
        return experimentModel != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", Description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ModelBuilderImpl
