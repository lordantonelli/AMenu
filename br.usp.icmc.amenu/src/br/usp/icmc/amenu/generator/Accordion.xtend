package br.usp.icmc.amenu.generator

import br.usp.icmc.amenu.aMenu.Menu

class Accordion extends MenuAbstract {
	
	new(Menu menu) {
		super(menu)
	}
	
    override genJavascript(){
    	'''
			<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
			<script src="http://agua.intermidia.icmc.usp.br:8080/ameg/plugins/accordion.js"></script>
			<script>
			    $(document).ready(function() {
			        $("#«this.getIdMenu»").accessibleMenu();
			    });
			</script>
    	'''
    }
    
    			
	override protected _colorSimple()
	'''
		<style type="text/css">
			#«this.getIdMenu»,
			#«this.getIdMenu» ul,
			#«this.getIdMenu» ul li,
			#«this.getIdMenu» ul li a,
			#«this.getIdMenu» ul li span {
			  margin: 0;
			  padding: 0;
			  border: 0;
			  list-style: none;
			  line-height: 1;
			  display: block;
			  position: relative;
			  -webkit-box-sizing: border-box;
			  -moz-box-sizing: border-box;
			  box-sizing: border-box;
			}
			#«this.getIdMenu»:after,
			#«this.getIdMenu» > ul:after {
			  content: ".";
			  display: block;
			  clear: both;
			  visibility: hidden;
			  line-height: 0;
			  height: 0;
			}
			#«this.getIdMenu» {
			  width: 200px;
			  background: «this._color.getTop("background")»;
			}
			#«this.getIdMenu» > ul > li {
			  float: none;
			}
			#«this.getIdMenu» > ul > li > a,
			#«this.getIdMenu» > ul > li > span {
			  padding: 10px 25px 13px 25px;
			  border-left: 2px solid «this._color.getTop("border")»;
			  border-bottom: 2px solid «this._color.getTop("border")»;
			  border-right: 2px solid «this._color.getTop("border")»;
			  text-decoration: none;
			  color: «this._color.getTop("color")»;
			  cursor:pointer;
			}
			#«this.getIdMenu» > ul > li:first-child > a,
			#«this.getIdMenu» > ul > li:first-child > span {
			  border-top: 2px solid «this._color.getTop("border")»;
			}
			#«this.getIdMenu» > ul > li.open > a,
			#«this.getIdMenu» > ul > li.focus > a,
			#«this.getIdMenu» > ul > li:hover > a,
			#«this.getIdMenu» > ul > li > a:hover,
			#«this.getIdMenu» > ul > li.active > a,
			#«this.getIdMenu» > ul > li.open > span,
			#«this.getIdMenu» > ul > li.focus > span,
			#«this.getIdMenu» > ul > li:hover > span,
			#«this.getIdMenu» > ul > li > span:hover,
			#«this.getIdMenu» > ul > li.active > span {
			  color: «this._color.getTop("color-hover")»;
			  background: «this._color.getTop("background-hover")»;
			}
			#«this.getIdMenu» > ul > li.has-sub > a,
			#«this.getIdMenu» > ul > li.has-sub > span {
			  padding-right: 45px;
			}
			#«this.getIdMenu» > ul > li.has-sub::after {
			  content: "";
			  position: absolute;
			  right: 15px;
			  top: 14px;
			  width: 8px;
			  height: 8px;
			  border-bottom: 2px solid «this._color.getTop("color")»;
			  border-right: 2px solid «this._color.getTop("color")»;
			  content: "";
			  -webkit-transform: rotate(-45deg);
			  -moz-transform: rotate(-45deg);
			  -ms-transform: rotate(-45deg);
			  -o-transform: rotate(-45deg);
			  transform: rotate(-45deg);
			}
			#«this.getIdMenu» > ul > li.has-sub.focus::after,
			#«this.getIdMenu» > ul > li.has-sub:hover::after,
			#«this.getIdMenu» > ul > li.has-sub.active::after,
			#«this.getIdMenu» > ul > li.has-sub.open::after{
			  border-bottom-color: «this._color.getTop("color-hover")»;
			  border-right-color: «this._color.getTop("color-hover")»;
			}
			#«this.getIdMenu» ul ul {
			  position: absolute;
			  left: -9999px;
			  top: 60px;
			  font-size: 13px;
			  opacity: 0;
			  -webkit-transition: opacity 0.2s ease-in;
			  -moz-transition: opacity 0.2s ease-in;
			  -ms-transition: opacity 0.2s ease-in;
			  -o-transition: opacity 0.2s ease-in;
			  transition: opacity 0.2s ease-in;
			}
			#«this.getIdMenu» > ul > li > ul {
			  top: 120px;
			}
			#«this.getIdMenu» > ul > li.open > ul {
			  top: 0;
			  left: 100%;
			  opacity: 1;
			}
			#«this.getIdMenu» ul ul ul {
			  margin-left: -1px;
			  z-index: 1;
			}
			#«this.getIdMenu» ul ul > li.open > ul {
			  display:block;
			  left: 180px;
			  top: 0;
			  opacity: 1;
			}
			#«this.getIdMenu» ul ul li a,
			#«this.getIdMenu» ul ul li span {
			  text-decoration: none;
			  padding: 11px 25px;
			  width: 180px;
			  color: «this._color.getChildren("color")»;
			  background: «this._color.getChildren("background")»;
			  border-left: 1px solid «this._color.getChildren("border")»;
			  border-right: 1px solid «this._color.getChildren("border")»;
			  border-top: 1px solid «this._color.getChildren("border")»;
			  cursor:pointer;
			}
			
			#«this.getIdMenu» ul ul li.open > a,
			#«this.getIdMenu» ul ul li.focus > a,
			#«this.getIdMenu» ul ul li:hover > a,
			#«this.getIdMenu» ul ul li.active > a,
			#«this.getIdMenu» ul ul li.open > span,
			#«this.getIdMenu» ul ul li.focus > span,
			#«this.getIdMenu» ul ul li:hover > span,
			#«this.getIdMenu» ul ul li.active > span {
			  color: «this._color.getChildren("color-hover")»;
			  background:«this._color.getChildren("background-hover")»;
			}
			
			#«this.getIdMenu» ul ul li:last-child > a,
			#«this.getIdMenu» ul ul li:last-child > span {
			  border-bottom: 1px solid «this._color.getChildren("border")»;
			}
			#«this.getIdMenu» > ul > li > ul::after {
			  position: absolute;
			  display: block;
			}
			#«this.getIdMenu» ul ul li.has-sub > a::after,
			#«this.getIdMenu» ul ul li.has-sub > span::after {
			  content: "";
			  position: absolute;
			  width: 6px;
			  height: 6px;
			  border-bottom: 2px solid «this._color.getChildren("color")»;
			  border-right: 2px solid «this._color.getChildren("color")»;
			  -webkit-transform: rotate(-45deg);
			  -moz-transform: rotate(-45deg);
			  -ms-transform: rotate(-45deg);
			  -o-transform: rotate(-45deg);
			  transform: rotate(-45deg);
			  right: 17px;
			  top: 14px;
			}
			#«this.getIdMenu» ul ul li.has-sub.focus > a::after,
			#«this.getIdMenu» ul ul li.has-sub:hover > a::after,
			#«this.getIdMenu» ul ul li.has-sub.focus > span::after,
			#«this.getIdMenu» ul ul li.has-sub:hover > span::after,
			#«this.getIdMenu» ul ul li.has-sub.open > a::after,
			#«this.getIdMenu» ul ul li.has-sub.open > span::after {
			  border-bottom-color: «this._color.getChildren("color-hover")»;
			  border-right-color: «this._color.getChildren("color-hover")»;
			}
			
			#«this.getIdMenu».align-center > ul {
			  float: none;
			  text-align: center;
			}
			#«this.getIdMenu».align-center > ul > li {
			  float: none;
			  margin-left: -4px;
			}
			#«this.getIdMenu».align-center ul ul {
			  text-align: left;
			}
			#«this.getIdMenu».align-right ul ul {
			  text-align: right;
			}
			#«this.getIdMenu».align-right > ul > li:first-child > a,
			#«this.getIdMenu».align-right > ul > li:first-child > span {
			  border-left-style: none;
			}
			#«this.getIdMenu».align-right > ul > li:last-child > a,
			#«this.getIdMenu».align-right > ul > li:last-child > span {
			  border-left: 2px solid «this._color.getTop("border")»;
			}
			#«this.getIdMenu».align-right > ul > li.open > ul,
			#«this.getIdMenu».align-right > ul > li:hover > ul {
			  left: auto;
			  right: 0;
			}
			#«this.getIdMenu».align-right ul ul ul {
			  padding-right: 8px;
			}
			#«this.getIdMenu».align-right ul ul > li.open > ul,
			#«this.getIdMenu».align-right ul ul > li:hover > ul {
			  left: auto;
			  right: 100%;
			  opacity: 1;
			}
			#«this.getIdMenu».align-right > ul > li {
			  float: right;
			}
			#«this.getIdMenu».align-right ul ul li.has-sub > a::after,
			#«this.getIdMenu».align-right ul ul li.has-sub > span::after {
			  right: auto;
			  left: 17px;
			  -webkit-transform: rotate(135deg);
			  -moz-transform: rotate(135deg);
			  -ms-transform: rotate(135deg);
			  -o-transform: rotate(135deg);
			  transform: rotate(135deg);
			}
			#«this.getIdMenu».align-right ul ul li.has-sub.open > a::after,
			#«this.getIdMenu».align-right ul ul li.has-sub.active > a::after,
			#«this.getIdMenu».align-right ul ul li.has-sub.open > span::after,
			#«this.getIdMenu».align-right ul ul li.has-sub.active > span::after {
			  left:-6px;
			}
		</style>
	'''
	
	override protected _colorComplex()
	'''
		<style type="text/css">
			#«this.getIdMenu»,
			#«this.getIdMenu» ul,
			#«this.getIdMenu» ul li,
			#«this.getIdMenu» ul li a,
			#«this.getIdMenu» ul li span {
			  margin: 0;
			  padding: 0;
			  border: 0;
			  list-style: none;
			  line-height: 1;
			  display: block;
			  position: relative;
			  -webkit-box-sizing: border-box;
			  -moz-box-sizing: border-box;
			  box-sizing: border-box;
			}
			#«this.getIdMenu»:after,
			#«this.getIdMenu» > ul:after {
			  content: ".";
			  display: block;
			  clear: both;
			  visibility: hidden;
			  line-height: 0;
			  height: 0;
			}
			#«this.getIdMenu» {
			  width: 200px;
			  background: «this._color.getTop("background")»;
			}
			#«this.getIdMenu» > ul > li {
			  float: none;
			}
			#«this.getIdMenu» > ul > li > a,
			#«this.getIdMenu» > ul > li > span {
			  padding: 10px 25px 13px 25px;
			  border-left: 2px solid «this._color.getTop("border")»;
			  border-bottom: 2px solid «this._color.getTop("border")»;
			  border-right: 2px solid «this._color.getTop("border")»;
			  text-decoration: none;
			  color: «this._color.getTop("color")»;
			  cursor:pointer;
			}
			#«this.getIdMenu» > ul > li:first-child > a,
			#«this.getIdMenu» > ul > li:first-child > span {
			  border-top: 2px solid «this._color.getTop("border")»;
			}
			#«this.getIdMenu» > ul > li.open > a,
			#«this.getIdMenu» > ul > li.focus > a,
			#«this.getIdMenu» > ul > li:hover > a,
			#«this.getIdMenu» > ul > li > a:hover,
			#«this.getIdMenu» > ul > li.active > a,
			#«this.getIdMenu» > ul > li.open > span,
			#«this.getIdMenu» > ul > li.focus > span,
			#«this.getIdMenu» > ul > li:hover > span,
			#«this.getIdMenu» > ul > li > span:hover,
			#«this.getIdMenu» > ul > li.active > span {
			  color: «this._color.getTop("color-hover")»;
			  background: «this._color.getTop("background-hover")»;
			}
			#«this.getIdMenu» > ul > li.has-sub > a,
			#«this.getIdMenu» > ul > li.has-sub > span {
			  padding-right: 45px;
			}
			#«this.getIdMenu» > ul > li.has-sub::after {
			  content: "";
			  position: absolute;
			  right: 15px;
			  top: 14px;
			  width: 8px;
			  height: 8px;
			  border-bottom: 2px solid «this._color.getTop("color")»;
			  border-right: 2px solid «this._color.getTop("color")»;
			  content: "";
			  -webkit-transform: rotate(-45deg);
			  -moz-transform: rotate(-45deg);
			  -ms-transform: rotate(-45deg);
			  -o-transform: rotate(-45deg);
			  transform: rotate(-45deg);
			  -moz-transition: all .3s ease;
			  -ms-transition: all .3s ease;
			  -o-transition: all .3s ease;
			  transition: all .3s ease;
			  -webkit-transition: all 0.3s ease;
			}
			#«this.getIdMenu» > ul > li.has-sub.focus::after,
			#«this.getIdMenu» > ul > li.has-sub:hover::after,
			#«this.getIdMenu» > ul > li.has-sub.active::after{
			  border-bottom-color: «this._color.getTop("color-hover")»;
			  border-right-color: «this._color.getTop("color-hover")»;
			}
			#«this.getIdMenu» > ul > li.has-sub.open::after {
			  border-bottom-color: «this._color.getTop("border")»;
			  border-right-color: «this._color.getTop("border")»;
			  background: «this._color.getTop("background-hover")»;
			  right: -5px;
			  width: 10px;
			  height: 10px;
			}
			#«this.getIdMenu» ul ul {
			  position: absolute;
			  left: -9999px;
			  top: 60px;
			  padding-left: 8px;
			  font-size: 13px;
			  opacity: 0;
			  -webkit-transition: opacity 0.2s ease-in;
			  -moz-transition: opacity 0.2s ease-in;
			  -ms-transition: opacity 0.2s ease-in;
			  -o-transition: opacity 0.2s ease-in;
			  transition: opacity 0.2s ease-in;
			}
			#«this.getIdMenu» > ul > li > ul {
			  top: 120px;
			}
			#«this.getIdMenu» > ul > li.open > ul {
			  top: 0;
			  left: 100%;
			  opacity: 1;
			}
			#«this.getIdMenu» ul ul ul {
			  padding-top: 0;
			  padding-left: 8px;
			}
			#«this.getIdMenu» ul ul > li.open > ul {
			  display:block;
			  left: 180px;
			  top: 0;
			  opacity: 1;
			}
			#«this.getIdMenu» ul ul li a,
			#«this.getIdMenu» ul ul li span {
			  text-decoration: none;
			  font-weight: 400;
			  padding: 11px 25px;
			  width: 180px;
			  color: «this._color.getChildren("color")»;
			  background: «this._color.getChildren("background")»;
			  box-shadow: 0 2px 2px rgba(0, 0, 0, 0.1), 1px 1px 1px rgba(0, 0, 0, 0.1), -1px 1px 1px rgba(0, 0, 0, 0.1);
			  border-left: 1px solid «this._color.getChildren("border")»;
			  border-right: 1px solid «this._color.getChildren("border")»;
			  cursor:pointer;
			}
			
			#«this.getIdMenu» ul ul li.open > a,
			#«this.getIdMenu» ul ul li.focus > a,
			#«this.getIdMenu» ul ul li:hover > a,
			#«this.getIdMenu» ul ul li.active > a,
			#«this.getIdMenu» ul ul li.open > span,
			#«this.getIdMenu» ul ul li.focus > span,
			#«this.getIdMenu» ul ul li:hover > span,
			#«this.getIdMenu» ul ul li.active > span {
			  color: «this._color.getChildren("color-hover")»;
			  background:«this._color.getChildren("background-hover")»;
			}
			#«this.getIdMenu» ul ul li:first-child > a,
			#«this.getIdMenu» ul ul li:first-child > span {
			  border-top-left-radius: 3px;
			  border-top-right-radius: 3px;
			  border-top: 1px solid «this._color.getChildren("border")»;
			}
			#«this.getIdMenu» ul ul li:last-child > a,
			#«this.getIdMenu» ul ul li:last-child > span {
			  border-bottom-left-radius: 3px;
			  border-bottom-right-radius: 3px;
			  border-bottom: 1px solid «this._color.getChildren("border")»;
			}
			#«this.getIdMenu» > ul > li > ul::after {
			  position: absolute;
			  display: block;
			}
			#«this.getIdMenu» ul ul li.has-sub > a::after,
			#«this.getIdMenu» ul ul li.has-sub > span::after {
			  content: "";
			  position: absolute;
			  width: 6px;
			  height: 6px;
			  border-bottom: 2px solid «this._color.getChildren("color")»;
			  border-right: 2px solid «this._color.getChildren("color")»;
			  -webkit-transform: rotate(-45deg);
			  -moz-transform: rotate(-45deg);
			  -ms-transform: rotate(-45deg);
			  -o-transform: rotate(-45deg);
			  transform: rotate(-45deg);
			  right: 17px;
			  top: 14px;
			  -moz-transition: all .2s ease;
			  -ms-transition: all .2s ease;
			  -o-transition: all .2s ease;
			  transition: all .2s ease;
			  -webkit-transition: -webkit-transform 0.2s ease, right 0.2s ease;
			}
			#«this.getIdMenu» ul ul li.has-sub.focus > a::after,
			#«this.getIdMenu» ul ul li.has-sub:hover > a::after,
			#«this.getIdMenu» ul ul li.has-sub.focus > span::after,
			#«this.getIdMenu» ul ul li.has-sub:hover > span::after {
			  border-bottom-color: «this._color.getChildren("color-hover")»;
			  border-right-color: «this._color.getChildren("color-hover")»;
			}
			#«this.getIdMenu» ul ul li.has-sub.open > a::after,
			#«this.getIdMenu» ul ul li.has-sub.open > span::after {
			  right: -6px;
			  top: 11px;
			  width: 10px;
			  height: 10px;
			  background:«this._color.getChildren("background-hover")»;
			  border-bottom: 1px solid «this._color.getChildren("border")»000;
			  border-right: 1px solid «this._color.getChildren("border")»000;
			}
			
			#«this.getIdMenu».align-center > ul {
			  float: none;
			  text-align: center;
			}
			#«this.getIdMenu».align-center > ul > li {
			  float: none;
			  margin-left: -4px;
			}
			#«this.getIdMenu».align-center ul ul {
			  text-align: left;
			}
			#«this.getIdMenu».align-right ul ul {
			  text-align: right;
			}
			#«this.getIdMenu».align-right > ul > li:first-child > a,
			#«this.getIdMenu».align-right > ul > li:first-child > span {
			  border-left-style: none;
			}
			#«this.getIdMenu».align-right > ul > li:last-child > a,
			#«this.getIdMenu».align-right > ul > li:last-child > span {
			  border-left: 2px solid «this._color.getTop("border")»;
			}
			#«this.getIdMenu».align-right > ul > li.open > ul,
			#«this.getIdMenu».align-right > ul > li:hover > ul {
			  left: auto;
			  right: 0;
			}
			#«this.getIdMenu».align-right ul ul ul {
			  padding-right: 8px;
			}
			#«this.getIdMenu».align-right ul ul > li.open > ul,
			#«this.getIdMenu».align-right ul ul > li:hover > ul {
			  left: auto;
			  right: 100%;
			  opacity: 1;
			}
			#«this.getIdMenu».align-right > ul > li {
			  float: right;
			}
			#«this.getIdMenu».align-right ul ul li.has-sub > a::after,
			#«this.getIdMenu».align-right ul ul li.has-sub > span::after {
			  right: auto;
			  left: 17px;
			  -webkit-transform: rotate(135deg);
			  -moz-transform: rotate(135deg);
			  -ms-transform: rotate(135deg);
			  -o-transform: rotate(135deg);
			  transform: rotate(135deg);
			}
			#«this.getIdMenu».align-right ul ul li.has-sub.open > a::after,
			#«this.getIdMenu».align-right ul ul li.has-sub.active > a::after,
			#«this.getIdMenu».align-right ul ul li.has-sub.open > span::after,
			#«this.getIdMenu».align-right ul ul li.has-sub.active > span::after {
			  left:-6px;
			}
		</style>
	'''
	
	
}