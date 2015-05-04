/**
 */
package br.usp.icmc.amenu.aMenu.impl;

import br.usp.icmc.amenu.aMenu.AMenuFactory;
import br.usp.icmc.amenu.aMenu.AMenuPackage;
import br.usp.icmc.amenu.aMenu.Config;
import br.usp.icmc.amenu.aMenu.Configurations;
import br.usp.icmc.amenu.aMenu.Direction;
import br.usp.icmc.amenu.aMenu.Icon;
import br.usp.icmc.amenu.aMenu.Item;
import br.usp.icmc.amenu.aMenu.Menu;
import br.usp.icmc.amenu.aMenu.Position;
import br.usp.icmc.amenu.aMenu.Style;
import br.usp.icmc.amenu.aMenu.SubMenu;
import br.usp.icmc.amenu.aMenu.Target;
import br.usp.icmc.amenu.aMenu.Type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AMenuPackageImpl extends EPackageImpl implements AMenuPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subMenuEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iconEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum styleEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum positionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum directionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum targetEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see br.usp.icmc.amenu.aMenu.AMenuPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AMenuPackageImpl()
  {
    super(eNS_URI, AMenuFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AMenuPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AMenuPackage init()
  {
    if (isInited) return (AMenuPackage)EPackage.Registry.INSTANCE.getEPackage(AMenuPackage.eNS_URI);

    // Obtain or create and register package
    AMenuPackageImpl theAMenuPackage = (AMenuPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AMenuPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AMenuPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAMenuPackage.createPackageContents();

    // Initialize created meta-data
    theAMenuPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAMenuPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AMenuPackage.eNS_URI, theAMenuPackage);
    return theAMenuPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenu()
  {
    return menuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenu_Name()
  {
    return (EAttribute)menuEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenu_Type()
  {
    return (EAttribute)menuEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenu_Style()
  {
    return (EAttribute)menuEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenu_Position()
  {
    return (EAttribute)menuEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenu_Decorator()
  {
    return (EAttribute)menuEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenu_Configuration()
  {
    return (EReference)menuEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenu_Items()
  {
    return (EReference)menuEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigurations()
  {
    return configurationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigurations_Config_top()
  {
    return (EReference)configurationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigurations_Config_children()
  {
    return (EReference)configurationsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfig()
  {
    return configEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfig_Feature()
  {
    return (EAttribute)configEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfig_Color()
  {
    return (EAttribute)configEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItem()
  {
    return itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItem_Name()
  {
    return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItem_Decorator()
  {
    return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItem_Action()
  {
    return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItem_Label()
  {
    return (EAttribute)itemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItem_Title()
  {
    return (EAttribute)itemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItem_Direction()
  {
    return (EAttribute)itemEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItem_Target()
  {
    return (EAttribute)itemEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItem_Icon()
  {
    return (EReference)itemEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItem_Submenu()
  {
    return (EReference)itemEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubMenu()
  {
    return subMenuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubMenu_Decorator()
  {
    return (EAttribute)subMenuEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubMenu_Items()
  {
    return (EReference)subMenuEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIcon()
  {
    return iconEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIcon_Name()
  {
    return (EAttribute)iconEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIcon_Position()
  {
    return (EAttribute)iconEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIcon_Decorator()
  {
    return (EAttribute)iconEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIcon_Text_alt()
  {
    return (EAttribute)iconEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIcon_Address()
  {
    return (EAttribute)iconEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getType()
  {
    return typeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStyle()
  {
    return styleEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPosition()
  {
    return positionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDirection()
  {
    return directionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTarget()
  {
    return targetEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AMenuFactory getAMenuFactory()
  {
    return (AMenuFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    menuEClass = createEClass(MENU);
    createEAttribute(menuEClass, MENU__NAME);
    createEAttribute(menuEClass, MENU__TYPE);
    createEAttribute(menuEClass, MENU__STYLE);
    createEAttribute(menuEClass, MENU__POSITION);
    createEAttribute(menuEClass, MENU__DECORATOR);
    createEReference(menuEClass, MENU__CONFIGURATION);
    createEReference(menuEClass, MENU__ITEMS);

    configurationsEClass = createEClass(CONFIGURATIONS);
    createEReference(configurationsEClass, CONFIGURATIONS__CONFIG_TOP);
    createEReference(configurationsEClass, CONFIGURATIONS__CONFIG_CHILDREN);

    configEClass = createEClass(CONFIG);
    createEAttribute(configEClass, CONFIG__FEATURE);
    createEAttribute(configEClass, CONFIG__COLOR);

    itemEClass = createEClass(ITEM);
    createEAttribute(itemEClass, ITEM__NAME);
    createEAttribute(itemEClass, ITEM__DECORATOR);
    createEAttribute(itemEClass, ITEM__ACTION);
    createEAttribute(itemEClass, ITEM__LABEL);
    createEAttribute(itemEClass, ITEM__TITLE);
    createEAttribute(itemEClass, ITEM__DIRECTION);
    createEAttribute(itemEClass, ITEM__TARGET);
    createEReference(itemEClass, ITEM__ICON);
    createEReference(itemEClass, ITEM__SUBMENU);

    subMenuEClass = createEClass(SUB_MENU);
    createEAttribute(subMenuEClass, SUB_MENU__DECORATOR);
    createEReference(subMenuEClass, SUB_MENU__ITEMS);

    iconEClass = createEClass(ICON);
    createEAttribute(iconEClass, ICON__NAME);
    createEAttribute(iconEClass, ICON__POSITION);
    createEAttribute(iconEClass, ICON__DECORATOR);
    createEAttribute(iconEClass, ICON__TEXT_ALT);
    createEAttribute(iconEClass, ICON__ADDRESS);

    // Create enums
    typeEEnum = createEEnum(TYPE);
    styleEEnum = createEEnum(STYLE);
    positionEEnum = createEEnum(POSITION);
    directionEEnum = createEEnum(DIRECTION);
    targetEEnum = createEEnum(TARGET);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMenu_Name(), ecorePackage.getEString(), "name", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenu_Type(), this.getType(), "type", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenu_Style(), this.getStyle(), "style", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenu_Position(), this.getPosition(), "position", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenu_Decorator(), ecorePackage.getEString(), "decorator", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMenu_Configuration(), this.getConfigurations(), null, "configuration", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMenu_Items(), this.getItem(), null, "items", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationsEClass, Configurations.class, "Configurations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfigurations_Config_top(), this.getConfig(), null, "config_top", null, 0, -1, Configurations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfigurations_Config_children(), this.getConfig(), null, "config_children", null, 0, -1, Configurations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfig_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConfig_Color(), ecorePackage.getEString(), "color", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_Decorator(), ecorePackage.getEString(), "decorator", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_Action(), ecorePackage.getEString(), "action", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_Label(), ecorePackage.getEString(), "label", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_Title(), ecorePackage.getEString(), "title", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_Direction(), this.getDirection(), "direction", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_Target(), this.getTarget(), "target", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItem_Icon(), this.getIcon(), null, "icon", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItem_Submenu(), this.getSubMenu(), null, "submenu", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subMenuEClass, SubMenu.class, "SubMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubMenu_Decorator(), ecorePackage.getEString(), "decorator", null, 0, 1, SubMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubMenu_Items(), this.getItem(), null, "items", null, 0, -1, SubMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iconEClass, Icon.class, "Icon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIcon_Name(), ecorePackage.getEString(), "name", null, 0, 1, Icon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIcon_Position(), this.getPosition(), "position", null, 0, 1, Icon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIcon_Decorator(), ecorePackage.getEString(), "decorator", null, 0, 1, Icon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIcon_Text_alt(), ecorePackage.getEString(), "text_alt", null, 0, 1, Icon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIcon_Address(), ecorePackage.getEString(), "address", null, 0, 1, Icon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(typeEEnum, Type.class, "Type");
    addEEnumLiteral(typeEEnum, Type.DROPDOWN);
    addEEnumLiteral(typeEEnum, Type.FLYOUT);
    addEEnumLiteral(typeEEnum, Type.ACCORDION);

    initEEnum(styleEEnum, Style.class, "Style");
    addEEnumLiteral(styleEEnum, Style.SIMPLE);
    addEEnumLiteral(styleEEnum, Style.COMPLEX);

    initEEnum(positionEEnum, Position.class, "Position");
    addEEnumLiteral(positionEEnum, Position.CENTER);
    addEEnumLiteral(positionEEnum, Position.LEFT);
    addEEnumLiteral(positionEEnum, Position.RIGHT);

    initEEnum(directionEEnum, Direction.class, "Direction");
    addEEnumLiteral(directionEEnum, Direction.LTR);
    addEEnumLiteral(directionEEnum, Direction.RLT);
    addEEnumLiteral(directionEEnum, Direction.AUTO);

    initEEnum(targetEEnum, Target.class, "Target");
    addEEnumLiteral(targetEEnum, Target._SELF);
    addEEnumLiteral(targetEEnum, Target._BLANK);
    addEEnumLiteral(targetEEnum, Target._PARENT);
    addEEnumLiteral(targetEEnum, Target._TOP);

    // Create resource
    createResource(eNS_URI);
  }

} //AMenuPackageImpl
