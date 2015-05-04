/**
 */
package br.usp.icmc.amenu.aMenu.impl;

import br.usp.icmc.amenu.aMenu.AMenuPackage;
import br.usp.icmc.amenu.aMenu.Item;
import br.usp.icmc.amenu.aMenu.SubMenu;

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
 * An implementation of the model object '<em><b>Sub Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.SubMenuImpl#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.SubMenuImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubMenuImpl extends MinimalEObjectImpl.Container implements SubMenu
{
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
  protected SubMenuImpl()
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
    return AMenuPackage.Literals.SUB_MENU;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AMenuPackage.SUB_MENU__DECORATOR, oldDecorator, decorator));
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
      items = new EObjectContainmentEList<Item>(Item.class, this, AMenuPackage.SUB_MENU__ITEMS);
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
      case AMenuPackage.SUB_MENU__ITEMS:
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
      case AMenuPackage.SUB_MENU__DECORATOR:
        return getDecorator();
      case AMenuPackage.SUB_MENU__ITEMS:
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
      case AMenuPackage.SUB_MENU__DECORATOR:
        setDecorator((String)newValue);
        return;
      case AMenuPackage.SUB_MENU__ITEMS:
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
      case AMenuPackage.SUB_MENU__DECORATOR:
        setDecorator(DECORATOR_EDEFAULT);
        return;
      case AMenuPackage.SUB_MENU__ITEMS:
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
      case AMenuPackage.SUB_MENU__DECORATOR:
        return DECORATOR_EDEFAULT == null ? decorator != null : !DECORATOR_EDEFAULT.equals(decorator);
      case AMenuPackage.SUB_MENU__ITEMS:
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
    result.append(" (decorator: ");
    result.append(decorator);
    result.append(')');
    return result.toString();
  }

} //SubMenuImpl
