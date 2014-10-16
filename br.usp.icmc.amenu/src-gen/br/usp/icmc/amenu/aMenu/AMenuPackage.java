/**
 */
package br.usp.icmc.amenu.aMenu;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.usp.icmc.amenu.aMenu.AMenuFactory
 * @model kind="package"
 * @generated
 */
public interface AMenuPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aMenu";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.usp.br/icmc/amenu/AMenu";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aMenu";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AMenuPackage eINSTANCE = br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl.init();

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.impl.MenuImpl <em>Menu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.impl.MenuImpl
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getMenu()
   * @generated
   */
  int MENU = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__NAME = 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__VISIBILITY = 1;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__ITEMS = 2;

  /**
   * The number of structural features of the '<em>Menu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.impl.ItemImpl
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getItem()
   * @generated
   */
  int ITEM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__ACTION = 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__LABEL = 2;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__TITLE = 3;

  /**
   * The feature id for the '<em><b>Icon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__ICON = 4;

  /**
   * The feature id for the '<em><b>Menu</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__MENU = 5;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.impl.IconImpl <em>Icon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.impl.IconImpl
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getIcon()
   * @generated
   */
  int ICON = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON__NAME = 0;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON__POSITION = 1;

  /**
   * The feature id for the '<em><b>Text alt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON__TEXT_ALT = 2;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON__ADDRESS = 3;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON__FEATURES = 4;

  /**
   * The number of structural features of the '<em>Icon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.impl.FeatureImpl
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.Visibility <em>Visibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.Visibility
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getVisibility()
   * @generated
   */
  int VISIBILITY = 4;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.Position <em>Position</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.Position
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getPosition()
   * @generated
   */
  int POSITION = 5;


  /**
   * Returns the meta object for class '{@link br.usp.icmc.amenu.aMenu.Menu <em>Menu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Menu</em>'.
   * @see br.usp.icmc.amenu.aMenu.Menu
   * @generated
   */
  EClass getMenu();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Menu#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.usp.icmc.amenu.aMenu.Menu#getName()
   * @see #getMenu()
   * @generated
   */
  EAttribute getMenu_Name();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Menu#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see br.usp.icmc.amenu.aMenu.Menu#getVisibility()
   * @see #getMenu()
   * @generated
   */
  EAttribute getMenu_Visibility();

  /**
   * Returns the meta object for the containment reference list '{@link br.usp.icmc.amenu.aMenu.Menu#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see br.usp.icmc.amenu.aMenu.Menu#getItems()
   * @see #getMenu()
   * @generated
   */
  EReference getMenu_Items();

  /**
   * Returns the meta object for class '{@link br.usp.icmc.amenu.aMenu.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see br.usp.icmc.amenu.aMenu.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Item#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.usp.icmc.amenu.aMenu.Item#getName()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_Name();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Item#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see br.usp.icmc.amenu.aMenu.Item#getAction()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_Action();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Item#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see br.usp.icmc.amenu.aMenu.Item#getLabel()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_Label();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Item#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see br.usp.icmc.amenu.aMenu.Item#getTitle()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_Title();

  /**
   * Returns the meta object for the containment reference '{@link br.usp.icmc.amenu.aMenu.Item#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Icon</em>'.
   * @see br.usp.icmc.amenu.aMenu.Item#getIcon()
   * @see #getItem()
   * @generated
   */
  EReference getItem_Icon();

  /**
   * Returns the meta object for the containment reference '{@link br.usp.icmc.amenu.aMenu.Item#getMenu <em>Menu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Menu</em>'.
   * @see br.usp.icmc.amenu.aMenu.Item#getMenu()
   * @see #getItem()
   * @generated
   */
  EReference getItem_Menu();

  /**
   * Returns the meta object for class '{@link br.usp.icmc.amenu.aMenu.Icon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Icon</em>'.
   * @see br.usp.icmc.amenu.aMenu.Icon
   * @generated
   */
  EClass getIcon();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Icon#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.usp.icmc.amenu.aMenu.Icon#getName()
   * @see #getIcon()
   * @generated
   */
  EAttribute getIcon_Name();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Icon#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see br.usp.icmc.amenu.aMenu.Icon#getPosition()
   * @see #getIcon()
   * @generated
   */
  EAttribute getIcon_Position();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Icon#getText_alt <em>Text alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text alt</em>'.
   * @see br.usp.icmc.amenu.aMenu.Icon#getText_alt()
   * @see #getIcon()
   * @generated
   */
  EAttribute getIcon_Text_alt();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Icon#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see br.usp.icmc.amenu.aMenu.Icon#getAddress()
   * @see #getIcon()
   * @generated
   */
  EAttribute getIcon_Address();

  /**
   * Returns the meta object for the containment reference list '{@link br.usp.icmc.amenu.aMenu.Icon#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see br.usp.icmc.amenu.aMenu.Icon#getFeatures()
   * @see #getIcon()
   * @generated
   */
  EReference getIcon_Features();

  /**
   * Returns the meta object for class '{@link br.usp.icmc.amenu.aMenu.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see br.usp.icmc.amenu.aMenu.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.usp.icmc.amenu.aMenu.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see br.usp.icmc.amenu.aMenu.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Type();

  /**
   * Returns the meta object for enum '{@link br.usp.icmc.amenu.aMenu.Visibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility</em>'.
   * @see br.usp.icmc.amenu.aMenu.Visibility
   * @generated
   */
  EEnum getVisibility();

  /**
   * Returns the meta object for enum '{@link br.usp.icmc.amenu.aMenu.Position <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Position</em>'.
   * @see br.usp.icmc.amenu.aMenu.Position
   * @generated
   */
  EEnum getPosition();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AMenuFactory getAMenuFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.impl.MenuImpl <em>Menu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.impl.MenuImpl
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getMenu()
     * @generated
     */
    EClass MENU = eINSTANCE.getMenu();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU__NAME = eINSTANCE.getMenu_Name();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU__VISIBILITY = eINSTANCE.getMenu_Visibility();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MENU__ITEMS = eINSTANCE.getMenu_Items();

    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.impl.ItemImpl
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__ACTION = eINSTANCE.getItem_Action();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__LABEL = eINSTANCE.getItem_Label();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__TITLE = eINSTANCE.getItem_Title();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM__ICON = eINSTANCE.getItem_Icon();

    /**
     * The meta object literal for the '<em><b>Menu</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM__MENU = eINSTANCE.getItem_Menu();

    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.impl.IconImpl <em>Icon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.impl.IconImpl
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getIcon()
     * @generated
     */
    EClass ICON = eINSTANCE.getIcon();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ICON__NAME = eINSTANCE.getIcon_Name();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ICON__POSITION = eINSTANCE.getIcon_Position();

    /**
     * The meta object literal for the '<em><b>Text alt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ICON__TEXT_ALT = eINSTANCE.getIcon_Text_alt();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ICON__ADDRESS = eINSTANCE.getIcon_Address();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ICON__FEATURES = eINSTANCE.getIcon_Features();

    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.impl.FeatureImpl
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.Visibility <em>Visibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.Visibility
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getVisibility()
     * @generated
     */
    EEnum VISIBILITY = eINSTANCE.getVisibility();

    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.Position <em>Position</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.Position
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getPosition()
     * @generated
     */
    EEnum POSITION = eINSTANCE.getPosition();

  }

} //AMenuPackage
