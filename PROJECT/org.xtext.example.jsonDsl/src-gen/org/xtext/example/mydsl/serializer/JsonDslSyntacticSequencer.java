/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.JsonDslGrammarAccess;

@SuppressWarnings("all")
public class JsonDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JsonDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Select_AsteriskKeyword_2_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JsonDslGrammarAccess) access;
		match_Select_AsteriskKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getSelectAccess().getAsteriskKeyword_2_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Select_AsteriskKeyword_2_0_q.equals(syntax))
				emit_Select_AsteriskKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '*'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'SELECT' '(' (ambiguity) ')' 'FROM' '(' fromExpression=Expression
	 */
	protected void emit_Select_AsteriskKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
