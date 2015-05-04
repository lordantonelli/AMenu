/**
 */
package br.usp.icmc.amenu.aMenu.impl;

import br.usp.icmc.amenu.aMenu.AMenuPackage;
import br.usp.icmc.amenu.aMenu.Direction;
import br.usp.icmc.amenu.aMenu.Icon;
import br.usp.icmc.amenu.aMenu.Item;
import br.usp.icmc.amenu.aMenu.SubMenu;
import br.usp.icmc.amenu.aMenu.Target;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.ItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.ItemImpl#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.ItemImpl#getAction <em>Action</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.ItemImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.ItemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.ItemImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.ItemImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.ItemImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.ItemImpl#getSubmenu <em>Submenu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item
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
   * The default value of the '{@link #getDecorator() <em>Decorator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecorator()
   * @generated
   * @ordered
   */
  protected static final String DECORATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDecorator() <em>Decorator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecorator()
   * @generated
   * @ordered
   */
  protected String decorator = DECORATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected static final String ACTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected String action = ACTION_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final Direction DIRECTION_EDEFAULT = Direction.LTR;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected Direction direction = DIRECTION_EDEFAULT;

  /**
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final Target TARGET_EDEFAULT = Target._SELF;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Target target = TARGET_EDEFAULT;

  /**
   * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected Icon icon;

  /**
   * The cached value of the '{@link #getSubmenu() <em>Submenu</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubmenu()
   * @generated
   * @ordered
   */
  protected SubMenu submenu;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemImpl()
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
    return AMenuPackage.Literals.ITEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ITEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDecorator()
  {
    return decorator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecorator(String newDecorator)
  {
    String oldDecorator = decorator;
    decorator = newDecorator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ITEM__DECORATOR, oldDecorator, decorator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(String newAction)
  {
    String oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ITEM__ACTION, oldAction, action));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ITEM__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ITEM__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(Direction newDirection)
  {
    Direction oldDirection = direction;
    direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ITEM__DIRECTION, oldDirection, direction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Target getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Target newTarget)
  {
    Target oldTarget = target;
    target = newTarget == null ? TARGET_EDEFAULT : newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ITEM__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Icon getIcon()
  {
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIcon(Icon newIcon, NotificationChain msgs)
  {
    Icon oldIcon = icon;
    icon = newIcon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AMenuPackage.ITEM__ICON, oldIcon, newIcon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcon(Icon newIcon)
  {
    if (newIcon != icon)
    {
      NotificationChain msgs = null;
      if (icon != null)
        msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AMenuPackage.ITEM__ICON, null, msgs);
      if (newIcon != null)
        msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AMenuPackage.ITEM__ICON, null, msgs);
      msgs = basicSetIcon(newIcon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ITEM__ICON, newIcon, newIcon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubMenu getSubmenu()
  {
    return submenu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubmenu(SubMenu newSubmenu, NotificationChain msgs)
  {
    SubMenu oldSubmenu = submenu;
    submenu = newSubmenu;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AMenuPackage.ITEM__SUBMENU, oldSubmenu, newSubmenu);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubmenu(SubMenu newSubmenu)
  {
    if (newSubmenu != submenu)
    {
      NotificationChain msgs = null;
      if (submenu != null)
        msgs = ((InternalEObject)submenu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AMenuPackage.ITEM__SUBMENU, null, msgs);
      if (newSubmenu != null)
        msgs = ((InternalEObject)newSubmenu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AMenuPackage.ITEM__SUBMENU, null, msgs);
      msgs = basicSetSubmenu(newSubmenu, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ITEM__SUBMENU, newSubmenu, newSubmenu));
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
      case AMenuPackage.ITEM__ICON:
        return basicSetIcon(null, msgs);
      case AMenuPackage.ITEM__SUBMENU:
        return basicSetSubmenu(null, msgs);
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
      case AMenuPackage.ITEM__NAME:
        return getName();
      case AMenuPackage.ITEM__DECORATOR:
        return getDecorator();
      case AMenuPackage.ITEM__ACTION:
        return getAction();
      case AMenuPackage.ITEM__LABEL:
        return getLabel();
      case AMenuPackage.ITEM__TITLE:
        return getTitle();
      case AMenuPackage.ITEM__DIRECTION:
        return getDirection();
      case AMenuPackage.ITEM__TARGET:
        return getTarget();
      case AMenuPackage.ITEM__ICON:
        return getIcon();
      case AMenuPackage.ITEM__SUBMENU:
        return getSubmenu();
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
      case AMenuPackage.ITEM__NAME:
        setName((String)newValue);
        return;
      case AMenuPackage.ITEM__DECORATOR:
        setDecorator((String)newValue);
        return;
      case AMenuPackage.ITEM__ACTION:
        setAction((String)newValue);
        return;
      case AMenuPackage.ITEM__LABEL:
        setLabel((String)newValue);
        return;
      case AMenuPackage.ITEM__TITLE:
        setTitle((String)newValue);
        return;
      case AMenuPackage.ITEM__DIRECTION:
        setDirection((Direction)newValue);
        return;
      case AMenuPackage.ITEM__TARGET:
        setTarget((Target)newValue);
        return;
      case AMenuPackage.ITEM__ICON:
        setIcon((Icon)newValue);
        return;
      case AMenuPackage.ITEM__SUBMENU:
        setSubmenu((SubMenu)newValue);
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
      case AMenuPackage.ITEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AMenuPackage.ITEM__DECORATOR:
        setDecorator(DECORATOR_EDEFAULT);
        return;
      case AMenuPackage.ITEM__ACTION:
        setAction(ACTION_EDEFAULT);
        return;
      case AMenuPackage.ITEM__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case AMenuPackage.ITEM__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case AMenuPackage.ITEM__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
        return;
      case AMenuPackage.ITEM__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case AMenuPackage.ITEM__ICON:
        setIcon((Icon)null);
        return;
      case AMenuPackage.ITEM__SUBMENU:
        setSubmenu((SubMenu)null);
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
      case AMenuPackage.ITEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AMenuPackage.ITEM__DECORATOR:
        return DECORATOR_EDEFAULT == null ? decorator != null : !DECORATOR_EDEFAULT.equals(decorator);
      case AMenuPackage.ITEM__ACTION:
        return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
      case AMenuPackage.ITEM__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case AMenuPackage.ITEM__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case AMenuPackage.ITEM__DIRECTION:
        return direction != DIRECTION_EDEFAULT;
      case AMenuPackage.ITEM__TARGET:
        return target != TARGET_EDEFAULT;
      case AMenuPackage.ITEM__ICON:
        return icon != null;
      case AMenuPackage.ITEM__SUBMENU:
        return submenu != null;
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
    result.append(", decorator: ");
    result.append(decorator);
    result.append(", action: ");
    result.append(action);
    result.append(", label: ");
    result.append(label);
    result.append(", title: ");
    result.append(title);
    result.append(", direction: ");
    result.append(direction);
    result.append(", target: ");
    result.append(target);
    result.append(')');
    return result.toString();
  }

} //ItemImpl
