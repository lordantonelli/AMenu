/**
 */
package br.usp.icmc.amenu.aMenu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Icon#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Icon#getPosition <em>Position</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Icon#getText_alt <em>Text alt</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Icon#getAddress <em>Address</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Icon#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getIcon()
 * @model
 * @generated
 */
public interface Icon extends EObject
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
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getIcon_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Icon#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' attribute.
   * The literals are from the enumeration {@link br.usp.icmc.amenu.aMenu.Position}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' attribute.
   * @see br.usp.icmc.amenu.aMenu.Position
   * @see #setPosition(Position)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getIcon_Position()
   * @model
   * @generated
   */
  Position getPosition();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Icon#getPosition <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' attribute.
   * @see br.usp.icmc.amenu.aMenu.Position
   * @see #getPosition()
   * @generated
   */
  void setPosition(Position value);

  /**
   * Returns the value of the '<em><b>Text alt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text alt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text alt</em>' attribute.
   * @see #setText_alt(String)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getIcon_Text_alt()
   * @model
   * @generated
   */
  String getText_alt();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Icon#getText_alt <em>Text alt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text alt</em>' attribute.
   * @see #getText_alt()
   * @generated
   */
  void setText_alt(String value);

  /**
   * Returns the value of the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' attribute.
   * @see #setAddress(String)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getIcon_Address()
   * @model
   * @generated
   */
  String getAddress();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Icon#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
  void setAddress(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link br.usp.icmc.amenu.aMenu.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getIcon_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Icon
