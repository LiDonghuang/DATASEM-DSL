/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WI Acceptance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl#getBacklogQLimit <em>Backlog QLimit</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl#getReadyQLimit <em>Ready QLimit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WIAcceptanceImpl extends MinimalEObjectImpl.Container implements WIAcceptance
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected WIAcceptanceRuleType type;

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
   * The default value of the '{@link #getBacklogQLimit() <em>Backlog QLimit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBacklogQLimit()
   * @generated
   * @ordered
   */
  protected static final int BACKLOG_QLIMIT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBacklogQLimit() <em>Backlog QLimit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBacklogQLimit()
   * @generated
   * @ordered
   */
  protected int backlogQLimit = BACKLOG_QLIMIT_EDEFAULT;

  /**
   * The default value of the '{@link #getReadyQLimit() <em>Ready QLimit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadyQLimit()
   * @generated
   * @ordered
   */
  protected static final int READY_QLIMIT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getReadyQLimit() <em>Ready QLimit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadyQLimit()
   * @generated
   * @ordered
   */
  protected int readyQLimit = READY_QLIMIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WIAcceptanceImpl()
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
    return KanbanmodelPackage.Literals.WI_ACCEPTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAcceptanceRuleType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (WIAcceptanceRuleType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WI_ACCEPTANCE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAcceptanceRuleType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(WIAcceptanceRuleType newType)
  {
    WIAcceptanceRuleType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WI_ACCEPTANCE__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WI_ACCEPTANCE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBacklogQLimit()
  {
    return backlogQLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBacklogQLimit(int newBacklogQLimit)
  {
    int oldBacklogQLimit = backlogQLimit;
    backlogQLimit = newBacklogQLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WI_ACCEPTANCE__BACKLOG_QLIMIT, oldBacklogQLimit, backlogQLimit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getReadyQLimit()
  {
    return readyQLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadyQLimit(int newReadyQLimit)
  {
    int oldReadyQLimit = readyQLimit;
    readyQLimit = newReadyQLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WI_ACCEPTANCE__READY_QLIMIT, oldReadyQLimit, readyQLimit));
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
      case KanbanmodelPackage.WI_ACCEPTANCE__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case KanbanmodelPackage.WI_ACCEPTANCE__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.WI_ACCEPTANCE__BACKLOG_QLIMIT:
        return getBacklogQLimit();
      case KanbanmodelPackage.WI_ACCEPTANCE__READY_QLIMIT:
        return getReadyQLimit();
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
      case KanbanmodelPackage.WI_ACCEPTANCE__TYPE:
        setType((WIAcceptanceRuleType)newValue);
        return;
      case KanbanmodelPackage.WI_ACCEPTANCE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.WI_ACCEPTANCE__BACKLOG_QLIMIT:
        setBacklogQLimit((Integer)newValue);
        return;
      case KanbanmodelPackage.WI_ACCEPTANCE__READY_QLIMIT:
        setReadyQLimit((Integer)newValue);
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
      case KanbanmodelPackage.WI_ACCEPTANCE__TYPE:
        setType((WIAcceptanceRuleType)null);
        return;
      case KanbanmodelPackage.WI_ACCEPTANCE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.WI_ACCEPTANCE__BACKLOG_QLIMIT:
        setBacklogQLimit(BACKLOG_QLIMIT_EDEFAULT);
        return;
      case KanbanmodelPackage.WI_ACCEPTANCE__READY_QLIMIT:
        setReadyQLimit(READY_QLIMIT_EDEFAULT);
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
      case KanbanmodelPackage.WI_ACCEPTANCE__TYPE:
        return type != null;
      case KanbanmodelPackage.WI_ACCEPTANCE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.WI_ACCEPTANCE__BACKLOG_QLIMIT:
        return backlogQLimit != BACKLOG_QLIMIT_EDEFAULT;
      case KanbanmodelPackage.WI_ACCEPTANCE__READY_QLIMIT:
        return readyQLimit != READY_QLIMIT_EDEFAULT;
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
    result.append(" (description: ");
    result.append(description);
    result.append(", backlogQLimit: ");
    result.append(backlogQLimit);
    result.append(", readyQLimit: ");
    result.append(readyQLimit);
    result.append(')');
    return result.toString();
  }

} //WIAcceptanceImpl
