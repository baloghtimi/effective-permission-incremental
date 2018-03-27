/*
 * generated by Xtext 2.13.0
 */
package org.mondo.collaboration.policy.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.mondo.collaboration.policy.parser.antlr.internal.InternalRulesParser;
import org.mondo.collaboration.policy.services.RulesGrammarAccess;

public class RulesParser extends AbstractAntlrParser {

	@Inject
	private RulesGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRulesParser createParser(XtextTokenStream stream) {
		return new InternalRulesParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public RulesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RulesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
