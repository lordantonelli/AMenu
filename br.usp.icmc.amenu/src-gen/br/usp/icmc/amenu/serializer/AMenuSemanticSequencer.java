package br.usp.icmc.amenu.serializer;

import br.usp.icmc.amenu.aMenu.AMenuPackage;
import br.usp.icmc.amenu.aMenu.Config;
import br.usp.icmc.amenu.aMenu.Configurations;
import br.usp.icmc.amenu.aMenu.Icon;
import br.usp.icmc.amenu.aMenu.Item;
import br.usp.icmc.amenu.aMenu.Menu;
import br.usp.icmc.amenu.aMenu.SubMenu;
import br.usp.icmc.amenu.services.AMenuGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AMenuSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AMenuGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AMenuPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AMenuPackage.CONFIG:
				if(context == grammarAccess.getConfigRule()) {
					sequence_Config(context, (Config) semanticObject); 
					return; 
				}
				else break;
			case AMenuPackage.CONFIGURATIONS:
				if(context == grammarAccess.getConfigurationsRule()) {
					sequence_Configurations(context, (Configurations) semanticObject); 
					return; 
				}
				else break;
			case AMenuPackage.ICON:
				if(context == grammarAccess.getIconRule()) {
					sequence_Icon(context, (Icon) semanticObject); 
					return; 
				}
				else break;
			case AMenuPackage.ITEM:
				if(context == grammarAccess.getItemRule()) {
					sequence_Item(context, (Item) semanticObject); 
					return; 
				}
				else break;
			case AMenuPackage.MENU:
				if(context == grammarAccess.getMenuRule()) {
					sequence_Menu(context, (Menu) semanticObject); 
					return; 
				}
				else break;
			case AMenuPackage.SUB_MENU:
				if(context == grammarAccess.getSubMenuRule()) {
					sequence_SubMenu(context, (SubMenu) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (feature=FEATURE color=COLOR)
	 */
	protected void sequence_Config(EObject context, Config semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AMenuPackage.Literals.CONFIG__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AMenuPackage.Literals.CONFIG__FEATURE));
			if(transientValues.isValueTransient(semanticObject, AMenuPackage.Literals.CONFIG__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AMenuPackage.Literals.CONFIG__COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConfigAccess().getFeatureFEATURETerminalRuleCall_1_0(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getConfigAccess().getColorCOLORTerminalRuleCall_3_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((config_top+=Config | config_children+=Config) (config_top+=Config | config_children+=Config)*)
	 */
	protected void sequence_Configurations(EObject context, Configurations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? position=Position? decorator=STRING? text_alt=STRING address=STRING)
	 */
	protected void sequence_Icon(EObject context, Icon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         decorator=STRING? 
	 *         action=STRING? 
	 *         label=STRING 
	 *         title=STRING? 
	 *         direction=Direction? 
	 *         target=Target? 
	 *         icon=Icon? 
	 *         submenu=SubMenu?
	 *     )
	 */
	protected void sequence_Item(EObject context, Item semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         type=Type 
	 *         style=Style? 
	 *         position=Position? 
	 *         decorator=STRING? 
	 *         configuration=Configurations? 
	 *         items+=Item 
	 *         items+=Item*
	 *     )
	 */
	protected void sequence_Menu(EObject context, Menu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (decorator=STRING? items+=Item items+=Item*)
	 */
	protected void sequence_SubMenu(EObject context, SubMenu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
