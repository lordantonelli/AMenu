/**
 */
package br.usp.icmc.amenu.aMenu.impl;

import br.usp.icmc.amenu.aMenu.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AMenuFactoryImpl extends EFactoryImpl implements AMenuFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AMenuFactory init()
  {
    try
    {
      AMenuFactory theAMenuFactory = (AMenuFactory)EPackage.Registry.INSTANCE.getEFactory(AMenuPackage.eNS_URI);
      if (theAMenuFactory != null)
      {
        return theAMenuFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AMenuFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AMenuFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AMenuPackage.MENU: return createMenu();
      case AMenuPackage.CONFIGURATIONS: return createConfigurations();
      case AMenuPackage.CONFIG: return createConfig();
      case AMenuPackage.ITEM: return createItem();
      case AMenuPackage.SUB_MENU: return createSubMenu();
      case AMenuPackage.ICON: return createIcon();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AMenuPackage.TYPE:
        return createTypeFromString(eDataType, initialValue);
      case AMenuPackage.STYLE:
        return createStyleFromString(eDataType, initialValue);
      case AMenuPackage.POSITION:
        return createPositionFromString(eDataType, initialValue);
      case AMenuPackage.DIRECTION:
        return createDirectionFromString(eDataType, initialValue);
      case AMenuPackage.TARGET:
        return createTargetFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AMenuPackage.TYPE:
        return convertTypeToString(eDataType, instanceValue);
      case AMenuPackage.STYLE:
        return convertStyleToString(eDataType, instanceValue);
      case AMenuPackage.POSITION:
        return convertPositionToString(eDataType, instanceValue);
      case AMenuPackage.DIRECTION:
        return convertDirectionToString(eDataType, instanceValue);
      case AMenuPackage.TARGET:
        return convertTargetToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Menu createMenu()
  {
    MenuImpl menu = new MenuImpl();
    return menu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configurations createConfigurations()
  {
    ConfigurationsImpl configurations = new ConfigurationsImpl();
    return configurations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Config createConfig()
  {
    ConfigImpl config = new ConfigImpl();
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem()
  {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubMenu createSubMenu()
  {
    SubMenuImpl subMenu = new SubMenuImpl();
    return subMenu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Icon createIcon()
  {
    IconImpl icon = new IconImpl();
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createTypeFromString(EDataType eDataType, String initialValue)
  {
    Type result = Type.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style createStyleFromString(EDataType eDataType, String initialValue)
  {
    Style result = Style.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStyleToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position createPositionFromString(EDataType eDataType, String initialValue)
  {
    Position result = Position.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPositionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction createDirectionFromString(EDataType eDataType, String initialValue)
  {
    Direction result = Direction.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Target createTargetFromString(EDataType eDataType, String initialValue)
  {
    Target result = Target.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTargetToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AMenuPackage getAMenuPackage()
  {
    return (AMenuPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AMenuPackage getPackage()
  {
    return AMenuPackage.eINSTANCE;
  }

} //AMenuFactoryImpl
