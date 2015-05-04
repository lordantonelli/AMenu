package br.usp.icmc.amenu.generator;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public class ColorMenu {
  private String top_bg;
  
  private String top_bg_hover;
  
  private String top_color;
  
  private String top_color_hover;
  
  private String top_border;
  
  private String children_bg;
  
  private String children_bg_hover;
  
  private String children_color;
  
  private String children_color_hover;
  
  private String children_border;
  
  public String getTop(final String field) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(field, "background")) {
        _matched=true;
        return this.top_bg;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "background-hover")) {
        _matched=true;
        return this.top_bg_hover;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "color")) {
        _matched=true;
        return this.top_color;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "color-hover")) {
        _matched=true;
        return this.top_color_hover;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "border")) {
        _matched=true;
        return this.top_border;
      }
    }
    return "";
  }
  
  public void setTop(final String field, final String value) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(field, "background")) {
        _matched=true;
        this.top_bg = value;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "background-hover")) {
        _matched=true;
        this.top_bg_hover = value;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "color")) {
        _matched=true;
        this.top_color = value;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "color-hover")) {
        _matched=true;
        this.top_color_hover = value;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "border")) {
        _matched=true;
        this.top_border = value;
      }
    }
    if (!_matched) {
      return;
    }
  }
  
  public String getChildren(final String field) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(field, "background")) {
        _matched=true;
        return this.children_bg;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "background-hover")) {
        _matched=true;
        return this.children_bg_hover;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "color")) {
        _matched=true;
        return this.children_color;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "color-hover")) {
        _matched=true;
        return this.children_color_hover;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "border")) {
        _matched=true;
        return this.children_border;
      }
    }
    return "";
  }
  
  public void setChildren(final String field, final String value) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(field, "background")) {
        _matched=true;
        this.children_bg = value;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "background-hover")) {
        _matched=true;
        this.children_bg_hover = value;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "color")) {
        _matched=true;
        this.children_color = value;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "color-hover")) {
        _matched=true;
        this.children_color_hover = value;
      }
    }
    if (!_matched) {
      if (Objects.equal(field, "border")) {
        _matched=true;
        this.children_border = value;
      }
    }
    if (!_matched) {
      return;
    }
  }
}
