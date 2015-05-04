/**
 */
package br.usp.icmc.amenu.aMenu.impl;

import br.usp.icmc.amenu.aMenu.AMenuPackage;
import br.usp.icmc.amenu.aMenu.Config;
import br.usp.icmc.amenu.aMenu.Configurations;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configurations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.ConfigurationsImpl#getConfig_top <em>Config top</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.impl.ConfigurationsImpl#getConfig_children <em>Config children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationsImpl extends MinimalEObjectImpl.Container implements Configurations
{
  /**
   * The cached value of the '{@link #getConfig_top() <em>Config top</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfig_top()
   * @generated
   * @ordered
   */
  protected EList<Config> config_top;

  /**
   * The cached value of the '{@link #getConfig_children() <em>Config children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfig_children()
   * @generated
   * @ordered
   */
  protected EList<Config> config_children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationsImpl()
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
    return AMenuPackage.Literals.CONFIGURATIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Config> getConfig_top()
  {
    if (config_top == null)
    {
      config_top = new EObjectContainmentEList<Config>(Config.class, this, AMenuPackage.CONFIGURATIONS__CONFIG_TOP);
    }
    return config_top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Config> getConfig_children()
  {
    if (config_children == null)
    {
      config_children = new EObjectContainmentEList<Config>(Config.class, this, AMenuPackage.CONFIGURATIONS__CONFIG_CHILDREN);
    }
    return config_children;
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
      case AMenuPackage.CONFIGURATIONS__CONFIG_TOP:
        return ((InternalEList<?>)getConfig_top()).basicRemove(otherEnd, msgs);
      case AMenuPackage.CONFIGURATIONS__CONFIG_CHILDREN:
        return ((InternalEList<?>)getConfig_children()).basicRemove(otherEnd, msgs);
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
      case AMenuPackage.CONFIGURATIONS__CONFIG_TOP:
        return getConfig_top();
      case AMenuPackage.CONFIGURATIONS__CONFIG_CHILDREN:
        return getConfig_children();
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
      case AMenuPackage.CONFIGURATIONS__CONFIG_TOP:
        getConfig_top().clear();
        getConfig_top().addAll((Collection<? extends Config>)newValue);
        return;
      case AMenuPackage.CONFIGURATIONS__CONFIG_CHILDREN:
        getConfig_children().clear();
        getConfig_children().addAll((Collection<? extends Config>)newValue);
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
      case AMenuPackage.CONFIGURATIONS__CONFIG_TOP:
        getConfig_top().clear();
        return;
      case AMenuPackage.CONFIGURATIONS__CONFIG_CHILDREN:
        getConfig_children().clear();
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
      case AMenuPackage.CONFIGURATIONS__CONFIG_TOP:
        return config_top != null && !config_top.isEmpty();
      case AMenuPackage.CONFIGURATIONS__CONFIG_CHILDREN:
        return config_children != null && !config_children.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConfigurationsImpl
