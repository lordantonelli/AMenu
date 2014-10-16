/**
 */
package br.usp.icmc.amenu.aMenu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Item#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Item#getAction <em>Action</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Item#getLabel <em>Label</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Item#getTitle <em>Title</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Item#getIcon <em>Icon</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Item#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject
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
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Item#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see #setAction(String)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getItem_Action()
   * @model
   * @generated
   */
  String getAction();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Item#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see #getAction()
   * @generated
   */
  void setAction(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getItem_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Item#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getItem_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Item#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Icon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icon</em>' containment reference.
   * @see #setIcon(Icon)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getItem_Icon()
   * @model containment="true"
   * @generated
   */
  Icon getIcon();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Item#getIcon <em>Icon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon</em>' containment reference.
   * @see #getIcon()
   * @generated
   */
  void setIcon(Icon value);

  /**
   * Returns the value of the '<em><b>Menu</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menu</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menu</em>' containment reference.
   * @see #setMenu(Menu)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getItem_Menu()
   * @model containment="true"
   * @generated
   */
  Menu getMenu();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Item#getMenu <em>Menu</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Menu</em>' containment reference.
   * @see #getMenu()
   * @generated
   */
  void setMenu(Menu value);

} // Item
