/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalJsonDslParser;
import org.xtext.example.mydsl.services.JsonDslGrammarAccess;

public class JsonDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(JsonDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, JsonDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSimpleStatementAccess().getAlternatives_0(), "rule__SimpleStatement__Alternatives_0");
			builder.put(grammarAccess.getExpressionLvl3Access().getAlternatives_1(), "rule__ExpressionLvl3__Alternatives_1");
			builder.put(grammarAccess.getExpressionLvl4Access().getAlternatives_1(), "rule__ExpressionLvl4__Alternatives_1");
			builder.put(grammarAccess.getExpressionLvl5Access().getAlternatives_1(), "rule__ExpressionLvl5__Alternatives_1");
			builder.put(grammarAccess.getExpressionLvl6Access().getAlternatives_1(), "rule__ExpressionLvl6__Alternatives_1");
			builder.put(grammarAccess.getExpressionLvl7Access().getAlternatives(), "rule__ExpressionLvl7__Alternatives");
			builder.put(grammarAccess.getExpressionLvl8Access().getAlternatives(), "rule__ExpressionLvl8__Alternatives");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
			builder.put(grammarAccess.getAuxiliarCallerAccess().getAlternatives(), "rule__AuxiliarCaller__Alternatives");
			builder.put(grammarAccess.getFunctionCallAccess().getAlternatives(), "rule__FunctionCall__Alternatives");
			builder.put(grammarAccess.getIOFunctionsAccess().getAlternatives(), "rule__IOFunctions__Alternatives");
			builder.put(grammarAccess.getInfoFunctionsAccess().getAlternatives(), "rule__InfoFunctions__Alternatives");
			builder.put(grammarAccess.getManipFunctionsAccess().getAlternatives(), "rule__ManipFunctions__Alternatives");
			builder.put(grammarAccess.getArithFunctionsAccess().getAlternatives(), "rule__ArithFunctions__Alternatives");
			builder.put(grammarAccess.getAlterFunctionsAccess().getAlternatives(), "rule__AlterFunctions__Alternatives");
			builder.put(grammarAccess.getSelectAccess().getAlternatives_2(), "rule__Select__Alternatives_2");
			builder.put(grammarAccess.getDeleteAccess().getAlternatives_2(), "rule__Delete__Alternatives_2");
			builder.put(grammarAccess.getConstantAccess().getAlternatives(), "rule__Constant__Alternatives");
			builder.put(grammarAccess.getPrimitiveAccess().getAlternatives(), "rule__Primitive__Alternatives");
			builder.put(grammarAccess.getNUMBERAccess().getAlternatives(), "rule__NUMBER__Alternatives");
			builder.put(grammarAccess.getSimpleStatementAccess().getGroup(), "rule__SimpleStatement__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
			builder.put(grammarAccess.getExpressionLvl1Access().getGroup(), "rule__ExpressionLvl1__Group__0");
			builder.put(grammarAccess.getExpressionLvl1Access().getGroup_1(), "rule__ExpressionLvl1__Group_1__0");
			builder.put(grammarAccess.getExpressionLvl2Access().getGroup(), "rule__ExpressionLvl2__Group__0");
			builder.put(grammarAccess.getExpressionLvl2Access().getGroup_1(), "rule__ExpressionLvl2__Group_1__0");
			builder.put(grammarAccess.getExpressionLvl3Access().getGroup(), "rule__ExpressionLvl3__Group__0");
			builder.put(grammarAccess.getExpressionLvl3Access().getGroup_1_0(), "rule__ExpressionLvl3__Group_1_0__0");
			builder.put(grammarAccess.getExpressionLvl3Access().getGroup_1_1(), "rule__ExpressionLvl3__Group_1_1__0");
			builder.put(grammarAccess.getExpressionLvl4Access().getGroup(), "rule__ExpressionLvl4__Group__0");
			builder.put(grammarAccess.getExpressionLvl4Access().getGroup_1_0(), "rule__ExpressionLvl4__Group_1_0__0");
			builder.put(grammarAccess.getExpressionLvl4Access().getGroup_1_1(), "rule__ExpressionLvl4__Group_1_1__0");
			builder.put(grammarAccess.getExpressionLvl4Access().getGroup_1_2(), "rule__ExpressionLvl4__Group_1_2__0");
			builder.put(grammarAccess.getExpressionLvl4Access().getGroup_1_3(), "rule__ExpressionLvl4__Group_1_3__0");
			builder.put(grammarAccess.getExpressionLvl5Access().getGroup(), "rule__ExpressionLvl5__Group__0");
			builder.put(grammarAccess.getExpressionLvl5Access().getGroup_1_0(), "rule__ExpressionLvl5__Group_1_0__0");
			builder.put(grammarAccess.getExpressionLvl5Access().getGroup_1_1(), "rule__ExpressionLvl5__Group_1_1__0");
			builder.put(grammarAccess.getExpressionLvl6Access().getGroup(), "rule__ExpressionLvl6__Group__0");
			builder.put(grammarAccess.getExpressionLvl6Access().getGroup_1_0(), "rule__ExpressionLvl6__Group_1_0__0");
			builder.put(grammarAccess.getExpressionLvl6Access().getGroup_1_1(), "rule__ExpressionLvl6__Group_1_1__0");
			builder.put(grammarAccess.getExpressionLvl6Access().getGroup_1_2(), "rule__ExpressionLvl6__Group_1_2__0");
			builder.put(grammarAccess.getUnaryMinusExpressionAccess().getGroup(), "rule__UnaryMinusExpression__Group__0");
			builder.put(grammarAccess.getUnaryPlusExpressionAccess().getGroup(), "rule__UnaryPlusExpression__Group__0");
			builder.put(grammarAccess.getLogicalNegationExpressionAccess().getGroup(), "rule__LogicalNegationExpression__Group__0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getGroup_4(), "rule__PrimaryExpression__Group_4__0");
			builder.put(grammarAccess.getBracketExpressionAccess().getGroup(), "rule__BracketExpression__Group__0");
			builder.put(grammarAccess.getVariableCallAccess().getGroup(), "rule__VariableCall__Group__0");
			builder.put(grammarAccess.getFieldCallerAccess().getGroup(), "rule__FieldCaller__Group__0");
			builder.put(grammarAccess.getArrayCallerAccess().getGroup(), "rule__ArrayCaller__Group__0");
			builder.put(grammarAccess.getArrayCallerAccess().getGroup_2(), "rule__ArrayCaller__Group_2__0");
			builder.put(grammarAccess.getLoadAccess().getGroup(), "rule__Load__Group__0");
			builder.put(grammarAccess.getStoreAccess().getGroup(), "rule__Store__Group__0");
			builder.put(grammarAccess.getExportAccess().getGroup(), "rule__Export__Group__0");
			builder.put(grammarAccess.getProcCallAccess().getGroup(), "rule__ProcCall__Group__0");
			builder.put(grammarAccess.getDepthAccess().getGroup(), "rule__Depth__Group__0");
			builder.put(grammarAccess.getFieldInfoAccess().getGroup(), "rule__FieldInfo__Group__0");
			builder.put(grammarAccess.getContainsAccess().getGroup(), "rule__Contains__Group__0");
			builder.put(grammarAccess.getContainsAccess().getGroup_3(), "rule__Contains__Group_3__0");
			builder.put(grammarAccess.getSelectAccess().getGroup(), "rule__Select__Group__0");
			builder.put(grammarAccess.getSelectAccess().getGroup_2_1(), "rule__Select__Group_2_1__0");
			builder.put(grammarAccess.getSelectAccess().getGroup_2_1_1(), "rule__Select__Group_2_1_1__0");
			builder.put(grammarAccess.getSelectAccess().getGroup_8(), "rule__Select__Group_8__0");
			builder.put(grammarAccess.getConcatAccess().getGroup(), "rule__Concat__Group__0");
			builder.put(grammarAccess.getConcatAccess().getGroup_3(), "rule__Concat__Group_3__0");
			builder.put(grammarAccess.getSumAccess().getGroup(), "rule__Sum__Group__0");
			builder.put(grammarAccess.getSumAccess().getGroup_4(), "rule__Sum__Group_4__0");
			builder.put(grammarAccess.getSumAccess().getGroup_4_3(), "rule__Sum__Group_4_3__0");
			builder.put(grammarAccess.getSumAccess().getGroup_5(), "rule__Sum__Group_5__0");
			builder.put(grammarAccess.getProductAccess().getGroup(), "rule__Product__Group__0");
			builder.put(grammarAccess.getProductAccess().getGroup_4(), "rule__Product__Group_4__0");
			builder.put(grammarAccess.getProductAccess().getGroup_4_3(), "rule__Product__Group_4_3__0");
			builder.put(grammarAccess.getProductAccess().getGroup_5(), "rule__Product__Group_5__0");
			builder.put(grammarAccess.getMeanAccess().getGroup(), "rule__Mean__Group__0");
			builder.put(grammarAccess.getMeanAccess().getGroup_4(), "rule__Mean__Group_4__0");
			builder.put(grammarAccess.getMeanAccess().getGroup_4_3(), "rule__Mean__Group_4_3__0");
			builder.put(grammarAccess.getMeanAccess().getGroup_5(), "rule__Mean__Group_5__0");
			builder.put(grammarAccess.getAddAccess().getGroup(), "rule__Add__Group__0");
			builder.put(grammarAccess.getAddAccess().getGroup_8(), "rule__Add__Group_8__0");
			builder.put(grammarAccess.getAddAccess().getGroup_8_3(), "rule__Add__Group_8_3__0");
			builder.put(grammarAccess.getInsertAccess().getGroup(), "rule__Insert__Group__0");
			builder.put(grammarAccess.getInsertAccess().getGroup_8(), "rule__Insert__Group_8__0");
			builder.put(grammarAccess.getRenameAccess().getGroup(), "rule__Rename__Group__0");
			builder.put(grammarAccess.getRenameAccess().getGroup_7(), "rule__Rename__Group_7__0");
			builder.put(grammarAccess.getRenameAccess().getGroup_12(), "rule__Rename__Group_12__0");
			builder.put(grammarAccess.getDeleteAccess().getGroup(), "rule__Delete__Group__0");
			builder.put(grammarAccess.getDeleteAccess().getGroup_2_1(), "rule__Delete__Group_2_1__0");
			builder.put(grammarAccess.getDeleteAccess().getGroup_2_1_1(), "rule__Delete__Group_2_1_1__0");
			builder.put(grammarAccess.getDeleteAccess().getGroup_8(), "rule__Delete__Group_8__0");
			builder.put(grammarAccess.getRemoveAccess().getGroup(), "rule__Remove__Group__0");
			builder.put(grammarAccess.getRemoveAccess().getGroup_8(), "rule__Remove__Group_8__0");
			builder.put(grammarAccess.getArrayAccess().getGroup(), "rule__Array__Group__0");
			builder.put(grammarAccess.getArrayAccess().getGroup_2(), "rule__Array__Group_2__0");
			builder.put(grammarAccess.getArrayAccess().getGroup_2_1(), "rule__Array__Group_2_1__0");
			builder.put(grammarAccess.getJSonObjectAccess().getGroup(), "rule__JSonObject__Group__0");
			builder.put(grammarAccess.getJSonObjectAccess().getGroup_2(), "rule__JSonObject__Group_2__0");
			builder.put(grammarAccess.getJSonObjectAccess().getGroup_2_1(), "rule__JSonObject__Group_2_1__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getModelAccess().getStmtsAssignment(), "rule__Model__StmtsAssignment");
			builder.put(grammarAccess.getAssignmentAccess().getLeftHandSideAssignment_0(), "rule__Assignment__LeftHandSideAssignment_0");
			builder.put(grammarAccess.getAssignmentAccess().getRightHandSideAssignment_2(), "rule__Assignment__RightHandSideAssignment_2");
			builder.put(grammarAccess.getExpressionLvl1Access().getRightAssignment_1_2(), "rule__ExpressionLvl1__RightAssignment_1_2");
			builder.put(grammarAccess.getExpressionLvl2Access().getRightAssignment_1_2(), "rule__ExpressionLvl2__RightAssignment_1_2");
			builder.put(grammarAccess.getExpressionLvl3Access().getRightAssignment_1_0_2(), "rule__ExpressionLvl3__RightAssignment_1_0_2");
			builder.put(grammarAccess.getExpressionLvl3Access().getRightAssignment_1_1_2(), "rule__ExpressionLvl3__RightAssignment_1_1_2");
			builder.put(grammarAccess.getExpressionLvl4Access().getRightAssignment_1_0_2(), "rule__ExpressionLvl4__RightAssignment_1_0_2");
			builder.put(grammarAccess.getExpressionLvl4Access().getRightAssignment_1_1_2(), "rule__ExpressionLvl4__RightAssignment_1_1_2");
			builder.put(grammarAccess.getExpressionLvl4Access().getRightAssignment_1_2_2(), "rule__ExpressionLvl4__RightAssignment_1_2_2");
			builder.put(grammarAccess.getExpressionLvl4Access().getRightAssignment_1_3_2(), "rule__ExpressionLvl4__RightAssignment_1_3_2");
			builder.put(grammarAccess.getExpressionLvl5Access().getRightAssignment_1_0_2(), "rule__ExpressionLvl5__RightAssignment_1_0_2");
			builder.put(grammarAccess.getExpressionLvl5Access().getRightAssignment_1_1_2(), "rule__ExpressionLvl5__RightAssignment_1_1_2");
			builder.put(grammarAccess.getExpressionLvl6Access().getRightAssignment_1_0_2(), "rule__ExpressionLvl6__RightAssignment_1_0_2");
			builder.put(grammarAccess.getExpressionLvl6Access().getRightAssignment_1_1_2(), "rule__ExpressionLvl6__RightAssignment_1_1_2");
			builder.put(grammarAccess.getExpressionLvl6Access().getRightAssignment_1_2_2(), "rule__ExpressionLvl6__RightAssignment_1_2_2");
			builder.put(grammarAccess.getUnaryMinusExpressionAccess().getSubAssignment_1(), "rule__UnaryMinusExpression__SubAssignment_1");
			builder.put(grammarAccess.getUnaryPlusExpressionAccess().getSubAssignment_1(), "rule__UnaryPlusExpression__SubAssignment_1");
			builder.put(grammarAccess.getLogicalNegationExpressionAccess().getSubAssignment_1(), "rule__LogicalNegationExpression__SubAssignment_1");
			builder.put(grammarAccess.getBracketExpressionAccess().getSubAssignment_1(), "rule__BracketExpression__SubAssignment_1");
			builder.put(grammarAccess.getVariableCallAccess().getNameAssignment_0(), "rule__VariableCall__NameAssignment_0");
			builder.put(grammarAccess.getVariableCallAccess().getCallerAssignment_1(), "rule__VariableCall__CallerAssignment_1");
			builder.put(grammarAccess.getFieldCallerAccess().getKeyAssignment_1(), "rule__FieldCaller__KeyAssignment_1");
			builder.put(grammarAccess.getArrayCallerAccess().getIndexAssignment_1(), "rule__ArrayCaller__IndexAssignment_1");
			builder.put(grammarAccess.getArrayCallerAccess().getIndexAssignment_2_1(), "rule__ArrayCaller__IndexAssignment_2_1");
			builder.put(grammarAccess.getLoadAccess().getFileNameAssignment_2(), "rule__Load__FileNameAssignment_2");
			builder.put(grammarAccess.getStoreAccess().getExpressionAssignment_2(), "rule__Store__ExpressionAssignment_2");
			builder.put(grammarAccess.getStoreAccess().getFileNameAssignment_6(), "rule__Store__FileNameAssignment_6");
			builder.put(grammarAccess.getExportAccess().getExpressionAssignment_2(), "rule__Export__ExpressionAssignment_2");
			builder.put(grammarAccess.getExportAccess().getFileNameAssignment_6(), "rule__Export__FileNameAssignment_6");
			builder.put(grammarAccess.getProcCallAccess().getExpressionAssignment_2(), "rule__ProcCall__ExpressionAssignment_2");
			builder.put(grammarAccess.getDepthAccess().getExpressionAssignment_2(), "rule__Depth__ExpressionAssignment_2");
			builder.put(grammarAccess.getFieldInfoAccess().getExpressionAssignment_2(), "rule__FieldInfo__ExpressionAssignment_2");
			builder.put(grammarAccess.getContainsAccess().getKeysAssignment_2(), "rule__Contains__KeysAssignment_2");
			builder.put(grammarAccess.getContainsAccess().getKeysAssignment_3_1(), "rule__Contains__KeysAssignment_3_1");
			builder.put(grammarAccess.getContainsAccess().getRightAssignment_7(), "rule__Contains__RightAssignment_7");
			builder.put(grammarAccess.getSelectAccess().getFieldsAssignment_2_1_0(), "rule__Select__FieldsAssignment_2_1_0");
			builder.put(grammarAccess.getSelectAccess().getFieldsAssignment_2_1_1_1(), "rule__Select__FieldsAssignment_2_1_1_1");
			builder.put(grammarAccess.getSelectAccess().getFromExpressionAssignment_6(), "rule__Select__FromExpressionAssignment_6");
			builder.put(grammarAccess.getSelectAccess().getWhereExpressionAssignment_8_2(), "rule__Select__WhereExpressionAssignment_8_2");
			builder.put(grammarAccess.getConcatAccess().getExpressionsAssignment_2(), "rule__Concat__ExpressionsAssignment_2");
			builder.put(grammarAccess.getConcatAccess().getExpressionsAssignment_3_1(), "rule__Concat__ExpressionsAssignment_3_1");
			builder.put(grammarAccess.getSumAccess().getExpressionAssignment_2(), "rule__Sum__ExpressionAssignment_2");
			builder.put(grammarAccess.getSumAccess().getFieldsAssignment_4_2(), "rule__Sum__FieldsAssignment_4_2");
			builder.put(grammarAccess.getSumAccess().getFieldsAssignment_4_3_1(), "rule__Sum__FieldsAssignment_4_3_1");
			builder.put(grammarAccess.getSumAccess().getWhereExpressionAssignment_5_2(), "rule__Sum__WhereExpressionAssignment_5_2");
			builder.put(grammarAccess.getProductAccess().getExpressionAssignment_2(), "rule__Product__ExpressionAssignment_2");
			builder.put(grammarAccess.getProductAccess().getFieldsAssignment_4_2(), "rule__Product__FieldsAssignment_4_2");
			builder.put(grammarAccess.getProductAccess().getFieldsAssignment_4_3_1(), "rule__Product__FieldsAssignment_4_3_1");
			builder.put(grammarAccess.getProductAccess().getWhereExpressionAssignment_5_2(), "rule__Product__WhereExpressionAssignment_5_2");
			builder.put(grammarAccess.getMeanAccess().getExpressionAssignment_2(), "rule__Mean__ExpressionAssignment_2");
			builder.put(grammarAccess.getMeanAccess().getFieldsAssignment_4_2(), "rule__Mean__FieldsAssignment_4_2");
			builder.put(grammarAccess.getMeanAccess().getFieldsAssignment_4_3_1(), "rule__Mean__FieldsAssignment_4_3_1");
			builder.put(grammarAccess.getMeanAccess().getWhereExpressionAssignment_5_2(), "rule__Mean__WhereExpressionAssignment_5_2");
			builder.put(grammarAccess.getAddAccess().getExpressionAssignment_2(), "rule__Add__ExpressionAssignment_2");
			builder.put(grammarAccess.getAddAccess().getVariableAssignment_6(), "rule__Add__VariableAssignment_6");
			builder.put(grammarAccess.getAddAccess().getFieldsAssignment_8_2(), "rule__Add__FieldsAssignment_8_2");
			builder.put(grammarAccess.getAddAccess().getFieldsAssignment_8_3_1(), "rule__Add__FieldsAssignment_8_3_1");
			builder.put(grammarAccess.getInsertAccess().getValueAssignment_2(), "rule__Insert__ValueAssignment_2");
			builder.put(grammarAccess.getInsertAccess().getVariableAssignment_6(), "rule__Insert__VariableAssignment_6");
			builder.put(grammarAccess.getInsertAccess().getWhereExpressionAssignment_8_2(), "rule__Insert__WhereExpressionAssignment_8_2");
			builder.put(grammarAccess.getRenameAccess().getCallAssignment_2(), "rule__Rename__CallAssignment_2");
			builder.put(grammarAccess.getRenameAccess().getFieldsAssignment_6(), "rule__Rename__FieldsAssignment_6");
			builder.put(grammarAccess.getRenameAccess().getFieldsAssignment_7_1(), "rule__Rename__FieldsAssignment_7_1");
			builder.put(grammarAccess.getRenameAccess().getNfieldsAssignment_11(), "rule__Rename__NfieldsAssignment_11");
			builder.put(grammarAccess.getRenameAccess().getNfieldsAssignment_12_1(), "rule__Rename__NfieldsAssignment_12_1");
			builder.put(grammarAccess.getDeleteAccess().getFieldsAssignment_2_1_0(), "rule__Delete__FieldsAssignment_2_1_0");
			builder.put(grammarAccess.getDeleteAccess().getFieldsAssignment_2_1_1_1(), "rule__Delete__FieldsAssignment_2_1_1_1");
			builder.put(grammarAccess.getDeleteAccess().getFromExpressionAssignment_6(), "rule__Delete__FromExpressionAssignment_6");
			builder.put(grammarAccess.getDeleteAccess().getWhereExpressionAssignment_8_2(), "rule__Delete__WhereExpressionAssignment_8_2");
			builder.put(grammarAccess.getRemoveAccess().getValueAssignment_2(), "rule__Remove__ValueAssignment_2");
			builder.put(grammarAccess.getRemoveAccess().getVariableAssignment_6(), "rule__Remove__VariableAssignment_6");
			builder.put(grammarAccess.getRemoveAccess().getWhereExpressionAssignment_8_2(), "rule__Remove__WhereExpressionAssignment_8_2");
			builder.put(grammarAccess.getPrimitiveAccess().getStrAssignment_0(), "rule__Primitive__StrAssignment_0");
			builder.put(grammarAccess.getPrimitiveAccess().getNumAssignment_1(), "rule__Primitive__NumAssignment_1");
			builder.put(grammarAccess.getPrimitiveAccess().getBoolAssignment_2(), "rule__Primitive__BoolAssignment_2");
			builder.put(grammarAccess.getPrimitiveAccess().getNilAssignment_3(), "rule__Primitive__NilAssignment_3");
			builder.put(grammarAccess.getArrayAccess().getValuesAssignment_2_0(), "rule__Array__ValuesAssignment_2_0");
			builder.put(grammarAccess.getArrayAccess().getValuesAssignment_2_1_1(), "rule__Array__ValuesAssignment_2_1_1");
			builder.put(grammarAccess.getJSonObjectAccess().getFieldsAssignment_2_0(), "rule__JSonObject__FieldsAssignment_2_0");
			builder.put(grammarAccess.getJSonObjectAccess().getFieldsAssignment_2_1_1(), "rule__JSonObject__FieldsAssignment_2_1_1");
			builder.put(grammarAccess.getFieldAccess().getKeyAssignment_0(), "rule__Field__KeyAssignment_0");
			builder.put(grammarAccess.getFieldAccess().getValueAssignment_2(), "rule__Field__ValueAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private JsonDslGrammarAccess grammarAccess;

	@Override
	protected InternalJsonDslParser createParser() {
		InternalJsonDslParser result = new InternalJsonDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public JsonDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JsonDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
