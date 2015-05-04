/**
 */
package br.usp.icmc.amenu.aMenu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Target</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.usp.icmc.amenu.aMenu.AMenuPackage#getTarget()
 * @model
 * @generated
 */
public enum Target implements Enumerator
{
  /**
   * The '<em><b>self</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #_SELF_VALUE
   * @generated
   * @ordered
   */
  _SELF(0, "_self", "_self"),

  /**
   * The '<em><b>blank</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #_BLANK_VALUE
   * @generated
   * @ordered
   */
  _BLANK(1, "_blank", "_blank"),

  /**
   * The '<em><b>parent</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #_PARENT_VALUE
   * @generated
   * @ordered
   */
  _PARENT(2, "_parent", "_parent"),

  /**
   * The '<em><b>top</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #_TOP_VALUE
   * @generated
   * @ordered
   */
  _TOP(3, "_top", "_top");

  /**
   * The '<em><b>self</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>self</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #_SELF
   * @model name="_self"
   * @generated
   * @ordered
   */
  public static final int _SELF_VALUE = 0;

  /**
   * The '<em><b>blank</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>blank</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #_BLANK
   * @model name="_blank"
   * @generated
   * @ordered
   */
  public static final int _BLANK_VALUE = 1;

  /**
   * The '<em><b>parent</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>parent</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #_PARENT
   * @model name="_parent"
   * @generated
   * @ordered
   */
  public static final int _PARENT_VALUE = 2;

  /**
   * The '<em><b>top</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>top</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #_TOP
   * @model name="_top"
   * @generated
   * @ordered
   */
  public static final int _TOP_VALUE = 3;

  /**
   * An array of all the '<em><b>Target</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Target[] VALUES_ARRAY =
    new Target[]
    {
      _SELF,
      _BLANK,
      _PARENT,
      _TOP,
    };

  /**
   * A public read-only list of all the '<em><b>Target</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Target> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Target</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Target get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Target result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Target</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Target getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Target result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Target</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Target get(int value)
  {
    switch (value)
    {
      case _SELF_VALUE: return _SELF;
      case _BLANK_VALUE: return _BLANK;
      case _PARENT_VALUE: return _PARENT;
      case _TOP_VALUE: return _TOP;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Target(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Target
