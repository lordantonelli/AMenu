/**
 */
package br.usp.icmc.amenu.aMenu.impl;

import br.usp.icmc.amenu.aMenu.AMenuPackage;
import br.usp.icmc.amenu.aMenu.Icon;
import br.usp.icmc.amenu.aMenu.Position;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Icon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.IconImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.IconImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.IconImpl#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.IconImpl#getText_alt <em>Text alt</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.IconImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IconImpl extends MinimalEObjectImpl.Container implements Icon
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
   * The default value of the '{@link #getText_alt() <em>Text alt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText_alt()
   * @generated
   * @ordered
   */
  protected static final String TEXT_ALT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText_alt() <em>Text alt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText_alt()
   * @generated
   * @ordered
   */
  protected String text_alt = TEXT_ALT_EDEFAULT;

  /**
   * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected String address = ADDRESS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IconImpl()
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
    return AMenuPackage.Literals.ICON;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ICON__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ICON__POSITION, oldPosition, position));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ICON__DECORATOR, oldDecorator, decorator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText_alt()
  {
    return text_alt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText_alt(String newText_alt)
  {
    String oldText_alt = text_alt;
    text_alt = newText_alt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ICON__TEXT_ALT, oldText_alt, text_alt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAddress()
  {
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddress(String newAddress)
  {
    String oldAddress = address;
    address = newAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.ICON__ADDRESS, oldAddress, address));
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
      case AMenuPackage.ICON__NAME:
        return getName();
      case AMenuPackage.ICON__POSITION:
        return getPosition();
      case AMenuPackage.ICON__DECORATOR:
        return getDecorator();
      case AMenuPackage.ICON__TEXT_ALT:
        return getText_alt();
      case AMenuPackage.ICON__ADDRESS:
        return getAddress();
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
      case AMenuPackage.ICON__NAME:
        setName((String)newValue);
        return;
      case AMenuPackage.ICON__POSITION:
        setPosition((Position)newValue);
        return;
      case AMenuPackage.ICON__DECORATOR:
        setDecorator((String)newValue);
        return;
      case AMenuPackage.ICON__TEXT_ALT:
        setText_alt((String)newValue);
        return;
      case AMenuPackage.ICON__ADDRESS:
        setAddress((String)newValue);
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
      case AMenuPackage.ICON__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AMenuPackage.ICON__POSITION:
        setPosition(POSITION_EDEFAULT);
        return;
      case AMenuPackage.ICON__DECORATOR:
        setDecorator(DECORATOR_EDEFAULT);
        return;
      case AMenuPackage.ICON__TEXT_ALT:
        setText_alt(TEXT_ALT_EDEFAULT);
        return;
      case AMenuPackage.ICON__ADDRESS:
        setAddress(ADDRESS_EDEFAULT);
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
      case AMenuPackage.ICON__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AMenuPackage.ICON__POSITION:
        return position != POSITION_EDEFAULT;
      case AMenuPackage.ICON__DECORATOR:
        return DECORATOR_EDEFAULT == null ? decorator != null : !DECORATOR_EDEFAULT.equals(decorator);
      case AMenuPackage.ICON__TEXT_ALT:
        return TEXT_ALT_EDEFAULT == null ? text_alt != null : !TEXT_ALT_EDEFAULT.equals(text_alt);
      case AMenuPackage.ICON__ADDRESS:
        return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
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
    result.append(", position: ");
    result.append(position);
    result.append(", decorator: ");
    result.append(decorator);
    result.append(", text_alt: ");
    result.append(text_alt);
    result.append(", address: ");
    result.append(address);
    result.append(')');
    return result.toString();
  }

} //IconImpl
