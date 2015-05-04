/**
 */
package br.usp.icmc.amenu.aMenu.impl;

import br.usp.icmc.amenu.aMenu.AMenuPackage;
import br.usp.icmc.amenu.aMenu.Configurations;
import br.usp.icmc.amenu.aMenu.Item;
import br.usp.icmc.amenu.aMenu.Menu;
import br.usp.icmc.amenu.aMenu.Position;
import br.usp.icmc.amenu.aMenu.Style;
import br.usp.icmc.amenu.aMenu.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.MenuImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.MenuImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.MenuImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.MenuImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.MenuImpl#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.MenuImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.MenuImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuImpl extends MinimalEObjectImpl.Container implements Menu
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final Type TYPE_EDEFAULT = Type.DROPDOWN;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected static final Style STYLE_EDEFAULT = Style.SIMPLE;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected Style style = STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected static final Position POSITION_EDEFAULT = Position.CENTER;

  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected Position position = POSITION_EDEFAULT;

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
   * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfiguration()
   * @generated
   * @ordered
   */
  protected Configurations configuration;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<Item> items;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MenuImpl()
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
    return AMenuPackage.Literals.MENU;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.MENU__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.MENU__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(Style newStyle)
  {
    Style oldStyle = style;
    style = newStyle == null ? STYLE_EDEFAULT : newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.MENU__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(Position newPosition)
  {
    Position oldPosition = position;
    position = newPosition == null ? POSITION_EDEFAULT : newPosition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.MENU__POSITION, oldPosition, position));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.MENU__DECORATOR, oldDecorator, decorator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configurations getConfiguration()
  {
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfiguration(Configurations newConfiguration, NotificationChain msgs)
  {
    Configurations oldConfiguration = configuration;
    configuration = newConfiguration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AMenuPackage.MENU__CONFIGURATION, oldConfiguration, newConfiguration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfiguration(Configurations newConfiguration)
  {
    if (newConfiguration != configuration)
    {
      NotificationChain msgs = null;
      if (configuration != null)
        msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AMenuPackage.MENU__CONFIGURATION, null, msgs);
      if (newConfiguration != null)
        msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AMenuPackage.MENU__CONFIGURATION, null, msgs);
      msgs = basicSetConfiguration(newConfiguration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.MENU__CONFIGURATION, newConfiguration, newConfiguration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Item> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<Item>(Item.class, this, AMenuPackage.MENU__ITEMS);
    }
    return items;
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
      case AMenuPackage.MENU__CONFIGURATION:
        return basicSetConfiguration(null, msgs);
      case AMenuPackage.MENU__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
      case AMenuPackage.MENU__NAME:
        return getName();
      case AMenuPackage.MENU__TYPE:
        return getType();
      case AMenuPackage.MENU__STYLE:
        return getStyle();
      case AMenuPackage.MENU__POSITION:
        return getPosition();
      case AMenuPackage.MENU__DECORATOR:
        return getDecorator();
      case AMenuPackage.MENU__CONFIGURATION:
        return getConfiguration();
      case AMenuPackage.MENU__ITEMS:
        return getItems();
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
      case AMenuPackage.MENU__NAME:
        setName((String)newValue);
        return;
      case AMenuPackage.MENU__TYPE:
        setType((Type)newValue);
        return;
      case AMenuPackage.MENU__STYLE:
        setStyle((Style)newValue);
        return;
      case AMenuPackage.MENU__POSITION:
        setPosition((Position)newValue);
        return;
      case AMenuPackage.MENU__DECORATOR:
        setDecorator((String)newValue);
        return;
      case AMenuPackage.MENU__CONFIGURATION:
        setConfiguration((Configurations)newValue);
        return;
      case AMenuPackage.MENU__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends Item>)newValue);
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
      case AMenuPackage.MENU__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AMenuPackage.MENU__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case AMenuPackage.MENU__STYLE:
        setStyle(STYLE_EDEFAULT);
        return;
      case AMenuPackage.MENU__POSITION:
        setPosition(POSITION_EDEFAULT);
        return;
      case AMenuPackage.MENU__DECORATOR:
        setDecorator(DECORATOR_EDEFAULT);
        return;
      case AMenuPackage.MENU__CONFIGURATION:
        setConfiguration((Configurations)null);
        return;
      case AMenuPackage.MENU__ITEMS:
        getItems().clear();
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
      case AMenuPackage.MENU__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AMenuPackage.MENU__TYPE:
        return type != TYPE_EDEFAULT;
      case AMenuPackage.MENU__STYLE:
        return style != STYLE_EDEFAULT;
      case AMenuPackage.MENU__POSITION:
        return position != POSITION_EDEFAULT;
      case AMenuPackage.MENU__DECORATOR:
        return DECORATOR_EDEFAULT == null ? decorator != null : !DECORATOR_EDEFAULT.equals(decorator);
      case AMenuPackage.MENU__CONFIGURATION:
        return configuration != null;
      case AMenuPackage.MENU__ITEMS:
        return items != null && !items.isEmpty();
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
    result.append(", type: ");
    result.append(type);
    result.append(", style: ");
    result.append(style);
    result.append(", position: ");
    result.append(position);
    result.append(", decorator: ");
    result.append(decorator);
    result.append(')');
    return result.toString();
  }

} //MenuImpl
