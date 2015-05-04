package br.usp.icmc.amenu.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import br.usp.icmc.amenu.services.AMenuGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAMenuParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FEATURE", "RULE_COLOR", "RULE_HEX", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dropdown'", "'flyout'", "'accordion'", "'simple'", "'complex'", "'center'", "'left'", "'right'", "'ltr'", "'rlt'", "'auto'", "'_self'", "'_blank'", "'_parent'", "'_top'", "'id'", "'='", "';'", "'type'", "'style'", "'position'", "'class'", "'config'", "'['", "']'", "'items'", "','", "'top'", "'children'", "'-'", "'{'", "'}'", "'action'", "'label'", "'title'", "'dir'", "'target'", "'icon'", "'submenu'", "'text-alt'", "'address'"
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
    public String getGrammarFileName() { return "../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g"; }


     
     	private AMenuGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AMenuGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMenu"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:60:1: entryRuleMenu : ruleMenu EOF ;
    public final void entryRuleMenu() throws RecognitionException {
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:61:1: ( ruleMenu EOF )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:62:1: ruleMenu EOF
            {
             before(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_ruleMenu_in_entryRuleMenu61);
            ruleMenu();

            state._fsp--;

             after(grammarAccess.getMenuRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMenu68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:69:1: ruleMenu : ( ( rule__Menu__UnorderedGroup ) ) ;
    public final void ruleMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:73:2: ( ( ( rule__Menu__UnorderedGroup ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:74:1: ( ( rule__Menu__UnorderedGroup ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:74:1: ( ( rule__Menu__UnorderedGroup ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:75:1: ( rule__Menu__UnorderedGroup )
            {
             before(grammarAccess.getMenuAccess().getUnorderedGroup()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:76:1: ( rule__Menu__UnorderedGroup )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:76:2: rule__Menu__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__Menu__UnorderedGroup_in_ruleMenu94);
            rule__Menu__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleConfigurations"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:88:1: entryRuleConfigurations : ruleConfigurations EOF ;
    public final void entryRuleConfigurations() throws RecognitionException {
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:89:1: ( ruleConfigurations EOF )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:90:1: ruleConfigurations EOF
            {
             before(grammarAccess.getConfigurationsRule()); 
            pushFollow(FOLLOW_ruleConfigurations_in_entryRuleConfigurations121);
            ruleConfigurations();

            state._fsp--;

             after(grammarAccess.getConfigurationsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurations128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigurations"


    // $ANTLR start "ruleConfigurations"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:97:1: ruleConfigurations : ( ( rule__Configurations__Group__0 ) ) ;
    public final void ruleConfigurations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:101:2: ( ( ( rule__Configurations__Group__0 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:102:1: ( ( rule__Configurations__Group__0 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:102:1: ( ( rule__Configurations__Group__0 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:103:1: ( rule__Configurations__Group__0 )
            {
             before(grammarAccess.getConfigurationsAccess().getGroup()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:104:1: ( rule__Configurations__Group__0 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:104:2: rule__Configurations__Group__0
            {
            pushFollow(FOLLOW_rule__Configurations__Group__0_in_ruleConfigurations154);
            rule__Configurations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurations"


    // $ANTLR start "entryRuleConfig"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:116:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:117:1: ( ruleConfig EOF )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:118:1: ruleConfig EOF
            {
             before(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_ruleConfig_in_entryRuleConfig181);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfig188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:125:1: ruleConfig : ( ( rule__Config__Group__0 ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:129:2: ( ( ( rule__Config__Group__0 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:130:1: ( ( rule__Config__Group__0 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:130:1: ( ( rule__Config__Group__0 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:131:1: ( rule__Config__Group__0 )
            {
             before(grammarAccess.getConfigAccess().getGroup()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:132:1: ( rule__Config__Group__0 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:132:2: rule__Config__Group__0
            {
            pushFollow(FOLLOW_rule__Config__Group__0_in_ruleConfig214);
            rule__Config__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleItem"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:144:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:145:1: ( ruleItem EOF )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:146:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem241);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:153:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:157:2: ( ( ( rule__Item__Group__0 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:158:1: ( ( rule__Item__Group__0 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:158:1: ( ( rule__Item__Group__0 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:159:1: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:160:1: ( rule__Item__Group__0 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:160:2: rule__Item__Group__0
            {
            pushFollow(FOLLOW_rule__Item__Group__0_in_ruleItem274);
            rule__Item__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleSubMenu"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:172:1: entryRuleSubMenu : ruleSubMenu EOF ;
    public final void entryRuleSubMenu() throws RecognitionException {
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:173:1: ( ruleSubMenu EOF )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:174:1: ruleSubMenu EOF
            {
             before(grammarAccess.getSubMenuRule()); 
            pushFollow(FOLLOW_ruleSubMenu_in_entryRuleSubMenu301);
            ruleSubMenu();

            state._fsp--;

             after(grammarAccess.getSubMenuRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubMenu308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubMenu"


    // $ANTLR start "ruleSubMenu"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:181:1: ruleSubMenu : ( ( rule__SubMenu__Group__0 ) ) ;
    public final void ruleSubMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:185:2: ( ( ( rule__SubMenu__Group__0 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:186:1: ( ( rule__SubMenu__Group__0 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:186:1: ( ( rule__SubMenu__Group__0 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:187:1: ( rule__SubMenu__Group__0 )
            {
             before(grammarAccess.getSubMenuAccess().getGroup()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:188:1: ( rule__SubMenu__Group__0 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:188:2: rule__SubMenu__Group__0
            {
            pushFollow(FOLLOW_rule__SubMenu__Group__0_in_ruleSubMenu334);
            rule__SubMenu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubMenuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubMenu"


    // $ANTLR start "entryRuleIcon"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:200:1: entryRuleIcon : ruleIcon EOF ;
    public final void entryRuleIcon() throws RecognitionException {
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:201:1: ( ruleIcon EOF )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:202:1: ruleIcon EOF
            {
             before(grammarAccess.getIconRule()); 
            pushFollow(FOLLOW_ruleIcon_in_entryRuleIcon361);
            ruleIcon();

            state._fsp--;

             after(grammarAccess.getIconRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIcon368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIcon"


    // $ANTLR start "ruleIcon"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:209:1: ruleIcon : ( ( rule__Icon__Group__0 ) ) ;
    public final void ruleIcon() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:213:2: ( ( ( rule__Icon__Group__0 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:214:1: ( ( rule__Icon__Group__0 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:214:1: ( ( rule__Icon__Group__0 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:215:1: ( rule__Icon__Group__0 )
            {
             before(grammarAccess.getIconAccess().getGroup()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:216:1: ( rule__Icon__Group__0 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:216:2: rule__Icon__Group__0
            {
            pushFollow(FOLLOW_rule__Icon__Group__0_in_ruleIcon394);
            rule__Icon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIconAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIcon"


    // $ANTLR start "ruleType"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:229:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:233:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:234:1: ( ( rule__Type__Alternatives ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:234:1: ( ( rule__Type__Alternatives ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:235:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:236:1: ( rule__Type__Alternatives )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:236:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType431);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleStyle"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:248:1: ruleStyle : ( ( rule__Style__Alternatives ) ) ;
    public final void ruleStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:252:1: ( ( ( rule__Style__Alternatives ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:253:1: ( ( rule__Style__Alternatives ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:253:1: ( ( rule__Style__Alternatives ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:254:1: ( rule__Style__Alternatives )
            {
             before(grammarAccess.getStyleAccess().getAlternatives()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:255:1: ( rule__Style__Alternatives )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:255:2: rule__Style__Alternatives
            {
            pushFollow(FOLLOW_rule__Style__Alternatives_in_ruleStyle467);
            rule__Style__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStyleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStyle"


    // $ANTLR start "rulePosition"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:267:1: rulePosition : ( ( rule__Position__Alternatives ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:271:1: ( ( ( rule__Position__Alternatives ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:272:1: ( ( rule__Position__Alternatives ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:272:1: ( ( rule__Position__Alternatives ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:273:1: ( rule__Position__Alternatives )
            {
             before(grammarAccess.getPositionAccess().getAlternatives()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:274:1: ( rule__Position__Alternatives )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:274:2: rule__Position__Alternatives
            {
            pushFollow(FOLLOW_rule__Position__Alternatives_in_rulePosition503);
            rule__Position__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "ruleDirection"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:286:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:290:1: ( ( ( rule__Direction__Alternatives ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:291:1: ( ( rule__Direction__Alternatives ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:291:1: ( ( rule__Direction__Alternatives ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:292:1: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:293:1: ( rule__Direction__Alternatives )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:293:2: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_rule__Direction__Alternatives_in_ruleDirection539);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleTarget"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:305:1: ruleTarget : ( ( rule__Target__Alternatives ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:309:1: ( ( ( rule__Target__Alternatives ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:310:1: ( ( rule__Target__Alternatives ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:310:1: ( ( rule__Target__Alternatives ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:311:1: ( rule__Target__Alternatives )
            {
             before(grammarAccess.getTargetAccess().getAlternatives()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:312:1: ( rule__Target__Alternatives )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:312:2: rule__Target__Alternatives
            {
            pushFollow(FOLLOW_rule__Target__Alternatives_in_ruleTarget575);
            rule__Target__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "rule__Configurations__Alternatives_0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:323:1: rule__Configurations__Alternatives_0 : ( ( ( rule__Configurations__Group_0_0__0 ) ) | ( ( rule__Configurations__Group_0_1__0 ) ) );
    public final void rule__Configurations__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:327:1: ( ( ( rule__Configurations__Group_0_0__0 ) ) | ( ( rule__Configurations__Group_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==41) ) {
                alt1=1;
            }
            else if ( (LA1_0==42) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:328:1: ( ( rule__Configurations__Group_0_0__0 ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:328:1: ( ( rule__Configurations__Group_0_0__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:329:1: ( rule__Configurations__Group_0_0__0 )
                    {
                     before(grammarAccess.getConfigurationsAccess().getGroup_0_0()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:330:1: ( rule__Configurations__Group_0_0__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:330:2: rule__Configurations__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Configurations__Group_0_0__0_in_rule__Configurations__Alternatives_0610);
                    rule__Configurations__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConfigurationsAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:334:6: ( ( rule__Configurations__Group_0_1__0 ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:334:6: ( ( rule__Configurations__Group_0_1__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:335:1: ( rule__Configurations__Group_0_1__0 )
                    {
                     before(grammarAccess.getConfigurationsAccess().getGroup_0_1()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:336:1: ( rule__Configurations__Group_0_1__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:336:2: rule__Configurations__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Configurations__Group_0_1__0_in_rule__Configurations__Alternatives_0628);
                    rule__Configurations__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConfigurationsAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Alternatives_0"


    // $ANTLR start "rule__Configurations__Alternatives_1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:345:1: rule__Configurations__Alternatives_1 : ( ( ( rule__Configurations__Group_1_0__0 ) ) | ( ( rule__Configurations__Group_1_1__0 ) ) );
    public final void rule__Configurations__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:349:1: ( ( ( rule__Configurations__Group_1_0__0 ) ) | ( ( rule__Configurations__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==40) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==42) ) {
                    alt2=2;
                }
                else if ( (LA2_1==41) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:350:1: ( ( rule__Configurations__Group_1_0__0 ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:350:1: ( ( rule__Configurations__Group_1_0__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:351:1: ( rule__Configurations__Group_1_0__0 )
                    {
                     before(grammarAccess.getConfigurationsAccess().getGroup_1_0()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:352:1: ( rule__Configurations__Group_1_0__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:352:2: rule__Configurations__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Configurations__Group_1_0__0_in_rule__Configurations__Alternatives_1661);
                    rule__Configurations__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConfigurationsAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:356:6: ( ( rule__Configurations__Group_1_1__0 ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:356:6: ( ( rule__Configurations__Group_1_1__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:357:1: ( rule__Configurations__Group_1_1__0 )
                    {
                     before(grammarAccess.getConfigurationsAccess().getGroup_1_1()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:358:1: ( rule__Configurations__Group_1_1__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:358:2: rule__Configurations__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Configurations__Group_1_1__0_in_rule__Configurations__Alternatives_1679);
                    rule__Configurations__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConfigurationsAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Alternatives_1"


    // $ANTLR start "rule__Type__Alternatives"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:367:1: rule__Type__Alternatives : ( ( ( 'dropdown' ) ) | ( ( 'flyout' ) ) | ( ( 'accordion' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:371:1: ( ( ( 'dropdown' ) ) | ( ( 'flyout' ) ) | ( ( 'accordion' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:372:1: ( ( 'dropdown' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:372:1: ( ( 'dropdown' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:373:1: ( 'dropdown' )
                    {
                     before(grammarAccess.getTypeAccess().getDropdownEnumLiteralDeclaration_0()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:374:1: ( 'dropdown' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:374:3: 'dropdown'
                    {
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives713); 

                    }

                     after(grammarAccess.getTypeAccess().getDropdownEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:379:6: ( ( 'flyout' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:379:6: ( ( 'flyout' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:380:1: ( 'flyout' )
                    {
                     before(grammarAccess.getTypeAccess().getFlyoutEnumLiteralDeclaration_1()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:381:1: ( 'flyout' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:381:3: 'flyout'
                    {
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives734); 

                    }

                     after(grammarAccess.getTypeAccess().getFlyoutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:386:6: ( ( 'accordion' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:386:6: ( ( 'accordion' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:387:1: ( 'accordion' )
                    {
                     before(grammarAccess.getTypeAccess().getAccordionEnumLiteralDeclaration_2()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:388:1: ( 'accordion' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:388:3: 'accordion'
                    {
                    match(input,16,FOLLOW_16_in_rule__Type__Alternatives755); 

                    }

                     after(grammarAccess.getTypeAccess().getAccordionEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Style__Alternatives"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:398:1: rule__Style__Alternatives : ( ( ( 'simple' ) ) | ( ( 'complex' ) ) );
    public final void rule__Style__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:402:1: ( ( ( 'simple' ) ) | ( ( 'complex' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:403:1: ( ( 'simple' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:403:1: ( ( 'simple' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:404:1: ( 'simple' )
                    {
                     before(grammarAccess.getStyleAccess().getSimpleEnumLiteralDeclaration_0()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:405:1: ( 'simple' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:405:3: 'simple'
                    {
                    match(input,17,FOLLOW_17_in_rule__Style__Alternatives791); 

                    }

                     after(grammarAccess.getStyleAccess().getSimpleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:410:6: ( ( 'complex' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:410:6: ( ( 'complex' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:411:1: ( 'complex' )
                    {
                     before(grammarAccess.getStyleAccess().getComplexEnumLiteralDeclaration_1()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:412:1: ( 'complex' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:412:3: 'complex'
                    {
                    match(input,18,FOLLOW_18_in_rule__Style__Alternatives812); 

                    }

                     after(grammarAccess.getStyleAccess().getComplexEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__Alternatives"


    // $ANTLR start "rule__Position__Alternatives"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:422:1: rule__Position__Alternatives : ( ( ( 'center' ) ) | ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__Position__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:426:1: ( ( ( 'center' ) ) | ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:427:1: ( ( 'center' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:427:1: ( ( 'center' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:428:1: ( 'center' )
                    {
                     before(grammarAccess.getPositionAccess().getCenterEnumLiteralDeclaration_0()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:429:1: ( 'center' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:429:3: 'center'
                    {
                    match(input,19,FOLLOW_19_in_rule__Position__Alternatives848); 

                    }

                     after(grammarAccess.getPositionAccess().getCenterEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:434:6: ( ( 'left' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:434:6: ( ( 'left' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:435:1: ( 'left' )
                    {
                     before(grammarAccess.getPositionAccess().getLeftEnumLiteralDeclaration_1()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:436:1: ( 'left' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:436:3: 'left'
                    {
                    match(input,20,FOLLOW_20_in_rule__Position__Alternatives869); 

                    }

                     after(grammarAccess.getPositionAccess().getLeftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:441:6: ( ( 'right' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:441:6: ( ( 'right' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:442:1: ( 'right' )
                    {
                     before(grammarAccess.getPositionAccess().getRightEnumLiteralDeclaration_2()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:443:1: ( 'right' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:443:3: 'right'
                    {
                    match(input,21,FOLLOW_21_in_rule__Position__Alternatives890); 

                    }

                     after(grammarAccess.getPositionAccess().getRightEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:453:1: rule__Direction__Alternatives : ( ( ( 'ltr' ) ) | ( ( 'rlt' ) ) | ( ( 'auto' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:457:1: ( ( ( 'ltr' ) ) | ( ( 'rlt' ) ) | ( ( 'auto' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:458:1: ( ( 'ltr' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:458:1: ( ( 'ltr' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:459:1: ( 'ltr' )
                    {
                     before(grammarAccess.getDirectionAccess().getLtrEnumLiteralDeclaration_0()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:460:1: ( 'ltr' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:460:3: 'ltr'
                    {
                    match(input,22,FOLLOW_22_in_rule__Direction__Alternatives926); 

                    }

                     after(grammarAccess.getDirectionAccess().getLtrEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:465:6: ( ( 'rlt' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:465:6: ( ( 'rlt' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:466:1: ( 'rlt' )
                    {
                     before(grammarAccess.getDirectionAccess().getRltEnumLiteralDeclaration_1()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:467:1: ( 'rlt' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:467:3: 'rlt'
                    {
                    match(input,23,FOLLOW_23_in_rule__Direction__Alternatives947); 

                    }

                     after(grammarAccess.getDirectionAccess().getRltEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:472:6: ( ( 'auto' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:472:6: ( ( 'auto' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:473:1: ( 'auto' )
                    {
                     before(grammarAccess.getDirectionAccess().getAutoEnumLiteralDeclaration_2()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:474:1: ( 'auto' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:474:3: 'auto'
                    {
                    match(input,24,FOLLOW_24_in_rule__Direction__Alternatives968); 

                    }

                     after(grammarAccess.getDirectionAccess().getAutoEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__Target__Alternatives"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:484:1: rule__Target__Alternatives : ( ( ( '_self' ) ) | ( ( '_blank' ) ) | ( ( '_parent' ) ) | ( ( '_top' ) ) );
    public final void rule__Target__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:488:1: ( ( ( '_self' ) ) | ( ( '_blank' ) ) | ( ( '_parent' ) ) | ( ( '_top' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:489:1: ( ( '_self' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:489:1: ( ( '_self' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:490:1: ( '_self' )
                    {
                     before(grammarAccess.getTargetAccess().get_selfEnumLiteralDeclaration_0()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:491:1: ( '_self' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:491:3: '_self'
                    {
                    match(input,25,FOLLOW_25_in_rule__Target__Alternatives1004); 

                    }

                     after(grammarAccess.getTargetAccess().get_selfEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:496:6: ( ( '_blank' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:496:6: ( ( '_blank' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:497:1: ( '_blank' )
                    {
                     before(grammarAccess.getTargetAccess().get_blankEnumLiteralDeclaration_1()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:498:1: ( '_blank' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:498:3: '_blank'
                    {
                    match(input,26,FOLLOW_26_in_rule__Target__Alternatives1025); 

                    }

                     after(grammarAccess.getTargetAccess().get_blankEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:503:6: ( ( '_parent' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:503:6: ( ( '_parent' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:504:1: ( '_parent' )
                    {
                     before(grammarAccess.getTargetAccess().get_parentEnumLiteralDeclaration_2()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:505:1: ( '_parent' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:505:3: '_parent'
                    {
                    match(input,27,FOLLOW_27_in_rule__Target__Alternatives1046); 

                    }

                     after(grammarAccess.getTargetAccess().get_parentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:510:6: ( ( '_top' ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:510:6: ( ( '_top' ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:511:1: ( '_top' )
                    {
                     before(grammarAccess.getTargetAccess().get_topEnumLiteralDeclaration_3()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:512:1: ( '_top' )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:512:3: '_top'
                    {
                    match(input,28,FOLLOW_28_in_rule__Target__Alternatives1067); 

                    }

                     after(grammarAccess.getTargetAccess().get_topEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Alternatives"


    // $ANTLR start "rule__Menu__Group_0__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:524:1: rule__Menu__Group_0__0 : rule__Menu__Group_0__0__Impl rule__Menu__Group_0__1 ;
    public final void rule__Menu__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:528:1: ( rule__Menu__Group_0__0__Impl rule__Menu__Group_0__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:529:2: rule__Menu__Group_0__0__Impl rule__Menu__Group_0__1
            {
            pushFollow(FOLLOW_rule__Menu__Group_0__0__Impl_in_rule__Menu__Group_0__01100);
            rule__Menu__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_0__1_in_rule__Menu__Group_0__01103);
            rule__Menu__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_0__0"


    // $ANTLR start "rule__Menu__Group_0__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:536:1: rule__Menu__Group_0__0__Impl : ( 'id' ) ;
    public final void rule__Menu__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:540:1: ( ( 'id' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:541:1: ( 'id' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:541:1: ( 'id' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:542:1: 'id'
            {
             before(grammarAccess.getMenuAccess().getIdKeyword_0_0()); 
            match(input,29,FOLLOW_29_in_rule__Menu__Group_0__0__Impl1131); 
             after(grammarAccess.getMenuAccess().getIdKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_0__0__Impl"


    // $ANTLR start "rule__Menu__Group_0__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:555:1: rule__Menu__Group_0__1 : rule__Menu__Group_0__1__Impl rule__Menu__Group_0__2 ;
    public final void rule__Menu__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:559:1: ( rule__Menu__Group_0__1__Impl rule__Menu__Group_0__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:560:2: rule__Menu__Group_0__1__Impl rule__Menu__Group_0__2
            {
            pushFollow(FOLLOW_rule__Menu__Group_0__1__Impl_in_rule__Menu__Group_0__11162);
            rule__Menu__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_0__2_in_rule__Menu__Group_0__11165);
            rule__Menu__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_0__1"


    // $ANTLR start "rule__Menu__Group_0__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:567:1: rule__Menu__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Menu__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:571:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:572:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:572:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:573:1: '='
            {
             before(grammarAccess.getMenuAccess().getEqualsSignKeyword_0_1()); 
            match(input,30,FOLLOW_30_in_rule__Menu__Group_0__1__Impl1193); 
             after(grammarAccess.getMenuAccess().getEqualsSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_0__1__Impl"


    // $ANTLR start "rule__Menu__Group_0__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:586:1: rule__Menu__Group_0__2 : rule__Menu__Group_0__2__Impl rule__Menu__Group_0__3 ;
    public final void rule__Menu__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:590:1: ( rule__Menu__Group_0__2__Impl rule__Menu__Group_0__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:591:2: rule__Menu__Group_0__2__Impl rule__Menu__Group_0__3
            {
            pushFollow(FOLLOW_rule__Menu__Group_0__2__Impl_in_rule__Menu__Group_0__21224);
            rule__Menu__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_0__3_in_rule__Menu__Group_0__21227);
            rule__Menu__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_0__2"


    // $ANTLR start "rule__Menu__Group_0__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:598:1: rule__Menu__Group_0__2__Impl : ( ( rule__Menu__NameAssignment_0_2 ) ) ;
    public final void rule__Menu__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:602:1: ( ( ( rule__Menu__NameAssignment_0_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:603:1: ( ( rule__Menu__NameAssignment_0_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:603:1: ( ( rule__Menu__NameAssignment_0_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:604:1: ( rule__Menu__NameAssignment_0_2 )
            {
             before(grammarAccess.getMenuAccess().getNameAssignment_0_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:605:1: ( rule__Menu__NameAssignment_0_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:605:2: rule__Menu__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Menu__NameAssignment_0_2_in_rule__Menu__Group_0__2__Impl1254);
            rule__Menu__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_0__2__Impl"


    // $ANTLR start "rule__Menu__Group_0__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:615:1: rule__Menu__Group_0__3 : rule__Menu__Group_0__3__Impl ;
    public final void rule__Menu__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:619:1: ( rule__Menu__Group_0__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:620:2: rule__Menu__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Menu__Group_0__3__Impl_in_rule__Menu__Group_0__31284);
            rule__Menu__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_0__3"


    // $ANTLR start "rule__Menu__Group_0__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:626:1: rule__Menu__Group_0__3__Impl : ( ';' ) ;
    public final void rule__Menu__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:630:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:631:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:631:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:632:1: ';'
            {
             before(grammarAccess.getMenuAccess().getSemicolonKeyword_0_3()); 
            match(input,31,FOLLOW_31_in_rule__Menu__Group_0__3__Impl1312); 
             after(grammarAccess.getMenuAccess().getSemicolonKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_0__3__Impl"


    // $ANTLR start "rule__Menu__Group_1__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:653:1: rule__Menu__Group_1__0 : rule__Menu__Group_1__0__Impl rule__Menu__Group_1__1 ;
    public final void rule__Menu__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:657:1: ( rule__Menu__Group_1__0__Impl rule__Menu__Group_1__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:658:2: rule__Menu__Group_1__0__Impl rule__Menu__Group_1__1
            {
            pushFollow(FOLLOW_rule__Menu__Group_1__0__Impl_in_rule__Menu__Group_1__01351);
            rule__Menu__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_1__1_in_rule__Menu__Group_1__01354);
            rule__Menu__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_1__0"


    // $ANTLR start "rule__Menu__Group_1__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:665:1: rule__Menu__Group_1__0__Impl : ( 'type' ) ;
    public final void rule__Menu__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:669:1: ( ( 'type' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:670:1: ( 'type' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:670:1: ( 'type' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:671:1: 'type'
            {
             before(grammarAccess.getMenuAccess().getTypeKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Menu__Group_1__0__Impl1382); 
             after(grammarAccess.getMenuAccess().getTypeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_1__0__Impl"


    // $ANTLR start "rule__Menu__Group_1__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:684:1: rule__Menu__Group_1__1 : rule__Menu__Group_1__1__Impl rule__Menu__Group_1__2 ;
    public final void rule__Menu__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:688:1: ( rule__Menu__Group_1__1__Impl rule__Menu__Group_1__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:689:2: rule__Menu__Group_1__1__Impl rule__Menu__Group_1__2
            {
            pushFollow(FOLLOW_rule__Menu__Group_1__1__Impl_in_rule__Menu__Group_1__11413);
            rule__Menu__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_1__2_in_rule__Menu__Group_1__11416);
            rule__Menu__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_1__1"


    // $ANTLR start "rule__Menu__Group_1__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:696:1: rule__Menu__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Menu__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:700:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:701:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:701:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:702:1: '='
            {
             before(grammarAccess.getMenuAccess().getEqualsSignKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__Menu__Group_1__1__Impl1444); 
             after(grammarAccess.getMenuAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_1__1__Impl"


    // $ANTLR start "rule__Menu__Group_1__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:715:1: rule__Menu__Group_1__2 : rule__Menu__Group_1__2__Impl rule__Menu__Group_1__3 ;
    public final void rule__Menu__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:719:1: ( rule__Menu__Group_1__2__Impl rule__Menu__Group_1__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:720:2: rule__Menu__Group_1__2__Impl rule__Menu__Group_1__3
            {
            pushFollow(FOLLOW_rule__Menu__Group_1__2__Impl_in_rule__Menu__Group_1__21475);
            rule__Menu__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_1__3_in_rule__Menu__Group_1__21478);
            rule__Menu__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_1__2"


    // $ANTLR start "rule__Menu__Group_1__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:727:1: rule__Menu__Group_1__2__Impl : ( ( rule__Menu__TypeAssignment_1_2 ) ) ;
    public final void rule__Menu__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:731:1: ( ( ( rule__Menu__TypeAssignment_1_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:732:1: ( ( rule__Menu__TypeAssignment_1_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:732:1: ( ( rule__Menu__TypeAssignment_1_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:733:1: ( rule__Menu__TypeAssignment_1_2 )
            {
             before(grammarAccess.getMenuAccess().getTypeAssignment_1_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:734:1: ( rule__Menu__TypeAssignment_1_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:734:2: rule__Menu__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Menu__TypeAssignment_1_2_in_rule__Menu__Group_1__2__Impl1505);
            rule__Menu__TypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getTypeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_1__2__Impl"


    // $ANTLR start "rule__Menu__Group_1__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:744:1: rule__Menu__Group_1__3 : rule__Menu__Group_1__3__Impl ;
    public final void rule__Menu__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:748:1: ( rule__Menu__Group_1__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:749:2: rule__Menu__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Menu__Group_1__3__Impl_in_rule__Menu__Group_1__31535);
            rule__Menu__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_1__3"


    // $ANTLR start "rule__Menu__Group_1__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:755:1: rule__Menu__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Menu__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:759:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:760:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:760:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:761:1: ';'
            {
             before(grammarAccess.getMenuAccess().getSemicolonKeyword_1_3()); 
            match(input,31,FOLLOW_31_in_rule__Menu__Group_1__3__Impl1563); 
             after(grammarAccess.getMenuAccess().getSemicolonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_1__3__Impl"


    // $ANTLR start "rule__Menu__Group_2__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:782:1: rule__Menu__Group_2__0 : rule__Menu__Group_2__0__Impl rule__Menu__Group_2__1 ;
    public final void rule__Menu__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:786:1: ( rule__Menu__Group_2__0__Impl rule__Menu__Group_2__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:787:2: rule__Menu__Group_2__0__Impl rule__Menu__Group_2__1
            {
            pushFollow(FOLLOW_rule__Menu__Group_2__0__Impl_in_rule__Menu__Group_2__01602);
            rule__Menu__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_2__1_in_rule__Menu__Group_2__01605);
            rule__Menu__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_2__0"


    // $ANTLR start "rule__Menu__Group_2__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:794:1: rule__Menu__Group_2__0__Impl : ( 'style' ) ;
    public final void rule__Menu__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:798:1: ( ( 'style' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:799:1: ( 'style' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:799:1: ( 'style' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:800:1: 'style'
            {
             before(grammarAccess.getMenuAccess().getStyleKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Menu__Group_2__0__Impl1633); 
             after(grammarAccess.getMenuAccess().getStyleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_2__0__Impl"


    // $ANTLR start "rule__Menu__Group_2__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:813:1: rule__Menu__Group_2__1 : rule__Menu__Group_2__1__Impl rule__Menu__Group_2__2 ;
    public final void rule__Menu__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:817:1: ( rule__Menu__Group_2__1__Impl rule__Menu__Group_2__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:818:2: rule__Menu__Group_2__1__Impl rule__Menu__Group_2__2
            {
            pushFollow(FOLLOW_rule__Menu__Group_2__1__Impl_in_rule__Menu__Group_2__11664);
            rule__Menu__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_2__2_in_rule__Menu__Group_2__11667);
            rule__Menu__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_2__1"


    // $ANTLR start "rule__Menu__Group_2__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:825:1: rule__Menu__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Menu__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:829:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:830:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:830:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:831:1: '='
            {
             before(grammarAccess.getMenuAccess().getEqualsSignKeyword_2_1()); 
            match(input,30,FOLLOW_30_in_rule__Menu__Group_2__1__Impl1695); 
             after(grammarAccess.getMenuAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_2__1__Impl"


    // $ANTLR start "rule__Menu__Group_2__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:844:1: rule__Menu__Group_2__2 : rule__Menu__Group_2__2__Impl rule__Menu__Group_2__3 ;
    public final void rule__Menu__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:848:1: ( rule__Menu__Group_2__2__Impl rule__Menu__Group_2__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:849:2: rule__Menu__Group_2__2__Impl rule__Menu__Group_2__3
            {
            pushFollow(FOLLOW_rule__Menu__Group_2__2__Impl_in_rule__Menu__Group_2__21726);
            rule__Menu__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_2__3_in_rule__Menu__Group_2__21729);
            rule__Menu__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_2__2"


    // $ANTLR start "rule__Menu__Group_2__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:856:1: rule__Menu__Group_2__2__Impl : ( ( rule__Menu__StyleAssignment_2_2 ) ) ;
    public final void rule__Menu__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:860:1: ( ( ( rule__Menu__StyleAssignment_2_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:861:1: ( ( rule__Menu__StyleAssignment_2_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:861:1: ( ( rule__Menu__StyleAssignment_2_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:862:1: ( rule__Menu__StyleAssignment_2_2 )
            {
             before(grammarAccess.getMenuAccess().getStyleAssignment_2_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:863:1: ( rule__Menu__StyleAssignment_2_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:863:2: rule__Menu__StyleAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Menu__StyleAssignment_2_2_in_rule__Menu__Group_2__2__Impl1756);
            rule__Menu__StyleAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getStyleAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_2__2__Impl"


    // $ANTLR start "rule__Menu__Group_2__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:873:1: rule__Menu__Group_2__3 : rule__Menu__Group_2__3__Impl ;
    public final void rule__Menu__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:877:1: ( rule__Menu__Group_2__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:878:2: rule__Menu__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Menu__Group_2__3__Impl_in_rule__Menu__Group_2__31786);
            rule__Menu__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_2__3"


    // $ANTLR start "rule__Menu__Group_2__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:884:1: rule__Menu__Group_2__3__Impl : ( ';' ) ;
    public final void rule__Menu__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:888:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:889:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:889:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:890:1: ';'
            {
             before(grammarAccess.getMenuAccess().getSemicolonKeyword_2_3()); 
            match(input,31,FOLLOW_31_in_rule__Menu__Group_2__3__Impl1814); 
             after(grammarAccess.getMenuAccess().getSemicolonKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_2__3__Impl"


    // $ANTLR start "rule__Menu__Group_3__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:911:1: rule__Menu__Group_3__0 : rule__Menu__Group_3__0__Impl rule__Menu__Group_3__1 ;
    public final void rule__Menu__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:915:1: ( rule__Menu__Group_3__0__Impl rule__Menu__Group_3__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:916:2: rule__Menu__Group_3__0__Impl rule__Menu__Group_3__1
            {
            pushFollow(FOLLOW_rule__Menu__Group_3__0__Impl_in_rule__Menu__Group_3__01853);
            rule__Menu__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_3__1_in_rule__Menu__Group_3__01856);
            rule__Menu__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_3__0"


    // $ANTLR start "rule__Menu__Group_3__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:923:1: rule__Menu__Group_3__0__Impl : ( 'position' ) ;
    public final void rule__Menu__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:927:1: ( ( 'position' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:928:1: ( 'position' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:928:1: ( 'position' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:929:1: 'position'
            {
             before(grammarAccess.getMenuAccess().getPositionKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Menu__Group_3__0__Impl1884); 
             after(grammarAccess.getMenuAccess().getPositionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_3__0__Impl"


    // $ANTLR start "rule__Menu__Group_3__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:942:1: rule__Menu__Group_3__1 : rule__Menu__Group_3__1__Impl rule__Menu__Group_3__2 ;
    public final void rule__Menu__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:946:1: ( rule__Menu__Group_3__1__Impl rule__Menu__Group_3__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:947:2: rule__Menu__Group_3__1__Impl rule__Menu__Group_3__2
            {
            pushFollow(FOLLOW_rule__Menu__Group_3__1__Impl_in_rule__Menu__Group_3__11915);
            rule__Menu__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_3__2_in_rule__Menu__Group_3__11918);
            rule__Menu__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_3__1"


    // $ANTLR start "rule__Menu__Group_3__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:954:1: rule__Menu__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Menu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:958:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:959:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:959:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:960:1: '='
            {
             before(grammarAccess.getMenuAccess().getEqualsSignKeyword_3_1()); 
            match(input,30,FOLLOW_30_in_rule__Menu__Group_3__1__Impl1946); 
             after(grammarAccess.getMenuAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_3__1__Impl"


    // $ANTLR start "rule__Menu__Group_3__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:973:1: rule__Menu__Group_3__2 : rule__Menu__Group_3__2__Impl rule__Menu__Group_3__3 ;
    public final void rule__Menu__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:977:1: ( rule__Menu__Group_3__2__Impl rule__Menu__Group_3__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:978:2: rule__Menu__Group_3__2__Impl rule__Menu__Group_3__3
            {
            pushFollow(FOLLOW_rule__Menu__Group_3__2__Impl_in_rule__Menu__Group_3__21977);
            rule__Menu__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_3__3_in_rule__Menu__Group_3__21980);
            rule__Menu__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_3__2"


    // $ANTLR start "rule__Menu__Group_3__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:985:1: rule__Menu__Group_3__2__Impl : ( ( rule__Menu__PositionAssignment_3_2 ) ) ;
    public final void rule__Menu__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:989:1: ( ( ( rule__Menu__PositionAssignment_3_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:990:1: ( ( rule__Menu__PositionAssignment_3_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:990:1: ( ( rule__Menu__PositionAssignment_3_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:991:1: ( rule__Menu__PositionAssignment_3_2 )
            {
             before(grammarAccess.getMenuAccess().getPositionAssignment_3_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:992:1: ( rule__Menu__PositionAssignment_3_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:992:2: rule__Menu__PositionAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Menu__PositionAssignment_3_2_in_rule__Menu__Group_3__2__Impl2007);
            rule__Menu__PositionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getPositionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_3__2__Impl"


    // $ANTLR start "rule__Menu__Group_3__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1002:1: rule__Menu__Group_3__3 : rule__Menu__Group_3__3__Impl ;
    public final void rule__Menu__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1006:1: ( rule__Menu__Group_3__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1007:2: rule__Menu__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Menu__Group_3__3__Impl_in_rule__Menu__Group_3__32037);
            rule__Menu__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_3__3"


    // $ANTLR start "rule__Menu__Group_3__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1013:1: rule__Menu__Group_3__3__Impl : ( ';' ) ;
    public final void rule__Menu__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1017:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1018:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1018:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1019:1: ';'
            {
             before(grammarAccess.getMenuAccess().getSemicolonKeyword_3_3()); 
            match(input,31,FOLLOW_31_in_rule__Menu__Group_3__3__Impl2065); 
             after(grammarAccess.getMenuAccess().getSemicolonKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_3__3__Impl"


    // $ANTLR start "rule__Menu__Group_4__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1040:1: rule__Menu__Group_4__0 : rule__Menu__Group_4__0__Impl rule__Menu__Group_4__1 ;
    public final void rule__Menu__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1044:1: ( rule__Menu__Group_4__0__Impl rule__Menu__Group_4__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1045:2: rule__Menu__Group_4__0__Impl rule__Menu__Group_4__1
            {
            pushFollow(FOLLOW_rule__Menu__Group_4__0__Impl_in_rule__Menu__Group_4__02104);
            rule__Menu__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_4__1_in_rule__Menu__Group_4__02107);
            rule__Menu__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__0"


    // $ANTLR start "rule__Menu__Group_4__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1052:1: rule__Menu__Group_4__0__Impl : ( 'class' ) ;
    public final void rule__Menu__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1056:1: ( ( 'class' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1057:1: ( 'class' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1057:1: ( 'class' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1058:1: 'class'
            {
             before(grammarAccess.getMenuAccess().getClassKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__Menu__Group_4__0__Impl2135); 
             after(grammarAccess.getMenuAccess().getClassKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__0__Impl"


    // $ANTLR start "rule__Menu__Group_4__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1071:1: rule__Menu__Group_4__1 : rule__Menu__Group_4__1__Impl rule__Menu__Group_4__2 ;
    public final void rule__Menu__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1075:1: ( rule__Menu__Group_4__1__Impl rule__Menu__Group_4__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1076:2: rule__Menu__Group_4__1__Impl rule__Menu__Group_4__2
            {
            pushFollow(FOLLOW_rule__Menu__Group_4__1__Impl_in_rule__Menu__Group_4__12166);
            rule__Menu__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_4__2_in_rule__Menu__Group_4__12169);
            rule__Menu__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__1"


    // $ANTLR start "rule__Menu__Group_4__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1083:1: rule__Menu__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Menu__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1087:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1088:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1088:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1089:1: '='
            {
             before(grammarAccess.getMenuAccess().getEqualsSignKeyword_4_1()); 
            match(input,30,FOLLOW_30_in_rule__Menu__Group_4__1__Impl2197); 
             after(grammarAccess.getMenuAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__1__Impl"


    // $ANTLR start "rule__Menu__Group_4__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1102:1: rule__Menu__Group_4__2 : rule__Menu__Group_4__2__Impl rule__Menu__Group_4__3 ;
    public final void rule__Menu__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1106:1: ( rule__Menu__Group_4__2__Impl rule__Menu__Group_4__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1107:2: rule__Menu__Group_4__2__Impl rule__Menu__Group_4__3
            {
            pushFollow(FOLLOW_rule__Menu__Group_4__2__Impl_in_rule__Menu__Group_4__22228);
            rule__Menu__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_4__3_in_rule__Menu__Group_4__22231);
            rule__Menu__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__2"


    // $ANTLR start "rule__Menu__Group_4__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1114:1: rule__Menu__Group_4__2__Impl : ( ( rule__Menu__DecoratorAssignment_4_2 ) ) ;
    public final void rule__Menu__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1118:1: ( ( ( rule__Menu__DecoratorAssignment_4_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1119:1: ( ( rule__Menu__DecoratorAssignment_4_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1119:1: ( ( rule__Menu__DecoratorAssignment_4_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1120:1: ( rule__Menu__DecoratorAssignment_4_2 )
            {
             before(grammarAccess.getMenuAccess().getDecoratorAssignment_4_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1121:1: ( rule__Menu__DecoratorAssignment_4_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1121:2: rule__Menu__DecoratorAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Menu__DecoratorAssignment_4_2_in_rule__Menu__Group_4__2__Impl2258);
            rule__Menu__DecoratorAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getDecoratorAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__2__Impl"


    // $ANTLR start "rule__Menu__Group_4__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1131:1: rule__Menu__Group_4__3 : rule__Menu__Group_4__3__Impl ;
    public final void rule__Menu__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1135:1: ( rule__Menu__Group_4__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1136:2: rule__Menu__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Menu__Group_4__3__Impl_in_rule__Menu__Group_4__32288);
            rule__Menu__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__3"


    // $ANTLR start "rule__Menu__Group_4__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1142:1: rule__Menu__Group_4__3__Impl : ( ';' ) ;
    public final void rule__Menu__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1146:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1147:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1147:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1148:1: ';'
            {
             before(grammarAccess.getMenuAccess().getSemicolonKeyword_4_3()); 
            match(input,31,FOLLOW_31_in_rule__Menu__Group_4__3__Impl2316); 
             after(grammarAccess.getMenuAccess().getSemicolonKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__3__Impl"


    // $ANTLR start "rule__Menu__Group_5__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1169:1: rule__Menu__Group_5__0 : rule__Menu__Group_5__0__Impl rule__Menu__Group_5__1 ;
    public final void rule__Menu__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1173:1: ( rule__Menu__Group_5__0__Impl rule__Menu__Group_5__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1174:2: rule__Menu__Group_5__0__Impl rule__Menu__Group_5__1
            {
            pushFollow(FOLLOW_rule__Menu__Group_5__0__Impl_in_rule__Menu__Group_5__02355);
            rule__Menu__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_5__1_in_rule__Menu__Group_5__02358);
            rule__Menu__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_5__0"


    // $ANTLR start "rule__Menu__Group_5__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1181:1: rule__Menu__Group_5__0__Impl : ( 'config' ) ;
    public final void rule__Menu__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1185:1: ( ( 'config' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1186:1: ( 'config' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1186:1: ( 'config' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1187:1: 'config'
            {
             before(grammarAccess.getMenuAccess().getConfigKeyword_5_0()); 
            match(input,36,FOLLOW_36_in_rule__Menu__Group_5__0__Impl2386); 
             after(grammarAccess.getMenuAccess().getConfigKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_5__0__Impl"


    // $ANTLR start "rule__Menu__Group_5__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1200:1: rule__Menu__Group_5__1 : rule__Menu__Group_5__1__Impl rule__Menu__Group_5__2 ;
    public final void rule__Menu__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1204:1: ( rule__Menu__Group_5__1__Impl rule__Menu__Group_5__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1205:2: rule__Menu__Group_5__1__Impl rule__Menu__Group_5__2
            {
            pushFollow(FOLLOW_rule__Menu__Group_5__1__Impl_in_rule__Menu__Group_5__12417);
            rule__Menu__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_5__2_in_rule__Menu__Group_5__12420);
            rule__Menu__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_5__1"


    // $ANTLR start "rule__Menu__Group_5__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1212:1: rule__Menu__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Menu__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1216:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1217:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1217:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1218:1: '='
            {
             before(grammarAccess.getMenuAccess().getEqualsSignKeyword_5_1()); 
            match(input,30,FOLLOW_30_in_rule__Menu__Group_5__1__Impl2448); 
             after(grammarAccess.getMenuAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_5__1__Impl"


    // $ANTLR start "rule__Menu__Group_5__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1231:1: rule__Menu__Group_5__2 : rule__Menu__Group_5__2__Impl rule__Menu__Group_5__3 ;
    public final void rule__Menu__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1235:1: ( rule__Menu__Group_5__2__Impl rule__Menu__Group_5__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1236:2: rule__Menu__Group_5__2__Impl rule__Menu__Group_5__3
            {
            pushFollow(FOLLOW_rule__Menu__Group_5__2__Impl_in_rule__Menu__Group_5__22479);
            rule__Menu__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_5__3_in_rule__Menu__Group_5__22482);
            rule__Menu__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_5__2"


    // $ANTLR start "rule__Menu__Group_5__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1243:1: rule__Menu__Group_5__2__Impl : ( '[' ) ;
    public final void rule__Menu__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1247:1: ( ( '[' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1248:1: ( '[' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1248:1: ( '[' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1249:1: '['
            {
             before(grammarAccess.getMenuAccess().getLeftSquareBracketKeyword_5_2()); 
            match(input,37,FOLLOW_37_in_rule__Menu__Group_5__2__Impl2510); 
             after(grammarAccess.getMenuAccess().getLeftSquareBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_5__2__Impl"


    // $ANTLR start "rule__Menu__Group_5__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1262:1: rule__Menu__Group_5__3 : rule__Menu__Group_5__3__Impl rule__Menu__Group_5__4 ;
    public final void rule__Menu__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1266:1: ( rule__Menu__Group_5__3__Impl rule__Menu__Group_5__4 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1267:2: rule__Menu__Group_5__3__Impl rule__Menu__Group_5__4
            {
            pushFollow(FOLLOW_rule__Menu__Group_5__3__Impl_in_rule__Menu__Group_5__32541);
            rule__Menu__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_5__4_in_rule__Menu__Group_5__32544);
            rule__Menu__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_5__3"


    // $ANTLR start "rule__Menu__Group_5__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1274:1: rule__Menu__Group_5__3__Impl : ( ( rule__Menu__ConfigurationAssignment_5_3 ) ) ;
    public final void rule__Menu__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1278:1: ( ( ( rule__Menu__ConfigurationAssignment_5_3 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1279:1: ( ( rule__Menu__ConfigurationAssignment_5_3 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1279:1: ( ( rule__Menu__ConfigurationAssignment_5_3 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1280:1: ( rule__Menu__ConfigurationAssignment_5_3 )
            {
             before(grammarAccess.getMenuAccess().getConfigurationAssignment_5_3()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1281:1: ( rule__Menu__ConfigurationAssignment_5_3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1281:2: rule__Menu__ConfigurationAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Menu__ConfigurationAssignment_5_3_in_rule__Menu__Group_5__3__Impl2571);
            rule__Menu__ConfigurationAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getConfigurationAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_5__3__Impl"


    // $ANTLR start "rule__Menu__Group_5__4"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1291:1: rule__Menu__Group_5__4 : rule__Menu__Group_5__4__Impl rule__Menu__Group_5__5 ;
    public final void rule__Menu__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1295:1: ( rule__Menu__Group_5__4__Impl rule__Menu__Group_5__5 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1296:2: rule__Menu__Group_5__4__Impl rule__Menu__Group_5__5
            {
            pushFollow(FOLLOW_rule__Menu__Group_5__4__Impl_in_rule__Menu__Group_5__42601);
            rule__Menu__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_5__5_in_rule__Menu__Group_5__42604);
            rule__Menu__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_5__4"


    // $ANTLR start "rule__Menu__Group_5__4__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1303:1: rule__Menu__Group_5__4__Impl : ( ']' ) ;
    public final void rule__Menu__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1307:1: ( ( ']' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1308:1: ( ']' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1308:1: ( ']' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1309:1: ']'
            {
             before(grammarAccess.getMenuAccess().getRightSquareBracketKeyword_5_4()); 
            match(input,38,FOLLOW_38_in_rule__Menu__Group_5__4__Impl2632); 
             after(grammarAccess.getMenuAccess().getRightSquareBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_5__4__Impl"


    // $ANTLR start "rule__Menu__Group_5__5"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1322:1: rule__Menu__Group_5__5 : rule__Menu__Group_5__5__Impl ;
    public final void rule__Menu__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1326:1: ( rule__Menu__Group_5__5__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1327:2: rule__Menu__Group_5__5__Impl
            {
            pushFollow(FOLLOW_rule__Menu__Group_5__5__Impl_in_rule__Menu__Group_5__52663);
            rule__Menu__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_5__5"


    // $ANTLR start "rule__Menu__Group_5__5__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1333:1: rule__Menu__Group_5__5__Impl : ( ';' ) ;
    public final void rule__Menu__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1337:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1338:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1338:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1339:1: ';'
            {
             before(grammarAccess.getMenuAccess().getSemicolonKeyword_5_5()); 
            match(input,31,FOLLOW_31_in_rule__Menu__Group_5__5__Impl2691); 
             after(grammarAccess.getMenuAccess().getSemicolonKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_5__5__Impl"


    // $ANTLR start "rule__Menu__Group_6__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1364:1: rule__Menu__Group_6__0 : rule__Menu__Group_6__0__Impl rule__Menu__Group_6__1 ;
    public final void rule__Menu__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1368:1: ( rule__Menu__Group_6__0__Impl rule__Menu__Group_6__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1369:2: rule__Menu__Group_6__0__Impl rule__Menu__Group_6__1
            {
            pushFollow(FOLLOW_rule__Menu__Group_6__0__Impl_in_rule__Menu__Group_6__02734);
            rule__Menu__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_6__1_in_rule__Menu__Group_6__02737);
            rule__Menu__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__0"


    // $ANTLR start "rule__Menu__Group_6__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1376:1: rule__Menu__Group_6__0__Impl : ( 'items' ) ;
    public final void rule__Menu__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1380:1: ( ( 'items' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1381:1: ( 'items' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1381:1: ( 'items' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1382:1: 'items'
            {
             before(grammarAccess.getMenuAccess().getItemsKeyword_6_0()); 
            match(input,39,FOLLOW_39_in_rule__Menu__Group_6__0__Impl2765); 
             after(grammarAccess.getMenuAccess().getItemsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__0__Impl"


    // $ANTLR start "rule__Menu__Group_6__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1395:1: rule__Menu__Group_6__1 : rule__Menu__Group_6__1__Impl rule__Menu__Group_6__2 ;
    public final void rule__Menu__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1399:1: ( rule__Menu__Group_6__1__Impl rule__Menu__Group_6__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1400:2: rule__Menu__Group_6__1__Impl rule__Menu__Group_6__2
            {
            pushFollow(FOLLOW_rule__Menu__Group_6__1__Impl_in_rule__Menu__Group_6__12796);
            rule__Menu__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_6__2_in_rule__Menu__Group_6__12799);
            rule__Menu__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__1"


    // $ANTLR start "rule__Menu__Group_6__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1407:1: rule__Menu__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Menu__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1411:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1412:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1412:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1413:1: '='
            {
             before(grammarAccess.getMenuAccess().getEqualsSignKeyword_6_1()); 
            match(input,30,FOLLOW_30_in_rule__Menu__Group_6__1__Impl2827); 
             after(grammarAccess.getMenuAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__1__Impl"


    // $ANTLR start "rule__Menu__Group_6__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1426:1: rule__Menu__Group_6__2 : rule__Menu__Group_6__2__Impl rule__Menu__Group_6__3 ;
    public final void rule__Menu__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1430:1: ( rule__Menu__Group_6__2__Impl rule__Menu__Group_6__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1431:2: rule__Menu__Group_6__2__Impl rule__Menu__Group_6__3
            {
            pushFollow(FOLLOW_rule__Menu__Group_6__2__Impl_in_rule__Menu__Group_6__22858);
            rule__Menu__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_6__3_in_rule__Menu__Group_6__22861);
            rule__Menu__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__2"


    // $ANTLR start "rule__Menu__Group_6__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1438:1: rule__Menu__Group_6__2__Impl : ( '[' ) ;
    public final void rule__Menu__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1442:1: ( ( '[' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1443:1: ( '[' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1443:1: ( '[' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1444:1: '['
            {
             before(grammarAccess.getMenuAccess().getLeftSquareBracketKeyword_6_2()); 
            match(input,37,FOLLOW_37_in_rule__Menu__Group_6__2__Impl2889); 
             after(grammarAccess.getMenuAccess().getLeftSquareBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__2__Impl"


    // $ANTLR start "rule__Menu__Group_6__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1457:1: rule__Menu__Group_6__3 : rule__Menu__Group_6__3__Impl rule__Menu__Group_6__4 ;
    public final void rule__Menu__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1461:1: ( rule__Menu__Group_6__3__Impl rule__Menu__Group_6__4 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1462:2: rule__Menu__Group_6__3__Impl rule__Menu__Group_6__4
            {
            pushFollow(FOLLOW_rule__Menu__Group_6__3__Impl_in_rule__Menu__Group_6__32920);
            rule__Menu__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_6__4_in_rule__Menu__Group_6__32923);
            rule__Menu__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__3"


    // $ANTLR start "rule__Menu__Group_6__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1469:1: rule__Menu__Group_6__3__Impl : ( ( rule__Menu__ItemsAssignment_6_3 ) ) ;
    public final void rule__Menu__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1473:1: ( ( ( rule__Menu__ItemsAssignment_6_3 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1474:1: ( ( rule__Menu__ItemsAssignment_6_3 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1474:1: ( ( rule__Menu__ItemsAssignment_6_3 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1475:1: ( rule__Menu__ItemsAssignment_6_3 )
            {
             before(grammarAccess.getMenuAccess().getItemsAssignment_6_3()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1476:1: ( rule__Menu__ItemsAssignment_6_3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1476:2: rule__Menu__ItemsAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Menu__ItemsAssignment_6_3_in_rule__Menu__Group_6__3__Impl2950);
            rule__Menu__ItemsAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getItemsAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__3__Impl"


    // $ANTLR start "rule__Menu__Group_6__4"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1486:1: rule__Menu__Group_6__4 : rule__Menu__Group_6__4__Impl rule__Menu__Group_6__5 ;
    public final void rule__Menu__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1490:1: ( rule__Menu__Group_6__4__Impl rule__Menu__Group_6__5 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1491:2: rule__Menu__Group_6__4__Impl rule__Menu__Group_6__5
            {
            pushFollow(FOLLOW_rule__Menu__Group_6__4__Impl_in_rule__Menu__Group_6__42980);
            rule__Menu__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_6__5_in_rule__Menu__Group_6__42983);
            rule__Menu__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__4"


    // $ANTLR start "rule__Menu__Group_6__4__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1498:1: rule__Menu__Group_6__4__Impl : ( ( rule__Menu__Group_6_4__0 )* ) ;
    public final void rule__Menu__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1502:1: ( ( ( rule__Menu__Group_6_4__0 )* ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1503:1: ( ( rule__Menu__Group_6_4__0 )* )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1503:1: ( ( rule__Menu__Group_6_4__0 )* )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1504:1: ( rule__Menu__Group_6_4__0 )*
            {
             before(grammarAccess.getMenuAccess().getGroup_6_4()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1505:1: ( rule__Menu__Group_6_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==40) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1505:2: rule__Menu__Group_6_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Menu__Group_6_4__0_in_rule__Menu__Group_6__4__Impl3010);
            	    rule__Menu__Group_6_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMenuAccess().getGroup_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__4__Impl"


    // $ANTLR start "rule__Menu__Group_6__5"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1515:1: rule__Menu__Group_6__5 : rule__Menu__Group_6__5__Impl rule__Menu__Group_6__6 ;
    public final void rule__Menu__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1519:1: ( rule__Menu__Group_6__5__Impl rule__Menu__Group_6__6 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1520:2: rule__Menu__Group_6__5__Impl rule__Menu__Group_6__6
            {
            pushFollow(FOLLOW_rule__Menu__Group_6__5__Impl_in_rule__Menu__Group_6__53041);
            rule__Menu__Group_6__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_6__6_in_rule__Menu__Group_6__53044);
            rule__Menu__Group_6__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__5"


    // $ANTLR start "rule__Menu__Group_6__5__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1527:1: rule__Menu__Group_6__5__Impl : ( ']' ) ;
    public final void rule__Menu__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1531:1: ( ( ']' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1532:1: ( ']' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1532:1: ( ']' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1533:1: ']'
            {
             before(grammarAccess.getMenuAccess().getRightSquareBracketKeyword_6_5()); 
            match(input,38,FOLLOW_38_in_rule__Menu__Group_6__5__Impl3072); 
             after(grammarAccess.getMenuAccess().getRightSquareBracketKeyword_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__5__Impl"


    // $ANTLR start "rule__Menu__Group_6__6"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1546:1: rule__Menu__Group_6__6 : rule__Menu__Group_6__6__Impl ;
    public final void rule__Menu__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1550:1: ( rule__Menu__Group_6__6__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1551:2: rule__Menu__Group_6__6__Impl
            {
            pushFollow(FOLLOW_rule__Menu__Group_6__6__Impl_in_rule__Menu__Group_6__63103);
            rule__Menu__Group_6__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__6"


    // $ANTLR start "rule__Menu__Group_6__6__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1557:1: rule__Menu__Group_6__6__Impl : ( ';' ) ;
    public final void rule__Menu__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1561:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1562:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1562:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1563:1: ';'
            {
             before(grammarAccess.getMenuAccess().getSemicolonKeyword_6_6()); 
            match(input,31,FOLLOW_31_in_rule__Menu__Group_6__6__Impl3131); 
             after(grammarAccess.getMenuAccess().getSemicolonKeyword_6_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6__6__Impl"


    // $ANTLR start "rule__Menu__Group_6_4__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1590:1: rule__Menu__Group_6_4__0 : rule__Menu__Group_6_4__0__Impl rule__Menu__Group_6_4__1 ;
    public final void rule__Menu__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1594:1: ( rule__Menu__Group_6_4__0__Impl rule__Menu__Group_6_4__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1595:2: rule__Menu__Group_6_4__0__Impl rule__Menu__Group_6_4__1
            {
            pushFollow(FOLLOW_rule__Menu__Group_6_4__0__Impl_in_rule__Menu__Group_6_4__03176);
            rule__Menu__Group_6_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Menu__Group_6_4__1_in_rule__Menu__Group_6_4__03179);
            rule__Menu__Group_6_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6_4__0"


    // $ANTLR start "rule__Menu__Group_6_4__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1602:1: rule__Menu__Group_6_4__0__Impl : ( ',' ) ;
    public final void rule__Menu__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1606:1: ( ( ',' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1607:1: ( ',' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1607:1: ( ',' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1608:1: ','
            {
             before(grammarAccess.getMenuAccess().getCommaKeyword_6_4_0()); 
            match(input,40,FOLLOW_40_in_rule__Menu__Group_6_4__0__Impl3207); 
             after(grammarAccess.getMenuAccess().getCommaKeyword_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6_4__0__Impl"


    // $ANTLR start "rule__Menu__Group_6_4__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1621:1: rule__Menu__Group_6_4__1 : rule__Menu__Group_6_4__1__Impl ;
    public final void rule__Menu__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1625:1: ( rule__Menu__Group_6_4__1__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1626:2: rule__Menu__Group_6_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Menu__Group_6_4__1__Impl_in_rule__Menu__Group_6_4__13238);
            rule__Menu__Group_6_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6_4__1"


    // $ANTLR start "rule__Menu__Group_6_4__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1632:1: rule__Menu__Group_6_4__1__Impl : ( ( rule__Menu__ItemsAssignment_6_4_1 ) ) ;
    public final void rule__Menu__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1636:1: ( ( ( rule__Menu__ItemsAssignment_6_4_1 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1637:1: ( ( rule__Menu__ItemsAssignment_6_4_1 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1637:1: ( ( rule__Menu__ItemsAssignment_6_4_1 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1638:1: ( rule__Menu__ItemsAssignment_6_4_1 )
            {
             before(grammarAccess.getMenuAccess().getItemsAssignment_6_4_1()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1639:1: ( rule__Menu__ItemsAssignment_6_4_1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1639:2: rule__Menu__ItemsAssignment_6_4_1
            {
            pushFollow(FOLLOW_rule__Menu__ItemsAssignment_6_4_1_in_rule__Menu__Group_6_4__1__Impl3265);
            rule__Menu__ItemsAssignment_6_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getItemsAssignment_6_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_6_4__1__Impl"


    // $ANTLR start "rule__Configurations__Group__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1653:1: rule__Configurations__Group__0 : rule__Configurations__Group__0__Impl rule__Configurations__Group__1 ;
    public final void rule__Configurations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1657:1: ( rule__Configurations__Group__0__Impl rule__Configurations__Group__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1658:2: rule__Configurations__Group__0__Impl rule__Configurations__Group__1
            {
            pushFollow(FOLLOW_rule__Configurations__Group__0__Impl_in_rule__Configurations__Group__03299);
            rule__Configurations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configurations__Group__1_in_rule__Configurations__Group__03302);
            rule__Configurations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group__0"


    // $ANTLR start "rule__Configurations__Group__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1665:1: rule__Configurations__Group__0__Impl : ( ( rule__Configurations__Alternatives_0 ) ) ;
    public final void rule__Configurations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1669:1: ( ( ( rule__Configurations__Alternatives_0 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1670:1: ( ( rule__Configurations__Alternatives_0 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1670:1: ( ( rule__Configurations__Alternatives_0 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1671:1: ( rule__Configurations__Alternatives_0 )
            {
             before(grammarAccess.getConfigurationsAccess().getAlternatives_0()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1672:1: ( rule__Configurations__Alternatives_0 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1672:2: rule__Configurations__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Configurations__Alternatives_0_in_rule__Configurations__Group__0__Impl3329);
            rule__Configurations__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group__0__Impl"


    // $ANTLR start "rule__Configurations__Group__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1682:1: rule__Configurations__Group__1 : rule__Configurations__Group__1__Impl ;
    public final void rule__Configurations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1686:1: ( rule__Configurations__Group__1__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1687:2: rule__Configurations__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Configurations__Group__1__Impl_in_rule__Configurations__Group__13359);
            rule__Configurations__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group__1"


    // $ANTLR start "rule__Configurations__Group__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1693:1: rule__Configurations__Group__1__Impl : ( ( rule__Configurations__Alternatives_1 )* ) ;
    public final void rule__Configurations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1697:1: ( ( ( rule__Configurations__Alternatives_1 )* ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1698:1: ( ( rule__Configurations__Alternatives_1 )* )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1698:1: ( ( rule__Configurations__Alternatives_1 )* )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1699:1: ( rule__Configurations__Alternatives_1 )*
            {
             before(grammarAccess.getConfigurationsAccess().getAlternatives_1()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1700:1: ( rule__Configurations__Alternatives_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==40) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1700:2: rule__Configurations__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Configurations__Alternatives_1_in_rule__Configurations__Group__1__Impl3386);
            	    rule__Configurations__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getConfigurationsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group__1__Impl"


    // $ANTLR start "rule__Configurations__Group_0_0__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1714:1: rule__Configurations__Group_0_0__0 : rule__Configurations__Group_0_0__0__Impl rule__Configurations__Group_0_0__1 ;
    public final void rule__Configurations__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1718:1: ( rule__Configurations__Group_0_0__0__Impl rule__Configurations__Group_0_0__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1719:2: rule__Configurations__Group_0_0__0__Impl rule__Configurations__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Configurations__Group_0_0__0__Impl_in_rule__Configurations__Group_0_0__03421);
            rule__Configurations__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configurations__Group_0_0__1_in_rule__Configurations__Group_0_0__03424);
            rule__Configurations__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_0_0__0"


    // $ANTLR start "rule__Configurations__Group_0_0__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1726:1: rule__Configurations__Group_0_0__0__Impl : ( 'top' ) ;
    public final void rule__Configurations__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1730:1: ( ( 'top' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1731:1: ( 'top' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1731:1: ( 'top' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1732:1: 'top'
            {
             before(grammarAccess.getConfigurationsAccess().getTopKeyword_0_0_0()); 
            match(input,41,FOLLOW_41_in_rule__Configurations__Group_0_0__0__Impl3452); 
             after(grammarAccess.getConfigurationsAccess().getTopKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_0_0__0__Impl"


    // $ANTLR start "rule__Configurations__Group_0_0__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1745:1: rule__Configurations__Group_0_0__1 : rule__Configurations__Group_0_0__1__Impl ;
    public final void rule__Configurations__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1749:1: ( rule__Configurations__Group_0_0__1__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1750:2: rule__Configurations__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Configurations__Group_0_0__1__Impl_in_rule__Configurations__Group_0_0__13483);
            rule__Configurations__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_0_0__1"


    // $ANTLR start "rule__Configurations__Group_0_0__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1756:1: rule__Configurations__Group_0_0__1__Impl : ( ( rule__Configurations__Config_topAssignment_0_0_1 ) ) ;
    public final void rule__Configurations__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1760:1: ( ( ( rule__Configurations__Config_topAssignment_0_0_1 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1761:1: ( ( rule__Configurations__Config_topAssignment_0_0_1 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1761:1: ( ( rule__Configurations__Config_topAssignment_0_0_1 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1762:1: ( rule__Configurations__Config_topAssignment_0_0_1 )
            {
             before(grammarAccess.getConfigurationsAccess().getConfig_topAssignment_0_0_1()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1763:1: ( rule__Configurations__Config_topAssignment_0_0_1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1763:2: rule__Configurations__Config_topAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Configurations__Config_topAssignment_0_0_1_in_rule__Configurations__Group_0_0__1__Impl3510);
            rule__Configurations__Config_topAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationsAccess().getConfig_topAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_0_0__1__Impl"


    // $ANTLR start "rule__Configurations__Group_0_1__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1777:1: rule__Configurations__Group_0_1__0 : rule__Configurations__Group_0_1__0__Impl rule__Configurations__Group_0_1__1 ;
    public final void rule__Configurations__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1781:1: ( rule__Configurations__Group_0_1__0__Impl rule__Configurations__Group_0_1__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1782:2: rule__Configurations__Group_0_1__0__Impl rule__Configurations__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Configurations__Group_0_1__0__Impl_in_rule__Configurations__Group_0_1__03544);
            rule__Configurations__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configurations__Group_0_1__1_in_rule__Configurations__Group_0_1__03547);
            rule__Configurations__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_0_1__0"


    // $ANTLR start "rule__Configurations__Group_0_1__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1789:1: rule__Configurations__Group_0_1__0__Impl : ( 'children' ) ;
    public final void rule__Configurations__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1793:1: ( ( 'children' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1794:1: ( 'children' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1794:1: ( 'children' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1795:1: 'children'
            {
             before(grammarAccess.getConfigurationsAccess().getChildrenKeyword_0_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Configurations__Group_0_1__0__Impl3575); 
             after(grammarAccess.getConfigurationsAccess().getChildrenKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_0_1__0__Impl"


    // $ANTLR start "rule__Configurations__Group_0_1__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1808:1: rule__Configurations__Group_0_1__1 : rule__Configurations__Group_0_1__1__Impl ;
    public final void rule__Configurations__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1812:1: ( rule__Configurations__Group_0_1__1__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1813:2: rule__Configurations__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Configurations__Group_0_1__1__Impl_in_rule__Configurations__Group_0_1__13606);
            rule__Configurations__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_0_1__1"


    // $ANTLR start "rule__Configurations__Group_0_1__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1819:1: rule__Configurations__Group_0_1__1__Impl : ( ( rule__Configurations__Config_childrenAssignment_0_1_1 ) ) ;
    public final void rule__Configurations__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1823:1: ( ( ( rule__Configurations__Config_childrenAssignment_0_1_1 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1824:1: ( ( rule__Configurations__Config_childrenAssignment_0_1_1 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1824:1: ( ( rule__Configurations__Config_childrenAssignment_0_1_1 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1825:1: ( rule__Configurations__Config_childrenAssignment_0_1_1 )
            {
             before(grammarAccess.getConfigurationsAccess().getConfig_childrenAssignment_0_1_1()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1826:1: ( rule__Configurations__Config_childrenAssignment_0_1_1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1826:2: rule__Configurations__Config_childrenAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Configurations__Config_childrenAssignment_0_1_1_in_rule__Configurations__Group_0_1__1__Impl3633);
            rule__Configurations__Config_childrenAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationsAccess().getConfig_childrenAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_0_1__1__Impl"


    // $ANTLR start "rule__Configurations__Group_1_0__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1840:1: rule__Configurations__Group_1_0__0 : rule__Configurations__Group_1_0__0__Impl rule__Configurations__Group_1_0__1 ;
    public final void rule__Configurations__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1844:1: ( rule__Configurations__Group_1_0__0__Impl rule__Configurations__Group_1_0__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1845:2: rule__Configurations__Group_1_0__0__Impl rule__Configurations__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Configurations__Group_1_0__0__Impl_in_rule__Configurations__Group_1_0__03667);
            rule__Configurations__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configurations__Group_1_0__1_in_rule__Configurations__Group_1_0__03670);
            rule__Configurations__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_1_0__0"


    // $ANTLR start "rule__Configurations__Group_1_0__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1852:1: rule__Configurations__Group_1_0__0__Impl : ( ',' ) ;
    public final void rule__Configurations__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1856:1: ( ( ',' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1857:1: ( ',' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1857:1: ( ',' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1858:1: ','
            {
             before(grammarAccess.getConfigurationsAccess().getCommaKeyword_1_0_0()); 
            match(input,40,FOLLOW_40_in_rule__Configurations__Group_1_0__0__Impl3698); 
             after(grammarAccess.getConfigurationsAccess().getCommaKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_1_0__0__Impl"


    // $ANTLR start "rule__Configurations__Group_1_0__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1871:1: rule__Configurations__Group_1_0__1 : rule__Configurations__Group_1_0__1__Impl rule__Configurations__Group_1_0__2 ;
    public final void rule__Configurations__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1875:1: ( rule__Configurations__Group_1_0__1__Impl rule__Configurations__Group_1_0__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1876:2: rule__Configurations__Group_1_0__1__Impl rule__Configurations__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Configurations__Group_1_0__1__Impl_in_rule__Configurations__Group_1_0__13729);
            rule__Configurations__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configurations__Group_1_0__2_in_rule__Configurations__Group_1_0__13732);
            rule__Configurations__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_1_0__1"


    // $ANTLR start "rule__Configurations__Group_1_0__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1883:1: rule__Configurations__Group_1_0__1__Impl : ( 'top' ) ;
    public final void rule__Configurations__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1887:1: ( ( 'top' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1888:1: ( 'top' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1888:1: ( 'top' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1889:1: 'top'
            {
             before(grammarAccess.getConfigurationsAccess().getTopKeyword_1_0_1()); 
            match(input,41,FOLLOW_41_in_rule__Configurations__Group_1_0__1__Impl3760); 
             after(grammarAccess.getConfigurationsAccess().getTopKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_1_0__1__Impl"


    // $ANTLR start "rule__Configurations__Group_1_0__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1902:1: rule__Configurations__Group_1_0__2 : rule__Configurations__Group_1_0__2__Impl ;
    public final void rule__Configurations__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1906:1: ( rule__Configurations__Group_1_0__2__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1907:2: rule__Configurations__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Configurations__Group_1_0__2__Impl_in_rule__Configurations__Group_1_0__23791);
            rule__Configurations__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_1_0__2"


    // $ANTLR start "rule__Configurations__Group_1_0__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1913:1: rule__Configurations__Group_1_0__2__Impl : ( ( rule__Configurations__Config_topAssignment_1_0_2 ) ) ;
    public final void rule__Configurations__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1917:1: ( ( ( rule__Configurations__Config_topAssignment_1_0_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1918:1: ( ( rule__Configurations__Config_topAssignment_1_0_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1918:1: ( ( rule__Configurations__Config_topAssignment_1_0_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1919:1: ( rule__Configurations__Config_topAssignment_1_0_2 )
            {
             before(grammarAccess.getConfigurationsAccess().getConfig_topAssignment_1_0_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1920:1: ( rule__Configurations__Config_topAssignment_1_0_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1920:2: rule__Configurations__Config_topAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Configurations__Config_topAssignment_1_0_2_in_rule__Configurations__Group_1_0__2__Impl3818);
            rule__Configurations__Config_topAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationsAccess().getConfig_topAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_1_0__2__Impl"


    // $ANTLR start "rule__Configurations__Group_1_1__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1936:1: rule__Configurations__Group_1_1__0 : rule__Configurations__Group_1_1__0__Impl rule__Configurations__Group_1_1__1 ;
    public final void rule__Configurations__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1940:1: ( rule__Configurations__Group_1_1__0__Impl rule__Configurations__Group_1_1__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1941:2: rule__Configurations__Group_1_1__0__Impl rule__Configurations__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Configurations__Group_1_1__0__Impl_in_rule__Configurations__Group_1_1__03854);
            rule__Configurations__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configurations__Group_1_1__1_in_rule__Configurations__Group_1_1__03857);
            rule__Configurations__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_1_1__0"


    // $ANTLR start "rule__Configurations__Group_1_1__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1948:1: rule__Configurations__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Configurations__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1952:1: ( ( ',' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1953:1: ( ',' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1953:1: ( ',' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1954:1: ','
            {
             before(grammarAccess.getConfigurationsAccess().getCommaKeyword_1_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Configurations__Group_1_1__0__Impl3885); 
             after(grammarAccess.getConfigurationsAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_1_1__0__Impl"


    // $ANTLR start "rule__Configurations__Group_1_1__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1967:1: rule__Configurations__Group_1_1__1 : rule__Configurations__Group_1_1__1__Impl rule__Configurations__Group_1_1__2 ;
    public final void rule__Configurations__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1971:1: ( rule__Configurations__Group_1_1__1__Impl rule__Configurations__Group_1_1__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1972:2: rule__Configurations__Group_1_1__1__Impl rule__Configurations__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Configurations__Group_1_1__1__Impl_in_rule__Configurations__Group_1_1__13916);
            rule__Configurations__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configurations__Group_1_1__2_in_rule__Configurations__Group_1_1__13919);
            rule__Configurations__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_1_1__1"


    // $ANTLR start "rule__Configurations__Group_1_1__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1979:1: rule__Configurations__Group_1_1__1__Impl : ( 'children' ) ;
    public final void rule__Configurations__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1983:1: ( ( 'children' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1984:1: ( 'children' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1984:1: ( 'children' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1985:1: 'children'
            {
             before(grammarAccess.getConfigurationsAccess().getChildrenKeyword_1_1_1()); 
            match(input,42,FOLLOW_42_in_rule__Configurations__Group_1_1__1__Impl3947); 
             after(grammarAccess.getConfigurationsAccess().getChildrenKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_1_1__1__Impl"


    // $ANTLR start "rule__Configurations__Group_1_1__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:1998:1: rule__Configurations__Group_1_1__2 : rule__Configurations__Group_1_1__2__Impl ;
    public final void rule__Configurations__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2002:1: ( rule__Configurations__Group_1_1__2__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2003:2: rule__Configurations__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Configurations__Group_1_1__2__Impl_in_rule__Configurations__Group_1_1__23978);
            rule__Configurations__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_1_1__2"


    // $ANTLR start "rule__Configurations__Group_1_1__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2009:1: rule__Configurations__Group_1_1__2__Impl : ( ( rule__Configurations__Config_childrenAssignment_1_1_2 ) ) ;
    public final void rule__Configurations__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2013:1: ( ( ( rule__Configurations__Config_childrenAssignment_1_1_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2014:1: ( ( rule__Configurations__Config_childrenAssignment_1_1_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2014:1: ( ( rule__Configurations__Config_childrenAssignment_1_1_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2015:1: ( rule__Configurations__Config_childrenAssignment_1_1_2 )
            {
             before(grammarAccess.getConfigurationsAccess().getConfig_childrenAssignment_1_1_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2016:1: ( rule__Configurations__Config_childrenAssignment_1_1_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2016:2: rule__Configurations__Config_childrenAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__Configurations__Config_childrenAssignment_1_1_2_in_rule__Configurations__Group_1_1__2__Impl4005);
            rule__Configurations__Config_childrenAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationsAccess().getConfig_childrenAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Group_1_1__2__Impl"


    // $ANTLR start "rule__Config__Group__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2032:1: rule__Config__Group__0 : rule__Config__Group__0__Impl rule__Config__Group__1 ;
    public final void rule__Config__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2036:1: ( rule__Config__Group__0__Impl rule__Config__Group__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2037:2: rule__Config__Group__0__Impl rule__Config__Group__1
            {
            pushFollow(FOLLOW_rule__Config__Group__0__Impl_in_rule__Config__Group__04041);
            rule__Config__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__1_in_rule__Config__Group__04044);
            rule__Config__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0"


    // $ANTLR start "rule__Config__Group__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2044:1: rule__Config__Group__0__Impl : ( '-' ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2048:1: ( ( '-' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2049:1: ( '-' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2049:1: ( '-' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2050:1: '-'
            {
             before(grammarAccess.getConfigAccess().getHyphenMinusKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Config__Group__0__Impl4072); 
             after(grammarAccess.getConfigAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0__Impl"


    // $ANTLR start "rule__Config__Group__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2063:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2067:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2068:2: rule__Config__Group__1__Impl rule__Config__Group__2
            {
            pushFollow(FOLLOW_rule__Config__Group__1__Impl_in_rule__Config__Group__14103);
            rule__Config__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__2_in_rule__Config__Group__14106);
            rule__Config__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1"


    // $ANTLR start "rule__Config__Group__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2075:1: rule__Config__Group__1__Impl : ( ( rule__Config__FeatureAssignment_1 ) ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2079:1: ( ( ( rule__Config__FeatureAssignment_1 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2080:1: ( ( rule__Config__FeatureAssignment_1 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2080:1: ( ( rule__Config__FeatureAssignment_1 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2081:1: ( rule__Config__FeatureAssignment_1 )
            {
             before(grammarAccess.getConfigAccess().getFeatureAssignment_1()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2082:1: ( rule__Config__FeatureAssignment_1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2082:2: rule__Config__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__Config__FeatureAssignment_1_in_rule__Config__Group__1__Impl4133);
            rule__Config__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1__Impl"


    // $ANTLR start "rule__Config__Group__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2092:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2096:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2097:2: rule__Config__Group__2__Impl rule__Config__Group__3
            {
            pushFollow(FOLLOW_rule__Config__Group__2__Impl_in_rule__Config__Group__24163);
            rule__Config__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__3_in_rule__Config__Group__24166);
            rule__Config__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2"


    // $ANTLR start "rule__Config__Group__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2104:1: rule__Config__Group__2__Impl : ( '=' ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2108:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2109:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2109:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2110:1: '='
            {
             before(grammarAccess.getConfigAccess().getEqualsSignKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Config__Group__2__Impl4194); 
             after(grammarAccess.getConfigAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2__Impl"


    // $ANTLR start "rule__Config__Group__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2123:1: rule__Config__Group__3 : rule__Config__Group__3__Impl ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2127:1: ( rule__Config__Group__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2128:2: rule__Config__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Config__Group__3__Impl_in_rule__Config__Group__34225);
            rule__Config__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3"


    // $ANTLR start "rule__Config__Group__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2134:1: rule__Config__Group__3__Impl : ( ( rule__Config__ColorAssignment_3 ) ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2138:1: ( ( ( rule__Config__ColorAssignment_3 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2139:1: ( ( rule__Config__ColorAssignment_3 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2139:1: ( ( rule__Config__ColorAssignment_3 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2140:1: ( rule__Config__ColorAssignment_3 )
            {
             before(grammarAccess.getConfigAccess().getColorAssignment_3()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2141:1: ( rule__Config__ColorAssignment_3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2141:2: rule__Config__ColorAssignment_3
            {
            pushFollow(FOLLOW_rule__Config__ColorAssignment_3_in_rule__Config__Group__3__Impl4252);
            rule__Config__ColorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getColorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3__Impl"


    // $ANTLR start "rule__Item__Group__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2159:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2163:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2164:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__04290);
            rule__Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group__1_in_rule__Item__Group__04293);
            rule__Item__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__0"


    // $ANTLR start "rule__Item__Group__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2171:1: rule__Item__Group__0__Impl : ( '{' ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2175:1: ( ( '{' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2176:1: ( '{' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2176:1: ( '{' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2177:1: '{'
            {
             before(grammarAccess.getItemAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Item__Group__0__Impl4321); 
             after(grammarAccess.getItemAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__0__Impl"


    // $ANTLR start "rule__Item__Group__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2190:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2194:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2195:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__14352);
            rule__Item__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group__2_in_rule__Item__Group__14355);
            rule__Item__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__1"


    // $ANTLR start "rule__Item__Group__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2202:1: rule__Item__Group__1__Impl : ( ( rule__Item__UnorderedGroup_1 ) ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2206:1: ( ( ( rule__Item__UnorderedGroup_1 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2207:1: ( ( rule__Item__UnorderedGroup_1 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2207:1: ( ( rule__Item__UnorderedGroup_1 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2208:1: ( rule__Item__UnorderedGroup_1 )
            {
             before(grammarAccess.getItemAccess().getUnorderedGroup_1()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2209:1: ( rule__Item__UnorderedGroup_1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2209:2: rule__Item__UnorderedGroup_1
            {
            pushFollow(FOLLOW_rule__Item__UnorderedGroup_1_in_rule__Item__Group__1__Impl4382);
            rule__Item__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__1__Impl"


    // $ANTLR start "rule__Item__Group__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2219:1: rule__Item__Group__2 : rule__Item__Group__2__Impl ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2223:1: ( rule__Item__Group__2__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2224:2: rule__Item__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group__2__Impl_in_rule__Item__Group__24412);
            rule__Item__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__2"


    // $ANTLR start "rule__Item__Group__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2230:1: rule__Item__Group__2__Impl : ( '}' ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2234:1: ( ( '}' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2235:1: ( '}' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2235:1: ( '}' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2236:1: '}'
            {
             before(grammarAccess.getItemAccess().getRightCurlyBracketKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__Item__Group__2__Impl4440); 
             after(grammarAccess.getItemAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__2__Impl"


    // $ANTLR start "rule__Item__Group_1_0__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2255:1: rule__Item__Group_1_0__0 : rule__Item__Group_1_0__0__Impl rule__Item__Group_1_0__1 ;
    public final void rule__Item__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2259:1: ( rule__Item__Group_1_0__0__Impl rule__Item__Group_1_0__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2260:2: rule__Item__Group_1_0__0__Impl rule__Item__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Item__Group_1_0__0__Impl_in_rule__Item__Group_1_0__04477);
            rule__Item__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_0__1_in_rule__Item__Group_1_0__04480);
            rule__Item__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_0__0"


    // $ANTLR start "rule__Item__Group_1_0__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2267:1: rule__Item__Group_1_0__0__Impl : ( 'id' ) ;
    public final void rule__Item__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2271:1: ( ( 'id' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2272:1: ( 'id' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2272:1: ( 'id' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2273:1: 'id'
            {
             before(grammarAccess.getItemAccess().getIdKeyword_1_0_0()); 
            match(input,29,FOLLOW_29_in_rule__Item__Group_1_0__0__Impl4508); 
             after(grammarAccess.getItemAccess().getIdKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_0__0__Impl"


    // $ANTLR start "rule__Item__Group_1_0__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2286:1: rule__Item__Group_1_0__1 : rule__Item__Group_1_0__1__Impl rule__Item__Group_1_0__2 ;
    public final void rule__Item__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2290:1: ( rule__Item__Group_1_0__1__Impl rule__Item__Group_1_0__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2291:2: rule__Item__Group_1_0__1__Impl rule__Item__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Item__Group_1_0__1__Impl_in_rule__Item__Group_1_0__14539);
            rule__Item__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_0__2_in_rule__Item__Group_1_0__14542);
            rule__Item__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_0__1"


    // $ANTLR start "rule__Item__Group_1_0__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2298:1: rule__Item__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Item__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2302:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2303:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2303:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2304:1: '='
            {
             before(grammarAccess.getItemAccess().getEqualsSignKeyword_1_0_1()); 
            match(input,30,FOLLOW_30_in_rule__Item__Group_1_0__1__Impl4570); 
             after(grammarAccess.getItemAccess().getEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_0__1__Impl"


    // $ANTLR start "rule__Item__Group_1_0__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2317:1: rule__Item__Group_1_0__2 : rule__Item__Group_1_0__2__Impl rule__Item__Group_1_0__3 ;
    public final void rule__Item__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2321:1: ( rule__Item__Group_1_0__2__Impl rule__Item__Group_1_0__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2322:2: rule__Item__Group_1_0__2__Impl rule__Item__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__Item__Group_1_0__2__Impl_in_rule__Item__Group_1_0__24601);
            rule__Item__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_0__3_in_rule__Item__Group_1_0__24604);
            rule__Item__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_0__2"


    // $ANTLR start "rule__Item__Group_1_0__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2329:1: rule__Item__Group_1_0__2__Impl : ( ( rule__Item__NameAssignment_1_0_2 ) ) ;
    public final void rule__Item__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2333:1: ( ( ( rule__Item__NameAssignment_1_0_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2334:1: ( ( rule__Item__NameAssignment_1_0_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2334:1: ( ( rule__Item__NameAssignment_1_0_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2335:1: ( rule__Item__NameAssignment_1_0_2 )
            {
             before(grammarAccess.getItemAccess().getNameAssignment_1_0_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2336:1: ( rule__Item__NameAssignment_1_0_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2336:2: rule__Item__NameAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Item__NameAssignment_1_0_2_in_rule__Item__Group_1_0__2__Impl4631);
            rule__Item__NameAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getNameAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_0__2__Impl"


    // $ANTLR start "rule__Item__Group_1_0__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2346:1: rule__Item__Group_1_0__3 : rule__Item__Group_1_0__3__Impl ;
    public final void rule__Item__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2350:1: ( rule__Item__Group_1_0__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2351:2: rule__Item__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_1_0__3__Impl_in_rule__Item__Group_1_0__34661);
            rule__Item__Group_1_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_0__3"


    // $ANTLR start "rule__Item__Group_1_0__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2357:1: rule__Item__Group_1_0__3__Impl : ( ';' ) ;
    public final void rule__Item__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2361:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2362:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2362:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2363:1: ';'
            {
             before(grammarAccess.getItemAccess().getSemicolonKeyword_1_0_3()); 
            match(input,31,FOLLOW_31_in_rule__Item__Group_1_0__3__Impl4689); 
             after(grammarAccess.getItemAccess().getSemicolonKeyword_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_0__3__Impl"


    // $ANTLR start "rule__Item__Group_1_1__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2384:1: rule__Item__Group_1_1__0 : rule__Item__Group_1_1__0__Impl rule__Item__Group_1_1__1 ;
    public final void rule__Item__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2388:1: ( rule__Item__Group_1_1__0__Impl rule__Item__Group_1_1__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2389:2: rule__Item__Group_1_1__0__Impl rule__Item__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Item__Group_1_1__0__Impl_in_rule__Item__Group_1_1__04728);
            rule__Item__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_1__1_in_rule__Item__Group_1_1__04731);
            rule__Item__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_1__0"


    // $ANTLR start "rule__Item__Group_1_1__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2396:1: rule__Item__Group_1_1__0__Impl : ( 'class' ) ;
    public final void rule__Item__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2400:1: ( ( 'class' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2401:1: ( 'class' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2401:1: ( 'class' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2402:1: 'class'
            {
             before(grammarAccess.getItemAccess().getClassKeyword_1_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Item__Group_1_1__0__Impl4759); 
             after(grammarAccess.getItemAccess().getClassKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_1__0__Impl"


    // $ANTLR start "rule__Item__Group_1_1__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2415:1: rule__Item__Group_1_1__1 : rule__Item__Group_1_1__1__Impl rule__Item__Group_1_1__2 ;
    public final void rule__Item__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2419:1: ( rule__Item__Group_1_1__1__Impl rule__Item__Group_1_1__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2420:2: rule__Item__Group_1_1__1__Impl rule__Item__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Item__Group_1_1__1__Impl_in_rule__Item__Group_1_1__14790);
            rule__Item__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_1__2_in_rule__Item__Group_1_1__14793);
            rule__Item__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_1__1"


    // $ANTLR start "rule__Item__Group_1_1__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2427:1: rule__Item__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Item__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2431:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2432:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2432:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2433:1: '='
            {
             before(grammarAccess.getItemAccess().getEqualsSignKeyword_1_1_1()); 
            match(input,30,FOLLOW_30_in_rule__Item__Group_1_1__1__Impl4821); 
             after(grammarAccess.getItemAccess().getEqualsSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_1__1__Impl"


    // $ANTLR start "rule__Item__Group_1_1__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2446:1: rule__Item__Group_1_1__2 : rule__Item__Group_1_1__2__Impl rule__Item__Group_1_1__3 ;
    public final void rule__Item__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2450:1: ( rule__Item__Group_1_1__2__Impl rule__Item__Group_1_1__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2451:2: rule__Item__Group_1_1__2__Impl rule__Item__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__Item__Group_1_1__2__Impl_in_rule__Item__Group_1_1__24852);
            rule__Item__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_1__3_in_rule__Item__Group_1_1__24855);
            rule__Item__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_1__2"


    // $ANTLR start "rule__Item__Group_1_1__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2458:1: rule__Item__Group_1_1__2__Impl : ( ( rule__Item__DecoratorAssignment_1_1_2 ) ) ;
    public final void rule__Item__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2462:1: ( ( ( rule__Item__DecoratorAssignment_1_1_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2463:1: ( ( rule__Item__DecoratorAssignment_1_1_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2463:1: ( ( rule__Item__DecoratorAssignment_1_1_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2464:1: ( rule__Item__DecoratorAssignment_1_1_2 )
            {
             before(grammarAccess.getItemAccess().getDecoratorAssignment_1_1_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2465:1: ( rule__Item__DecoratorAssignment_1_1_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2465:2: rule__Item__DecoratorAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__Item__DecoratorAssignment_1_1_2_in_rule__Item__Group_1_1__2__Impl4882);
            rule__Item__DecoratorAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getDecoratorAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_1__2__Impl"


    // $ANTLR start "rule__Item__Group_1_1__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2475:1: rule__Item__Group_1_1__3 : rule__Item__Group_1_1__3__Impl ;
    public final void rule__Item__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2479:1: ( rule__Item__Group_1_1__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2480:2: rule__Item__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_1_1__3__Impl_in_rule__Item__Group_1_1__34912);
            rule__Item__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_1__3"


    // $ANTLR start "rule__Item__Group_1_1__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2486:1: rule__Item__Group_1_1__3__Impl : ( ';' ) ;
    public final void rule__Item__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2490:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2491:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2491:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2492:1: ';'
            {
             before(grammarAccess.getItemAccess().getSemicolonKeyword_1_1_3()); 
            match(input,31,FOLLOW_31_in_rule__Item__Group_1_1__3__Impl4940); 
             after(grammarAccess.getItemAccess().getSemicolonKeyword_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_1__3__Impl"


    // $ANTLR start "rule__Item__Group_1_2__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2513:1: rule__Item__Group_1_2__0 : rule__Item__Group_1_2__0__Impl rule__Item__Group_1_2__1 ;
    public final void rule__Item__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2517:1: ( rule__Item__Group_1_2__0__Impl rule__Item__Group_1_2__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2518:2: rule__Item__Group_1_2__0__Impl rule__Item__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Item__Group_1_2__0__Impl_in_rule__Item__Group_1_2__04979);
            rule__Item__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_2__1_in_rule__Item__Group_1_2__04982);
            rule__Item__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__0"


    // $ANTLR start "rule__Item__Group_1_2__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2525:1: rule__Item__Group_1_2__0__Impl : ( 'action' ) ;
    public final void rule__Item__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2529:1: ( ( 'action' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2530:1: ( 'action' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2530:1: ( 'action' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2531:1: 'action'
            {
             before(grammarAccess.getItemAccess().getActionKeyword_1_2_0()); 
            match(input,46,FOLLOW_46_in_rule__Item__Group_1_2__0__Impl5010); 
             after(grammarAccess.getItemAccess().getActionKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__0__Impl"


    // $ANTLR start "rule__Item__Group_1_2__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2544:1: rule__Item__Group_1_2__1 : rule__Item__Group_1_2__1__Impl rule__Item__Group_1_2__2 ;
    public final void rule__Item__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2548:1: ( rule__Item__Group_1_2__1__Impl rule__Item__Group_1_2__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2549:2: rule__Item__Group_1_2__1__Impl rule__Item__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__Item__Group_1_2__1__Impl_in_rule__Item__Group_1_2__15041);
            rule__Item__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_2__2_in_rule__Item__Group_1_2__15044);
            rule__Item__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__1"


    // $ANTLR start "rule__Item__Group_1_2__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2556:1: rule__Item__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Item__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2560:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2561:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2561:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2562:1: '='
            {
             before(grammarAccess.getItemAccess().getEqualsSignKeyword_1_2_1()); 
            match(input,30,FOLLOW_30_in_rule__Item__Group_1_2__1__Impl5072); 
             after(grammarAccess.getItemAccess().getEqualsSignKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__1__Impl"


    // $ANTLR start "rule__Item__Group_1_2__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2575:1: rule__Item__Group_1_2__2 : rule__Item__Group_1_2__2__Impl rule__Item__Group_1_2__3 ;
    public final void rule__Item__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2579:1: ( rule__Item__Group_1_2__2__Impl rule__Item__Group_1_2__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2580:2: rule__Item__Group_1_2__2__Impl rule__Item__Group_1_2__3
            {
            pushFollow(FOLLOW_rule__Item__Group_1_2__2__Impl_in_rule__Item__Group_1_2__25103);
            rule__Item__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_2__3_in_rule__Item__Group_1_2__25106);
            rule__Item__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__2"


    // $ANTLR start "rule__Item__Group_1_2__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2587:1: rule__Item__Group_1_2__2__Impl : ( ( rule__Item__ActionAssignment_1_2_2 ) ) ;
    public final void rule__Item__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2591:1: ( ( ( rule__Item__ActionAssignment_1_2_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2592:1: ( ( rule__Item__ActionAssignment_1_2_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2592:1: ( ( rule__Item__ActionAssignment_1_2_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2593:1: ( rule__Item__ActionAssignment_1_2_2 )
            {
             before(grammarAccess.getItemAccess().getActionAssignment_1_2_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2594:1: ( rule__Item__ActionAssignment_1_2_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2594:2: rule__Item__ActionAssignment_1_2_2
            {
            pushFollow(FOLLOW_rule__Item__ActionAssignment_1_2_2_in_rule__Item__Group_1_2__2__Impl5133);
            rule__Item__ActionAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getActionAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__2__Impl"


    // $ANTLR start "rule__Item__Group_1_2__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2604:1: rule__Item__Group_1_2__3 : rule__Item__Group_1_2__3__Impl ;
    public final void rule__Item__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2608:1: ( rule__Item__Group_1_2__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2609:2: rule__Item__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_1_2__3__Impl_in_rule__Item__Group_1_2__35163);
            rule__Item__Group_1_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__3"


    // $ANTLR start "rule__Item__Group_1_2__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2615:1: rule__Item__Group_1_2__3__Impl : ( ';' ) ;
    public final void rule__Item__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2619:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2620:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2620:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2621:1: ';'
            {
             before(grammarAccess.getItemAccess().getSemicolonKeyword_1_2_3()); 
            match(input,31,FOLLOW_31_in_rule__Item__Group_1_2__3__Impl5191); 
             after(grammarAccess.getItemAccess().getSemicolonKeyword_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__3__Impl"


    // $ANTLR start "rule__Item__Group_1_3__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2642:1: rule__Item__Group_1_3__0 : rule__Item__Group_1_3__0__Impl rule__Item__Group_1_3__1 ;
    public final void rule__Item__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2646:1: ( rule__Item__Group_1_3__0__Impl rule__Item__Group_1_3__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2647:2: rule__Item__Group_1_3__0__Impl rule__Item__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Item__Group_1_3__0__Impl_in_rule__Item__Group_1_3__05230);
            rule__Item__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_3__1_in_rule__Item__Group_1_3__05233);
            rule__Item__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_3__0"


    // $ANTLR start "rule__Item__Group_1_3__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2654:1: rule__Item__Group_1_3__0__Impl : ( 'label' ) ;
    public final void rule__Item__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2658:1: ( ( 'label' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2659:1: ( 'label' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2659:1: ( 'label' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2660:1: 'label'
            {
             before(grammarAccess.getItemAccess().getLabelKeyword_1_3_0()); 
            match(input,47,FOLLOW_47_in_rule__Item__Group_1_3__0__Impl5261); 
             after(grammarAccess.getItemAccess().getLabelKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_3__0__Impl"


    // $ANTLR start "rule__Item__Group_1_3__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2673:1: rule__Item__Group_1_3__1 : rule__Item__Group_1_3__1__Impl rule__Item__Group_1_3__2 ;
    public final void rule__Item__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2677:1: ( rule__Item__Group_1_3__1__Impl rule__Item__Group_1_3__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2678:2: rule__Item__Group_1_3__1__Impl rule__Item__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__Item__Group_1_3__1__Impl_in_rule__Item__Group_1_3__15292);
            rule__Item__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_3__2_in_rule__Item__Group_1_3__15295);
            rule__Item__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_3__1"


    // $ANTLR start "rule__Item__Group_1_3__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2685:1: rule__Item__Group_1_3__1__Impl : ( '=' ) ;
    public final void rule__Item__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2689:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2690:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2690:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2691:1: '='
            {
             before(grammarAccess.getItemAccess().getEqualsSignKeyword_1_3_1()); 
            match(input,30,FOLLOW_30_in_rule__Item__Group_1_3__1__Impl5323); 
             after(grammarAccess.getItemAccess().getEqualsSignKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_3__1__Impl"


    // $ANTLR start "rule__Item__Group_1_3__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2704:1: rule__Item__Group_1_3__2 : rule__Item__Group_1_3__2__Impl rule__Item__Group_1_3__3 ;
    public final void rule__Item__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2708:1: ( rule__Item__Group_1_3__2__Impl rule__Item__Group_1_3__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2709:2: rule__Item__Group_1_3__2__Impl rule__Item__Group_1_3__3
            {
            pushFollow(FOLLOW_rule__Item__Group_1_3__2__Impl_in_rule__Item__Group_1_3__25354);
            rule__Item__Group_1_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_3__3_in_rule__Item__Group_1_3__25357);
            rule__Item__Group_1_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_3__2"


    // $ANTLR start "rule__Item__Group_1_3__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2716:1: rule__Item__Group_1_3__2__Impl : ( ( rule__Item__LabelAssignment_1_3_2 ) ) ;
    public final void rule__Item__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2720:1: ( ( ( rule__Item__LabelAssignment_1_3_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2721:1: ( ( rule__Item__LabelAssignment_1_3_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2721:1: ( ( rule__Item__LabelAssignment_1_3_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2722:1: ( rule__Item__LabelAssignment_1_3_2 )
            {
             before(grammarAccess.getItemAccess().getLabelAssignment_1_3_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2723:1: ( rule__Item__LabelAssignment_1_3_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2723:2: rule__Item__LabelAssignment_1_3_2
            {
            pushFollow(FOLLOW_rule__Item__LabelAssignment_1_3_2_in_rule__Item__Group_1_3__2__Impl5384);
            rule__Item__LabelAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getLabelAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_3__2__Impl"


    // $ANTLR start "rule__Item__Group_1_3__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2733:1: rule__Item__Group_1_3__3 : rule__Item__Group_1_3__3__Impl ;
    public final void rule__Item__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2737:1: ( rule__Item__Group_1_3__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2738:2: rule__Item__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_1_3__3__Impl_in_rule__Item__Group_1_3__35414);
            rule__Item__Group_1_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_3__3"


    // $ANTLR start "rule__Item__Group_1_3__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2744:1: rule__Item__Group_1_3__3__Impl : ( ';' ) ;
    public final void rule__Item__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2748:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2749:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2749:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2750:1: ';'
            {
             before(grammarAccess.getItemAccess().getSemicolonKeyword_1_3_3()); 
            match(input,31,FOLLOW_31_in_rule__Item__Group_1_3__3__Impl5442); 
             after(grammarAccess.getItemAccess().getSemicolonKeyword_1_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_3__3__Impl"


    // $ANTLR start "rule__Item__Group_1_4__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2771:1: rule__Item__Group_1_4__0 : rule__Item__Group_1_4__0__Impl rule__Item__Group_1_4__1 ;
    public final void rule__Item__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2775:1: ( rule__Item__Group_1_4__0__Impl rule__Item__Group_1_4__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2776:2: rule__Item__Group_1_4__0__Impl rule__Item__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__Item__Group_1_4__0__Impl_in_rule__Item__Group_1_4__05481);
            rule__Item__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_4__1_in_rule__Item__Group_1_4__05484);
            rule__Item__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_4__0"


    // $ANTLR start "rule__Item__Group_1_4__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2783:1: rule__Item__Group_1_4__0__Impl : ( 'title' ) ;
    public final void rule__Item__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2787:1: ( ( 'title' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2788:1: ( 'title' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2788:1: ( 'title' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2789:1: 'title'
            {
             before(grammarAccess.getItemAccess().getTitleKeyword_1_4_0()); 
            match(input,48,FOLLOW_48_in_rule__Item__Group_1_4__0__Impl5512); 
             after(grammarAccess.getItemAccess().getTitleKeyword_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_4__0__Impl"


    // $ANTLR start "rule__Item__Group_1_4__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2802:1: rule__Item__Group_1_4__1 : rule__Item__Group_1_4__1__Impl rule__Item__Group_1_4__2 ;
    public final void rule__Item__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2806:1: ( rule__Item__Group_1_4__1__Impl rule__Item__Group_1_4__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2807:2: rule__Item__Group_1_4__1__Impl rule__Item__Group_1_4__2
            {
            pushFollow(FOLLOW_rule__Item__Group_1_4__1__Impl_in_rule__Item__Group_1_4__15543);
            rule__Item__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_4__2_in_rule__Item__Group_1_4__15546);
            rule__Item__Group_1_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_4__1"


    // $ANTLR start "rule__Item__Group_1_4__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2814:1: rule__Item__Group_1_4__1__Impl : ( '=' ) ;
    public final void rule__Item__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2818:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2819:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2819:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2820:1: '='
            {
             before(grammarAccess.getItemAccess().getEqualsSignKeyword_1_4_1()); 
            match(input,30,FOLLOW_30_in_rule__Item__Group_1_4__1__Impl5574); 
             after(grammarAccess.getItemAccess().getEqualsSignKeyword_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_4__1__Impl"


    // $ANTLR start "rule__Item__Group_1_4__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2833:1: rule__Item__Group_1_4__2 : rule__Item__Group_1_4__2__Impl rule__Item__Group_1_4__3 ;
    public final void rule__Item__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2837:1: ( rule__Item__Group_1_4__2__Impl rule__Item__Group_1_4__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2838:2: rule__Item__Group_1_4__2__Impl rule__Item__Group_1_4__3
            {
            pushFollow(FOLLOW_rule__Item__Group_1_4__2__Impl_in_rule__Item__Group_1_4__25605);
            rule__Item__Group_1_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_4__3_in_rule__Item__Group_1_4__25608);
            rule__Item__Group_1_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_4__2"


    // $ANTLR start "rule__Item__Group_1_4__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2845:1: rule__Item__Group_1_4__2__Impl : ( ( rule__Item__TitleAssignment_1_4_2 ) ) ;
    public final void rule__Item__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2849:1: ( ( ( rule__Item__TitleAssignment_1_4_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2850:1: ( ( rule__Item__TitleAssignment_1_4_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2850:1: ( ( rule__Item__TitleAssignment_1_4_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2851:1: ( rule__Item__TitleAssignment_1_4_2 )
            {
             before(grammarAccess.getItemAccess().getTitleAssignment_1_4_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2852:1: ( rule__Item__TitleAssignment_1_4_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2852:2: rule__Item__TitleAssignment_1_4_2
            {
            pushFollow(FOLLOW_rule__Item__TitleAssignment_1_4_2_in_rule__Item__Group_1_4__2__Impl5635);
            rule__Item__TitleAssignment_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getTitleAssignment_1_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_4__2__Impl"


    // $ANTLR start "rule__Item__Group_1_4__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2862:1: rule__Item__Group_1_4__3 : rule__Item__Group_1_4__3__Impl ;
    public final void rule__Item__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2866:1: ( rule__Item__Group_1_4__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2867:2: rule__Item__Group_1_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_1_4__3__Impl_in_rule__Item__Group_1_4__35665);
            rule__Item__Group_1_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_4__3"


    // $ANTLR start "rule__Item__Group_1_4__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2873:1: rule__Item__Group_1_4__3__Impl : ( ';' ) ;
    public final void rule__Item__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2877:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2878:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2878:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2879:1: ';'
            {
             before(grammarAccess.getItemAccess().getSemicolonKeyword_1_4_3()); 
            match(input,31,FOLLOW_31_in_rule__Item__Group_1_4__3__Impl5693); 
             after(grammarAccess.getItemAccess().getSemicolonKeyword_1_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_4__3__Impl"


    // $ANTLR start "rule__Item__Group_1_5__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2900:1: rule__Item__Group_1_5__0 : rule__Item__Group_1_5__0__Impl rule__Item__Group_1_5__1 ;
    public final void rule__Item__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2904:1: ( rule__Item__Group_1_5__0__Impl rule__Item__Group_1_5__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2905:2: rule__Item__Group_1_5__0__Impl rule__Item__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__Item__Group_1_5__0__Impl_in_rule__Item__Group_1_5__05732);
            rule__Item__Group_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_5__1_in_rule__Item__Group_1_5__05735);
            rule__Item__Group_1_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_5__0"


    // $ANTLR start "rule__Item__Group_1_5__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2912:1: rule__Item__Group_1_5__0__Impl : ( 'dir' ) ;
    public final void rule__Item__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2916:1: ( ( 'dir' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2917:1: ( 'dir' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2917:1: ( 'dir' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2918:1: 'dir'
            {
             before(grammarAccess.getItemAccess().getDirKeyword_1_5_0()); 
            match(input,49,FOLLOW_49_in_rule__Item__Group_1_5__0__Impl5763); 
             after(grammarAccess.getItemAccess().getDirKeyword_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_5__0__Impl"


    // $ANTLR start "rule__Item__Group_1_5__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2931:1: rule__Item__Group_1_5__1 : rule__Item__Group_1_5__1__Impl rule__Item__Group_1_5__2 ;
    public final void rule__Item__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2935:1: ( rule__Item__Group_1_5__1__Impl rule__Item__Group_1_5__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2936:2: rule__Item__Group_1_5__1__Impl rule__Item__Group_1_5__2
            {
            pushFollow(FOLLOW_rule__Item__Group_1_5__1__Impl_in_rule__Item__Group_1_5__15794);
            rule__Item__Group_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_5__2_in_rule__Item__Group_1_5__15797);
            rule__Item__Group_1_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_5__1"


    // $ANTLR start "rule__Item__Group_1_5__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2943:1: rule__Item__Group_1_5__1__Impl : ( '=' ) ;
    public final void rule__Item__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2947:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2948:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2948:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2949:1: '='
            {
             before(grammarAccess.getItemAccess().getEqualsSignKeyword_1_5_1()); 
            match(input,30,FOLLOW_30_in_rule__Item__Group_1_5__1__Impl5825); 
             after(grammarAccess.getItemAccess().getEqualsSignKeyword_1_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_5__1__Impl"


    // $ANTLR start "rule__Item__Group_1_5__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2962:1: rule__Item__Group_1_5__2 : rule__Item__Group_1_5__2__Impl rule__Item__Group_1_5__3 ;
    public final void rule__Item__Group_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2966:1: ( rule__Item__Group_1_5__2__Impl rule__Item__Group_1_5__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2967:2: rule__Item__Group_1_5__2__Impl rule__Item__Group_1_5__3
            {
            pushFollow(FOLLOW_rule__Item__Group_1_5__2__Impl_in_rule__Item__Group_1_5__25856);
            rule__Item__Group_1_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_5__3_in_rule__Item__Group_1_5__25859);
            rule__Item__Group_1_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_5__2"


    // $ANTLR start "rule__Item__Group_1_5__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2974:1: rule__Item__Group_1_5__2__Impl : ( ( rule__Item__DirectionAssignment_1_5_2 ) ) ;
    public final void rule__Item__Group_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2978:1: ( ( ( rule__Item__DirectionAssignment_1_5_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2979:1: ( ( rule__Item__DirectionAssignment_1_5_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2979:1: ( ( rule__Item__DirectionAssignment_1_5_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2980:1: ( rule__Item__DirectionAssignment_1_5_2 )
            {
             before(grammarAccess.getItemAccess().getDirectionAssignment_1_5_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2981:1: ( rule__Item__DirectionAssignment_1_5_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2981:2: rule__Item__DirectionAssignment_1_5_2
            {
            pushFollow(FOLLOW_rule__Item__DirectionAssignment_1_5_2_in_rule__Item__Group_1_5__2__Impl5886);
            rule__Item__DirectionAssignment_1_5_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getDirectionAssignment_1_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_5__2__Impl"


    // $ANTLR start "rule__Item__Group_1_5__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2991:1: rule__Item__Group_1_5__3 : rule__Item__Group_1_5__3__Impl ;
    public final void rule__Item__Group_1_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2995:1: ( rule__Item__Group_1_5__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:2996:2: rule__Item__Group_1_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_1_5__3__Impl_in_rule__Item__Group_1_5__35916);
            rule__Item__Group_1_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_5__3"


    // $ANTLR start "rule__Item__Group_1_5__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3002:1: rule__Item__Group_1_5__3__Impl : ( ';' ) ;
    public final void rule__Item__Group_1_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3006:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3007:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3007:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3008:1: ';'
            {
             before(grammarAccess.getItemAccess().getSemicolonKeyword_1_5_3()); 
            match(input,31,FOLLOW_31_in_rule__Item__Group_1_5__3__Impl5944); 
             after(grammarAccess.getItemAccess().getSemicolonKeyword_1_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_5__3__Impl"


    // $ANTLR start "rule__Item__Group_1_6__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3029:1: rule__Item__Group_1_6__0 : rule__Item__Group_1_6__0__Impl rule__Item__Group_1_6__1 ;
    public final void rule__Item__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3033:1: ( rule__Item__Group_1_6__0__Impl rule__Item__Group_1_6__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3034:2: rule__Item__Group_1_6__0__Impl rule__Item__Group_1_6__1
            {
            pushFollow(FOLLOW_rule__Item__Group_1_6__0__Impl_in_rule__Item__Group_1_6__05983);
            rule__Item__Group_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_6__1_in_rule__Item__Group_1_6__05986);
            rule__Item__Group_1_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_6__0"


    // $ANTLR start "rule__Item__Group_1_6__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3041:1: rule__Item__Group_1_6__0__Impl : ( 'target' ) ;
    public final void rule__Item__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3045:1: ( ( 'target' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3046:1: ( 'target' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3046:1: ( 'target' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3047:1: 'target'
            {
             before(grammarAccess.getItemAccess().getTargetKeyword_1_6_0()); 
            match(input,50,FOLLOW_50_in_rule__Item__Group_1_6__0__Impl6014); 
             after(grammarAccess.getItemAccess().getTargetKeyword_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_6__0__Impl"


    // $ANTLR start "rule__Item__Group_1_6__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3060:1: rule__Item__Group_1_6__1 : rule__Item__Group_1_6__1__Impl rule__Item__Group_1_6__2 ;
    public final void rule__Item__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3064:1: ( rule__Item__Group_1_6__1__Impl rule__Item__Group_1_6__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3065:2: rule__Item__Group_1_6__1__Impl rule__Item__Group_1_6__2
            {
            pushFollow(FOLLOW_rule__Item__Group_1_6__1__Impl_in_rule__Item__Group_1_6__16045);
            rule__Item__Group_1_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_6__2_in_rule__Item__Group_1_6__16048);
            rule__Item__Group_1_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_6__1"


    // $ANTLR start "rule__Item__Group_1_6__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3072:1: rule__Item__Group_1_6__1__Impl : ( '=' ) ;
    public final void rule__Item__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3076:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3077:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3077:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3078:1: '='
            {
             before(grammarAccess.getItemAccess().getEqualsSignKeyword_1_6_1()); 
            match(input,30,FOLLOW_30_in_rule__Item__Group_1_6__1__Impl6076); 
             after(grammarAccess.getItemAccess().getEqualsSignKeyword_1_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_6__1__Impl"


    // $ANTLR start "rule__Item__Group_1_6__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3091:1: rule__Item__Group_1_6__2 : rule__Item__Group_1_6__2__Impl rule__Item__Group_1_6__3 ;
    public final void rule__Item__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3095:1: ( rule__Item__Group_1_6__2__Impl rule__Item__Group_1_6__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3096:2: rule__Item__Group_1_6__2__Impl rule__Item__Group_1_6__3
            {
            pushFollow(FOLLOW_rule__Item__Group_1_6__2__Impl_in_rule__Item__Group_1_6__26107);
            rule__Item__Group_1_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_6__3_in_rule__Item__Group_1_6__26110);
            rule__Item__Group_1_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_6__2"


    // $ANTLR start "rule__Item__Group_1_6__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3103:1: rule__Item__Group_1_6__2__Impl : ( ( rule__Item__TargetAssignment_1_6_2 ) ) ;
    public final void rule__Item__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3107:1: ( ( ( rule__Item__TargetAssignment_1_6_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3108:1: ( ( rule__Item__TargetAssignment_1_6_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3108:1: ( ( rule__Item__TargetAssignment_1_6_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3109:1: ( rule__Item__TargetAssignment_1_6_2 )
            {
             before(grammarAccess.getItemAccess().getTargetAssignment_1_6_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3110:1: ( rule__Item__TargetAssignment_1_6_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3110:2: rule__Item__TargetAssignment_1_6_2
            {
            pushFollow(FOLLOW_rule__Item__TargetAssignment_1_6_2_in_rule__Item__Group_1_6__2__Impl6137);
            rule__Item__TargetAssignment_1_6_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getTargetAssignment_1_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_6__2__Impl"


    // $ANTLR start "rule__Item__Group_1_6__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3120:1: rule__Item__Group_1_6__3 : rule__Item__Group_1_6__3__Impl ;
    public final void rule__Item__Group_1_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3124:1: ( rule__Item__Group_1_6__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3125:2: rule__Item__Group_1_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_1_6__3__Impl_in_rule__Item__Group_1_6__36167);
            rule__Item__Group_1_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_6__3"


    // $ANTLR start "rule__Item__Group_1_6__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3131:1: rule__Item__Group_1_6__3__Impl : ( ';' ) ;
    public final void rule__Item__Group_1_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3135:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3136:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3136:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3137:1: ';'
            {
             before(grammarAccess.getItemAccess().getSemicolonKeyword_1_6_3()); 
            match(input,31,FOLLOW_31_in_rule__Item__Group_1_6__3__Impl6195); 
             after(grammarAccess.getItemAccess().getSemicolonKeyword_1_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_6__3__Impl"


    // $ANTLR start "rule__Item__Group_1_7__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3158:1: rule__Item__Group_1_7__0 : rule__Item__Group_1_7__0__Impl rule__Item__Group_1_7__1 ;
    public final void rule__Item__Group_1_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3162:1: ( rule__Item__Group_1_7__0__Impl rule__Item__Group_1_7__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3163:2: rule__Item__Group_1_7__0__Impl rule__Item__Group_1_7__1
            {
            pushFollow(FOLLOW_rule__Item__Group_1_7__0__Impl_in_rule__Item__Group_1_7__06234);
            rule__Item__Group_1_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_7__1_in_rule__Item__Group_1_7__06237);
            rule__Item__Group_1_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_7__0"


    // $ANTLR start "rule__Item__Group_1_7__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3170:1: rule__Item__Group_1_7__0__Impl : ( 'icon' ) ;
    public final void rule__Item__Group_1_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3174:1: ( ( 'icon' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3175:1: ( 'icon' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3175:1: ( 'icon' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3176:1: 'icon'
            {
             before(grammarAccess.getItemAccess().getIconKeyword_1_7_0()); 
            match(input,51,FOLLOW_51_in_rule__Item__Group_1_7__0__Impl6265); 
             after(grammarAccess.getItemAccess().getIconKeyword_1_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_7__0__Impl"


    // $ANTLR start "rule__Item__Group_1_7__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3189:1: rule__Item__Group_1_7__1 : rule__Item__Group_1_7__1__Impl rule__Item__Group_1_7__2 ;
    public final void rule__Item__Group_1_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3193:1: ( rule__Item__Group_1_7__1__Impl rule__Item__Group_1_7__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3194:2: rule__Item__Group_1_7__1__Impl rule__Item__Group_1_7__2
            {
            pushFollow(FOLLOW_rule__Item__Group_1_7__1__Impl_in_rule__Item__Group_1_7__16296);
            rule__Item__Group_1_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_7__2_in_rule__Item__Group_1_7__16299);
            rule__Item__Group_1_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_7__1"


    // $ANTLR start "rule__Item__Group_1_7__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3201:1: rule__Item__Group_1_7__1__Impl : ( '=' ) ;
    public final void rule__Item__Group_1_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3205:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3206:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3206:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3207:1: '='
            {
             before(grammarAccess.getItemAccess().getEqualsSignKeyword_1_7_1()); 
            match(input,30,FOLLOW_30_in_rule__Item__Group_1_7__1__Impl6327); 
             after(grammarAccess.getItemAccess().getEqualsSignKeyword_1_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_7__1__Impl"


    // $ANTLR start "rule__Item__Group_1_7__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3220:1: rule__Item__Group_1_7__2 : rule__Item__Group_1_7__2__Impl rule__Item__Group_1_7__3 ;
    public final void rule__Item__Group_1_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3224:1: ( rule__Item__Group_1_7__2__Impl rule__Item__Group_1_7__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3225:2: rule__Item__Group_1_7__2__Impl rule__Item__Group_1_7__3
            {
            pushFollow(FOLLOW_rule__Item__Group_1_7__2__Impl_in_rule__Item__Group_1_7__26358);
            rule__Item__Group_1_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_7__3_in_rule__Item__Group_1_7__26361);
            rule__Item__Group_1_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_7__2"


    // $ANTLR start "rule__Item__Group_1_7__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3232:1: rule__Item__Group_1_7__2__Impl : ( ( rule__Item__IconAssignment_1_7_2 ) ) ;
    public final void rule__Item__Group_1_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3236:1: ( ( ( rule__Item__IconAssignment_1_7_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3237:1: ( ( rule__Item__IconAssignment_1_7_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3237:1: ( ( rule__Item__IconAssignment_1_7_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3238:1: ( rule__Item__IconAssignment_1_7_2 )
            {
             before(grammarAccess.getItemAccess().getIconAssignment_1_7_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3239:1: ( rule__Item__IconAssignment_1_7_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3239:2: rule__Item__IconAssignment_1_7_2
            {
            pushFollow(FOLLOW_rule__Item__IconAssignment_1_7_2_in_rule__Item__Group_1_7__2__Impl6388);
            rule__Item__IconAssignment_1_7_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getIconAssignment_1_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_7__2__Impl"


    // $ANTLR start "rule__Item__Group_1_7__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3249:1: rule__Item__Group_1_7__3 : rule__Item__Group_1_7__3__Impl ;
    public final void rule__Item__Group_1_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3253:1: ( rule__Item__Group_1_7__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3254:2: rule__Item__Group_1_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_1_7__3__Impl_in_rule__Item__Group_1_7__36418);
            rule__Item__Group_1_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_7__3"


    // $ANTLR start "rule__Item__Group_1_7__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3260:1: rule__Item__Group_1_7__3__Impl : ( ';' ) ;
    public final void rule__Item__Group_1_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3264:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3265:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3265:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3266:1: ';'
            {
             before(grammarAccess.getItemAccess().getSemicolonKeyword_1_7_3()); 
            match(input,31,FOLLOW_31_in_rule__Item__Group_1_7__3__Impl6446); 
             after(grammarAccess.getItemAccess().getSemicolonKeyword_1_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_7__3__Impl"


    // $ANTLR start "rule__Item__Group_1_8__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3287:1: rule__Item__Group_1_8__0 : rule__Item__Group_1_8__0__Impl rule__Item__Group_1_8__1 ;
    public final void rule__Item__Group_1_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3291:1: ( rule__Item__Group_1_8__0__Impl rule__Item__Group_1_8__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3292:2: rule__Item__Group_1_8__0__Impl rule__Item__Group_1_8__1
            {
            pushFollow(FOLLOW_rule__Item__Group_1_8__0__Impl_in_rule__Item__Group_1_8__06485);
            rule__Item__Group_1_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_8__1_in_rule__Item__Group_1_8__06488);
            rule__Item__Group_1_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_8__0"


    // $ANTLR start "rule__Item__Group_1_8__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3299:1: rule__Item__Group_1_8__0__Impl : ( 'submenu' ) ;
    public final void rule__Item__Group_1_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3303:1: ( ( 'submenu' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3304:1: ( 'submenu' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3304:1: ( 'submenu' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3305:1: 'submenu'
            {
             before(grammarAccess.getItemAccess().getSubmenuKeyword_1_8_0()); 
            match(input,52,FOLLOW_52_in_rule__Item__Group_1_8__0__Impl6516); 
             after(grammarAccess.getItemAccess().getSubmenuKeyword_1_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_8__0__Impl"


    // $ANTLR start "rule__Item__Group_1_8__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3318:1: rule__Item__Group_1_8__1 : rule__Item__Group_1_8__1__Impl rule__Item__Group_1_8__2 ;
    public final void rule__Item__Group_1_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3322:1: ( rule__Item__Group_1_8__1__Impl rule__Item__Group_1_8__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3323:2: rule__Item__Group_1_8__1__Impl rule__Item__Group_1_8__2
            {
            pushFollow(FOLLOW_rule__Item__Group_1_8__1__Impl_in_rule__Item__Group_1_8__16547);
            rule__Item__Group_1_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_8__2_in_rule__Item__Group_1_8__16550);
            rule__Item__Group_1_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_8__1"


    // $ANTLR start "rule__Item__Group_1_8__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3330:1: rule__Item__Group_1_8__1__Impl : ( '=' ) ;
    public final void rule__Item__Group_1_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3334:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3335:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3335:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3336:1: '='
            {
             before(grammarAccess.getItemAccess().getEqualsSignKeyword_1_8_1()); 
            match(input,30,FOLLOW_30_in_rule__Item__Group_1_8__1__Impl6578); 
             after(grammarAccess.getItemAccess().getEqualsSignKeyword_1_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_8__1__Impl"


    // $ANTLR start "rule__Item__Group_1_8__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3349:1: rule__Item__Group_1_8__2 : rule__Item__Group_1_8__2__Impl rule__Item__Group_1_8__3 ;
    public final void rule__Item__Group_1_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3353:1: ( rule__Item__Group_1_8__2__Impl rule__Item__Group_1_8__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3354:2: rule__Item__Group_1_8__2__Impl rule__Item__Group_1_8__3
            {
            pushFollow(FOLLOW_rule__Item__Group_1_8__2__Impl_in_rule__Item__Group_1_8__26609);
            rule__Item__Group_1_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_8__3_in_rule__Item__Group_1_8__26612);
            rule__Item__Group_1_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_8__2"


    // $ANTLR start "rule__Item__Group_1_8__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3361:1: rule__Item__Group_1_8__2__Impl : ( ( rule__Item__SubmenuAssignment_1_8_2 ) ) ;
    public final void rule__Item__Group_1_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3365:1: ( ( ( rule__Item__SubmenuAssignment_1_8_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3366:1: ( ( rule__Item__SubmenuAssignment_1_8_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3366:1: ( ( rule__Item__SubmenuAssignment_1_8_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3367:1: ( rule__Item__SubmenuAssignment_1_8_2 )
            {
             before(grammarAccess.getItemAccess().getSubmenuAssignment_1_8_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3368:1: ( rule__Item__SubmenuAssignment_1_8_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3368:2: rule__Item__SubmenuAssignment_1_8_2
            {
            pushFollow(FOLLOW_rule__Item__SubmenuAssignment_1_8_2_in_rule__Item__Group_1_8__2__Impl6639);
            rule__Item__SubmenuAssignment_1_8_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getSubmenuAssignment_1_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_8__2__Impl"


    // $ANTLR start "rule__Item__Group_1_8__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3378:1: rule__Item__Group_1_8__3 : rule__Item__Group_1_8__3__Impl ;
    public final void rule__Item__Group_1_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3382:1: ( rule__Item__Group_1_8__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3383:2: rule__Item__Group_1_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_1_8__3__Impl_in_rule__Item__Group_1_8__36669);
            rule__Item__Group_1_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_8__3"


    // $ANTLR start "rule__Item__Group_1_8__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3389:1: rule__Item__Group_1_8__3__Impl : ( ';' ) ;
    public final void rule__Item__Group_1_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3393:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3394:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3394:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3395:1: ';'
            {
             before(grammarAccess.getItemAccess().getSemicolonKeyword_1_8_3()); 
            match(input,31,FOLLOW_31_in_rule__Item__Group_1_8__3__Impl6697); 
             after(grammarAccess.getItemAccess().getSemicolonKeyword_1_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_8__3__Impl"


    // $ANTLR start "rule__SubMenu__Group__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3416:1: rule__SubMenu__Group__0 : rule__SubMenu__Group__0__Impl rule__SubMenu__Group__1 ;
    public final void rule__SubMenu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3420:1: ( rule__SubMenu__Group__0__Impl rule__SubMenu__Group__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3421:2: rule__SubMenu__Group__0__Impl rule__SubMenu__Group__1
            {
            pushFollow(FOLLOW_rule__SubMenu__Group__0__Impl_in_rule__SubMenu__Group__06736);
            rule__SubMenu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubMenu__Group__1_in_rule__SubMenu__Group__06739);
            rule__SubMenu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group__0"


    // $ANTLR start "rule__SubMenu__Group__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3428:1: rule__SubMenu__Group__0__Impl : ( '{' ) ;
    public final void rule__SubMenu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3432:1: ( ( '{' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3433:1: ( '{' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3433:1: ( '{' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3434:1: '{'
            {
             before(grammarAccess.getSubMenuAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__SubMenu__Group__0__Impl6767); 
             after(grammarAccess.getSubMenuAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group__0__Impl"


    // $ANTLR start "rule__SubMenu__Group__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3447:1: rule__SubMenu__Group__1 : rule__SubMenu__Group__1__Impl rule__SubMenu__Group__2 ;
    public final void rule__SubMenu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3451:1: ( rule__SubMenu__Group__1__Impl rule__SubMenu__Group__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3452:2: rule__SubMenu__Group__1__Impl rule__SubMenu__Group__2
            {
            pushFollow(FOLLOW_rule__SubMenu__Group__1__Impl_in_rule__SubMenu__Group__16798);
            rule__SubMenu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubMenu__Group__2_in_rule__SubMenu__Group__16801);
            rule__SubMenu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group__1"


    // $ANTLR start "rule__SubMenu__Group__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3459:1: rule__SubMenu__Group__1__Impl : ( ( rule__SubMenu__UnorderedGroup_1 ) ) ;
    public final void rule__SubMenu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3463:1: ( ( ( rule__SubMenu__UnorderedGroup_1 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3464:1: ( ( rule__SubMenu__UnorderedGroup_1 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3464:1: ( ( rule__SubMenu__UnorderedGroup_1 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3465:1: ( rule__SubMenu__UnorderedGroup_1 )
            {
             before(grammarAccess.getSubMenuAccess().getUnorderedGroup_1()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3466:1: ( rule__SubMenu__UnorderedGroup_1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3466:2: rule__SubMenu__UnorderedGroup_1
            {
            pushFollow(FOLLOW_rule__SubMenu__UnorderedGroup_1_in_rule__SubMenu__Group__1__Impl6828);
            rule__SubMenu__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getSubMenuAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group__1__Impl"


    // $ANTLR start "rule__SubMenu__Group__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3476:1: rule__SubMenu__Group__2 : rule__SubMenu__Group__2__Impl ;
    public final void rule__SubMenu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3480:1: ( rule__SubMenu__Group__2__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3481:2: rule__SubMenu__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SubMenu__Group__2__Impl_in_rule__SubMenu__Group__26858);
            rule__SubMenu__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group__2"


    // $ANTLR start "rule__SubMenu__Group__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3487:1: rule__SubMenu__Group__2__Impl : ( '}' ) ;
    public final void rule__SubMenu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3491:1: ( ( '}' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3492:1: ( '}' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3492:1: ( '}' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3493:1: '}'
            {
             before(grammarAccess.getSubMenuAccess().getRightCurlyBracketKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__SubMenu__Group__2__Impl6886); 
             after(grammarAccess.getSubMenuAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group__2__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_0__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3512:1: rule__SubMenu__Group_1_0__0 : rule__SubMenu__Group_1_0__0__Impl rule__SubMenu__Group_1_0__1 ;
    public final void rule__SubMenu__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3516:1: ( rule__SubMenu__Group_1_0__0__Impl rule__SubMenu__Group_1_0__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3517:2: rule__SubMenu__Group_1_0__0__Impl rule__SubMenu__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_0__0__Impl_in_rule__SubMenu__Group_1_0__06923);
            rule__SubMenu__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubMenu__Group_1_0__1_in_rule__SubMenu__Group_1_0__06926);
            rule__SubMenu__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_0__0"


    // $ANTLR start "rule__SubMenu__Group_1_0__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3524:1: rule__SubMenu__Group_1_0__0__Impl : ( 'class' ) ;
    public final void rule__SubMenu__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3528:1: ( ( 'class' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3529:1: ( 'class' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3529:1: ( 'class' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3530:1: 'class'
            {
             before(grammarAccess.getSubMenuAccess().getClassKeyword_1_0_0()); 
            match(input,35,FOLLOW_35_in_rule__SubMenu__Group_1_0__0__Impl6954); 
             after(grammarAccess.getSubMenuAccess().getClassKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_0__0__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_0__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3543:1: rule__SubMenu__Group_1_0__1 : rule__SubMenu__Group_1_0__1__Impl rule__SubMenu__Group_1_0__2 ;
    public final void rule__SubMenu__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3547:1: ( rule__SubMenu__Group_1_0__1__Impl rule__SubMenu__Group_1_0__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3548:2: rule__SubMenu__Group_1_0__1__Impl rule__SubMenu__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_0__1__Impl_in_rule__SubMenu__Group_1_0__16985);
            rule__SubMenu__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubMenu__Group_1_0__2_in_rule__SubMenu__Group_1_0__16988);
            rule__SubMenu__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_0__1"


    // $ANTLR start "rule__SubMenu__Group_1_0__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3555:1: rule__SubMenu__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__SubMenu__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3559:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3560:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3560:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3561:1: '='
            {
             before(grammarAccess.getSubMenuAccess().getEqualsSignKeyword_1_0_1()); 
            match(input,30,FOLLOW_30_in_rule__SubMenu__Group_1_0__1__Impl7016); 
             after(grammarAccess.getSubMenuAccess().getEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_0__1__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_0__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3574:1: rule__SubMenu__Group_1_0__2 : rule__SubMenu__Group_1_0__2__Impl rule__SubMenu__Group_1_0__3 ;
    public final void rule__SubMenu__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3578:1: ( rule__SubMenu__Group_1_0__2__Impl rule__SubMenu__Group_1_0__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3579:2: rule__SubMenu__Group_1_0__2__Impl rule__SubMenu__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_0__2__Impl_in_rule__SubMenu__Group_1_0__27047);
            rule__SubMenu__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubMenu__Group_1_0__3_in_rule__SubMenu__Group_1_0__27050);
            rule__SubMenu__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_0__2"


    // $ANTLR start "rule__SubMenu__Group_1_0__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3586:1: rule__SubMenu__Group_1_0__2__Impl : ( ( rule__SubMenu__DecoratorAssignment_1_0_2 ) ) ;
    public final void rule__SubMenu__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3590:1: ( ( ( rule__SubMenu__DecoratorAssignment_1_0_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3591:1: ( ( rule__SubMenu__DecoratorAssignment_1_0_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3591:1: ( ( rule__SubMenu__DecoratorAssignment_1_0_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3592:1: ( rule__SubMenu__DecoratorAssignment_1_0_2 )
            {
             before(grammarAccess.getSubMenuAccess().getDecoratorAssignment_1_0_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3593:1: ( rule__SubMenu__DecoratorAssignment_1_0_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3593:2: rule__SubMenu__DecoratorAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__SubMenu__DecoratorAssignment_1_0_2_in_rule__SubMenu__Group_1_0__2__Impl7077);
            rule__SubMenu__DecoratorAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSubMenuAccess().getDecoratorAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_0__2__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_0__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3603:1: rule__SubMenu__Group_1_0__3 : rule__SubMenu__Group_1_0__3__Impl ;
    public final void rule__SubMenu__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3607:1: ( rule__SubMenu__Group_1_0__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3608:2: rule__SubMenu__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_0__3__Impl_in_rule__SubMenu__Group_1_0__37107);
            rule__SubMenu__Group_1_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_0__3"


    // $ANTLR start "rule__SubMenu__Group_1_0__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3614:1: rule__SubMenu__Group_1_0__3__Impl : ( ';' ) ;
    public final void rule__SubMenu__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3618:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3619:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3619:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3620:1: ';'
            {
             before(grammarAccess.getSubMenuAccess().getSemicolonKeyword_1_0_3()); 
            match(input,31,FOLLOW_31_in_rule__SubMenu__Group_1_0__3__Impl7135); 
             after(grammarAccess.getSubMenuAccess().getSemicolonKeyword_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_0__3__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_1__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3641:1: rule__SubMenu__Group_1_1__0 : rule__SubMenu__Group_1_1__0__Impl rule__SubMenu__Group_1_1__1 ;
    public final void rule__SubMenu__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3645:1: ( rule__SubMenu__Group_1_1__0__Impl rule__SubMenu__Group_1_1__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3646:2: rule__SubMenu__Group_1_1__0__Impl rule__SubMenu__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_1__0__Impl_in_rule__SubMenu__Group_1_1__07174);
            rule__SubMenu__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubMenu__Group_1_1__1_in_rule__SubMenu__Group_1_1__07177);
            rule__SubMenu__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1__0"


    // $ANTLR start "rule__SubMenu__Group_1_1__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3653:1: rule__SubMenu__Group_1_1__0__Impl : ( 'items' ) ;
    public final void rule__SubMenu__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3657:1: ( ( 'items' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3658:1: ( 'items' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3658:1: ( 'items' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3659:1: 'items'
            {
             before(grammarAccess.getSubMenuAccess().getItemsKeyword_1_1_0()); 
            match(input,39,FOLLOW_39_in_rule__SubMenu__Group_1_1__0__Impl7205); 
             after(grammarAccess.getSubMenuAccess().getItemsKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1__0__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_1__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3672:1: rule__SubMenu__Group_1_1__1 : rule__SubMenu__Group_1_1__1__Impl rule__SubMenu__Group_1_1__2 ;
    public final void rule__SubMenu__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3676:1: ( rule__SubMenu__Group_1_1__1__Impl rule__SubMenu__Group_1_1__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3677:2: rule__SubMenu__Group_1_1__1__Impl rule__SubMenu__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_1__1__Impl_in_rule__SubMenu__Group_1_1__17236);
            rule__SubMenu__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubMenu__Group_1_1__2_in_rule__SubMenu__Group_1_1__17239);
            rule__SubMenu__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1__1"


    // $ANTLR start "rule__SubMenu__Group_1_1__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3684:1: rule__SubMenu__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__SubMenu__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3688:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3689:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3689:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3690:1: '='
            {
             before(grammarAccess.getSubMenuAccess().getEqualsSignKeyword_1_1_1()); 
            match(input,30,FOLLOW_30_in_rule__SubMenu__Group_1_1__1__Impl7267); 
             after(grammarAccess.getSubMenuAccess().getEqualsSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1__1__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_1__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3703:1: rule__SubMenu__Group_1_1__2 : rule__SubMenu__Group_1_1__2__Impl rule__SubMenu__Group_1_1__3 ;
    public final void rule__SubMenu__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3707:1: ( rule__SubMenu__Group_1_1__2__Impl rule__SubMenu__Group_1_1__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3708:2: rule__SubMenu__Group_1_1__2__Impl rule__SubMenu__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_1__2__Impl_in_rule__SubMenu__Group_1_1__27298);
            rule__SubMenu__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubMenu__Group_1_1__3_in_rule__SubMenu__Group_1_1__27301);
            rule__SubMenu__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1__2"


    // $ANTLR start "rule__SubMenu__Group_1_1__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3715:1: rule__SubMenu__Group_1_1__2__Impl : ( '[' ) ;
    public final void rule__SubMenu__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3719:1: ( ( '[' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3720:1: ( '[' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3720:1: ( '[' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3721:1: '['
            {
             before(grammarAccess.getSubMenuAccess().getLeftSquareBracketKeyword_1_1_2()); 
            match(input,37,FOLLOW_37_in_rule__SubMenu__Group_1_1__2__Impl7329); 
             after(grammarAccess.getSubMenuAccess().getLeftSquareBracketKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1__2__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_1__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3734:1: rule__SubMenu__Group_1_1__3 : rule__SubMenu__Group_1_1__3__Impl rule__SubMenu__Group_1_1__4 ;
    public final void rule__SubMenu__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3738:1: ( rule__SubMenu__Group_1_1__3__Impl rule__SubMenu__Group_1_1__4 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3739:2: rule__SubMenu__Group_1_1__3__Impl rule__SubMenu__Group_1_1__4
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_1__3__Impl_in_rule__SubMenu__Group_1_1__37360);
            rule__SubMenu__Group_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubMenu__Group_1_1__4_in_rule__SubMenu__Group_1_1__37363);
            rule__SubMenu__Group_1_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1__3"


    // $ANTLR start "rule__SubMenu__Group_1_1__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3746:1: rule__SubMenu__Group_1_1__3__Impl : ( ( rule__SubMenu__Group_1_1_3__0 ) ) ;
    public final void rule__SubMenu__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3750:1: ( ( ( rule__SubMenu__Group_1_1_3__0 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3751:1: ( ( rule__SubMenu__Group_1_1_3__0 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3751:1: ( ( rule__SubMenu__Group_1_1_3__0 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3752:1: ( rule__SubMenu__Group_1_1_3__0 )
            {
             before(grammarAccess.getSubMenuAccess().getGroup_1_1_3()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3753:1: ( rule__SubMenu__Group_1_1_3__0 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3753:2: rule__SubMenu__Group_1_1_3__0
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_1_3__0_in_rule__SubMenu__Group_1_1__3__Impl7390);
            rule__SubMenu__Group_1_1_3__0();

            state._fsp--;


            }

             after(grammarAccess.getSubMenuAccess().getGroup_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1__3__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_1__4"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3763:1: rule__SubMenu__Group_1_1__4 : rule__SubMenu__Group_1_1__4__Impl rule__SubMenu__Group_1_1__5 ;
    public final void rule__SubMenu__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3767:1: ( rule__SubMenu__Group_1_1__4__Impl rule__SubMenu__Group_1_1__5 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3768:2: rule__SubMenu__Group_1_1__4__Impl rule__SubMenu__Group_1_1__5
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_1__4__Impl_in_rule__SubMenu__Group_1_1__47420);
            rule__SubMenu__Group_1_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubMenu__Group_1_1__5_in_rule__SubMenu__Group_1_1__47423);
            rule__SubMenu__Group_1_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1__4"


    // $ANTLR start "rule__SubMenu__Group_1_1__4__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3775:1: rule__SubMenu__Group_1_1__4__Impl : ( ']' ) ;
    public final void rule__SubMenu__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3779:1: ( ( ']' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3780:1: ( ']' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3780:1: ( ']' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3781:1: ']'
            {
             before(grammarAccess.getSubMenuAccess().getRightSquareBracketKeyword_1_1_4()); 
            match(input,38,FOLLOW_38_in_rule__SubMenu__Group_1_1__4__Impl7451); 
             after(grammarAccess.getSubMenuAccess().getRightSquareBracketKeyword_1_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1__4__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_1__5"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3794:1: rule__SubMenu__Group_1_1__5 : rule__SubMenu__Group_1_1__5__Impl ;
    public final void rule__SubMenu__Group_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3798:1: ( rule__SubMenu__Group_1_1__5__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3799:2: rule__SubMenu__Group_1_1__5__Impl
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_1__5__Impl_in_rule__SubMenu__Group_1_1__57482);
            rule__SubMenu__Group_1_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1__5"


    // $ANTLR start "rule__SubMenu__Group_1_1__5__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3805:1: rule__SubMenu__Group_1_1__5__Impl : ( ';' ) ;
    public final void rule__SubMenu__Group_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3809:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3810:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3810:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3811:1: ';'
            {
             before(grammarAccess.getSubMenuAccess().getSemicolonKeyword_1_1_5()); 
            match(input,31,FOLLOW_31_in_rule__SubMenu__Group_1_1__5__Impl7510); 
             after(grammarAccess.getSubMenuAccess().getSemicolonKeyword_1_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1__5__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_1_3__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3836:1: rule__SubMenu__Group_1_1_3__0 : rule__SubMenu__Group_1_1_3__0__Impl rule__SubMenu__Group_1_1_3__1 ;
    public final void rule__SubMenu__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3840:1: ( rule__SubMenu__Group_1_1_3__0__Impl rule__SubMenu__Group_1_1_3__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3841:2: rule__SubMenu__Group_1_1_3__0__Impl rule__SubMenu__Group_1_1_3__1
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_1_3__0__Impl_in_rule__SubMenu__Group_1_1_3__07553);
            rule__SubMenu__Group_1_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubMenu__Group_1_1_3__1_in_rule__SubMenu__Group_1_1_3__07556);
            rule__SubMenu__Group_1_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1_3__0"


    // $ANTLR start "rule__SubMenu__Group_1_1_3__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3848:1: rule__SubMenu__Group_1_1_3__0__Impl : ( ( rule__SubMenu__ItemsAssignment_1_1_3_0 ) ) ;
    public final void rule__SubMenu__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3852:1: ( ( ( rule__SubMenu__ItemsAssignment_1_1_3_0 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3853:1: ( ( rule__SubMenu__ItemsAssignment_1_1_3_0 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3853:1: ( ( rule__SubMenu__ItemsAssignment_1_1_3_0 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3854:1: ( rule__SubMenu__ItemsAssignment_1_1_3_0 )
            {
             before(grammarAccess.getSubMenuAccess().getItemsAssignment_1_1_3_0()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3855:1: ( rule__SubMenu__ItemsAssignment_1_1_3_0 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3855:2: rule__SubMenu__ItemsAssignment_1_1_3_0
            {
            pushFollow(FOLLOW_rule__SubMenu__ItemsAssignment_1_1_3_0_in_rule__SubMenu__Group_1_1_3__0__Impl7583);
            rule__SubMenu__ItemsAssignment_1_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSubMenuAccess().getItemsAssignment_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1_3__0__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_1_3__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3865:1: rule__SubMenu__Group_1_1_3__1 : rule__SubMenu__Group_1_1_3__1__Impl ;
    public final void rule__SubMenu__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3869:1: ( rule__SubMenu__Group_1_1_3__1__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3870:2: rule__SubMenu__Group_1_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_1_3__1__Impl_in_rule__SubMenu__Group_1_1_3__17613);
            rule__SubMenu__Group_1_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1_3__1"


    // $ANTLR start "rule__SubMenu__Group_1_1_3__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3876:1: rule__SubMenu__Group_1_1_3__1__Impl : ( ( rule__SubMenu__Group_1_1_3_1__0 )* ) ;
    public final void rule__SubMenu__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3880:1: ( ( ( rule__SubMenu__Group_1_1_3_1__0 )* ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3881:1: ( ( rule__SubMenu__Group_1_1_3_1__0 )* )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3881:1: ( ( rule__SubMenu__Group_1_1_3_1__0 )* )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3882:1: ( rule__SubMenu__Group_1_1_3_1__0 )*
            {
             before(grammarAccess.getSubMenuAccess().getGroup_1_1_3_1()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3883:1: ( rule__SubMenu__Group_1_1_3_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3883:2: rule__SubMenu__Group_1_1_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SubMenu__Group_1_1_3_1__0_in_rule__SubMenu__Group_1_1_3__1__Impl7640);
            	    rule__SubMenu__Group_1_1_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSubMenuAccess().getGroup_1_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1_3__1__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_1_3_1__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3897:1: rule__SubMenu__Group_1_1_3_1__0 : rule__SubMenu__Group_1_1_3_1__0__Impl rule__SubMenu__Group_1_1_3_1__1 ;
    public final void rule__SubMenu__Group_1_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3901:1: ( rule__SubMenu__Group_1_1_3_1__0__Impl rule__SubMenu__Group_1_1_3_1__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3902:2: rule__SubMenu__Group_1_1_3_1__0__Impl rule__SubMenu__Group_1_1_3_1__1
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_1_3_1__0__Impl_in_rule__SubMenu__Group_1_1_3_1__07675);
            rule__SubMenu__Group_1_1_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubMenu__Group_1_1_3_1__1_in_rule__SubMenu__Group_1_1_3_1__07678);
            rule__SubMenu__Group_1_1_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1_3_1__0"


    // $ANTLR start "rule__SubMenu__Group_1_1_3_1__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3909:1: rule__SubMenu__Group_1_1_3_1__0__Impl : ( ',' ) ;
    public final void rule__SubMenu__Group_1_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3913:1: ( ( ',' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3914:1: ( ',' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3914:1: ( ',' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3915:1: ','
            {
             before(grammarAccess.getSubMenuAccess().getCommaKeyword_1_1_3_1_0()); 
            match(input,40,FOLLOW_40_in_rule__SubMenu__Group_1_1_3_1__0__Impl7706); 
             after(grammarAccess.getSubMenuAccess().getCommaKeyword_1_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1_3_1__0__Impl"


    // $ANTLR start "rule__SubMenu__Group_1_1_3_1__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3928:1: rule__SubMenu__Group_1_1_3_1__1 : rule__SubMenu__Group_1_1_3_1__1__Impl ;
    public final void rule__SubMenu__Group_1_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3932:1: ( rule__SubMenu__Group_1_1_3_1__1__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3933:2: rule__SubMenu__Group_1_1_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SubMenu__Group_1_1_3_1__1__Impl_in_rule__SubMenu__Group_1_1_3_1__17737);
            rule__SubMenu__Group_1_1_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1_3_1__1"


    // $ANTLR start "rule__SubMenu__Group_1_1_3_1__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3939:1: rule__SubMenu__Group_1_1_3_1__1__Impl : ( ( rule__SubMenu__ItemsAssignment_1_1_3_1_1 ) ) ;
    public final void rule__SubMenu__Group_1_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3943:1: ( ( ( rule__SubMenu__ItemsAssignment_1_1_3_1_1 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3944:1: ( ( rule__SubMenu__ItemsAssignment_1_1_3_1_1 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3944:1: ( ( rule__SubMenu__ItemsAssignment_1_1_3_1_1 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3945:1: ( rule__SubMenu__ItemsAssignment_1_1_3_1_1 )
            {
             before(grammarAccess.getSubMenuAccess().getItemsAssignment_1_1_3_1_1()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3946:1: ( rule__SubMenu__ItemsAssignment_1_1_3_1_1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3946:2: rule__SubMenu__ItemsAssignment_1_1_3_1_1
            {
            pushFollow(FOLLOW_rule__SubMenu__ItemsAssignment_1_1_3_1_1_in_rule__SubMenu__Group_1_1_3_1__1__Impl7764);
            rule__SubMenu__ItemsAssignment_1_1_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSubMenuAccess().getItemsAssignment_1_1_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__Group_1_1_3_1__1__Impl"


    // $ANTLR start "rule__Icon__Group__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3960:1: rule__Icon__Group__0 : rule__Icon__Group__0__Impl rule__Icon__Group__1 ;
    public final void rule__Icon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3964:1: ( rule__Icon__Group__0__Impl rule__Icon__Group__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3965:2: rule__Icon__Group__0__Impl rule__Icon__Group__1
            {
            pushFollow(FOLLOW_rule__Icon__Group__0__Impl_in_rule__Icon__Group__07798);
            rule__Icon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group__1_in_rule__Icon__Group__07801);
            rule__Icon__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group__0"


    // $ANTLR start "rule__Icon__Group__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3972:1: rule__Icon__Group__0__Impl : ( '{' ) ;
    public final void rule__Icon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3976:1: ( ( '{' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3977:1: ( '{' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3977:1: ( '{' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3978:1: '{'
            {
             before(grammarAccess.getIconAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Icon__Group__0__Impl7829); 
             after(grammarAccess.getIconAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group__0__Impl"


    // $ANTLR start "rule__Icon__Group__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3991:1: rule__Icon__Group__1 : rule__Icon__Group__1__Impl rule__Icon__Group__2 ;
    public final void rule__Icon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3995:1: ( rule__Icon__Group__1__Impl rule__Icon__Group__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:3996:2: rule__Icon__Group__1__Impl rule__Icon__Group__2
            {
            pushFollow(FOLLOW_rule__Icon__Group__1__Impl_in_rule__Icon__Group__17860);
            rule__Icon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group__2_in_rule__Icon__Group__17863);
            rule__Icon__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group__1"


    // $ANTLR start "rule__Icon__Group__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4003:1: rule__Icon__Group__1__Impl : ( ( rule__Icon__UnorderedGroup_1 ) ) ;
    public final void rule__Icon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4007:1: ( ( ( rule__Icon__UnorderedGroup_1 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4008:1: ( ( rule__Icon__UnorderedGroup_1 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4008:1: ( ( rule__Icon__UnorderedGroup_1 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4009:1: ( rule__Icon__UnorderedGroup_1 )
            {
             before(grammarAccess.getIconAccess().getUnorderedGroup_1()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4010:1: ( rule__Icon__UnorderedGroup_1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4010:2: rule__Icon__UnorderedGroup_1
            {
            pushFollow(FOLLOW_rule__Icon__UnorderedGroup_1_in_rule__Icon__Group__1__Impl7890);
            rule__Icon__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getIconAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group__1__Impl"


    // $ANTLR start "rule__Icon__Group__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4020:1: rule__Icon__Group__2 : rule__Icon__Group__2__Impl ;
    public final void rule__Icon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4024:1: ( rule__Icon__Group__2__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4025:2: rule__Icon__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Icon__Group__2__Impl_in_rule__Icon__Group__27920);
            rule__Icon__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group__2"


    // $ANTLR start "rule__Icon__Group__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4031:1: rule__Icon__Group__2__Impl : ( '}' ) ;
    public final void rule__Icon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4035:1: ( ( '}' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4036:1: ( '}' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4036:1: ( '}' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4037:1: '}'
            {
             before(grammarAccess.getIconAccess().getRightCurlyBracketKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__Icon__Group__2__Impl7948); 
             after(grammarAccess.getIconAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group__2__Impl"


    // $ANTLR start "rule__Icon__Group_1_0__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4056:1: rule__Icon__Group_1_0__0 : rule__Icon__Group_1_0__0__Impl rule__Icon__Group_1_0__1 ;
    public final void rule__Icon__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4060:1: ( rule__Icon__Group_1_0__0__Impl rule__Icon__Group_1_0__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4061:2: rule__Icon__Group_1_0__0__Impl rule__Icon__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_0__0__Impl_in_rule__Icon__Group_1_0__07985);
            rule__Icon__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_0__1_in_rule__Icon__Group_1_0__07988);
            rule__Icon__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_0__0"


    // $ANTLR start "rule__Icon__Group_1_0__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4068:1: rule__Icon__Group_1_0__0__Impl : ( 'id' ) ;
    public final void rule__Icon__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4072:1: ( ( 'id' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4073:1: ( 'id' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4073:1: ( 'id' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4074:1: 'id'
            {
             before(grammarAccess.getIconAccess().getIdKeyword_1_0_0()); 
            match(input,29,FOLLOW_29_in_rule__Icon__Group_1_0__0__Impl8016); 
             after(grammarAccess.getIconAccess().getIdKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_0__0__Impl"


    // $ANTLR start "rule__Icon__Group_1_0__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4087:1: rule__Icon__Group_1_0__1 : rule__Icon__Group_1_0__1__Impl rule__Icon__Group_1_0__2 ;
    public final void rule__Icon__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4091:1: ( rule__Icon__Group_1_0__1__Impl rule__Icon__Group_1_0__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4092:2: rule__Icon__Group_1_0__1__Impl rule__Icon__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_0__1__Impl_in_rule__Icon__Group_1_0__18047);
            rule__Icon__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_0__2_in_rule__Icon__Group_1_0__18050);
            rule__Icon__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_0__1"


    // $ANTLR start "rule__Icon__Group_1_0__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4099:1: rule__Icon__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Icon__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4103:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4104:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4104:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4105:1: '='
            {
             before(grammarAccess.getIconAccess().getEqualsSignKeyword_1_0_1()); 
            match(input,30,FOLLOW_30_in_rule__Icon__Group_1_0__1__Impl8078); 
             after(grammarAccess.getIconAccess().getEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_0__1__Impl"


    // $ANTLR start "rule__Icon__Group_1_0__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4118:1: rule__Icon__Group_1_0__2 : rule__Icon__Group_1_0__2__Impl rule__Icon__Group_1_0__3 ;
    public final void rule__Icon__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4122:1: ( rule__Icon__Group_1_0__2__Impl rule__Icon__Group_1_0__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4123:2: rule__Icon__Group_1_0__2__Impl rule__Icon__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_0__2__Impl_in_rule__Icon__Group_1_0__28109);
            rule__Icon__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_0__3_in_rule__Icon__Group_1_0__28112);
            rule__Icon__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_0__2"


    // $ANTLR start "rule__Icon__Group_1_0__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4130:1: rule__Icon__Group_1_0__2__Impl : ( ( rule__Icon__NameAssignment_1_0_2 ) ) ;
    public final void rule__Icon__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4134:1: ( ( ( rule__Icon__NameAssignment_1_0_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4135:1: ( ( rule__Icon__NameAssignment_1_0_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4135:1: ( ( rule__Icon__NameAssignment_1_0_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4136:1: ( rule__Icon__NameAssignment_1_0_2 )
            {
             before(grammarAccess.getIconAccess().getNameAssignment_1_0_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4137:1: ( rule__Icon__NameAssignment_1_0_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4137:2: rule__Icon__NameAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Icon__NameAssignment_1_0_2_in_rule__Icon__Group_1_0__2__Impl8139);
            rule__Icon__NameAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getIconAccess().getNameAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_0__2__Impl"


    // $ANTLR start "rule__Icon__Group_1_0__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4147:1: rule__Icon__Group_1_0__3 : rule__Icon__Group_1_0__3__Impl ;
    public final void rule__Icon__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4151:1: ( rule__Icon__Group_1_0__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4152:2: rule__Icon__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_0__3__Impl_in_rule__Icon__Group_1_0__38169);
            rule__Icon__Group_1_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_0__3"


    // $ANTLR start "rule__Icon__Group_1_0__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4158:1: rule__Icon__Group_1_0__3__Impl : ( ';' ) ;
    public final void rule__Icon__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4162:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4163:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4163:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4164:1: ';'
            {
             before(grammarAccess.getIconAccess().getSemicolonKeyword_1_0_3()); 
            match(input,31,FOLLOW_31_in_rule__Icon__Group_1_0__3__Impl8197); 
             after(grammarAccess.getIconAccess().getSemicolonKeyword_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_0__3__Impl"


    // $ANTLR start "rule__Icon__Group_1_1__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4185:1: rule__Icon__Group_1_1__0 : rule__Icon__Group_1_1__0__Impl rule__Icon__Group_1_1__1 ;
    public final void rule__Icon__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4189:1: ( rule__Icon__Group_1_1__0__Impl rule__Icon__Group_1_1__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4190:2: rule__Icon__Group_1_1__0__Impl rule__Icon__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_1__0__Impl_in_rule__Icon__Group_1_1__08236);
            rule__Icon__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_1__1_in_rule__Icon__Group_1_1__08239);
            rule__Icon__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_1__0"


    // $ANTLR start "rule__Icon__Group_1_1__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4197:1: rule__Icon__Group_1_1__0__Impl : ( 'position' ) ;
    public final void rule__Icon__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4201:1: ( ( 'position' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4202:1: ( 'position' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4202:1: ( 'position' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4203:1: 'position'
            {
             before(grammarAccess.getIconAccess().getPositionKeyword_1_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Icon__Group_1_1__0__Impl8267); 
             after(grammarAccess.getIconAccess().getPositionKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_1__0__Impl"


    // $ANTLR start "rule__Icon__Group_1_1__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4216:1: rule__Icon__Group_1_1__1 : rule__Icon__Group_1_1__1__Impl rule__Icon__Group_1_1__2 ;
    public final void rule__Icon__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4220:1: ( rule__Icon__Group_1_1__1__Impl rule__Icon__Group_1_1__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4221:2: rule__Icon__Group_1_1__1__Impl rule__Icon__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_1__1__Impl_in_rule__Icon__Group_1_1__18298);
            rule__Icon__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_1__2_in_rule__Icon__Group_1_1__18301);
            rule__Icon__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_1__1"


    // $ANTLR start "rule__Icon__Group_1_1__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4228:1: rule__Icon__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Icon__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4232:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4233:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4233:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4234:1: '='
            {
             before(grammarAccess.getIconAccess().getEqualsSignKeyword_1_1_1()); 
            match(input,30,FOLLOW_30_in_rule__Icon__Group_1_1__1__Impl8329); 
             after(grammarAccess.getIconAccess().getEqualsSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_1__1__Impl"


    // $ANTLR start "rule__Icon__Group_1_1__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4247:1: rule__Icon__Group_1_1__2 : rule__Icon__Group_1_1__2__Impl rule__Icon__Group_1_1__3 ;
    public final void rule__Icon__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4251:1: ( rule__Icon__Group_1_1__2__Impl rule__Icon__Group_1_1__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4252:2: rule__Icon__Group_1_1__2__Impl rule__Icon__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_1__2__Impl_in_rule__Icon__Group_1_1__28360);
            rule__Icon__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_1__3_in_rule__Icon__Group_1_1__28363);
            rule__Icon__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_1__2"


    // $ANTLR start "rule__Icon__Group_1_1__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4259:1: rule__Icon__Group_1_1__2__Impl : ( ( rule__Icon__PositionAssignment_1_1_2 ) ) ;
    public final void rule__Icon__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4263:1: ( ( ( rule__Icon__PositionAssignment_1_1_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4264:1: ( ( rule__Icon__PositionAssignment_1_1_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4264:1: ( ( rule__Icon__PositionAssignment_1_1_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4265:1: ( rule__Icon__PositionAssignment_1_1_2 )
            {
             before(grammarAccess.getIconAccess().getPositionAssignment_1_1_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4266:1: ( rule__Icon__PositionAssignment_1_1_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4266:2: rule__Icon__PositionAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__Icon__PositionAssignment_1_1_2_in_rule__Icon__Group_1_1__2__Impl8390);
            rule__Icon__PositionAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getIconAccess().getPositionAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_1__2__Impl"


    // $ANTLR start "rule__Icon__Group_1_1__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4276:1: rule__Icon__Group_1_1__3 : rule__Icon__Group_1_1__3__Impl ;
    public final void rule__Icon__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4280:1: ( rule__Icon__Group_1_1__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4281:2: rule__Icon__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_1__3__Impl_in_rule__Icon__Group_1_1__38420);
            rule__Icon__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_1__3"


    // $ANTLR start "rule__Icon__Group_1_1__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4287:1: rule__Icon__Group_1_1__3__Impl : ( ';' ) ;
    public final void rule__Icon__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4291:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4292:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4292:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4293:1: ';'
            {
             before(grammarAccess.getIconAccess().getSemicolonKeyword_1_1_3()); 
            match(input,31,FOLLOW_31_in_rule__Icon__Group_1_1__3__Impl8448); 
             after(grammarAccess.getIconAccess().getSemicolonKeyword_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_1__3__Impl"


    // $ANTLR start "rule__Icon__Group_1_2__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4314:1: rule__Icon__Group_1_2__0 : rule__Icon__Group_1_2__0__Impl rule__Icon__Group_1_2__1 ;
    public final void rule__Icon__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4318:1: ( rule__Icon__Group_1_2__0__Impl rule__Icon__Group_1_2__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4319:2: rule__Icon__Group_1_2__0__Impl rule__Icon__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_2__0__Impl_in_rule__Icon__Group_1_2__08487);
            rule__Icon__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_2__1_in_rule__Icon__Group_1_2__08490);
            rule__Icon__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_2__0"


    // $ANTLR start "rule__Icon__Group_1_2__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4326:1: rule__Icon__Group_1_2__0__Impl : ( 'class' ) ;
    public final void rule__Icon__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4330:1: ( ( 'class' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4331:1: ( 'class' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4331:1: ( 'class' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4332:1: 'class'
            {
             before(grammarAccess.getIconAccess().getClassKeyword_1_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Icon__Group_1_2__0__Impl8518); 
             after(grammarAccess.getIconAccess().getClassKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_2__0__Impl"


    // $ANTLR start "rule__Icon__Group_1_2__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4345:1: rule__Icon__Group_1_2__1 : rule__Icon__Group_1_2__1__Impl rule__Icon__Group_1_2__2 ;
    public final void rule__Icon__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4349:1: ( rule__Icon__Group_1_2__1__Impl rule__Icon__Group_1_2__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4350:2: rule__Icon__Group_1_2__1__Impl rule__Icon__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_2__1__Impl_in_rule__Icon__Group_1_2__18549);
            rule__Icon__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_2__2_in_rule__Icon__Group_1_2__18552);
            rule__Icon__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_2__1"


    // $ANTLR start "rule__Icon__Group_1_2__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4357:1: rule__Icon__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Icon__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4361:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4362:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4362:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4363:1: '='
            {
             before(grammarAccess.getIconAccess().getEqualsSignKeyword_1_2_1()); 
            match(input,30,FOLLOW_30_in_rule__Icon__Group_1_2__1__Impl8580); 
             after(grammarAccess.getIconAccess().getEqualsSignKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_2__1__Impl"


    // $ANTLR start "rule__Icon__Group_1_2__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4376:1: rule__Icon__Group_1_2__2 : rule__Icon__Group_1_2__2__Impl rule__Icon__Group_1_2__3 ;
    public final void rule__Icon__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4380:1: ( rule__Icon__Group_1_2__2__Impl rule__Icon__Group_1_2__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4381:2: rule__Icon__Group_1_2__2__Impl rule__Icon__Group_1_2__3
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_2__2__Impl_in_rule__Icon__Group_1_2__28611);
            rule__Icon__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_2__3_in_rule__Icon__Group_1_2__28614);
            rule__Icon__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_2__2"


    // $ANTLR start "rule__Icon__Group_1_2__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4388:1: rule__Icon__Group_1_2__2__Impl : ( ( rule__Icon__DecoratorAssignment_1_2_2 ) ) ;
    public final void rule__Icon__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4392:1: ( ( ( rule__Icon__DecoratorAssignment_1_2_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4393:1: ( ( rule__Icon__DecoratorAssignment_1_2_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4393:1: ( ( rule__Icon__DecoratorAssignment_1_2_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4394:1: ( rule__Icon__DecoratorAssignment_1_2_2 )
            {
             before(grammarAccess.getIconAccess().getDecoratorAssignment_1_2_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4395:1: ( rule__Icon__DecoratorAssignment_1_2_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4395:2: rule__Icon__DecoratorAssignment_1_2_2
            {
            pushFollow(FOLLOW_rule__Icon__DecoratorAssignment_1_2_2_in_rule__Icon__Group_1_2__2__Impl8641);
            rule__Icon__DecoratorAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getIconAccess().getDecoratorAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_2__2__Impl"


    // $ANTLR start "rule__Icon__Group_1_2__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4405:1: rule__Icon__Group_1_2__3 : rule__Icon__Group_1_2__3__Impl ;
    public final void rule__Icon__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4409:1: ( rule__Icon__Group_1_2__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4410:2: rule__Icon__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_2__3__Impl_in_rule__Icon__Group_1_2__38671);
            rule__Icon__Group_1_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_2__3"


    // $ANTLR start "rule__Icon__Group_1_2__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4416:1: rule__Icon__Group_1_2__3__Impl : ( ';' ) ;
    public final void rule__Icon__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4420:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4421:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4421:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4422:1: ';'
            {
             before(grammarAccess.getIconAccess().getSemicolonKeyword_1_2_3()); 
            match(input,31,FOLLOW_31_in_rule__Icon__Group_1_2__3__Impl8699); 
             after(grammarAccess.getIconAccess().getSemicolonKeyword_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_2__3__Impl"


    // $ANTLR start "rule__Icon__Group_1_3__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4443:1: rule__Icon__Group_1_3__0 : rule__Icon__Group_1_3__0__Impl rule__Icon__Group_1_3__1 ;
    public final void rule__Icon__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4447:1: ( rule__Icon__Group_1_3__0__Impl rule__Icon__Group_1_3__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4448:2: rule__Icon__Group_1_3__0__Impl rule__Icon__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_3__0__Impl_in_rule__Icon__Group_1_3__08738);
            rule__Icon__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_3__1_in_rule__Icon__Group_1_3__08741);
            rule__Icon__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_3__0"


    // $ANTLR start "rule__Icon__Group_1_3__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4455:1: rule__Icon__Group_1_3__0__Impl : ( 'text-alt' ) ;
    public final void rule__Icon__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4459:1: ( ( 'text-alt' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4460:1: ( 'text-alt' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4460:1: ( 'text-alt' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4461:1: 'text-alt'
            {
             before(grammarAccess.getIconAccess().getTextAltKeyword_1_3_0()); 
            match(input,53,FOLLOW_53_in_rule__Icon__Group_1_3__0__Impl8769); 
             after(grammarAccess.getIconAccess().getTextAltKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_3__0__Impl"


    // $ANTLR start "rule__Icon__Group_1_3__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4474:1: rule__Icon__Group_1_3__1 : rule__Icon__Group_1_3__1__Impl rule__Icon__Group_1_3__2 ;
    public final void rule__Icon__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4478:1: ( rule__Icon__Group_1_3__1__Impl rule__Icon__Group_1_3__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4479:2: rule__Icon__Group_1_3__1__Impl rule__Icon__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_3__1__Impl_in_rule__Icon__Group_1_3__18800);
            rule__Icon__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_3__2_in_rule__Icon__Group_1_3__18803);
            rule__Icon__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_3__1"


    // $ANTLR start "rule__Icon__Group_1_3__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4486:1: rule__Icon__Group_1_3__1__Impl : ( '=' ) ;
    public final void rule__Icon__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4490:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4491:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4491:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4492:1: '='
            {
             before(grammarAccess.getIconAccess().getEqualsSignKeyword_1_3_1()); 
            match(input,30,FOLLOW_30_in_rule__Icon__Group_1_3__1__Impl8831); 
             after(grammarAccess.getIconAccess().getEqualsSignKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_3__1__Impl"


    // $ANTLR start "rule__Icon__Group_1_3__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4505:1: rule__Icon__Group_1_3__2 : rule__Icon__Group_1_3__2__Impl rule__Icon__Group_1_3__3 ;
    public final void rule__Icon__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4509:1: ( rule__Icon__Group_1_3__2__Impl rule__Icon__Group_1_3__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4510:2: rule__Icon__Group_1_3__2__Impl rule__Icon__Group_1_3__3
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_3__2__Impl_in_rule__Icon__Group_1_3__28862);
            rule__Icon__Group_1_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_3__3_in_rule__Icon__Group_1_3__28865);
            rule__Icon__Group_1_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_3__2"


    // $ANTLR start "rule__Icon__Group_1_3__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4517:1: rule__Icon__Group_1_3__2__Impl : ( ( rule__Icon__Text_altAssignment_1_3_2 ) ) ;
    public final void rule__Icon__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4521:1: ( ( ( rule__Icon__Text_altAssignment_1_3_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4522:1: ( ( rule__Icon__Text_altAssignment_1_3_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4522:1: ( ( rule__Icon__Text_altAssignment_1_3_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4523:1: ( rule__Icon__Text_altAssignment_1_3_2 )
            {
             before(grammarAccess.getIconAccess().getText_altAssignment_1_3_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4524:1: ( rule__Icon__Text_altAssignment_1_3_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4524:2: rule__Icon__Text_altAssignment_1_3_2
            {
            pushFollow(FOLLOW_rule__Icon__Text_altAssignment_1_3_2_in_rule__Icon__Group_1_3__2__Impl8892);
            rule__Icon__Text_altAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getIconAccess().getText_altAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_3__2__Impl"


    // $ANTLR start "rule__Icon__Group_1_3__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4534:1: rule__Icon__Group_1_3__3 : rule__Icon__Group_1_3__3__Impl ;
    public final void rule__Icon__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4538:1: ( rule__Icon__Group_1_3__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4539:2: rule__Icon__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_3__3__Impl_in_rule__Icon__Group_1_3__38922);
            rule__Icon__Group_1_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_3__3"


    // $ANTLR start "rule__Icon__Group_1_3__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4545:1: rule__Icon__Group_1_3__3__Impl : ( ';' ) ;
    public final void rule__Icon__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4549:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4550:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4550:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4551:1: ';'
            {
             before(grammarAccess.getIconAccess().getSemicolonKeyword_1_3_3()); 
            match(input,31,FOLLOW_31_in_rule__Icon__Group_1_3__3__Impl8950); 
             after(grammarAccess.getIconAccess().getSemicolonKeyword_1_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_3__3__Impl"


    // $ANTLR start "rule__Icon__Group_1_4__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4572:1: rule__Icon__Group_1_4__0 : rule__Icon__Group_1_4__0__Impl rule__Icon__Group_1_4__1 ;
    public final void rule__Icon__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4576:1: ( rule__Icon__Group_1_4__0__Impl rule__Icon__Group_1_4__1 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4577:2: rule__Icon__Group_1_4__0__Impl rule__Icon__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_4__0__Impl_in_rule__Icon__Group_1_4__08989);
            rule__Icon__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_4__1_in_rule__Icon__Group_1_4__08992);
            rule__Icon__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_4__0"


    // $ANTLR start "rule__Icon__Group_1_4__0__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4584:1: rule__Icon__Group_1_4__0__Impl : ( 'address' ) ;
    public final void rule__Icon__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4588:1: ( ( 'address' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4589:1: ( 'address' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4589:1: ( 'address' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4590:1: 'address'
            {
             before(grammarAccess.getIconAccess().getAddressKeyword_1_4_0()); 
            match(input,54,FOLLOW_54_in_rule__Icon__Group_1_4__0__Impl9020); 
             after(grammarAccess.getIconAccess().getAddressKeyword_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_4__0__Impl"


    // $ANTLR start "rule__Icon__Group_1_4__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4603:1: rule__Icon__Group_1_4__1 : rule__Icon__Group_1_4__1__Impl rule__Icon__Group_1_4__2 ;
    public final void rule__Icon__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4607:1: ( rule__Icon__Group_1_4__1__Impl rule__Icon__Group_1_4__2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4608:2: rule__Icon__Group_1_4__1__Impl rule__Icon__Group_1_4__2
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_4__1__Impl_in_rule__Icon__Group_1_4__19051);
            rule__Icon__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_4__2_in_rule__Icon__Group_1_4__19054);
            rule__Icon__Group_1_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_4__1"


    // $ANTLR start "rule__Icon__Group_1_4__1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4615:1: rule__Icon__Group_1_4__1__Impl : ( '=' ) ;
    public final void rule__Icon__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4619:1: ( ( '=' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4620:1: ( '=' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4620:1: ( '=' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4621:1: '='
            {
             before(grammarAccess.getIconAccess().getEqualsSignKeyword_1_4_1()); 
            match(input,30,FOLLOW_30_in_rule__Icon__Group_1_4__1__Impl9082); 
             after(grammarAccess.getIconAccess().getEqualsSignKeyword_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_4__1__Impl"


    // $ANTLR start "rule__Icon__Group_1_4__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4634:1: rule__Icon__Group_1_4__2 : rule__Icon__Group_1_4__2__Impl rule__Icon__Group_1_4__3 ;
    public final void rule__Icon__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4638:1: ( rule__Icon__Group_1_4__2__Impl rule__Icon__Group_1_4__3 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4639:2: rule__Icon__Group_1_4__2__Impl rule__Icon__Group_1_4__3
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_4__2__Impl_in_rule__Icon__Group_1_4__29113);
            rule__Icon__Group_1_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Icon__Group_1_4__3_in_rule__Icon__Group_1_4__29116);
            rule__Icon__Group_1_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_4__2"


    // $ANTLR start "rule__Icon__Group_1_4__2__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4646:1: rule__Icon__Group_1_4__2__Impl : ( ( rule__Icon__AddressAssignment_1_4_2 ) ) ;
    public final void rule__Icon__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4650:1: ( ( ( rule__Icon__AddressAssignment_1_4_2 ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4651:1: ( ( rule__Icon__AddressAssignment_1_4_2 ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4651:1: ( ( rule__Icon__AddressAssignment_1_4_2 ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4652:1: ( rule__Icon__AddressAssignment_1_4_2 )
            {
             before(grammarAccess.getIconAccess().getAddressAssignment_1_4_2()); 
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4653:1: ( rule__Icon__AddressAssignment_1_4_2 )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4653:2: rule__Icon__AddressAssignment_1_4_2
            {
            pushFollow(FOLLOW_rule__Icon__AddressAssignment_1_4_2_in_rule__Icon__Group_1_4__2__Impl9143);
            rule__Icon__AddressAssignment_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getIconAccess().getAddressAssignment_1_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_4__2__Impl"


    // $ANTLR start "rule__Icon__Group_1_4__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4663:1: rule__Icon__Group_1_4__3 : rule__Icon__Group_1_4__3__Impl ;
    public final void rule__Icon__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4667:1: ( rule__Icon__Group_1_4__3__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4668:2: rule__Icon__Group_1_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Icon__Group_1_4__3__Impl_in_rule__Icon__Group_1_4__39173);
            rule__Icon__Group_1_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_4__3"


    // $ANTLR start "rule__Icon__Group_1_4__3__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4674:1: rule__Icon__Group_1_4__3__Impl : ( ';' ) ;
    public final void rule__Icon__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4678:1: ( ( ';' ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4679:1: ( ';' )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4679:1: ( ';' )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4680:1: ';'
            {
             before(grammarAccess.getIconAccess().getSemicolonKeyword_1_4_3()); 
            match(input,31,FOLLOW_31_in_rule__Icon__Group_1_4__3__Impl9201); 
             after(grammarAccess.getIconAccess().getSemicolonKeyword_1_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group_1_4__3__Impl"


    // $ANTLR start "rule__Menu__UnorderedGroup"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4702:1: rule__Menu__UnorderedGroup : rule__Menu__UnorderedGroup__0 {...}?;
    public final void rule__Menu__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMenuAccess().getUnorderedGroup());
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4707:1: ( rule__Menu__UnorderedGroup__0 {...}?)
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4708:2: rule__Menu__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Menu__UnorderedGroup__0_in_rule__Menu__UnorderedGroup9241);
            rule__Menu__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMenuAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Menu__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getMenuAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMenuAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__UnorderedGroup"


    // $ANTLR start "rule__Menu__UnorderedGroup__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4719:1: rule__Menu__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Menu__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_6__0 ) ) ) ) ) ;
    public final void rule__Menu__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4724:1: ( ( ({...}? => ( ( ( rule__Menu__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_6__0 ) ) ) ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4725:3: ( ({...}? => ( ( ( rule__Menu__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_6__0 ) ) ) ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4725:3: ( ({...}? => ( ( ( rule__Menu__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Menu__Group_6__0 ) ) ) ) )
            int alt11=7;
            int LA11_0 = input.LA(1);

            if ( LA11_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 1) ) {
                alt11=2;
            }
            else if ( LA11_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 2) ) {
                alt11=3;
            }
            else if ( LA11_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 3) ) {
                alt11=4;
            }
            else if ( LA11_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 4) ) {
                alt11=5;
            }
            else if ( LA11_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 5) ) {
                alt11=6;
            }
            else if ( LA11_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 6) ) {
                alt11=7;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4727:4: ({...}? => ( ( ( rule__Menu__Group_0__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4727:4: ({...}? => ( ( ( rule__Menu__Group_0__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4728:5: {...}? => ( ( ( rule__Menu__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Menu__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 0)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4728:99: ( ( ( rule__Menu__Group_0__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4729:6: ( ( rule__Menu__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4735:6: ( ( rule__Menu__Group_0__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4737:7: ( rule__Menu__Group_0__0 )
                    {
                     before(grammarAccess.getMenuAccess().getGroup_0()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4738:7: ( rule__Menu__Group_0__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4738:8: rule__Menu__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Menu__Group_0__0_in_rule__Menu__UnorderedGroup__Impl9330);
                    rule__Menu__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMenuAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4744:4: ({...}? => ( ( ( rule__Menu__Group_1__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4744:4: ({...}? => ( ( ( rule__Menu__Group_1__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4745:5: {...}? => ( ( ( rule__Menu__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Menu__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 1)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4745:99: ( ( ( rule__Menu__Group_1__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4746:6: ( ( rule__Menu__Group_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4752:6: ( ( rule__Menu__Group_1__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4754:7: ( rule__Menu__Group_1__0 )
                    {
                     before(grammarAccess.getMenuAccess().getGroup_1()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4755:7: ( rule__Menu__Group_1__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4755:8: rule__Menu__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Menu__Group_1__0_in_rule__Menu__UnorderedGroup__Impl9421);
                    rule__Menu__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMenuAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4761:4: ({...}? => ( ( ( rule__Menu__Group_2__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4761:4: ({...}? => ( ( ( rule__Menu__Group_2__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4762:5: {...}? => ( ( ( rule__Menu__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Menu__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 2)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4762:99: ( ( ( rule__Menu__Group_2__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4763:6: ( ( rule__Menu__Group_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4769:6: ( ( rule__Menu__Group_2__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4771:7: ( rule__Menu__Group_2__0 )
                    {
                     before(grammarAccess.getMenuAccess().getGroup_2()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4772:7: ( rule__Menu__Group_2__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4772:8: rule__Menu__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Menu__Group_2__0_in_rule__Menu__UnorderedGroup__Impl9512);
                    rule__Menu__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMenuAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4778:4: ({...}? => ( ( ( rule__Menu__Group_3__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4778:4: ({...}? => ( ( ( rule__Menu__Group_3__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4779:5: {...}? => ( ( ( rule__Menu__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Menu__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 3)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4779:99: ( ( ( rule__Menu__Group_3__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4780:6: ( ( rule__Menu__Group_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4786:6: ( ( rule__Menu__Group_3__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4788:7: ( rule__Menu__Group_3__0 )
                    {
                     before(grammarAccess.getMenuAccess().getGroup_3()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4789:7: ( rule__Menu__Group_3__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4789:8: rule__Menu__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Menu__Group_3__0_in_rule__Menu__UnorderedGroup__Impl9603);
                    rule__Menu__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMenuAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4795:4: ({...}? => ( ( ( rule__Menu__Group_4__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4795:4: ({...}? => ( ( ( rule__Menu__Group_4__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4796:5: {...}? => ( ( ( rule__Menu__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Menu__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 4)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4796:99: ( ( ( rule__Menu__Group_4__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4797:6: ( ( rule__Menu__Group_4__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4803:6: ( ( rule__Menu__Group_4__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4805:7: ( rule__Menu__Group_4__0 )
                    {
                     before(grammarAccess.getMenuAccess().getGroup_4()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4806:7: ( rule__Menu__Group_4__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4806:8: rule__Menu__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Menu__Group_4__0_in_rule__Menu__UnorderedGroup__Impl9694);
                    rule__Menu__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMenuAccess().getGroup_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4812:4: ({...}? => ( ( ( rule__Menu__Group_5__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4812:4: ({...}? => ( ( ( rule__Menu__Group_5__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4813:5: {...}? => ( ( ( rule__Menu__Group_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__Menu__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 5)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4813:99: ( ( ( rule__Menu__Group_5__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4814:6: ( ( rule__Menu__Group_5__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4820:6: ( ( rule__Menu__Group_5__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4822:7: ( rule__Menu__Group_5__0 )
                    {
                     before(grammarAccess.getMenuAccess().getGroup_5()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4823:7: ( rule__Menu__Group_5__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4823:8: rule__Menu__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Menu__Group_5__0_in_rule__Menu__UnorderedGroup__Impl9785);
                    rule__Menu__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMenuAccess().getGroup_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4829:4: ({...}? => ( ( ( rule__Menu__Group_6__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4829:4: ({...}? => ( ( ( rule__Menu__Group_6__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4830:5: {...}? => ( ( ( rule__Menu__Group_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 6) ) {
                        throw new FailedPredicateException(input, "rule__Menu__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 6)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4830:99: ( ( ( rule__Menu__Group_6__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4831:6: ( ( rule__Menu__Group_6__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getMenuAccess().getUnorderedGroup(), 6);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4837:6: ( ( rule__Menu__Group_6__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4839:7: ( rule__Menu__Group_6__0 )
                    {
                     before(grammarAccess.getMenuAccess().getGroup_6()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4840:7: ( rule__Menu__Group_6__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4840:8: rule__Menu__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Menu__Group_6__0_in_rule__Menu__UnorderedGroup__Impl9876);
                    rule__Menu__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMenuAccess().getGroup_6()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMenuAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__UnorderedGroup__Impl"


    // $ANTLR start "rule__Menu__UnorderedGroup__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4855:1: rule__Menu__UnorderedGroup__0 : rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__1 )? ;
    public final void rule__Menu__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4859:1: ( rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__1 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4860:2: rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__09935);
            rule__Menu__UnorderedGroup__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4861:2: ( rule__Menu__UnorderedGroup__1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 1) ) {
                alt12=1;
            }
            else if ( LA12_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 2) ) {
                alt12=1;
            }
            else if ( LA12_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 3) ) {
                alt12=1;
            }
            else if ( LA12_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 4) ) {
                alt12=1;
            }
            else if ( LA12_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 5) ) {
                alt12=1;
            }
            else if ( LA12_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 6) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4861:2: rule__Menu__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Menu__UnorderedGroup__1_in_rule__Menu__UnorderedGroup__09938);
                    rule__Menu__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__UnorderedGroup__0"


    // $ANTLR start "rule__Menu__UnorderedGroup__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4868:1: rule__Menu__UnorderedGroup__1 : rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__2 )? ;
    public final void rule__Menu__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4872:1: ( rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__2 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4873:2: rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__19963);
            rule__Menu__UnorderedGroup__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4874:2: ( rule__Menu__UnorderedGroup__2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 1) ) {
                alt13=1;
            }
            else if ( LA13_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 2) ) {
                alt13=1;
            }
            else if ( LA13_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 3) ) {
                alt13=1;
            }
            else if ( LA13_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 4) ) {
                alt13=1;
            }
            else if ( LA13_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 5) ) {
                alt13=1;
            }
            else if ( LA13_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 6) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4874:2: rule__Menu__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_rule__Menu__UnorderedGroup__2_in_rule__Menu__UnorderedGroup__19966);
                    rule__Menu__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__UnorderedGroup__1"


    // $ANTLR start "rule__Menu__UnorderedGroup__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4881:1: rule__Menu__UnorderedGroup__2 : rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__3 )? ;
    public final void rule__Menu__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4885:1: ( rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__3 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4886:2: rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__29991);
            rule__Menu__UnorderedGroup__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4887:2: ( rule__Menu__UnorderedGroup__3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 1) ) {
                alt14=1;
            }
            else if ( LA14_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 2) ) {
                alt14=1;
            }
            else if ( LA14_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 3) ) {
                alt14=1;
            }
            else if ( LA14_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 4) ) {
                alt14=1;
            }
            else if ( LA14_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 5) ) {
                alt14=1;
            }
            else if ( LA14_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 6) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4887:2: rule__Menu__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_rule__Menu__UnorderedGroup__3_in_rule__Menu__UnorderedGroup__29994);
                    rule__Menu__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__UnorderedGroup__2"


    // $ANTLR start "rule__Menu__UnorderedGroup__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4894:1: rule__Menu__UnorderedGroup__3 : rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__4 )? ;
    public final void rule__Menu__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4898:1: ( rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__4 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4899:2: rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__310019);
            rule__Menu__UnorderedGroup__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4900:2: ( rule__Menu__UnorderedGroup__4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 1) ) {
                alt15=1;
            }
            else if ( LA15_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 2) ) {
                alt15=1;
            }
            else if ( LA15_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 3) ) {
                alt15=1;
            }
            else if ( LA15_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 4) ) {
                alt15=1;
            }
            else if ( LA15_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 5) ) {
                alt15=1;
            }
            else if ( LA15_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 6) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4900:2: rule__Menu__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_rule__Menu__UnorderedGroup__4_in_rule__Menu__UnorderedGroup__310022);
                    rule__Menu__UnorderedGroup__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__UnorderedGroup__3"


    // $ANTLR start "rule__Menu__UnorderedGroup__4"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4907:1: rule__Menu__UnorderedGroup__4 : rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__5 )? ;
    public final void rule__Menu__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4911:1: ( rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__5 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4912:2: rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__410047);
            rule__Menu__UnorderedGroup__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4913:2: ( rule__Menu__UnorderedGroup__5 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 1) ) {
                alt16=1;
            }
            else if ( LA16_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 2) ) {
                alt16=1;
            }
            else if ( LA16_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 3) ) {
                alt16=1;
            }
            else if ( LA16_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 4) ) {
                alt16=1;
            }
            else if ( LA16_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 5) ) {
                alt16=1;
            }
            else if ( LA16_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 6) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4913:2: rule__Menu__UnorderedGroup__5
                    {
                    pushFollow(FOLLOW_rule__Menu__UnorderedGroup__5_in_rule__Menu__UnorderedGroup__410050);
                    rule__Menu__UnorderedGroup__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__UnorderedGroup__4"


    // $ANTLR start "rule__Menu__UnorderedGroup__5"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4920:1: rule__Menu__UnorderedGroup__5 : rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__6 )? ;
    public final void rule__Menu__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4924:1: ( rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__6 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4925:2: rule__Menu__UnorderedGroup__Impl ( rule__Menu__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__510075);
            rule__Menu__UnorderedGroup__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4926:2: ( rule__Menu__UnorderedGroup__6 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 1) ) {
                alt17=1;
            }
            else if ( LA17_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 2) ) {
                alt17=1;
            }
            else if ( LA17_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 3) ) {
                alt17=1;
            }
            else if ( LA17_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 4) ) {
                alt17=1;
            }
            else if ( LA17_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 5) ) {
                alt17=1;
            }
            else if ( LA17_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMenuAccess().getUnorderedGroup(), 6) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4926:2: rule__Menu__UnorderedGroup__6
                    {
                    pushFollow(FOLLOW_rule__Menu__UnorderedGroup__6_in_rule__Menu__UnorderedGroup__510078);
                    rule__Menu__UnorderedGroup__6();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__UnorderedGroup__5"


    // $ANTLR start "rule__Menu__UnorderedGroup__6"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4933:1: rule__Menu__UnorderedGroup__6 : rule__Menu__UnorderedGroup__Impl ;
    public final void rule__Menu__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4937:1: ( rule__Menu__UnorderedGroup__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4938:2: rule__Menu__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__610103);
            rule__Menu__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__UnorderedGroup__6"


    // $ANTLR start "rule__Item__UnorderedGroup_1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4959:1: rule__Item__UnorderedGroup_1 : rule__Item__UnorderedGroup_1__0 {...}?;
    public final void rule__Item__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getItemAccess().getUnorderedGroup_1());
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4964:1: ( rule__Item__UnorderedGroup_1__0 {...}?)
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4965:2: rule__Item__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__0_in_rule__Item__UnorderedGroup_110141);
            rule__Item__UnorderedGroup_1__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getItemAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "rule__Item__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getItemAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UnorderedGroup_1"


    // $ANTLR start "rule__Item__UnorderedGroup_1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4976:1: rule__Item__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__Item__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_8__0 ) ) ) ) ) ;
    public final void rule__Item__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4981:1: ( ( ({...}? => ( ( ( rule__Item__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_8__0 ) ) ) ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4982:3: ( ({...}? => ( ( ( rule__Item__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_8__0 ) ) ) ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4982:3: ( ({...}? => ( ( ( rule__Item__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_8__0 ) ) ) ) )
            int alt18=9;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4984:4: ({...}? => ( ( ( rule__Item__Group_1_0__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4984:4: ({...}? => ( ( ( rule__Item__Group_1_0__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4985:5: {...}? => ( ( ( rule__Item__Group_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Item__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4985:101: ( ( ( rule__Item__Group_1_0__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4986:6: ( ( rule__Item__Group_1_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4992:6: ( ( rule__Item__Group_1_0__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4994:7: ( rule__Item__Group_1_0__0 )
                    {
                     before(grammarAccess.getItemAccess().getGroup_1_0()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4995:7: ( rule__Item__Group_1_0__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:4995:8: rule__Item__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Item__Group_1_0__0_in_rule__Item__UnorderedGroup_1__Impl10230);
                    rule__Item__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getGroup_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5001:4: ({...}? => ( ( ( rule__Item__Group_1_1__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5001:4: ({...}? => ( ( ( rule__Item__Group_1_1__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5002:5: {...}? => ( ( ( rule__Item__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Item__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5002:101: ( ( ( rule__Item__Group_1_1__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5003:6: ( ( rule__Item__Group_1_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5009:6: ( ( rule__Item__Group_1_1__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5011:7: ( rule__Item__Group_1_1__0 )
                    {
                     before(grammarAccess.getItemAccess().getGroup_1_1()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5012:7: ( rule__Item__Group_1_1__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5012:8: rule__Item__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Item__Group_1_1__0_in_rule__Item__UnorderedGroup_1__Impl10321);
                    rule__Item__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getGroup_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5018:4: ({...}? => ( ( ( rule__Item__Group_1_2__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5018:4: ({...}? => ( ( ( rule__Item__Group_1_2__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5019:5: {...}? => ( ( ( rule__Item__Group_1_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Item__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5019:101: ( ( ( rule__Item__Group_1_2__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5020:6: ( ( rule__Item__Group_1_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5026:6: ( ( rule__Item__Group_1_2__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5028:7: ( rule__Item__Group_1_2__0 )
                    {
                     before(grammarAccess.getItemAccess().getGroup_1_2()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5029:7: ( rule__Item__Group_1_2__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5029:8: rule__Item__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Item__Group_1_2__0_in_rule__Item__UnorderedGroup_1__Impl10412);
                    rule__Item__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getGroup_1_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5035:4: ({...}? => ( ( ( rule__Item__Group_1_3__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5035:4: ({...}? => ( ( ( rule__Item__Group_1_3__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5036:5: {...}? => ( ( ( rule__Item__Group_1_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Item__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5036:101: ( ( ( rule__Item__Group_1_3__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5037:6: ( ( rule__Item__Group_1_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5043:6: ( ( rule__Item__Group_1_3__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5045:7: ( rule__Item__Group_1_3__0 )
                    {
                     before(grammarAccess.getItemAccess().getGroup_1_3()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5046:7: ( rule__Item__Group_1_3__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5046:8: rule__Item__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Item__Group_1_3__0_in_rule__Item__UnorderedGroup_1__Impl10503);
                    rule__Item__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getGroup_1_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5052:4: ({...}? => ( ( ( rule__Item__Group_1_4__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5052:4: ({...}? => ( ( ( rule__Item__Group_1_4__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5053:5: {...}? => ( ( ( rule__Item__Group_1_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Item__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5053:101: ( ( ( rule__Item__Group_1_4__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5054:6: ( ( rule__Item__Group_1_4__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5060:6: ( ( rule__Item__Group_1_4__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5062:7: ( rule__Item__Group_1_4__0 )
                    {
                     before(grammarAccess.getItemAccess().getGroup_1_4()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5063:7: ( rule__Item__Group_1_4__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5063:8: rule__Item__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__Item__Group_1_4__0_in_rule__Item__UnorderedGroup_1__Impl10594);
                    rule__Item__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getGroup_1_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5069:4: ({...}? => ( ( ( rule__Item__Group_1_5__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5069:4: ({...}? => ( ( ( rule__Item__Group_1_5__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5070:5: {...}? => ( ( ( rule__Item__Group_1_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {
                        throw new FailedPredicateException(input, "rule__Item__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5070:101: ( ( ( rule__Item__Group_1_5__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5071:6: ( ( rule__Item__Group_1_5__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5077:6: ( ( rule__Item__Group_1_5__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5079:7: ( rule__Item__Group_1_5__0 )
                    {
                     before(grammarAccess.getItemAccess().getGroup_1_5()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5080:7: ( rule__Item__Group_1_5__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5080:8: rule__Item__Group_1_5__0
                    {
                    pushFollow(FOLLOW_rule__Item__Group_1_5__0_in_rule__Item__UnorderedGroup_1__Impl10685);
                    rule__Item__Group_1_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getGroup_1_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5086:4: ({...}? => ( ( ( rule__Item__Group_1_6__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5086:4: ({...}? => ( ( ( rule__Item__Group_1_6__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5087:5: {...}? => ( ( ( rule__Item__Group_1_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6) ) {
                        throw new FailedPredicateException(input, "rule__Item__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5087:101: ( ( ( rule__Item__Group_1_6__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5088:6: ( ( rule__Item__Group_1_6__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5094:6: ( ( rule__Item__Group_1_6__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5096:7: ( rule__Item__Group_1_6__0 )
                    {
                     before(grammarAccess.getItemAccess().getGroup_1_6()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5097:7: ( rule__Item__Group_1_6__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5097:8: rule__Item__Group_1_6__0
                    {
                    pushFollow(FOLLOW_rule__Item__Group_1_6__0_in_rule__Item__UnorderedGroup_1__Impl10776);
                    rule__Item__Group_1_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getGroup_1_6()); 

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5103:4: ({...}? => ( ( ( rule__Item__Group_1_7__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5103:4: ({...}? => ( ( ( rule__Item__Group_1_7__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5104:5: {...}? => ( ( ( rule__Item__Group_1_7__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7) ) {
                        throw new FailedPredicateException(input, "rule__Item__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5104:101: ( ( ( rule__Item__Group_1_7__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5105:6: ( ( rule__Item__Group_1_7__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5111:6: ( ( rule__Item__Group_1_7__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5113:7: ( rule__Item__Group_1_7__0 )
                    {
                     before(grammarAccess.getItemAccess().getGroup_1_7()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5114:7: ( rule__Item__Group_1_7__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5114:8: rule__Item__Group_1_7__0
                    {
                    pushFollow(FOLLOW_rule__Item__Group_1_7__0_in_rule__Item__UnorderedGroup_1__Impl10867);
                    rule__Item__Group_1_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getGroup_1_7()); 

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5120:4: ({...}? => ( ( ( rule__Item__Group_1_8__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5120:4: ({...}? => ( ( ( rule__Item__Group_1_8__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5121:5: {...}? => ( ( ( rule__Item__Group_1_8__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8) ) {
                        throw new FailedPredicateException(input, "rule__Item__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5121:101: ( ( ( rule__Item__Group_1_8__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5122:6: ( ( rule__Item__Group_1_8__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5128:6: ( ( rule__Item__Group_1_8__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5130:7: ( rule__Item__Group_1_8__0 )
                    {
                     before(grammarAccess.getItemAccess().getGroup_1_8()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5131:7: ( rule__Item__Group_1_8__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5131:8: rule__Item__Group_1_8__0
                    {
                    pushFollow(FOLLOW_rule__Item__Group_1_8__0_in_rule__Item__UnorderedGroup_1__Impl10958);
                    rule__Item__Group_1_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getGroup_1_8()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__Item__UnorderedGroup_1__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5146:1: rule__Item__UnorderedGroup_1__0 : rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__1 )? ;
    public final void rule__Item__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5150:1: ( rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__1 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5151:2: rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__011017);
            rule__Item__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5152:2: ( rule__Item__UnorderedGroup_1__1 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5152:2: rule__Item__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__1_in_rule__Item__UnorderedGroup_1__011020);
                    rule__Item__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UnorderedGroup_1__0"


    // $ANTLR start "rule__Item__UnorderedGroup_1__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5159:1: rule__Item__UnorderedGroup_1__1 : rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__2 )? ;
    public final void rule__Item__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5163:1: ( rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__2 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5164:2: rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__111045);
            rule__Item__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5165:2: ( rule__Item__UnorderedGroup_1__2 )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5165:2: rule__Item__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__2_in_rule__Item__UnorderedGroup_1__111048);
                    rule__Item__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UnorderedGroup_1__1"


    // $ANTLR start "rule__Item__UnorderedGroup_1__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5172:1: rule__Item__UnorderedGroup_1__2 : rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__3 )? ;
    public final void rule__Item__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5176:1: ( rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__3 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5177:2: rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__3 )?
            {
            pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__211073);
            rule__Item__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5178:2: ( rule__Item__UnorderedGroup_1__3 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5178:2: rule__Item__UnorderedGroup_1__3
                    {
                    pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__3_in_rule__Item__UnorderedGroup_1__211076);
                    rule__Item__UnorderedGroup_1__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UnorderedGroup_1__2"


    // $ANTLR start "rule__Item__UnorderedGroup_1__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5185:1: rule__Item__UnorderedGroup_1__3 : rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__4 )? ;
    public final void rule__Item__UnorderedGroup_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5189:1: ( rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__4 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5190:2: rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__4 )?
            {
            pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__311101);
            rule__Item__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5191:2: ( rule__Item__UnorderedGroup_1__4 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5191:2: rule__Item__UnorderedGroup_1__4
                    {
                    pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__4_in_rule__Item__UnorderedGroup_1__311104);
                    rule__Item__UnorderedGroup_1__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UnorderedGroup_1__3"


    // $ANTLR start "rule__Item__UnorderedGroup_1__4"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5198:1: rule__Item__UnorderedGroup_1__4 : rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__5 )? ;
    public final void rule__Item__UnorderedGroup_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5202:1: ( rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__5 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5203:2: rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__5 )?
            {
            pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__411129);
            rule__Item__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5204:2: ( rule__Item__UnorderedGroup_1__5 )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5204:2: rule__Item__UnorderedGroup_1__5
                    {
                    pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__5_in_rule__Item__UnorderedGroup_1__411132);
                    rule__Item__UnorderedGroup_1__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UnorderedGroup_1__4"


    // $ANTLR start "rule__Item__UnorderedGroup_1__5"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5211:1: rule__Item__UnorderedGroup_1__5 : rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__6 )? ;
    public final void rule__Item__UnorderedGroup_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5215:1: ( rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__6 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5216:2: rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__6 )?
            {
            pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__511157);
            rule__Item__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5217:2: ( rule__Item__UnorderedGroup_1__6 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5217:2: rule__Item__UnorderedGroup_1__6
                    {
                    pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__6_in_rule__Item__UnorderedGroup_1__511160);
                    rule__Item__UnorderedGroup_1__6();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UnorderedGroup_1__5"


    // $ANTLR start "rule__Item__UnorderedGroup_1__6"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5224:1: rule__Item__UnorderedGroup_1__6 : rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__7 )? ;
    public final void rule__Item__UnorderedGroup_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5228:1: ( rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__7 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5229:2: rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__7 )?
            {
            pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__611185);
            rule__Item__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5230:2: ( rule__Item__UnorderedGroup_1__7 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5230:2: rule__Item__UnorderedGroup_1__7
                    {
                    pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__7_in_rule__Item__UnorderedGroup_1__611188);
                    rule__Item__UnorderedGroup_1__7();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UnorderedGroup_1__6"


    // $ANTLR start "rule__Item__UnorderedGroup_1__7"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5237:1: rule__Item__UnorderedGroup_1__7 : rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__8 )? ;
    public final void rule__Item__UnorderedGroup_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5241:1: ( rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__8 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5242:2: rule__Item__UnorderedGroup_1__Impl ( rule__Item__UnorderedGroup_1__8 )?
            {
            pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__711213);
            rule__Item__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5243:2: ( rule__Item__UnorderedGroup_1__8 )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5243:2: rule__Item__UnorderedGroup_1__8
                    {
                    pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__8_in_rule__Item__UnorderedGroup_1__711216);
                    rule__Item__UnorderedGroup_1__8();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UnorderedGroup_1__7"


    // $ANTLR start "rule__Item__UnorderedGroup_1__8"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5250:1: rule__Item__UnorderedGroup_1__8 : rule__Item__UnorderedGroup_1__Impl ;
    public final void rule__Item__UnorderedGroup_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5254:1: ( rule__Item__UnorderedGroup_1__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5255:2: rule__Item__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__811241);
            rule__Item__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UnorderedGroup_1__8"


    // $ANTLR start "rule__SubMenu__UnorderedGroup_1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5280:1: rule__SubMenu__UnorderedGroup_1 : rule__SubMenu__UnorderedGroup_1__0 {...}?;
    public final void rule__SubMenu__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSubMenuAccess().getUnorderedGroup_1());
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5285:1: ( rule__SubMenu__UnorderedGroup_1__0 {...}?)
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5286:2: rule__SubMenu__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_rule__SubMenu__UnorderedGroup_1__0_in_rule__SubMenu__UnorderedGroup_111283);
            rule__SubMenu__UnorderedGroup_1__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSubMenuAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "rule__SubMenu__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getSubMenuAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getSubMenuAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__UnorderedGroup_1"


    // $ANTLR start "rule__SubMenu__UnorderedGroup_1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5297:1: rule__SubMenu__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__SubMenu__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SubMenu__Group_1_1__0 ) ) ) ) ) ;
    public final void rule__SubMenu__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5302:1: ( ( ({...}? => ( ( ( rule__SubMenu__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SubMenu__Group_1_1__0 ) ) ) ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5303:3: ( ({...}? => ( ( ( rule__SubMenu__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SubMenu__Group_1_1__0 ) ) ) ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5303:3: ( ({...}? => ( ( ( rule__SubMenu__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SubMenu__Group_1_1__0 ) ) ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 1) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5305:4: ({...}? => ( ( ( rule__SubMenu__Group_1_0__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5305:4: ({...}? => ( ( ( rule__SubMenu__Group_1_0__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5306:5: {...}? => ( ( ( rule__SubMenu__Group_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__SubMenu__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5306:104: ( ( ( rule__SubMenu__Group_1_0__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5307:6: ( ( rule__SubMenu__Group_1_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5313:6: ( ( rule__SubMenu__Group_1_0__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5315:7: ( rule__SubMenu__Group_1_0__0 )
                    {
                     before(grammarAccess.getSubMenuAccess().getGroup_1_0()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5316:7: ( rule__SubMenu__Group_1_0__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5316:8: rule__SubMenu__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__SubMenu__Group_1_0__0_in_rule__SubMenu__UnorderedGroup_1__Impl11372);
                    rule__SubMenu__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubMenuAccess().getGroup_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5322:4: ({...}? => ( ( ( rule__SubMenu__Group_1_1__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5322:4: ({...}? => ( ( ( rule__SubMenu__Group_1_1__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5323:5: {...}? => ( ( ( rule__SubMenu__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__SubMenu__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5323:104: ( ( ( rule__SubMenu__Group_1_1__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5324:6: ( ( rule__SubMenu__Group_1_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5330:6: ( ( rule__SubMenu__Group_1_1__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5332:7: ( rule__SubMenu__Group_1_1__0 )
                    {
                     before(grammarAccess.getSubMenuAccess().getGroup_1_1()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5333:7: ( rule__SubMenu__Group_1_1__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5333:8: rule__SubMenu__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__SubMenu__Group_1_1__0_in_rule__SubMenu__UnorderedGroup_1__Impl11463);
                    rule__SubMenu__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubMenuAccess().getGroup_1_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubMenuAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__SubMenu__UnorderedGroup_1__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5348:1: rule__SubMenu__UnorderedGroup_1__0 : rule__SubMenu__UnorderedGroup_1__Impl ( rule__SubMenu__UnorderedGroup_1__1 )? ;
    public final void rule__SubMenu__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5352:1: ( rule__SubMenu__UnorderedGroup_1__Impl ( rule__SubMenu__UnorderedGroup_1__1 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5353:2: rule__SubMenu__UnorderedGroup_1__Impl ( rule__SubMenu__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__SubMenu__UnorderedGroup_1__Impl_in_rule__SubMenu__UnorderedGroup_1__011522);
            rule__SubMenu__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5354:2: ( rule__SubMenu__UnorderedGroup_1__1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubMenuAccess().getUnorderedGroup_1(), 1) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5354:2: rule__SubMenu__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__SubMenu__UnorderedGroup_1__1_in_rule__SubMenu__UnorderedGroup_1__011525);
                    rule__SubMenu__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__UnorderedGroup_1__0"


    // $ANTLR start "rule__SubMenu__UnorderedGroup_1__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5361:1: rule__SubMenu__UnorderedGroup_1__1 : rule__SubMenu__UnorderedGroup_1__Impl ;
    public final void rule__SubMenu__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5365:1: ( rule__SubMenu__UnorderedGroup_1__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5366:2: rule__SubMenu__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__SubMenu__UnorderedGroup_1__Impl_in_rule__SubMenu__UnorderedGroup_1__111550);
            rule__SubMenu__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__UnorderedGroup_1__1"


    // $ANTLR start "rule__Icon__UnorderedGroup_1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5377:1: rule__Icon__UnorderedGroup_1 : rule__Icon__UnorderedGroup_1__0 {...}?;
    public final void rule__Icon__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getIconAccess().getUnorderedGroup_1());
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5382:1: ( rule__Icon__UnorderedGroup_1__0 {...}?)
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5383:2: rule__Icon__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_rule__Icon__UnorderedGroup_1__0_in_rule__Icon__UnorderedGroup_111578);
            rule__Icon__UnorderedGroup_1__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getIconAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "rule__Icon__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getIconAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__UnorderedGroup_1"


    // $ANTLR start "rule__Icon__UnorderedGroup_1__Impl"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5394:1: rule__Icon__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__Icon__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_4__0 ) ) ) ) ) ;
    public final void rule__Icon__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5399:1: ( ( ({...}? => ( ( ( rule__Icon__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_4__0 ) ) ) ) ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5400:3: ( ({...}? => ( ( ( rule__Icon__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_4__0 ) ) ) ) )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5400:3: ( ({...}? => ( ( ( rule__Icon__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Icon__Group_1_4__0 ) ) ) ) )
            int alt29=5;
            int LA29_0 = input.LA(1);

            if ( LA29_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1) ) {
                alt29=2;
            }
            else if ( LA29_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2) ) {
                alt29=3;
            }
            else if ( LA29_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3) ) {
                alt29=4;
            }
            else if ( LA29_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4) ) {
                alt29=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5402:4: ({...}? => ( ( ( rule__Icon__Group_1_0__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5402:4: ({...}? => ( ( ( rule__Icon__Group_1_0__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5403:5: {...}? => ( ( ( rule__Icon__Group_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Icon__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5403:101: ( ( ( rule__Icon__Group_1_0__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5404:6: ( ( rule__Icon__Group_1_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5410:6: ( ( rule__Icon__Group_1_0__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5412:7: ( rule__Icon__Group_1_0__0 )
                    {
                     before(grammarAccess.getIconAccess().getGroup_1_0()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5413:7: ( rule__Icon__Group_1_0__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5413:8: rule__Icon__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Icon__Group_1_0__0_in_rule__Icon__UnorderedGroup_1__Impl11667);
                    rule__Icon__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIconAccess().getGroup_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5419:4: ({...}? => ( ( ( rule__Icon__Group_1_1__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5419:4: ({...}? => ( ( ( rule__Icon__Group_1_1__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5420:5: {...}? => ( ( ( rule__Icon__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Icon__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5420:101: ( ( ( rule__Icon__Group_1_1__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5421:6: ( ( rule__Icon__Group_1_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5427:6: ( ( rule__Icon__Group_1_1__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5429:7: ( rule__Icon__Group_1_1__0 )
                    {
                     before(grammarAccess.getIconAccess().getGroup_1_1()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5430:7: ( rule__Icon__Group_1_1__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5430:8: rule__Icon__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Icon__Group_1_1__0_in_rule__Icon__UnorderedGroup_1__Impl11758);
                    rule__Icon__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIconAccess().getGroup_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5436:4: ({...}? => ( ( ( rule__Icon__Group_1_2__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5436:4: ({...}? => ( ( ( rule__Icon__Group_1_2__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5437:5: {...}? => ( ( ( rule__Icon__Group_1_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Icon__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5437:101: ( ( ( rule__Icon__Group_1_2__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5438:6: ( ( rule__Icon__Group_1_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5444:6: ( ( rule__Icon__Group_1_2__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5446:7: ( rule__Icon__Group_1_2__0 )
                    {
                     before(grammarAccess.getIconAccess().getGroup_1_2()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5447:7: ( rule__Icon__Group_1_2__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5447:8: rule__Icon__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Icon__Group_1_2__0_in_rule__Icon__UnorderedGroup_1__Impl11849);
                    rule__Icon__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIconAccess().getGroup_1_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5453:4: ({...}? => ( ( ( rule__Icon__Group_1_3__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5453:4: ({...}? => ( ( ( rule__Icon__Group_1_3__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5454:5: {...}? => ( ( ( rule__Icon__Group_1_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Icon__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5454:101: ( ( ( rule__Icon__Group_1_3__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5455:6: ( ( rule__Icon__Group_1_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5461:6: ( ( rule__Icon__Group_1_3__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5463:7: ( rule__Icon__Group_1_3__0 )
                    {
                     before(grammarAccess.getIconAccess().getGroup_1_3()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5464:7: ( rule__Icon__Group_1_3__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5464:8: rule__Icon__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Icon__Group_1_3__0_in_rule__Icon__UnorderedGroup_1__Impl11940);
                    rule__Icon__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIconAccess().getGroup_1_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5470:4: ({...}? => ( ( ( rule__Icon__Group_1_4__0 ) ) ) )
                    {
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5470:4: ({...}? => ( ( ( rule__Icon__Group_1_4__0 ) ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5471:5: {...}? => ( ( ( rule__Icon__Group_1_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Icon__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4)");
                    }
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5471:101: ( ( ( rule__Icon__Group_1_4__0 ) ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5472:6: ( ( rule__Icon__Group_1_4__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5478:6: ( ( rule__Icon__Group_1_4__0 ) )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5480:7: ( rule__Icon__Group_1_4__0 )
                    {
                     before(grammarAccess.getIconAccess().getGroup_1_4()); 
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5481:7: ( rule__Icon__Group_1_4__0 )
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5481:8: rule__Icon__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__Icon__Group_1_4__0_in_rule__Icon__UnorderedGroup_1__Impl12031);
                    rule__Icon__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIconAccess().getGroup_1_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIconAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__Icon__UnorderedGroup_1__0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5496:1: rule__Icon__UnorderedGroup_1__0 : rule__Icon__UnorderedGroup_1__Impl ( rule__Icon__UnorderedGroup_1__1 )? ;
    public final void rule__Icon__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5500:1: ( rule__Icon__UnorderedGroup_1__Impl ( rule__Icon__UnorderedGroup_1__1 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5501:2: rule__Icon__UnorderedGroup_1__Impl ( rule__Icon__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__Icon__UnorderedGroup_1__Impl_in_rule__Icon__UnorderedGroup_1__012090);
            rule__Icon__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5502:2: ( rule__Icon__UnorderedGroup_1__1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2) ) {
                alt30=1;
            }
            else if ( LA30_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3) ) {
                alt30=1;
            }
            else if ( LA30_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5502:2: rule__Icon__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__Icon__UnorderedGroup_1__1_in_rule__Icon__UnorderedGroup_1__012093);
                    rule__Icon__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__UnorderedGroup_1__0"


    // $ANTLR start "rule__Icon__UnorderedGroup_1__1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5509:1: rule__Icon__UnorderedGroup_1__1 : rule__Icon__UnorderedGroup_1__Impl ( rule__Icon__UnorderedGroup_1__2 )? ;
    public final void rule__Icon__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5513:1: ( rule__Icon__UnorderedGroup_1__Impl ( rule__Icon__UnorderedGroup_1__2 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5514:2: rule__Icon__UnorderedGroup_1__Impl ( rule__Icon__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_rule__Icon__UnorderedGroup_1__Impl_in_rule__Icon__UnorderedGroup_1__112118);
            rule__Icon__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5515:2: ( rule__Icon__UnorderedGroup_1__2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2) ) {
                alt31=1;
            }
            else if ( LA31_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3) ) {
                alt31=1;
            }
            else if ( LA31_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5515:2: rule__Icon__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_rule__Icon__UnorderedGroup_1__2_in_rule__Icon__UnorderedGroup_1__112121);
                    rule__Icon__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__UnorderedGroup_1__1"


    // $ANTLR start "rule__Icon__UnorderedGroup_1__2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5522:1: rule__Icon__UnorderedGroup_1__2 : rule__Icon__UnorderedGroup_1__Impl ( rule__Icon__UnorderedGroup_1__3 )? ;
    public final void rule__Icon__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5526:1: ( rule__Icon__UnorderedGroup_1__Impl ( rule__Icon__UnorderedGroup_1__3 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5527:2: rule__Icon__UnorderedGroup_1__Impl ( rule__Icon__UnorderedGroup_1__3 )?
            {
            pushFollow(FOLLOW_rule__Icon__UnorderedGroup_1__Impl_in_rule__Icon__UnorderedGroup_1__212146);
            rule__Icon__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5528:2: ( rule__Icon__UnorderedGroup_1__3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1) ) {
                alt32=1;
            }
            else if ( LA32_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2) ) {
                alt32=1;
            }
            else if ( LA32_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3) ) {
                alt32=1;
            }
            else if ( LA32_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5528:2: rule__Icon__UnorderedGroup_1__3
                    {
                    pushFollow(FOLLOW_rule__Icon__UnorderedGroup_1__3_in_rule__Icon__UnorderedGroup_1__212149);
                    rule__Icon__UnorderedGroup_1__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__UnorderedGroup_1__2"


    // $ANTLR start "rule__Icon__UnorderedGroup_1__3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5535:1: rule__Icon__UnorderedGroup_1__3 : rule__Icon__UnorderedGroup_1__Impl ( rule__Icon__UnorderedGroup_1__4 )? ;
    public final void rule__Icon__UnorderedGroup_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5539:1: ( rule__Icon__UnorderedGroup_1__Impl ( rule__Icon__UnorderedGroup_1__4 )? )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5540:2: rule__Icon__UnorderedGroup_1__Impl ( rule__Icon__UnorderedGroup_1__4 )?
            {
            pushFollow(FOLLOW_rule__Icon__UnorderedGroup_1__Impl_in_rule__Icon__UnorderedGroup_1__312174);
            rule__Icon__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5541:2: ( rule__Icon__UnorderedGroup_1__4 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 1) ) {
                alt33=1;
            }
            else if ( LA33_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 2) ) {
                alt33=1;
            }
            else if ( LA33_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 3) ) {
                alt33=1;
            }
            else if ( LA33_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getIconAccess().getUnorderedGroup_1(), 4) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5541:2: rule__Icon__UnorderedGroup_1__4
                    {
                    pushFollow(FOLLOW_rule__Icon__UnorderedGroup_1__4_in_rule__Icon__UnorderedGroup_1__312177);
                    rule__Icon__UnorderedGroup_1__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__UnorderedGroup_1__3"


    // $ANTLR start "rule__Icon__UnorderedGroup_1__4"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5548:1: rule__Icon__UnorderedGroup_1__4 : rule__Icon__UnorderedGroup_1__Impl ;
    public final void rule__Icon__UnorderedGroup_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5552:1: ( rule__Icon__UnorderedGroup_1__Impl )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5553:2: rule__Icon__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__Icon__UnorderedGroup_1__Impl_in_rule__Icon__UnorderedGroup_1__412202);
            rule__Icon__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__UnorderedGroup_1__4"


    // $ANTLR start "rule__Menu__NameAssignment_0_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5570:1: rule__Menu__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Menu__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5574:1: ( ( RULE_ID ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5575:1: ( RULE_ID )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5575:1: ( RULE_ID )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5576:1: RULE_ID
            {
             before(grammarAccess.getMenuAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Menu__NameAssignment_0_212240); 
             after(grammarAccess.getMenuAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__NameAssignment_0_2"


    // $ANTLR start "rule__Menu__TypeAssignment_1_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5585:1: rule__Menu__TypeAssignment_1_2 : ( ruleType ) ;
    public final void rule__Menu__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5589:1: ( ( ruleType ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5590:1: ( ruleType )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5590:1: ( ruleType )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5591:1: ruleType
            {
             before(grammarAccess.getMenuAccess().getTypeTypeEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Menu__TypeAssignment_1_212271);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getTypeTypeEnumRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__TypeAssignment_1_2"


    // $ANTLR start "rule__Menu__StyleAssignment_2_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5600:1: rule__Menu__StyleAssignment_2_2 : ( ruleStyle ) ;
    public final void rule__Menu__StyleAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5604:1: ( ( ruleStyle ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5605:1: ( ruleStyle )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5605:1: ( ruleStyle )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5606:1: ruleStyle
            {
             before(grammarAccess.getMenuAccess().getStyleStyleEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleStyle_in_rule__Menu__StyleAssignment_2_212302);
            ruleStyle();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getStyleStyleEnumRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__StyleAssignment_2_2"


    // $ANTLR start "rule__Menu__PositionAssignment_3_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5615:1: rule__Menu__PositionAssignment_3_2 : ( rulePosition ) ;
    public final void rule__Menu__PositionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5619:1: ( ( rulePosition ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5620:1: ( rulePosition )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5620:1: ( rulePosition )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5621:1: rulePosition
            {
             before(grammarAccess.getMenuAccess().getPositionPositionEnumRuleCall_3_2_0()); 
            pushFollow(FOLLOW_rulePosition_in_rule__Menu__PositionAssignment_3_212333);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getPositionPositionEnumRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__PositionAssignment_3_2"


    // $ANTLR start "rule__Menu__DecoratorAssignment_4_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5630:1: rule__Menu__DecoratorAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Menu__DecoratorAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5634:1: ( ( RULE_STRING ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5635:1: ( RULE_STRING )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5635:1: ( RULE_STRING )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5636:1: RULE_STRING
            {
             before(grammarAccess.getMenuAccess().getDecoratorSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Menu__DecoratorAssignment_4_212364); 
             after(grammarAccess.getMenuAccess().getDecoratorSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__DecoratorAssignment_4_2"


    // $ANTLR start "rule__Menu__ConfigurationAssignment_5_3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5645:1: rule__Menu__ConfigurationAssignment_5_3 : ( ruleConfigurations ) ;
    public final void rule__Menu__ConfigurationAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5649:1: ( ( ruleConfigurations ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5650:1: ( ruleConfigurations )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5650:1: ( ruleConfigurations )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5651:1: ruleConfigurations
            {
             before(grammarAccess.getMenuAccess().getConfigurationConfigurationsParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_ruleConfigurations_in_rule__Menu__ConfigurationAssignment_5_312395);
            ruleConfigurations();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getConfigurationConfigurationsParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__ConfigurationAssignment_5_3"


    // $ANTLR start "rule__Menu__ItemsAssignment_6_3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5660:1: rule__Menu__ItemsAssignment_6_3 : ( ruleItem ) ;
    public final void rule__Menu__ItemsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5664:1: ( ( ruleItem ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5665:1: ( ruleItem )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5665:1: ( ruleItem )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5666:1: ruleItem
            {
             before(grammarAccess.getMenuAccess().getItemsItemParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__Menu__ItemsAssignment_6_312426);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getItemsItemParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__ItemsAssignment_6_3"


    // $ANTLR start "rule__Menu__ItemsAssignment_6_4_1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5675:1: rule__Menu__ItemsAssignment_6_4_1 : ( ruleItem ) ;
    public final void rule__Menu__ItemsAssignment_6_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5679:1: ( ( ruleItem ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5680:1: ( ruleItem )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5680:1: ( ruleItem )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5681:1: ruleItem
            {
             before(grammarAccess.getMenuAccess().getItemsItemParserRuleCall_6_4_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__Menu__ItemsAssignment_6_4_112457);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getItemsItemParserRuleCall_6_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__ItemsAssignment_6_4_1"


    // $ANTLR start "rule__Configurations__Config_topAssignment_0_0_1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5690:1: rule__Configurations__Config_topAssignment_0_0_1 : ( ruleConfig ) ;
    public final void rule__Configurations__Config_topAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5694:1: ( ( ruleConfig ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5695:1: ( ruleConfig )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5695:1: ( ruleConfig )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5696:1: ruleConfig
            {
             before(grammarAccess.getConfigurationsAccess().getConfig_topConfigParserRuleCall_0_0_1_0()); 
            pushFollow(FOLLOW_ruleConfig_in_rule__Configurations__Config_topAssignment_0_0_112488);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigurationsAccess().getConfig_topConfigParserRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Config_topAssignment_0_0_1"


    // $ANTLR start "rule__Configurations__Config_childrenAssignment_0_1_1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5705:1: rule__Configurations__Config_childrenAssignment_0_1_1 : ( ruleConfig ) ;
    public final void rule__Configurations__Config_childrenAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5709:1: ( ( ruleConfig ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5710:1: ( ruleConfig )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5710:1: ( ruleConfig )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5711:1: ruleConfig
            {
             before(grammarAccess.getConfigurationsAccess().getConfig_childrenConfigParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleConfig_in_rule__Configurations__Config_childrenAssignment_0_1_112519);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigurationsAccess().getConfig_childrenConfigParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Config_childrenAssignment_0_1_1"


    // $ANTLR start "rule__Configurations__Config_topAssignment_1_0_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5720:1: rule__Configurations__Config_topAssignment_1_0_2 : ( ruleConfig ) ;
    public final void rule__Configurations__Config_topAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5724:1: ( ( ruleConfig ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5725:1: ( ruleConfig )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5725:1: ( ruleConfig )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5726:1: ruleConfig
            {
             before(grammarAccess.getConfigurationsAccess().getConfig_topConfigParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_ruleConfig_in_rule__Configurations__Config_topAssignment_1_0_212550);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigurationsAccess().getConfig_topConfigParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Config_topAssignment_1_0_2"


    // $ANTLR start "rule__Configurations__Config_childrenAssignment_1_1_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5735:1: rule__Configurations__Config_childrenAssignment_1_1_2 : ( ruleConfig ) ;
    public final void rule__Configurations__Config_childrenAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5739:1: ( ( ruleConfig ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5740:1: ( ruleConfig )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5740:1: ( ruleConfig )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5741:1: ruleConfig
            {
             before(grammarAccess.getConfigurationsAccess().getConfig_childrenConfigParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_ruleConfig_in_rule__Configurations__Config_childrenAssignment_1_1_212581);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigurationsAccess().getConfig_childrenConfigParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurations__Config_childrenAssignment_1_1_2"


    // $ANTLR start "rule__Config__FeatureAssignment_1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5750:1: rule__Config__FeatureAssignment_1 : ( RULE_FEATURE ) ;
    public final void rule__Config__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5754:1: ( ( RULE_FEATURE ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5755:1: ( RULE_FEATURE )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5755:1: ( RULE_FEATURE )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5756:1: RULE_FEATURE
            {
             before(grammarAccess.getConfigAccess().getFeatureFEATURETerminalRuleCall_1_0()); 
            match(input,RULE_FEATURE,FOLLOW_RULE_FEATURE_in_rule__Config__FeatureAssignment_112612); 
             after(grammarAccess.getConfigAccess().getFeatureFEATURETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__FeatureAssignment_1"


    // $ANTLR start "rule__Config__ColorAssignment_3"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5765:1: rule__Config__ColorAssignment_3 : ( RULE_COLOR ) ;
    public final void rule__Config__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5769:1: ( ( RULE_COLOR ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5770:1: ( RULE_COLOR )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5770:1: ( RULE_COLOR )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5771:1: RULE_COLOR
            {
             before(grammarAccess.getConfigAccess().getColorCOLORTerminalRuleCall_3_0()); 
            match(input,RULE_COLOR,FOLLOW_RULE_COLOR_in_rule__Config__ColorAssignment_312643); 
             after(grammarAccess.getConfigAccess().getColorCOLORTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__ColorAssignment_3"


    // $ANTLR start "rule__Item__NameAssignment_1_0_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5780:1: rule__Item__NameAssignment_1_0_2 : ( RULE_ID ) ;
    public final void rule__Item__NameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5784:1: ( ( RULE_ID ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5785:1: ( RULE_ID )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5785:1: ( RULE_ID )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5786:1: RULE_ID
            {
             before(grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Item__NameAssignment_1_0_212674); 
             after(grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__NameAssignment_1_0_2"


    // $ANTLR start "rule__Item__DecoratorAssignment_1_1_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5795:1: rule__Item__DecoratorAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Item__DecoratorAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5799:1: ( ( RULE_STRING ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5800:1: ( RULE_STRING )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5800:1: ( RULE_STRING )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5801:1: RULE_STRING
            {
             before(grammarAccess.getItemAccess().getDecoratorSTRINGTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Item__DecoratorAssignment_1_1_212705); 
             after(grammarAccess.getItemAccess().getDecoratorSTRINGTerminalRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__DecoratorAssignment_1_1_2"


    // $ANTLR start "rule__Item__ActionAssignment_1_2_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5810:1: rule__Item__ActionAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Item__ActionAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5814:1: ( ( RULE_STRING ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5815:1: ( RULE_STRING )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5815:1: ( RULE_STRING )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5816:1: RULE_STRING
            {
             before(grammarAccess.getItemAccess().getActionSTRINGTerminalRuleCall_1_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Item__ActionAssignment_1_2_212736); 
             after(grammarAccess.getItemAccess().getActionSTRINGTerminalRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__ActionAssignment_1_2_2"


    // $ANTLR start "rule__Item__LabelAssignment_1_3_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5825:1: rule__Item__LabelAssignment_1_3_2 : ( RULE_STRING ) ;
    public final void rule__Item__LabelAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5829:1: ( ( RULE_STRING ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5830:1: ( RULE_STRING )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5830:1: ( RULE_STRING )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5831:1: RULE_STRING
            {
             before(grammarAccess.getItemAccess().getLabelSTRINGTerminalRuleCall_1_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Item__LabelAssignment_1_3_212767); 
             after(grammarAccess.getItemAccess().getLabelSTRINGTerminalRuleCall_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__LabelAssignment_1_3_2"


    // $ANTLR start "rule__Item__TitleAssignment_1_4_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5840:1: rule__Item__TitleAssignment_1_4_2 : ( RULE_STRING ) ;
    public final void rule__Item__TitleAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5844:1: ( ( RULE_STRING ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5845:1: ( RULE_STRING )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5845:1: ( RULE_STRING )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5846:1: RULE_STRING
            {
             before(grammarAccess.getItemAccess().getTitleSTRINGTerminalRuleCall_1_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Item__TitleAssignment_1_4_212798); 
             after(grammarAccess.getItemAccess().getTitleSTRINGTerminalRuleCall_1_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__TitleAssignment_1_4_2"


    // $ANTLR start "rule__Item__DirectionAssignment_1_5_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5855:1: rule__Item__DirectionAssignment_1_5_2 : ( ruleDirection ) ;
    public final void rule__Item__DirectionAssignment_1_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5859:1: ( ( ruleDirection ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5860:1: ( ruleDirection )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5860:1: ( ruleDirection )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5861:1: ruleDirection
            {
             before(grammarAccess.getItemAccess().getDirectionDirectionEnumRuleCall_1_5_2_0()); 
            pushFollow(FOLLOW_ruleDirection_in_rule__Item__DirectionAssignment_1_5_212829);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getItemAccess().getDirectionDirectionEnumRuleCall_1_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__DirectionAssignment_1_5_2"


    // $ANTLR start "rule__Item__TargetAssignment_1_6_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5870:1: rule__Item__TargetAssignment_1_6_2 : ( ruleTarget ) ;
    public final void rule__Item__TargetAssignment_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5874:1: ( ( ruleTarget ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5875:1: ( ruleTarget )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5875:1: ( ruleTarget )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5876:1: ruleTarget
            {
             before(grammarAccess.getItemAccess().getTargetTargetEnumRuleCall_1_6_2_0()); 
            pushFollow(FOLLOW_ruleTarget_in_rule__Item__TargetAssignment_1_6_212860);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getItemAccess().getTargetTargetEnumRuleCall_1_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__TargetAssignment_1_6_2"


    // $ANTLR start "rule__Item__IconAssignment_1_7_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5885:1: rule__Item__IconAssignment_1_7_2 : ( ruleIcon ) ;
    public final void rule__Item__IconAssignment_1_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5889:1: ( ( ruleIcon ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5890:1: ( ruleIcon )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5890:1: ( ruleIcon )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5891:1: ruleIcon
            {
             before(grammarAccess.getItemAccess().getIconIconParserRuleCall_1_7_2_0()); 
            pushFollow(FOLLOW_ruleIcon_in_rule__Item__IconAssignment_1_7_212891);
            ruleIcon();

            state._fsp--;

             after(grammarAccess.getItemAccess().getIconIconParserRuleCall_1_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__IconAssignment_1_7_2"


    // $ANTLR start "rule__Item__SubmenuAssignment_1_8_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5900:1: rule__Item__SubmenuAssignment_1_8_2 : ( ruleSubMenu ) ;
    public final void rule__Item__SubmenuAssignment_1_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5904:1: ( ( ruleSubMenu ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5905:1: ( ruleSubMenu )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5905:1: ( ruleSubMenu )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5906:1: ruleSubMenu
            {
             before(grammarAccess.getItemAccess().getSubmenuSubMenuParserRuleCall_1_8_2_0()); 
            pushFollow(FOLLOW_ruleSubMenu_in_rule__Item__SubmenuAssignment_1_8_212922);
            ruleSubMenu();

            state._fsp--;

             after(grammarAccess.getItemAccess().getSubmenuSubMenuParserRuleCall_1_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__SubmenuAssignment_1_8_2"


    // $ANTLR start "rule__SubMenu__DecoratorAssignment_1_0_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5915:1: rule__SubMenu__DecoratorAssignment_1_0_2 : ( RULE_STRING ) ;
    public final void rule__SubMenu__DecoratorAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5919:1: ( ( RULE_STRING ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5920:1: ( RULE_STRING )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5920:1: ( RULE_STRING )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5921:1: RULE_STRING
            {
             before(grammarAccess.getSubMenuAccess().getDecoratorSTRINGTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SubMenu__DecoratorAssignment_1_0_212953); 
             after(grammarAccess.getSubMenuAccess().getDecoratorSTRINGTerminalRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__DecoratorAssignment_1_0_2"


    // $ANTLR start "rule__SubMenu__ItemsAssignment_1_1_3_0"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5930:1: rule__SubMenu__ItemsAssignment_1_1_3_0 : ( ruleItem ) ;
    public final void rule__SubMenu__ItemsAssignment_1_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5934:1: ( ( ruleItem ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5935:1: ( ruleItem )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5935:1: ( ruleItem )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5936:1: ruleItem
            {
             before(grammarAccess.getSubMenuAccess().getItemsItemParserRuleCall_1_1_3_0_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__SubMenu__ItemsAssignment_1_1_3_012984);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getSubMenuAccess().getItemsItemParserRuleCall_1_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__ItemsAssignment_1_1_3_0"


    // $ANTLR start "rule__SubMenu__ItemsAssignment_1_1_3_1_1"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5945:1: rule__SubMenu__ItemsAssignment_1_1_3_1_1 : ( ruleItem ) ;
    public final void rule__SubMenu__ItemsAssignment_1_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5949:1: ( ( ruleItem ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5950:1: ( ruleItem )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5950:1: ( ruleItem )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5951:1: ruleItem
            {
             before(grammarAccess.getSubMenuAccess().getItemsItemParserRuleCall_1_1_3_1_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__SubMenu__ItemsAssignment_1_1_3_1_113015);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getSubMenuAccess().getItemsItemParserRuleCall_1_1_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubMenu__ItemsAssignment_1_1_3_1_1"


    // $ANTLR start "rule__Icon__NameAssignment_1_0_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5960:1: rule__Icon__NameAssignment_1_0_2 : ( RULE_ID ) ;
    public final void rule__Icon__NameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5964:1: ( ( RULE_ID ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5965:1: ( RULE_ID )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5965:1: ( RULE_ID )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5966:1: RULE_ID
            {
             before(grammarAccess.getIconAccess().getNameIDTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Icon__NameAssignment_1_0_213046); 
             after(grammarAccess.getIconAccess().getNameIDTerminalRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__NameAssignment_1_0_2"


    // $ANTLR start "rule__Icon__PositionAssignment_1_1_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5975:1: rule__Icon__PositionAssignment_1_1_2 : ( rulePosition ) ;
    public final void rule__Icon__PositionAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5979:1: ( ( rulePosition ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5980:1: ( rulePosition )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5980:1: ( rulePosition )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5981:1: rulePosition
            {
             before(grammarAccess.getIconAccess().getPositionPositionEnumRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_rulePosition_in_rule__Icon__PositionAssignment_1_1_213077);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getIconAccess().getPositionPositionEnumRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__PositionAssignment_1_1_2"


    // $ANTLR start "rule__Icon__DecoratorAssignment_1_2_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5990:1: rule__Icon__DecoratorAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Icon__DecoratorAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5994:1: ( ( RULE_STRING ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5995:1: ( RULE_STRING )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5995:1: ( RULE_STRING )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:5996:1: RULE_STRING
            {
             before(grammarAccess.getIconAccess().getDecoratorSTRINGTerminalRuleCall_1_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Icon__DecoratorAssignment_1_2_213108); 
             after(grammarAccess.getIconAccess().getDecoratorSTRINGTerminalRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__DecoratorAssignment_1_2_2"


    // $ANTLR start "rule__Icon__Text_altAssignment_1_3_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:6005:1: rule__Icon__Text_altAssignment_1_3_2 : ( RULE_STRING ) ;
    public final void rule__Icon__Text_altAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:6009:1: ( ( RULE_STRING ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:6010:1: ( RULE_STRING )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:6010:1: ( RULE_STRING )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:6011:1: RULE_STRING
            {
             before(grammarAccess.getIconAccess().getText_altSTRINGTerminalRuleCall_1_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Icon__Text_altAssignment_1_3_213139); 
             after(grammarAccess.getIconAccess().getText_altSTRINGTerminalRuleCall_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Text_altAssignment_1_3_2"


    // $ANTLR start "rule__Icon__AddressAssignment_1_4_2"
    // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:6020:1: rule__Icon__AddressAssignment_1_4_2 : ( RULE_STRING ) ;
    public final void rule__Icon__AddressAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:6024:1: ( ( RULE_STRING ) )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:6025:1: ( RULE_STRING )
            {
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:6025:1: ( RULE_STRING )
            // ../br.usp.icmc.amenu.ui/src-gen/br/usp/icmc/amenu/ui/contentassist/antlr/internal/InternalAMenu.g:6026:1: RULE_STRING
            {
             before(grammarAccess.getIconAccess().getAddressSTRINGTerminalRuleCall_1_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Icon__AddressAssignment_1_4_213170); 
             after(grammarAccess.getIconAccess().getAddressSTRINGTerminalRuleCall_1_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__AddressAssignment_1_4_2"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA18_eotS =
        "\12\uffff";
    static final String DFA18_eofS =
        "\12\uffff";
    static final String DFA18_minS =
        "\1\35\11\uffff";
    static final String DFA18_maxS =
        "\1\64\11\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA18_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\5\uffff\1\2\12\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "4982:3: ( ({...}? => ( ( ( rule__Item__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Item__Group_1_8__0 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA18_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA18_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA18_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA18_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA18_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA18_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA18_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA18_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA18_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\13\uffff";
    static final String DFA19_eofS =
        "\13\uffff";
    static final String DFA19_minS =
        "\1\35\12\uffff";
    static final String DFA19_maxS =
        "\1\64\12\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA19_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\5\uffff\1\2\11\uffff\1\12\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "5152:2: ( rule__Item__UnorderedGroup_1__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA19_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA19_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA19_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA19_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA19_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA19_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA19_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA19_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( (LA19_0==45) ) {s = 10;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\13\uffff";
    static final String DFA20_eofS =
        "\13\uffff";
    static final String DFA20_minS =
        "\1\35\12\uffff";
    static final String DFA20_maxS =
        "\1\64\12\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA20_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\5\uffff\1\2\11\uffff\1\12\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "5165:2: ( rule__Item__UnorderedGroup_1__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                         
                        int index20_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA20_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA20_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA20_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA20_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA20_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA20_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA20_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA20_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA20_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( (LA20_0==45) ) {s = 10;}

                         
                        input.seek(index20_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\13\uffff";
    static final String DFA21_eofS =
        "\13\uffff";
    static final String DFA21_minS =
        "\1\35\12\uffff";
    static final String DFA21_maxS =
        "\1\64\12\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA21_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\5\uffff\1\2\11\uffff\1\12\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "5178:2: ( rule__Item__UnorderedGroup_1__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA21_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA21_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA21_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA21_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA21_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA21_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA21_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA21_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA21_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( (LA21_0==45) ) {s = 10;}

                         
                        input.seek(index21_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\13\uffff";
    static final String DFA22_eofS =
        "\13\uffff";
    static final String DFA22_minS =
        "\1\35\12\uffff";
    static final String DFA22_maxS =
        "\1\64\12\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA22_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\5\uffff\1\2\11\uffff\1\12\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "5191:2: ( rule__Item__UnorderedGroup_1__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA22_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA22_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA22_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA22_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA22_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA22_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA22_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA22_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA22_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( (LA22_0==45) ) {s = 10;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\13\uffff";
    static final String DFA23_eofS =
        "\13\uffff";
    static final String DFA23_minS =
        "\1\35\12\uffff";
    static final String DFA23_maxS =
        "\1\64\12\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA23_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\5\uffff\1\2\11\uffff\1\12\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "5204:2: ( rule__Item__UnorderedGroup_1__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA23_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA23_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA23_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA23_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA23_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA23_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA23_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA23_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA23_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( (LA23_0==45) ) {s = 10;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA24_eotS =
        "\13\uffff";
    static final String DFA24_eofS =
        "\13\uffff";
    static final String DFA24_minS =
        "\1\35\12\uffff";
    static final String DFA24_maxS =
        "\1\64\12\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA24_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\5\uffff\1\2\11\uffff\1\12\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
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

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "5217:2: ( rule__Item__UnorderedGroup_1__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA24_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA24_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA24_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA24_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA24_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA24_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA24_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA24_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA24_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( (LA24_0==45) ) {s = 10;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\13\uffff";
    static final String DFA25_eofS =
        "\13\uffff";
    static final String DFA25_minS =
        "\1\35\12\uffff";
    static final String DFA25_maxS =
        "\1\64\12\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA25_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\5\uffff\1\2\11\uffff\1\12\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
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

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "5230:2: ( rule__Item__UnorderedGroup_1__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA25_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA25_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA25_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA25_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA25_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA25_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA25_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA25_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA25_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( (LA25_0==45) ) {s = 10;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\13\uffff";
    static final String DFA26_eofS =
        "\13\uffff";
    static final String DFA26_minS =
        "\1\35\12\uffff";
    static final String DFA26_maxS =
        "\1\64\12\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA26_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\5\uffff\1\2\11\uffff\1\12\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "5243:2: ( rule__Item__UnorderedGroup_1__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA26_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA26_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA26_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA26_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA26_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA26_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA26_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA26_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA26_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( (LA26_0==45) ) {s = 10;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleMenu_in_entryRuleMenu61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMenu68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup_in_ruleMenu94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurations_in_entryRuleConfigurations121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurations128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group__0_in_ruleConfigurations154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfig188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__0_in_ruleConfig214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0_in_ruleItem274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMenu_in_entryRuleSubMenu301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubMenu308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group__0_in_ruleSubMenu334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIcon_in_entryRuleIcon361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIcon368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group__0_in_ruleIcon394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Alternatives_in_ruleStyle467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__Alternatives_in_rulePosition503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Alternatives_in_ruleDirection539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Target__Alternatives_in_ruleTarget575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_0_0__0_in_rule__Configurations__Alternatives_0610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_0_1__0_in_rule__Configurations__Alternatives_0628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_1_0__0_in_rule__Configurations__Alternatives_1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_1_1__0_in_rule__Configurations__Alternatives_1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Alternatives755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Style__Alternatives791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Style__Alternatives812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Position__Alternatives848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Position__Alternatives869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Position__Alternatives890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Direction__Alternatives926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Direction__Alternatives947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Direction__Alternatives968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Target__Alternatives1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Target__Alternatives1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Target__Alternatives1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Target__Alternatives1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_0__0__Impl_in_rule__Menu__Group_0__01100 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_0__1_in_rule__Menu__Group_0__01103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Menu__Group_0__0__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_0__1__Impl_in_rule__Menu__Group_0__11162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Menu__Group_0__2_in_rule__Menu__Group_0__11165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Menu__Group_0__1__Impl1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_0__2__Impl_in_rule__Menu__Group_0__21224 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_0__3_in_rule__Menu__Group_0__21227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__NameAssignment_0_2_in_rule__Menu__Group_0__2__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_0__3__Impl_in_rule__Menu__Group_0__31284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Menu__Group_0__3__Impl1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_1__0__Impl_in_rule__Menu__Group_1__01351 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_1__1_in_rule__Menu__Group_1__01354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Menu__Group_1__0__Impl1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_1__1__Impl_in_rule__Menu__Group_1__11413 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__Menu__Group_1__2_in_rule__Menu__Group_1__11416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Menu__Group_1__1__Impl1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_1__2__Impl_in_rule__Menu__Group_1__21475 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_1__3_in_rule__Menu__Group_1__21478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__TypeAssignment_1_2_in_rule__Menu__Group_1__2__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_1__3__Impl_in_rule__Menu__Group_1__31535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Menu__Group_1__3__Impl1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_2__0__Impl_in_rule__Menu__Group_2__01602 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_2__1_in_rule__Menu__Group_2__01605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Menu__Group_2__0__Impl1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_2__1__Impl_in_rule__Menu__Group_2__11664 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Menu__Group_2__2_in_rule__Menu__Group_2__11667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Menu__Group_2__1__Impl1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_2__2__Impl_in_rule__Menu__Group_2__21726 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_2__3_in_rule__Menu__Group_2__21729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__StyleAssignment_2_2_in_rule__Menu__Group_2__2__Impl1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_2__3__Impl_in_rule__Menu__Group_2__31786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Menu__Group_2__3__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_3__0__Impl_in_rule__Menu__Group_3__01853 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_3__1_in_rule__Menu__Group_3__01856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Menu__Group_3__0__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_3__1__Impl_in_rule__Menu__Group_3__11915 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_rule__Menu__Group_3__2_in_rule__Menu__Group_3__11918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Menu__Group_3__1__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_3__2__Impl_in_rule__Menu__Group_3__21977 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_3__3_in_rule__Menu__Group_3__21980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__PositionAssignment_3_2_in_rule__Menu__Group_3__2__Impl2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_3__3__Impl_in_rule__Menu__Group_3__32037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Menu__Group_3__3__Impl2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_4__0__Impl_in_rule__Menu__Group_4__02104 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_4__1_in_rule__Menu__Group_4__02107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Menu__Group_4__0__Impl2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_4__1__Impl_in_rule__Menu__Group_4__12166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Menu__Group_4__2_in_rule__Menu__Group_4__12169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Menu__Group_4__1__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_4__2__Impl_in_rule__Menu__Group_4__22228 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_4__3_in_rule__Menu__Group_4__22231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__DecoratorAssignment_4_2_in_rule__Menu__Group_4__2__Impl2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_4__3__Impl_in_rule__Menu__Group_4__32288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Menu__Group_4__3__Impl2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_5__0__Impl_in_rule__Menu__Group_5__02355 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_5__1_in_rule__Menu__Group_5__02358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Menu__Group_5__0__Impl2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_5__1__Impl_in_rule__Menu__Group_5__12417 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_5__2_in_rule__Menu__Group_5__12420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Menu__Group_5__1__Impl2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_5__2__Impl_in_rule__Menu__Group_5__22479 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_5__3_in_rule__Menu__Group_5__22482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Menu__Group_5__2__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_5__3__Impl_in_rule__Menu__Group_5__32541 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_5__4_in_rule__Menu__Group_5__32544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__ConfigurationAssignment_5_3_in_rule__Menu__Group_5__3__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_5__4__Impl_in_rule__Menu__Group_5__42601 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_5__5_in_rule__Menu__Group_5__42604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Menu__Group_5__4__Impl2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_5__5__Impl_in_rule__Menu__Group_5__52663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Menu__Group_5__5__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__0__Impl_in_rule__Menu__Group_6__02734 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__1_in_rule__Menu__Group_6__02737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Menu__Group_6__0__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__1__Impl_in_rule__Menu__Group_6__12796 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__2_in_rule__Menu__Group_6__12799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Menu__Group_6__1__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__2__Impl_in_rule__Menu__Group_6__22858 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__3_in_rule__Menu__Group_6__22861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Menu__Group_6__2__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__3__Impl_in_rule__Menu__Group_6__32920 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__4_in_rule__Menu__Group_6__32923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__ItemsAssignment_6_3_in_rule__Menu__Group_6__3__Impl2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__4__Impl_in_rule__Menu__Group_6__42980 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__5_in_rule__Menu__Group_6__42983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_6_4__0_in_rule__Menu__Group_6__4__Impl3010 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__5__Impl_in_rule__Menu__Group_6__53041 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__6_in_rule__Menu__Group_6__53044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Menu__Group_6__5__Impl3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__6__Impl_in_rule__Menu__Group_6__63103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Menu__Group_6__6__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_6_4__0__Impl_in_rule__Menu__Group_6_4__03176 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Menu__Group_6_4__1_in_rule__Menu__Group_6_4__03179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Menu__Group_6_4__0__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_6_4__1__Impl_in_rule__Menu__Group_6_4__13238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__ItemsAssignment_6_4_1_in_rule__Menu__Group_6_4__1__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group__0__Impl_in_rule__Configurations__Group__03299 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Configurations__Group__1_in_rule__Configurations__Group__03302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Alternatives_0_in_rule__Configurations__Group__0__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group__1__Impl_in_rule__Configurations__Group__13359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Alternatives_1_in_rule__Configurations__Group__1__Impl3386 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_0_0__0__Impl_in_rule__Configurations__Group_0_0__03421 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Configurations__Group_0_0__1_in_rule__Configurations__Group_0_0__03424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Configurations__Group_0_0__0__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_0_0__1__Impl_in_rule__Configurations__Group_0_0__13483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Config_topAssignment_0_0_1_in_rule__Configurations__Group_0_0__1__Impl3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_0_1__0__Impl_in_rule__Configurations__Group_0_1__03544 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Configurations__Group_0_1__1_in_rule__Configurations__Group_0_1__03547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Configurations__Group_0_1__0__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_0_1__1__Impl_in_rule__Configurations__Group_0_1__13606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Config_childrenAssignment_0_1_1_in_rule__Configurations__Group_0_1__1__Impl3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_1_0__0__Impl_in_rule__Configurations__Group_1_0__03667 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Configurations__Group_1_0__1_in_rule__Configurations__Group_1_0__03670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Configurations__Group_1_0__0__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_1_0__1__Impl_in_rule__Configurations__Group_1_0__13729 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Configurations__Group_1_0__2_in_rule__Configurations__Group_1_0__13732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Configurations__Group_1_0__1__Impl3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_1_0__2__Impl_in_rule__Configurations__Group_1_0__23791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Config_topAssignment_1_0_2_in_rule__Configurations__Group_1_0__2__Impl3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_1_1__0__Impl_in_rule__Configurations__Group_1_1__03854 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Configurations__Group_1_1__1_in_rule__Configurations__Group_1_1__03857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Configurations__Group_1_1__0__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_1_1__1__Impl_in_rule__Configurations__Group_1_1__13916 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Configurations__Group_1_1__2_in_rule__Configurations__Group_1_1__13919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Configurations__Group_1_1__1__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Group_1_1__2__Impl_in_rule__Configurations__Group_1_1__23978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configurations__Config_childrenAssignment_1_1_2_in_rule__Configurations__Group_1_1__2__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__0__Impl_in_rule__Config__Group__04041 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Config__Group__1_in_rule__Config__Group__04044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Config__Group__0__Impl4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__1__Impl_in_rule__Config__Group__14103 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Config__Group__2_in_rule__Config__Group__14106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__FeatureAssignment_1_in_rule__Config__Group__1__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__2__Impl_in_rule__Config__Group__24163 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Config__Group__3_in_rule__Config__Group__24166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Config__Group__2__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__3__Impl_in_rule__Config__Group__34225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__ColorAssignment_3_in_rule__Config__Group__3__Impl4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__04290 = new BitSet(new long[]{0x001FC00820000000L});
    public static final BitSet FOLLOW_rule__Item__Group__1_in_rule__Item__Group__04293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Item__Group__0__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__14352 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Item__Group__2_in_rule__Item__Group__14355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1_in_rule__Item__Group__1__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__2__Impl_in_rule__Item__Group__24412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Item__Group__2__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_0__0__Impl_in_rule__Item__Group_1_0__04477 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_0__1_in_rule__Item__Group_1_0__04480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Item__Group_1_0__0__Impl4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_0__1__Impl_in_rule__Item__Group_1_0__14539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Item__Group_1_0__2_in_rule__Item__Group_1_0__14542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Item__Group_1_0__1__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_0__2__Impl_in_rule__Item__Group_1_0__24601 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_0__3_in_rule__Item__Group_1_0__24604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__NameAssignment_1_0_2_in_rule__Item__Group_1_0__2__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_0__3__Impl_in_rule__Item__Group_1_0__34661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Item__Group_1_0__3__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_1__0__Impl_in_rule__Item__Group_1_1__04728 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_1__1_in_rule__Item__Group_1_1__04731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Item__Group_1_1__0__Impl4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_1__1__Impl_in_rule__Item__Group_1_1__14790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Item__Group_1_1__2_in_rule__Item__Group_1_1__14793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Item__Group_1_1__1__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_1__2__Impl_in_rule__Item__Group_1_1__24852 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_1__3_in_rule__Item__Group_1_1__24855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__DecoratorAssignment_1_1_2_in_rule__Item__Group_1_1__2__Impl4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_1__3__Impl_in_rule__Item__Group_1_1__34912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Item__Group_1_1__3__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__0__Impl_in_rule__Item__Group_1_2__04979 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__1_in_rule__Item__Group_1_2__04982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Item__Group_1_2__0__Impl5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__1__Impl_in_rule__Item__Group_1_2__15041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__2_in_rule__Item__Group_1_2__15044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Item__Group_1_2__1__Impl5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__2__Impl_in_rule__Item__Group_1_2__25103 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__3_in_rule__Item__Group_1_2__25106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ActionAssignment_1_2_2_in_rule__Item__Group_1_2__2__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__3__Impl_in_rule__Item__Group_1_2__35163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Item__Group_1_2__3__Impl5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_3__0__Impl_in_rule__Item__Group_1_3__05230 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_3__1_in_rule__Item__Group_1_3__05233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Item__Group_1_3__0__Impl5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_3__1__Impl_in_rule__Item__Group_1_3__15292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Item__Group_1_3__2_in_rule__Item__Group_1_3__15295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Item__Group_1_3__1__Impl5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_3__2__Impl_in_rule__Item__Group_1_3__25354 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_3__3_in_rule__Item__Group_1_3__25357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__LabelAssignment_1_3_2_in_rule__Item__Group_1_3__2__Impl5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_3__3__Impl_in_rule__Item__Group_1_3__35414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Item__Group_1_3__3__Impl5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_4__0__Impl_in_rule__Item__Group_1_4__05481 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_4__1_in_rule__Item__Group_1_4__05484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Item__Group_1_4__0__Impl5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_4__1__Impl_in_rule__Item__Group_1_4__15543 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Item__Group_1_4__2_in_rule__Item__Group_1_4__15546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Item__Group_1_4__1__Impl5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_4__2__Impl_in_rule__Item__Group_1_4__25605 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_4__3_in_rule__Item__Group_1_4__25608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__TitleAssignment_1_4_2_in_rule__Item__Group_1_4__2__Impl5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_4__3__Impl_in_rule__Item__Group_1_4__35665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Item__Group_1_4__3__Impl5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_5__0__Impl_in_rule__Item__Group_1_5__05732 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_5__1_in_rule__Item__Group_1_5__05735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Item__Group_1_5__0__Impl5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_5__1__Impl_in_rule__Item__Group_1_5__15794 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_5__2_in_rule__Item__Group_1_5__15797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Item__Group_1_5__1__Impl5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_5__2__Impl_in_rule__Item__Group_1_5__25856 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_5__3_in_rule__Item__Group_1_5__25859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__DirectionAssignment_1_5_2_in_rule__Item__Group_1_5__2__Impl5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_5__3__Impl_in_rule__Item__Group_1_5__35916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Item__Group_1_5__3__Impl5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_6__0__Impl_in_rule__Item__Group_1_6__05983 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_6__1_in_rule__Item__Group_1_6__05986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Item__Group_1_6__0__Impl6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_6__1__Impl_in_rule__Item__Group_1_6__16045 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_6__2_in_rule__Item__Group_1_6__16048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Item__Group_1_6__1__Impl6076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_6__2__Impl_in_rule__Item__Group_1_6__26107 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_6__3_in_rule__Item__Group_1_6__26110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__TargetAssignment_1_6_2_in_rule__Item__Group_1_6__2__Impl6137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_6__3__Impl_in_rule__Item__Group_1_6__36167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Item__Group_1_6__3__Impl6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_7__0__Impl_in_rule__Item__Group_1_7__06234 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_7__1_in_rule__Item__Group_1_7__06237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Item__Group_1_7__0__Impl6265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_7__1__Impl_in_rule__Item__Group_1_7__16296 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_7__2_in_rule__Item__Group_1_7__16299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Item__Group_1_7__1__Impl6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_7__2__Impl_in_rule__Item__Group_1_7__26358 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_7__3_in_rule__Item__Group_1_7__26361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__IconAssignment_1_7_2_in_rule__Item__Group_1_7__2__Impl6388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_7__3__Impl_in_rule__Item__Group_1_7__36418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Item__Group_1_7__3__Impl6446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_8__0__Impl_in_rule__Item__Group_1_8__06485 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_8__1_in_rule__Item__Group_1_8__06488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Item__Group_1_8__0__Impl6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_8__1__Impl_in_rule__Item__Group_1_8__16547 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_8__2_in_rule__Item__Group_1_8__16550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Item__Group_1_8__1__Impl6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_8__2__Impl_in_rule__Item__Group_1_8__26609 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_8__3_in_rule__Item__Group_1_8__26612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__SubmenuAssignment_1_8_2_in_rule__Item__Group_1_8__2__Impl6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_8__3__Impl_in_rule__Item__Group_1_8__36669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Item__Group_1_8__3__Impl6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group__0__Impl_in_rule__SubMenu__Group__06736 = new BitSet(new long[]{0x0000008800000000L});
    public static final BitSet FOLLOW_rule__SubMenu__Group__1_in_rule__SubMenu__Group__06739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SubMenu__Group__0__Impl6767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group__1__Impl_in_rule__SubMenu__Group__16798 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__SubMenu__Group__2_in_rule__SubMenu__Group__16801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__UnorderedGroup_1_in_rule__SubMenu__Group__1__Impl6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group__2__Impl_in_rule__SubMenu__Group__26858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SubMenu__Group__2__Impl6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_0__0__Impl_in_rule__SubMenu__Group_1_0__06923 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_0__1_in_rule__SubMenu__Group_1_0__06926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SubMenu__Group_1_0__0__Impl6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_0__1__Impl_in_rule__SubMenu__Group_1_0__16985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_0__2_in_rule__SubMenu__Group_1_0__16988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SubMenu__Group_1_0__1__Impl7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_0__2__Impl_in_rule__SubMenu__Group_1_0__27047 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_0__3_in_rule__SubMenu__Group_1_0__27050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__DecoratorAssignment_1_0_2_in_rule__SubMenu__Group_1_0__2__Impl7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_0__3__Impl_in_rule__SubMenu__Group_1_0__37107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SubMenu__Group_1_0__3__Impl7135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1__0__Impl_in_rule__SubMenu__Group_1_1__07174 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1__1_in_rule__SubMenu__Group_1_1__07177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SubMenu__Group_1_1__0__Impl7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1__1__Impl_in_rule__SubMenu__Group_1_1__17236 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1__2_in_rule__SubMenu__Group_1_1__17239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SubMenu__Group_1_1__1__Impl7267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1__2__Impl_in_rule__SubMenu__Group_1_1__27298 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1__3_in_rule__SubMenu__Group_1_1__27301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SubMenu__Group_1_1__2__Impl7329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1__3__Impl_in_rule__SubMenu__Group_1_1__37360 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1__4_in_rule__SubMenu__Group_1_1__37363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1_3__0_in_rule__SubMenu__Group_1_1__3__Impl7390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1__4__Impl_in_rule__SubMenu__Group_1_1__47420 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1__5_in_rule__SubMenu__Group_1_1__47423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SubMenu__Group_1_1__4__Impl7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1__5__Impl_in_rule__SubMenu__Group_1_1__57482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SubMenu__Group_1_1__5__Impl7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1_3__0__Impl_in_rule__SubMenu__Group_1_1_3__07553 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1_3__1_in_rule__SubMenu__Group_1_1_3__07556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__ItemsAssignment_1_1_3_0_in_rule__SubMenu__Group_1_1_3__0__Impl7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1_3__1__Impl_in_rule__SubMenu__Group_1_1_3__17613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1_3_1__0_in_rule__SubMenu__Group_1_1_3__1__Impl7640 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1_3_1__0__Impl_in_rule__SubMenu__Group_1_1_3_1__07675 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1_3_1__1_in_rule__SubMenu__Group_1_1_3_1__07678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SubMenu__Group_1_1_3_1__0__Impl7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1_3_1__1__Impl_in_rule__SubMenu__Group_1_1_3_1__17737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__ItemsAssignment_1_1_3_1_1_in_rule__SubMenu__Group_1_1_3_1__1__Impl7764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group__0__Impl_in_rule__Icon__Group__07798 = new BitSet(new long[]{0x0060000C20000000L});
    public static final BitSet FOLLOW_rule__Icon__Group__1_in_rule__Icon__Group__07801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Icon__Group__0__Impl7829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group__1__Impl_in_rule__Icon__Group__17860 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Icon__Group__2_in_rule__Icon__Group__17863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__UnorderedGroup_1_in_rule__Icon__Group__1__Impl7890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group__2__Impl_in_rule__Icon__Group__27920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Icon__Group__2__Impl7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_0__0__Impl_in_rule__Icon__Group_1_0__07985 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_0__1_in_rule__Icon__Group_1_0__07988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Icon__Group_1_0__0__Impl8016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_0__1__Impl_in_rule__Icon__Group_1_0__18047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_0__2_in_rule__Icon__Group_1_0__18050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Icon__Group_1_0__1__Impl8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_0__2__Impl_in_rule__Icon__Group_1_0__28109 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_0__3_in_rule__Icon__Group_1_0__28112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__NameAssignment_1_0_2_in_rule__Icon__Group_1_0__2__Impl8139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_0__3__Impl_in_rule__Icon__Group_1_0__38169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Icon__Group_1_0__3__Impl8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_1__0__Impl_in_rule__Icon__Group_1_1__08236 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_1__1_in_rule__Icon__Group_1_1__08239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Icon__Group_1_1__0__Impl8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_1__1__Impl_in_rule__Icon__Group_1_1__18298 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_1__2_in_rule__Icon__Group_1_1__18301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Icon__Group_1_1__1__Impl8329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_1__2__Impl_in_rule__Icon__Group_1_1__28360 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_1__3_in_rule__Icon__Group_1_1__28363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__PositionAssignment_1_1_2_in_rule__Icon__Group_1_1__2__Impl8390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_1__3__Impl_in_rule__Icon__Group_1_1__38420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Icon__Group_1_1__3__Impl8448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_2__0__Impl_in_rule__Icon__Group_1_2__08487 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_2__1_in_rule__Icon__Group_1_2__08490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Icon__Group_1_2__0__Impl8518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_2__1__Impl_in_rule__Icon__Group_1_2__18549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_2__2_in_rule__Icon__Group_1_2__18552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Icon__Group_1_2__1__Impl8580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_2__2__Impl_in_rule__Icon__Group_1_2__28611 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_2__3_in_rule__Icon__Group_1_2__28614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__DecoratorAssignment_1_2_2_in_rule__Icon__Group_1_2__2__Impl8641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_2__3__Impl_in_rule__Icon__Group_1_2__38671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Icon__Group_1_2__3__Impl8699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_3__0__Impl_in_rule__Icon__Group_1_3__08738 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_3__1_in_rule__Icon__Group_1_3__08741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Icon__Group_1_3__0__Impl8769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_3__1__Impl_in_rule__Icon__Group_1_3__18800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_3__2_in_rule__Icon__Group_1_3__18803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Icon__Group_1_3__1__Impl8831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_3__2__Impl_in_rule__Icon__Group_1_3__28862 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_3__3_in_rule__Icon__Group_1_3__28865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Text_altAssignment_1_3_2_in_rule__Icon__Group_1_3__2__Impl8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_3__3__Impl_in_rule__Icon__Group_1_3__38922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Icon__Group_1_3__3__Impl8950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_4__0__Impl_in_rule__Icon__Group_1_4__08989 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_4__1_in_rule__Icon__Group_1_4__08992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Icon__Group_1_4__0__Impl9020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_4__1__Impl_in_rule__Icon__Group_1_4__19051 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_4__2_in_rule__Icon__Group_1_4__19054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Icon__Group_1_4__1__Impl9082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_4__2__Impl_in_rule__Icon__Group_1_4__29113 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_4__3_in_rule__Icon__Group_1_4__29116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__AddressAssignment_1_4_2_in_rule__Icon__Group_1_4__2__Impl9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_4__3__Impl_in_rule__Icon__Group_1_4__39173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Icon__Group_1_4__3__Impl9201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__0_in_rule__Menu__UnorderedGroup9241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_0__0_in_rule__Menu__UnorderedGroup__Impl9330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_1__0_in_rule__Menu__UnorderedGroup__Impl9421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_2__0_in_rule__Menu__UnorderedGroup__Impl9512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_3__0_in_rule__Menu__UnorderedGroup__Impl9603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_4__0_in_rule__Menu__UnorderedGroup__Impl9694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_5__0_in_rule__Menu__UnorderedGroup__Impl9785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group_6__0_in_rule__Menu__UnorderedGroup__Impl9876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__09935 = new BitSet(new long[]{0x0000009F20000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__1_in_rule__Menu__UnorderedGroup__09938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__19963 = new BitSet(new long[]{0x0000009F20000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__2_in_rule__Menu__UnorderedGroup__19966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__29991 = new BitSet(new long[]{0x0000009F20000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__3_in_rule__Menu__UnorderedGroup__29994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__310019 = new BitSet(new long[]{0x0000009F20000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__4_in_rule__Menu__UnorderedGroup__310022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__410047 = new BitSet(new long[]{0x0000009F20000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__5_in_rule__Menu__UnorderedGroup__410050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__510075 = new BitSet(new long[]{0x0000009F20000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__6_in_rule__Menu__UnorderedGroup__510078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__UnorderedGroup__Impl_in_rule__Menu__UnorderedGroup__610103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__0_in_rule__Item__UnorderedGroup_110141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_0__0_in_rule__Item__UnorderedGroup_1__Impl10230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_1__0_in_rule__Item__UnorderedGroup_1__Impl10321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__0_in_rule__Item__UnorderedGroup_1__Impl10412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_3__0_in_rule__Item__UnorderedGroup_1__Impl10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_4__0_in_rule__Item__UnorderedGroup_1__Impl10594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_5__0_in_rule__Item__UnorderedGroup_1__Impl10685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_6__0_in_rule__Item__UnorderedGroup_1__Impl10776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_7__0_in_rule__Item__UnorderedGroup_1__Impl10867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_8__0_in_rule__Item__UnorderedGroup_1__Impl10958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__011017 = new BitSet(new long[]{0x001FC00820000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__1_in_rule__Item__UnorderedGroup_1__011020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__111045 = new BitSet(new long[]{0x001FC00820000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__2_in_rule__Item__UnorderedGroup_1__111048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__211073 = new BitSet(new long[]{0x001FC00820000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__3_in_rule__Item__UnorderedGroup_1__211076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__311101 = new BitSet(new long[]{0x001FC00820000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__4_in_rule__Item__UnorderedGroup_1__311104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__411129 = new BitSet(new long[]{0x001FC00820000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__5_in_rule__Item__UnorderedGroup_1__411132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__511157 = new BitSet(new long[]{0x001FC00820000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__6_in_rule__Item__UnorderedGroup_1__511160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__611185 = new BitSet(new long[]{0x001FC00820000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__7_in_rule__Item__UnorderedGroup_1__611188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__711213 = new BitSet(new long[]{0x001FC00820000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__8_in_rule__Item__UnorderedGroup_1__711216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__UnorderedGroup_1__Impl_in_rule__Item__UnorderedGroup_1__811241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__UnorderedGroup_1__0_in_rule__SubMenu__UnorderedGroup_111283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_0__0_in_rule__SubMenu__UnorderedGroup_1__Impl11372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__Group_1_1__0_in_rule__SubMenu__UnorderedGroup_1__Impl11463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__UnorderedGroup_1__Impl_in_rule__SubMenu__UnorderedGroup_1__011522 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_rule__SubMenu__UnorderedGroup_1__1_in_rule__SubMenu__UnorderedGroup_1__011525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubMenu__UnorderedGroup_1__Impl_in_rule__SubMenu__UnorderedGroup_1__111550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__UnorderedGroup_1__0_in_rule__Icon__UnorderedGroup_111578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_0__0_in_rule__Icon__UnorderedGroup_1__Impl11667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_1__0_in_rule__Icon__UnorderedGroup_1__Impl11758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_2__0_in_rule__Icon__UnorderedGroup_1__Impl11849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_3__0_in_rule__Icon__UnorderedGroup_1__Impl11940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__Group_1_4__0_in_rule__Icon__UnorderedGroup_1__Impl12031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__UnorderedGroup_1__Impl_in_rule__Icon__UnorderedGroup_1__012090 = new BitSet(new long[]{0x0060000C20000002L});
    public static final BitSet FOLLOW_rule__Icon__UnorderedGroup_1__1_in_rule__Icon__UnorderedGroup_1__012093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__UnorderedGroup_1__Impl_in_rule__Icon__UnorderedGroup_1__112118 = new BitSet(new long[]{0x0060000C20000002L});
    public static final BitSet FOLLOW_rule__Icon__UnorderedGroup_1__2_in_rule__Icon__UnorderedGroup_1__112121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__UnorderedGroup_1__Impl_in_rule__Icon__UnorderedGroup_1__212146 = new BitSet(new long[]{0x0060000C20000002L});
    public static final BitSet FOLLOW_rule__Icon__UnorderedGroup_1__3_in_rule__Icon__UnorderedGroup_1__212149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__UnorderedGroup_1__Impl_in_rule__Icon__UnorderedGroup_1__312174 = new BitSet(new long[]{0x0060000C20000002L});
    public static final BitSet FOLLOW_rule__Icon__UnorderedGroup_1__4_in_rule__Icon__UnorderedGroup_1__312177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Icon__UnorderedGroup_1__Impl_in_rule__Icon__UnorderedGroup_1__412202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Menu__NameAssignment_0_212240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Menu__TypeAssignment_1_212271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_rule__Menu__StyleAssignment_2_212302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_rule__Menu__PositionAssignment_3_212333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Menu__DecoratorAssignment_4_212364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurations_in_rule__Menu__ConfigurationAssignment_5_312395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__Menu__ItemsAssignment_6_312426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__Menu__ItemsAssignment_6_4_112457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_rule__Configurations__Config_topAssignment_0_0_112488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_rule__Configurations__Config_childrenAssignment_0_1_112519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_rule__Configurations__Config_topAssignment_1_0_212550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_rule__Configurations__Config_childrenAssignment_1_1_212581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FEATURE_in_rule__Config__FeatureAssignment_112612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_in_rule__Config__ColorAssignment_312643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Item__NameAssignment_1_0_212674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Item__DecoratorAssignment_1_1_212705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Item__ActionAssignment_1_2_212736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Item__LabelAssignment_1_3_212767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Item__TitleAssignment_1_4_212798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_rule__Item__DirectionAssignment_1_5_212829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTarget_in_rule__Item__TargetAssignment_1_6_212860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIcon_in_rule__Item__IconAssignment_1_7_212891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubMenu_in_rule__Item__SubmenuAssignment_1_8_212922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SubMenu__DecoratorAssignment_1_0_212953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__SubMenu__ItemsAssignment_1_1_3_012984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__SubMenu__ItemsAssignment_1_1_3_1_113015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Icon__NameAssignment_1_0_213046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_rule__Icon__PositionAssignment_1_1_213077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Icon__DecoratorAssignment_1_2_213108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Icon__Text_altAssignment_1_3_213139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Icon__AddressAssignment_1_4_213170 = new BitSet(new long[]{0x0000000000000002L});

}
