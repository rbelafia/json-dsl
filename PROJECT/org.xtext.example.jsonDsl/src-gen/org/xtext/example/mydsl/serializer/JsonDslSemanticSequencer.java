/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.jsonDsl.Add;
import org.xtext.example.mydsl.jsonDsl.AddExpression;
import org.xtext.example.mydsl.jsonDsl.AndExpression;
import org.xtext.example.mydsl.jsonDsl.ArithmeticAuxiliar;
import org.xtext.example.mydsl.jsonDsl.Array;
import org.xtext.example.mydsl.jsonDsl.ArrayCaller;
import org.xtext.example.mydsl.jsonDsl.ArraySpecifier;
import org.xtext.example.mydsl.jsonDsl.Assignment;
import org.xtext.example.mydsl.jsonDsl.CompExpression;
import org.xtext.example.mydsl.jsonDsl.Concat;
import org.xtext.example.mydsl.jsonDsl.Constant;
import org.xtext.example.mydsl.jsonDsl.Delete;
import org.xtext.example.mydsl.jsonDsl.Depth;
import org.xtext.example.mydsl.jsonDsl.EqExpression;
import org.xtext.example.mydsl.jsonDsl.Erase;
import org.xtext.example.mydsl.jsonDsl.Export;
import org.xtext.example.mydsl.jsonDsl.Extract;
import org.xtext.example.mydsl.jsonDsl.Field;
import org.xtext.example.mydsl.jsonDsl.FieldCaller;
import org.xtext.example.mydsl.jsonDsl.FieldInfo;
import org.xtext.example.mydsl.jsonDsl.FieldInvoquer;
import org.xtext.example.mydsl.jsonDsl.Insert;
import org.xtext.example.mydsl.jsonDsl.JsonDslPackage;
import org.xtext.example.mydsl.jsonDsl.Load;
import org.xtext.example.mydsl.jsonDsl.Mean;
import org.xtext.example.mydsl.jsonDsl.Model;
import org.xtext.example.mydsl.jsonDsl.MultExpression;
import org.xtext.example.mydsl.jsonDsl.NegationExpression;
import org.xtext.example.mydsl.jsonDsl.OrExpression;
import org.xtext.example.mydsl.jsonDsl.PrimaryExpression;
import org.xtext.example.mydsl.jsonDsl.ProcCall;
import org.xtext.example.mydsl.jsonDsl.Product;
import org.xtext.example.mydsl.jsonDsl.Remove;
import org.xtext.example.mydsl.jsonDsl.Rename;
import org.xtext.example.mydsl.jsonDsl.Select;
import org.xtext.example.mydsl.jsonDsl.Store;
import org.xtext.example.mydsl.jsonDsl.Sum;
import org.xtext.example.mydsl.jsonDsl.UnaryMinusExpression;
import org.xtext.example.mydsl.jsonDsl.VariableCall;
import org.xtext.example.mydsl.services.JsonDslGrammarAccess;

@SuppressWarnings("all")
public class JsonDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JsonDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == JsonDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JsonDslPackage.ADD:
				sequence_Add(context, (Add) semanticObject); 
				return; 
			case JsonDslPackage.ADD_EXPRESSION:
				sequence_AddExpression(context, (AddExpression) semanticObject); 
				return; 
			case JsonDslPackage.AND_EXPRESSION:
				sequence_AndExpression(context, (AndExpression) semanticObject); 
				return; 
			case JsonDslPackage.ARITHMETIC_AUXILIAR:
				sequence_ArithmeticAuxiliar(context, (ArithmeticAuxiliar) semanticObject); 
				return; 
			case JsonDslPackage.ARRAY:
				sequence_Array(context, (Array) semanticObject); 
				return; 
			case JsonDslPackage.ARRAY_CALLER:
				sequence_ArrayCaller(context, (ArrayCaller) semanticObject); 
				return; 
			case JsonDslPackage.ARRAY_SPECIFIER:
				sequence_ArraySpecifier(context, (ArraySpecifier) semanticObject); 
				return; 
			case JsonDslPackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case JsonDslPackage.COMP_EXPRESSION:
				sequence_CompExpression(context, (CompExpression) semanticObject); 
				return; 
			case JsonDslPackage.CONCAT:
				sequence_Concat(context, (Concat) semanticObject); 
				return; 
			case JsonDslPackage.CONSTANT:
				sequence_Constant(context, (Constant) semanticObject); 
				return; 
			case JsonDslPackage.DELETE:
				sequence_Delete(context, (Delete) semanticObject); 
				return; 
			case JsonDslPackage.DEPTH:
				sequence_Depth(context, (Depth) semanticObject); 
				return; 
			case JsonDslPackage.EQ_EXPRESSION:
				sequence_EqExpression(context, (EqExpression) semanticObject); 
				return; 
			case JsonDslPackage.ERASE:
				sequence_Erase(context, (Erase) semanticObject); 
				return; 
			case JsonDslPackage.EXPORT:
				sequence_Export(context, (Export) semanticObject); 
				return; 
			case JsonDslPackage.EXTRACT:
				sequence_Extract(context, (Extract) semanticObject); 
				return; 
			case JsonDslPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case JsonDslPackage.FIELD_CALLER:
				sequence_FieldCaller(context, (FieldCaller) semanticObject); 
				return; 
			case JsonDslPackage.FIELD_INFO:
				sequence_FieldInfo(context, (FieldInfo) semanticObject); 
				return; 
			case JsonDslPackage.FIELD_INVOQUER:
				sequence_FieldInvoquer(context, (FieldInvoquer) semanticObject); 
				return; 
			case JsonDslPackage.INSERT:
				sequence_Insert(context, (Insert) semanticObject); 
				return; 
			case JsonDslPackage.LOAD:
				sequence_Load(context, (Load) semanticObject); 
				return; 
			case JsonDslPackage.MEAN:
				sequence_Mean(context, (Mean) semanticObject); 
				return; 
			case JsonDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case JsonDslPackage.MULT_EXPRESSION:
				sequence_MultExpression(context, (MultExpression) semanticObject); 
				return; 
			case JsonDslPackage.NEGATION_EXPRESSION:
				sequence_NegationExpression(context, (NegationExpression) semanticObject); 
				return; 
			case JsonDslPackage.OBJECT:
				sequence_Object(context, (org.xtext.example.mydsl.jsonDsl.Object) semanticObject); 
				return; 
			case JsonDslPackage.OR_EXPRESSION:
				sequence_OrExpression(context, (OrExpression) semanticObject); 
				return; 
			case JsonDslPackage.PRIMARY_EXPRESSION:
				sequence_PrimaryExpression(context, (PrimaryExpression) semanticObject); 
				return; 
			case JsonDslPackage.PROC_CALL:
				sequence_ProcCall(context, (ProcCall) semanticObject); 
				return; 
			case JsonDslPackage.PRODUCT:
				sequence_Product(context, (Product) semanticObject); 
				return; 
			case JsonDslPackage.REMOVE:
				sequence_Remove(context, (Remove) semanticObject); 
				return; 
			case JsonDslPackage.RENAME:
				sequence_Rename(context, (Rename) semanticObject); 
				return; 
			case JsonDslPackage.SELECT:
				sequence_Select(context, (Select) semanticObject); 
				return; 
			case JsonDslPackage.STORE:
				sequence_Store(context, (Store) semanticObject); 
				return; 
			case JsonDslPackage.SUM:
				sequence_Sum(context, (Sum) semanticObject); 
				return; 
			case JsonDslPackage.UNARY_MINUS_EXPRESSION:
				sequence_UnaryMinusExpression(context, (UnaryMinusExpression) semanticObject); 
				return; 
			case JsonDslPackage.VARIABLE_CALL:
				sequence_VariableCall(context, (VariableCall) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AddExpression returns AddExpression
	 *
	 * Constraint:
	 *     (values+=MultExpression values+=MultExpression*)
	 */
	protected void sequence_AddExpression(ISerializationContext context, AddExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Add
	 *     FunctionCall returns Add
	 *     Add returns Add
	 *
	 * Constraint:
	 *     (value=Expression variable=Expression (fields+=FIELD_NAME fields+=FIELD_NAME*)?)
	 */
	protected void sequence_Add(ISerializationContext context, Add semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AndExpression returns AndExpression
	 *
	 * Constraint:
	 *     (values+=EqExpression values+=EqExpression*)
	 */
	protected void sequence_AndExpression(ISerializationContext context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArithmeticAuxiliar returns ArithmeticAuxiliar
	 *
	 * Constraint:
	 *     ((fields+=FIELD_NAME fields+=FIELD_NAME*)? condition=Expression?)
	 */
	protected void sequence_ArithmeticAuxiliar(ISerializationContext context, ArithmeticAuxiliar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AuxiliarCaller returns ArrayCaller
	 *     ArrayCaller returns ArrayCaller
	 *
	 * Constraint:
	 *     (index+=NUMBER index+=NUMBER*)
	 */
	protected void sequence_ArrayCaller(ISerializationContext context, ArrayCaller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArraySpecifier returns ArraySpecifier
	 *
	 * Constraint:
	 *     ((index+=Expression fields+=Expression*)? condition=Expression?)
	 */
	protected void sequence_ArraySpecifier(ISerializationContext context, ArraySpecifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Array
	 *     Constant returns Array
	 *     Array returns Array
	 *
	 * Constraint:
	 *     (values+=Expression values+=Expression*)?
	 */
	protected void sequence_Array(ISerializationContext context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimpleStatement returns Assignment
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     (leftHandSide=VariableCall rightHandSide=Expression)
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.ASSIGNMENT__LEFT_HAND_SIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.ASSIGNMENT__LEFT_HAND_SIDE));
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.ASSIGNMENT__RIGHT_HAND_SIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.ASSIGNMENT__RIGHT_HAND_SIDE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentAccess().getLeftHandSideVariableCallParserRuleCall_0_0(), semanticObject.getLeftHandSide());
		feeder.accept(grammarAccess.getAssignmentAccess().getRightHandSideExpressionParserRuleCall_2_0(), semanticObject.getRightHandSide());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CompExpression returns CompExpression
	 *
	 * Constraint:
	 *     (values+=AddExpression values+=AddExpression*)
	 */
	protected void sequence_CompExpression(ISerializationContext context, CompExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Concat
	 *     FunctionCall returns Concat
	 *     Concat returns Concat
	 *
	 * Constraint:
	 *     (first=Expression second=Expression)
	 */
	protected void sequence_Concat(ISerializationContext context, Concat semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.CONCAT__FIRST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.CONCAT__FIRST));
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.CONCAT__SECOND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.CONCAT__SECOND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConcatAccess().getFirstExpressionParserRuleCall_1_0(), semanticObject.getFirst());
		feeder.accept(grammarAccess.getConcatAccess().getSecondExpressionParserRuleCall_3_0(), semanticObject.getSecond());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Constant
	 *     Constant returns Constant
	 *
	 * Constraint:
	 *     {Constant}
	 */
	protected void sequence_Constant(ISerializationContext context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Delete
	 *     FunctionCall returns Delete
	 *     Delete returns Delete
	 *
	 * Constraint:
	 *     (fields+=FIELD_NAME fields+=FIELD_NAME* from=Expression condition=Expression?)
	 */
	protected void sequence_Delete(ISerializationContext context, Delete semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Depth
	 *     FunctionCall returns Depth
	 *     Depth returns Depth
	 *
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_Depth(ISerializationContext context, Depth semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.DEPTH__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.DEPTH__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDepthAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EqExpression returns EqExpression
	 *
	 * Constraint:
	 *     (values+=CompExpression values+=CompExpression*)
	 */
	protected void sequence_EqExpression(ISerializationContext context, EqExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Erase
	 *     FunctionCall returns Erase
	 *     Erase returns Erase
	 *
	 * Constraint:
	 *     (value=Expression (fields+=FIELD_NAME fields+=FIELD_NAME*)?)
	 */
	protected void sequence_Erase(ISerializationContext context, Erase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Export
	 *     FunctionCall returns Export
	 *     Export returns Export
	 *
	 * Constraint:
	 *     (expression=Expression fileName=STRING)
	 */
	protected void sequence_Export(ISerializationContext context, Export semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.EXPORT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.EXPORT__EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.EXPORT__FILE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.EXPORT__FILE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExportAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getExportAccess().getFileNameSTRINGTerminalRuleCall_3_0(), semanticObject.getFileName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Extract
	 *     FunctionCall returns Extract
	 *     Extract returns Extract
	 *
	 * Constraint:
	 *     (value=Expression auxiliar=ArithmeticAuxiliar)
	 */
	protected void sequence_Extract(ISerializationContext context, Extract semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.EXTRACT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.EXTRACT__VALUE));
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.EXTRACT__AUXILIAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.EXTRACT__AUXILIAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExtractAccess().getValueExpressionParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getExtractAccess().getAuxiliarArithmeticAuxiliarParserRuleCall_2_0(), semanticObject.getAuxiliar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AuxiliarCaller returns FieldCaller
	 *     FieldCaller returns FieldCaller
	 *
	 * Constraint:
	 *     key=FIELD_NAME
	 */
	protected void sequence_FieldCaller(ISerializationContext context, FieldCaller semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.FIELD_CALLER__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.FIELD_CALLER__KEY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldCallerAccess().getKeyFIELD_NAMETerminalRuleCall_1_0(), semanticObject.getKey());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns FieldInfo
	 *     FunctionCall returns FieldInfo
	 *     FieldInfo returns FieldInfo
	 *
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_FieldInfo(ISerializationContext context, FieldInfo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.FIELD_INFO__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.FIELD_INFO__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldInfoAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns FieldInvoquer
	 *     FieldInvoquer returns FieldInvoquer
	 *
	 * Constraint:
	 *     field=FIELD_NAME
	 */
	protected void sequence_FieldInvoquer(ISerializationContext context, FieldInvoquer semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.FIELD_INVOQUER__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.FIELD_INVOQUER__FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldInvoquerAccess().getFieldFIELD_NAMETerminalRuleCall_0(), semanticObject.getField());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Field returns Field
	 *
	 * Constraint:
	 *     (key=FIELD_NAME value=Expression)
	 */
	protected void sequence_Field(ISerializationContext context, Field semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.FIELD__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.FIELD__KEY));
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.FIELD__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldAccess().getKeyFIELD_NAMETerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getFieldAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Insert
	 *     FunctionCall returns Insert
	 *     Insert returns Insert
	 *
	 * Constraint:
	 *     (value=Expression variable=Expression specifier=ArraySpecifier)
	 */
	protected void sequence_Insert(ISerializationContext context, Insert semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.INSERT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.INSERT__VALUE));
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.INSERT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.INSERT__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.INSERT__SPECIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.INSERT__SPECIFIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInsertAccess().getValueExpressionParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getInsertAccess().getVariableExpressionParserRuleCall_3_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getInsertAccess().getSpecifierArraySpecifierParserRuleCall_4_0(), semanticObject.getSpecifier());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Load
	 *     FunctionCall returns Load
	 *     Load returns Load
	 *
	 * Constraint:
	 *     fileName=STRING
	 */
	protected void sequence_Load(ISerializationContext context, Load semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.LOAD__FILE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.LOAD__FILE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLoadAccess().getFileNameSTRINGTerminalRuleCall_1_0(), semanticObject.getFileName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Mean
	 *     FunctionCall returns Mean
	 *     Mean returns Mean
	 *
	 * Constraint:
	 *     (expression=Expression auxiliar=ArithmeticAuxiliar)
	 */
	protected void sequence_Mean(ISerializationContext context, Mean semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.MEAN__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.MEAN__EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.MEAN__AUXILIAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.MEAN__AUXILIAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMeanAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getMeanAccess().getAuxiliarArithmeticAuxiliarParserRuleCall_2_0(), semanticObject.getAuxiliar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     stmts+=SimpleStatement+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MultExpression returns MultExpression
	 *
	 * Constraint:
	 *     (values+=UnaryMinusExpression values+=UnaryMinusExpression*)
	 */
	protected void sequence_MultExpression(ISerializationContext context, MultExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NegationExpression returns NegationExpression
	 *
	 * Constraint:
	 *     (value=NegationExpression | value=PrimaryExpression)
	 */
	protected void sequence_NegationExpression(ISerializationContext context, NegationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Object
	 *     Constant returns Object
	 *     Object returns Object
	 *
	 * Constraint:
	 *     (fields+=Field fields+=Field*)?
	 */
	protected void sequence_Object(ISerializationContext context, org.xtext.example.mydsl.jsonDsl.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimpleStatement returns OrExpression
	 *     Expression returns OrExpression
	 *     BinaryExpression returns OrExpression
	 *     OrExpression returns OrExpression
	 *     PrimaryExpression returns OrExpression
	 *
	 * Constraint:
	 *     (values+=AndExpression values+=AndExpression*)
	 */
	protected void sequence_OrExpression(ISerializationContext context, OrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns PrimaryExpression
	 *
	 * Constraint:
	 *     {PrimaryExpression}
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, PrimaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimpleStatement returns ProcCall
	 *     ProcCall returns ProcCall
	 *
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_ProcCall(ISerializationContext context, ProcCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.PROC_CALL__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.PROC_CALL__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProcCallAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Product
	 *     FunctionCall returns Product
	 *     Product returns Product
	 *
	 * Constraint:
	 *     (expression=Expression auxiliar=ArithmeticAuxiliar)
	 */
	protected void sequence_Product(ISerializationContext context, Product semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.PRODUCT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.PRODUCT__EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.PRODUCT__AUXILIAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.PRODUCT__AUXILIAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProductAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getProductAccess().getAuxiliarArithmeticAuxiliarParserRuleCall_2_0(), semanticObject.getAuxiliar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Remove
	 *     FunctionCall returns Remove
	 *     Remove returns Remove
	 *
	 * Constraint:
	 *     (variable=VariableCall specifier=ArraySpecifier)
	 */
	protected void sequence_Remove(ISerializationContext context, Remove semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.REMOVE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.REMOVE__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.REMOVE__SPECIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.REMOVE__SPECIFIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRemoveAccess().getVariableVariableCallParserRuleCall_1_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getRemoveAccess().getSpecifierArraySpecifierParserRuleCall_2_0(), semanticObject.getSpecifier());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Rename
	 *     FunctionCall returns Rename
	 *     Rename returns Rename
	 *
	 * Constraint:
	 *     (call=VariableCall fields+=FIELD_NAME fields+=FIELD_NAME* nfields+=FIELD_NAME nfields+=FIELD_NAME*)
	 */
	protected void sequence_Rename(ISerializationContext context, Rename semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Select
	 *     FunctionCall returns Select
	 *     Select returns Select
	 *
	 * Constraint:
	 *     (fields+=FIELD_NAME fields+=FIELD_NAME* from=Expression condition=Expression?)
	 */
	protected void sequence_Select(ISerializationContext context, Select semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Store
	 *     FunctionCall returns Store
	 *     Store returns Store
	 *
	 * Constraint:
	 *     (expression=Expression fileName=STRING)
	 */
	protected void sequence_Store(ISerializationContext context, Store semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.STORE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.STORE__EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.STORE__FILE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.STORE__FILE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStoreAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getStoreAccess().getFileNameSTRINGTerminalRuleCall_3_0(), semanticObject.getFileName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Sum
	 *     FunctionCall returns Sum
	 *     Sum returns Sum
	 *
	 * Constraint:
	 *     (expression=Expression auxiliar=ArithmeticAuxiliar)
	 */
	protected void sequence_Sum(ISerializationContext context, Sum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.SUM__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.SUM__EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, JsonDslPackage.Literals.SUM__AUXILIAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonDslPackage.Literals.SUM__AUXILIAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSumAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getSumAccess().getAuxiliarArithmeticAuxiliarParserRuleCall_2_0(), semanticObject.getAuxiliar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UnaryMinusExpression returns UnaryMinusExpression
	 *
	 * Constraint:
	 *     (value=UnaryMinusExpression | value=NegationExpression)
	 */
	protected void sequence_UnaryMinusExpression(ISerializationContext context, UnaryMinusExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns VariableCall
	 *     VariableCall returns VariableCall
	 *
	 * Constraint:
	 *     (name=ID caller+=AuxiliarCaller*)
	 */
	protected void sequence_VariableCall(ISerializationContext context, VariableCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
