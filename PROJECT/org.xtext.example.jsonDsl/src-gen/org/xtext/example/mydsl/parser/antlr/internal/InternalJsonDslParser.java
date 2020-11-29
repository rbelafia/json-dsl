package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.JsonDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJsonDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_BOOL", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'OR'", "'AND'", "'=='", "'!='", "'==='", "'!=='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'['", "']'", "'~'", "'('", "')'", "'.'", "':'", "'LOAD'", "'STORE'", "'IN'", "'EXPORT_CSV'", "'PRINT'", "'GET_DEPTH'", "'GET_INFOS'", "'IS'", "','", "'SELECT'", "'FROM'", "'WHERE'", "'CONCAT'", "'LENGTH'", "'SUM'", "'ON'", "'PRODUCT'", "'DELETE'", "'{'", "'}'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_NULL=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_BOOL=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalJsonDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJsonDsl.g"; }



     	private JsonDslGrammarAccess grammarAccess;

        public InternalJsonDslParser(TokenStream input, JsonDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected JsonDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalJsonDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalJsonDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalJsonDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalJsonDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_stmts_0_0= ruleSimpleStatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_stmts_0_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:77:2: ( ( (lv_stmts_0_0= ruleSimpleStatement ) )* )
            // InternalJsonDsl.g:78:2: ( (lv_stmts_0_0= ruleSimpleStatement ) )*
            {
            // InternalJsonDsl.g:78:2: ( (lv_stmts_0_0= ruleSimpleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_NULL)||(LA1_0>=26 && LA1_0<=27)||(LA1_0>=31 && LA1_0<=32)||LA1_0==35||LA1_0==37||(LA1_0>=39 && LA1_0<=40)||(LA1_0>=42 && LA1_0<=46)||LA1_0==48||(LA1_0>=51 && LA1_0<=53)||(LA1_0>=55 && LA1_0<=57)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJsonDsl.g:79:3: (lv_stmts_0_0= ruleSimpleStatement )
            	    {
            	    // InternalJsonDsl.g:79:3: (lv_stmts_0_0= ruleSimpleStatement )
            	    // InternalJsonDsl.g:80:4: lv_stmts_0_0= ruleSimpleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getStmtsSimpleStatementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_stmts_0_0=ruleSimpleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"stmts",
            	      					lv_stmts_0_0,
            	      					"org.xtext.example.mydsl.JsonDsl.SimpleStatement");
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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSimpleStatement"
    // InternalJsonDsl.g:100:1: entryRuleSimpleStatement returns [EObject current=null] : iv_ruleSimpleStatement= ruleSimpleStatement EOF ;
    public final EObject entryRuleSimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement = null;


        try {
            // InternalJsonDsl.g:100:56: (iv_ruleSimpleStatement= ruleSimpleStatement EOF )
            // InternalJsonDsl.g:101:2: iv_ruleSimpleStatement= ruleSimpleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleStatement=ruleSimpleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleStatement"


    // $ANTLR start "ruleSimpleStatement"
    // InternalJsonDsl.g:107:1: ruleSimpleStatement returns [EObject current=null] : ( (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_Print_2= rulePrint ) otherlv_3= ';' ) ;
    public final EObject ruleSimpleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Assignment_0 = null;

        EObject this_Expression_1 = null;

        EObject this_Print_2 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:113:2: ( ( (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_Print_2= rulePrint ) otherlv_3= ';' ) )
            // InternalJsonDsl.g:114:2: ( (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_Print_2= rulePrint ) otherlv_3= ';' )
            {
            // InternalJsonDsl.g:114:2: ( (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_Print_2= rulePrint ) otherlv_3= ';' )
            // InternalJsonDsl.g:115:3: (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_Print_2= rulePrint ) otherlv_3= ';'
            {
            // InternalJsonDsl.g:115:3: (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_Print_2= rulePrint )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==14||(LA2_1>=16 && LA2_1<=30)||LA2_1==32||LA2_1==34) ) {
                    alt2=2;
                }
                else if ( (LA2_1==15) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_BOOL:
            case RULE_NULL:
            case 26:
            case 27:
            case 31:
            case 32:
            case 35:
            case 37:
            case 39:
            case 40:
            case 42:
            case 44:
            case 45:
            case 46:
            case 48:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
                {
                alt2=2;
                }
                break;
            case 43:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJsonDsl.g:116:4: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatementAccess().getAssignmentParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Assignment_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:125:4: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:134:4: this_Print_2= rulePrint
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatementAccess().getPrintParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_Print_2=rulePrint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Print_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSimpleStatementAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleStatement"


    // $ANTLR start "entryRuleAssignment"
    // InternalJsonDsl.g:151:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalJsonDsl.g:151:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalJsonDsl.g:152:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalJsonDsl.g:158:1: ruleAssignment returns [EObject current=null] : ( ( (lv_leftHandSide_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_rightHandSide_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftHandSide_0_0 = null;

        EObject lv_rightHandSide_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:164:2: ( ( ( (lv_leftHandSide_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_rightHandSide_2_0= ruleExpression ) ) ) )
            // InternalJsonDsl.g:165:2: ( ( (lv_leftHandSide_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_rightHandSide_2_0= ruleExpression ) ) )
            {
            // InternalJsonDsl.g:165:2: ( ( (lv_leftHandSide_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_rightHandSide_2_0= ruleExpression ) ) )
            // InternalJsonDsl.g:166:3: ( (lv_leftHandSide_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_rightHandSide_2_0= ruleExpression ) )
            {
            // InternalJsonDsl.g:166:3: ( (lv_leftHandSide_0_0= ruleVariableCall ) )
            // InternalJsonDsl.g:167:4: (lv_leftHandSide_0_0= ruleVariableCall )
            {
            // InternalJsonDsl.g:167:4: (lv_leftHandSide_0_0= ruleVariableCall )
            // InternalJsonDsl.g:168:5: lv_leftHandSide_0_0= ruleVariableCall
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getLeftHandSideVariableCallParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_leftHandSide_0_0=ruleVariableCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"leftHandSide",
              						lv_leftHandSide_0_0,
              						"org.xtext.example.mydsl.JsonDsl.VariableCall");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalJsonDsl.g:189:3: ( (lv_rightHandSide_2_0= ruleExpression ) )
            // InternalJsonDsl.g:190:4: (lv_rightHandSide_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:190:4: (lv_rightHandSide_2_0= ruleExpression )
            // InternalJsonDsl.g:191:5: lv_rightHandSide_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getRightHandSideExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_rightHandSide_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"rightHandSide",
              						lv_rightHandSide_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // InternalJsonDsl.g:212:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalJsonDsl.g:212:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalJsonDsl.g:213:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalJsonDsl.g:219:1: ruleExpression returns [EObject current=null] : this_ExpressionLvl1_0= ruleExpressionLvl1 ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLvl1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:225:2: (this_ExpressionLvl1_0= ruleExpressionLvl1 )
            // InternalJsonDsl.g:226:2: this_ExpressionLvl1_0= ruleExpressionLvl1
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getExpressionLvl1ParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ExpressionLvl1_0=ruleExpressionLvl1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ExpressionLvl1_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionLvl1"
    // InternalJsonDsl.g:237:1: entryRuleExpressionLvl1 returns [EObject current=null] : iv_ruleExpressionLvl1= ruleExpressionLvl1 EOF ;
    public final EObject entryRuleExpressionLvl1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl1 = null;


        try {
            // InternalJsonDsl.g:237:55: (iv_ruleExpressionLvl1= ruleExpressionLvl1 EOF )
            // InternalJsonDsl.g:238:2: iv_ruleExpressionLvl1= ruleExpressionLvl1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLvl1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLvl1=ruleExpressionLvl1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLvl1; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLvl1"


    // $ANTLR start "ruleExpressionLvl1"
    // InternalJsonDsl.g:244:1: ruleExpressionLvl1 returns [EObject current=null] : (this_ExpressionLvl2_0= ruleExpressionLvl2 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpressionLvl2 ) ) )* ) ;
    public final EObject ruleExpressionLvl1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExpressionLvl2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:250:2: ( (this_ExpressionLvl2_0= ruleExpressionLvl2 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpressionLvl2 ) ) )* ) )
            // InternalJsonDsl.g:251:2: (this_ExpressionLvl2_0= ruleExpressionLvl2 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpressionLvl2 ) ) )* )
            {
            // InternalJsonDsl.g:251:2: (this_ExpressionLvl2_0= ruleExpressionLvl2 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpressionLvl2 ) ) )* )
            // InternalJsonDsl.g:252:3: this_ExpressionLvl2_0= ruleExpressionLvl2 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpressionLvl2 ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLvl1Access().getExpressionLvl2ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            this_ExpressionLvl2_0=ruleExpressionLvl2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLvl2_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalJsonDsl.g:260:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpressionLvl2 ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJsonDsl.g:261:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpressionLvl2 ) )
            	    {
            	    // InternalJsonDsl.g:261:4: ()
            	    // InternalJsonDsl.g:262:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExpressionLvl1Access().getDisjunctionExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExpressionLvl1Access().getORKeyword_1_1());
            	      			
            	    }
            	    // InternalJsonDsl.g:272:4: ( (lv_right_3_0= ruleExpressionLvl2 ) )
            	    // InternalJsonDsl.g:273:5: (lv_right_3_0= ruleExpressionLvl2 )
            	    {
            	    // InternalJsonDsl.g:273:5: (lv_right_3_0= ruleExpressionLvl2 )
            	    // InternalJsonDsl.g:274:6: lv_right_3_0= ruleExpressionLvl2
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionLvl1Access().getRightExpressionLvl2ParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleExpressionLvl2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpressionLvl1Rule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.mydsl.JsonDsl.ExpressionLvl2");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLvl1"


    // $ANTLR start "entryRuleExpressionLvl2"
    // InternalJsonDsl.g:296:1: entryRuleExpressionLvl2 returns [EObject current=null] : iv_ruleExpressionLvl2= ruleExpressionLvl2 EOF ;
    public final EObject entryRuleExpressionLvl2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl2 = null;


        try {
            // InternalJsonDsl.g:296:55: (iv_ruleExpressionLvl2= ruleExpressionLvl2 EOF )
            // InternalJsonDsl.g:297:2: iv_ruleExpressionLvl2= ruleExpressionLvl2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLvl2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLvl2=ruleExpressionLvl2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLvl2; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLvl2"


    // $ANTLR start "ruleExpressionLvl2"
    // InternalJsonDsl.g:303:1: ruleExpressionLvl2 returns [EObject current=null] : (this_ExpressionLvl3_0= ruleExpressionLvl3 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpressionLvl3 ) ) )* ) ;
    public final EObject ruleExpressionLvl2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExpressionLvl3_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:309:2: ( (this_ExpressionLvl3_0= ruleExpressionLvl3 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpressionLvl3 ) ) )* ) )
            // InternalJsonDsl.g:310:2: (this_ExpressionLvl3_0= ruleExpressionLvl3 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpressionLvl3 ) ) )* )
            {
            // InternalJsonDsl.g:310:2: (this_ExpressionLvl3_0= ruleExpressionLvl3 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpressionLvl3 ) ) )* )
            // InternalJsonDsl.g:311:3: this_ExpressionLvl3_0= ruleExpressionLvl3 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpressionLvl3 ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLvl2Access().getExpressionLvl3ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_ExpressionLvl3_0=ruleExpressionLvl3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLvl3_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalJsonDsl.g:319:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpressionLvl3 ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJsonDsl.g:320:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpressionLvl3 ) )
            	    {
            	    // InternalJsonDsl.g:320:4: ()
            	    // InternalJsonDsl.g:321:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExpressionLvl2Access().getConjunctionExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExpressionLvl2Access().getANDKeyword_1_1());
            	      			
            	    }
            	    // InternalJsonDsl.g:331:4: ( (lv_right_3_0= ruleExpressionLvl3 ) )
            	    // InternalJsonDsl.g:332:5: (lv_right_3_0= ruleExpressionLvl3 )
            	    {
            	    // InternalJsonDsl.g:332:5: (lv_right_3_0= ruleExpressionLvl3 )
            	    // InternalJsonDsl.g:333:6: lv_right_3_0= ruleExpressionLvl3
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionLvl2Access().getRightExpressionLvl3ParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=ruleExpressionLvl3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpressionLvl2Rule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.mydsl.JsonDsl.ExpressionLvl3");
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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLvl2"


    // $ANTLR start "entryRuleExpressionLvl3"
    // InternalJsonDsl.g:355:1: entryRuleExpressionLvl3 returns [EObject current=null] : iv_ruleExpressionLvl3= ruleExpressionLvl3 EOF ;
    public final EObject entryRuleExpressionLvl3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl3 = null;


        try {
            // InternalJsonDsl.g:355:55: (iv_ruleExpressionLvl3= ruleExpressionLvl3 EOF )
            // InternalJsonDsl.g:356:2: iv_ruleExpressionLvl3= ruleExpressionLvl3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLvl3Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLvl3=ruleExpressionLvl3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLvl3; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLvl3"


    // $ANTLR start "ruleExpressionLvl3"
    // InternalJsonDsl.g:362:1: ruleExpressionLvl3 returns [EObject current=null] : (this_ExpressionLvl4_0= ruleExpressionLvl4 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_8= '===' ( (lv_right_9_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_11= '!==' ( (lv_right_12_0= ruleExpressionLvl4 ) ) ) )* ) ;
    public final EObject ruleExpressionLvl3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_ExpressionLvl4_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:368:2: ( (this_ExpressionLvl4_0= ruleExpressionLvl4 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_8= '===' ( (lv_right_9_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_11= '!==' ( (lv_right_12_0= ruleExpressionLvl4 ) ) ) )* ) )
            // InternalJsonDsl.g:369:2: (this_ExpressionLvl4_0= ruleExpressionLvl4 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_8= '===' ( (lv_right_9_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_11= '!==' ( (lv_right_12_0= ruleExpressionLvl4 ) ) ) )* )
            {
            // InternalJsonDsl.g:369:2: (this_ExpressionLvl4_0= ruleExpressionLvl4 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_8= '===' ( (lv_right_9_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_11= '!==' ( (lv_right_12_0= ruleExpressionLvl4 ) ) ) )* )
            // InternalJsonDsl.g:370:3: this_ExpressionLvl4_0= ruleExpressionLvl4 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_8= '===' ( (lv_right_9_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_11= '!==' ( (lv_right_12_0= ruleExpressionLvl4 ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLvl3Access().getExpressionLvl4ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_ExpressionLvl4_0=ruleExpressionLvl4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLvl4_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalJsonDsl.g:378:3: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_8= '===' ( (lv_right_9_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_11= '!==' ( (lv_right_12_0= ruleExpressionLvl4 ) ) ) )*
            loop5:
            do {
                int alt5=5;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt5=1;
                    }
                    break;
                case 19:
                    {
                    alt5=2;
                    }
                    break;
                case 20:
                    {
                    alt5=3;
                    }
                    break;
                case 21:
                    {
                    alt5=4;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalJsonDsl.g:379:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) )
            	    {
            	    // InternalJsonDsl.g:379:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) )
            	    // InternalJsonDsl.g:380:5: () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) )
            	    {
            	    // InternalJsonDsl.g:380:5: ()
            	    // InternalJsonDsl.g:381:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl3Access().getEqualityExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLvl3Access().getEqualsSignEqualsSignKeyword_1_0_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:391:5: ( (lv_right_3_0= ruleExpressionLvl4 ) )
            	    // InternalJsonDsl.g:392:6: (lv_right_3_0= ruleExpressionLvl4 )
            	    {
            	    // InternalJsonDsl.g:392:6: (lv_right_3_0= ruleExpressionLvl4 )
            	    // InternalJsonDsl.g:393:7: lv_right_3_0= ruleExpressionLvl4
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl3Access().getRightExpressionLvl4ParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleExpressionLvl4();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl3Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl4");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalJsonDsl.g:412:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) )
            	    {
            	    // InternalJsonDsl.g:412:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) )
            	    // InternalJsonDsl.g:413:5: () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) )
            	    {
            	    // InternalJsonDsl.g:413:5: ()
            	    // InternalJsonDsl.g:414:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl3Access().getInequalityExpressionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLvl3Access().getExclamationMarkEqualsSignKeyword_1_1_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:424:5: ( (lv_right_6_0= ruleExpressionLvl4 ) )
            	    // InternalJsonDsl.g:425:6: (lv_right_6_0= ruleExpressionLvl4 )
            	    {
            	    // InternalJsonDsl.g:425:6: (lv_right_6_0= ruleExpressionLvl4 )
            	    // InternalJsonDsl.g:426:7: lv_right_6_0= ruleExpressionLvl4
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl3Access().getRightExpressionLvl4ParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_right_6_0=ruleExpressionLvl4();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl3Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl4");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalJsonDsl.g:445:4: ( () otherlv_8= '===' ( (lv_right_9_0= ruleExpressionLvl4 ) ) )
            	    {
            	    // InternalJsonDsl.g:445:4: ( () otherlv_8= '===' ( (lv_right_9_0= ruleExpressionLvl4 ) ) )
            	    // InternalJsonDsl.g:446:5: () otherlv_8= '===' ( (lv_right_9_0= ruleExpressionLvl4 ) )
            	    {
            	    // InternalJsonDsl.g:446:5: ()
            	    // InternalJsonDsl.g:447:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl3Access().getStrictEqualityExpressionLeftAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getExpressionLvl3Access().getEqualsSignEqualsSignEqualsSignKeyword_1_2_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:457:5: ( (lv_right_9_0= ruleExpressionLvl4 ) )
            	    // InternalJsonDsl.g:458:6: (lv_right_9_0= ruleExpressionLvl4 )
            	    {
            	    // InternalJsonDsl.g:458:6: (lv_right_9_0= ruleExpressionLvl4 )
            	    // InternalJsonDsl.g:459:7: lv_right_9_0= ruleExpressionLvl4
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl3Access().getRightExpressionLvl4ParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_right_9_0=ruleExpressionLvl4();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl3Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_9_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl4");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalJsonDsl.g:478:4: ( () otherlv_11= '!==' ( (lv_right_12_0= ruleExpressionLvl4 ) ) )
            	    {
            	    // InternalJsonDsl.g:478:4: ( () otherlv_11= '!==' ( (lv_right_12_0= ruleExpressionLvl4 ) ) )
            	    // InternalJsonDsl.g:479:5: () otherlv_11= '!==' ( (lv_right_12_0= ruleExpressionLvl4 ) )
            	    {
            	    // InternalJsonDsl.g:479:5: ()
            	    // InternalJsonDsl.g:480:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl3Access().getStrictInequalityExpressionLeftAction_1_3_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_11=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getExpressionLvl3Access().getExclamationMarkEqualsSignEqualsSignKeyword_1_3_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:490:5: ( (lv_right_12_0= ruleExpressionLvl4 ) )
            	    // InternalJsonDsl.g:491:6: (lv_right_12_0= ruleExpressionLvl4 )
            	    {
            	    // InternalJsonDsl.g:491:6: (lv_right_12_0= ruleExpressionLvl4 )
            	    // InternalJsonDsl.g:492:7: lv_right_12_0= ruleExpressionLvl4
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl3Access().getRightExpressionLvl4ParserRuleCall_1_3_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_right_12_0=ruleExpressionLvl4();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl3Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_12_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl4");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLvl3"


    // $ANTLR start "entryRuleExpressionLvl4"
    // InternalJsonDsl.g:515:1: entryRuleExpressionLvl4 returns [EObject current=null] : iv_ruleExpressionLvl4= ruleExpressionLvl4 EOF ;
    public final EObject entryRuleExpressionLvl4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl4 = null;


        try {
            // InternalJsonDsl.g:515:55: (iv_ruleExpressionLvl4= ruleExpressionLvl4 EOF )
            // InternalJsonDsl.g:516:2: iv_ruleExpressionLvl4= ruleExpressionLvl4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLvl4Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLvl4=ruleExpressionLvl4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLvl4; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLvl4"


    // $ANTLR start "ruleExpressionLvl4"
    // InternalJsonDsl.g:522:1: ruleExpressionLvl4 returns [EObject current=null] : (this_ExpressionLvl5_0= ruleExpressionLvl5 ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) ) )* ) ;
    public final EObject ruleExpressionLvl4() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_ExpressionLvl5_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:528:2: ( (this_ExpressionLvl5_0= ruleExpressionLvl5 ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) ) )* ) )
            // InternalJsonDsl.g:529:2: (this_ExpressionLvl5_0= ruleExpressionLvl5 ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) ) )* )
            {
            // InternalJsonDsl.g:529:2: (this_ExpressionLvl5_0= ruleExpressionLvl5 ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) ) )* )
            // InternalJsonDsl.g:530:3: this_ExpressionLvl5_0= ruleExpressionLvl5 ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLvl4Access().getExpressionLvl5ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            this_ExpressionLvl5_0=ruleExpressionLvl5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLvl5_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalJsonDsl.g:538:3: ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) ) )*
            loop6:
            do {
                int alt6=5;
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
                case 25:
                    {
                    alt6=4;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalJsonDsl.g:539:4: ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) )
            	    {
            	    // InternalJsonDsl.g:539:4: ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) )
            	    // InternalJsonDsl.g:540:5: () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) )
            	    {
            	    // InternalJsonDsl.g:540:5: ()
            	    // InternalJsonDsl.g:541:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl4Access().getSuperiorExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLvl4Access().getGreaterThanSignKeyword_1_0_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:551:5: ( (lv_right_3_0= ruleExpressionLvl5 ) )
            	    // InternalJsonDsl.g:552:6: (lv_right_3_0= ruleExpressionLvl5 )
            	    {
            	    // InternalJsonDsl.g:552:6: (lv_right_3_0= ruleExpressionLvl5 )
            	    // InternalJsonDsl.g:553:7: lv_right_3_0= ruleExpressionLvl5
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl4Access().getRightExpressionLvl5ParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=ruleExpressionLvl5();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl4Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl5");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalJsonDsl.g:572:4: ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) )
            	    {
            	    // InternalJsonDsl.g:572:4: ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) )
            	    // InternalJsonDsl.g:573:5: () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) )
            	    {
            	    // InternalJsonDsl.g:573:5: ()
            	    // InternalJsonDsl.g:574:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl4Access().getSuperiorOrEqualExpressionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLvl4Access().getGreaterThanSignEqualsSignKeyword_1_1_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:584:5: ( (lv_right_6_0= ruleExpressionLvl5 ) )
            	    // InternalJsonDsl.g:585:6: (lv_right_6_0= ruleExpressionLvl5 )
            	    {
            	    // InternalJsonDsl.g:585:6: (lv_right_6_0= ruleExpressionLvl5 )
            	    // InternalJsonDsl.g:586:7: lv_right_6_0= ruleExpressionLvl5
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl4Access().getRightExpressionLvl5ParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_right_6_0=ruleExpressionLvl5();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl4Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl5");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalJsonDsl.g:605:4: ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) )
            	    {
            	    // InternalJsonDsl.g:605:4: ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) )
            	    // InternalJsonDsl.g:606:5: () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) )
            	    {
            	    // InternalJsonDsl.g:606:5: ()
            	    // InternalJsonDsl.g:607:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl4Access().getInferiorExpressionLeftAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getExpressionLvl4Access().getLessThanSignKeyword_1_2_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:617:5: ( (lv_right_9_0= ruleExpressionLvl5 ) )
            	    // InternalJsonDsl.g:618:6: (lv_right_9_0= ruleExpressionLvl5 )
            	    {
            	    // InternalJsonDsl.g:618:6: (lv_right_9_0= ruleExpressionLvl5 )
            	    // InternalJsonDsl.g:619:7: lv_right_9_0= ruleExpressionLvl5
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl4Access().getRightExpressionLvl5ParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_right_9_0=ruleExpressionLvl5();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl4Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_9_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl5");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalJsonDsl.g:638:4: ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) )
            	    {
            	    // InternalJsonDsl.g:638:4: ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) )
            	    // InternalJsonDsl.g:639:5: () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) )
            	    {
            	    // InternalJsonDsl.g:639:5: ()
            	    // InternalJsonDsl.g:640:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl4Access().getInferiorOrEqualExpressionLeftAction_1_3_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_11=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getExpressionLvl4Access().getLessThanSignEqualsSignKeyword_1_3_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:650:5: ( (lv_right_12_0= ruleExpressionLvl5 ) )
            	    // InternalJsonDsl.g:651:6: (lv_right_12_0= ruleExpressionLvl5 )
            	    {
            	    // InternalJsonDsl.g:651:6: (lv_right_12_0= ruleExpressionLvl5 )
            	    // InternalJsonDsl.g:652:7: lv_right_12_0= ruleExpressionLvl5
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl4Access().getRightExpressionLvl5ParserRuleCall_1_3_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_right_12_0=ruleExpressionLvl5();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl4Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_12_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl5");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLvl4"


    // $ANTLR start "entryRuleExpressionLvl5"
    // InternalJsonDsl.g:675:1: entryRuleExpressionLvl5 returns [EObject current=null] : iv_ruleExpressionLvl5= ruleExpressionLvl5 EOF ;
    public final EObject entryRuleExpressionLvl5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl5 = null;


        try {
            // InternalJsonDsl.g:675:55: (iv_ruleExpressionLvl5= ruleExpressionLvl5 EOF )
            // InternalJsonDsl.g:676:2: iv_ruleExpressionLvl5= ruleExpressionLvl5 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLvl5Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLvl5=ruleExpressionLvl5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLvl5; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLvl5"


    // $ANTLR start "ruleExpressionLvl5"
    // InternalJsonDsl.g:682:1: ruleExpressionLvl5 returns [EObject current=null] : (this_ExpressionLvl6_0= ruleExpressionLvl6 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) ) )* ) ;
    public final EObject ruleExpressionLvl5() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLvl6_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:688:2: ( (this_ExpressionLvl6_0= ruleExpressionLvl6 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) ) )* ) )
            // InternalJsonDsl.g:689:2: (this_ExpressionLvl6_0= ruleExpressionLvl6 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) ) )* )
            {
            // InternalJsonDsl.g:689:2: (this_ExpressionLvl6_0= ruleExpressionLvl6 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) ) )* )
            // InternalJsonDsl.g:690:3: this_ExpressionLvl6_0= ruleExpressionLvl6 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLvl5Access().getExpressionLvl6ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_11);
            this_ExpressionLvl6_0=ruleExpressionLvl6();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLvl6_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalJsonDsl.g:698:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }
                else if ( (LA7_0==27) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJsonDsl.g:699:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) )
            	    {
            	    // InternalJsonDsl.g:699:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) )
            	    // InternalJsonDsl.g:700:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) )
            	    {
            	    // InternalJsonDsl.g:700:5: ()
            	    // InternalJsonDsl.g:701:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl5Access().getAdditionExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLvl5Access().getPlusSignKeyword_1_0_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:711:5: ( (lv_right_3_0= ruleExpressionLvl6 ) )
            	    // InternalJsonDsl.g:712:6: (lv_right_3_0= ruleExpressionLvl6 )
            	    {
            	    // InternalJsonDsl.g:712:6: (lv_right_3_0= ruleExpressionLvl6 )
            	    // InternalJsonDsl.g:713:7: lv_right_3_0= ruleExpressionLvl6
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl5Access().getRightExpressionLvl6ParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleExpressionLvl6();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl5Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl6");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalJsonDsl.g:732:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) )
            	    {
            	    // InternalJsonDsl.g:732:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) )
            	    // InternalJsonDsl.g:733:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) )
            	    {
            	    // InternalJsonDsl.g:733:5: ()
            	    // InternalJsonDsl.g:734:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl5Access().getSubstractionExpressionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLvl5Access().getHyphenMinusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:744:5: ( (lv_right_6_0= ruleExpressionLvl6 ) )
            	    // InternalJsonDsl.g:745:6: (lv_right_6_0= ruleExpressionLvl6 )
            	    {
            	    // InternalJsonDsl.g:745:6: (lv_right_6_0= ruleExpressionLvl6 )
            	    // InternalJsonDsl.g:746:7: lv_right_6_0= ruleExpressionLvl6
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl5Access().getRightExpressionLvl6ParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_right_6_0=ruleExpressionLvl6();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl5Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl6");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLvl5"


    // $ANTLR start "entryRuleExpressionLvl6"
    // InternalJsonDsl.g:769:1: entryRuleExpressionLvl6 returns [EObject current=null] : iv_ruleExpressionLvl6= ruleExpressionLvl6 EOF ;
    public final EObject entryRuleExpressionLvl6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl6 = null;


        try {
            // InternalJsonDsl.g:769:55: (iv_ruleExpressionLvl6= ruleExpressionLvl6 EOF )
            // InternalJsonDsl.g:770:2: iv_ruleExpressionLvl6= ruleExpressionLvl6 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLvl6Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLvl6=ruleExpressionLvl6();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLvl6; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLvl6"


    // $ANTLR start "ruleExpressionLvl6"
    // InternalJsonDsl.g:776:1: ruleExpressionLvl6 returns [EObject current=null] : (this_ExpressionLvl7_0= ruleExpressionLvl7 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) ) )* ) ;
    public final EObject ruleExpressionLvl6() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_ExpressionLvl7_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:782:2: ( (this_ExpressionLvl7_0= ruleExpressionLvl7 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) ) )* ) )
            // InternalJsonDsl.g:783:2: (this_ExpressionLvl7_0= ruleExpressionLvl7 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) ) )* )
            {
            // InternalJsonDsl.g:783:2: (this_ExpressionLvl7_0= ruleExpressionLvl7 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) ) )* )
            // InternalJsonDsl.g:784:3: this_ExpressionLvl7_0= ruleExpressionLvl7 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLvl6Access().getExpressionLvl7ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_ExpressionLvl7_0=ruleExpressionLvl7();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLvl7_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalJsonDsl.g:792:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    alt8=1;
                    }
                    break;
                case 29:
                    {
                    alt8=2;
                    }
                    break;
                case 30:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalJsonDsl.g:793:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) )
            	    {
            	    // InternalJsonDsl.g:793:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) )
            	    // InternalJsonDsl.g:794:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) )
            	    {
            	    // InternalJsonDsl.g:794:5: ()
            	    // InternalJsonDsl.g:795:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl6Access().getMultiplicationExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLvl6Access().getAsteriskKeyword_1_0_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:805:5: ( (lv_right_3_0= ruleExpressionLvl7 ) )
            	    // InternalJsonDsl.g:806:6: (lv_right_3_0= ruleExpressionLvl7 )
            	    {
            	    // InternalJsonDsl.g:806:6: (lv_right_3_0= ruleExpressionLvl7 )
            	    // InternalJsonDsl.g:807:7: lv_right_3_0= ruleExpressionLvl7
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl6Access().getRightExpressionLvl7ParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=ruleExpressionLvl7();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl6Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl7");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalJsonDsl.g:826:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) )
            	    {
            	    // InternalJsonDsl.g:826:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) )
            	    // InternalJsonDsl.g:827:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) )
            	    {
            	    // InternalJsonDsl.g:827:5: ()
            	    // InternalJsonDsl.g:828:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl6Access().getDivisionExpressionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,29,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLvl6Access().getSolidusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:838:5: ( (lv_right_6_0= ruleExpressionLvl7 ) )
            	    // InternalJsonDsl.g:839:6: (lv_right_6_0= ruleExpressionLvl7 )
            	    {
            	    // InternalJsonDsl.g:839:6: (lv_right_6_0= ruleExpressionLvl7 )
            	    // InternalJsonDsl.g:840:7: lv_right_6_0= ruleExpressionLvl7
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl6Access().getRightExpressionLvl7ParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_right_6_0=ruleExpressionLvl7();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl6Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl7");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalJsonDsl.g:859:4: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) )
            	    {
            	    // InternalJsonDsl.g:859:4: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) )
            	    // InternalJsonDsl.g:860:5: () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) )
            	    {
            	    // InternalJsonDsl.g:860:5: ()
            	    // InternalJsonDsl.g:861:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl6Access().getModuloExpressionLeftAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getExpressionLvl6Access().getPercentSignKeyword_1_2_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:871:5: ( (lv_right_9_0= ruleExpressionLvl7 ) )
            	    // InternalJsonDsl.g:872:6: (lv_right_9_0= ruleExpressionLvl7 )
            	    {
            	    // InternalJsonDsl.g:872:6: (lv_right_9_0= ruleExpressionLvl7 )
            	    // InternalJsonDsl.g:873:7: lv_right_9_0= ruleExpressionLvl7
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl6Access().getRightExpressionLvl7ParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_right_9_0=ruleExpressionLvl7();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl6Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_9_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ExpressionLvl7");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLvl6"


    // $ANTLR start "entryRuleExpressionLvl7"
    // InternalJsonDsl.g:896:1: entryRuleExpressionLvl7 returns [EObject current=null] : iv_ruleExpressionLvl7= ruleExpressionLvl7 EOF ;
    public final EObject entryRuleExpressionLvl7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl7 = null;


        try {
            // InternalJsonDsl.g:896:55: (iv_ruleExpressionLvl7= ruleExpressionLvl7 EOF )
            // InternalJsonDsl.g:897:2: iv_ruleExpressionLvl7= ruleExpressionLvl7 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLvl7Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLvl7=ruleExpressionLvl7();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLvl7; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLvl7"


    // $ANTLR start "ruleExpressionLvl7"
    // InternalJsonDsl.g:903:1: ruleExpressionLvl7 returns [EObject current=null] : (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_UnaryPlusExpression_1= ruleUnaryPlusExpression | this_ExpressionLvl8_2= ruleExpressionLvl8 ) ;
    public final EObject ruleExpressionLvl7() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryMinusExpression_0 = null;

        EObject this_UnaryPlusExpression_1 = null;

        EObject this_ExpressionLvl8_2 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:909:2: ( (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_UnaryPlusExpression_1= ruleUnaryPlusExpression | this_ExpressionLvl8_2= ruleExpressionLvl8 ) )
            // InternalJsonDsl.g:910:2: (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_UnaryPlusExpression_1= ruleUnaryPlusExpression | this_ExpressionLvl8_2= ruleExpressionLvl8 )
            {
            // InternalJsonDsl.g:910:2: (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_UnaryPlusExpression_1= ruleUnaryPlusExpression | this_ExpressionLvl8_2= ruleExpressionLvl8 )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_BOOL:
            case RULE_NULL:
            case 31:
            case 32:
            case 35:
            case 37:
            case 39:
            case 40:
            case 42:
            case 44:
            case 45:
            case 46:
            case 48:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalJsonDsl.g:911:3: this_UnaryMinusExpression_0= ruleUnaryMinusExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLvl7Access().getUnaryMinusExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryMinusExpression_0=ruleUnaryMinusExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryMinusExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:920:3: this_UnaryPlusExpression_1= ruleUnaryPlusExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLvl7Access().getUnaryPlusExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryPlusExpression_1=ruleUnaryPlusExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryPlusExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:929:3: this_ExpressionLvl8_2= ruleExpressionLvl8
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLvl7Access().getExpressionLvl8ParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionLvl8_2=ruleExpressionLvl8();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionLvl8_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLvl7"


    // $ANTLR start "entryRuleUnaryMinusExpression"
    // InternalJsonDsl.g:941:1: entryRuleUnaryMinusExpression returns [EObject current=null] : iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF ;
    public final EObject entryRuleUnaryMinusExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryMinusExpression = null;


        try {
            // InternalJsonDsl.g:941:61: (iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF )
            // InternalJsonDsl.g:942:2: iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryMinusExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryMinusExpression=ruleUnaryMinusExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryMinusExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryMinusExpression"


    // $ANTLR start "ruleUnaryMinusExpression"
    // InternalJsonDsl.g:948:1: ruleUnaryMinusExpression returns [EObject current=null] : (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) ) ;
    public final EObject ruleUnaryMinusExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:954:2: ( (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) ) )
            // InternalJsonDsl.g:955:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) )
            {
            // InternalJsonDsl.g:955:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) )
            // InternalJsonDsl.g:956:3: otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLvl7 ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnaryMinusExpressionAccess().getHyphenMinusKeyword_0());
              		
            }
            // InternalJsonDsl.g:960:3: ( (lv_sub_1_0= ruleExpressionLvl7 ) )
            // InternalJsonDsl.g:961:4: (lv_sub_1_0= ruleExpressionLvl7 )
            {
            // InternalJsonDsl.g:961:4: (lv_sub_1_0= ruleExpressionLvl7 )
            // InternalJsonDsl.g:962:5: lv_sub_1_0= ruleExpressionLvl7
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryMinusExpressionAccess().getSubExpressionLvl7ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLvl7();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnaryMinusExpressionRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"org.xtext.example.mydsl.JsonDsl.ExpressionLvl7");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnaryMinusExpression"


    // $ANTLR start "entryRuleUnaryPlusExpression"
    // InternalJsonDsl.g:983:1: entryRuleUnaryPlusExpression returns [EObject current=null] : iv_ruleUnaryPlusExpression= ruleUnaryPlusExpression EOF ;
    public final EObject entryRuleUnaryPlusExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPlusExpression = null;


        try {
            // InternalJsonDsl.g:983:60: (iv_ruleUnaryPlusExpression= ruleUnaryPlusExpression EOF )
            // InternalJsonDsl.g:984:2: iv_ruleUnaryPlusExpression= ruleUnaryPlusExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryPlusExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryPlusExpression=ruleUnaryPlusExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryPlusExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryPlusExpression"


    // $ANTLR start "ruleUnaryPlusExpression"
    // InternalJsonDsl.g:990:1: ruleUnaryPlusExpression returns [EObject current=null] : (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) ) ;
    public final EObject ruleUnaryPlusExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:996:2: ( (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) ) )
            // InternalJsonDsl.g:997:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) )
            {
            // InternalJsonDsl.g:997:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) )
            // InternalJsonDsl.g:998:3: otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLvl7 ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnaryPlusExpressionAccess().getPlusSignKeyword_0());
              		
            }
            // InternalJsonDsl.g:1002:3: ( (lv_sub_1_0= ruleExpressionLvl7 ) )
            // InternalJsonDsl.g:1003:4: (lv_sub_1_0= ruleExpressionLvl7 )
            {
            // InternalJsonDsl.g:1003:4: (lv_sub_1_0= ruleExpressionLvl7 )
            // InternalJsonDsl.g:1004:5: lv_sub_1_0= ruleExpressionLvl7
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryPlusExpressionAccess().getSubExpressionLvl7ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLvl7();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnaryPlusExpressionRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"org.xtext.example.mydsl.JsonDsl.ExpressionLvl7");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnaryPlusExpression"


    // $ANTLR start "entryRuleExpressionLvl8"
    // InternalJsonDsl.g:1025:1: entryRuleExpressionLvl8 returns [EObject current=null] : iv_ruleExpressionLvl8= ruleExpressionLvl8 EOF ;
    public final EObject entryRuleExpressionLvl8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl8 = null;


        try {
            // InternalJsonDsl.g:1025:55: (iv_ruleExpressionLvl8= ruleExpressionLvl8 EOF )
            // InternalJsonDsl.g:1026:2: iv_ruleExpressionLvl8= ruleExpressionLvl8 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLvl8Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLvl8=ruleExpressionLvl8();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLvl8; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLvl8"


    // $ANTLR start "ruleExpressionLvl8"
    // InternalJsonDsl.g:1032:1: ruleExpressionLvl8 returns [EObject current=null] : (this_LogicalNegationExpression_0= ruleLogicalNegationExpression | this_ExpressionLvl9_1= ruleExpressionLvl9 ) ;
    public final EObject ruleExpressionLvl8() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalNegationExpression_0 = null;

        EObject this_ExpressionLvl9_1 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1038:2: ( (this_LogicalNegationExpression_0= ruleLogicalNegationExpression | this_ExpressionLvl9_1= ruleExpressionLvl9 ) )
            // InternalJsonDsl.g:1039:2: (this_LogicalNegationExpression_0= ruleLogicalNegationExpression | this_ExpressionLvl9_1= ruleExpressionLvl9 )
            {
            // InternalJsonDsl.g:1039:2: (this_LogicalNegationExpression_0= ruleLogicalNegationExpression | this_ExpressionLvl9_1= ruleExpressionLvl9 )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_NULL)||LA10_0==32||LA10_0==35||LA10_0==37||(LA10_0>=39 && LA10_0<=40)||LA10_0==42||(LA10_0>=44 && LA10_0<=46)||LA10_0==48||(LA10_0>=51 && LA10_0<=53)||(LA10_0>=55 && LA10_0<=57)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalJsonDsl.g:1040:3: this_LogicalNegationExpression_0= ruleLogicalNegationExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLvl8Access().getLogicalNegationExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LogicalNegationExpression_0=ruleLogicalNegationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LogicalNegationExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1049:3: this_ExpressionLvl9_1= ruleExpressionLvl9
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLvl8Access().getExpressionLvl9ParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionLvl9_1=ruleExpressionLvl9();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionLvl9_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLvl8"


    // $ANTLR start "entryRuleLogicalNegationExpression"
    // InternalJsonDsl.g:1061:1: entryRuleLogicalNegationExpression returns [EObject current=null] : iv_ruleLogicalNegationExpression= ruleLogicalNegationExpression EOF ;
    public final EObject entryRuleLogicalNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNegationExpression = null;


        try {
            // InternalJsonDsl.g:1061:66: (iv_ruleLogicalNegationExpression= ruleLogicalNegationExpression EOF )
            // InternalJsonDsl.g:1062:2: iv_ruleLogicalNegationExpression= ruleLogicalNegationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNegationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalNegationExpression=ruleLogicalNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNegationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalNegationExpression"


    // $ANTLR start "ruleLogicalNegationExpression"
    // InternalJsonDsl.g:1068:1: ruleLogicalNegationExpression returns [EObject current=null] : (otherlv_0= '!' ( (lv_sub_1_0= ruleExpressionLvl8 ) ) ) ;
    public final EObject ruleLogicalNegationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1074:2: ( (otherlv_0= '!' ( (lv_sub_1_0= ruleExpressionLvl8 ) ) ) )
            // InternalJsonDsl.g:1075:2: (otherlv_0= '!' ( (lv_sub_1_0= ruleExpressionLvl8 ) ) )
            {
            // InternalJsonDsl.g:1075:2: (otherlv_0= '!' ( (lv_sub_1_0= ruleExpressionLvl8 ) ) )
            // InternalJsonDsl.g:1076:3: otherlv_0= '!' ( (lv_sub_1_0= ruleExpressionLvl8 ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLogicalNegationExpressionAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalJsonDsl.g:1080:3: ( (lv_sub_1_0= ruleExpressionLvl8 ) )
            // InternalJsonDsl.g:1081:4: (lv_sub_1_0= ruleExpressionLvl8 )
            {
            // InternalJsonDsl.g:1081:4: (lv_sub_1_0= ruleExpressionLvl8 )
            // InternalJsonDsl.g:1082:5: lv_sub_1_0= ruleExpressionLvl8
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLogicalNegationExpressionAccess().getSubExpressionLvl8ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLvl8();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLogicalNegationExpressionRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"org.xtext.example.mydsl.JsonDsl.ExpressionLvl8");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalNegationExpression"


    // $ANTLR start "entryRuleExpressionLvl9"
    // InternalJsonDsl.g:1103:1: entryRuleExpressionLvl9 returns [EObject current=null] : iv_ruleExpressionLvl9= ruleExpressionLvl9 EOF ;
    public final EObject entryRuleExpressionLvl9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl9 = null;


        try {
            // InternalJsonDsl.g:1103:55: (iv_ruleExpressionLvl9= ruleExpressionLvl9 EOF )
            // InternalJsonDsl.g:1104:2: iv_ruleExpressionLvl9= ruleExpressionLvl9 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLvl9Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLvl9=ruleExpressionLvl9();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLvl9; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLvl9"


    // $ANTLR start "ruleExpressionLvl9"
    // InternalJsonDsl.g:1110:1: ruleExpressionLvl9 returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' ) | ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) ) )* ) ;
    public final EObject ruleExpressionLvl9() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_field_7_0=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_specifier_3_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1116:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' ) | ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) ) )* ) )
            // InternalJsonDsl.g:1117:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' ) | ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) ) )* )
            {
            // InternalJsonDsl.g:1117:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' ) | ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) ) )* )
            // InternalJsonDsl.g:1118:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' ) | ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLvl9Access().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalJsonDsl.g:1126:3: ( ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' ) | ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }
                else if ( (LA11_0==34) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJsonDsl.g:1127:4: ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' )
            	    {
            	    // InternalJsonDsl.g:1127:4: ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' )
            	    // InternalJsonDsl.g:1128:5: () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']'
            	    {
            	    // InternalJsonDsl.g:1128:5: ()
            	    // InternalJsonDsl.g:1129:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl9Access().getArrayCallCalleeAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLvl9Access().getLeftSquareBracketKeyword_1_0_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:1139:5: ( (lv_specifier_3_0= ruleArraySpecifier ) )
            	    // InternalJsonDsl.g:1140:6: (lv_specifier_3_0= ruleArraySpecifier )
            	    {
            	    // InternalJsonDsl.g:1140:6: (lv_specifier_3_0= ruleArraySpecifier )
            	    // InternalJsonDsl.g:1141:7: lv_specifier_3_0= ruleArraySpecifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLvl9Access().getSpecifierArraySpecifierParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_specifier_3_0=ruleArraySpecifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLvl9Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"specifier",
            	      								lv_specifier_3_0,
            	      								"org.xtext.example.mydsl.JsonDsl.ArraySpecifier");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getExpressionLvl9Access().getRightSquareBracketKeyword_1_0_3());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalJsonDsl.g:1164:4: ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) )
            	    {
            	    // InternalJsonDsl.g:1164:4: ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) )
            	    // InternalJsonDsl.g:1165:5: () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) )
            	    {
            	    // InternalJsonDsl.g:1165:5: ()
            	    // InternalJsonDsl.g:1166:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl9Access().getFieldCallCalleeAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_6=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getExpressionLvl9Access().getTildeKeyword_1_1_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:1176:5: ( (lv_field_7_0= RULE_STRING ) )
            	    // InternalJsonDsl.g:1177:6: (lv_field_7_0= RULE_STRING )
            	    {
            	    // InternalJsonDsl.g:1177:6: (lv_field_7_0= RULE_STRING )
            	    // InternalJsonDsl.g:1178:7: lv_field_7_0= RULE_STRING
            	    {
            	    lv_field_7_0=(Token)match(input,RULE_STRING,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_field_7_0, grammarAccess.getExpressionLvl9Access().getFieldSTRINGTerminalRuleCall_1_1_2_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getExpressionLvl9Rule());
            	      							}
            	      							setWithLastConsumed(
            	      								current,
            	      								"field",
            	      								lv_field_7_0,
            	      								"org.eclipse.xtext.common.Terminals.STRING");
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLvl9"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalJsonDsl.g:1200:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalJsonDsl.g:1200:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalJsonDsl.g:1201:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalJsonDsl.g:1207:1: rulePrimaryExpression returns [EObject current=null] : (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | this_BracketExpression_3= ruleBracketExpression | this_PointerCall_4= rulePointerCall ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_VariableCall_0 = null;

        EObject this_Constant_1 = null;

        EObject this_FunctionCall_2 = null;

        EObject this_BracketExpression_3 = null;

        EObject this_PointerCall_4 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1213:2: ( (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | this_BracketExpression_3= ruleBracketExpression | this_PointerCall_4= rulePointerCall ) )
            // InternalJsonDsl.g:1214:2: (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | this_BracketExpression_3= ruleBracketExpression | this_PointerCall_4= rulePointerCall )
            {
            // InternalJsonDsl.g:1214:2: (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | this_BracketExpression_3= ruleBracketExpression | this_PointerCall_4= rulePointerCall )
            int alt12=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_BOOL:
            case RULE_NULL:
            case 32:
            case 57:
                {
                alt12=2;
                }
                break;
            case 39:
            case 40:
            case 42:
            case 44:
            case 45:
            case 46:
            case 48:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
                {
                alt12=3;
                }
                break;
            case 35:
                {
                alt12=4;
                }
                break;
            case 37:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalJsonDsl.g:1215:3: this_VariableCall_0= ruleVariableCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableCallParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableCall_0=ruleVariableCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableCall_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1224:3: this_Constant_1= ruleConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Constant_1=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Constant_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:1233:3: this_FunctionCall_2= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_2=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCall_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalJsonDsl.g:1242:3: this_BracketExpression_3= ruleBracketExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBracketExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BracketExpression_3=ruleBracketExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BracketExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalJsonDsl.g:1251:3: this_PointerCall_4= rulePointerCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPointerCallParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PointerCall_4=rulePointerCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PointerCall_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleBracketExpression"
    // InternalJsonDsl.g:1263:1: entryRuleBracketExpression returns [EObject current=null] : iv_ruleBracketExpression= ruleBracketExpression EOF ;
    public final EObject entryRuleBracketExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracketExpression = null;


        try {
            // InternalJsonDsl.g:1263:58: (iv_ruleBracketExpression= ruleBracketExpression EOF )
            // InternalJsonDsl.g:1264:2: iv_ruleBracketExpression= ruleBracketExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBracketExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBracketExpression=ruleBracketExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBracketExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBracketExpression"


    // $ANTLR start "ruleBracketExpression"
    // InternalJsonDsl.g:1270:1: ruleBracketExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracketExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1276:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalJsonDsl.g:1277:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalJsonDsl.g:1277:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalJsonDsl.g:1278:3: otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBracketExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalJsonDsl.g:1282:3: ( (lv_sub_1_0= ruleExpression ) )
            // InternalJsonDsl.g:1283:4: (lv_sub_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:1283:4: (lv_sub_1_0= ruleExpression )
            // InternalJsonDsl.g:1284:5: lv_sub_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBracketExpressionAccess().getSubExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_sub_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBracketExpressionRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBracketExpressionAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBracketExpression"


    // $ANTLR start "entryRulePointerCall"
    // InternalJsonDsl.g:1309:1: entryRulePointerCall returns [EObject current=null] : iv_rulePointerCall= rulePointerCall EOF ;
    public final EObject entryRulePointerCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerCall = null;


        try {
            // InternalJsonDsl.g:1309:52: (iv_rulePointerCall= rulePointerCall EOF )
            // InternalJsonDsl.g:1310:2: iv_rulePointerCall= rulePointerCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointerCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePointerCall=rulePointerCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointerCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePointerCall"


    // $ANTLR start "rulePointerCall"
    // InternalJsonDsl.g:1316:1: rulePointerCall returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject rulePointerCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1322:2: ( ( () otherlv_1= '.' ) )
            // InternalJsonDsl.g:1323:2: ( () otherlv_1= '.' )
            {
            // InternalJsonDsl.g:1323:2: ( () otherlv_1= '.' )
            // InternalJsonDsl.g:1324:3: () otherlv_1= '.'
            {
            // InternalJsonDsl.g:1324:3: ()
            // InternalJsonDsl.g:1325:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPointerCallAccess().getPointerCallAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPointerCallAccess().getFullStopKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePointerCall"


    // $ANTLR start "entryRuleVariableCall"
    // InternalJsonDsl.g:1339:1: entryRuleVariableCall returns [EObject current=null] : iv_ruleVariableCall= ruleVariableCall EOF ;
    public final EObject entryRuleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCall = null;


        try {
            // InternalJsonDsl.g:1339:53: (iv_ruleVariableCall= ruleVariableCall EOF )
            // InternalJsonDsl.g:1340:2: iv_ruleVariableCall= ruleVariableCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableCall=ruleVariableCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableCall"


    // $ANTLR start "ruleVariableCall"
    // InternalJsonDsl.g:1346:1: ruleVariableCall returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1352:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalJsonDsl.g:1353:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalJsonDsl.g:1353:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalJsonDsl.g:1354:3: (lv_name_0_0= RULE_ID )
            {
            // InternalJsonDsl.g:1354:3: (lv_name_0_0= RULE_ID )
            // InternalJsonDsl.g:1355:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getVariableCallAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVariableCallRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariableCall"


    // $ANTLR start "entryRuleArraySpecifier"
    // InternalJsonDsl.g:1374:1: entryRuleArraySpecifier returns [EObject current=null] : iv_ruleArraySpecifier= ruleArraySpecifier EOF ;
    public final EObject entryRuleArraySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecifier = null;


        try {
            // InternalJsonDsl.g:1374:55: (iv_ruleArraySpecifier= ruleArraySpecifier EOF )
            // InternalJsonDsl.g:1375:2: iv_ruleArraySpecifier= ruleArraySpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySpecifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArraySpecifier=ruleArraySpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySpecifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArraySpecifier"


    // $ANTLR start "ruleArraySpecifier"
    // InternalJsonDsl.g:1381:1: ruleArraySpecifier returns [EObject current=null] : (this_UnarySpecifier_0= ruleUnarySpecifier | this_RangeSpecifier_1= ruleRangeSpecifier ) ;
    public final EObject ruleArraySpecifier() throws RecognitionException {
        EObject current = null;

        EObject this_UnarySpecifier_0 = null;

        EObject this_RangeSpecifier_1 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1387:2: ( (this_UnarySpecifier_0= ruleUnarySpecifier | this_RangeSpecifier_1= ruleRangeSpecifier ) )
            // InternalJsonDsl.g:1388:2: (this_UnarySpecifier_0= ruleUnarySpecifier | this_RangeSpecifier_1= ruleRangeSpecifier )
            {
            // InternalJsonDsl.g:1388:2: (this_UnarySpecifier_0= ruleUnarySpecifier | this_RangeSpecifier_1= ruleRangeSpecifier )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==38) ) {
                    alt13=2;
                }
                else if ( (LA13_1==EOF||LA13_1==33) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalJsonDsl.g:1389:3: this_UnarySpecifier_0= ruleUnarySpecifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArraySpecifierAccess().getUnarySpecifierParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnarySpecifier_0=ruleUnarySpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnarySpecifier_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1398:3: this_RangeSpecifier_1= ruleRangeSpecifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArraySpecifierAccess().getRangeSpecifierParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RangeSpecifier_1=ruleRangeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RangeSpecifier_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArraySpecifier"


    // $ANTLR start "entryRuleUnarySpecifier"
    // InternalJsonDsl.g:1410:1: entryRuleUnarySpecifier returns [EObject current=null] : iv_ruleUnarySpecifier= ruleUnarySpecifier EOF ;
    public final EObject entryRuleUnarySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnarySpecifier = null;


        try {
            // InternalJsonDsl.g:1410:55: (iv_ruleUnarySpecifier= ruleUnarySpecifier EOF )
            // InternalJsonDsl.g:1411:2: iv_ruleUnarySpecifier= ruleUnarySpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnarySpecifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnarySpecifier=ruleUnarySpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnarySpecifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnarySpecifier"


    // $ANTLR start "ruleUnarySpecifier"
    // InternalJsonDsl.g:1417:1: ruleUnarySpecifier returns [EObject current=null] : ( (lv_index_0_0= RULE_INT ) ) ;
    public final EObject ruleUnarySpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_index_0_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1423:2: ( ( (lv_index_0_0= RULE_INT ) ) )
            // InternalJsonDsl.g:1424:2: ( (lv_index_0_0= RULE_INT ) )
            {
            // InternalJsonDsl.g:1424:2: ( (lv_index_0_0= RULE_INT ) )
            // InternalJsonDsl.g:1425:3: (lv_index_0_0= RULE_INT )
            {
            // InternalJsonDsl.g:1425:3: (lv_index_0_0= RULE_INT )
            // InternalJsonDsl.g:1426:4: lv_index_0_0= RULE_INT
            {
            lv_index_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_index_0_0, grammarAccess.getUnarySpecifierAccess().getIndexINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getUnarySpecifierRule());
              				}
              				setWithLastConsumed(
              					current,
              					"index",
              					lv_index_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnarySpecifier"


    // $ANTLR start "entryRuleRangeSpecifier"
    // InternalJsonDsl.g:1445:1: entryRuleRangeSpecifier returns [EObject current=null] : iv_ruleRangeSpecifier= ruleRangeSpecifier EOF ;
    public final EObject entryRuleRangeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeSpecifier = null;


        try {
            // InternalJsonDsl.g:1445:55: (iv_ruleRangeSpecifier= ruleRangeSpecifier EOF )
            // InternalJsonDsl.g:1446:2: iv_ruleRangeSpecifier= ruleRangeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeSpecifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRangeSpecifier=ruleRangeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeSpecifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRangeSpecifier"


    // $ANTLR start "ruleRangeSpecifier"
    // InternalJsonDsl.g:1452:1: ruleRangeSpecifier returns [EObject current=null] : ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_to_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRangeSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_to_2_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1458:2: ( ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_to_2_0= RULE_INT ) ) ) )
            // InternalJsonDsl.g:1459:2: ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_to_2_0= RULE_INT ) ) )
            {
            // InternalJsonDsl.g:1459:2: ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_to_2_0= RULE_INT ) ) )
            // InternalJsonDsl.g:1460:3: ( (lv_from_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_to_2_0= RULE_INT ) )
            {
            // InternalJsonDsl.g:1460:3: ( (lv_from_0_0= RULE_INT ) )
            // InternalJsonDsl.g:1461:4: (lv_from_0_0= RULE_INT )
            {
            // InternalJsonDsl.g:1461:4: (lv_from_0_0= RULE_INT )
            // InternalJsonDsl.g:1462:5: lv_from_0_0= RULE_INT
            {
            lv_from_0_0=(Token)match(input,RULE_INT,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_from_0_0, grammarAccess.getRangeSpecifierAccess().getFromINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRangeSpecifierRule());
              					}
              					setWithLastConsumed(
              						current,
              						"from",
              						lv_from_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRangeSpecifierAccess().getColonKeyword_1());
              		
            }
            // InternalJsonDsl.g:1482:3: ( (lv_to_2_0= RULE_INT ) )
            // InternalJsonDsl.g:1483:4: (lv_to_2_0= RULE_INT )
            {
            // InternalJsonDsl.g:1483:4: (lv_to_2_0= RULE_INT )
            // InternalJsonDsl.g:1484:5: lv_to_2_0= RULE_INT
            {
            lv_to_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_to_2_0, grammarAccess.getRangeSpecifierAccess().getToINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRangeSpecifierRule());
              					}
              					setWithLastConsumed(
              						current,
              						"to",
              						lv_to_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRangeSpecifier"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalJsonDsl.g:1504:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalJsonDsl.g:1504:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalJsonDsl.g:1505:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalJsonDsl.g:1511:1: ruleFunctionCall returns [EObject current=null] : (this_IOFunctions_0= ruleIOFunctions | this_InfoFunctions_1= ruleInfoFunctions | this_ManipFunctions_2= ruleManipFunctions | this_ArithFunctions_3= ruleArithFunctions | this_AlterFunctions_4= ruleAlterFunctions ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject this_IOFunctions_0 = null;

        EObject this_InfoFunctions_1 = null;

        EObject this_ManipFunctions_2 = null;

        EObject this_ArithFunctions_3 = null;

        EObject this_AlterFunctions_4 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1517:2: ( (this_IOFunctions_0= ruleIOFunctions | this_InfoFunctions_1= ruleInfoFunctions | this_ManipFunctions_2= ruleManipFunctions | this_ArithFunctions_3= ruleArithFunctions | this_AlterFunctions_4= ruleAlterFunctions ) )
            // InternalJsonDsl.g:1518:2: (this_IOFunctions_0= ruleIOFunctions | this_InfoFunctions_1= ruleInfoFunctions | this_ManipFunctions_2= ruleManipFunctions | this_ArithFunctions_3= ruleArithFunctions | this_AlterFunctions_4= ruleAlterFunctions )
            {
            // InternalJsonDsl.g:1518:2: (this_IOFunctions_0= ruleIOFunctions | this_InfoFunctions_1= ruleInfoFunctions | this_ManipFunctions_2= ruleManipFunctions | this_ArithFunctions_3= ruleArithFunctions | this_AlterFunctions_4= ruleAlterFunctions )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
            case 42:
                {
                alt14=1;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 52:
                {
                alt14=2;
                }
                break;
            case 48:
            case 51:
                {
                alt14=3;
                }
                break;
            case 53:
            case 55:
                {
                alt14=4;
                }
                break;
            case 56:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalJsonDsl.g:1519:3: this_IOFunctions_0= ruleIOFunctions
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionCallAccess().getIOFunctionsParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IOFunctions_0=ruleIOFunctions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IOFunctions_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1528:3: this_InfoFunctions_1= ruleInfoFunctions
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionCallAccess().getInfoFunctionsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InfoFunctions_1=ruleInfoFunctions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InfoFunctions_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:1537:3: this_ManipFunctions_2= ruleManipFunctions
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionCallAccess().getManipFunctionsParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ManipFunctions_2=ruleManipFunctions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ManipFunctions_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalJsonDsl.g:1546:3: this_ArithFunctions_3= ruleArithFunctions
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionCallAccess().getArithFunctionsParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArithFunctions_3=ruleArithFunctions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArithFunctions_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalJsonDsl.g:1555:3: this_AlterFunctions_4= ruleAlterFunctions
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionCallAccess().getAlterFunctionsParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AlterFunctions_4=ruleAlterFunctions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AlterFunctions_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleIOFunctions"
    // InternalJsonDsl.g:1567:1: entryRuleIOFunctions returns [EObject current=null] : iv_ruleIOFunctions= ruleIOFunctions EOF ;
    public final EObject entryRuleIOFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOFunctions = null;


        try {
            // InternalJsonDsl.g:1567:52: (iv_ruleIOFunctions= ruleIOFunctions EOF )
            // InternalJsonDsl.g:1568:2: iv_ruleIOFunctions= ruleIOFunctions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIOFunctionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIOFunctions=ruleIOFunctions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIOFunctions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIOFunctions"


    // $ANTLR start "ruleIOFunctions"
    // InternalJsonDsl.g:1574:1: ruleIOFunctions returns [EObject current=null] : (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport ) ;
    public final EObject ruleIOFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Load_0 = null;

        EObject this_Store_1 = null;

        EObject this_Export_2 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1580:2: ( (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport ) )
            // InternalJsonDsl.g:1581:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport )
            {
            // InternalJsonDsl.g:1581:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt15=1;
                }
                break;
            case 40:
                {
                alt15=2;
                }
                break;
            case 42:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalJsonDsl.g:1582:3: this_Load_0= ruleLoad
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIOFunctionsAccess().getLoadParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Load_0=ruleLoad();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Load_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1591:3: this_Store_1= ruleStore
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIOFunctionsAccess().getStoreParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Store_1=ruleStore();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Store_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:1600:3: this_Export_2= ruleExport
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIOFunctionsAccess().getExportParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Export_2=ruleExport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Export_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIOFunctions"


    // $ANTLR start "entryRuleInfoFunctions"
    // InternalJsonDsl.g:1612:1: entryRuleInfoFunctions returns [EObject current=null] : iv_ruleInfoFunctions= ruleInfoFunctions EOF ;
    public final EObject entryRuleInfoFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoFunctions = null;


        try {
            // InternalJsonDsl.g:1612:54: (iv_ruleInfoFunctions= ruleInfoFunctions EOF )
            // InternalJsonDsl.g:1613:2: iv_ruleInfoFunctions= ruleInfoFunctions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfoFunctionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInfoFunctions=ruleInfoFunctions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfoFunctions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInfoFunctions"


    // $ANTLR start "ruleInfoFunctions"
    // InternalJsonDsl.g:1619:1: ruleInfoFunctions returns [EObject current=null] : (this_Depth_0= ruleDepth | this_FieldInfo_1= ruleFieldInfo | this_Contains_2= ruleContains | this_Length_3= ruleLength ) ;
    public final EObject ruleInfoFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Depth_0 = null;

        EObject this_FieldInfo_1 = null;

        EObject this_Contains_2 = null;

        EObject this_Length_3 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1625:2: ( (this_Depth_0= ruleDepth | this_FieldInfo_1= ruleFieldInfo | this_Contains_2= ruleContains | this_Length_3= ruleLength ) )
            // InternalJsonDsl.g:1626:2: (this_Depth_0= ruleDepth | this_FieldInfo_1= ruleFieldInfo | this_Contains_2= ruleContains | this_Length_3= ruleLength )
            {
            // InternalJsonDsl.g:1626:2: (this_Depth_0= ruleDepth | this_FieldInfo_1= ruleFieldInfo | this_Contains_2= ruleContains | this_Length_3= ruleLength )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt16=1;
                }
                break;
            case 45:
                {
                alt16=2;
                }
                break;
            case 46:
                {
                alt16=3;
                }
                break;
            case 52:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalJsonDsl.g:1627:3: this_Depth_0= ruleDepth
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInfoFunctionsAccess().getDepthParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Depth_0=ruleDepth();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Depth_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1636:3: this_FieldInfo_1= ruleFieldInfo
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInfoFunctionsAccess().getFieldInfoParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldInfo_1=ruleFieldInfo();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldInfo_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:1645:3: this_Contains_2= ruleContains
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInfoFunctionsAccess().getContainsParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Contains_2=ruleContains();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Contains_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalJsonDsl.g:1654:3: this_Length_3= ruleLength
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInfoFunctionsAccess().getLengthParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Length_3=ruleLength();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Length_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInfoFunctions"


    // $ANTLR start "entryRuleManipFunctions"
    // InternalJsonDsl.g:1666:1: entryRuleManipFunctions returns [EObject current=null] : iv_ruleManipFunctions= ruleManipFunctions EOF ;
    public final EObject entryRuleManipFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManipFunctions = null;


        try {
            // InternalJsonDsl.g:1666:55: (iv_ruleManipFunctions= ruleManipFunctions EOF )
            // InternalJsonDsl.g:1667:2: iv_ruleManipFunctions= ruleManipFunctions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getManipFunctionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleManipFunctions=ruleManipFunctions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleManipFunctions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleManipFunctions"


    // $ANTLR start "ruleManipFunctions"
    // InternalJsonDsl.g:1673:1: ruleManipFunctions returns [EObject current=null] : (this_Select_0= ruleSelect | this_Concat_1= ruleConcat ) ;
    public final EObject ruleManipFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Select_0 = null;

        EObject this_Concat_1 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1679:2: ( (this_Select_0= ruleSelect | this_Concat_1= ruleConcat ) )
            // InternalJsonDsl.g:1680:2: (this_Select_0= ruleSelect | this_Concat_1= ruleConcat )
            {
            // InternalJsonDsl.g:1680:2: (this_Select_0= ruleSelect | this_Concat_1= ruleConcat )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            else if ( (LA17_0==51) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalJsonDsl.g:1681:3: this_Select_0= ruleSelect
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getManipFunctionsAccess().getSelectParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Select_0=ruleSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Select_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1690:3: this_Concat_1= ruleConcat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getManipFunctionsAccess().getConcatParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Concat_1=ruleConcat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Concat_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleManipFunctions"


    // $ANTLR start "entryRuleArithFunctions"
    // InternalJsonDsl.g:1702:1: entryRuleArithFunctions returns [EObject current=null] : iv_ruleArithFunctions= ruleArithFunctions EOF ;
    public final EObject entryRuleArithFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithFunctions = null;


        try {
            // InternalJsonDsl.g:1702:55: (iv_ruleArithFunctions= ruleArithFunctions EOF )
            // InternalJsonDsl.g:1703:2: iv_ruleArithFunctions= ruleArithFunctions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithFunctionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithFunctions=ruleArithFunctions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithFunctions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArithFunctions"


    // $ANTLR start "ruleArithFunctions"
    // InternalJsonDsl.g:1709:1: ruleArithFunctions returns [EObject current=null] : (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) ;
    public final EObject ruleArithFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Sum_0 = null;

        EObject this_Product_1 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1715:2: ( (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) )
            // InternalJsonDsl.g:1716:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct )
            {
            // InternalJsonDsl.g:1716:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            else if ( (LA18_0==55) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalJsonDsl.g:1717:3: this_Sum_0= ruleSum
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArithFunctionsAccess().getSumParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Sum_0=ruleSum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Sum_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1726:3: this_Product_1= ruleProduct
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArithFunctionsAccess().getProductParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Product_1=ruleProduct();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Product_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArithFunctions"


    // $ANTLR start "entryRuleAlterFunctions"
    // InternalJsonDsl.g:1738:1: entryRuleAlterFunctions returns [EObject current=null] : iv_ruleAlterFunctions= ruleAlterFunctions EOF ;
    public final EObject entryRuleAlterFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterFunctions = null;


        try {
            // InternalJsonDsl.g:1738:55: (iv_ruleAlterFunctions= ruleAlterFunctions EOF )
            // InternalJsonDsl.g:1739:2: iv_ruleAlterFunctions= ruleAlterFunctions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterFunctionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAlterFunctions=ruleAlterFunctions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterFunctions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlterFunctions"


    // $ANTLR start "ruleAlterFunctions"
    // InternalJsonDsl.g:1745:1: ruleAlterFunctions returns [EObject current=null] : this_Delete_0= ruleDelete ;
    public final EObject ruleAlterFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Delete_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1751:2: (this_Delete_0= ruleDelete )
            // InternalJsonDsl.g:1752:2: this_Delete_0= ruleDelete
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getAlterFunctionsAccess().getDeleteParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Delete_0=ruleDelete();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Delete_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAlterFunctions"


    // $ANTLR start "entryRuleLoad"
    // InternalJsonDsl.g:1763:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalJsonDsl.g:1763:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalJsonDsl.g:1764:2: iv_ruleLoad= ruleLoad EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoad=ruleLoad();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoad; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalJsonDsl.g:1770:1: ruleLoad returns [EObject current=null] : ( (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) ) | (otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fileName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_fileName_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1776:2: ( ( (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) ) | (otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')' ) ) )
            // InternalJsonDsl.g:1777:2: ( (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) ) | (otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            {
            // InternalJsonDsl.g:1777:2: ( (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) ) | (otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==35) ) {
                    alt19=2;
                }
                else if ( (LA19_1==RULE_STRING) ) {
                    alt19=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalJsonDsl.g:1778:3: (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) )
                    {
                    // InternalJsonDsl.g:1778:3: (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) )
                    // InternalJsonDsl.g:1779:4: otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLOADKeyword_0_0());
                      			
                    }
                    // InternalJsonDsl.g:1783:4: ( (lv_fileName_1_0= RULE_STRING ) )
                    // InternalJsonDsl.g:1784:5: (lv_fileName_1_0= RULE_STRING )
                    {
                    // InternalJsonDsl.g:1784:5: (lv_fileName_1_0= RULE_STRING )
                    // InternalJsonDsl.g:1785:6: lv_fileName_1_0= RULE_STRING
                    {
                    lv_fileName_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_fileName_1_0, grammarAccess.getLoadAccess().getFileNameSTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLoadRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"fileName",
                      							lv_fileName_1_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1803:3: (otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')' )
                    {
                    // InternalJsonDsl.g:1803:3: (otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')' )
                    // InternalJsonDsl.g:1804:4: otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getLOADKeyword_1_0());
                      			
                    }
                    otherlv_3=(Token)match(input,35,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalJsonDsl.g:1812:4: ( (lv_fileName_4_0= RULE_STRING ) )
                    // InternalJsonDsl.g:1813:5: (lv_fileName_4_0= RULE_STRING )
                    {
                    // InternalJsonDsl.g:1813:5: (lv_fileName_4_0= RULE_STRING )
                    // InternalJsonDsl.g:1814:6: lv_fileName_4_0= RULE_STRING
                    {
                    lv_fileName_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_fileName_4_0, grammarAccess.getLoadAccess().getFileNameSTRINGTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLoadRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"fileName",
                      							lv_fileName_4_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getLoadAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleStore"
    // InternalJsonDsl.g:1839:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalJsonDsl.g:1839:46: (iv_ruleStore= ruleStore EOF )
            // InternalJsonDsl.g:1840:2: iv_ruleStore= ruleStore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStore; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalJsonDsl.g:1846:1: ruleStore returns [EObject current=null] : (otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_fileName_6_0=null;
        Token otherlv_7=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1852:2: ( (otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' ) )
            // InternalJsonDsl.g:1853:2: (otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' )
            {
            // InternalJsonDsl.g:1853:2: (otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' )
            // InternalJsonDsl.g:1854:3: otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getSTOREKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:1862:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:1863:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:1863:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:1864:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStoreAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStoreRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,41,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getStoreAccess().getINKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,35,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:1893:3: ( (lv_fileName_6_0= RULE_STRING ) )
            // InternalJsonDsl.g:1894:4: (lv_fileName_6_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1894:4: (lv_fileName_6_0= RULE_STRING )
            // InternalJsonDsl.g:1895:5: lv_fileName_6_0= RULE_STRING
            {
            lv_fileName_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_fileName_6_0, grammarAccess.getStoreAccess().getFileNameSTRINGTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStoreRule());
              					}
              					setWithLastConsumed(
              						current,
              						"fileName",
              						lv_fileName_6_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getStoreAccess().getRightParenthesisKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleExport"
    // InternalJsonDsl.g:1919:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalJsonDsl.g:1919:47: (iv_ruleExport= ruleExport EOF )
            // InternalJsonDsl.g:1920:2: iv_ruleExport= ruleExport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExport=ruleExport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExport"


    // $ANTLR start "ruleExport"
    // InternalJsonDsl.g:1926:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_fileName_6_0=null;
        Token otherlv_7=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1932:2: ( (otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' ) )
            // InternalJsonDsl.g:1933:2: (otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' )
            {
            // InternalJsonDsl.g:1933:2: (otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' )
            // InternalJsonDsl.g:1934:3: otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORT_CSVKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:1942:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:1943:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:1943:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:1944:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExportAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExportRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getExportAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,41,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getExportAccess().getINKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,35,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getExportAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:1973:3: ( (lv_fileName_6_0= RULE_STRING ) )
            // InternalJsonDsl.g:1974:4: (lv_fileName_6_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1974:4: (lv_fileName_6_0= RULE_STRING )
            // InternalJsonDsl.g:1975:5: lv_fileName_6_0= RULE_STRING
            {
            lv_fileName_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_fileName_6_0, grammarAccess.getExportAccess().getFileNameSTRINGTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"fileName",
              						lv_fileName_6_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getExportAccess().getRightParenthesisKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExport"


    // $ANTLR start "entryRulePrint"
    // InternalJsonDsl.g:1999:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalJsonDsl.g:1999:46: (iv_rulePrint= rulePrint EOF )
            // InternalJsonDsl.g:2000:2: iv_rulePrint= rulePrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalJsonDsl.g:2006:1: rulePrint returns [EObject current=null] : (otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2012:2: ( (otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJsonDsl.g:2013:2: (otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJsonDsl.g:2013:2: (otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJsonDsl.g:2014:3: otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPRINTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2022:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2023:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2023:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2024:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrintAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrintRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPrintAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleDepth"
    // InternalJsonDsl.g:2049:1: entryRuleDepth returns [EObject current=null] : iv_ruleDepth= ruleDepth EOF ;
    public final EObject entryRuleDepth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepth = null;


        try {
            // InternalJsonDsl.g:2049:46: (iv_ruleDepth= ruleDepth EOF )
            // InternalJsonDsl.g:2050:2: iv_ruleDepth= ruleDepth EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDepthRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDepth=ruleDepth();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDepth; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDepth"


    // $ANTLR start "ruleDepth"
    // InternalJsonDsl.g:2056:1: ruleDepth returns [EObject current=null] : (otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleDepth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2062:2: ( (otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJsonDsl.g:2063:2: (otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJsonDsl.g:2063:2: (otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJsonDsl.g:2064:3: otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDepthAccess().getGET_DEPTHKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDepthAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2072:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2073:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2073:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2074:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDepthAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDepthRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDepthAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDepth"


    // $ANTLR start "entryRuleFieldInfo"
    // InternalJsonDsl.g:2099:1: entryRuleFieldInfo returns [EObject current=null] : iv_ruleFieldInfo= ruleFieldInfo EOF ;
    public final EObject entryRuleFieldInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInfo = null;


        try {
            // InternalJsonDsl.g:2099:50: (iv_ruleFieldInfo= ruleFieldInfo EOF )
            // InternalJsonDsl.g:2100:2: iv_ruleFieldInfo= ruleFieldInfo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldInfoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldInfo=ruleFieldInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldInfo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldInfo"


    // $ANTLR start "ruleFieldInfo"
    // InternalJsonDsl.g:2106:1: ruleFieldInfo returns [EObject current=null] : (otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleFieldInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2112:2: ( (otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJsonDsl.g:2113:2: (otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJsonDsl.g:2113:2: (otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJsonDsl.g:2114:3: otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldInfoAccess().getGET_INFOSKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldInfoAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2122:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2123:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2123:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2124:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldInfoAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFieldInfoRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFieldInfoAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFieldInfo"


    // $ANTLR start "entryRuleContains"
    // InternalJsonDsl.g:2149:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalJsonDsl.g:2149:49: (iv_ruleContains= ruleContains EOF )
            // InternalJsonDsl.g:2150:2: iv_ruleContains= ruleContains EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContains=ruleContains();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContains; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // InternalJsonDsl.g:2156:1: ruleContains returns [EObject current=null] : (otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_keys_2_0 = null;

        EObject lv_keys_4_0 = null;

        EObject lv_right_8_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2162:2: ( (otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            // InternalJsonDsl.g:2163:2: (otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')' )
            {
            // InternalJsonDsl.g:2163:2: (otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')' )
            // InternalJsonDsl.g:2164:3: otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getISKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2172:3: ( (lv_keys_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2173:4: (lv_keys_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2173:4: (lv_keys_2_0= ruleExpression )
            // InternalJsonDsl.g:2174:5: lv_keys_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainsAccess().getKeysExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_keys_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainsRule());
              					}
              					add(
              						current,
              						"keys",
              						lv_keys_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalJsonDsl.g:2191:3: (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==47) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalJsonDsl.g:2192:4: otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,47,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getContainsAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalJsonDsl.g:2196:4: ( (lv_keys_4_0= ruleExpression ) )
            	    // InternalJsonDsl.g:2197:5: (lv_keys_4_0= ruleExpression )
            	    {
            	    // InternalJsonDsl.g:2197:5: (lv_keys_4_0= ruleExpression )
            	    // InternalJsonDsl.g:2198:6: lv_keys_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainsAccess().getKeysExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_keys_4_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContainsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"keys",
            	      							lv_keys_4_0,
            	      							"org.xtext.example.mydsl.JsonDsl.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,36,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getContainsAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_6=(Token)match(input,41,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getContainsAccess().getINKeyword_5());
              		
            }
            otherlv_7=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getContainsAccess().getLeftParenthesisKeyword_6());
              		
            }
            // InternalJsonDsl.g:2228:3: ( (lv_right_8_0= ruleExpression ) )
            // InternalJsonDsl.g:2229:4: (lv_right_8_0= ruleExpression )
            {
            // InternalJsonDsl.g:2229:4: (lv_right_8_0= ruleExpression )
            // InternalJsonDsl.g:2230:5: lv_right_8_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainsAccess().getRightExpressionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_right_8_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainsRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_8_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getContainsAccess().getRightParenthesisKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleSelect"
    // InternalJsonDsl.g:2255:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalJsonDsl.g:2255:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalJsonDsl.g:2256:2: iv_ruleSelect= ruleSelect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalJsonDsl.g:2262:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_fields_3_0 = null;

        EObject lv_fields_5_0 = null;

        EObject lv_fromExpression_9_0 = null;

        EObject lv_whereExpression_13_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2268:2: ( (otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? ) )
            // InternalJsonDsl.g:2269:2: (otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? )
            {
            // InternalJsonDsl.g:2269:2: (otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? )
            // InternalJsonDsl.g:2270:3: otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2278:3: (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_NULL)||(LA23_0>=26 && LA23_0<=27)||(LA23_0>=31 && LA23_0<=32)||(LA23_0>=35 && LA23_0<=37)||(LA23_0>=39 && LA23_0<=40)||LA23_0==42||(LA23_0>=44 && LA23_0<=46)||LA23_0==48||(LA23_0>=51 && LA23_0<=53)||(LA23_0>=55 && LA23_0<=57)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalJsonDsl.g:2279:4: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getAsteriskKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:2284:4: ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )?
                    {
                    // InternalJsonDsl.g:2284:4: ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_NULL)||(LA22_0>=26 && LA22_0<=27)||(LA22_0>=31 && LA22_0<=32)||LA22_0==35||LA22_0==37||(LA22_0>=39 && LA22_0<=40)||LA22_0==42||(LA22_0>=44 && LA22_0<=46)||LA22_0==48||(LA22_0>=51 && LA22_0<=53)||(LA22_0>=55 && LA22_0<=57)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalJsonDsl.g:2285:5: ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )*
                            {
                            // InternalJsonDsl.g:2285:5: ( (lv_fields_3_0= ruleExpression ) )
                            // InternalJsonDsl.g:2286:6: (lv_fields_3_0= ruleExpression )
                            {
                            // InternalJsonDsl.g:2286:6: (lv_fields_3_0= ruleExpression )
                            // InternalJsonDsl.g:2287:7: lv_fields_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSelectAccess().getFieldsExpressionParserRuleCall_2_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_21);
                            lv_fields_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSelectRule());
                              							}
                              							add(
                              								current,
                              								"fields",
                              								lv_fields_3_0,
                              								"org.xtext.example.mydsl.JsonDsl.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalJsonDsl.g:2304:5: (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==47) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // InternalJsonDsl.g:2305:6: otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,47,FOLLOW_6); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_2_1_1_0());
                            	      					
                            	    }
                            	    // InternalJsonDsl.g:2309:6: ( (lv_fields_5_0= ruleExpression ) )
                            	    // InternalJsonDsl.g:2310:7: (lv_fields_5_0= ruleExpression )
                            	    {
                            	    // InternalJsonDsl.g:2310:7: (lv_fields_5_0= ruleExpression )
                            	    // InternalJsonDsl.g:2311:8: lv_fields_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSelectAccess().getFieldsExpressionParserRuleCall_2_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_fields_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getSelectRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"fields",
                            	      									lv_fields_5_0,
                            	      									"org.xtext.example.mydsl.JsonDsl.Expression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,36,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_7=(Token)match(input,49,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSelectAccess().getFROMKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:2343:3: ( (lv_fromExpression_9_0= ruleExpression ) )
            // InternalJsonDsl.g:2344:4: (lv_fromExpression_9_0= ruleExpression )
            {
            // InternalJsonDsl.g:2344:4: (lv_fromExpression_9_0= ruleExpression )
            // InternalJsonDsl.g:2345:5: lv_fromExpression_9_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSelectAccess().getFromExpressionExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_fromExpression_9_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSelectRule());
              					}
              					set(
              						current,
              						"fromExpression",
              						lv_fromExpression_9_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_10=(Token)match(input,36,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getSelectAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalJsonDsl.g:2366:3: ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) && (synpred1_InternalJsonDsl())) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJsonDsl.g:2367:4: ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')'
                    {
                    // InternalJsonDsl.g:2367:4: ( ( 'WHERE' )=>otherlv_11= 'WHERE' )
                    // InternalJsonDsl.g:2368:5: ( 'WHERE' )=>otherlv_11= 'WHERE'
                    {
                    otherlv_11=(Token)match(input,50,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getSelectAccess().getWHEREKeyword_8_0());
                      				
                    }

                    }

                    otherlv_12=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_8_1());
                      			
                    }
                    // InternalJsonDsl.g:2378:4: ( (lv_whereExpression_13_0= ruleExpression ) )
                    // InternalJsonDsl.g:2379:5: (lv_whereExpression_13_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2379:5: (lv_whereExpression_13_0= ruleExpression )
                    // InternalJsonDsl.g:2380:6: lv_whereExpression_13_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSelectAccess().getWhereExpressionExpressionParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_whereExpression_13_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSelectRule());
                      						}
                      						set(
                      							current,
                      							"whereExpression",
                      							lv_whereExpression_13_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getSelectAccess().getRightParenthesisKeyword_8_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleConcat"
    // InternalJsonDsl.g:2406:1: entryRuleConcat returns [EObject current=null] : iv_ruleConcat= ruleConcat EOF ;
    public final EObject entryRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcat = null;


        try {
            // InternalJsonDsl.g:2406:47: (iv_ruleConcat= ruleConcat EOF )
            // InternalJsonDsl.g:2407:2: iv_ruleConcat= ruleConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcat=ruleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConcat"


    // $ANTLR start "ruleConcat"
    // InternalJsonDsl.g:2413:1: ruleConcat returns [EObject current=null] : (otherlv_0= 'CONCAT' otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) ) otherlv_5= ')' ) ;
    public final EObject ruleConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2419:2: ( (otherlv_0= 'CONCAT' otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) ) otherlv_5= ')' ) )
            // InternalJsonDsl.g:2420:2: (otherlv_0= 'CONCAT' otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) ) otherlv_5= ')' )
            {
            // InternalJsonDsl.g:2420:2: (otherlv_0= 'CONCAT' otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) ) otherlv_5= ')' )
            // InternalJsonDsl.g:2421:3: otherlv_0= 'CONCAT' otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConcatAccess().getCONCATKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcatAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2429:3: ( (lv_expressions_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2430:4: (lv_expressions_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2430:4: (lv_expressions_2_0= ruleExpression )
            // InternalJsonDsl.g:2431:5: lv_expressions_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConcatAccess().getExpressionsExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_expressions_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConcatRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalJsonDsl.g:2448:3: (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )
            // InternalJsonDsl.g:2449:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) )
            {
            otherlv_3=(Token)match(input,47,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getConcatAccess().getCommaKeyword_3_0());
              			
            }
            // InternalJsonDsl.g:2453:4: ( (lv_expressions_4_0= ruleExpression ) )
            // InternalJsonDsl.g:2454:5: (lv_expressions_4_0= ruleExpression )
            {
            // InternalJsonDsl.g:2454:5: (lv_expressions_4_0= ruleExpression )
            // InternalJsonDsl.g:2455:6: lv_expressions_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getConcatAccess().getExpressionsExpressionParserRuleCall_3_1_0());
              					
            }
            pushFollow(FOLLOW_17);
            lv_expressions_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getConcatRule());
              						}
              						add(
              							current,
              							"expressions",
              							lv_expressions_4_0,
              							"org.xtext.example.mydsl.JsonDsl.Expression");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConcatAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRuleLength"
    // InternalJsonDsl.g:2481:1: entryRuleLength returns [EObject current=null] : iv_ruleLength= ruleLength EOF ;
    public final EObject entryRuleLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLength = null;


        try {
            // InternalJsonDsl.g:2481:47: (iv_ruleLength= ruleLength EOF )
            // InternalJsonDsl.g:2482:2: iv_ruleLength= ruleLength EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLengthRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLength=ruleLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLength; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLength"


    // $ANTLR start "ruleLength"
    // InternalJsonDsl.g:2488:1: ruleLength returns [EObject current=null] : (otherlv_0= 'LENGTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2494:2: ( (otherlv_0= 'LENGTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJsonDsl.g:2495:2: (otherlv_0= 'LENGTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJsonDsl.g:2495:2: (otherlv_0= 'LENGTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJsonDsl.g:2496:3: otherlv_0= 'LENGTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLengthAccess().getLENGTHKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLengthAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2504:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2505:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2505:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2506:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLengthAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLengthRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLengthAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLength"


    // $ANTLR start "entryRuleSum"
    // InternalJsonDsl.g:2531:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalJsonDsl.g:2531:44: (iv_ruleSum= ruleSum EOF )
            // InternalJsonDsl.g:2532:2: iv_ruleSum= ruleSum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalJsonDsl.g:2538:1: ruleSum returns [EObject current=null] : (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_expression_2_0 = null;

        EObject lv_field_6_0 = null;

        EObject lv_whereExpression_10_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2544:2: ( (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) )
            // InternalJsonDsl.g:2545:2: (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            {
            // InternalJsonDsl.g:2545:2: (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            // InternalJsonDsl.g:2546:3: otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getSUMKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSumAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2554:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2555:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2555:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2556:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSumAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSumRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSumAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalJsonDsl.g:2577:3: (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==54) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJsonDsl.g:2578:4: otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSumAccess().getONKeyword_4_0());
                      			
                    }
                    otherlv_5=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSumAccess().getLeftParenthesisKeyword_4_1());
                      			
                    }
                    // InternalJsonDsl.g:2586:4: ( (lv_field_6_0= ruleExpression ) )
                    // InternalJsonDsl.g:2587:5: (lv_field_6_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2587:5: (lv_field_6_0= ruleExpression )
                    // InternalJsonDsl.g:2588:6: lv_field_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSumAccess().getFieldExpressionParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_field_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSumRule());
                      						}
                      						set(
                      							current,
                      							"field",
                      							lv_field_6_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSumAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }
                    break;

            }

            // InternalJsonDsl.g:2610:3: ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) && (synpred2_InternalJsonDsl())) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJsonDsl.g:2611:4: ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')'
                    {
                    // InternalJsonDsl.g:2611:4: ( ( 'WHERE' )=>otherlv_8= 'WHERE' )
                    // InternalJsonDsl.g:2612:5: ( 'WHERE' )=>otherlv_8= 'WHERE'
                    {
                    otherlv_8=(Token)match(input,50,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getSumAccess().getWHEREKeyword_5_0());
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getSumAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalJsonDsl.g:2622:4: ( (lv_whereExpression_10_0= ruleExpression ) )
                    // InternalJsonDsl.g:2623:5: (lv_whereExpression_10_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2623:5: (lv_whereExpression_10_0= ruleExpression )
                    // InternalJsonDsl.g:2624:6: lv_whereExpression_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSumAccess().getWhereExpressionExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_whereExpression_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSumRule());
                      						}
                      						set(
                      							current,
                      							"whereExpression",
                      							lv_whereExpression_10_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getSumAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleProduct"
    // InternalJsonDsl.g:2650:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalJsonDsl.g:2650:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalJsonDsl.g:2651:2: iv_ruleProduct= ruleProduct EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProductRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProduct=ruleProduct();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProduct; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // InternalJsonDsl.g:2657:1: ruleProduct returns [EObject current=null] : (otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_expression_2_0 = null;

        EObject lv_field_6_0 = null;

        EObject lv_whereExpression_10_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2663:2: ( (otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) )
            // InternalJsonDsl.g:2664:2: (otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            {
            // InternalJsonDsl.g:2664:2: (otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            // InternalJsonDsl.g:2665:3: otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProductAccess().getPRODUCTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProductAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2673:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2674:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2674:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2675:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProductAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProductRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProductAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalJsonDsl.g:2696:3: (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJsonDsl.g:2697:4: otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getProductAccess().getONKeyword_4_0());
                      			
                    }
                    otherlv_5=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getProductAccess().getLeftParenthesisKeyword_4_1());
                      			
                    }
                    // InternalJsonDsl.g:2705:4: ( (lv_field_6_0= ruleExpression ) )
                    // InternalJsonDsl.g:2706:5: (lv_field_6_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2706:5: (lv_field_6_0= ruleExpression )
                    // InternalJsonDsl.g:2707:6: lv_field_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProductAccess().getFieldExpressionParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_field_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProductRule());
                      						}
                      						set(
                      							current,
                      							"field",
                      							lv_field_6_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getProductAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }
                    break;

            }

            // InternalJsonDsl.g:2729:3: ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) && (synpred3_InternalJsonDsl())) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJsonDsl.g:2730:4: ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')'
                    {
                    // InternalJsonDsl.g:2730:4: ( ( 'WHERE' )=>otherlv_8= 'WHERE' )
                    // InternalJsonDsl.g:2731:5: ( 'WHERE' )=>otherlv_8= 'WHERE'
                    {
                    otherlv_8=(Token)match(input,50,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getProductAccess().getWHEREKeyword_5_0());
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getProductAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalJsonDsl.g:2741:4: ( (lv_whereExpression_10_0= ruleExpression ) )
                    // InternalJsonDsl.g:2742:5: (lv_whereExpression_10_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2742:5: (lv_whereExpression_10_0= ruleExpression )
                    // InternalJsonDsl.g:2743:6: lv_whereExpression_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProductAccess().getWhereExpressionExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_whereExpression_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProductRule());
                      						}
                      						set(
                      							current,
                      							"whereExpression",
                      							lv_whereExpression_10_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getProductAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleDelete"
    // InternalJsonDsl.g:2769:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalJsonDsl.g:2769:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalJsonDsl.g:2770:2: iv_ruleDelete= ruleDelete EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDelete; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalJsonDsl.g:2776:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'DELETE' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_fields_3_0 = null;

        EObject lv_fields_5_0 = null;

        EObject lv_fromExpression_9_0 = null;

        EObject lv_whereExpression_13_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2782:2: ( (otherlv_0= 'DELETE' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? ) )
            // InternalJsonDsl.g:2783:2: (otherlv_0= 'DELETE' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? )
            {
            // InternalJsonDsl.g:2783:2: (otherlv_0= 'DELETE' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? )
            // InternalJsonDsl.g:2784:3: otherlv_0= 'DELETE' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDELETEKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2792:3: (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_NULL)||(LA31_0>=26 && LA31_0<=27)||(LA31_0>=31 && LA31_0<=32)||(LA31_0>=35 && LA31_0<=37)||(LA31_0>=39 && LA31_0<=40)||LA31_0==42||(LA31_0>=44 && LA31_0<=46)||LA31_0==48||(LA31_0>=51 && LA31_0<=53)||(LA31_0>=55 && LA31_0<=57)) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalJsonDsl.g:2793:4: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getAsteriskKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:2798:4: ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )?
                    {
                    // InternalJsonDsl.g:2798:4: ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_NULL)||(LA30_0>=26 && LA30_0<=27)||(LA30_0>=31 && LA30_0<=32)||LA30_0==35||LA30_0==37||(LA30_0>=39 && LA30_0<=40)||LA30_0==42||(LA30_0>=44 && LA30_0<=46)||LA30_0==48||(LA30_0>=51 && LA30_0<=53)||(LA30_0>=55 && LA30_0<=57)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalJsonDsl.g:2799:5: ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )*
                            {
                            // InternalJsonDsl.g:2799:5: ( (lv_fields_3_0= ruleExpression ) )
                            // InternalJsonDsl.g:2800:6: (lv_fields_3_0= ruleExpression )
                            {
                            // InternalJsonDsl.g:2800:6: (lv_fields_3_0= ruleExpression )
                            // InternalJsonDsl.g:2801:7: lv_fields_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDeleteAccess().getFieldsExpressionParserRuleCall_2_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_21);
                            lv_fields_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDeleteRule());
                              							}
                              							add(
                              								current,
                              								"fields",
                              								lv_fields_3_0,
                              								"org.xtext.example.mydsl.JsonDsl.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalJsonDsl.g:2818:5: (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==47) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalJsonDsl.g:2819:6: otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,47,FOLLOW_6); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getDeleteAccess().getCommaKeyword_2_1_1_0());
                            	      					
                            	    }
                            	    // InternalJsonDsl.g:2823:6: ( (lv_fields_5_0= ruleExpression ) )
                            	    // InternalJsonDsl.g:2824:7: (lv_fields_5_0= ruleExpression )
                            	    {
                            	    // InternalJsonDsl.g:2824:7: (lv_fields_5_0= ruleExpression )
                            	    // InternalJsonDsl.g:2825:8: lv_fields_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDeleteAccess().getFieldsExpressionParserRuleCall_2_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_fields_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getDeleteRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"fields",
                            	      									lv_fields_5_0,
                            	      									"org.xtext.example.mydsl.JsonDsl.Expression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,36,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDeleteAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_7=(Token)match(input,49,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDeleteAccess().getFROMKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDeleteAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:2857:3: ( (lv_fromExpression_9_0= ruleExpression ) )
            // InternalJsonDsl.g:2858:4: (lv_fromExpression_9_0= ruleExpression )
            {
            // InternalJsonDsl.g:2858:4: (lv_fromExpression_9_0= ruleExpression )
            // InternalJsonDsl.g:2859:5: lv_fromExpression_9_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeleteAccess().getFromExpressionExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_fromExpression_9_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeleteRule());
              					}
              					set(
              						current,
              						"fromExpression",
              						lv_fromExpression_9_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_10=(Token)match(input,36,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getDeleteAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalJsonDsl.g:2880:3: ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) && (synpred4_InternalJsonDsl())) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJsonDsl.g:2881:4: ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')'
                    {
                    // InternalJsonDsl.g:2881:4: ( ( 'WHERE' )=>otherlv_11= 'WHERE' )
                    // InternalJsonDsl.g:2882:5: ( 'WHERE' )=>otherlv_11= 'WHERE'
                    {
                    otherlv_11=(Token)match(input,50,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getDeleteAccess().getWHEREKeyword_8_0());
                      				
                    }

                    }

                    otherlv_12=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getDeleteAccess().getLeftParenthesisKeyword_8_1());
                      			
                    }
                    // InternalJsonDsl.g:2892:4: ( (lv_whereExpression_13_0= ruleExpression ) )
                    // InternalJsonDsl.g:2893:5: (lv_whereExpression_13_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2893:5: (lv_whereExpression_13_0= ruleExpression )
                    // InternalJsonDsl.g:2894:6: lv_whereExpression_13_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeleteAccess().getWhereExpressionExpressionParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_whereExpression_13_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDeleteRule());
                      						}
                      						set(
                      							current,
                      							"whereExpression",
                      							lv_whereExpression_13_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDeleteAccess().getRightParenthesisKeyword_8_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleConstant"
    // InternalJsonDsl.g:2920:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalJsonDsl.g:2920:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalJsonDsl.g:2921:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalJsonDsl.g:2927:1: ruleConstant returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_Array_1= ruleArray | this_JSonObject_2= ruleJSonObject ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_Primitive_0 = null;

        EObject this_Array_1 = null;

        EObject this_JSonObject_2 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2933:2: ( (this_Primitive_0= rulePrimitive | this_Array_1= ruleArray | this_JSonObject_2= ruleJSonObject ) )
            // InternalJsonDsl.g:2934:2: (this_Primitive_0= rulePrimitive | this_Array_1= ruleArray | this_JSonObject_2= ruleJSonObject )
            {
            // InternalJsonDsl.g:2934:2: (this_Primitive_0= rulePrimitive | this_Array_1= ruleArray | this_JSonObject_2= ruleJSonObject )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_BOOL:
            case RULE_NULL:
                {
                alt33=1;
                }
                break;
            case 32:
                {
                alt33=2;
                }
                break;
            case 57:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalJsonDsl.g:2935:3: this_Primitive_0= rulePrimitive
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConstantAccess().getPrimitiveParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Primitive_0=rulePrimitive();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Primitive_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:2944:3: this_Array_1= ruleArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConstantAccess().getArrayParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Array_1=ruleArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Array_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:2953:3: this_JSonObject_2= ruleJSonObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConstantAccess().getJSonObjectParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JSonObject_2=ruleJSonObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JSonObject_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRulePrimitive"
    // InternalJsonDsl.g:2965:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalJsonDsl.g:2965:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalJsonDsl.g:2966:2: iv_rulePrimitive= rulePrimitive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitive; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalJsonDsl.g:2972:1: rulePrimitive returns [EObject current=null] : ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_intNum_1_0= RULE_INT ) ) | ( (lv_floatNum_2_0= RULE_DOUBLE ) ) | ( (lv_bool_3_0= RULE_BOOL ) ) | ( (lv_nil_4_0= RULE_NULL ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;
        Token lv_intNum_1_0=null;
        Token lv_floatNum_2_0=null;
        Token lv_bool_3_0=null;
        Token lv_nil_4_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:2978:2: ( ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_intNum_1_0= RULE_INT ) ) | ( (lv_floatNum_2_0= RULE_DOUBLE ) ) | ( (lv_bool_3_0= RULE_BOOL ) ) | ( (lv_nil_4_0= RULE_NULL ) ) ) )
            // InternalJsonDsl.g:2979:2: ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_intNum_1_0= RULE_INT ) ) | ( (lv_floatNum_2_0= RULE_DOUBLE ) ) | ( (lv_bool_3_0= RULE_BOOL ) ) | ( (lv_nil_4_0= RULE_NULL ) ) )
            {
            // InternalJsonDsl.g:2979:2: ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_intNum_1_0= RULE_INT ) ) | ( (lv_floatNum_2_0= RULE_DOUBLE ) ) | ( (lv_bool_3_0= RULE_BOOL ) ) | ( (lv_nil_4_0= RULE_NULL ) ) )
            int alt34=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt34=1;
                }
                break;
            case RULE_INT:
                {
                alt34=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt34=3;
                }
                break;
            case RULE_BOOL:
                {
                alt34=4;
                }
                break;
            case RULE_NULL:
                {
                alt34=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalJsonDsl.g:2980:3: ( (lv_str_0_0= RULE_STRING ) )
                    {
                    // InternalJsonDsl.g:2980:3: ( (lv_str_0_0= RULE_STRING ) )
                    // InternalJsonDsl.g:2981:4: (lv_str_0_0= RULE_STRING )
                    {
                    // InternalJsonDsl.g:2981:4: (lv_str_0_0= RULE_STRING )
                    // InternalJsonDsl.g:2982:5: lv_str_0_0= RULE_STRING
                    {
                    lv_str_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_str_0_0, grammarAccess.getPrimitiveAccess().getStrSTRINGTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"str",
                      						lv_str_0_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:2999:3: ( (lv_intNum_1_0= RULE_INT ) )
                    {
                    // InternalJsonDsl.g:2999:3: ( (lv_intNum_1_0= RULE_INT ) )
                    // InternalJsonDsl.g:3000:4: (lv_intNum_1_0= RULE_INT )
                    {
                    // InternalJsonDsl.g:3000:4: (lv_intNum_1_0= RULE_INT )
                    // InternalJsonDsl.g:3001:5: lv_intNum_1_0= RULE_INT
                    {
                    lv_intNum_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_intNum_1_0, grammarAccess.getPrimitiveAccess().getIntNumINTTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"intNum",
                      						lv_intNum_1_0,
                      						"org.eclipse.xtext.common.Terminals.INT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:3018:3: ( (lv_floatNum_2_0= RULE_DOUBLE ) )
                    {
                    // InternalJsonDsl.g:3018:3: ( (lv_floatNum_2_0= RULE_DOUBLE ) )
                    // InternalJsonDsl.g:3019:4: (lv_floatNum_2_0= RULE_DOUBLE )
                    {
                    // InternalJsonDsl.g:3019:4: (lv_floatNum_2_0= RULE_DOUBLE )
                    // InternalJsonDsl.g:3020:5: lv_floatNum_2_0= RULE_DOUBLE
                    {
                    lv_floatNum_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_floatNum_2_0, grammarAccess.getPrimitiveAccess().getFloatNumDOUBLETerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"floatNum",
                      						lv_floatNum_2_0,
                      						"org.xtext.example.mydsl.JsonDsl.DOUBLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJsonDsl.g:3037:3: ( (lv_bool_3_0= RULE_BOOL ) )
                    {
                    // InternalJsonDsl.g:3037:3: ( (lv_bool_3_0= RULE_BOOL ) )
                    // InternalJsonDsl.g:3038:4: (lv_bool_3_0= RULE_BOOL )
                    {
                    // InternalJsonDsl.g:3038:4: (lv_bool_3_0= RULE_BOOL )
                    // InternalJsonDsl.g:3039:5: lv_bool_3_0= RULE_BOOL
                    {
                    lv_bool_3_0=(Token)match(input,RULE_BOOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_bool_3_0, grammarAccess.getPrimitiveAccess().getBoolBOOLTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"bool",
                      						lv_bool_3_0,
                      						"org.xtext.example.mydsl.JsonDsl.BOOL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalJsonDsl.g:3056:3: ( (lv_nil_4_0= RULE_NULL ) )
                    {
                    // InternalJsonDsl.g:3056:3: ( (lv_nil_4_0= RULE_NULL ) )
                    // InternalJsonDsl.g:3057:4: (lv_nil_4_0= RULE_NULL )
                    {
                    // InternalJsonDsl.g:3057:4: (lv_nil_4_0= RULE_NULL )
                    // InternalJsonDsl.g:3058:5: lv_nil_4_0= RULE_NULL
                    {
                    lv_nil_4_0=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_nil_4_0, grammarAccess.getPrimitiveAccess().getNilNULLTerminalRuleCall_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"nil",
                      						lv_nil_4_0,
                      						"org.xtext.example.mydsl.JsonDsl.NULL");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleArray"
    // InternalJsonDsl.g:3078:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalJsonDsl.g:3078:46: (iv_ruleArray= ruleArray EOF )
            // InternalJsonDsl.g:3079:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalJsonDsl.g:3085:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:3091:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) )
            // InternalJsonDsl.g:3092:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            {
            // InternalJsonDsl.g:3092:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            // InternalJsonDsl.g:3093:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']'
            {
            // InternalJsonDsl.g:3093:3: ()
            // InternalJsonDsl.g:3094:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayAccess().getArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalJsonDsl.g:3104:3: ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_NULL)||(LA36_0>=26 && LA36_0<=27)||(LA36_0>=31 && LA36_0<=32)||LA36_0==35||LA36_0==37||(LA36_0>=39 && LA36_0<=40)||LA36_0==42||(LA36_0>=44 && LA36_0<=46)||LA36_0==48||(LA36_0>=51 && LA36_0<=53)||(LA36_0>=55 && LA36_0<=57)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJsonDsl.g:3105:4: ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    {
                    // InternalJsonDsl.g:3105:4: ( (lv_values_2_0= ruleExpression ) )
                    // InternalJsonDsl.g:3106:5: (lv_values_2_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:3106:5: (lv_values_2_0= ruleExpression )
                    // InternalJsonDsl.g:3107:6: lv_values_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayAccess().getValuesExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_values_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArrayRule());
                      						}
                      						add(
                      							current,
                      							"values",
                      							lv_values_2_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalJsonDsl.g:3124:4: (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==47) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalJsonDsl.g:3125:5: otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,47,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalJsonDsl.g:3129:5: ( (lv_values_4_0= ruleExpression ) )
                    	    // InternalJsonDsl.g:3130:6: (lv_values_4_0= ruleExpression )
                    	    {
                    	    // InternalJsonDsl.g:3130:6: (lv_values_4_0= ruleExpression )
                    	    // InternalJsonDsl.g:3131:7: lv_values_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrayAccess().getValuesExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_28);
                    	    lv_values_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"values",
                    	      								lv_values_4_0,
                    	      								"org.xtext.example.mydsl.JsonDsl.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleJSonObject"
    // InternalJsonDsl.g:3158:1: entryRuleJSonObject returns [EObject current=null] : iv_ruleJSonObject= ruleJSonObject EOF ;
    public final EObject entryRuleJSonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonObject = null;


        try {
            // InternalJsonDsl.g:3158:51: (iv_ruleJSonObject= ruleJSonObject EOF )
            // InternalJsonDsl.g:3159:2: iv_ruleJSonObject= ruleJSonObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJSonObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJSonObject=ruleJSonObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJSonObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJSonObject"


    // $ANTLR start "ruleJSonObject"
    // InternalJsonDsl.g:3165:1: ruleJSonObject returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleJSonObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fields_2_0 = null;

        EObject lv_fields_4_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:3171:2: ( ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' ) )
            // InternalJsonDsl.g:3172:2: ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' )
            {
            // InternalJsonDsl.g:3172:2: ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' )
            // InternalJsonDsl.g:3173:3: () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}'
            {
            // InternalJsonDsl.g:3173:3: ()
            // InternalJsonDsl.g:3174:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJSonObjectAccess().getJSonObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJSonObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalJsonDsl.g:3184:3: ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_NULL)||(LA38_0>=26 && LA38_0<=27)||(LA38_0>=31 && LA38_0<=32)||LA38_0==35||LA38_0==37||(LA38_0>=39 && LA38_0<=40)||LA38_0==42||(LA38_0>=44 && LA38_0<=46)||LA38_0==48||(LA38_0>=51 && LA38_0<=53)||(LA38_0>=55 && LA38_0<=57)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalJsonDsl.g:3185:4: ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )*
                    {
                    // InternalJsonDsl.g:3185:4: ( (lv_fields_2_0= ruleField ) )
                    // InternalJsonDsl.g:3186:5: (lv_fields_2_0= ruleField )
                    {
                    // InternalJsonDsl.g:3186:5: (lv_fields_2_0= ruleField )
                    // InternalJsonDsl.g:3187:6: lv_fields_2_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJSonObjectAccess().getFieldsFieldParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_fields_2_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJSonObjectRule());
                      						}
                      						add(
                      							current,
                      							"fields",
                      							lv_fields_2_0,
                      							"org.xtext.example.mydsl.JsonDsl.Field");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalJsonDsl.g:3204:4: (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==47) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalJsonDsl.g:3205:5: otherlv_3= ',' ( (lv_fields_4_0= ruleField ) )
                    	    {
                    	    otherlv_3=(Token)match(input,47,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJSonObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalJsonDsl.g:3209:5: ( (lv_fields_4_0= ruleField ) )
                    	    // InternalJsonDsl.g:3210:6: (lv_fields_4_0= ruleField )
                    	    {
                    	    // InternalJsonDsl.g:3210:6: (lv_fields_4_0= ruleField )
                    	    // InternalJsonDsl.g:3211:7: lv_fields_4_0= ruleField
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJSonObjectAccess().getFieldsFieldParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_fields_4_0=ruleField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJSonObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"fields",
                    	      								lv_fields_4_0,
                    	      								"org.xtext.example.mydsl.JsonDsl.Field");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getJSonObjectAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJSonObject"


    // $ANTLR start "entryRuleField"
    // InternalJsonDsl.g:3238:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalJsonDsl.g:3238:46: (iv_ruleField= ruleField EOF )
            // InternalJsonDsl.g:3239:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalJsonDsl.g:3245:1: ruleField returns [EObject current=null] : ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:3251:2: ( ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalJsonDsl.g:3252:2: ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalJsonDsl.g:3252:2: ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalJsonDsl.g:3253:3: ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalJsonDsl.g:3253:3: ( (lv_key_0_0= ruleExpression ) )
            // InternalJsonDsl.g:3254:4: (lv_key_0_0= ruleExpression )
            {
            // InternalJsonDsl.g:3254:4: (lv_key_0_0= ruleExpression )
            // InternalJsonDsl.g:3255:5: lv_key_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldAccess().getKeyExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_key_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFieldRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
              		
            }
            // InternalJsonDsl.g:3276:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalJsonDsl.g:3277:4: (lv_value_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:3277:4: (lv_value_2_0= ruleExpression )
            // InternalJsonDsl.g:3278:5: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldAccess().getValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFieldRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleField"

    // $ANTLR start synpred1_InternalJsonDsl
    public final void synpred1_InternalJsonDsl_fragment() throws RecognitionException {   
        // InternalJsonDsl.g:2368:5: ( 'WHERE' )
        // InternalJsonDsl.g:2368:6: 'WHERE'
        {
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalJsonDsl

    // $ANTLR start synpred2_InternalJsonDsl
    public final void synpred2_InternalJsonDsl_fragment() throws RecognitionException {   
        // InternalJsonDsl.g:2612:5: ( 'WHERE' )
        // InternalJsonDsl.g:2612:6: 'WHERE'
        {
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalJsonDsl

    // $ANTLR start synpred3_InternalJsonDsl
    public final void synpred3_InternalJsonDsl_fragment() throws RecognitionException {   
        // InternalJsonDsl.g:2731:5: ( 'WHERE' )
        // InternalJsonDsl.g:2731:6: 'WHERE'
        {
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalJsonDsl

    // $ANTLR start synpred4_InternalJsonDsl
    public final void synpred4_InternalJsonDsl_fragment() throws RecognitionException {   
        // InternalJsonDsl.g:2882:5: ( 'WHERE' )
        // InternalJsonDsl.g:2882:6: 'WHERE'
        {
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalJsonDsl

    // Delegated rules

    public final boolean synpred1_InternalJsonDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalJsonDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalJsonDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalJsonDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalJsonDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalJsonDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalJsonDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalJsonDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x03B97DA98C0003F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x03B975A98C0003F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000500000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000801000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x03B975B99C0003F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0044000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x03B975AB8C0003F0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x07B975A98C0003F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0400800000000000L});

}