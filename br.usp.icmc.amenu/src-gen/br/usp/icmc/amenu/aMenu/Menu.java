/**
 */
package br.usp.icmc.amenu.aMenu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Menu#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Menu#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Menu#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getMenu_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Menu#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link br.usp.icmc.amenu.aMenu.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see br.usp.icmc.amenu.aMenu.Visibility
   * @see #setVisibility(Visibility)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getMenu_Visibility()
   * @model
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Menu#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see br.usp.icmc.amenu.aMenu.Visibility
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(Visibility value);

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
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getMenu_Items()
   * @model containment="true"
   * @generated
   */
  EList<Item> getItems();

} // Menu
