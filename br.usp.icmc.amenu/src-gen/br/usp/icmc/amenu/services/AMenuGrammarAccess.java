/*
* generated by Xtext
*/
package br.usp.icmc.amenu.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class AMenuGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MenuElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Menu");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1 = (UnorderedGroup)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cUnorderedGroup_1.eContents().get(0);
		private final Keyword cIdKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cNameAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0_1_0 = (RuleCall)cNameAssignment_1_0_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_0_2 = (Keyword)cGroup_1_0.eContents().get(2);
		private final Group cGroup_1_1 = (Group)cUnorderedGroup_1.eContents().get(1);
		private final Keyword cVisibilityKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cVisibilityAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cVisibilityVisibilityEnumRuleCall_1_1_1_0 = (RuleCall)cVisibilityAssignment_1_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_1_2 = (Keyword)cGroup_1_1.eContents().get(2);
		private final Group cGroup_1_2 = (Group)cUnorderedGroup_1.eContents().get(2);
		private final Keyword cItemsKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Group cGroup_1_2_1 = (Group)cGroup_1_2.eContents().get(1);
		private final Assignment cItemsAssignment_1_2_1_0 = (Assignment)cGroup_1_2_1.eContents().get(0);
		private final RuleCall cItemsItemParserRuleCall_1_2_1_0_0 = (RuleCall)cItemsAssignment_1_2_1_0.eContents().get(0);
		private final Group cGroup_1_2_1_1 = (Group)cGroup_1_2_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_2_1_1_0 = (Keyword)cGroup_1_2_1_1.eContents().get(0);
		private final Assignment cItemsAssignment_1_2_1_1_1 = (Assignment)cGroup_1_2_1_1.eContents().get(1);
		private final RuleCall cItemsItemParserRuleCall_1_2_1_1_1_0 = (RuleCall)cItemsAssignment_1_2_1_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2_2 = (Keyword)cGroup_1_2.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Menu:
		//	"{" (("id:" name=ID ";")? & ("visibility: " visibility=Visibility ";")? & "items: [" (items+=Item ("," items+=Item)*)
		//	"]") "}";
		public ParserRule getRule() { return rule; }

		//"{" (("id:" name=ID ";")? & ("visibility: " visibility=Visibility ";")? & "items: [" (items+=Item ("," items+=Item)*)
		//"]") "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//("id:" name=ID ";")? & ("visibility: " visibility=Visibility ";")? & "items: [" (items+=Item ("," items+=Item)*) "]"
		public UnorderedGroup getUnorderedGroup_1() { return cUnorderedGroup_1; }

		//("id:" name=ID ";")?
		public Group getGroup_1_0() { return cGroup_1_0; }

		//"id:"
		public Keyword getIdKeyword_1_0_0() { return cIdKeyword_1_0_0; }

		//name=ID
		public Assignment getNameAssignment_1_0_1() { return cNameAssignment_1_0_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_1_0() { return cNameIDTerminalRuleCall_1_0_1_0; }

		//";"
		public Keyword getSemicolonKeyword_1_0_2() { return cSemicolonKeyword_1_0_2; }

		//("visibility: " visibility=Visibility ";")?
		public Group getGroup_1_1() { return cGroup_1_1; }

		//"visibility: "
		public Keyword getVisibilityKeyword_1_1_0() { return cVisibilityKeyword_1_1_0; }

		//visibility=Visibility
		public Assignment getVisibilityAssignment_1_1_1() { return cVisibilityAssignment_1_1_1; }

		//Visibility
		public RuleCall getVisibilityVisibilityEnumRuleCall_1_1_1_0() { return cVisibilityVisibilityEnumRuleCall_1_1_1_0; }

		//";"
		public Keyword getSemicolonKeyword_1_1_2() { return cSemicolonKeyword_1_1_2; }

		//"items: [" (items+=Item ("," items+=Item)*) "]"
		public Group getGroup_1_2() { return cGroup_1_2; }

		//"items: ["
		public Keyword getItemsKeyword_1_2_0() { return cItemsKeyword_1_2_0; }

		//items+=Item ("," items+=Item)*
		public Group getGroup_1_2_1() { return cGroup_1_2_1; }

		//items+=Item
		public Assignment getItemsAssignment_1_2_1_0() { return cItemsAssignment_1_2_1_0; }

		//Item
		public RuleCall getItemsItemParserRuleCall_1_2_1_0_0() { return cItemsItemParserRuleCall_1_2_1_0_0; }

		//("," items+=Item)*
		public Group getGroup_1_2_1_1() { return cGroup_1_2_1_1; }

		//","
		public Keyword getCommaKeyword_1_2_1_1_0() { return cCommaKeyword_1_2_1_1_0; }

		//items+=Item
		public Assignment getItemsAssignment_1_2_1_1_1() { return cItemsAssignment_1_2_1_1_1; }

		//Item
		public RuleCall getItemsItemParserRuleCall_1_2_1_1_1_0() { return cItemsItemParserRuleCall_1_2_1_1_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_1_2_2() { return cRightSquareBracketKeyword_1_2_2; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}

	public class ItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Item");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1 = (UnorderedGroup)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cUnorderedGroup_1.eContents().get(0);
		private final Keyword cIdKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cNameAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0_1_0 = (RuleCall)cNameAssignment_1_0_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_0_2 = (Keyword)cGroup_1_0.eContents().get(2);
		private final Group cGroup_1_1 = (Group)cUnorderedGroup_1.eContents().get(1);
		private final Keyword cActionKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cActionAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cActionSTRINGTerminalRuleCall_1_1_1_0 = (RuleCall)cActionAssignment_1_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_1_2 = (Keyword)cGroup_1_1.eContents().get(2);
		private final Group cGroup_1_2 = (Group)cUnorderedGroup_1.eContents().get(2);
		private final Keyword cLabelKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cLabelAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cLabelSTRINGTerminalRuleCall_1_2_1_0 = (RuleCall)cLabelAssignment_1_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_2_2 = (Keyword)cGroup_1_2.eContents().get(2);
		private final Group cGroup_1_3 = (Group)cUnorderedGroup_1.eContents().get(3);
		private final Keyword cTitleKeyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final Assignment cTitleAssignment_1_3_1 = (Assignment)cGroup_1_3.eContents().get(1);
		private final RuleCall cTitleSTRINGTerminalRuleCall_1_3_1_0 = (RuleCall)cTitleAssignment_1_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_3_2 = (Keyword)cGroup_1_3.eContents().get(2);
		private final Group cGroup_1_4 = (Group)cUnorderedGroup_1.eContents().get(4);
		private final Keyword cIconKeyword_1_4_0 = (Keyword)cGroup_1_4.eContents().get(0);
		private final Assignment cIconAssignment_1_4_1 = (Assignment)cGroup_1_4.eContents().get(1);
		private final RuleCall cIconIconParserRuleCall_1_4_1_0 = (RuleCall)cIconAssignment_1_4_1.eContents().get(0);
		private final Group cGroup_1_5 = (Group)cUnorderedGroup_1.eContents().get(5);
		private final Keyword cSubmenuKeyword_1_5_0 = (Keyword)cGroup_1_5.eContents().get(0);
		private final Assignment cMenuAssignment_1_5_1 = (Assignment)cGroup_1_5.eContents().get(1);
		private final RuleCall cMenuMenuParserRuleCall_1_5_1_0 = (RuleCall)cMenuAssignment_1_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Item:
		//	"{" (("id:" name=ID ";")? & "action:" action=STRING ";" & "label:" label=STRING ";" & ("title:" title=STRING ";")? &
		//	("icon:" icon=Icon)? & ("submenu:" menu=Menu)?) "}";
		public ParserRule getRule() { return rule; }

		//"{" (("id:" name=ID ";")? & "action:" action=STRING ";" & "label:" label=STRING ";" & ("title:" title=STRING ";")? &
		//("icon:" icon=Icon)? & ("submenu:" menu=Menu)?) "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//("id:" name=ID ";")? & "action:" action=STRING ";" & "label:" label=STRING ";" & ("title:" title=STRING ";")? & ("icon:"
		//icon=Icon)? & ("submenu:" menu=Menu)?
		public UnorderedGroup getUnorderedGroup_1() { return cUnorderedGroup_1; }

		//("id:" name=ID ";")?
		public Group getGroup_1_0() { return cGroup_1_0; }

		//"id:"
		public Keyword getIdKeyword_1_0_0() { return cIdKeyword_1_0_0; }

		//name=ID
		public Assignment getNameAssignment_1_0_1() { return cNameAssignment_1_0_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_1_0() { return cNameIDTerminalRuleCall_1_0_1_0; }

		//";"
		public Keyword getSemicolonKeyword_1_0_2() { return cSemicolonKeyword_1_0_2; }

		//"action:" action=STRING ";"
		public Group getGroup_1_1() { return cGroup_1_1; }

		//"action:"
		public Keyword getActionKeyword_1_1_0() { return cActionKeyword_1_1_0; }

		//action=STRING
		public Assignment getActionAssignment_1_1_1() { return cActionAssignment_1_1_1; }

		//STRING
		public RuleCall getActionSTRINGTerminalRuleCall_1_1_1_0() { return cActionSTRINGTerminalRuleCall_1_1_1_0; }

		//";"
		public Keyword getSemicolonKeyword_1_1_2() { return cSemicolonKeyword_1_1_2; }

		//"label:" label=STRING ";"
		public Group getGroup_1_2() { return cGroup_1_2; }

		//"label:"
		public Keyword getLabelKeyword_1_2_0() { return cLabelKeyword_1_2_0; }

		//label=STRING
		public Assignment getLabelAssignment_1_2_1() { return cLabelAssignment_1_2_1; }

		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_1_2_1_0() { return cLabelSTRINGTerminalRuleCall_1_2_1_0; }

		//";"
		public Keyword getSemicolonKeyword_1_2_2() { return cSemicolonKeyword_1_2_2; }

		//("title:" title=STRING ";")?
		public Group getGroup_1_3() { return cGroup_1_3; }

		//"title:"
		public Keyword getTitleKeyword_1_3_0() { return cTitleKeyword_1_3_0; }

		//title=STRING
		public Assignment getTitleAssignment_1_3_1() { return cTitleAssignment_1_3_1; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_1_3_1_0() { return cTitleSTRINGTerminalRuleCall_1_3_1_0; }

		//";"
		public Keyword getSemicolonKeyword_1_3_2() { return cSemicolonKeyword_1_3_2; }

		//("icon:" icon=Icon)?
		public Group getGroup_1_4() { return cGroup_1_4; }

		//"icon:"
		public Keyword getIconKeyword_1_4_0() { return cIconKeyword_1_4_0; }

		//icon=Icon
		public Assignment getIconAssignment_1_4_1() { return cIconAssignment_1_4_1; }

		//Icon
		public RuleCall getIconIconParserRuleCall_1_4_1_0() { return cIconIconParserRuleCall_1_4_1_0; }

		//("submenu:" menu=Menu)?
		public Group getGroup_1_5() { return cGroup_1_5; }

		//"submenu:"
		public Keyword getSubmenuKeyword_1_5_0() { return cSubmenuKeyword_1_5_0; }

		//menu=Menu
		public Assignment getMenuAssignment_1_5_1() { return cMenuAssignment_1_5_1; }

		//Menu
		public RuleCall getMenuMenuParserRuleCall_1_5_1_0() { return cMenuMenuParserRuleCall_1_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}

	public class IconElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Icon");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1 = (UnorderedGroup)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cUnorderedGroup_1.eContents().get(0);
		private final Keyword cIdKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cNameAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0_1_0 = (RuleCall)cNameAssignment_1_0_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_0_2 = (Keyword)cGroup_1_0.eContents().get(2);
		private final Group cGroup_1_1 = (Group)cUnorderedGroup_1.eContents().get(1);
		private final Keyword cPositionKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cPositionAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cPositionPositionEnumRuleCall_1_1_1_0 = (RuleCall)cPositionAssignment_1_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_1_2 = (Keyword)cGroup_1_1.eContents().get(2);
		private final Group cGroup_1_2 = (Group)cUnorderedGroup_1.eContents().get(2);
		private final Keyword cTextAltKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cText_altAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cText_altSTRINGTerminalRuleCall_1_2_1_0 = (RuleCall)cText_altAssignment_1_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_2_2 = (Keyword)cGroup_1_2.eContents().get(2);
		private final Group cGroup_1_3 = (Group)cUnorderedGroup_1.eContents().get(3);
		private final Keyword cAddressKeyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final Assignment cAddressAssignment_1_3_1 = (Assignment)cGroup_1_3.eContents().get(1);
		private final RuleCall cAddressSTRINGTerminalRuleCall_1_3_1_0 = (RuleCall)cAddressAssignment_1_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_3_2 = (Keyword)cGroup_1_3.eContents().get(2);
		private final Assignment cFeaturesAssignment_1_4 = (Assignment)cUnorderedGroup_1.eContents().get(4);
		private final RuleCall cFeaturesFeatureParserRuleCall_1_4_0 = (RuleCall)cFeaturesAssignment_1_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Icon:
		//	"{" (("id:" name=ID ";")? & ("position: " position=Position ";")? & "text-alt:" text_alt=STRING ";" & "address:"
		//	address=STRING ";" & features+=Feature*) "}";
		public ParserRule getRule() { return rule; }

		//"{" (("id:" name=ID ";")? & ("position: " position=Position ";")? & "text-alt:" text_alt=STRING ";" & "address:"
		//address=STRING ";" & features+=Feature*) "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//("id:" name=ID ";")? & ("position: " position=Position ";")? & "text-alt:" text_alt=STRING ";" & "address:"
		//address=STRING ";" & features+=Feature*
		public UnorderedGroup getUnorderedGroup_1() { return cUnorderedGroup_1; }

		//("id:" name=ID ";")?
		public Group getGroup_1_0() { return cGroup_1_0; }

		//"id:"
		public Keyword getIdKeyword_1_0_0() { return cIdKeyword_1_0_0; }

		//name=ID
		public Assignment getNameAssignment_1_0_1() { return cNameAssignment_1_0_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_1_0() { return cNameIDTerminalRuleCall_1_0_1_0; }

		//";"
		public Keyword getSemicolonKeyword_1_0_2() { return cSemicolonKeyword_1_0_2; }

		//("position: " position=Position ";")?
		public Group getGroup_1_1() { return cGroup_1_1; }

		//"position: "
		public Keyword getPositionKeyword_1_1_0() { return cPositionKeyword_1_1_0; }

		//position=Position
		public Assignment getPositionAssignment_1_1_1() { return cPositionAssignment_1_1_1; }

		//Position
		public RuleCall getPositionPositionEnumRuleCall_1_1_1_0() { return cPositionPositionEnumRuleCall_1_1_1_0; }

		//";"
		public Keyword getSemicolonKeyword_1_1_2() { return cSemicolonKeyword_1_1_2; }

		//"text-alt:" text_alt=STRING ";"
		public Group getGroup_1_2() { return cGroup_1_2; }

		//"text-alt:"
		public Keyword getTextAltKeyword_1_2_0() { return cTextAltKeyword_1_2_0; }

		//text_alt=STRING
		public Assignment getText_altAssignment_1_2_1() { return cText_altAssignment_1_2_1; }

		//STRING
		public RuleCall getText_altSTRINGTerminalRuleCall_1_2_1_0() { return cText_altSTRINGTerminalRuleCall_1_2_1_0; }

		//";"
		public Keyword getSemicolonKeyword_1_2_2() { return cSemicolonKeyword_1_2_2; }

		//"address:" address=STRING ";"
		public Group getGroup_1_3() { return cGroup_1_3; }

		//"address:"
		public Keyword getAddressKeyword_1_3_0() { return cAddressKeyword_1_3_0; }

		//address=STRING
		public Assignment getAddressAssignment_1_3_1() { return cAddressAssignment_1_3_1; }

		//STRING
		public RuleCall getAddressSTRINGTerminalRuleCall_1_3_1_0() { return cAddressSTRINGTerminalRuleCall_1_3_1_0; }

		//";"
		public Keyword getSemicolonKeyword_1_3_2() { return cSemicolonKeyword_1_3_2; }

		//features+=Feature*
		public Assignment getFeaturesAssignment_1_4() { return cFeaturesAssignment_1_4; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_1_4_0() { return cFeaturesFeatureParserRuleCall_1_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeIDTerminalRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Feature:
		//	name=ID ":" type=ID ";";
		public ParserRule getRule() { return rule; }

		//name=ID ":" type=ID ";"
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//type=ID
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//ID
		public RuleCall getTypeIDTerminalRuleCall_2_0() { return cTypeIDTerminalRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	
	
	public class VisibilityElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Visibility");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTrueEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTrueTrueKeyword_0_0 = (Keyword)cTrueEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFalseEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFalseFalseKeyword_1_0 = (Keyword)cFalseEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Visibility:
		//	true | false;
		public EnumRule getRule() { return rule; }

		//true | false
		public Alternatives getAlternatives() { return cAlternatives; }

		//true
		public EnumLiteralDeclaration getTrueEnumLiteralDeclaration_0() { return cTrueEnumLiteralDeclaration_0; }

		//"true"
		public Keyword getTrueTrueKeyword_0_0() { return cTrueTrueKeyword_0_0; }

		//false
		public EnumLiteralDeclaration getFalseEnumLiteralDeclaration_1() { return cFalseEnumLiteralDeclaration_1; }

		//"false"
		public Keyword getFalseFalseKeyword_1_0() { return cFalseFalseKeyword_1_0; }
	}

	public class PositionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Position");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLeftEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLeftLeftKeyword_0_0 = (Keyword)cLeftEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cRightEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cRightRightKeyword_1_0 = (Keyword)cRightEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Position:
		//	left | right;
		public EnumRule getRule() { return rule; }

		//left | right
		public Alternatives getAlternatives() { return cAlternatives; }

		//left
		public EnumLiteralDeclaration getLeftEnumLiteralDeclaration_0() { return cLeftEnumLiteralDeclaration_0; }

		//"left"
		public Keyword getLeftLeftKeyword_0_0() { return cLeftLeftKeyword_0_0; }

		//right
		public EnumLiteralDeclaration getRightEnumLiteralDeclaration_1() { return cRightEnumLiteralDeclaration_1; }

		//"right"
		public Keyword getRightRightKeyword_1_0() { return cRightRightKeyword_1_0; }
	}
	
	private final MenuElements pMenu;
	private final ItemElements pItem;
	private final IconElements pIcon;
	private final FeatureElements pFeature;
	private final VisibilityElements unknownRuleVisibility;
	private final PositionElements unknownRulePosition;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AMenuGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMenu = new MenuElements();
		this.pItem = new ItemElements();
		this.pIcon = new IconElements();
		this.pFeature = new FeatureElements();
		this.unknownRuleVisibility = new VisibilityElements();
		this.unknownRulePosition = new PositionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("br.usp.icmc.amenu.AMenu".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Menu:
	//	"{" (("id:" name=ID ";")? & ("visibility: " visibility=Visibility ";")? & "items: [" (items+=Item ("," items+=Item)*)
	//	"]") "}";
	public MenuElements getMenuAccess() {
		return pMenu;
	}
	
	public ParserRule getMenuRule() {
		return getMenuAccess().getRule();
	}

	//Item:
	//	"{" (("id:" name=ID ";")? & "action:" action=STRING ";" & "label:" label=STRING ";" & ("title:" title=STRING ";")? &
	//	("icon:" icon=Icon)? & ("submenu:" menu=Menu)?) "}";
	public ItemElements getItemAccess() {
		return pItem;
	}
	
	public ParserRule getItemRule() {
		return getItemAccess().getRule();
	}

	//Icon:
	//	"{" (("id:" name=ID ";")? & ("position: " position=Position ";")? & "text-alt:" text_alt=STRING ";" & "address:"
	//	address=STRING ";" & features+=Feature*) "}";
	public IconElements getIconAccess() {
		return pIcon;
	}
	
	public ParserRule getIconRule() {
		return getIconAccess().getRule();
	}

	//Feature:
	//	name=ID ":" type=ID ";";
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//enum Visibility:
	//	true | false;
	public VisibilityElements getVisibilityAccess() {
		return unknownRuleVisibility;
	}
	
	public EnumRule getVisibilityRule() {
		return getVisibilityAccess().getRule();
	}

	//enum Position:
	//	left | right;
	public PositionElements getPositionAccess() {
		return unknownRulePosition;
	}
	
	public EnumRule getPositionRule() {
		return getPositionAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
