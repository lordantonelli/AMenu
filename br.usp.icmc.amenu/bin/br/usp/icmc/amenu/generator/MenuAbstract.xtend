package br.usp.icmc.amenu.generator
import br.usp.icmc.amenu.aMenu.Menu
import br.usp.icmc.amenu.aMenu.Item
import br.usp.icmc.amenu.aMenu.Icon
import java.text.SimpleDateFormat
import java.util.Date
import br.usp.icmc.amenu.aMenu.SubMenu
import br.usp.icmc.amenu.aMenu.Style
import br.usp.icmc.amenu.aMenu.Target

abstract class MenuAbstract {
	
	private String _id_menu 
	private String _id_itens
	protected Menu _menu
	protected ColorMenu _color
	private int _count_sub_menu
	private int _count_item
	
	
	new(Menu menu){
		this._menu = menu;
		
		if(menu.name != null) 
			this._id_menu = menu.name
		else
			this._id_menu = "accessible-menu"
			
		this._initColors()
		this._count_sub_menu = 0
		this._count_item = 0
	
		var dateFormat = new SimpleDateFormat("yyyyMMddHHmmss")
		this._id_itens = this._id_menu + "-" + dateFormat.format(new Date())
	}
	
	def String getIdMenu(){
		return this._id_menu
	}
	
	def String getIdItens(){
		return this._id_itens
	}
	
	def Menu getMenu(){
		return this._menu
	}
	
	def Style getStyle(){
		return this._menu.style;
	}
	
	def private _initColors(){
		this._color = new ColorMenu()
		this._color.setTop("background", "#4cb6ea")
		this._color.setTop("background-hover", "#FFFFFF")
		this._color.setTop("color", "#FFFFFF")
		this._color.setTop("color-hover", "#000000")
		this._color.setTop("border", "#4cb6ea")
		
		this._color.setChildren("background", "#FFFFFF")
		this._color.setChildren("background-hover", "#FFFFFF")
		this._color.setChildren("color", "#000000")
		this._color.setChildren("color-hover", "#4cb6ea")
		this._color.setChildren("border", "#BBBBBB")
		
		if(this._menu.configuration != null) {
			for (i : this._menu.configuration.config_top)
				this._color.setTop(i.feature, i.color)
			for (i : this._menu.configuration.config_children)
				this._color.setChildren(i.feature, i.color)
		}
	}
	
	def protected CharSequence _colorSimple()
	
	def protected CharSequence _colorComplex()
	
	def final CharSequence genCss(){
		switch this._menu.style {
		  case Style.SIMPLE : this._colorSimple()
		  case Style.COMPLEX : this._colorComplex()
		  default : this._colorSimple()
		}
	}
    
    def CharSequence genJavascript()
	
	def final CharSequence genHtml(){
		var num_id = 1
		'''
		<nav role="navigation" id="«this._id_menu»" «IF this._menu.decorator != null» class="«this._menu.decorator»"«ENDIF»>
			<ul role="menubar" class="nav-menu">
				«FOR i : this._menu.items»
					«genItem(i, "-", num_id++)»
				«ENDFOR»
			</ul>
		</nav>
		'''
	}
	
	def private final CharSequence genSubMenu(SubMenu m, String num_parent){
		var num_id = 1
		'''
			<ul id="«this._id_itens»«num_parent»0" aria-hidden="true" role="menu" class="sub-nav-group sub-nav«IF m.decorator != null» «m.decorator»«ENDIF»" aria-labelledby="«this._id_itens»«num_parent»">
				«FOR i : m.items»
					«genItem(i, num_parent, num_id++)»
				«ENDFOR»
			</ul>
		'''
	}
	
	def private final CharSequence genItem(Item item, String num_parent, int num_item){
		var tabindex = -1
		var id_item = this._id_itens + num_parent + num_item
		var target = ''
		var title = ''
		
		if(num_parent.equals("-"))
			tabindex = 0
		
		if(item.target != null){
			if(item.target.equals(Target._BLANK)){
				title = ' title="(Link aberto em uma nova janela)'
 			}
 			target = ' target="' + item.target + '"'
		}
		
		if(item.title != null){
			if (title.equals(''))
				title = ' title="' + item.title + '"'
			else
				title += ' ' + item.title + '"'	
		}
			
	'''
		<li«IF item.name != null» id="«item.name»"«ENDIF» role="menuitem" class="nav-item«IF item.submenu != null» has-sub«ENDIF»"«IF !num_parent.equals("-")» aria-describedby="«this._id_itens»«num_parent.substring(0,num_parent.length - 1)»"«ENDIF»>
		«IF item.action != null»
				<a id="«id_item»" href="«item.action»"«title»«target»«IF item.direction != null» dir="«item.direction»"«ENDIF» tabindex="«tabindex»"«IF item.submenu != null» aria-haspopup="true" aria-owns="«id_item»-0" aria-controls="«id_item»-0" aria-expanded="false"«ENDIF»>
					«IF item.icon != null»
						«item.icon.genIcon»
					«ENDIF»
			«item.label»
				</a>
		«ELSE»
				<span id="«id_item»" role="button"«title»«target»«IF item.direction != null» dir="«item.direction»"«ENDIF» tabindex="«tabindex»"«IF item.submenu != null» aria-haspopup="true" aria-owns="«id_item»-0" aria-controls="«id_item»-0" aria-expanded="false"«ENDIF»>
					«IF item.icon != null»
						«item.icon.genIcon»
					«ENDIF»
			«item.label»
				</span>
		«ENDIF»
			«IF item.submenu != null»
				«this.genSubMenu(item.submenu, num_parent + num_item + "-")»
			«ENDIF»
		</li>
	'''}
	
	def private final CharSequence genIcon(Icon icon)'''
		<img «IF icon.name != null» id="«icon.name»" «ENDIF» src="«icon.address» alt="«icon.text_alt»"«IF icon.decorator != null» class="«icon.decorator»"«ENDIF» />
	'''
}