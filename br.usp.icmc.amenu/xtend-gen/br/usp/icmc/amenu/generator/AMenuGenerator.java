/**
 * generated by Xtext
 */
package br.usp.icmc.amenu.generator;

import br.usp.icmc.amenu.aMenu.Menu;
import br.usp.icmc.amenu.aMenu.Type;
import br.usp.icmc.amenu.generator.Accordion;
import br.usp.icmc.amenu.generator.Dropdown;
import br.usp.icmc.amenu.generator.Flyout;
import br.usp.icmc.amenu.generator.MenuAbstract;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class AMenuGenerator implements IGenerator {
  private MenuAbstract _menu;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Menu menu = ((Menu) _head);
    Dropdown _dropdown = new Dropdown(menu);
    this._menu = _dropdown;
    String _className = this.className(resource);
    String _plus = (_className + ".html");
    CharSequence _genHtml = this._menu.genHtml();
    fsa.generateFile(_plus, _genHtml);
  }
  
  public MenuAbstract genCode(final Resource resource) {
    MenuAbstract _xblockexpression = null;
    {
      EList<EObject> _contents = resource.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      Menu menu = ((Menu) _head);
      MenuAbstract _switchResult = null;
      Type _type = menu.getType();
      String _string = _type.toString();
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(_string, "dropdown")) {
          _matched=true;
          Dropdown _dropdown = new Dropdown(menu);
          _switchResult = this._menu = _dropdown;
        }
      }
      if (!_matched) {
        if (Objects.equal(_string, "flyout")) {
          _matched=true;
          Flyout _flyout = new Flyout(menu);
          _switchResult = this._menu = _flyout;
        }
      }
      if (!_matched) {
        if (Objects.equal(_string, "accordion")) {
          _matched=true;
          Accordion _accordion = new Accordion(menu);
          _switchResult = this._menu = _accordion;
        }
      }
      if (!_matched) {
        throw new IllegalArgumentException("Invalid type menu!");
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public String getCode(final String type) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(type, "css")) {
        _matched=true;
        CharSequence _genCss = this._menu.genCss();
        return _genCss.toString();
      }
    }
    if (!_matched) {
      if (Objects.equal(type, "html")) {
        _matched=true;
        CharSequence _genHtml = this._menu.genHtml();
        return _genHtml.toString();
      }
    }
    if (!_matched) {
      if (Objects.equal(type, "js")) {
        _matched=true;
        CharSequence _genJavascript = this._menu.genJavascript();
        return _genJavascript.toString();
      }
    }
    return "";
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
}