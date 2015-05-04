/**
 */
package br.usp.icmc.amenu.aMenu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Config#getFeature <em>Feature</em>}</li>
 *   <li>{@link br.usp.icmc.amenu.aMenu.Config#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' attribute.
   * @see #setFeature(String)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getConfig_Feature()
   * @model
   * @generated
   */
  String getFeature();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Config#getFeature <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' attribute.
   * @see #getFeature()
   * @generated
   */
  void setFeature(String value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see #setColor(String)
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getConfig_Color()
   * @model
   * @generated
   */
  String getColor();

  /**
   * Sets the value of the '{@link br.usp.icmc.amenu.aMenu.Config#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see #getColor()
   * @generated
   */
  void setColor(String value);

} // Config
