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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__TYPE = 1;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__STYLE = 2;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__POSITION = 3;

  /**
   * The feature id for the '<em><b>Decorator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__DECORATOR = 4;

  /**
   * The feature id for the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__CONFIGURATION = 5;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__ITEMS = 6;

  /**
   * The number of structural features of the '<em>Menu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.impl.ConfigurationsImpl <em>Configurations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.impl.ConfigurationsImpl
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getConfigurations()
   * @generated
   */
  int CONFIGURATIONS = 1;

  /**
   * The feature id for the '<em><b>Config top</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATIONS__CONFIG_TOP = 0;

  /**
   * The feature id for the '<em><b>Config children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATIONS__CONFIG_CHILDREN = 1;

  /**
   * The number of structural features of the '<em>Configurations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.impl.ConfigImpl <em>Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.impl.ConfigImpl
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getConfig()
   * @generated
   */
  int CONFIG = 2;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__COLOR = 1;

  /**
   * The number of structural features of the '<em>Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.impl.ItemImpl
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getItem()
   * @generated
   */
  int ITEM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Decorator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__DECORATOR = 1;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__ACTION = 2;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__LABEL = 3;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__TITLE = 4;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__DIRECTION = 5;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__TARGET = 6;

  /**
   * The feature id for the '<em><b>Icon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__ICON = 7;

  /**
   * The feature id for the '<em><b>Submenu</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__SUBMENU = 8;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.impl.SubMenuImpl <em>Sub Menu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.impl.SubMenuImpl
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getSubMenu()
   * @generated
   */
  int SUB_MENU = 4;

  /**
   * The feature id for the '<em><b>Decorator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MENU__DECORATOR = 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MENU__ITEMS = 1;

  /**
   * The number of structural features of the '<em>Sub Menu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MENU_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.impl.IconImpl <em>Icon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.impl.IconImpl
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getIcon()
   * @generated
   */
  int ICON = 5;

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
   * The feature id for the '<em><b>Decorator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON__DECORATOR = 2;

  /**
   * The feature id for the '<em><b>Text alt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON__TEXT_ALT = 3;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON__ADDRESS = 4;

  /**
   * The number of structural features of the '<em>Icon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICON_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.Type <em>Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.Type
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getType()
   * @generated
   */
  int TYPE = 6;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.Style <em>Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.Style
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getStyle()
   * @generated
   */
  int STYLE = 7;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.Position <em>Position</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.Position
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getPosition()
   * @generated
   */
  int POSITION = 8;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.Direction <em>Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.Direction
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getDirection()
   * @generated
   */
  int DIRECTION = 9;

  /**
   * The meta object id for the '{@link br.usp.icmc.amenu.aMenu.Target <em>Target</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.usp.icmc.amenu.aMenu.Target
   * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getTarget()
   * @generated
   */
  int TARGET = 10;


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
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Menu#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see br.usp.icmc.amenu.aMenu.Menu#getType()
   * @see #getMenu()
   * @generated
   */
  EAttribute getMenu_Type();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Menu#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see br.usp.icmc.amenu.aMenu.Menu#getStyle()
   * @see #getMenu()
   * @generated
   */
  EAttribute getMenu_Style();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Menu#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see br.usp.icmc.amenu.aMenu.Menu#getPosition()
   * @see #getMenu()
   * @generated
   */
  EAttribute getMenu_Position();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Menu#getDecorator <em>Decorator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decorator</em>'.
   * @see br.usp.icmc.amenu.aMenu.Menu#getDecorator()
   * @see #getMenu()
   * @generated
   */
  EAttribute getMenu_Decorator();

  /**
   * Returns the meta object for the containment reference '{@link br.usp.icmc.amenu.aMenu.Menu#getConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Configuration</em>'.
   * @see br.usp.icmc.amenu.aMenu.Menu#getConfiguration()
   * @see #getMenu()
   * @generated
   */
  EReference getMenu_Configuration();

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
   * Returns the meta object for class '{@link br.usp.icmc.amenu.aMenu.Configurations <em>Configurations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configurations</em>'.
   * @see br.usp.icmc.amenu.aMenu.Configurations
   * @generated
   */
  EClass getConfigurations();

  /**
   * Returns the meta object for the containment reference list '{@link br.usp.icmc.amenu.aMenu.Configurations#getConfig_top <em>Config top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Config top</em>'.
   * @see br.usp.icmc.amenu.aMenu.Configurations#getConfig_top()
   * @see #getConfigurations()
   * @generated
   */
  EReference getConfigurations_Config_top();

  /**
   * Returns the meta object for the containment reference list '{@link br.usp.icmc.amenu.aMenu.Configurations#getConfig_children <em>Config children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Config children</em>'.
   * @see br.usp.icmc.amenu.aMenu.Configurations#getConfig_children()
   * @see #getConfigurations()
   * @generated
   */
  EReference getConfigurations_Config_children();

  /**
   * Returns the meta object for class '{@link br.usp.icmc.amenu.aMenu.Config <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config</em>'.
   * @see br.usp.icmc.amenu.aMenu.Config
   * @generated
   */
  EClass getConfig();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Config#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see br.usp.icmc.amenu.aMenu.Config#getFeature()
   * @see #getConfig()
   * @generated
   */
  EAttribute getConfig_Feature();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Config#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see br.usp.icmc.amenu.aMenu.Config#getColor()
   * @see #getConfig()
   * @generated
   */
  EAttribute getConfig_Color();

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
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Item#getDecorator <em>Decorator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decorator</em>'.
   * @see br.usp.icmc.amenu.aMenu.Item#getDecorator()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_Decorator();

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
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Item#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see br.usp.icmc.amenu.aMenu.Item#getDirection()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_Direction();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Item#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see br.usp.icmc.amenu.aMenu.Item#getTarget()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_Target();

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
   * Returns the meta object for the containment reference '{@link br.usp.icmc.amenu.aMenu.Item#getSubmenu <em>Submenu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Submenu</em>'.
   * @see br.usp.icmc.amenu.aMenu.Item#getSubmenu()
   * @see #getItem()
   * @generated
   */
  EReference getItem_Submenu();

  /**
   * Returns the meta object for class '{@link br.usp.icmc.amenu.aMenu.SubMenu <em>Sub Menu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Menu</em>'.
   * @see br.usp.icmc.amenu.aMenu.SubMenu
   * @generated
   */
  EClass getSubMenu();

  /**
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.SubMenu#getDecorator <em>Decorator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decorator</em>'.
   * @see br.usp.icmc.amenu.aMenu.SubMenu#getDecorator()
   * @see #getSubMenu()
   * @generated
   */
  EAttribute getSubMenu_Decorator();

  /**
   * Returns the meta object for the containment reference list '{@link br.usp.icmc.amenu.aMenu.SubMenu#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see br.usp.icmc.amenu.aMenu.SubMenu#getItems()
   * @see #getSubMenu()
   * @generated
   */
  EReference getSubMenu_Items();

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
   * Returns the meta object for the attribute '{@link br.usp.icmc.amenu.aMenu.Icon#getDecorator <em>Decorator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decorator</em>'.
   * @see br.usp.icmc.amenu.aMenu.Icon#getDecorator()
   * @see #getIcon()
   * @generated
   */
  EAttribute getIcon_Decorator();

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
   * Returns the meta object for enum '{@link br.usp.icmc.amenu.aMenu.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type</em>'.
   * @see br.usp.icmc.amenu.aMenu.Type
   * @generated
   */
  EEnum getType();

  /**
   * Returns the meta object for enum '{@link br.usp.icmc.amenu.aMenu.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Style</em>'.
   * @see br.usp.icmc.amenu.aMenu.Style
   * @generated
   */
  EEnum getStyle();

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
   * Returns the meta object for enum '{@link br.usp.icmc.amenu.aMenu.Direction <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Direction</em>'.
   * @see br.usp.icmc.amenu.aMenu.Direction
   * @generated
   */
  EEnum getDirection();

  /**
   * Returns the meta object for enum '{@link br.usp.icmc.amenu.aMenu.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Target</em>'.
   * @see br.usp.icmc.amenu.aMenu.Target
   * @generated
   */
  EEnum getTarget();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU__TYPE = eINSTANCE.getMenu_Type();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU__STYLE = eINSTANCE.getMenu_Style();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU__POSITION = eINSTANCE.getMenu_Position();

    /**
     * The meta object literal for the '<em><b>Decorator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU__DECORATOR = eINSTANCE.getMenu_Decorator();

    /**
     * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MENU__CONFIGURATION = eINSTANCE.getMenu_Configuration();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MENU__ITEMS = eINSTANCE.getMenu_Items();

    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.impl.ConfigurationsImpl <em>Configurations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.impl.ConfigurationsImpl
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getConfigurations()
     * @generated
     */
    EClass CONFIGURATIONS = eINSTANCE.getConfigurations();

    /**
     * The meta object literal for the '<em><b>Config top</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATIONS__CONFIG_TOP = eINSTANCE.getConfigurations_Config_top();

    /**
     * The meta object literal for the '<em><b>Config children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATIONS__CONFIG_CHILDREN = eINSTANCE.getConfigurations_Config_children();

    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.impl.ConfigImpl <em>Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.impl.ConfigImpl
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getConfig()
     * @generated
     */
    EClass CONFIG = eINSTANCE.getConfig();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG__FEATURE = eINSTANCE.getConfig_Feature();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG__COLOR = eINSTANCE.getConfig_Color();

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
     * The meta object literal for the '<em><b>Decorator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__DECORATOR = eINSTANCE.getItem_Decorator();

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
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__DIRECTION = eINSTANCE.getItem_Direction();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__TARGET = eINSTANCE.getItem_Target();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM__ICON = eINSTANCE.getItem_Icon();

    /**
     * The meta object literal for the '<em><b>Submenu</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM__SUBMENU = eINSTANCE.getItem_Submenu();

    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.impl.SubMenuImpl <em>Sub Menu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.impl.SubMenuImpl
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getSubMenu()
     * @generated
     */
    EClass SUB_MENU = eINSTANCE.getSubMenu();

    /**
     * The meta object literal for the '<em><b>Decorator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_MENU__DECORATOR = eINSTANCE.getSubMenu_Decorator();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_MENU__ITEMS = eINSTANCE.getSubMenu_Items();

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
     * The meta object literal for the '<em><b>Decorator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ICON__DECORATOR = eINSTANCE.getIcon_Decorator();

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
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.Type <em>Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.Type
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getType()
     * @generated
     */
    EEnum TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.Style <em>Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.Style
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getStyle()
     * @generated
     */
    EEnum STYLE = eINSTANCE.getStyle();

    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.Position <em>Position</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.Position
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getPosition()
     * @generated
     */
    EEnum POSITION = eINSTANCE.getPosition();

    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.Direction <em>Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.Direction
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getDirection()
     * @generated
     */
    EEnum DIRECTION = eINSTANCE.getDirection();

    /**
     * The meta object literal for the '{@link br.usp.icmc.amenu.aMenu.Target <em>Target</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.usp.icmc.amenu.aMenu.Target
     * @see br.usp.icmc.amenu.aMenu.impl.AMenuPackageImpl#getTarget()
     * @generated
     */
    EEnum TARGET = eINSTANCE.getTarget();

  }

} //AMenuPackage
