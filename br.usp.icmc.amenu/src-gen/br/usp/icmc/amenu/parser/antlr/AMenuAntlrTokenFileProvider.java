/*
* generated by Xtext
*/
package br.usp.icmc.amenu.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AMenuAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("br/usp/icmc/amenu/parser/antlr/internal/InternalAMenu.tokens");
	}
}