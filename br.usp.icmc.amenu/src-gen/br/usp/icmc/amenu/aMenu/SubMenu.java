/**
 */
package br.usp.icmc.amenu.aMenu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.usp.icmc.amenu.aMenu.SubMenu#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.SubMenu#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getSubMenu()
 * @model
 * @generated
 */
public interface SubMenu extends EObject
{
  /**
   * Returns the value of the '<em><b>Decorator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decorator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decorator</em>' attribute.
   * @see #setDecorator(String)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getSubMenu_Decorator()
   * @model
   * @generated
   */
  String getDecorator();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.SubMenu#getDecorator <em>Decorator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decorator</em>' attribute.
   * @see #getDecorator()
   * @generated
   */
  void setDecorator(String value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link br.usp.icmc.amenu.aMenu.Item}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getSubMenu_Items()
   * @model containment="true"
   * @generated
   */
  EList<Item> getItems();

} // SubMenu
