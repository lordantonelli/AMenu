package br.usp.icmc.amenu.generator;

import br.usp.icmc.amenu.aMenu.Config;
import br.usp.icmc.amenu.aMenu.Configurations;
import br.usp.icmc.amenu.aMenu.Direction;
import br.usp.icmc.amenu.aMenu.Icon;
import br.usp.icmc.amenu.aMenu.Item;
import br.usp.icmc.amenu.aMenu.Menu;
import br.usp.icmc.amenu.aMenu.Style;
import br.usp.icmc.amenu.aMenu.SubMenu;
import br.usp.icmc.amenu.aMenu.Target;
import br.usp.icmc.amenu.generator.ColorMenu;
import com.google.common.base.Objects;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class MenuAbstract {
  private String _id_menu;
  
  private String _id_itens;
  
  protected Menu _menu;
  
  protected ColorMenu _color;
  
  private int _count_sub_menu;
  
  private int _count_item;
  
  public MenuAbstract(final Menu menu) {
    this._menu = menu;
    String _name = menu.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      String _name_1 = menu.getName();
      this._id_menu = _name_1;
    } else {
      this._id_menu = "accessible-menu";
    }
    this._initColors();
    this._count_sub_menu = 0;
    this._count_item = 0;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    Date _date = new Date();
    String _format = dateFormat.format(_date);
    String _plus = ((this._id_menu + "-") + _format);
    this._id_itens = _plus;
  }
  
  public String getIdMenu() {
    return this._id_menu;
  }
  
  public String getIdItens() {
    return this._id_itens;
  }
  
  public Menu getMenu() {
    return this._menu;
  }
  
  public Style getStyle() {
    return this._menu.getStyle();
  }
  
  private void _initColors() {
    ColorMenu _colorMenu = new ColorMenu();
    this._color = _colorMenu;
    this._color.setTop("background", "#4cb6ea");
    this._color.setTop("background-hover", "#FFFFFF");
    this._color.setTop("color", "#FFFFFF");
    this._color.setTop("color-hover", "#000000");
    this._color.setTop("border", "#4cb6ea");
    this._color.setChildren("background", "#FFFFFF");
    this._color.setChildren("background-hover", "#FFFFFF");
    this._color.setChildren("color", "#000000");
    this._color.setChildren("color-hover", "#4cb6ea");
    this._color.setChildren("border", "#BBBBBB");
    Configurations _configuration = this._menu.getConfiguration();
    boolean _notEquals = (!Objects.equal(_configuration, null));
    if (_notEquals) {
      Configurations _configuration_1 = this._menu.getConfiguration();
      EList<Config> _config_top = _configuration_1.getConfig_top();
      for (final Config i : _config_top) {
        String _feature = i.getFeature();
        String _color = i.getColor();
        this._color.setTop(_feature, _color);
      }
      Configurations _configuration_2 = this._menu.getConfiguration();
      EList<Config> _config_children = _configuration_2.getConfig_children();
      for (final Config i_1 : _config_children) {
        String _feature_1 = i_1.getFeature();
        String _color_1 = i_1.getColor();
        this._color.setChildren(_feature_1, _color_1);
      }
    }
  }
  
  protected abstract CharSequence _colorSimple();
  
  protected abstract CharSequence _colorComplex();
  
  public final CharSequence genCss() {
    CharSequence _switchResult = null;
    Style _style = this._menu.getStyle();
    if (_style != null) {
      switch (_style) {
        case SIMPLE:
          _switchResult = this._colorSimple();
          break;
        case COMPLEX:
          _switchResult = this._colorComplex();
          break;
        default:
          _switchResult = this._colorSimple();
          break;
      }
    } else {
      _switchResult = this._colorSimple();
    }
    return _switchResult;
  }
  
  public abstract CharSequence genJavascript();
  
  public final CharSequence genHtml() {
    CharSequence _xblockexpression = null;
    {
      int num_id = 1;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<nav role=\"navigation\" id=\"");
      _builder.append(this._id_menu, "");
      _builder.append("\" ");
      {
        String _decorator = this._menu.getDecorator();
        boolean _notEquals = (!Objects.equal(_decorator, null));
        if (_notEquals) {
          _builder.append(" class=\"");
          String _decorator_1 = this._menu.getDecorator();
          _builder.append(_decorator_1, "");
          _builder.append("\"");
        }
      }
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("<ul role=\"menubar\" class=\"nav-menu\">");
      _builder.newLine();
      {
        EList<Item> _items = this._menu.getItems();
        for(final Item i : _items) {
          _builder.append("\t\t");
          int _plusPlus = num_id++;
          CharSequence _genItem = this.genItem(i, "-", _plusPlus);
          _builder.append(_genItem, "\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("</ul>");
      _builder.newLine();
      _builder.append("</nav>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private final CharSequence genSubMenu(final SubMenu m, final String num_parent) {
    CharSequence _xblockexpression = null;
    {
      int num_id = 1;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<ul id=\"");
      _builder.append(this._id_itens, "");
      _builder.append(num_parent, "");
      _builder.append("0\" aria-hidden=\"true\" role=\"menu\" class=\"sub-nav-group sub-nav");
      {
        String _decorator = m.getDecorator();
        boolean _notEquals = (!Objects.equal(_decorator, null));
        if (_notEquals) {
          _builder.append(" ");
          String _decorator_1 = m.getDecorator();
          _builder.append(_decorator_1, "");
        }
      }
      _builder.append("\" aria-labelledby=\"");
      _builder.append(this._id_itens, "");
      _builder.append(num_parent, "");
      _builder.append("\">");
      _builder.newLineIfNotEmpty();
      {
        EList<Item> _items = m.getItems();
        for(final Item i : _items) {
          _builder.append("\t");
          int _plusPlus = num_id++;
          CharSequence _genItem = this.genItem(i, num_parent, _plusPlus);
          _builder.append(_genItem, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("</ul>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private final CharSequence genItem(final Item item, final String num_parent, final int num_item) {
    CharSequence _xblockexpression = null;
    {
      int tabindex = (-1);
      String id_item = ((this._id_itens + num_parent) + Integer.valueOf(num_item));
      String target = "";
      String title = "";
      boolean _equals = num_parent.equals("-");
      if (_equals) {
        tabindex = 0;
      }
      Target _target = item.getTarget();
      boolean _notEquals = (!Objects.equal(_target, null));
      if (_notEquals) {
        Target _target_1 = item.getTarget();
        boolean _equals_1 = _target_1.equals(Target._BLANK);
        if (_equals_1) {
          title = " title=\"(Link aberto em uma nova janela)";
        }
        Target _target_2 = item.getTarget();
        String _plus = (" target=\"" + _target_2);
        String _plus_1 = (_plus + "\"");
        target = _plus_1;
      }
      String _title = item.getTitle();
      boolean _notEquals_1 = (!Objects.equal(_title, null));
      if (_notEquals_1) {
        boolean _equals_2 = title.equals("");
        if (_equals_2) {
          String _title_1 = item.getTitle();
          String _plus_2 = (" title=\"" + _title_1);
          String _plus_3 = (_plus_2 + "\"");
          title = _plus_3;
        } else {
          String _title_2 = title;
          String _title_3 = item.getTitle();
          String _plus_4 = (" " + _title_3);
          String _plus_5 = (_plus_4 + "\"");
          title = (_title_2 + _plus_5);
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<li");
      {
        String _name = item.getName();
        boolean _notEquals_2 = (!Objects.equal(_name, null));
        if (_notEquals_2) {
          _builder.append(" id=\"");
          String _name_1 = item.getName();
          _builder.append(_name_1, "");
          _builder.append("\"");
        }
      }
      _builder.append(" role=\"menuitem\" class=\"nav-item");
      {
        SubMenu _submenu = item.getSubmenu();
        boolean _notEquals_3 = (!Objects.equal(_submenu, null));
        if (_notEquals_3) {
          _builder.append(" has-sub");
        }
      }
      _builder.append("\"");
      {
        boolean _equals_3 = num_parent.equals("-");
        boolean _not = (!_equals_3);
        if (_not) {
          _builder.append(" aria-describedby=\"");
          _builder.append(this._id_itens, "");
          int _length = num_parent.length();
          int _minus = (_length - 1);
          String _substring = num_parent.substring(0, _minus);
          _builder.append(_substring, "");
          _builder.append("\"");
        }
      }
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      {
        String _action = item.getAction();
        boolean _notEquals_4 = (!Objects.equal(_action, null));
        if (_notEquals_4) {
          _builder.append("\t");
          _builder.append("<a id=\"");
          _builder.append(id_item, "\t");
          _builder.append("\" href=\"");
          String _action_1 = item.getAction();
          _builder.append(_action_1, "\t");
          _builder.append("\"");
          _builder.append(title, "\t");
          _builder.append(target, "\t");
          {
            Direction _direction = item.getDirection();
            boolean _notEquals_5 = (!Objects.equal(_direction, null));
            if (_notEquals_5) {
              _builder.append(" dir=\"");
              Direction _direction_1 = item.getDirection();
              _builder.append(_direction_1, "\t");
              _builder.append("\"");
            }
          }
          _builder.append(" tabindex=\"");
          _builder.append(tabindex, "\t");
          _builder.append("\"");
          {
            SubMenu _submenu_1 = item.getSubmenu();
            boolean _notEquals_6 = (!Objects.equal(_submenu_1, null));
            if (_notEquals_6) {
              _builder.append(" aria-haspopup=\"true\" aria-owns=\"");
              _builder.append(id_item, "\t");
              _builder.append("-0\" aria-controls=\"");
              _builder.append(id_item, "\t");
              _builder.append("-0\" aria-expanded=\"false\"");
            }
          }
          _builder.append(">");
          _builder.newLineIfNotEmpty();
          {
            Icon _icon = item.getIcon();
            boolean _notEquals_7 = (!Objects.equal(_icon, null));
            if (_notEquals_7) {
              _builder.append("\t\t");
              Icon _icon_1 = item.getIcon();
              CharSequence _genIcon = this.genIcon(_icon_1);
              _builder.append(_genIcon, "\t\t");
              _builder.newLineIfNotEmpty();
            }
          }
          String _label = item.getLabel();
          _builder.append(_label, "");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("</a>");
          _builder.newLine();
        } else {
          _builder.append("\t");
          _builder.append("<span id=\"");
          _builder.append(id_item, "\t");
          _builder.append("\" role=\"button\"");
          _builder.append(title, "\t");
          _builder.append(target, "\t");
          {
            Direction _direction_2 = item.getDirection();
            boolean _notEquals_8 = (!Objects.equal(_direction_2, null));
            if (_notEquals_8) {
              _builder.append(" dir=\"");
              Direction _direction_3 = item.getDirection();
              _builder.append(_direction_3, "\t");
              _builder.append("\"");
            }
          }
          _builder.append(" tabindex=\"");
          _builder.append(tabindex, "\t");
          _builder.append("\"");
          {
            SubMenu _submenu_2 = item.getSubmenu();
            boolean _notEquals_9 = (!Objects.equal(_submenu_2, null));
            if (_notEquals_9) {
              _builder.append(" aria-haspopup=\"true\" aria-owns=\"");
              _builder.append(id_item, "\t");
              _builder.append("-0\" aria-controls=\"");
              _builder.append(id_item, "\t");
              _builder.append("-0\" aria-expanded=\"false\"");
            }
          }
          _builder.append(">");
          _builder.newLineIfNotEmpty();
          {
            Icon _icon_2 = item.getIcon();
            boolean _notEquals_10 = (!Objects.equal(_icon_2, null));
            if (_notEquals_10) {
              _builder.append("\t\t");
              Icon _icon_3 = item.getIcon();
              CharSequence _genIcon_1 = this.genIcon(_icon_3);
              _builder.append(_genIcon_1, "\t\t");
              _builder.newLineIfNotEmpty();
            }
          }
          String _label_1 = item.getLabel();
          _builder.append(_label_1, "");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("</span>");
          _builder.newLine();
        }
      }
      {
        SubMenu _submenu_3 = item.getSubmenu();
        boolean _notEquals_11 = (!Objects.equal(_submenu_3, null));
        if (_notEquals_11) {
          _builder.append("\t");
          SubMenu _submenu_4 = item.getSubmenu();
          CharSequence _genSubMenu = this.genSubMenu(_submenu_4, ((num_parent + Integer.valueOf(num_item)) + "-"));
          _builder.append(_genSubMenu, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("</li>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private final CharSequence genIcon(final Icon icon) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<img ");
    {
      String _name = icon.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (_notEquals) {
        _builder.append(" id=\"");
        String _name_1 = icon.getName();
        _builder.append(_name_1, "");
        _builder.append("\" ");
      }
    }
    _builder.append(" src=\"");
    String _address = icon.getAddress();
    _builder.append(_address, "");
    _builder.append(" alt=\"");
    String _text_alt = icon.getText_alt();
    _builder.append(_text_alt, "");
    _builder.append("\"");
    {
      String _decorator = icon.getDecorator();
      boolean _notEquals_1 = (!Objects.equal(_decorator, null));
      if (_notEquals_1) {
        _builder.append(" class=\"");
        String _decorator_1 = icon.getDecorator();
        _builder.append(_decorator_1, "");
        _builder.append("\"");
      }
    }
    _builder.append(" />");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
