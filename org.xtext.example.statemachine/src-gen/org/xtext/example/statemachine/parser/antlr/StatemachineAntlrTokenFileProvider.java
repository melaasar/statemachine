/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.statemachine.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class StatemachineAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.tokens");
	}
}
