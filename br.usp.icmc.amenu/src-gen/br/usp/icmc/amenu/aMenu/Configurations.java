/**
 */
package br.usp.icmc.amenu.aMenu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Configurations#getConfig_top <em>Config top</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Configurations#getConfig_children <em>Config children</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getConfigurations()
 * @model
 * @generated
 */
public interface Configurations extends EObject
{
  /**
   * Returns the value of the '<em><b>Config top</b></em>' containment reference list.
   * The list contents are of type {@link br.usp.icmc.amenu.aMenu.Config}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config top</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config top</em>' containment reference list.
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getConfigurations_Config_top()
   * @model containment="true"
   * @generated
   */
  EList<Config> getConfig_top();

  /**
   * Returns the value of the '<em><b>Config children</b></em>' containment reference list.
   * The list contents are of type {@link br.usp.icmc.amenu.aMenu.Config}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config children</em>' containment reference list.
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getConfigurations_Config_children()
   * @model containment="true"
   * @generated
   */
  EList<Config> getConfig_children();

} // Configurations
