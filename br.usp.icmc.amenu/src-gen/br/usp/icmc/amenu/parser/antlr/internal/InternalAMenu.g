/*
* generated by Xtext
*/
grammar InternalAMenu;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package br.usp.icmc.amenu.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package br.usp.icmc.amenu.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.usp.icmc.amenu.services.AMenuGrammarAccess;

}

@parser::members {

 	private AMenuGrammarAccess grammarAccess;
 	
    public InternalAMenuParser(TokenStream input, AMenuGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Menu";	
   	}
   	
   	@Override
   	protected AMenuGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMenu
entryRuleMenu returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMenuRule()); }
	 iv_ruleMenu=ruleMenu 
	 { $current=$iv_ruleMenu.current; } 
	 EOF 
;

// Rule Menu
ruleMenu returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_0());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMenuAccess().getUnorderedGroup_1());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 0);
	 				}
					({true}?=>(	otherlv_2='id:' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMenuAccess().getIdKeyword_1_0_0());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMenuAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMenuRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getSemicolonKeyword_1_0_2());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 1);
	 				}
					({true}?=>(	otherlv_5='visibility: ' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMenuAccess().getVisibilityKeyword_1_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMenuAccess().getVisibilityVisibilityEnumRuleCall_1_1_1_0()); 
	    }
		lv_visibility_6_0=ruleVisibility		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMenuRule());
	        }
       		set(
       			$current, 
       			"visibility",
        		lv_visibility_6_0, 
        		"Visibility");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMenuAccess().getSemicolonKeyword_1_1_2());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 2);
	 				}
					({true}?=>(	otherlv_8='items: [' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMenuAccess().getItemsKeyword_1_2_0());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getMenuAccess().getItemsItemParserRuleCall_1_2_1_0_0()); 
	    }
		lv_items_9_0=ruleItem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMenuRule());
	        }
       		add(
       			$current, 
       			"items",
        		lv_items_9_0, 
        		"Item");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_10=',' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMenuAccess().getCommaKeyword_1_2_1_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMenuAccess().getItemsItemParserRuleCall_1_2_1_1_1_0()); 
	    }
		lv_items_11_0=ruleItem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMenuRule());
	        }
       		add(
       			$current, 
       			"items",
        		lv_items_11_0, 
        		"Item");
	        afterParserOrEnumRuleCall();
	    }

)
))*)	otherlv_12=']' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMenuAccess().getRightSquareBracketKeyword_1_2_2());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup_1());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMenuAccess().getUnorderedGroup_1())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMenuAccess().getUnorderedGroup_1());
	}

)	otherlv_13='}' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_2());
    }
)
;





// Entry rule entryRuleItem
entryRuleItem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getItemRule()); }
	 iv_ruleItem=ruleItem 
	 { $current=$iv_ruleItem.current; } 
	 EOF 
;

// Rule Item
ruleItem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getItemAccess().getLeftCurlyBracketKeyword_0());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getItemAccess().getUnorderedGroup_1());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0);
	 				}
					({true}?=>(	otherlv_2='id:' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getItemAccess().getIdKeyword_1_0_0());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getItemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getItemAccess().getSemicolonKeyword_1_0_2());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1);
	 				}
					({true}?=>(	otherlv_5='action:' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getItemAccess().getActionKeyword_1_1_0());
    }
(
(
		lv_action_6_0=RULE_STRING
		{
			newLeafNode(lv_action_6_0, grammarAccess.getItemAccess().getActionSTRINGTerminalRuleCall_1_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getItemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"action",
        		lv_action_6_0, 
        		"STRING");
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getItemAccess().getSemicolonKeyword_1_1_2());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2);
	 				}
					({true}?=>(	otherlv_8='label:' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getItemAccess().getLabelKeyword_1_2_0());
    }
(
(
		lv_label_9_0=RULE_STRING
		{
			newLeafNode(lv_label_9_0, grammarAccess.getItemAccess().getLabelSTRINGTerminalRuleCall_1_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getItemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_9_0, 
        		"STRING");
	    }

)
)	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getItemAccess().getSemicolonKeyword_1_2_2());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3);
	 				}
					({true}?=>(	otherlv_11='title:' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getItemAccess().getTitleKeyword_1_3_0());
    }
(
(
		lv_title_12_0=RULE_STRING
		{
			newLeafNode(lv_title_12_0, grammarAccess.getItemAccess().getTitleSTRINGTerminalRuleCall_1_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getItemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"title",
        		lv_title_12_0, 
        		"STRING");
	    }

)
)	otherlv_13=';' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getItemAccess().getSemicolonKeyword_1_3_2());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4);
	 				}
					({true}?=>(	otherlv_14='icon:' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getItemAccess().getIconKeyword_1_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getItemAccess().getIconIconParserRuleCall_1_4_1_0()); 
	    }
		lv_icon_15_0=ruleIcon		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getItemRule());
	        }
       		set(
       			$current, 
       			"icon",
        		lv_icon_15_0, 
        		"Icon");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5);
	 				}
					({true}?=>(	otherlv_16='submenu:' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getItemAccess().getSubmenuKeyword_1_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getItemAccess().getMenuMenuParserRuleCall_1_5_1_0()); 
	    }
		lv_menu_17_0=ruleMenu		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getItemRule());
	        }
       		set(
       			$current, 
       			"menu",
        		lv_menu_17_0, 
        		"Menu");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getItemAccess().getUnorderedGroup_1())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getItemAccess().getUnorderedGroup_1());
	}

)	otherlv_18='}' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getItemAccess().getRightCurlyBracketKeyword_2());
    }
)
;





// Entry rule entryRuleIcon
entryRuleIcon returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIconRule()); }
	 iv_ruleIcon=ruleIcon 
	 { $current=$iv_ruleIcon.current; } 
	 EOF 
;

// Rule Icon
ruleIcon returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIconAccess().getLeftCurlyBracketKeyword_0());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getIconAccess().getUnorderedGroup_1());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0);
	 				}
					({true}?=>(	otherlv_2='id:' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getIconAccess().getIdKeyword_1_0_0());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getIconAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIconRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getIconAccess().getSemicolonKeyword_1_0_2());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1);
	 				}
					({true}?=>(	otherlv_5='position: ' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getIconAccess().getPositionKeyword_1_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIconAccess().getPositionPositionEnumRuleCall_1_1_1_0()); 
	    }
		lv_position_6_0=rulePosition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIconRule());
	        }
       		set(
       			$current, 
       			"position",
        		lv_position_6_0, 
        		"Position");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getIconAccess().getSemicolonKeyword_1_1_2());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2);
	 				}
					({true}?=>(	otherlv_8='text-alt:' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getIconAccess().getTextAltKeyword_1_2_0());
    }
(
(
		lv_text_alt_9_0=RULE_STRING
		{
			newLeafNode(lv_text_alt_9_0, grammarAccess.getIconAccess().getText_altSTRINGTerminalRuleCall_1_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIconRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text_alt",
        		lv_text_alt_9_0, 
        		"STRING");
	    }

)
)	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getIconAccess().getSemicolonKeyword_1_2_2());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3);
	 				}
					({true}?=>(	otherlv_11='address:' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getIconAccess().getAddressKeyword_1_3_0());
    }
(
(
		lv_address_12_0=RULE_STRING
		{
			newLeafNode(lv_address_12_0, grammarAccess.getIconAccess().getAddressSTRINGTerminalRuleCall_1_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIconRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"address",
        		lv_address_12_0, 
        		"STRING");
	    }

)
)	otherlv_13=';' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getIconAccess().getSemicolonKeyword_1_3_2());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4);
	 				}
					({true}?=>(
(
		{ 
	        newCompositeNode(grammarAccess.getIconAccess().getFeaturesFeatureParserRuleCall_1_4_0()); 
	    }
		lv_features_14_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIconRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_14_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
))+
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getIconAccess().getUnorderedGroup_1())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getIconAccess().getUnorderedGroup_1());
	}

)	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getIconAccess().getRightCurlyBracketKeyword_2());
    }
)
;





// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	 iv_ruleFeature=ruleFeature 
	 { $current=$iv_ruleFeature.current; } 
	 EOF 
;

// Rule Feature
ruleFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
    }
(
(
		lv_type_2_0=RULE_ID
		{
			newLeafNode(lv_type_2_0, grammarAccess.getFeatureAccess().getTypeIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"ID");
	    }

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getSemicolonKeyword_3());
    }
)
;





// Rule Visibility
ruleVisibility returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='true' 
	{
        $current = grammarAccess.getVisibilityAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getTrueEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='false' 
	{
        $current = grammarAccess.getVisibilityAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getFalseEnumLiteralDeclaration_1()); 
    }
));



// Rule Position
rulePosition returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='left' 
	{
        $current = grammarAccess.getPositionAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getPositionAccess().getLeftEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='right' 
	{
        $current = grammarAccess.getPositionAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getPositionAccess().getRightEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


