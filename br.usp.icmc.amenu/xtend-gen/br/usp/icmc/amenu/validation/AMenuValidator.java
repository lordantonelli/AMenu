/**
 * generated by Xtext
 */
package br.usp.icmc.amenu.validation;

import br.usp.icmc.amenu.aMenu.AMenuPackage;
import br.usp.icmc.amenu.aMenu.Icon;
import br.usp.icmc.amenu.aMenu.Item;
import br.usp.icmc.amenu.aMenu.Menu;
import br.usp.icmc.amenu.validation.AbstractAMenuValidator;
import com.google.common.base.Objects;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class AMenuValidator extends AbstractAMenuValidator {
  public final static String DUPLICATE_NAME = "duplicateName";
  
  @Check
  public void checkIdAreUnique(final Menu menu) {
    HashMap<String, EObject> map = new HashMap<String, EObject>();
    String _name = menu.getName();
    boolean _containsKey = map.containsKey(_name);
    if (_containsKey) {
      this.error("ID names must be unique", menu, 
        AMenuPackage.Literals.MENU__NAME, 
        AMenuValidator.DUPLICATE_NAME);
      String _name_1 = menu.getName();
      EObject _get = map.get(_name_1);
      this.error("ID names must be unique", _get, 
        AMenuPackage.Literals.MENU__NAME, 
        AMenuValidator.DUPLICATE_NAME);
    } else {
      boolean _and = false;
      String _name_2 = menu.getName();
      boolean _equals = _name_2.equals("");
      boolean _not = (!_equals);
      if (!_not) {
        _and = false;
      } else {
        String _name_3 = menu.getName();
        boolean _notEquals = (!Objects.equal(_name_3, null));
        _and = _notEquals;
      }
      if (_and) {
        String _name_4 = menu.getName();
        map.put(_name_4, menu);
      }
    }
    EList<Item> _items = menu.getItems();
    for (final Item m : _items) {
      String _name_5 = m.getName();
      boolean _containsKey_1 = map.containsKey(_name_5);
      if (_containsKey_1) {
        this.error("ID names must be unique", m, 
          AMenuPackage.Literals.ITEM__NAME, 
          AMenuValidator.DUPLICATE_NAME);
        String _name_6 = m.getName();
        EObject _get_1 = map.get(_name_6);
        this.error("ID names must be unique", _get_1, 
          AMenuPackage.Literals.ITEM__NAME, 
          AMenuValidator.DUPLICATE_NAME);
      } else {
        boolean _and_1 = false;
        String _name_7 = m.getName();
        boolean _equals_1 = _name_7.equals("");
        boolean _not_1 = (!_equals_1);
        if (!_not_1) {
          _and_1 = false;
        } else {
          String _name_8 = m.getName();
          boolean _notEquals_1 = (!Objects.equal(_name_8, null));
          _and_1 = _notEquals_1;
        }
        if (_and_1) {
          String _name_9 = m.getName();
          map.put(_name_9, m);
        }
        Icon _icon = m.getIcon();
        String _name_10 = _icon.getName();
        boolean _containsKey_2 = map.containsKey(_name_10);
        if (_containsKey_2) {
          Icon _icon_1 = m.getIcon();
          this.error("ID Names must be unique", _icon_1, 
            AMenuPackage.Literals.ICON__NAME, 
            AMenuValidator.DUPLICATE_NAME);
          Icon _icon_2 = m.getIcon();
          String _name_11 = _icon_2.getName();
          EObject _get_2 = map.get(_name_11);
          this.error("ID names must be unique", _get_2, 
            AMenuPackage.Literals.ICON__NAME, 
            AMenuValidator.DUPLICATE_NAME);
        } else {
          boolean _and_2 = false;
          Icon _icon_3 = m.getIcon();
          String _name_12 = _icon_3.getName();
          boolean _equals_2 = _name_12.equals("");
          boolean _not_2 = (!_equals_2);
          if (!_not_2) {
            _and_2 = false;
          } else {
            Icon _icon_4 = m.getIcon();
            String _name_13 = _icon_4.getName();
            boolean _notEquals_2 = (!Objects.equal(_name_13, null));
            _and_2 = _notEquals_2;
          }
          if (_and_2) {
            Icon _icon_5 = m.getIcon();
            String _name_14 = _icon_5.getName();
            Icon _icon_6 = m.getIcon();
            map.put(_name_14, _icon_6);
          }
        }
      }
    }
  }
}