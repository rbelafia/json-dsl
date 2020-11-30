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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_BOOL", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'OR'", "'AND'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'['", "']'", "'~'", "'('", "')'", "'.'", "':'", "'LOAD'", "'STORE'", "'IN'", "'EXPORT_CSV'", "'PRINT'", "'GET_DEPTH'", "'GET_INFOS'", "'IS'", "','", "'SELECT'", "'FROM'", "'WHERE'", "'LENGTH'", "'SUM'", "'ON'", "'PRODUCT'", "'{'", "'}'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
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

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_NULL)||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=29 && LA1_0<=30)||LA1_0==33||LA1_0==35||(LA1_0>=37 && LA1_0<=38)||(LA1_0>=40 && LA1_0<=44)||LA1_0==46||(LA1_0>=49 && LA1_0<=50)||(LA1_0>=52 && LA1_0<=53)) ) {
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

                if ( (LA2_1==14||(LA2_1>=16 && LA2_1<=28)||LA2_1==30||LA2_1==32) ) {
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
            case 24:
            case 25:
            case 29:
            case 30:
            case 33:
            case 35:
            case 37:
            case 38:
            case 40:
            case 42:
            case 43:
            case 44:
            case 46:
            case 49:
            case 50:
            case 52:
            case 53:
                {
                alt2=2;
                }
                break;
            case 41:
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
    // InternalJsonDsl.g:362:1: ruleExpressionLvl3 returns [EObject current=null] : (this_ExpressionLvl4_0= ruleExpressionLvl4 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) ) )* ) ;
    public final EObject ruleExpressionLvl3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLvl4_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:368:2: ( (this_ExpressionLvl4_0= ruleExpressionLvl4 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) ) )* ) )
            // InternalJsonDsl.g:369:2: (this_ExpressionLvl4_0= ruleExpressionLvl4 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) ) )* )
            {
            // InternalJsonDsl.g:369:2: (this_ExpressionLvl4_0= ruleExpressionLvl4 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) ) )* )
            // InternalJsonDsl.g:370:3: this_ExpressionLvl4_0= ruleExpressionLvl4 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) ) )*
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
            // InternalJsonDsl.g:378:3: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLvl4 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLvl4 ) ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }
                else if ( (LA5_0==19) ) {
                    alt5=2;
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
    // InternalJsonDsl.g:449:1: entryRuleExpressionLvl4 returns [EObject current=null] : iv_ruleExpressionLvl4= ruleExpressionLvl4 EOF ;
    public final EObject entryRuleExpressionLvl4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl4 = null;


        try {
            // InternalJsonDsl.g:449:55: (iv_ruleExpressionLvl4= ruleExpressionLvl4 EOF )
            // InternalJsonDsl.g:450:2: iv_ruleExpressionLvl4= ruleExpressionLvl4 EOF
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
    // InternalJsonDsl.g:456:1: ruleExpressionLvl4 returns [EObject current=null] : (this_ExpressionLvl5_0= ruleExpressionLvl5 ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) ) )* ) ;
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
            // InternalJsonDsl.g:462:2: ( (this_ExpressionLvl5_0= ruleExpressionLvl5 ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) ) )* ) )
            // InternalJsonDsl.g:463:2: (this_ExpressionLvl5_0= ruleExpressionLvl5 ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) ) )* )
            {
            // InternalJsonDsl.g:463:2: (this_ExpressionLvl5_0= ruleExpressionLvl5 ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) ) )* )
            // InternalJsonDsl.g:464:3: this_ExpressionLvl5_0= ruleExpressionLvl5 ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) ) )*
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
            // InternalJsonDsl.g:472:3: ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) ) | ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) ) )*
            loop6:
            do {
                int alt6=5;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    alt6=1;
                    }
                    break;
                case 21:
                    {
                    alt6=2;
                    }
                    break;
                case 22:
                    {
                    alt6=3;
                    }
                    break;
                case 23:
                    {
                    alt6=4;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalJsonDsl.g:473:4: ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) )
            	    {
            	    // InternalJsonDsl.g:473:4: ( () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) ) )
            	    // InternalJsonDsl.g:474:5: () otherlv_2= '>' ( (lv_right_3_0= ruleExpressionLvl5 ) )
            	    {
            	    // InternalJsonDsl.g:474:5: ()
            	    // InternalJsonDsl.g:475:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl4Access().getSuperiorExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLvl4Access().getGreaterThanSignKeyword_1_0_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:485:5: ( (lv_right_3_0= ruleExpressionLvl5 ) )
            	    // InternalJsonDsl.g:486:6: (lv_right_3_0= ruleExpressionLvl5 )
            	    {
            	    // InternalJsonDsl.g:486:6: (lv_right_3_0= ruleExpressionLvl5 )
            	    // InternalJsonDsl.g:487:7: lv_right_3_0= ruleExpressionLvl5
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
            	    // InternalJsonDsl.g:506:4: ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) )
            	    {
            	    // InternalJsonDsl.g:506:4: ( () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) ) )
            	    // InternalJsonDsl.g:507:5: () otherlv_5= '>=' ( (lv_right_6_0= ruleExpressionLvl5 ) )
            	    {
            	    // InternalJsonDsl.g:507:5: ()
            	    // InternalJsonDsl.g:508:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl4Access().getSuperiorOrEqualExpressionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLvl4Access().getGreaterThanSignEqualsSignKeyword_1_1_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:518:5: ( (lv_right_6_0= ruleExpressionLvl5 ) )
            	    // InternalJsonDsl.g:519:6: (lv_right_6_0= ruleExpressionLvl5 )
            	    {
            	    // InternalJsonDsl.g:519:6: (lv_right_6_0= ruleExpressionLvl5 )
            	    // InternalJsonDsl.g:520:7: lv_right_6_0= ruleExpressionLvl5
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
            	    // InternalJsonDsl.g:539:4: ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) )
            	    {
            	    // InternalJsonDsl.g:539:4: ( () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) ) )
            	    // InternalJsonDsl.g:540:5: () otherlv_8= '<' ( (lv_right_9_0= ruleExpressionLvl5 ) )
            	    {
            	    // InternalJsonDsl.g:540:5: ()
            	    // InternalJsonDsl.g:541:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl4Access().getInferiorExpressionLeftAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getExpressionLvl4Access().getLessThanSignKeyword_1_2_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:551:5: ( (lv_right_9_0= ruleExpressionLvl5 ) )
            	    // InternalJsonDsl.g:552:6: (lv_right_9_0= ruleExpressionLvl5 )
            	    {
            	    // InternalJsonDsl.g:552:6: (lv_right_9_0= ruleExpressionLvl5 )
            	    // InternalJsonDsl.g:553:7: lv_right_9_0= ruleExpressionLvl5
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
            	    // InternalJsonDsl.g:572:4: ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) )
            	    {
            	    // InternalJsonDsl.g:572:4: ( () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) ) )
            	    // InternalJsonDsl.g:573:5: () otherlv_11= '<=' ( (lv_right_12_0= ruleExpressionLvl5 ) )
            	    {
            	    // InternalJsonDsl.g:573:5: ()
            	    // InternalJsonDsl.g:574:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl4Access().getInferiorOrEqualExpressionLeftAction_1_3_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_11=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getExpressionLvl4Access().getLessThanSignEqualsSignKeyword_1_3_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:584:5: ( (lv_right_12_0= ruleExpressionLvl5 ) )
            	    // InternalJsonDsl.g:585:6: (lv_right_12_0= ruleExpressionLvl5 )
            	    {
            	    // InternalJsonDsl.g:585:6: (lv_right_12_0= ruleExpressionLvl5 )
            	    // InternalJsonDsl.g:586:7: lv_right_12_0= ruleExpressionLvl5
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
    // InternalJsonDsl.g:609:1: entryRuleExpressionLvl5 returns [EObject current=null] : iv_ruleExpressionLvl5= ruleExpressionLvl5 EOF ;
    public final EObject entryRuleExpressionLvl5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl5 = null;


        try {
            // InternalJsonDsl.g:609:55: (iv_ruleExpressionLvl5= ruleExpressionLvl5 EOF )
            // InternalJsonDsl.g:610:2: iv_ruleExpressionLvl5= ruleExpressionLvl5 EOF
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
    // InternalJsonDsl.g:616:1: ruleExpressionLvl5 returns [EObject current=null] : (this_ExpressionLvl6_0= ruleExpressionLvl6 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) ) )* ) ;
    public final EObject ruleExpressionLvl5() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLvl6_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:622:2: ( (this_ExpressionLvl6_0= ruleExpressionLvl6 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) ) )* ) )
            // InternalJsonDsl.g:623:2: (this_ExpressionLvl6_0= ruleExpressionLvl6 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) ) )* )
            {
            // InternalJsonDsl.g:623:2: (this_ExpressionLvl6_0= ruleExpressionLvl6 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) ) )* )
            // InternalJsonDsl.g:624:3: this_ExpressionLvl6_0= ruleExpressionLvl6 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) ) )*
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
            // InternalJsonDsl.g:632:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }
                else if ( (LA7_0==25) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJsonDsl.g:633:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) )
            	    {
            	    // InternalJsonDsl.g:633:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) ) )
            	    // InternalJsonDsl.g:634:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLvl6 ) )
            	    {
            	    // InternalJsonDsl.g:634:5: ()
            	    // InternalJsonDsl.g:635:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl5Access().getAdditionExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLvl5Access().getPlusSignKeyword_1_0_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:645:5: ( (lv_right_3_0= ruleExpressionLvl6 ) )
            	    // InternalJsonDsl.g:646:6: (lv_right_3_0= ruleExpressionLvl6 )
            	    {
            	    // InternalJsonDsl.g:646:6: (lv_right_3_0= ruleExpressionLvl6 )
            	    // InternalJsonDsl.g:647:7: lv_right_3_0= ruleExpressionLvl6
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
            	    // InternalJsonDsl.g:666:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) )
            	    {
            	    // InternalJsonDsl.g:666:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) ) )
            	    // InternalJsonDsl.g:667:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLvl6 ) )
            	    {
            	    // InternalJsonDsl.g:667:5: ()
            	    // InternalJsonDsl.g:668:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl5Access().getSubstractionExpressionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLvl5Access().getHyphenMinusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:678:5: ( (lv_right_6_0= ruleExpressionLvl6 ) )
            	    // InternalJsonDsl.g:679:6: (lv_right_6_0= ruleExpressionLvl6 )
            	    {
            	    // InternalJsonDsl.g:679:6: (lv_right_6_0= ruleExpressionLvl6 )
            	    // InternalJsonDsl.g:680:7: lv_right_6_0= ruleExpressionLvl6
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
    // InternalJsonDsl.g:703:1: entryRuleExpressionLvl6 returns [EObject current=null] : iv_ruleExpressionLvl6= ruleExpressionLvl6 EOF ;
    public final EObject entryRuleExpressionLvl6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl6 = null;


        try {
            // InternalJsonDsl.g:703:55: (iv_ruleExpressionLvl6= ruleExpressionLvl6 EOF )
            // InternalJsonDsl.g:704:2: iv_ruleExpressionLvl6= ruleExpressionLvl6 EOF
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
    // InternalJsonDsl.g:710:1: ruleExpressionLvl6 returns [EObject current=null] : (this_ExpressionLvl7_0= ruleExpressionLvl7 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) ) )* ) ;
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
            // InternalJsonDsl.g:716:2: ( (this_ExpressionLvl7_0= ruleExpressionLvl7 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) ) )* ) )
            // InternalJsonDsl.g:717:2: (this_ExpressionLvl7_0= ruleExpressionLvl7 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) ) )* )
            {
            // InternalJsonDsl.g:717:2: (this_ExpressionLvl7_0= ruleExpressionLvl7 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) ) )* )
            // InternalJsonDsl.g:718:3: this_ExpressionLvl7_0= ruleExpressionLvl7 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) ) )*
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
            // InternalJsonDsl.g:726:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt8=1;
                    }
                    break;
                case 27:
                    {
                    alt8=2;
                    }
                    break;
                case 28:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalJsonDsl.g:727:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) )
            	    {
            	    // InternalJsonDsl.g:727:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) ) )
            	    // InternalJsonDsl.g:728:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLvl7 ) )
            	    {
            	    // InternalJsonDsl.g:728:5: ()
            	    // InternalJsonDsl.g:729:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl6Access().getMultiplicationExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLvl6Access().getAsteriskKeyword_1_0_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:739:5: ( (lv_right_3_0= ruleExpressionLvl7 ) )
            	    // InternalJsonDsl.g:740:6: (lv_right_3_0= ruleExpressionLvl7 )
            	    {
            	    // InternalJsonDsl.g:740:6: (lv_right_3_0= ruleExpressionLvl7 )
            	    // InternalJsonDsl.g:741:7: lv_right_3_0= ruleExpressionLvl7
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
            	    // InternalJsonDsl.g:760:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) )
            	    {
            	    // InternalJsonDsl.g:760:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) ) )
            	    // InternalJsonDsl.g:761:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLvl7 ) )
            	    {
            	    // InternalJsonDsl.g:761:5: ()
            	    // InternalJsonDsl.g:762:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl6Access().getDivisionExpressionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLvl6Access().getSolidusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:772:5: ( (lv_right_6_0= ruleExpressionLvl7 ) )
            	    // InternalJsonDsl.g:773:6: (lv_right_6_0= ruleExpressionLvl7 )
            	    {
            	    // InternalJsonDsl.g:773:6: (lv_right_6_0= ruleExpressionLvl7 )
            	    // InternalJsonDsl.g:774:7: lv_right_6_0= ruleExpressionLvl7
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
            	    // InternalJsonDsl.g:793:4: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) )
            	    {
            	    // InternalJsonDsl.g:793:4: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) ) )
            	    // InternalJsonDsl.g:794:5: () otherlv_8= '%' ( (lv_right_9_0= ruleExpressionLvl7 ) )
            	    {
            	    // InternalJsonDsl.g:794:5: ()
            	    // InternalJsonDsl.g:795:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl6Access().getModuloExpressionLeftAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,28,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getExpressionLvl6Access().getPercentSignKeyword_1_2_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:805:5: ( (lv_right_9_0= ruleExpressionLvl7 ) )
            	    // InternalJsonDsl.g:806:6: (lv_right_9_0= ruleExpressionLvl7 )
            	    {
            	    // InternalJsonDsl.g:806:6: (lv_right_9_0= ruleExpressionLvl7 )
            	    // InternalJsonDsl.g:807:7: lv_right_9_0= ruleExpressionLvl7
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
    // InternalJsonDsl.g:830:1: entryRuleExpressionLvl7 returns [EObject current=null] : iv_ruleExpressionLvl7= ruleExpressionLvl7 EOF ;
    public final EObject entryRuleExpressionLvl7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl7 = null;


        try {
            // InternalJsonDsl.g:830:55: (iv_ruleExpressionLvl7= ruleExpressionLvl7 EOF )
            // InternalJsonDsl.g:831:2: iv_ruleExpressionLvl7= ruleExpressionLvl7 EOF
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
    // InternalJsonDsl.g:837:1: ruleExpressionLvl7 returns [EObject current=null] : (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_UnaryPlusExpression_1= ruleUnaryPlusExpression | this_ExpressionLvl8_2= ruleExpressionLvl8 ) ;
    public final EObject ruleExpressionLvl7() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryMinusExpression_0 = null;

        EObject this_UnaryPlusExpression_1 = null;

        EObject this_ExpressionLvl8_2 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:843:2: ( (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_UnaryPlusExpression_1= ruleUnaryPlusExpression | this_ExpressionLvl8_2= ruleExpressionLvl8 ) )
            // InternalJsonDsl.g:844:2: (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_UnaryPlusExpression_1= ruleUnaryPlusExpression | this_ExpressionLvl8_2= ruleExpressionLvl8 )
            {
            // InternalJsonDsl.g:844:2: (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_UnaryPlusExpression_1= ruleUnaryPlusExpression | this_ExpressionLvl8_2= ruleExpressionLvl8 )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 24:
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
            case 29:
            case 30:
            case 33:
            case 35:
            case 37:
            case 38:
            case 40:
            case 42:
            case 43:
            case 44:
            case 46:
            case 49:
            case 50:
            case 52:
            case 53:
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
                    // InternalJsonDsl.g:845:3: this_UnaryMinusExpression_0= ruleUnaryMinusExpression
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
                    // InternalJsonDsl.g:854:3: this_UnaryPlusExpression_1= ruleUnaryPlusExpression
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
                    // InternalJsonDsl.g:863:3: this_ExpressionLvl8_2= ruleExpressionLvl8
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
    // InternalJsonDsl.g:875:1: entryRuleUnaryMinusExpression returns [EObject current=null] : iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF ;
    public final EObject entryRuleUnaryMinusExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryMinusExpression = null;


        try {
            // InternalJsonDsl.g:875:61: (iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF )
            // InternalJsonDsl.g:876:2: iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF
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
    // InternalJsonDsl.g:882:1: ruleUnaryMinusExpression returns [EObject current=null] : (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) ) ;
    public final EObject ruleUnaryMinusExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:888:2: ( (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) ) )
            // InternalJsonDsl.g:889:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) )
            {
            // InternalJsonDsl.g:889:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) )
            // InternalJsonDsl.g:890:3: otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLvl7 ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnaryMinusExpressionAccess().getHyphenMinusKeyword_0());
              		
            }
            // InternalJsonDsl.g:894:3: ( (lv_sub_1_0= ruleExpressionLvl7 ) )
            // InternalJsonDsl.g:895:4: (lv_sub_1_0= ruleExpressionLvl7 )
            {
            // InternalJsonDsl.g:895:4: (lv_sub_1_0= ruleExpressionLvl7 )
            // InternalJsonDsl.g:896:5: lv_sub_1_0= ruleExpressionLvl7
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
    // InternalJsonDsl.g:917:1: entryRuleUnaryPlusExpression returns [EObject current=null] : iv_ruleUnaryPlusExpression= ruleUnaryPlusExpression EOF ;
    public final EObject entryRuleUnaryPlusExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPlusExpression = null;


        try {
            // InternalJsonDsl.g:917:60: (iv_ruleUnaryPlusExpression= ruleUnaryPlusExpression EOF )
            // InternalJsonDsl.g:918:2: iv_ruleUnaryPlusExpression= ruleUnaryPlusExpression EOF
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
    // InternalJsonDsl.g:924:1: ruleUnaryPlusExpression returns [EObject current=null] : (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) ) ;
    public final EObject ruleUnaryPlusExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:930:2: ( (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) ) )
            // InternalJsonDsl.g:931:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) )
            {
            // InternalJsonDsl.g:931:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLvl7 ) ) )
            // InternalJsonDsl.g:932:3: otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLvl7 ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnaryPlusExpressionAccess().getPlusSignKeyword_0());
              		
            }
            // InternalJsonDsl.g:936:3: ( (lv_sub_1_0= ruleExpressionLvl7 ) )
            // InternalJsonDsl.g:937:4: (lv_sub_1_0= ruleExpressionLvl7 )
            {
            // InternalJsonDsl.g:937:4: (lv_sub_1_0= ruleExpressionLvl7 )
            // InternalJsonDsl.g:938:5: lv_sub_1_0= ruleExpressionLvl7
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
    // InternalJsonDsl.g:959:1: entryRuleExpressionLvl8 returns [EObject current=null] : iv_ruleExpressionLvl8= ruleExpressionLvl8 EOF ;
    public final EObject entryRuleExpressionLvl8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl8 = null;


        try {
            // InternalJsonDsl.g:959:55: (iv_ruleExpressionLvl8= ruleExpressionLvl8 EOF )
            // InternalJsonDsl.g:960:2: iv_ruleExpressionLvl8= ruleExpressionLvl8 EOF
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
    // InternalJsonDsl.g:966:1: ruleExpressionLvl8 returns [EObject current=null] : (this_LogicalNegationExpression_0= ruleLogicalNegationExpression | this_ExpressionLvl9_1= ruleExpressionLvl9 ) ;
    public final EObject ruleExpressionLvl8() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalNegationExpression_0 = null;

        EObject this_ExpressionLvl9_1 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:972:2: ( (this_LogicalNegationExpression_0= ruleLogicalNegationExpression | this_ExpressionLvl9_1= ruleExpressionLvl9 ) )
            // InternalJsonDsl.g:973:2: (this_LogicalNegationExpression_0= ruleLogicalNegationExpression | this_ExpressionLvl9_1= ruleExpressionLvl9 )
            {
            // InternalJsonDsl.g:973:2: (this_LogicalNegationExpression_0= ruleLogicalNegationExpression | this_ExpressionLvl9_1= ruleExpressionLvl9 )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_NULL)||LA10_0==30||LA10_0==33||LA10_0==35||(LA10_0>=37 && LA10_0<=38)||LA10_0==40||(LA10_0>=42 && LA10_0<=44)||LA10_0==46||(LA10_0>=49 && LA10_0<=50)||(LA10_0>=52 && LA10_0<=53)) ) {
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
                    // InternalJsonDsl.g:974:3: this_LogicalNegationExpression_0= ruleLogicalNegationExpression
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
                    // InternalJsonDsl.g:983:3: this_ExpressionLvl9_1= ruleExpressionLvl9
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
    // InternalJsonDsl.g:995:1: entryRuleLogicalNegationExpression returns [EObject current=null] : iv_ruleLogicalNegationExpression= ruleLogicalNegationExpression EOF ;
    public final EObject entryRuleLogicalNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNegationExpression = null;


        try {
            // InternalJsonDsl.g:995:66: (iv_ruleLogicalNegationExpression= ruleLogicalNegationExpression EOF )
            // InternalJsonDsl.g:996:2: iv_ruleLogicalNegationExpression= ruleLogicalNegationExpression EOF
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
    // InternalJsonDsl.g:1002:1: ruleLogicalNegationExpression returns [EObject current=null] : (otherlv_0= '!' ( (lv_sub_1_0= ruleExpressionLvl8 ) ) ) ;
    public final EObject ruleLogicalNegationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1008:2: ( (otherlv_0= '!' ( (lv_sub_1_0= ruleExpressionLvl8 ) ) ) )
            // InternalJsonDsl.g:1009:2: (otherlv_0= '!' ( (lv_sub_1_0= ruleExpressionLvl8 ) ) )
            {
            // InternalJsonDsl.g:1009:2: (otherlv_0= '!' ( (lv_sub_1_0= ruleExpressionLvl8 ) ) )
            // InternalJsonDsl.g:1010:3: otherlv_0= '!' ( (lv_sub_1_0= ruleExpressionLvl8 ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLogicalNegationExpressionAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalJsonDsl.g:1014:3: ( (lv_sub_1_0= ruleExpressionLvl8 ) )
            // InternalJsonDsl.g:1015:4: (lv_sub_1_0= ruleExpressionLvl8 )
            {
            // InternalJsonDsl.g:1015:4: (lv_sub_1_0= ruleExpressionLvl8 )
            // InternalJsonDsl.g:1016:5: lv_sub_1_0= ruleExpressionLvl8
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
    // InternalJsonDsl.g:1037:1: entryRuleExpressionLvl9 returns [EObject current=null] : iv_ruleExpressionLvl9= ruleExpressionLvl9 EOF ;
    public final EObject entryRuleExpressionLvl9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLvl9 = null;


        try {
            // InternalJsonDsl.g:1037:55: (iv_ruleExpressionLvl9= ruleExpressionLvl9 EOF )
            // InternalJsonDsl.g:1038:2: iv_ruleExpressionLvl9= ruleExpressionLvl9 EOF
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
    // InternalJsonDsl.g:1044:1: ruleExpressionLvl9 returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' ) | ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) ) )* ) ;
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
            // InternalJsonDsl.g:1050:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' ) | ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) ) )* ) )
            // InternalJsonDsl.g:1051:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' ) | ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) ) )* )
            {
            // InternalJsonDsl.g:1051:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' ) | ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) ) )* )
            // InternalJsonDsl.g:1052:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' ) | ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) ) )*
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
            // InternalJsonDsl.g:1060:3: ( ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' ) | ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }
                else if ( (LA11_0==32) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJsonDsl.g:1061:4: ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' )
            	    {
            	    // InternalJsonDsl.g:1061:4: ( () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']' )
            	    // InternalJsonDsl.g:1062:5: () otherlv_2= '[' ( (lv_specifier_3_0= ruleArraySpecifier ) ) otherlv_4= ']'
            	    {
            	    // InternalJsonDsl.g:1062:5: ()
            	    // InternalJsonDsl.g:1063:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl9Access().getArrayCallCalleeAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLvl9Access().getLeftSquareBracketKeyword_1_0_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:1073:5: ( (lv_specifier_3_0= ruleArraySpecifier ) )
            	    // InternalJsonDsl.g:1074:6: (lv_specifier_3_0= ruleArraySpecifier )
            	    {
            	    // InternalJsonDsl.g:1074:6: (lv_specifier_3_0= ruleArraySpecifier )
            	    // InternalJsonDsl.g:1075:7: lv_specifier_3_0= ruleArraySpecifier
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

            	    otherlv_4=(Token)match(input,31,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getExpressionLvl9Access().getRightSquareBracketKeyword_1_0_3());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalJsonDsl.g:1098:4: ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) )
            	    {
            	    // InternalJsonDsl.g:1098:4: ( () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) ) )
            	    // InternalJsonDsl.g:1099:5: () otherlv_6= '~' ( (lv_field_7_0= RULE_STRING ) )
            	    {
            	    // InternalJsonDsl.g:1099:5: ()
            	    // InternalJsonDsl.g:1100:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLvl9Access().getFieldCallCalleeAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_6=(Token)match(input,32,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getExpressionLvl9Access().getTildeKeyword_1_1_1());
            	      				
            	    }
            	    // InternalJsonDsl.g:1110:5: ( (lv_field_7_0= RULE_STRING ) )
            	    // InternalJsonDsl.g:1111:6: (lv_field_7_0= RULE_STRING )
            	    {
            	    // InternalJsonDsl.g:1111:6: (lv_field_7_0= RULE_STRING )
            	    // InternalJsonDsl.g:1112:7: lv_field_7_0= RULE_STRING
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
    // InternalJsonDsl.g:1134:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalJsonDsl.g:1134:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalJsonDsl.g:1135:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalJsonDsl.g:1141:1: rulePrimaryExpression returns [EObject current=null] : (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | this_BracketExpression_3= ruleBracketExpression | this_PointerCall_4= rulePointerCall ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_VariableCall_0 = null;

        EObject this_Constant_1 = null;

        EObject this_FunctionCall_2 = null;

        EObject this_BracketExpression_3 = null;

        EObject this_PointerCall_4 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1147:2: ( (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | this_BracketExpression_3= ruleBracketExpression | this_PointerCall_4= rulePointerCall ) )
            // InternalJsonDsl.g:1148:2: (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | this_BracketExpression_3= ruleBracketExpression | this_PointerCall_4= rulePointerCall )
            {
            // InternalJsonDsl.g:1148:2: (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | this_BracketExpression_3= ruleBracketExpression | this_PointerCall_4= rulePointerCall )
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
            case 30:
            case 53:
                {
                alt12=2;
                }
                break;
            case 37:
            case 38:
            case 40:
            case 42:
            case 43:
            case 44:
            case 46:
            case 49:
            case 50:
            case 52:
                {
                alt12=3;
                }
                break;
            case 33:
                {
                alt12=4;
                }
                break;
            case 35:
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
                    // InternalJsonDsl.g:1149:3: this_VariableCall_0= ruleVariableCall
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
                    // InternalJsonDsl.g:1158:3: this_Constant_1= ruleConstant
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
                    // InternalJsonDsl.g:1167:3: this_FunctionCall_2= ruleFunctionCall
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
                    // InternalJsonDsl.g:1176:3: this_BracketExpression_3= ruleBracketExpression
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
                    // InternalJsonDsl.g:1185:3: this_PointerCall_4= rulePointerCall
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
    // InternalJsonDsl.g:1197:1: entryRuleBracketExpression returns [EObject current=null] : iv_ruleBracketExpression= ruleBracketExpression EOF ;
    public final EObject entryRuleBracketExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracketExpression = null;


        try {
            // InternalJsonDsl.g:1197:58: (iv_ruleBracketExpression= ruleBracketExpression EOF )
            // InternalJsonDsl.g:1198:2: iv_ruleBracketExpression= ruleBracketExpression EOF
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
    // InternalJsonDsl.g:1204:1: ruleBracketExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracketExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1210:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalJsonDsl.g:1211:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalJsonDsl.g:1211:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalJsonDsl.g:1212:3: otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBracketExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalJsonDsl.g:1216:3: ( (lv_sub_1_0= ruleExpression ) )
            // InternalJsonDsl.g:1217:4: (lv_sub_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:1217:4: (lv_sub_1_0= ruleExpression )
            // InternalJsonDsl.g:1218:5: lv_sub_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:1243:1: entryRulePointerCall returns [EObject current=null] : iv_rulePointerCall= rulePointerCall EOF ;
    public final EObject entryRulePointerCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerCall = null;


        try {
            // InternalJsonDsl.g:1243:52: (iv_rulePointerCall= rulePointerCall EOF )
            // InternalJsonDsl.g:1244:2: iv_rulePointerCall= rulePointerCall EOF
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
    // InternalJsonDsl.g:1250:1: rulePointerCall returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject rulePointerCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1256:2: ( ( () otherlv_1= '.' ) )
            // InternalJsonDsl.g:1257:2: ( () otherlv_1= '.' )
            {
            // InternalJsonDsl.g:1257:2: ( () otherlv_1= '.' )
            // InternalJsonDsl.g:1258:3: () otherlv_1= '.'
            {
            // InternalJsonDsl.g:1258:3: ()
            // InternalJsonDsl.g:1259:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPointerCallAccess().getPointerCallAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:1273:1: entryRuleVariableCall returns [EObject current=null] : iv_ruleVariableCall= ruleVariableCall EOF ;
    public final EObject entryRuleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCall = null;


        try {
            // InternalJsonDsl.g:1273:53: (iv_ruleVariableCall= ruleVariableCall EOF )
            // InternalJsonDsl.g:1274:2: iv_ruleVariableCall= ruleVariableCall EOF
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
    // InternalJsonDsl.g:1280:1: ruleVariableCall returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1286:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalJsonDsl.g:1287:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalJsonDsl.g:1287:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalJsonDsl.g:1288:3: (lv_name_0_0= RULE_ID )
            {
            // InternalJsonDsl.g:1288:3: (lv_name_0_0= RULE_ID )
            // InternalJsonDsl.g:1289:4: lv_name_0_0= RULE_ID
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
    // InternalJsonDsl.g:1308:1: entryRuleArraySpecifier returns [EObject current=null] : iv_ruleArraySpecifier= ruleArraySpecifier EOF ;
    public final EObject entryRuleArraySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecifier = null;


        try {
            // InternalJsonDsl.g:1308:55: (iv_ruleArraySpecifier= ruleArraySpecifier EOF )
            // InternalJsonDsl.g:1309:2: iv_ruleArraySpecifier= ruleArraySpecifier EOF
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
    // InternalJsonDsl.g:1315:1: ruleArraySpecifier returns [EObject current=null] : (this_UnarySpecifier_0= ruleUnarySpecifier | this_RangeSpecifier_1= ruleRangeSpecifier ) ;
    public final EObject ruleArraySpecifier() throws RecognitionException {
        EObject current = null;

        EObject this_UnarySpecifier_0 = null;

        EObject this_RangeSpecifier_1 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1321:2: ( (this_UnarySpecifier_0= ruleUnarySpecifier | this_RangeSpecifier_1= ruleRangeSpecifier ) )
            // InternalJsonDsl.g:1322:2: (this_UnarySpecifier_0= ruleUnarySpecifier | this_RangeSpecifier_1= ruleRangeSpecifier )
            {
            // InternalJsonDsl.g:1322:2: (this_UnarySpecifier_0= ruleUnarySpecifier | this_RangeSpecifier_1= ruleRangeSpecifier )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==31) ) {
                    alt13=1;
                }
                else if ( (LA13_1==36) ) {
                    alt13=2;
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
                    // InternalJsonDsl.g:1323:3: this_UnarySpecifier_0= ruleUnarySpecifier
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
                    // InternalJsonDsl.g:1332:3: this_RangeSpecifier_1= ruleRangeSpecifier
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
    // InternalJsonDsl.g:1344:1: entryRuleUnarySpecifier returns [EObject current=null] : iv_ruleUnarySpecifier= ruleUnarySpecifier EOF ;
    public final EObject entryRuleUnarySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnarySpecifier = null;


        try {
            // InternalJsonDsl.g:1344:55: (iv_ruleUnarySpecifier= ruleUnarySpecifier EOF )
            // InternalJsonDsl.g:1345:2: iv_ruleUnarySpecifier= ruleUnarySpecifier EOF
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
    // InternalJsonDsl.g:1351:1: ruleUnarySpecifier returns [EObject current=null] : ( (lv_index_0_0= RULE_INT ) ) ;
    public final EObject ruleUnarySpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_index_0_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1357:2: ( ( (lv_index_0_0= RULE_INT ) ) )
            // InternalJsonDsl.g:1358:2: ( (lv_index_0_0= RULE_INT ) )
            {
            // InternalJsonDsl.g:1358:2: ( (lv_index_0_0= RULE_INT ) )
            // InternalJsonDsl.g:1359:3: (lv_index_0_0= RULE_INT )
            {
            // InternalJsonDsl.g:1359:3: (lv_index_0_0= RULE_INT )
            // InternalJsonDsl.g:1360:4: lv_index_0_0= RULE_INT
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
    // InternalJsonDsl.g:1379:1: entryRuleRangeSpecifier returns [EObject current=null] : iv_ruleRangeSpecifier= ruleRangeSpecifier EOF ;
    public final EObject entryRuleRangeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeSpecifier = null;


        try {
            // InternalJsonDsl.g:1379:55: (iv_ruleRangeSpecifier= ruleRangeSpecifier EOF )
            // InternalJsonDsl.g:1380:2: iv_ruleRangeSpecifier= ruleRangeSpecifier EOF
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
    // InternalJsonDsl.g:1386:1: ruleRangeSpecifier returns [EObject current=null] : ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_to_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRangeSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_to_2_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1392:2: ( ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_to_2_0= RULE_INT ) ) ) )
            // InternalJsonDsl.g:1393:2: ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_to_2_0= RULE_INT ) ) )
            {
            // InternalJsonDsl.g:1393:2: ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_to_2_0= RULE_INT ) ) )
            // InternalJsonDsl.g:1394:3: ( (lv_from_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_to_2_0= RULE_INT ) )
            {
            // InternalJsonDsl.g:1394:3: ( (lv_from_0_0= RULE_INT ) )
            // InternalJsonDsl.g:1395:4: (lv_from_0_0= RULE_INT )
            {
            // InternalJsonDsl.g:1395:4: (lv_from_0_0= RULE_INT )
            // InternalJsonDsl.g:1396:5: lv_from_0_0= RULE_INT
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

            otherlv_1=(Token)match(input,36,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRangeSpecifierAccess().getColonKeyword_1());
              		
            }
            // InternalJsonDsl.g:1416:3: ( (lv_to_2_0= RULE_INT ) )
            // InternalJsonDsl.g:1417:4: (lv_to_2_0= RULE_INT )
            {
            // InternalJsonDsl.g:1417:4: (lv_to_2_0= RULE_INT )
            // InternalJsonDsl.g:1418:5: lv_to_2_0= RULE_INT
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
    // InternalJsonDsl.g:1438:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalJsonDsl.g:1438:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalJsonDsl.g:1439:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalJsonDsl.g:1445:1: ruleFunctionCall returns [EObject current=null] : (this_IOFunctions_0= ruleIOFunctions | this_InfoFunctions_1= ruleInfoFunctions | this_ManipFunctions_2= ruleManipFunctions | this_ArithFunctions_3= ruleArithFunctions ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject this_IOFunctions_0 = null;

        EObject this_InfoFunctions_1 = null;

        EObject this_ManipFunctions_2 = null;

        EObject this_ArithFunctions_3 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1451:2: ( (this_IOFunctions_0= ruleIOFunctions | this_InfoFunctions_1= ruleInfoFunctions | this_ManipFunctions_2= ruleManipFunctions | this_ArithFunctions_3= ruleArithFunctions ) )
            // InternalJsonDsl.g:1452:2: (this_IOFunctions_0= ruleIOFunctions | this_InfoFunctions_1= ruleInfoFunctions | this_ManipFunctions_2= ruleManipFunctions | this_ArithFunctions_3= ruleArithFunctions )
            {
            // InternalJsonDsl.g:1452:2: (this_IOFunctions_0= ruleIOFunctions | this_InfoFunctions_1= ruleInfoFunctions | this_ManipFunctions_2= ruleManipFunctions | this_ArithFunctions_3= ruleArithFunctions )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 40:
                {
                alt14=1;
                }
                break;
            case 42:
            case 43:
            case 44:
            case 49:
                {
                alt14=2;
                }
                break;
            case 46:
                {
                alt14=3;
                }
                break;
            case 50:
            case 52:
                {
                alt14=4;
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
                    // InternalJsonDsl.g:1453:3: this_IOFunctions_0= ruleIOFunctions
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
                    // InternalJsonDsl.g:1462:3: this_InfoFunctions_1= ruleInfoFunctions
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
                    // InternalJsonDsl.g:1471:3: this_ManipFunctions_2= ruleManipFunctions
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
                    // InternalJsonDsl.g:1480:3: this_ArithFunctions_3= ruleArithFunctions
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
    // InternalJsonDsl.g:1492:1: entryRuleIOFunctions returns [EObject current=null] : iv_ruleIOFunctions= ruleIOFunctions EOF ;
    public final EObject entryRuleIOFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOFunctions = null;


        try {
            // InternalJsonDsl.g:1492:52: (iv_ruleIOFunctions= ruleIOFunctions EOF )
            // InternalJsonDsl.g:1493:2: iv_ruleIOFunctions= ruleIOFunctions EOF
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
    // InternalJsonDsl.g:1499:1: ruleIOFunctions returns [EObject current=null] : (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport ) ;
    public final EObject ruleIOFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Load_0 = null;

        EObject this_Store_1 = null;

        EObject this_Export_2 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1505:2: ( (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport ) )
            // InternalJsonDsl.g:1506:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport )
            {
            // InternalJsonDsl.g:1506:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 38:
                {
                alt15=2;
                }
                break;
            case 40:
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
                    // InternalJsonDsl.g:1507:3: this_Load_0= ruleLoad
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
                    // InternalJsonDsl.g:1516:3: this_Store_1= ruleStore
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
                    // InternalJsonDsl.g:1525:3: this_Export_2= ruleExport
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
    // InternalJsonDsl.g:1537:1: entryRuleInfoFunctions returns [EObject current=null] : iv_ruleInfoFunctions= ruleInfoFunctions EOF ;
    public final EObject entryRuleInfoFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoFunctions = null;


        try {
            // InternalJsonDsl.g:1537:54: (iv_ruleInfoFunctions= ruleInfoFunctions EOF )
            // InternalJsonDsl.g:1538:2: iv_ruleInfoFunctions= ruleInfoFunctions EOF
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
    // InternalJsonDsl.g:1544:1: ruleInfoFunctions returns [EObject current=null] : (this_Depth_0= ruleDepth | this_FieldInfo_1= ruleFieldInfo | this_Contains_2= ruleContains | this_Length_3= ruleLength ) ;
    public final EObject ruleInfoFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Depth_0 = null;

        EObject this_FieldInfo_1 = null;

        EObject this_Contains_2 = null;

        EObject this_Length_3 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1550:2: ( (this_Depth_0= ruleDepth | this_FieldInfo_1= ruleFieldInfo | this_Contains_2= ruleContains | this_Length_3= ruleLength ) )
            // InternalJsonDsl.g:1551:2: (this_Depth_0= ruleDepth | this_FieldInfo_1= ruleFieldInfo | this_Contains_2= ruleContains | this_Length_3= ruleLength )
            {
            // InternalJsonDsl.g:1551:2: (this_Depth_0= ruleDepth | this_FieldInfo_1= ruleFieldInfo | this_Contains_2= ruleContains | this_Length_3= ruleLength )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt16=1;
                }
                break;
            case 43:
                {
                alt16=2;
                }
                break;
            case 44:
                {
                alt16=3;
                }
                break;
            case 49:
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
                    // InternalJsonDsl.g:1552:3: this_Depth_0= ruleDepth
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
                    // InternalJsonDsl.g:1561:3: this_FieldInfo_1= ruleFieldInfo
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
                    // InternalJsonDsl.g:1570:3: this_Contains_2= ruleContains
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
                    // InternalJsonDsl.g:1579:3: this_Length_3= ruleLength
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
    // InternalJsonDsl.g:1591:1: entryRuleManipFunctions returns [EObject current=null] : iv_ruleManipFunctions= ruleManipFunctions EOF ;
    public final EObject entryRuleManipFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManipFunctions = null;


        try {
            // InternalJsonDsl.g:1591:55: (iv_ruleManipFunctions= ruleManipFunctions EOF )
            // InternalJsonDsl.g:1592:2: iv_ruleManipFunctions= ruleManipFunctions EOF
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
    // InternalJsonDsl.g:1598:1: ruleManipFunctions returns [EObject current=null] : this_Select_0= ruleSelect ;
    public final EObject ruleManipFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Select_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1604:2: (this_Select_0= ruleSelect )
            // InternalJsonDsl.g:1605:2: this_Select_0= ruleSelect
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getManipFunctionsAccess().getSelectParserRuleCall());
              	
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
    // InternalJsonDsl.g:1616:1: entryRuleArithFunctions returns [EObject current=null] : iv_ruleArithFunctions= ruleArithFunctions EOF ;
    public final EObject entryRuleArithFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithFunctions = null;


        try {
            // InternalJsonDsl.g:1616:55: (iv_ruleArithFunctions= ruleArithFunctions EOF )
            // InternalJsonDsl.g:1617:2: iv_ruleArithFunctions= ruleArithFunctions EOF
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
    // InternalJsonDsl.g:1623:1: ruleArithFunctions returns [EObject current=null] : (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) ;
    public final EObject ruleArithFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Sum_0 = null;

        EObject this_Product_1 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1629:2: ( (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) )
            // InternalJsonDsl.g:1630:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct )
            {
            // InternalJsonDsl.g:1630:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==50) ) {
                alt17=1;
            }
            else if ( (LA17_0==52) ) {
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
                    // InternalJsonDsl.g:1631:3: this_Sum_0= ruleSum
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
                    // InternalJsonDsl.g:1640:3: this_Product_1= ruleProduct
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


    // $ANTLR start "entryRuleLoad"
    // InternalJsonDsl.g:1652:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalJsonDsl.g:1652:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalJsonDsl.g:1653:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalJsonDsl.g:1659:1: ruleLoad returns [EObject current=null] : ( (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) ) | (otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')' ) | ( () otherlv_7= 'LOAD' ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fileName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_fileName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1665:2: ( ( (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) ) | (otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')' ) | ( () otherlv_7= 'LOAD' ) ) )
            // InternalJsonDsl.g:1666:2: ( (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) ) | (otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')' ) | ( () otherlv_7= 'LOAD' ) )
            {
            // InternalJsonDsl.g:1666:2: ( (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) ) | (otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')' ) | ( () otherlv_7= 'LOAD' ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt18=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt18=1;
                    }
                    break;
                case EOF:
                case 14:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                case 36:
                case 45:
                case 54:
                    {
                    alt18=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalJsonDsl.g:1667:3: (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) )
                    {
                    // InternalJsonDsl.g:1667:3: (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) )
                    // InternalJsonDsl.g:1668:4: otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLOADKeyword_0_0());
                      			
                    }
                    // InternalJsonDsl.g:1672:4: ( (lv_fileName_1_0= RULE_STRING ) )
                    // InternalJsonDsl.g:1673:5: (lv_fileName_1_0= RULE_STRING )
                    {
                    // InternalJsonDsl.g:1673:5: (lv_fileName_1_0= RULE_STRING )
                    // InternalJsonDsl.g:1674:6: lv_fileName_1_0= RULE_STRING
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
                    // InternalJsonDsl.g:1692:3: (otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')' )
                    {
                    // InternalJsonDsl.g:1692:3: (otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')' )
                    // InternalJsonDsl.g:1693:4: otherlv_2= 'LOAD' otherlv_3= '(' ( (lv_fileName_4_0= RULE_STRING ) ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getLOADKeyword_1_0());
                      			
                    }
                    otherlv_3=(Token)match(input,33,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalJsonDsl.g:1701:4: ( (lv_fileName_4_0= RULE_STRING ) )
                    // InternalJsonDsl.g:1702:5: (lv_fileName_4_0= RULE_STRING )
                    {
                    // InternalJsonDsl.g:1702:5: (lv_fileName_4_0= RULE_STRING )
                    // InternalJsonDsl.g:1703:6: lv_fileName_4_0= RULE_STRING
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

                    otherlv_5=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getLoadAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:1725:3: ( () otherlv_7= 'LOAD' )
                    {
                    // InternalJsonDsl.g:1725:3: ( () otherlv_7= 'LOAD' )
                    // InternalJsonDsl.g:1726:4: () otherlv_7= 'LOAD'
                    {
                    // InternalJsonDsl.g:1726:4: ()
                    // InternalJsonDsl.g:1727:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLoadAccess().getLoadAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getLoadAccess().getLOADKeyword_2_1());
                      			
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
    // InternalJsonDsl.g:1742:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalJsonDsl.g:1742:46: (iv_ruleStore= ruleStore EOF )
            // InternalJsonDsl.g:1743:2: iv_ruleStore= ruleStore EOF
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
    // InternalJsonDsl.g:1749:1: ruleStore returns [EObject current=null] : (otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' ) ;
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
            // InternalJsonDsl.g:1755:2: ( (otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' ) )
            // InternalJsonDsl.g:1756:2: (otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' )
            {
            // InternalJsonDsl.g:1756:2: (otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' )
            // InternalJsonDsl.g:1757:3: otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getSTOREKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:1765:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:1766:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:1766:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:1767:5: lv_expression_2_0= ruleExpression
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

            otherlv_3=(Token)match(input,34,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,39,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getStoreAccess().getINKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,33,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:1796:3: ( (lv_fileName_6_0= RULE_STRING ) )
            // InternalJsonDsl.g:1797:4: (lv_fileName_6_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1797:4: (lv_fileName_6_0= RULE_STRING )
            // InternalJsonDsl.g:1798:5: lv_fileName_6_0= RULE_STRING
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

            otherlv_7=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:1822:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalJsonDsl.g:1822:47: (iv_ruleExport= ruleExport EOF )
            // InternalJsonDsl.g:1823:2: iv_ruleExport= ruleExport EOF
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
    // InternalJsonDsl.g:1829:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' )? ) ;
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
            // InternalJsonDsl.g:1835:2: ( (otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' )? ) )
            // InternalJsonDsl.g:1836:2: (otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' )? )
            {
            // InternalJsonDsl.g:1836:2: (otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' )? )
            // InternalJsonDsl.g:1837:3: otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORT_CSVKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:1845:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:1846:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:1846:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:1847:5: lv_expression_2_0= ruleExpression
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

            otherlv_3=(Token)match(input,34,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getExportAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalJsonDsl.g:1868:3: (otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJsonDsl.g:1869:4: otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getExportAccess().getINKeyword_4_0());
                      			
                    }
                    otherlv_5=(Token)match(input,33,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getExportAccess().getLeftParenthesisKeyword_4_1());
                      			
                    }
                    // InternalJsonDsl.g:1877:4: ( (lv_fileName_6_0= RULE_STRING ) )
                    // InternalJsonDsl.g:1878:5: (lv_fileName_6_0= RULE_STRING )
                    {
                    // InternalJsonDsl.g:1878:5: (lv_fileName_6_0= RULE_STRING )
                    // InternalJsonDsl.g:1879:6: lv_fileName_6_0= RULE_STRING
                    {
                    lv_fileName_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_fileName_6_0, grammarAccess.getExportAccess().getFileNameSTRINGTerminalRuleCall_4_2_0());
                      					
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

                    otherlv_7=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getExportAccess().getRightParenthesisKeyword_4_3());
                      			
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
    // $ANTLR end "ruleExport"


    // $ANTLR start "entryRulePrint"
    // InternalJsonDsl.g:1904:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalJsonDsl.g:1904:46: (iv_rulePrint= rulePrint EOF )
            // InternalJsonDsl.g:1905:2: iv_rulePrint= rulePrint EOF
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
    // InternalJsonDsl.g:1911:1: rulePrint returns [EObject current=null] : (otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1917:2: ( (otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJsonDsl.g:1918:2: (otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJsonDsl.g:1918:2: (otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJsonDsl.g:1919:3: otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPRINTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:1927:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:1928:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:1928:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:1929:5: lv_expression_2_0= ruleExpression
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

            otherlv_3=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:1954:1: entryRuleDepth returns [EObject current=null] : iv_ruleDepth= ruleDepth EOF ;
    public final EObject entryRuleDepth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepth = null;


        try {
            // InternalJsonDsl.g:1954:46: (iv_ruleDepth= ruleDepth EOF )
            // InternalJsonDsl.g:1955:2: iv_ruleDepth= ruleDepth EOF
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
    // InternalJsonDsl.g:1961:1: ruleDepth returns [EObject current=null] : (otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleDepth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1967:2: ( (otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJsonDsl.g:1968:2: (otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJsonDsl.g:1968:2: (otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJsonDsl.g:1969:3: otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDepthAccess().getGET_DEPTHKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDepthAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:1977:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:1978:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:1978:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:1979:5: lv_expression_2_0= ruleExpression
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

            otherlv_3=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:2004:1: entryRuleFieldInfo returns [EObject current=null] : iv_ruleFieldInfo= ruleFieldInfo EOF ;
    public final EObject entryRuleFieldInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInfo = null;


        try {
            // InternalJsonDsl.g:2004:50: (iv_ruleFieldInfo= ruleFieldInfo EOF )
            // InternalJsonDsl.g:2005:2: iv_ruleFieldInfo= ruleFieldInfo EOF
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
    // InternalJsonDsl.g:2011:1: ruleFieldInfo returns [EObject current=null] : (otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleFieldInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2017:2: ( (otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJsonDsl.g:2018:2: (otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJsonDsl.g:2018:2: (otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJsonDsl.g:2019:3: otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldInfoAccess().getGET_INFOSKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldInfoAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2027:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2028:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2028:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2029:5: lv_expression_2_0= ruleExpression
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

            otherlv_3=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:2054:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalJsonDsl.g:2054:49: (iv_ruleContains= ruleContains EOF )
            // InternalJsonDsl.g:2055:2: iv_ruleContains= ruleContains EOF
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
    // InternalJsonDsl.g:2061:1: ruleContains returns [EObject current=null] : (otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')' ) ;
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
            // InternalJsonDsl.g:2067:2: ( (otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            // InternalJsonDsl.g:2068:2: (otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')' )
            {
            // InternalJsonDsl.g:2068:2: (otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')' )
            // InternalJsonDsl.g:2069:3: otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getISKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2077:3: ( (lv_keys_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2078:4: (lv_keys_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2078:4: (lv_keys_2_0= ruleExpression )
            // InternalJsonDsl.g:2079:5: lv_keys_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainsAccess().getKeysExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalJsonDsl.g:2096:3: (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==45) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalJsonDsl.g:2097:4: otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,45,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getContainsAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalJsonDsl.g:2101:4: ( (lv_keys_4_0= ruleExpression ) )
            	    // InternalJsonDsl.g:2102:5: (lv_keys_4_0= ruleExpression )
            	    {
            	    // InternalJsonDsl.g:2102:5: (lv_keys_4_0= ruleExpression )
            	    // InternalJsonDsl.g:2103:6: lv_keys_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainsAccess().getKeysExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
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

            otherlv_5=(Token)match(input,34,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getContainsAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_6=(Token)match(input,39,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getContainsAccess().getINKeyword_5());
              		
            }
            otherlv_7=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getContainsAccess().getLeftParenthesisKeyword_6());
              		
            }
            // InternalJsonDsl.g:2133:3: ( (lv_right_8_0= ruleExpression ) )
            // InternalJsonDsl.g:2134:4: (lv_right_8_0= ruleExpression )
            {
            // InternalJsonDsl.g:2134:4: (lv_right_8_0= ruleExpression )
            // InternalJsonDsl.g:2135:5: lv_right_8_0= ruleExpression
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

            otherlv_9=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:2160:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalJsonDsl.g:2160:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalJsonDsl.g:2161:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalJsonDsl.g:2167:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? ) ;
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
            // InternalJsonDsl.g:2173:2: ( (otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? ) )
            // InternalJsonDsl.g:2174:2: (otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? )
            {
            // InternalJsonDsl.g:2174:2: (otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? )
            // InternalJsonDsl.g:2175:3: otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2183:3: (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_NULL)||(LA23_0>=24 && LA23_0<=25)||(LA23_0>=29 && LA23_0<=30)||(LA23_0>=33 && LA23_0<=35)||(LA23_0>=37 && LA23_0<=38)||LA23_0==40||(LA23_0>=42 && LA23_0<=44)||LA23_0==46||(LA23_0>=49 && LA23_0<=50)||(LA23_0>=52 && LA23_0<=53)) ) {
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
                    // InternalJsonDsl.g:2184:4: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getAsteriskKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:2189:4: ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )?
                    {
                    // InternalJsonDsl.g:2189:4: ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_NULL)||(LA22_0>=24 && LA22_0<=25)||(LA22_0>=29 && LA22_0<=30)||LA22_0==33||LA22_0==35||(LA22_0>=37 && LA22_0<=38)||LA22_0==40||(LA22_0>=42 && LA22_0<=44)||LA22_0==46||(LA22_0>=49 && LA22_0<=50)||(LA22_0>=52 && LA22_0<=53)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalJsonDsl.g:2190:5: ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )*
                            {
                            // InternalJsonDsl.g:2190:5: ( (lv_fields_3_0= ruleExpression ) )
                            // InternalJsonDsl.g:2191:6: (lv_fields_3_0= ruleExpression )
                            {
                            // InternalJsonDsl.g:2191:6: (lv_fields_3_0= ruleExpression )
                            // InternalJsonDsl.g:2192:7: lv_fields_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSelectAccess().getFieldsExpressionParserRuleCall_2_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_22);
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

                            // InternalJsonDsl.g:2209:5: (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==45) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // InternalJsonDsl.g:2210:6: otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,45,FOLLOW_6); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_2_1_1_0());
                            	      					
                            	    }
                            	    // InternalJsonDsl.g:2214:6: ( (lv_fields_5_0= ruleExpression ) )
                            	    // InternalJsonDsl.g:2215:7: (lv_fields_5_0= ruleExpression )
                            	    {
                            	    // InternalJsonDsl.g:2215:7: (lv_fields_5_0= ruleExpression )
                            	    // InternalJsonDsl.g:2216:8: lv_fields_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSelectAccess().getFieldsExpressionParserRuleCall_2_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_22);
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

            otherlv_6=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_7=(Token)match(input,47,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSelectAccess().getFROMKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:2248:3: ( (lv_fromExpression_9_0= ruleExpression ) )
            // InternalJsonDsl.g:2249:4: (lv_fromExpression_9_0= ruleExpression )
            {
            // InternalJsonDsl.g:2249:4: (lv_fromExpression_9_0= ruleExpression )
            // InternalJsonDsl.g:2250:5: lv_fromExpression_9_0= ruleExpression
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

            otherlv_10=(Token)match(input,34,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getSelectAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalJsonDsl.g:2271:3: ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) && (synpred1_InternalJsonDsl())) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJsonDsl.g:2272:4: ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')'
                    {
                    // InternalJsonDsl.g:2272:4: ( ( 'WHERE' )=>otherlv_11= 'WHERE' )
                    // InternalJsonDsl.g:2273:5: ( 'WHERE' )=>otherlv_11= 'WHERE'
                    {
                    otherlv_11=(Token)match(input,48,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getSelectAccess().getWHEREKeyword_8_0());
                      				
                    }

                    }

                    otherlv_12=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_8_1());
                      			
                    }
                    // InternalJsonDsl.g:2283:4: ( (lv_whereExpression_13_0= ruleExpression ) )
                    // InternalJsonDsl.g:2284:5: (lv_whereExpression_13_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2284:5: (lv_whereExpression_13_0= ruleExpression )
                    // InternalJsonDsl.g:2285:6: lv_whereExpression_13_0= ruleExpression
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

                    otherlv_14=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleLength"
    // InternalJsonDsl.g:2311:1: entryRuleLength returns [EObject current=null] : iv_ruleLength= ruleLength EOF ;
    public final EObject entryRuleLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLength = null;


        try {
            // InternalJsonDsl.g:2311:47: (iv_ruleLength= ruleLength EOF )
            // InternalJsonDsl.g:2312:2: iv_ruleLength= ruleLength EOF
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
    // InternalJsonDsl.g:2318:1: ruleLength returns [EObject current=null] : (otherlv_0= 'LENGTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2324:2: ( (otherlv_0= 'LENGTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJsonDsl.g:2325:2: (otherlv_0= 'LENGTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJsonDsl.g:2325:2: (otherlv_0= 'LENGTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJsonDsl.g:2326:3: otherlv_0= 'LENGTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLengthAccess().getLENGTHKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLengthAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2334:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2335:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2335:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2336:5: lv_expression_2_0= ruleExpression
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

            otherlv_3=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:2361:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalJsonDsl.g:2361:44: (iv_ruleSum= ruleSum EOF )
            // InternalJsonDsl.g:2362:2: iv_ruleSum= ruleSum EOF
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
    // InternalJsonDsl.g:2368:1: ruleSum returns [EObject current=null] : (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) ;
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
            // InternalJsonDsl.g:2374:2: ( (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) )
            // InternalJsonDsl.g:2375:2: (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            {
            // InternalJsonDsl.g:2375:2: (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            // InternalJsonDsl.g:2376:3: otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getSUMKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSumAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2384:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2385:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2385:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2386:5: lv_expression_2_0= ruleExpression
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

            otherlv_3=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSumAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalJsonDsl.g:2407:3: (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJsonDsl.g:2408:4: otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSumAccess().getONKeyword_4_0());
                      			
                    }
                    otherlv_5=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSumAccess().getLeftParenthesisKeyword_4_1());
                      			
                    }
                    // InternalJsonDsl.g:2416:4: ( (lv_field_6_0= ruleExpression ) )
                    // InternalJsonDsl.g:2417:5: (lv_field_6_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2417:5: (lv_field_6_0= ruleExpression )
                    // InternalJsonDsl.g:2418:6: lv_field_6_0= ruleExpression
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

                    otherlv_7=(Token)match(input,34,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSumAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }
                    break;

            }

            // InternalJsonDsl.g:2440:3: ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) && (synpred2_InternalJsonDsl())) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJsonDsl.g:2441:4: ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')'
                    {
                    // InternalJsonDsl.g:2441:4: ( ( 'WHERE' )=>otherlv_8= 'WHERE' )
                    // InternalJsonDsl.g:2442:5: ( 'WHERE' )=>otherlv_8= 'WHERE'
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getSumAccess().getWHEREKeyword_5_0());
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getSumAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalJsonDsl.g:2452:4: ( (lv_whereExpression_10_0= ruleExpression ) )
                    // InternalJsonDsl.g:2453:5: (lv_whereExpression_10_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2453:5: (lv_whereExpression_10_0= ruleExpression )
                    // InternalJsonDsl.g:2454:6: lv_whereExpression_10_0= ruleExpression
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

                    otherlv_11=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:2480:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalJsonDsl.g:2480:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalJsonDsl.g:2481:2: iv_ruleProduct= ruleProduct EOF
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
    // InternalJsonDsl.g:2487:1: ruleProduct returns [EObject current=null] : (otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) ;
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
            // InternalJsonDsl.g:2493:2: ( (otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) )
            // InternalJsonDsl.g:2494:2: (otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            {
            // InternalJsonDsl.g:2494:2: (otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            // InternalJsonDsl.g:2495:3: otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )? ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProductAccess().getPRODUCTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProductAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2503:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2504:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2504:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2505:5: lv_expression_2_0= ruleExpression
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

            otherlv_3=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProductAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalJsonDsl.g:2526:3: (otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==51) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJsonDsl.g:2527:4: otherlv_4= 'ON' otherlv_5= '(' ( (lv_field_6_0= ruleExpression ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getProductAccess().getONKeyword_4_0());
                      			
                    }
                    otherlv_5=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getProductAccess().getLeftParenthesisKeyword_4_1());
                      			
                    }
                    // InternalJsonDsl.g:2535:4: ( (lv_field_6_0= ruleExpression ) )
                    // InternalJsonDsl.g:2536:5: (lv_field_6_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2536:5: (lv_field_6_0= ruleExpression )
                    // InternalJsonDsl.g:2537:6: lv_field_6_0= ruleExpression
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

                    otherlv_7=(Token)match(input,34,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getProductAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }
                    break;

            }

            // InternalJsonDsl.g:2559:3: ( ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) && (synpred3_InternalJsonDsl())) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJsonDsl.g:2560:4: ( ( 'WHERE' )=>otherlv_8= 'WHERE' ) otherlv_9= '(' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')'
                    {
                    // InternalJsonDsl.g:2560:4: ( ( 'WHERE' )=>otherlv_8= 'WHERE' )
                    // InternalJsonDsl.g:2561:5: ( 'WHERE' )=>otherlv_8= 'WHERE'
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getProductAccess().getWHEREKeyword_5_0());
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getProductAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalJsonDsl.g:2571:4: ( (lv_whereExpression_10_0= ruleExpression ) )
                    // InternalJsonDsl.g:2572:5: (lv_whereExpression_10_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2572:5: (lv_whereExpression_10_0= ruleExpression )
                    // InternalJsonDsl.g:2573:6: lv_whereExpression_10_0= ruleExpression
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

                    otherlv_11=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleConstant"
    // InternalJsonDsl.g:2599:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalJsonDsl.g:2599:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalJsonDsl.g:2600:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalJsonDsl.g:2606:1: ruleConstant returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_Array_1= ruleArray | this_JSonObject_2= ruleJSonObject ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_Primitive_0 = null;

        EObject this_Array_1 = null;

        EObject this_JSonObject_2 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2612:2: ( (this_Primitive_0= rulePrimitive | this_Array_1= ruleArray | this_JSonObject_2= ruleJSonObject ) )
            // InternalJsonDsl.g:2613:2: (this_Primitive_0= rulePrimitive | this_Array_1= ruleArray | this_JSonObject_2= ruleJSonObject )
            {
            // InternalJsonDsl.g:2613:2: (this_Primitive_0= rulePrimitive | this_Array_1= ruleArray | this_JSonObject_2= ruleJSonObject )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_BOOL:
            case RULE_NULL:
                {
                alt29=1;
                }
                break;
            case 30:
                {
                alt29=2;
                }
                break;
            case 53:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalJsonDsl.g:2614:3: this_Primitive_0= rulePrimitive
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
                    // InternalJsonDsl.g:2623:3: this_Array_1= ruleArray
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
                    // InternalJsonDsl.g:2632:3: this_JSonObject_2= ruleJSonObject
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
    // InternalJsonDsl.g:2644:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalJsonDsl.g:2644:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalJsonDsl.g:2645:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalJsonDsl.g:2651:1: rulePrimitive returns [EObject current=null] : ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_intNum_1_0= RULE_INT ) ) | ( (lv_floatNum_2_0= RULE_DOUBLE ) ) | ( (lv_bool_3_0= RULE_BOOL ) ) | ( (lv_nil_4_0= RULE_NULL ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;
        Token lv_intNum_1_0=null;
        Token lv_floatNum_2_0=null;
        Token lv_bool_3_0=null;
        Token lv_nil_4_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:2657:2: ( ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_intNum_1_0= RULE_INT ) ) | ( (lv_floatNum_2_0= RULE_DOUBLE ) ) | ( (lv_bool_3_0= RULE_BOOL ) ) | ( (lv_nil_4_0= RULE_NULL ) ) ) )
            // InternalJsonDsl.g:2658:2: ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_intNum_1_0= RULE_INT ) ) | ( (lv_floatNum_2_0= RULE_DOUBLE ) ) | ( (lv_bool_3_0= RULE_BOOL ) ) | ( (lv_nil_4_0= RULE_NULL ) ) )
            {
            // InternalJsonDsl.g:2658:2: ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_intNum_1_0= RULE_INT ) ) | ( (lv_floatNum_2_0= RULE_DOUBLE ) ) | ( (lv_bool_3_0= RULE_BOOL ) ) | ( (lv_nil_4_0= RULE_NULL ) ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt30=1;
                }
                break;
            case RULE_INT:
                {
                alt30=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt30=3;
                }
                break;
            case RULE_BOOL:
                {
                alt30=4;
                }
                break;
            case RULE_NULL:
                {
                alt30=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalJsonDsl.g:2659:3: ( (lv_str_0_0= RULE_STRING ) )
                    {
                    // InternalJsonDsl.g:2659:3: ( (lv_str_0_0= RULE_STRING ) )
                    // InternalJsonDsl.g:2660:4: (lv_str_0_0= RULE_STRING )
                    {
                    // InternalJsonDsl.g:2660:4: (lv_str_0_0= RULE_STRING )
                    // InternalJsonDsl.g:2661:5: lv_str_0_0= RULE_STRING
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
                    // InternalJsonDsl.g:2678:3: ( (lv_intNum_1_0= RULE_INT ) )
                    {
                    // InternalJsonDsl.g:2678:3: ( (lv_intNum_1_0= RULE_INT ) )
                    // InternalJsonDsl.g:2679:4: (lv_intNum_1_0= RULE_INT )
                    {
                    // InternalJsonDsl.g:2679:4: (lv_intNum_1_0= RULE_INT )
                    // InternalJsonDsl.g:2680:5: lv_intNum_1_0= RULE_INT
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
                    // InternalJsonDsl.g:2697:3: ( (lv_floatNum_2_0= RULE_DOUBLE ) )
                    {
                    // InternalJsonDsl.g:2697:3: ( (lv_floatNum_2_0= RULE_DOUBLE ) )
                    // InternalJsonDsl.g:2698:4: (lv_floatNum_2_0= RULE_DOUBLE )
                    {
                    // InternalJsonDsl.g:2698:4: (lv_floatNum_2_0= RULE_DOUBLE )
                    // InternalJsonDsl.g:2699:5: lv_floatNum_2_0= RULE_DOUBLE
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
                    // InternalJsonDsl.g:2716:3: ( (lv_bool_3_0= RULE_BOOL ) )
                    {
                    // InternalJsonDsl.g:2716:3: ( (lv_bool_3_0= RULE_BOOL ) )
                    // InternalJsonDsl.g:2717:4: (lv_bool_3_0= RULE_BOOL )
                    {
                    // InternalJsonDsl.g:2717:4: (lv_bool_3_0= RULE_BOOL )
                    // InternalJsonDsl.g:2718:5: lv_bool_3_0= RULE_BOOL
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
                    // InternalJsonDsl.g:2735:3: ( (lv_nil_4_0= RULE_NULL ) )
                    {
                    // InternalJsonDsl.g:2735:3: ( (lv_nil_4_0= RULE_NULL ) )
                    // InternalJsonDsl.g:2736:4: (lv_nil_4_0= RULE_NULL )
                    {
                    // InternalJsonDsl.g:2736:4: (lv_nil_4_0= RULE_NULL )
                    // InternalJsonDsl.g:2737:5: lv_nil_4_0= RULE_NULL
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
    // InternalJsonDsl.g:2757:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalJsonDsl.g:2757:46: (iv_ruleArray= ruleArray EOF )
            // InternalJsonDsl.g:2758:2: iv_ruleArray= ruleArray EOF
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
    // InternalJsonDsl.g:2764:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2770:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) )
            // InternalJsonDsl.g:2771:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            {
            // InternalJsonDsl.g:2771:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            // InternalJsonDsl.g:2772:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']'
            {
            // InternalJsonDsl.g:2772:3: ()
            // InternalJsonDsl.g:2773:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayAccess().getArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalJsonDsl.g:2783:3: ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_NULL)||(LA32_0>=24 && LA32_0<=25)||(LA32_0>=29 && LA32_0<=30)||LA32_0==33||LA32_0==35||(LA32_0>=37 && LA32_0<=38)||LA32_0==40||(LA32_0>=42 && LA32_0<=44)||LA32_0==46||(LA32_0>=49 && LA32_0<=50)||(LA32_0>=52 && LA32_0<=53)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJsonDsl.g:2784:4: ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    {
                    // InternalJsonDsl.g:2784:4: ( (lv_values_2_0= ruleExpression ) )
                    // InternalJsonDsl.g:2785:5: (lv_values_2_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2785:5: (lv_values_2_0= ruleExpression )
                    // InternalJsonDsl.g:2786:6: lv_values_2_0= ruleExpression
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

                    // InternalJsonDsl.g:2803:4: (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==45) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalJsonDsl.g:2804:5: otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,45,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalJsonDsl.g:2808:5: ( (lv_values_4_0= ruleExpression ) )
                    	    // InternalJsonDsl.g:2809:6: (lv_values_4_0= ruleExpression )
                    	    {
                    	    // InternalJsonDsl.g:2809:6: (lv_values_4_0= ruleExpression )
                    	    // InternalJsonDsl.g:2810:7: lv_values_4_0= ruleExpression
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:2837:1: entryRuleJSonObject returns [EObject current=null] : iv_ruleJSonObject= ruleJSonObject EOF ;
    public final EObject entryRuleJSonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonObject = null;


        try {
            // InternalJsonDsl.g:2837:51: (iv_ruleJSonObject= ruleJSonObject EOF )
            // InternalJsonDsl.g:2838:2: iv_ruleJSonObject= ruleJSonObject EOF
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
    // InternalJsonDsl.g:2844:1: ruleJSonObject returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleJSonObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fields_2_0 = null;

        EObject lv_fields_4_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2850:2: ( ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' ) )
            // InternalJsonDsl.g:2851:2: ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' )
            {
            // InternalJsonDsl.g:2851:2: ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' )
            // InternalJsonDsl.g:2852:3: () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}'
            {
            // InternalJsonDsl.g:2852:3: ()
            // InternalJsonDsl.g:2853:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJSonObjectAccess().getJSonObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJSonObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalJsonDsl.g:2863:3: ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_NULL)||(LA34_0>=24 && LA34_0<=25)||(LA34_0>=29 && LA34_0<=30)||LA34_0==33||LA34_0==35||(LA34_0>=37 && LA34_0<=38)||LA34_0==40||(LA34_0>=42 && LA34_0<=44)||LA34_0==46||(LA34_0>=49 && LA34_0<=50)||(LA34_0>=52 && LA34_0<=53)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJsonDsl.g:2864:4: ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )*
                    {
                    // InternalJsonDsl.g:2864:4: ( (lv_fields_2_0= ruleField ) )
                    // InternalJsonDsl.g:2865:5: (lv_fields_2_0= ruleField )
                    {
                    // InternalJsonDsl.g:2865:5: (lv_fields_2_0= ruleField )
                    // InternalJsonDsl.g:2866:6: lv_fields_2_0= ruleField
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

                    // InternalJsonDsl.g:2883:4: (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==45) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalJsonDsl.g:2884:5: otherlv_3= ',' ( (lv_fields_4_0= ruleField ) )
                    	    {
                    	    otherlv_3=(Token)match(input,45,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJSonObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalJsonDsl.g:2888:5: ( (lv_fields_4_0= ruleField ) )
                    	    // InternalJsonDsl.g:2889:6: (lv_fields_4_0= ruleField )
                    	    {
                    	    // InternalJsonDsl.g:2889:6: (lv_fields_4_0= ruleField )
                    	    // InternalJsonDsl.g:2890:7: lv_fields_4_0= ruleField
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:2917:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalJsonDsl.g:2917:46: (iv_ruleField= ruleField EOF )
            // InternalJsonDsl.g:2918:2: iv_ruleField= ruleField EOF
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
    // InternalJsonDsl.g:2924:1: ruleField returns [EObject current=null] : ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2930:2: ( ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalJsonDsl.g:2931:2: ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalJsonDsl.g:2931:2: ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalJsonDsl.g:2932:3: ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalJsonDsl.g:2932:3: ( (lv_key_0_0= ruleExpression ) )
            // InternalJsonDsl.g:2933:4: (lv_key_0_0= ruleExpression )
            {
            // InternalJsonDsl.g:2933:4: (lv_key_0_0= ruleExpression )
            // InternalJsonDsl.g:2934:5: lv_key_0_0= ruleExpression
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

            otherlv_1=(Token)match(input,36,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
              		
            }
            // InternalJsonDsl.g:2955:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2956:4: (lv_value_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2956:4: (lv_value_2_0= ruleExpression )
            // InternalJsonDsl.g:2957:5: lv_value_2_0= ruleExpression
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
        // InternalJsonDsl.g:2273:5: ( 'WHERE' )
        // InternalJsonDsl.g:2273:6: 'WHERE'
        {
        match(input,48,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalJsonDsl

    // $ANTLR start synpred2_InternalJsonDsl
    public final void synpred2_InternalJsonDsl_fragment() throws RecognitionException {   
        // InternalJsonDsl.g:2442:5: ( 'WHERE' )
        // InternalJsonDsl.g:2442:6: 'WHERE'
        {
        match(input,48,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalJsonDsl

    // $ANTLR start synpred3_InternalJsonDsl
    public final void synpred3_InternalJsonDsl_fragment() throws RecognitionException {   
        // InternalJsonDsl.g:2561:5: ( 'WHERE' )
        // InternalJsonDsl.g:2561:6: 'WHERE'
        {
        match(input,48,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalJsonDsl

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00365F6A630003F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00365D6A630003F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000140000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00365D6E670003F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0009000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00365D6AE30003F0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00765D6A630003F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0040200000000000L});

}