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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'id:'", "';'", "'visibility: '", "'items: ['", "','", "']'", "'}'", "'action:'", "'label:'", "'title:'", "'icon:'", "'submenu:'", "'position: '", "'text-alt:'", "'address:'", "':'", "'true'", "'false'", "'left'", "'right'"
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
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:77:1: ruleMenu returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Enumerator lv_visibility_6_0 = null;

        EObject lv_items_9_0 = null;

        EObject lv_items_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:80:28: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:81:1: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:81:1: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:81:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) ) )+ {...}?) ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMenu122); 

                	newLeafNode(otherlv_0, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_0());
                
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:85:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) ) )+ {...}?) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:87:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) ) )+ {...}?) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:87:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) ) )+ {...}?) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:88:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMenuAccess().getUnorderedGroup_1());
            	
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:91:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) ) )+ {...}?)
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:92:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) ) )+ {...}?
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:92:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 2) ) {
                    alt2=3;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:94:4: ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:94:4: ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:95:5: {...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:95:101: ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:96:6: ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:99:6: ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:99:7: {...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:99:16: (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:99:18: otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMenu180); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMenuAccess().getIdKeyword_1_0_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:103:1: ( (lv_name_3_0= RULE_ID ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:104:1: (lv_name_3_0= RULE_ID )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:104:1: (lv_name_3_0= RULE_ID )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:105:3: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMenu197); 

            	    			newLeafNode(lv_name_3_0, grammarAccess.getMenuAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
            	    		

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

            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleMenu214); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getSemicolonKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:132:4: ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:132:4: ({...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:133:5: {...}? => ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:133:101: ( ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:134:6: ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:137:6: ({...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:137:7: {...}? => (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:137:16: (otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:137:18: otherlv_5= 'visibility: ' ( (lv_visibility_6_0= ruleVisibility ) ) otherlv_7= ';'
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleMenu282); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMenuAccess().getVisibilityKeyword_1_1_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:141:1: ( (lv_visibility_6_0= ruleVisibility ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:142:1: (lv_visibility_6_0= ruleVisibility )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:142:1: (lv_visibility_6_0= ruleVisibility )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:143:3: lv_visibility_6_0= ruleVisibility
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMenuAccess().getVisibilityVisibilityEnumRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVisibility_in_ruleMenu303);
            	    lv_visibility_6_0=ruleVisibility();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"visibility",
            	            		lv_visibility_6_0, 
            	            		"Visibility");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleMenu315); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMenuAccess().getSemicolonKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:170:4: ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:170:4: ({...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:171:5: {...}? => ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:171:101: ( ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:172:6: ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:175:6: ({...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:175:7: {...}? => (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMenu", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:175:16: (otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:175:18: otherlv_8= 'items: [' ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* ) otherlv_12= ']'
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleMenu383); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMenuAccess().getItemsKeyword_1_2_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:179:1: ( ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:179:2: ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )*
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:179:2: ( (lv_items_9_0= ruleItem ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:180:1: (lv_items_9_0= ruleItem )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:180:1: (lv_items_9_0= ruleItem )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:181:3: lv_items_9_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMenuAccess().getItemsItemParserRuleCall_1_2_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleMenu405);
            	    lv_items_9_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_9_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:197:2: (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==16) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:197:4: otherlv_10= ',' ( (lv_items_11_0= ruleItem ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleMenu418); 

            	    	        	newLeafNode(otherlv_10, grammarAccess.getMenuAccess().getCommaKeyword_1_2_1_1_0());
            	    	        
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:201:1: ( (lv_items_11_0= ruleItem ) )
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:202:1: (lv_items_11_0= ruleItem )
            	    	    {
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:202:1: (lv_items_11_0= ruleItem )
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:203:3: lv_items_11_0= ruleItem
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getMenuAccess().getItemsItemParserRuleCall_1_2_1_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleItem_in_ruleMenu439);
            	    	    lv_items_11_0=ruleItem();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
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
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }

            	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleMenu454); 

            	        	newLeafNode(otherlv_12, grammarAccess.getMenuAccess().getRightSquareBracketKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup_1());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMenuAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleMenu", "getUnorderedGroupHelper().canLeave(grammarAccess.getMenuAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMenuAccess().getUnorderedGroup_1());
            	

            }

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleMenu513); 

                	newLeafNode(otherlv_13, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_2());
                

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


    // $ANTLR start "entryRuleItem"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:250:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:251:2: (iv_ruleItem= ruleItem EOF )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:252:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem549);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem559); 

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
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:259:1: ruleItem returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_action_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_label_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_title_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_icon_15_0 = null;

        EObject lv_menu_17_0 = null;


         enterRule(); 
            
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:262:28: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:263:1: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:263:1: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:263:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) ) )+ {...}?) ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleItem596); 

                	newLeafNode(otherlv_0, grammarAccess.getItemAccess().getLeftCurlyBracketKeyword_0());
                
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:267:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) ) )+ {...}?) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:269:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) ) )+ {...}?) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:269:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) ) )+ {...}?) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:270:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:273:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) ) )+ {...}?)
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:274:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) ) )+ {...}?
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:274:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=7;
                int LA3_0 = input.LA(1);

                if ( LA3_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {
                    alt3=4;
                }
                else if ( LA3_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {
                    alt3=5;
                }
                else if ( LA3_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {
                    alt3=6;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:276:4: ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:276:4: ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:277:5: {...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:277:101: ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:278:6: ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:281:6: ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:281:7: {...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:281:16: (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:281:18: otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleItem654); 

            	        	newLeafNode(otherlv_2, grammarAccess.getItemAccess().getIdKeyword_1_0_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:285:1: ( (lv_name_3_0= RULE_ID ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:286:1: (lv_name_3_0= RULE_ID )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:286:1: (lv_name_3_0= RULE_ID )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:287:3: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleItem671); 

            	    			newLeafNode(lv_name_3_0, grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getItemRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleItem688); 

            	        	newLeafNode(otherlv_4, grammarAccess.getItemAccess().getSemicolonKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:314:4: ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:314:4: ({...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:315:5: {...}? => ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:315:101: ( ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:316:6: ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:319:6: ({...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:319:7: {...}? => (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:319:16: (otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:319:18: otherlv_5= 'action:' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleItem756); 

            	        	newLeafNode(otherlv_5, grammarAccess.getItemAccess().getActionKeyword_1_1_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:323:1: ( (lv_action_6_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:324:1: (lv_action_6_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:324:1: (lv_action_6_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:325:3: lv_action_6_0= RULE_STRING
            	    {
            	    lv_action_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItem773); 

            	    			newLeafNode(lv_action_6_0, grammarAccess.getItemAccess().getActionSTRINGTerminalRuleCall_1_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getItemRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"action",
            	            		lv_action_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleItem790); 

            	        	newLeafNode(otherlv_7, grammarAccess.getItemAccess().getSemicolonKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:352:4: ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:352:4: ({...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:353:5: {...}? => ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:353:101: ( ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:354:6: ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:357:6: ({...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:357:7: {...}? => (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:357:16: (otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:357:18: otherlv_8= 'label:' ( (lv_label_9_0= RULE_STRING ) ) otherlv_10= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleItem858); 

            	        	newLeafNode(otherlv_8, grammarAccess.getItemAccess().getLabelKeyword_1_2_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:361:1: ( (lv_label_9_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:362:1: (lv_label_9_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:362:1: (lv_label_9_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:363:3: lv_label_9_0= RULE_STRING
            	    {
            	    lv_label_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItem875); 

            	    			newLeafNode(lv_label_9_0, grammarAccess.getItemAccess().getLabelSTRINGTerminalRuleCall_1_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getItemRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"label",
            	            		lv_label_9_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleItem892); 

            	        	newLeafNode(otherlv_10, grammarAccess.getItemAccess().getSemicolonKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:390:4: ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:390:4: ({...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:391:5: {...}? => ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:391:101: ( ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:392:6: ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:395:6: ({...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:395:7: {...}? => (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:395:16: (otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:395:18: otherlv_11= 'title:' ( (lv_title_12_0= RULE_STRING ) ) otherlv_13= ';'
            	    {
            	    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleItem960); 

            	        	newLeafNode(otherlv_11, grammarAccess.getItemAccess().getTitleKeyword_1_3_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:399:1: ( (lv_title_12_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:400:1: (lv_title_12_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:400:1: (lv_title_12_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:401:3: lv_title_12_0= RULE_STRING
            	    {
            	    lv_title_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItem977); 

            	    			newLeafNode(lv_title_12_0, grammarAccess.getItemAccess().getTitleSTRINGTerminalRuleCall_1_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getItemRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"title",
            	            		lv_title_12_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleItem994); 

            	        	newLeafNode(otherlv_13, grammarAccess.getItemAccess().getSemicolonKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:428:4: ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:428:4: ({...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:429:5: {...}? => ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:429:101: ( ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:430:6: ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:433:6: ({...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:433:7: {...}? => (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:433:16: (otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:433:18: otherlv_14= 'icon:' ( (lv_icon_15_0= ruleIcon ) )
            	    {
            	    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleItem1062); 

            	        	newLeafNode(otherlv_14, grammarAccess.getItemAccess().getIconKeyword_1_4_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:437:1: ( (lv_icon_15_0= ruleIcon ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:438:1: (lv_icon_15_0= ruleIcon )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:438:1: (lv_icon_15_0= ruleIcon )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:439:3: lv_icon_15_0= ruleIcon
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getItemAccess().getIconIconParserRuleCall_1_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIcon_in_ruleItem1083);
            	    lv_icon_15_0=ruleIcon();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getItemRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"icon",
            	            		lv_icon_15_0, 
            	            		"Icon");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:462:4: ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:462:4: ({...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:463:5: {...}? => ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:463:101: ( ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:464:6: ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:467:6: ({...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:467:7: {...}? => (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItem", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:467:16: (otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:467:18: otherlv_16= 'submenu:' ( (lv_menu_17_0= ruleMenu ) )
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleItem1151); 

            	        	newLeafNode(otherlv_16, grammarAccess.getItemAccess().getSubmenuKeyword_1_5_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:471:1: ( (lv_menu_17_0= ruleMenu ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:472:1: (lv_menu_17_0= ruleMenu )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:472:1: (lv_menu_17_0= ruleMenu )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:473:3: lv_menu_17_0= ruleMenu
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getItemAccess().getMenuMenuParserRuleCall_1_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMenu_in_ruleItem1172);
            	    lv_menu_17_0=ruleMenu();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getItemRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"menu",
            	            		lv_menu_17_0, 
            	            		"Menu");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getItemAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleItem", "getUnorderedGroupHelper().canLeave(grammarAccess.getItemAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	

            }

            otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleItem1231); 

                	newLeafNode(otherlv_18, grammarAccess.getItemAccess().getRightCurlyBracketKeyword_2());
                

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


    // $ANTLR start "entryRuleIcon"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:516:1: entryRuleIcon returns [EObject current=null] : iv_ruleIcon= ruleIcon EOF ;
    public final EObject entryRuleIcon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIcon = null;


        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:517:2: (iv_ruleIcon= ruleIcon EOF )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:518:2: iv_ruleIcon= ruleIcon EOF
            {
             newCompositeNode(grammarAccess.getIconRule()); 
            pushFollow(FOLLOW_ruleIcon_in_entryRuleIcon1267);
            iv_ruleIcon=ruleIcon();

            state._fsp--;

             current =iv_ruleIcon; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIcon1277); 

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
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:525:1: ruleIcon returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) ) )+ {...}?) ) ) otherlv_15= '}' ) ;
    public final EObject ruleIcon() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_text_alt_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_address_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Enumerator lv_position_6_0 = null;

        EObject lv_features_14_0 = null;


         enterRule(); 
            
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:528:28: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) ) )+ {...}?) ) ) otherlv_15= '}' ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:529:1: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) ) )+ {...}?) ) ) otherlv_15= '}' )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:529:1: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) ) )+ {...}?) ) ) otherlv_15= '}' )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:529:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) ) )+ {...}?) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleIcon1314); 

                	newLeafNode(otherlv_0, grammarAccess.getIconAccess().getLeftCurlyBracketKeyword_0());
                
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:533:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) ) )+ {...}?) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:535:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) ) )+ {...}?) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:535:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) ) )+ {...}?) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:536:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:539:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) ) )+ {...}?)
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:540:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) ) )+ {...}?
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:540:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=6;
                int LA5_0 = input.LA(1);

                if ( LA5_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2) ) {
                    alt5=3;
                }
                else if ( LA5_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3) ) {
                    alt5=4;
                }
                else if ( LA5_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4) ) {
                    alt5=5;
                }


                switch (alt5) {
            	case 1 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:542:4: ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:542:4: ({...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:543:5: {...}? => ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:543:101: ( ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:544:6: ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:547:6: ({...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:547:7: {...}? => (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:547:16: (otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:547:18: otherlv_2= 'id:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleIcon1372); 

            	        	newLeafNode(otherlv_2, grammarAccess.getIconAccess().getIdKeyword_1_0_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:551:1: ( (lv_name_3_0= RULE_ID ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:552:1: (lv_name_3_0= RULE_ID )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:552:1: (lv_name_3_0= RULE_ID )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:553:3: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIcon1389); 

            	    			newLeafNode(lv_name_3_0, grammarAccess.getIconAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIconRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleIcon1406); 

            	        	newLeafNode(otherlv_4, grammarAccess.getIconAccess().getSemicolonKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:580:4: ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:580:4: ({...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:581:5: {...}? => ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:581:101: ( ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:582:6: ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:585:6: ({...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:585:7: {...}? => (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:585:16: (otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:585:18: otherlv_5= 'position: ' ( (lv_position_6_0= rulePosition ) ) otherlv_7= ';'
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleIcon1474); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIconAccess().getPositionKeyword_1_1_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:589:1: ( (lv_position_6_0= rulePosition ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:590:1: (lv_position_6_0= rulePosition )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:590:1: (lv_position_6_0= rulePosition )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:591:3: lv_position_6_0= rulePosition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIconAccess().getPositionPositionEnumRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePosition_in_ruleIcon1495);
            	    lv_position_6_0=rulePosition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIconRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"position",
            	            		lv_position_6_0, 
            	            		"Position");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleIcon1507); 

            	        	newLeafNode(otherlv_7, grammarAccess.getIconAccess().getSemicolonKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:618:4: ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:618:4: ({...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:619:5: {...}? => ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:619:101: ( ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:620:6: ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:623:6: ({...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:623:7: {...}? => (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:623:16: (otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:623:18: otherlv_8= 'text-alt:' ( (lv_text_alt_9_0= RULE_STRING ) ) otherlv_10= ';'
            	    {
            	    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleIcon1575); 

            	        	newLeafNode(otherlv_8, grammarAccess.getIconAccess().getTextAltKeyword_1_2_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:627:1: ( (lv_text_alt_9_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:628:1: (lv_text_alt_9_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:628:1: (lv_text_alt_9_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:629:3: lv_text_alt_9_0= RULE_STRING
            	    {
            	    lv_text_alt_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIcon1592); 

            	    			newLeafNode(lv_text_alt_9_0, grammarAccess.getIconAccess().getText_altSTRINGTerminalRuleCall_1_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIconRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"text_alt",
            	            		lv_text_alt_9_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleIcon1609); 

            	        	newLeafNode(otherlv_10, grammarAccess.getIconAccess().getSemicolonKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:656:4: ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:656:4: ({...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:657:5: {...}? => ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:657:101: ( ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:658:6: ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:661:6: ({...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:661:7: {...}? => (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "true");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:661:16: (otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';' )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:661:18: otherlv_11= 'address:' ( (lv_address_12_0= RULE_STRING ) ) otherlv_13= ';'
            	    {
            	    otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleIcon1677); 

            	        	newLeafNode(otherlv_11, grammarAccess.getIconAccess().getAddressKeyword_1_3_0());
            	        
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:665:1: ( (lv_address_12_0= RULE_STRING ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:666:1: (lv_address_12_0= RULE_STRING )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:666:1: (lv_address_12_0= RULE_STRING )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:667:3: lv_address_12_0= RULE_STRING
            	    {
            	    lv_address_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIcon1694); 

            	    			newLeafNode(lv_address_12_0, grammarAccess.getIconAccess().getAddressSTRINGTerminalRuleCall_1_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIconRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"address",
            	            		lv_address_12_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleIcon1711); 

            	        	newLeafNode(otherlv_13, grammarAccess.getIconAccess().getSemicolonKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:694:4: ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) )
            	    {
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:694:4: ({...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ ) )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:695:5: {...}? => ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleIcon", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:695:101: ( ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+ )
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:696:6: ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:699:6: ({...}? => ( (lv_features_14_0= ruleFeature ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_ID) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:699:7: {...}? => ( (lv_features_14_0= ruleFeature ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleIcon", "true");
            	    	    }
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:699:16: ( (lv_features_14_0= ruleFeature ) )
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:700:1: (lv_features_14_0= ruleFeature )
            	    	    {
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:700:1: (lv_features_14_0= ruleFeature )
            	    	    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:701:3: lv_features_14_0= ruleFeature
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getIconAccess().getFeaturesFeatureParserRuleCall_1_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleFeature_in_ruleIcon1787);
            	    	    lv_features_14_0=ruleFeature();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getIconRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"features",
            	    	            		lv_features_14_0, 
            	    	            		"Feature");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getIconAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleIcon", "getUnorderedGroupHelper().canLeave(grammarAccess.getIconAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	

            }

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleIcon1846); 

                	newLeafNode(otherlv_15, grammarAccess.getIconAccess().getRightCurlyBracketKeyword_2());
                

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


    // $ANTLR start "entryRuleFeature"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:744:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:745:2: (iv_ruleFeature= ruleFeature EOF )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:746:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1882);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1892); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:753:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:756:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:757:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:757:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:757:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:757:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:758:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:758:1: (lv_name_0_0= RULE_ID )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:759:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1934); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleFeature1951); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
                
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:779:1: ( (lv_type_2_0= RULE_ID ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:780:1: (lv_type_2_0= RULE_ID )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:780:1: (lv_type_2_0= RULE_ID )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:781:3: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1968); 

            			newLeafNode(lv_type_2_0, grammarAccess.getFeatureAccess().getTypeIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFeature1985); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "ruleVisibility"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:809:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:811:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:812:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:812:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==29) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:812:2: (enumLiteral_0= 'true' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:812:2: (enumLiteral_0= 'true' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:812:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleVisibility2035); 

                            current = grammarAccess.getVisibilityAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getTrueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:818:6: (enumLiteral_1= 'false' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:818:6: (enumLiteral_1= 'false' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:818:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleVisibility2052); 

                            current = grammarAccess.getVisibilityAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getFalseEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rulePosition"
    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:828:1: rulePosition returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator rulePosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:830:28: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:831:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:831:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==31) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:831:2: (enumLiteral_0= 'left' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:831:2: (enumLiteral_0= 'left' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:831:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_rulePosition2097); 

                            current = grammarAccess.getPositionAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPositionAccess().getLeftEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:837:6: (enumLiteral_1= 'right' )
                    {
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:837:6: (enumLiteral_1= 'right' )
                    // ../br.usp.icmc.amenu/src-gen/br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.g:837:8: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_31_in_rulePosition2114); 

                            current = grammarAccess.getPositionAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPositionAccess().getRightEnumLiteralDeclaration_1()); 
                        

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMenu_in_entryRuleMenu75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMenu85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMenu122 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_12_in_ruleMenu180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMenu197 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMenu214 = new BitSet(new long[]{0x000000000004D000L});
    public static final BitSet FOLLOW_14_in_ruleMenu282 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleMenu303 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMenu315 = new BitSet(new long[]{0x000000000004D000L});
    public static final BitSet FOLLOW_15_in_ruleMenu383 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleItem_in_ruleMenu405 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleMenu418 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleItem_in_ruleMenu439 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleMenu454 = new BitSet(new long[]{0x000000000004D000L});
    public static final BitSet FOLLOW_18_in_ruleMenu513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleItem596 = new BitSet(new long[]{0x0000000000F81000L});
    public static final BitSet FOLLOW_12_in_ruleItem654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleItem671 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleItem688 = new BitSet(new long[]{0x0000000000FC1000L});
    public static final BitSet FOLLOW_19_in_ruleItem756 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItem773 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleItem790 = new BitSet(new long[]{0x0000000000FC1000L});
    public static final BitSet FOLLOW_20_in_ruleItem858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItem875 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleItem892 = new BitSet(new long[]{0x0000000000FC1000L});
    public static final BitSet FOLLOW_21_in_ruleItem960 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItem977 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleItem994 = new BitSet(new long[]{0x0000000000FC1000L});
    public static final BitSet FOLLOW_22_in_ruleItem1062 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleIcon_in_ruleItem1083 = new BitSet(new long[]{0x0000000000FC1000L});
    public static final BitSet FOLLOW_23_in_ruleItem1151 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleMenu_in_ruleItem1172 = new BitSet(new long[]{0x0000000000FC1000L});
    public static final BitSet FOLLOW_18_in_ruleItem1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIcon_in_entryRuleIcon1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIcon1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleIcon1314 = new BitSet(new long[]{0x0000000007001010L});
    public static final BitSet FOLLOW_12_in_ruleIcon1372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIcon1389 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIcon1406 = new BitSet(new long[]{0x0000000007041010L});
    public static final BitSet FOLLOW_24_in_ruleIcon1474 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rulePosition_in_ruleIcon1495 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIcon1507 = new BitSet(new long[]{0x0000000007041010L});
    public static final BitSet FOLLOW_25_in_ruleIcon1575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIcon1592 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIcon1609 = new BitSet(new long[]{0x0000000007041010L});
    public static final BitSet FOLLOW_26_in_ruleIcon1677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIcon1694 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIcon1711 = new BitSet(new long[]{0x0000000007041010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleIcon1787 = new BitSet(new long[]{0x0000000007041010L});
    public static final BitSet FOLLOW_18_in_ruleIcon1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1934 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFeature1951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1968 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFeature1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleVisibility2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVisibility2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePosition2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePosition2114 = new BitSet(new long[]{0x0000000000000002L});

}
