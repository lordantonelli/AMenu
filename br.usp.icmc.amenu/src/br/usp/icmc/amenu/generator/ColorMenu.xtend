package br.usp.icmc.amenu.generator

class ColorMenu {
	
	var String top_bg
	var String top_bg_hover
	var String top_color
	var String top_color_hover
	var String top_border
	
	var String children_bg
	var String children_bg_hover
	var String children_color
	var String children_color_hover
	var String children_border
	
	def String getTop(String field){
		switch field{
			case "background" : return this.top_bg
			case "background-hover" : return this.top_bg_hover
			case "color" : return this.top_color
			case "color-hover" : return this.top_color_hover
			case "border" : return this.top_border
			default : return ""
		}
	}
	
	def setTop(String field, String value){
		switch field{
			case "background" : this.top_bg = value
			case "background-hover" : this.top_bg_hover = value
			case "color" : this.top_color = value
			case "color-hover" : this.top_color_hover = value
			case "border" : this.top_border = value
			default : return 
		}
	}
	
	def String getChildren(String field){
		switch field{
			case "background" : return this.children_bg
			case "background-hover" : return this.children_bg_hover
			case "color" : return this.children_color
			case "color-hover" : return this.children_color_hover
			case "border" : return this.children_border
			default : return ""
		}
	}
	
	def setChildren(String field, String value){
		switch field{
			case "background" : this.children_bg = value
			case "background-hover" : this.children_bg_hover =value
			case "color" : this.children_color = value
			case "color-hover" : this.children_color_hover = value
			case "border" : this.children_border = value
			default : return 
		}
	}
	
}