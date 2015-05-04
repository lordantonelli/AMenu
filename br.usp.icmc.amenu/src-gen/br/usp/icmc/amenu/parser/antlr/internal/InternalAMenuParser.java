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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAMenuParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FEATURE", "RULE_COLOR", "RULE_HEX", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'id'", "'='", "';'", "'type'", "'style'", "'position'", "'class'", "'config'", "'['", "']'", "'items'", "','", "'top'", "'children'", "'-'", "'{'", "'action'", "'label'", "'title'", "'dir'", "'target'", "'icon'", "'submenu'", "'}'", "'text-alt'", "'address'", "'dropdown'", "'flyout'", "'accordion'", "'simple'", "'complex'", "'center'", "'left'", "'right'", "'ltr'", "'rlt'", "'auto'", "'_self'", "'_blank'", "'_parent'", "'_top'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_COLOR=7;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_HEX=8;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_INT=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_FEATURE=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalAMenuParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAMenuParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAMenuParser.tokenNames; }
    public String getGrammarFileName() { return "../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g"; }



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



    // $ANTLR start "entryRuleMenu"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:68:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:69:2: (iv_ruleMenu= ruleMenu EOF )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:70:2: iv_ruleMenu= ruleMenu EOF
            {
             newCompositeNode(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_ruleMenu_in_entryRuleMenu75);
            iv_ruleMenu=ruleMenu();

            state._fsp--;

             current =iv_ruleMenu; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMenu85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:77:1: ruleMenu returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_decorator_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Enumerator lv_type_7_0 = null;

        Enumerator lv_style_11_0 = null;

        Enumerator lv_position_15_0 = null;

        EObject lv_configuration_24_0 = null;

        EObject lv_items_30_0 = null;

        EObject lv_items_32_0 = null;


         enterRule(); 
            
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:80:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:81:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:81:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) ) ) )+ {...}?) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:83:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) ) ) )+ {...}?) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:83:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) ) ) )+ {...}?) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:84:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMenuAccess().getUnorderedGroup());
            	
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:87:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) ) ) )+ {...}?)
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:88:3: ( ({...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) ) ) )+ {...}?
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:88:3: ( ({...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=8;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 3) ) {
                    alt2=4;
                }
                else if ( LA2_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 4) ) {
                    alt2=5;
                }
                else if ( LA2_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 5) ) {
                    alt2=6;
                }
                else if ( LA2_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 6) ) {
                    alt2=7;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:90:4: ({...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:90:4: ({...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:91:5: {...}? => ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:91:99: ( ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:92:6: ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:95:6: ({...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:95:7: {...}? => (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:95:16: (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:95:18: otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMenu167); 

            	        	newLeafNode(otherlv_1, grammarAccess.getMenuAccess().getIdKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMenu179); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMenuAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:103:1: ( (lv_name_3_0= RULE_ID ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:104:1: (lv_name_3_0= RULE_ID )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:104:1: (lv_name_3_0= RULE_ID )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:105:3: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMenu196); 

            	    			newLeafNode(lv_name_3_0, grammarAccess.getMenuAccess().getNameIDTerminalRuleCall_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMenuRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleMenu213); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:132:4: ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:132:4: ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:133:5: {...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:133:99: ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:134:6: ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:137:6: ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:137:7: {...}? => (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:137:16: (otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:137:18: otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleMenu281); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMenuAccess().getTypeKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMenu293); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMenuAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:145:1: ( (lv_type_7_0= ruleType ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:146:1: (lv_type_7_0= ruleType )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:146:1: (lv_type_7_0= ruleType )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:147:3: lv_type_7_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMenuAccess().getTypeTypeEnumRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleMenu314);
            	    lv_type_7_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"type",
            	            		lv_type_7_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleMenu326); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMenuAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:174:4: ({...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:174:4: ({...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:175:5: {...}? => ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:175:99: ( ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:176:6: ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:179:6: ({...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:179:7: {...}? => (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:179:16: (otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:179:18: otherlv_9= 'style' otherlv_10= '=' ( (lv_style_11_0= ruleStyle ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleMenu394); 

            	        	newLeafNode(otherlv_9, grammarAccess.getMenuAccess().getStyleKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleMenu406); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMenuAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:187:1: ( (lv_style_11_0= ruleStyle ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:188:1: (lv_style_11_0= ruleStyle )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:188:1: (lv_style_11_0= ruleStyle )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:189:3: lv_style_11_0= ruleStyle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMenuAccess().getStyleStyleEnumRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyle_in_ruleMenu427);
            	    lv_style_11_0=ruleStyle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"style",
            	            		lv_style_11_0, 
            	            		"Style");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleMenu439); 

            	        	newLeafNode(otherlv_12, grammarAccess.getMenuAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:216:4: ({...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:216:4: ({...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:217:5: {...}? => ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:217:99: ( ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:218:6: ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:221:6: ({...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:221:7: {...}? => (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:221:16: (otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:221:18: otherlv_13= 'position' otherlv_14= '=' ( (lv_position_15_0= rulePosition ) ) otherlv_16= ';'
            	    {
            	    otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleMenu507); 

            	        	newLeafNode(otherlv_13, grammarAccess.getMenuAccess().getPositionKeyword_3_0());
            	        
            	    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleMenu519); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMenuAccess().getEqualsSignKeyword_3_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:229:1: ( (lv_position_15_0= rulePosition ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:230:1: (lv_position_15_0= rulePosition )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:230:1: (lv_position_15_0= rulePosition )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:231:3: lv_position_15_0= rulePosition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMenuAccess().getPositionPositionEnumRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePosition_in_ruleMenu540);
            	    lv_position_15_0=rulePosition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"position",
            	            		lv_position_15_0, 
            	            		"Position");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleMenu552); 

            	        	newLeafNode(otherlv_16, grammarAccess.getMenuAccess().getSemicolonKeyword_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:258:4: ({...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:258:4: ({...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:259:5: {...}? => ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 4)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:259:99: ( ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:260:6: ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:263:6: ({...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:263:7: {...}? => (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:263:16: (otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:263:18: otherlv_17= 'class' otherlv_18= '=' ( (lv_decorator_19_0= RULE_STRING ) ) otherlv_20= ';'
            	    {
            	    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleMenu620); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMenuAccess().getClassKeyword_4_0());
            	        
            	    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleMenu632); 

            	        	newLeafNode(otherlv_18, grammarAccess.getMenuAccess().getEqualsSignKeyword_4_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:271:1: ( (lv_decorator_19_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:272:1: (lv_decorator_19_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:272:1: (lv_decorator_19_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:273:3: lv_decorator_19_0= RULE_STRING
            	    {
            	    lv_decorator_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMenu649); 

            	    			newLeafNode(lv_decorator_19_0, grammarAccess.getMenuAccess().getDecoratorSTRINGTerminalRuleCall_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMenuRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"decorator",
            	            		lv_decorator_19_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_20=(Token)match(input,16,FOLLOW_16_in_ruleMenu666); 

            	        	newLeafNode(otherlv_20, grammarAccess.getMenuAccess().getSemicolonKeyword_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:300:4: ({...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:300:4: ({...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:301:5: {...}? => ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 5)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:301:99: ( ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:302:6: ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 5);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:305:6: ({...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:305:7: {...}? => (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:305:16: (otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:305:18: otherlv_21= 'config' otherlv_22= '=' otherlv_23= '[' ( (lv_configuration_24_0= ruleConfigurations ) ) otherlv_25= ']' otherlv_26= ';'
            	    {
            	    otherlv_21=(Token)match(input,21,FOLLOW_21_in_ruleMenu734); 

            	        	newLeafNode(otherlv_21, grammarAccess.getMenuAccess().getConfigKeyword_5_0());
            	        
            	    otherlv_22=(Token)match(input,15,FOLLOW_15_in_ruleMenu746); 

            	        	newLeafNode(otherlv_22, grammarAccess.getMenuAccess().getEqualsSignKeyword_5_1());
            	        
            	    otherlv_23=(Token)match(input,22,FOLLOW_22_in_ruleMenu758); 

            	        	newLeafNode(otherlv_23, grammarAccess.getMenuAccess().getLeftSquareBracketKeyword_5_2());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:317:1: ( (lv_configuration_24_0= ruleConfigurations ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:318:1: (lv_configuration_24_0= ruleConfigurations )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:318:1: (lv_configuration_24_0= ruleConfigurations )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:319:3: lv_configuration_24_0= ruleConfigurations
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMenuAccess().getConfigurationConfigurationsParserRuleCall_5_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConfigurations_in_ruleMenu779);
            	    lv_configuration_24_0=ruleConfigurations();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"configuration",
            	            		lv_configuration_24_0, 
            	            		"Configurations");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_25=(Token)match(input,23,FOLLOW_23_in_ruleMenu791); 

            	        	newLeafNode(otherlv_25, grammarAccess.getMenuAccess().getRightSquareBracketKeyword_5_4());
            	        
            	    otherlv_26=(Token)match(input,16,FOLLOW_16_in_ruleMenu803); 

            	        	newLeafNode(otherlv_26, grammarAccess.getMenuAccess().getSemicolonKeyword_5_5());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:350:4: ({...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:350:4: ({...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:351:5: {...}? => ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 6)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:351:99: ( ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:352:6: ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 6);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:355:6: ({...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:355:7: {...}? => (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:355:16: (otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:355:18: otherlv_27= 'items' otherlv_28= '=' otherlv_29= '[' ( (lv_items_30_0= ruleItem ) ) (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )* otherlv_33= ']' otherlv_34= ';'
            	    {
            	    otherlv_27=(Token)match(input,24,FOLLOW_24_in_ruleMenu871); 

            	        	newLeafNode(otherlv_27, grammarAccess.getMenuAccess().getItemsKeyword_6_0());
            	        
            	    otherlv_28=(Token)match(input,15,FOLLOW_15_in_ruleMenu883); 

            	        	newLeafNode(otherlv_28, grammarAccess.getMenuAccess().getEqualsSignKeyword_6_1());
            	        
            	    otherlv_29=(Token)match(input,22,FOLLOW_22_in_ruleMenu895); 

            	        	newLeafNode(otherlv_29, grammarAccess.getMenuAccess().getLeftSquareBracketKeyword_6_2());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:367:1: ( (lv_items_30_0= ruleItem ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:368:1: (lv_items_30_0= ruleItem )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:368:1: (lv_items_30_0= ruleItem )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:369:3: lv_items_30_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMenuAccess().getItemsItemParserRuleCall_6_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleMenu916);
            	    lv_items_30_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_30_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:385:2: (otherlv_31= ',' ( (lv_items_32_0= ruleItem ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==25) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:385:4: otherlv_31= ',' ( (lv_items_32_0= ruleItem ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,25,FOLLOW_25_in_ruleMenu929); 

            	    	        	newLeafNode(otherlv_31, grammarAccess.getMenuAccess().getCommaKeyword_6_4_0());
            	    	        
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:389:1: ( (lv_items_32_0= ruleItem ) )
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:390:1: (lv_items_32_0= ruleItem )
            	    	    {
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:390:1: (lv_items_32_0= ruleItem )
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:391:3: lv_items_32_0= ruleItem
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getMenuAccess().getItemsItemParserRuleCall_6_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleItem_in_ruleMenu950);
            	    	    lv_items_32_0=ruleItem();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"items",
            	    	            		lv_items_32_0, 
            	    	            		"Item");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,23,FOLLOW_23_in_ruleMenu964); 

            	        	newLeafNode(otherlv_33, grammarAccess.getMenuAccess().getRightSquareBracketKeyword_6_5());
            	        
            	    otherlv_34=(Token)match(input,16,FOLLOW_16_in_ruleMenu976); 

            	        	newLeafNode(otherlv_34, grammarAccess.getMenuAccess().getSemicolonKeyword_6_6());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMenuAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleMenu", "getUnorderedGroupHelper().canLeave(grammarAccess.getMenuAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMenuAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleConfigurations"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:438:1: entryRuleConfigurations returns [EObject current=null] : iv_ruleConfigurations= ruleConfigurations EOF ;
    public final EObject entryRuleConfigurations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurations = null;


        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:439:2: (iv_ruleConfigurations= ruleConfigurations EOF )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:440:2: iv_ruleConfigurations= ruleConfigurations EOF
            {
             newCompositeNode(grammarAccess.getConfigurationsRule()); 
            pushFollow(FOLLOW_ruleConfigurations_in_entryRuleConfigurations1058);
            iv_ruleConfigurations=ruleConfigurations();

            state._fsp--;

             current =iv_ruleConfigurations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurations1068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigurations"


    // $ANTLR start "ruleConfigurations"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:447:1: ruleConfigurations returns [EObject current=null] : ( ( (otherlv_0= 'top' ( (lv_config_top_1_0= ruleConfig ) ) ) | (otherlv_2= 'children' ( (lv_config_children_3_0= ruleConfig ) ) ) ) ( (otherlv_4= ',' otherlv_5= 'top' ( (lv_config_top_6_0= ruleConfig ) ) ) | (otherlv_7= ',' otherlv_8= 'children' ( (lv_config_children_9_0= ruleConfig ) ) ) )* ) ;
    public final EObject ruleConfigurations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_config_top_1_0 = null;

        EObject lv_config_children_3_0 = null;

        EObject lv_config_top_6_0 = null;

        EObject lv_config_children_9_0 = null;


         enterRule(); 
            
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:450:28: ( ( ( (otherlv_0= 'top' ( (lv_config_top_1_0= ruleConfig ) ) ) | (otherlv_2= 'children' ( (lv_config_children_3_0= ruleConfig ) ) ) ) ( (otherlv_4= ',' otherlv_5= 'top' ( (lv_config_top_6_0= ruleConfig ) ) ) | (otherlv_7= ',' otherlv_8= 'children' ( (lv_config_children_9_0= ruleConfig ) ) ) )* ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:451:1: ( ( (otherlv_0= 'top' ( (lv_config_top_1_0= ruleConfig ) ) ) | (otherlv_2= 'children' ( (lv_config_children_3_0= ruleConfig ) ) ) ) ( (otherlv_4= ',' otherlv_5= 'top' ( (lv_config_top_6_0= ruleConfig ) ) ) | (otherlv_7= ',' otherlv_8= 'children' ( (lv_config_children_9_0= ruleConfig ) ) ) )* )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:451:1: ( ( (otherlv_0= 'top' ( (lv_config_top_1_0= ruleConfig ) ) ) | (otherlv_2= 'children' ( (lv_config_children_3_0= ruleConfig ) ) ) ) ( (otherlv_4= ',' otherlv_5= 'top' ( (lv_config_top_6_0= ruleConfig ) ) ) | (otherlv_7= ',' otherlv_8= 'children' ( (lv_config_children_9_0= ruleConfig ) ) ) )* )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:451:2: ( (otherlv_0= 'top' ( (lv_config_top_1_0= ruleConfig ) ) ) | (otherlv_2= 'children' ( (lv_config_children_3_0= ruleConfig ) ) ) ) ( (otherlv_4= ',' otherlv_5= 'top' ( (lv_config_top_6_0= ruleConfig ) ) ) | (otherlv_7= ',' otherlv_8= 'children' ( (lv_config_children_9_0= ruleConfig ) ) ) )*
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:451:2: ( (otherlv_0= 'top' ( (lv_config_top_1_0= ruleConfig ) ) ) | (otherlv_2= 'children' ( (lv_config_children_3_0= ruleConfig ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:451:3: (otherlv_0= 'top' ( (lv_config_top_1_0= ruleConfig ) ) )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:451:3: (otherlv_0= 'top' ( (lv_config_top_1_0= ruleConfig ) ) )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:451:5: otherlv_0= 'top' ( (lv_config_top_1_0= ruleConfig ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleConfigurations1107); 

                        	newLeafNode(otherlv_0, grammarAccess.getConfigurationsAccess().getTopKeyword_0_0_0());
                        
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:455:1: ( (lv_config_top_1_0= ruleConfig ) )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:456:1: (lv_config_top_1_0= ruleConfig )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:456:1: (lv_config_top_1_0= ruleConfig )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:457:3: lv_config_top_1_0= ruleConfig
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationsAccess().getConfig_topConfigParserRuleCall_0_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConfig_in_ruleConfigurations1128);
                    lv_config_top_1_0=ruleConfig();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationsRule());
                    	        }
                           		add(
                           			current, 
                           			"config_top",
                            		lv_config_top_1_0, 
                            		"Config");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:474:6: (otherlv_2= 'children' ( (lv_config_children_3_0= ruleConfig ) ) )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:474:6: (otherlv_2= 'children' ( (lv_config_children_3_0= ruleConfig ) ) )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:474:8: otherlv_2= 'children' ( (lv_config_children_3_0= ruleConfig ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleConfigurations1148); 

                        	newLeafNode(otherlv_2, grammarAccess.getConfigurationsAccess().getChildrenKeyword_0_1_0());
                        
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:478:1: ( (lv_config_children_3_0= ruleConfig ) )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:479:1: (lv_config_children_3_0= ruleConfig )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:479:1: (lv_config_children_3_0= ruleConfig )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:480:3: lv_config_children_3_0= ruleConfig
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationsAccess().getConfig_childrenConfigParserRuleCall_0_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConfig_in_ruleConfigurations1169);
                    lv_config_children_3_0=ruleConfig();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationsRule());
                    	        }
                           		add(
                           			current, 
                           			"config_children",
                            		lv_config_children_3_0, 
                            		"Config");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:496:4: ( (otherlv_4= ',' otherlv_5= 'top' ( (lv_config_top_6_0= ruleConfig ) ) ) | (otherlv_7= ',' otherlv_8= 'children' ( (lv_config_children_9_0= ruleConfig ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==27) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==26) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:496:5: (otherlv_4= ',' otherlv_5= 'top' ( (lv_config_top_6_0= ruleConfig ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:496:5: (otherlv_4= ',' otherlv_5= 'top' ( (lv_config_top_6_0= ruleConfig ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:496:7: otherlv_4= ',' otherlv_5= 'top' ( (lv_config_top_6_0= ruleConfig ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleConfigurations1185); 

            	        	newLeafNode(otherlv_4, grammarAccess.getConfigurationsAccess().getCommaKeyword_1_0_0());
            	        
            	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleConfigurations1197); 

            	        	newLeafNode(otherlv_5, grammarAccess.getConfigurationsAccess().getTopKeyword_1_0_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:504:1: ( (lv_config_top_6_0= ruleConfig ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:505:1: (lv_config_top_6_0= ruleConfig )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:505:1: (lv_config_top_6_0= ruleConfig )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:506:3: lv_config_top_6_0= ruleConfig
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfigurationsAccess().getConfig_topConfigParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConfig_in_ruleConfigurations1218);
            	    lv_config_top_6_0=ruleConfig();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConfigurationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"config_top",
            	            		lv_config_top_6_0, 
            	            		"Config");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:523:6: (otherlv_7= ',' otherlv_8= 'children' ( (lv_config_children_9_0= ruleConfig ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:523:6: (otherlv_7= ',' otherlv_8= 'children' ( (lv_config_children_9_0= ruleConfig ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:523:8: otherlv_7= ',' otherlv_8= 'children' ( (lv_config_children_9_0= ruleConfig ) )
            	    {
            	    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleConfigurations1238); 

            	        	newLeafNode(otherlv_7, grammarAccess.getConfigurationsAccess().getCommaKeyword_1_1_0());
            	        
            	    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleConfigurations1250); 

            	        	newLeafNode(otherlv_8, grammarAccess.getConfigurationsAccess().getChildrenKeyword_1_1_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:531:1: ( (lv_config_children_9_0= ruleConfig ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:532:1: (lv_config_children_9_0= ruleConfig )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:532:1: (lv_config_children_9_0= ruleConfig )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:533:3: lv_config_children_9_0= ruleConfig
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfigurationsAccess().getConfig_childrenConfigParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConfig_in_ruleConfigurations1271);
            	    lv_config_children_9_0=ruleConfig();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConfigurationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"config_children",
            	            		lv_config_children_9_0, 
            	            		"Config");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigurations"


    // $ANTLR start "entryRuleConfig"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:557:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:558:2: (iv_ruleConfig= ruleConfig EOF )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:559:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_ruleConfig_in_entryRuleConfig1310);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfig1320); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:566:1: ruleConfig returns [EObject current=null] : (otherlv_0= '-' ( (lv_feature_1_0= RULE_FEATURE ) ) otherlv_2= '=' ( (lv_color_3_0= RULE_COLOR ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_feature_1_0=null;
        Token otherlv_2=null;
        Token lv_color_3_0=null;

         enterRule(); 
            
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:569:28: ( (otherlv_0= '-' ( (lv_feature_1_0= RULE_FEATURE ) ) otherlv_2= '=' ( (lv_color_3_0= RULE_COLOR ) ) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:570:1: (otherlv_0= '-' ( (lv_feature_1_0= RULE_FEATURE ) ) otherlv_2= '=' ( (lv_color_3_0= RULE_COLOR ) ) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:570:1: (otherlv_0= '-' ( (lv_feature_1_0= RULE_FEATURE ) ) otherlv_2= '=' ( (lv_color_3_0= RULE_COLOR ) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:570:3: otherlv_0= '-' ( (lv_feature_1_0= RULE_FEATURE ) ) otherlv_2= '=' ( (lv_color_3_0= RULE_COLOR ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleConfig1357); 

                	newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getHyphenMinusKeyword_0());
                
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:574:1: ( (lv_feature_1_0= RULE_FEATURE ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:575:1: (lv_feature_1_0= RULE_FEATURE )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:575:1: (lv_feature_1_0= RULE_FEATURE )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:576:3: lv_feature_1_0= RULE_FEATURE
            {
            lv_feature_1_0=(Token)match(input,RULE_FEATURE,FOLLOW_RULE_FEATURE_in_ruleConfig1374); 

            			newLeafNode(lv_feature_1_0, grammarAccess.getConfigAccess().getFeatureFEATURETerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"feature",
                    		lv_feature_1_0, 
                    		"FEATURE");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleConfig1391); 

                	newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getEqualsSignKeyword_2());
                
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:596:1: ( (lv_color_3_0= RULE_COLOR ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:597:1: (lv_color_3_0= RULE_COLOR )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:597:1: (lv_color_3_0= RULE_COLOR )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:598:3: lv_color_3_0= RULE_COLOR
            {
            lv_color_3_0=(Token)match(input,RULE_COLOR,FOLLOW_RULE_COLOR_in_ruleConfig1408); 

            			newLeafNode(lv_color_3_0, grammarAccess.getConfigAccess().getColorCOLORTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"color",
                    		lv_color_3_0, 
                    		"COLOR");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleItem"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:622:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:623:2: (iv_ruleItem= ruleItem EOF )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:624:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem1449);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem1459); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:631:1: ruleItem returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+ {...}?) ) ) otherlv_38= '}' ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_decorator_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_action_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_label_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_title_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Enumerator lv_direction_24_0 = null;

        Enumerator lv_target_28_0 = null;

        EObject lv_icon_32_0 = null;

        EObject lv_submenu_36_0 = null;


         enterRule(); 
            
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:634:28: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+ {...}?) ) ) otherlv_38= '}' ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:635:1: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+ {...}?) ) ) otherlv_38= '}' )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:635:1: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+ {...}?) ) ) otherlv_38= '}' )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:635:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+ {...}?) ) ) otherlv_38= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleItem1496); 

                	newLeafNode(otherlv_0, grammarAccess.getItemAccess().getLeftCurlyBracketKeyword_0());
                
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:639:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+ {...}?) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:641:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+ {...}?) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:641:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+ {...}?) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:642:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:645:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+ {...}?)
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:646:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+ {...}?
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:646:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=10;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:648:4: ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:648:4: ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:649:5: {...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:649:101: ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:650:6: ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:653:6: ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:653:7: {...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:653:16: (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:653:18: otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';'
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleItem1554); 

            	        	newLeafNode(otherlv_2, grammarAccess.getItemAccess().getIdKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleItem1566); 

            	        	newLeafNode(otherlv_3, grammarAccess.getItemAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:661:1: ( (lv_name_4_0= RULE_ID ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:662:1: (lv_name_4_0= RULE_ID )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:662:1: (lv_name_4_0= RULE_ID )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:663:3: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleItem1583); 

            	    			newLeafNode(lv_name_4_0, grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getItemRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleItem1600); 

            	        	newLeafNode(otherlv_5, grammarAccess.getItemAccess().getSemicolonKeyword_1_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:690:4: ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:690:4: ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:691:5: {...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:691:101: ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:692:6: ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:695:6: ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:695:7: {...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:695:16: (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:695:18: otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';'
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleItem1668); 

            	        	newLeafNode(otherlv_6, grammarAccess.getItemAccess().getClassKeyword_1_1_0());
            	        
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleItem1680); 

            	        	newLeafNode(otherlv_7, grammarAccess.getItemAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:703:1: ( (lv_decorator_8_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:704:1: (lv_decorator_8_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:704:1: (lv_decorator_8_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:705:3: lv_decorator_8_0= RULE_STRING
            	    {
            	    lv_decorator_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItem1697); 

            	    			newLeafNode(lv_decorator_8_0, grammarAccess.getItemAccess().getDecoratorSTRINGTerminalRuleCall_1_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getItemRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"decorator",
            	            		lv_decorator_8_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleItem1714); 

            	        	newLeafNode(otherlv_9, grammarAccess.getItemAccess().getSemicolonKeyword_1_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:732:4: ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:732:4: ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:733:5: {...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:733:101: ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:734:6: ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:737:6: ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:737:7: {...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:737:16: (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:737:18: otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';'
            	    {
            	    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleItem1782); 

            	        	newLeafNode(otherlv_10, grammarAccess.getItemAccess().getActionKeyword_1_2_0());
            	        
            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleItem1794); 

            	        	newLeafNode(otherlv_11, grammarAccess.getItemAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:745:1: ( (lv_action_12_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:746:1: (lv_action_12_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:746:1: (lv_action_12_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:747:3: lv_action_12_0= RULE_STRING
            	    {
            	    lv_action_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItem1811); 

            	    			newLeafNode(lv_action_12_0, grammarAccess.getItemAccess().getActionSTRINGTerminalRuleCall_1_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getItemRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"action",
            	            		lv_action_12_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleItem1828); 

            	        	newLeafNode(otherlv_13, grammarAccess.getItemAccess().getSemicolonKeyword_1_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:774:4: ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:774:4: ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:775:5: {...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:775:101: ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:776:6: ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:779:6: ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:779:7: {...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:779:16: (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:779:18: otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';'
            	    {
            	    otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleItem1896); 

            	        	newLeafNode(otherlv_14, grammarAccess.getItemAccess().getLabelKeyword_1_3_0());
            	        
            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleItem1908); 

            	        	newLeafNode(otherlv_15, grammarAccess.getItemAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:787:1: ( (lv_label_16_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:788:1: (lv_label_16_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:788:1: (lv_label_16_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:789:3: lv_label_16_0= RULE_STRING
            	    {
            	    lv_label_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItem1925); 

            	    			newLeafNode(lv_label_16_0, grammarAccess.getItemAccess().getLabelSTRINGTerminalRuleCall_1_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getItemRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"label",
            	            		lv_label_16_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleItem1942); 

            	        	newLeafNode(otherlv_17, grammarAccess.getItemAccess().getSemicolonKeyword_1_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:816:4: ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:816:4: ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:817:5: {...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:817:101: ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:818:6: ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:821:6: ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:821:7: {...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:821:16: (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:821:18: otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';'
            	    {
            	    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleItem2010); 

            	        	newLeafNode(otherlv_18, grammarAccess.getItemAccess().getTitleKeyword_1_4_0());
            	        
            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleItem2022); 

            	        	newLeafNode(otherlv_19, grammarAccess.getItemAccess().getEqualsSignKeyword_1_4_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:829:1: ( (lv_title_20_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:830:1: (lv_title_20_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:830:1: (lv_title_20_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:831:3: lv_title_20_0= RULE_STRING
            	    {
            	    lv_title_20_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItem2039); 

            	    			newLeafNode(lv_title_20_0, grammarAccess.getItemAccess().getTitleSTRINGTerminalRuleCall_1_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getItemRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"title",
            	            		lv_title_20_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleItem2056); 

            	        	newLeafNode(otherlv_21, grammarAccess.getItemAccess().getSemicolonKeyword_1_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:858:4: ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:858:4: ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:859:5: {...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:859:101: ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:860:6: ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:863:6: ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:863:7: {...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:863:16: (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:863:18: otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';'
            	    {
            	    otherlv_22=(Token)match(input,33,FOLLOW_33_in_ruleItem2124); 

            	        	newLeafNode(otherlv_22, grammarAccess.getItemAccess().getDirKeyword_1_5_0());
            	        
            	    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleItem2136); 

            	        	newLeafNode(otherlv_23, grammarAccess.getItemAccess().getEqualsSignKeyword_1_5_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:871:1: ( (lv_direction_24_0= ruleDirection ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:872:1: (lv_direction_24_0= ruleDirection )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:872:1: (lv_direction_24_0= ruleDirection )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:873:3: lv_direction_24_0= ruleDirection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getItemAccess().getDirectionDirectionEnumRuleCall_1_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDirection_in_ruleItem2157);
            	    lv_direction_24_0=ruleDirection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getItemRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"direction",
            	            		lv_direction_24_0, 
            	            		"Direction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_25=(Token)match(input,16,FOLLOW_16_in_ruleItem2169); 

            	        	newLeafNode(otherlv_25, grammarAccess.getItemAccess().getSemicolonKeyword_1_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:900:4: ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:900:4: ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:901:5: {...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:901:101: ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:902:6: ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:905:6: ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:905:7: {...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:905:16: (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:905:18: otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';'
            	    {
            	    otherlv_26=(Token)match(input,34,FOLLOW_34_in_ruleItem2237); 

            	        	newLeafNode(otherlv_26, grammarAccess.getItemAccess().getTargetKeyword_1_6_0());
            	        
            	    otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleItem2249); 

            	        	newLeafNode(otherlv_27, grammarAccess.getItemAccess().getEqualsSignKeyword_1_6_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:913:1: ( (lv_target_28_0= ruleTarget ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:914:1: (lv_target_28_0= ruleTarget )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:914:1: (lv_target_28_0= ruleTarget )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:915:3: lv_target_28_0= ruleTarget
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getItemAccess().getTargetTargetEnumRuleCall_1_6_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTarget_in_ruleItem2270);
            	    lv_target_28_0=ruleTarget();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getItemRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"target",
            	            		lv_target_28_0, 
            	            		"Target");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_29=(Token)match(input,16,FOLLOW_16_in_ruleItem2282); 

            	        	newLeafNode(otherlv_29, grammarAccess.getItemAccess().getSemicolonKeyword_1_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:942:4: ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:942:4: ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:943:5: {...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:943:101: ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:944:6: ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:947:6: ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:947:7: {...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:947:16: (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:947:18: otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';'
            	    {
            	    otherlv_30=(Token)match(input,35,FOLLOW_35_in_ruleItem2350); 

            	        	newLeafNode(otherlv_30, grammarAccess.getItemAccess().getIconKeyword_1_7_0());
            	        
            	    otherlv_31=(Token)match(input,15,FOLLOW_15_in_ruleItem2362); 

            	        	newLeafNode(otherlv_31, grammarAccess.getItemAccess().getEqualsSignKeyword_1_7_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:955:1: ( (lv_icon_32_0= ruleIcon ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:956:1: (lv_icon_32_0= ruleIcon )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:956:1: (lv_icon_32_0= ruleIcon )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:957:3: lv_icon_32_0= ruleIcon
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getItemAccess().getIconIconParserRuleCall_1_7_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIcon_in_ruleItem2383);
            	    lv_icon_32_0=ruleIcon();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getItemRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"icon",
            	            		lv_icon_32_0, 
            	            		"Icon");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_33=(Token)match(input,16,FOLLOW_16_in_ruleItem2395); 

            	        	newLeafNode(otherlv_33, grammarAccess.getItemAccess().getSemicolonKeyword_1_7_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:984:4: ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:984:4: ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:985:5: {...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:985:101: ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:986:6: ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:989:6: ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:989:7: {...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:989:16: (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:989:18: otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';'
            	    {
            	    otherlv_34=(Token)match(input,36,FOLLOW_36_in_ruleItem2463); 

            	        	newLeafNode(otherlv_34, grammarAccess.getItemAccess().getSubmenuKeyword_1_8_0());
            	        
            	    otherlv_35=(Token)match(input,15,FOLLOW_15_in_ruleItem2475); 

            	        	newLeafNode(otherlv_35, grammarAccess.getItemAccess().getEqualsSignKeyword_1_8_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:997:1: ( (lv_submenu_36_0= ruleSubMenu ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:998:1: (lv_submenu_36_0= ruleSubMenu )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:998:1: (lv_submenu_36_0= ruleSubMenu )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:999:3: lv_submenu_36_0= ruleSubMenu
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getItemAccess().getSubmenuSubMenuParserRuleCall_1_8_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubMenu_in_ruleItem2496);
            	    lv_submenu_36_0=ruleSubMenu();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getItemRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"submenu",
            	            		lv_submenu_36_0, 
            	            		"SubMenu");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_37=(Token)match(input,16,FOLLOW_16_in_ruleItem2508); 

            	        	newLeafNode(otherlv_37, grammarAccess.getItemAccess().getSemicolonKeyword_1_8_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getItemAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canLeave(grammarAccess.getItemAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	

            }

            otherlv_38=(Token)match(input,37,FOLLOW_37_in_ruleItem2567); 

                	newLeafNode(otherlv_38, grammarAccess.getItemAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleSubMenu"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1046:1: entryRuleSubMenu returns [EObject current=null] : iv_ruleSubMenu= ruleSubMenu EOF ;
    public final EObject entryRuleSubMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMenu = null;


        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1047:2: (iv_ruleSubMenu= ruleSubMenu EOF )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1048:2: iv_ruleSubMenu= ruleSubMenu EOF
            {
             newCompositeNode(grammarAccess.getSubMenuRule()); 
            pushFollow(FOLLOW_ruleSubMenu_in_entryRuleSubMenu2603);
            iv_ruleSubMenu=ruleSubMenu();

            state._fsp--;

             current =iv_ruleSubMenu; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubMenu2613); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubMenu"


    // $ANTLR start "ruleSubMenu"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1055:1: ruleSubMenu returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
    public final EObject ruleSubMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_decorator_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_items_9_0 = null;

        EObject lv_items_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1058:28: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1059:1: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1059:1: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1059:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSubMenu2650); 

                	newLeafNode(otherlv_0, grammarAccess.getSubMenuAccess().getLeftCurlyBracketKeyword_0());
                
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1063:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) ) )+ {...}?) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1065:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) ) )+ {...}?) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1065:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) ) )+ {...}?) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1066:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSubMenuAccess().getUnorderedGroup_1());
            	
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1069:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) ) )+ {...}?)
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1070:3: ( ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) ) )+ {...}?
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1070:3: ( ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( LA7_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 1) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1072:4: ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1072:4: ({...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1073:5: {...}? => ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSubMenu", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1073:104: ( ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1074:6: ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1077:6: ({...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1077:7: {...}? => (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubMenu", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1077:16: (otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1077:18: otherlv_2= 'class' otherlv_3= '=' ( (lv_decorator_4_0= RULE_STRING ) ) otherlv_5= ';'
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleSubMenu2708); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSubMenuAccess().getClassKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSubMenu2720); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSubMenuAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1085:1: ( (lv_decorator_4_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1086:1: (lv_decorator_4_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1086:1: (lv_decorator_4_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1087:3: lv_decorator_4_0= RULE_STRING
            	    {
            	    lv_decorator_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSubMenu2737); 

            	    			newLeafNode(lv_decorator_4_0, grammarAccess.getSubMenuAccess().getDecoratorSTRINGTerminalRuleCall_1_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubMenuRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"decorator",
            	            		lv_decorator_4_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSubMenu2754); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSubMenuAccess().getSemicolonKeyword_1_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubMenuAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1114:4: ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1114:4: ({...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1115:5: {...}? => ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSubMenu", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1115:104: ( ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1116:6: ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1119:6: ({...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1119:7: {...}? => (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubMenu", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1119:16: (otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1119:18: otherlv_6= 'items' otherlv_7= '=' otherlv_8= '[' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' otherlv_13= ';'
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleSubMenu2822); 

            	        	newLeafNode(otherlv_6, grammarAccess.getSubMenuAccess().getItemsKeyword_1_1_0());
            	        
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleSubMenu2834); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSubMenuAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleSubMenu2846); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSubMenuAccess().getLeftSquareBracketKeyword_1_1_2());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1131:1: ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1131:2: ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )*
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1131:2: ( (lv_items_9_0= ruleItem ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1132:1: (lv_items_9_0= ruleItem )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1132:1: (lv_items_9_0= ruleItem )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1133:3: lv_items_9_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubMenuAccess().getItemsItemParserRuleCall_1_1_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleSubMenu2868);
            	    lv_items_9_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubMenuRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_9_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1149:2: (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==25) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1149:4: otherlv_10= ',' ( (lv_items_11_0= ruleItem ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleSubMenu2881); 

            	    	        	newLeafNode(otherlv_10, grammarAccess.getSubMenuAccess().getCommaKeyword_1_1_3_1_0());
            	    	        
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1153:1: ( (lv_items_11_0= ruleItem ) )
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1154:1: (lv_items_11_0= ruleItem )
            	    	    {
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1154:1: (lv_items_11_0= ruleItem )
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1155:3: lv_items_11_0= ruleItem
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getSubMenuAccess().getItemsItemParserRuleCall_1_1_3_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleItem_in_ruleSubMenu2902);
            	    	    lv_items_11_0=ruleItem();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getSubMenuRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"items",
            	    	            		lv_items_11_0, 
            	    	            		"Item");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    }

            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleSubMenu2917); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSubMenuAccess().getRightSquareBracketKeyword_1_1_4());
            	        
            	    otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleSubMenu2929); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSubMenuAccess().getSemicolonKeyword_1_1_5());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubMenuAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSubMenuAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleSubMenu", "getUnorderedGroupHelper().canLeave(grammarAccess.getSubMenuAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSubMenuAccess().getUnorderedGroup_1());
            	

            }

            otherlv_14=(Token)match(input,37,FOLLOW_37_in_ruleSubMenu2988); 

                	newLeafNode(otherlv_14, grammarAccess.getSubMenuAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubMenu"


    // $ANTLR start "entryRuleIcon"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1206:1: entryRuleIcon returns [EObject current=null] : iv_ruleIcon= ruleIcon EOF ;
    public final EObject entryRuleIcon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIcon = null;


        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1207:2: (iv_ruleIcon= ruleIcon EOF )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1208:2: iv_ruleIcon= ruleIcon EOF
            {
             newCompositeNode(grammarAccess.getIconRule()); 
            pushFollow(FOLLOW_ruleIcon_in_entryRuleIcon3024);
            iv_ruleIcon=ruleIcon();

            state._fsp--;

             current =iv_ruleIcon; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIcon3034); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIcon"


    // $ANTLR start "ruleIcon"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1215:1: ruleIcon returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' ) ;
    public final EObject ruleIcon() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_decorator_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_text_alt_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_address_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Enumerator lv_position_8_0 = null;


         enterRule(); 
            
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1218:28: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1219:1: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1219:1: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1219:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleIcon3071); 

                	newLeafNode(otherlv_0, grammarAccess.getIconAccess().getLeftCurlyBracketKeyword_0());
                
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1223:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1225:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1225:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1226:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1229:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) )+ {...}?)
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1230:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) )+ {...}?
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1230:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=6;
                int LA8_0 = input.LA(1);

                if ( LA8_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1) ) {
                    alt8=2;
                }
                else if ( LA8_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2) ) {
                    alt8=3;
                }
                else if ( LA8_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3) ) {
                    alt8=4;
                }
                else if ( LA8_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4) ) {
                    alt8=5;
                }


                switch (alt8) {
            	case 1 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1232:4: ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1232:4: ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1233:5: {...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1233:101: ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1234:6: ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1237:6: ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1237:7: {...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1237:16: (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1237:18: otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';'
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleIcon3129); 

            	        	newLeafNode(otherlv_2, grammarAccess.getIconAccess().getIdKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleIcon3141); 

            	        	newLeafNode(otherlv_3, grammarAccess.getIconAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1245:1: ( (lv_name_4_0= RULE_ID ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1246:1: (lv_name_4_0= RULE_ID )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1246:1: (lv_name_4_0= RULE_ID )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1247:3: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIcon3158); 

            	    			newLeafNode(lv_name_4_0, grammarAccess.getIconAccess().getNameIDTerminalRuleCall_1_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIconRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleIcon3175); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIconAccess().getSemicolonKeyword_1_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1274:4: ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1274:4: ({...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1275:5: {...}? => ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1275:101: ( ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1276:6: ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1279:6: ({...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1279:7: {...}? => (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1279:16: (otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1279:18: otherlv_6= 'position' otherlv_7= '=' ( (lv_position_8_0= rulePosition ) ) otherlv_9= ';'
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleIcon3243); 

            	        	newLeafNode(otherlv_6, grammarAccess.getIconAccess().getPositionKeyword_1_1_0());
            	        
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleIcon3255); 

            	        	newLeafNode(otherlv_7, grammarAccess.getIconAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1287:1: ( (lv_position_8_0= rulePosition ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1288:1: (lv_position_8_0= rulePosition )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1288:1: (lv_position_8_0= rulePosition )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1289:3: lv_position_8_0= rulePosition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIconAccess().getPositionPositionEnumRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePosition_in_ruleIcon3276);
            	    lv_position_8_0=rulePosition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIconRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"position",
            	            		lv_position_8_0, 
            	            		"Position");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleIcon3288); 

            	        	newLeafNode(otherlv_9, grammarAccess.getIconAccess().getSemicolonKeyword_1_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1316:4: ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1316:4: ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1317:5: {...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1317:101: ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1318:6: ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1321:6: ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1321:7: {...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1321:16: (otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1321:18: otherlv_10= 'class' otherlv_11= '=' ( (lv_decorator_12_0= RULE_STRING ) ) otherlv_13= ';'
            	    {
            	    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleIcon3356); 

            	        	newLeafNode(otherlv_10, grammarAccess.getIconAccess().getClassKeyword_1_2_0());
            	        
            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleIcon3368); 

            	        	newLeafNode(otherlv_11, grammarAccess.getIconAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1329:1: ( (lv_decorator_12_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1330:1: (lv_decorator_12_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1330:1: (lv_decorator_12_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1331:3: lv_decorator_12_0= RULE_STRING
            	    {
            	    lv_decorator_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIcon3385); 

            	    			newLeafNode(lv_decorator_12_0, grammarAccess.getIconAccess().getDecoratorSTRINGTerminalRuleCall_1_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIconRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"decorator",
            	            		lv_decorator_12_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleIcon3402); 

            	        	newLeafNode(otherlv_13, grammarAccess.getIconAccess().getSemicolonKeyword_1_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1358:4: ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1358:4: ({...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1359:5: {...}? => ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1359:101: ( ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1360:6: ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1363:6: ({...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1363:7: {...}? => (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1363:16: (otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1363:18: otherlv_14= 'text-alt' otherlv_15= '=' ( (lv_text_alt_16_0= RULE_STRING ) ) otherlv_17= ';'
            	    {
            	    otherlv_14=(Token)match(input,38,FOLLOW_38_in_ruleIcon3470); 

            	        	newLeafNode(otherlv_14, grammarAccess.getIconAccess().getTextAltKeyword_1_3_0());
            	        
            	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleIcon3482); 

            	        	newLeafNode(otherlv_15, grammarAccess.getIconAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1371:1: ( (lv_text_alt_16_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1372:1: (lv_text_alt_16_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1372:1: (lv_text_alt_16_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1373:3: lv_text_alt_16_0= RULE_STRING
            	    {
            	    lv_text_alt_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIcon3499); 

            	    			newLeafNode(lv_text_alt_16_0, grammarAccess.getIconAccess().getText_altSTRINGTerminalRuleCall_1_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIconRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"text_alt",
            	            		lv_text_alt_16_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleIcon3516); 

            	        	newLeafNode(otherlv_17, grammarAccess.getIconAccess().getSemicolonKeyword_1_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1400:4: ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1400:4: ({...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1401:5: {...}? => ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1401:101: ( ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1402:6: ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1405:6: ({...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1405:7: {...}? => (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1405:16: (otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1405:18: otherlv_18= 'address' otherlv_19= '=' ( (lv_address_20_0= RULE_STRING ) ) otherlv_21= ';'
            	    {
            	    otherlv_18=(Token)match(input,39,FOLLOW_39_in_ruleIcon3584); 

            	        	newLeafNode(otherlv_18, grammarAccess.getIconAccess().getAddressKeyword_1_4_0());
            	        
            	    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleIcon3596); 

            	        	newLeafNode(otherlv_19, grammarAccess.getIconAccess().getEqualsSignKeyword_1_4_1());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1413:1: ( (lv_address_20_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1414:1: (lv_address_20_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1414:1: (lv_address_20_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1415:3: lv_address_20_0= RULE_STRING
            	    {
            	    lv_address_20_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIcon3613); 

            	    			newLeafNode(lv_address_20_0, grammarAccess.getIconAccess().getAddressSTRINGTerminalRuleCall_1_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIconRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"address",
            	            		lv_address_20_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleIcon3630); 

            	        	newLeafNode(otherlv_21, grammarAccess.getIconAccess().getSemicolonKeyword_1_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getIconAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleIcon", "getUnorderedGroupHelper().canLeave(grammarAccess.getIconAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	

            }

            otherlv_22=(Token)match(input,37,FOLLOW_37_in_ruleIcon3689); 

                	newLeafNode(otherlv_22, grammarAccess.getIconAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIcon"


    // $ANTLR start "ruleType"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1462:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'dropdown' ) | (enumLiteral_1= 'flyout' ) | (enumLiteral_2= 'accordion' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1464:28: ( ( (enumLiteral_0= 'dropdown' ) | (enumLiteral_1= 'flyout' ) | (enumLiteral_2= 'accordion' ) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1465:1: ( (enumLiteral_0= 'dropdown' ) | (enumLiteral_1= 'flyout' ) | (enumLiteral_2= 'accordion' ) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1465:1: ( (enumLiteral_0= 'dropdown' ) | (enumLiteral_1= 'flyout' ) | (enumLiteral_2= 'accordion' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt9=1;
                }
                break;
            case 41:
                {
                alt9=2;
                }
                break;
            case 42:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1465:2: (enumLiteral_0= 'dropdown' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1465:2: (enumLiteral_0= 'dropdown' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1465:4: enumLiteral_0= 'dropdown'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleType3739); 

                            current = grammarAccess.getTypeAccess().getDropdownEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getDropdownEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1471:6: (enumLiteral_1= 'flyout' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1471:6: (enumLiteral_1= 'flyout' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1471:8: enumLiteral_1= 'flyout'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleType3756); 

                            current = grammarAccess.getTypeAccess().getFlyoutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getFlyoutEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1477:6: (enumLiteral_2= 'accordion' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1477:6: (enumLiteral_2= 'accordion' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1477:8: enumLiteral_2= 'accordion'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleType3773); 

                            current = grammarAccess.getTypeAccess().getAccordionEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getAccordionEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleStyle"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1487:1: ruleStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'simple' ) | (enumLiteral_1= 'complex' ) ) ;
    public final Enumerator ruleStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1489:28: ( ( (enumLiteral_0= 'simple' ) | (enumLiteral_1= 'complex' ) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1490:1: ( (enumLiteral_0= 'simple' ) | (enumLiteral_1= 'complex' ) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1490:1: ( (enumLiteral_0= 'simple' ) | (enumLiteral_1= 'complex' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            else if ( (LA10_0==44) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1490:2: (enumLiteral_0= 'simple' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1490:2: (enumLiteral_0= 'simple' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1490:4: enumLiteral_0= 'simple'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleStyle3818); 

                            current = grammarAccess.getStyleAccess().getSimpleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getStyleAccess().getSimpleEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1496:6: (enumLiteral_1= 'complex' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1496:6: (enumLiteral_1= 'complex' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1496:8: enumLiteral_1= 'complex'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleStyle3835); 

                            current = grammarAccess.getStyleAccess().getComplexEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getStyleAccess().getComplexEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStyle"


    // $ANTLR start "rulePosition"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1506:1: rulePosition returns [Enumerator current=null] : ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator rulePosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1508:28: ( ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1509:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1509:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt11=1;
                }
                break;
            case 46:
                {
                alt11=2;
                }
                break;
            case 47:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1509:2: (enumLiteral_0= 'center' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1509:2: (enumLiteral_0= 'center' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1509:4: enumLiteral_0= 'center'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_rulePosition3880); 

                            current = grammarAccess.getPositionAccess().getCenterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPositionAccess().getCenterEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1515:6: (enumLiteral_1= 'left' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1515:6: (enumLiteral_1= 'left' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1515:8: enumLiteral_1= 'left'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_46_in_rulePosition3897); 

                            current = grammarAccess.getPositionAccess().getLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPositionAccess().getLeftEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1521:6: (enumLiteral_2= 'right' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1521:6: (enumLiteral_2= 'right' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1521:8: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_47_in_rulePosition3914); 

                            current = grammarAccess.getPositionAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPositionAccess().getRightEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "ruleDirection"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1531:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'ltr' ) | (enumLiteral_1= 'rlt' ) | (enumLiteral_2= 'auto' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1533:28: ( ( (enumLiteral_0= 'ltr' ) | (enumLiteral_1= 'rlt' ) | (enumLiteral_2= 'auto' ) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1534:1: ( (enumLiteral_0= 'ltr' ) | (enumLiteral_1= 'rlt' ) | (enumLiteral_2= 'auto' ) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1534:1: ( (enumLiteral_0= 'ltr' ) | (enumLiteral_1= 'rlt' ) | (enumLiteral_2= 'auto' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt12=1;
                }
                break;
            case 49:
                {
                alt12=2;
                }
                break;
            case 50:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1534:2: (enumLiteral_0= 'ltr' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1534:2: (enumLiteral_0= 'ltr' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1534:4: enumLiteral_0= 'ltr'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleDirection3959); 

                            current = grammarAccess.getDirectionAccess().getLtrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLtrEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1540:6: (enumLiteral_1= 'rlt' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1540:6: (enumLiteral_1= 'rlt' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1540:8: enumLiteral_1= 'rlt'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleDirection3976); 

                            current = grammarAccess.getDirectionAccess().getRltEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getRltEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1546:6: (enumLiteral_2= 'auto' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1546:6: (enumLiteral_2= 'auto' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1546:8: enumLiteral_2= 'auto'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_50_in_ruleDirection3993); 

                            current = grammarAccess.getDirectionAccess().getAutoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getAutoEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleTarget"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1556:1: ruleTarget returns [Enumerator current=null] : ( (enumLiteral_0= '_self' ) | (enumLiteral_1= '_blank' ) | (enumLiteral_2= '_parent' ) | (enumLiteral_3= '_top' ) ) ;
    public final Enumerator ruleTarget() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1558:28: ( ( (enumLiteral_0= '_self' ) | (enumLiteral_1= '_blank' ) | (enumLiteral_2= '_parent' ) | (enumLiteral_3= '_top' ) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1559:1: ( (enumLiteral_0= '_self' ) | (enumLiteral_1= '_blank' ) | (enumLiteral_2= '_parent' ) | (enumLiteral_3= '_top' ) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1559:1: ( (enumLiteral_0= '_self' ) | (enumLiteral_1= '_blank' ) | (enumLiteral_2= '_parent' ) | (enumLiteral_3= '_top' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt13=1;
                }
                break;
            case 52:
                {
                alt13=2;
                }
                break;
            case 53:
                {
                alt13=3;
                }
                break;
            case 54:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1559:2: (enumLiteral_0= '_self' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1559:2: (enumLiteral_0= '_self' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1559:4: enumLiteral_0= '_self'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleTarget4038); 

                            current = grammarAccess.getTargetAccess().get_selfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTargetAccess().get_selfEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1565:6: (enumLiteral_1= '_blank' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1565:6: (enumLiteral_1= '_blank' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1565:8: enumLiteral_1= '_blank'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleTarget4055); 

                            current = grammarAccess.getTargetAccess().get_blankEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTargetAccess().get_blankEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1571:6: (enumLiteral_2= '_parent' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1571:6: (enumLiteral_2= '_parent' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1571:8: enumLiteral_2= '_parent'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleTarget4072); 

                            current = grammarAccess.getTargetAccess().get_parentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTargetAccess().get_parentEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1577:6: (enumLiteral_3= '_top' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1577:6: (enumLiteral_3= '_top' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:1577:8: enumLiteral_3= '_top'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_54_in_ruleTarget4089); 

                            current = grammarAccess.getTargetAccess().get_topEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTargetAccess().get_topEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTarget"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\13\uffff";
    static final String DFA5_eofS =
        "\13\uffff";
    static final String DFA5_minS =
        "\1\16\12\uffff";
    static final String DFA5_maxS =
        "\1\45\12\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA5_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\5\uffff\1\3\11\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()+ loopback of 646:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'class' otherlv_7= '=' ( (lv_decorator_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'action' otherlv_11= '=' ( (lv_action_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'label' otherlv_15= '=' ( (lv_label_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'title' otherlv_19= '=' ( (lv_title_20_0= RULE_STRING ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'dir' otherlv_23= '=' ( (lv_direction_24_0= ruleDirection ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'target' otherlv_27= '=' ( (lv_target_28_0= ruleTarget ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'icon' otherlv_31= '=' ( (lv_icon_32_0= ruleIcon ) ) otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'submenu' otherlv_35= '=' ( (lv_submenu_36_0= ruleSubMenu ) ) otherlv_37= ';' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                         
                        int index5_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_0==37) ) {s = 1;}

                        else if ( LA5_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA5_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA5_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA5_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA5_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA5_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA5_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA5_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA5_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
                        input.seek(index5_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleMenu_in_entryRuleMenu75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMenu85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMenu167 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMenu179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMenu196 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMenu213 = new BitSet(new long[]{0x00000000013E4002L});
    public static final BitSet FOLLOW_17_in_ruleMenu281 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMenu293 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleMenu314 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMenu326 = new BitSet(new long[]{0x00000000013E4002L});
    public static final BitSet FOLLOW_18_in_ruleMenu394 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMenu406 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleMenu427 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMenu439 = new BitSet(new long[]{0x00000000013E4002L});
    public static final BitSet FOLLOW_19_in_ruleMenu507 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMenu519 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_rulePosition_in_ruleMenu540 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMenu552 = new BitSet(new long[]{0x00000000013E4002L});
    public static final BitSet FOLLOW_20_in_ruleMenu620 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMenu632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMenu649 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMenu666 = new BitSet(new long[]{0x00000000013E4002L});
    public static final BitSet FOLLOW_21_in_ruleMenu734 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMenu746 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMenu758 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleConfigurations_in_ruleMenu779 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMenu791 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMenu803 = new BitSet(new long[]{0x00000000013E4002L});
    public static final BitSet FOLLOW_24_in_ruleMenu871 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMenu883 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMenu895 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleItem_in_ruleMenu916 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_ruleMenu929 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleItem_in_ruleMenu950 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_ruleMenu964 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMenu976 = new BitSet(new long[]{0x00000000013E4002L});
    public static final BitSet FOLLOW_ruleConfigurations_in_entryRuleConfigurations1058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurations1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleConfigurations1107 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleConfig_in_ruleConfigurations1128 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_27_in_ruleConfigurations1148 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleConfig_in_ruleConfigurations1169 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleConfigurations1185 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleConfigurations1197 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleConfig_in_ruleConfigurations1218 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleConfigurations1238 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleConfigurations1250 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleConfig_in_ruleConfigurations1271 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig1310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfig1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConfig1357 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FEATURE_in_ruleConfig1374 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConfig1391 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_COLOR_in_ruleConfig1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem1449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleItem1496 = new BitSet(new long[]{0x0000001FC0104000L});
    public static final BitSet FOLLOW_14_in_ruleItem1554 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleItem1566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleItem1583 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleItem1600 = new BitSet(new long[]{0x0000003FC0104000L});
    public static final BitSet FOLLOW_20_in_ruleItem1668 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleItem1680 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItem1697 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleItem1714 = new BitSet(new long[]{0x0000003FC0104000L});
    public static final BitSet FOLLOW_30_in_ruleItem1782 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleItem1794 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItem1811 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleItem1828 = new BitSet(new long[]{0x0000003FC0104000L});
    public static final BitSet FOLLOW_31_in_ruleItem1896 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleItem1908 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItem1925 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleItem1942 = new BitSet(new long[]{0x0000003FC0104000L});
    public static final BitSet FOLLOW_32_in_ruleItem2010 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleItem2022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItem2039 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleItem2056 = new BitSet(new long[]{0x0000003FC0104000L});
    public static final BitSet FOLLOW_33_in_ruleItem2124 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleItem2136 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleItem2157 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleItem2169 = new BitSet(new long[]{0x0000003FC0104000L});
    public static final BitSet FOLLOW_34_in_ruleItem2237 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleItem2249 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_ruleTarget_in_ruleItem2270 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleItem2282 = new BitSet(new long[]{0x0000003FC0104000L});
    public static final BitSet FOLLOW_35_in_ruleItem2350 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleItem2362 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleIcon_in_ruleItem2383 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleItem2395 = new BitSet(new long[]{0x0000003FC0104000L});
    public static final BitSet FOLLOW_36_in_ruleItem2463 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleItem2475 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleSubMenu_in_ruleItem2496 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleItem2508 = new BitSet(new long[]{0x0000003FC0104000L});
    public static final BitSet FOLLOW_37_in_ruleItem2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMenu_in_entryRuleSubMenu2603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubMenu2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSubMenu2650 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleSubMenu2708 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSubMenu2720 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSubMenu2737 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSubMenu2754 = new BitSet(new long[]{0x0000002001100000L});
    public static final BitSet FOLLOW_24_in_ruleSubMenu2822 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSubMenu2834 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSubMenu2846 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleItem_in_ruleSubMenu2868 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_ruleSubMenu2881 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleItem_in_ruleSubMenu2902 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_ruleSubMenu2917 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSubMenu2929 = new BitSet(new long[]{0x0000002001100000L});
    public static final BitSet FOLLOW_37_in_ruleSubMenu2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIcon_in_entryRuleIcon3024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIcon3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleIcon3071 = new BitSet(new long[]{0x000000C000184000L});
    public static final BitSet FOLLOW_14_in_ruleIcon3129 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIcon3141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIcon3158 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIcon3175 = new BitSet(new long[]{0x000000E000184000L});
    public static final BitSet FOLLOW_19_in_ruleIcon3243 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIcon3255 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_rulePosition_in_ruleIcon3276 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIcon3288 = new BitSet(new long[]{0x000000E000184000L});
    public static final BitSet FOLLOW_20_in_ruleIcon3356 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIcon3368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIcon3385 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIcon3402 = new BitSet(new long[]{0x000000E000184000L});
    public static final BitSet FOLLOW_38_in_ruleIcon3470 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIcon3482 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIcon3499 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIcon3516 = new BitSet(new long[]{0x000000E000184000L});
    public static final BitSet FOLLOW_39_in_ruleIcon3584 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIcon3596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIcon3613 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIcon3630 = new BitSet(new long[]{0x000000E000184000L});
    public static final BitSet FOLLOW_37_in_ruleIcon3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleType3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleType3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleType3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleStyle3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleStyle3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePosition3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePosition3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePosition3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDirection3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDirection3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDirection3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTarget4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTarget4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTarget4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTarget4089 = new BitSet(new long[]{0x0000000000000002L});

}
