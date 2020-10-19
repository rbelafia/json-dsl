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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_NULL", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'OR'", "'AND'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'('", "')'", "'?'", "'~'", "'['", "','", "']'", "'LOAD'", "'STORE'", "'IN'", "'EXPORT_CSV'", "'PRINT'", "'GET_DEPTH'", "'GET_INFOS'", "'IS'", "'SELECT'", "'FROM'", "'WHERE'", "'CONCAT'", "'SUM'", "'ON'", "'PRODUCT'", "'MEAN'", "'ADD'", "'INSERT'", "'RENAME'", "'TO'", "'DELETE'", "'REMOVE'", "'{'", "'}'", "':'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
    public static final int RULE_NULL=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=9;
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
    public static final int RULE_BOOL=7;
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_DOUBLE)||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=29 && LA1_0<=30)||LA1_0==32||LA1_0==34||(LA1_0>=37 && LA1_0<=38)||(LA1_0>=40 && LA1_0<=45)||(LA1_0>=48 && LA1_0<=49)||(LA1_0>=51 && LA1_0<=55)||(LA1_0>=57 && LA1_0<=59)) ) {
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
    // InternalJsonDsl.g:107:1: ruleSimpleStatement returns [EObject current=null] : ( (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_ProcCall_2= ruleProcCall ) otherlv_3= ';' ) ;
    public final EObject ruleSimpleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Assignment_0 = null;

        EObject this_Expression_1 = null;

        EObject this_ProcCall_2 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:113:2: ( ( (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_ProcCall_2= ruleProcCall ) otherlv_3= ';' ) )
            // InternalJsonDsl.g:114:2: ( (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_ProcCall_2= ruleProcCall ) otherlv_3= ';' )
            {
            // InternalJsonDsl.g:114:2: ( (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_ProcCall_2= ruleProcCall ) otherlv_3= ';' )
            // InternalJsonDsl.g:115:3: (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_ProcCall_2= ruleProcCall ) otherlv_3= ';'
            {
            // InternalJsonDsl.g:115:3: (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_ProcCall_2= ruleProcCall )
            int alt2=3;
            alt2 = dfa2.predict(input);
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
                    // InternalJsonDsl.g:134:4: this_ProcCall_2= ruleProcCall
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatementAccess().getProcCallParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_ProcCall_2=ruleProcCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ProcCall_2;
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
            	      							grammarAccess.getExpressionLvl4Access().getSuperiExpressionLeftAction_1_0_0(),
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
            	      							grammarAccess.getExpressionLvl4Access().getInferiExpressionLeftAction_1_2_0(),
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
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOL:
            case RULE_NULL:
            case RULE_DOUBLE:
            case 29:
            case 30:
            case 32:
            case 34:
            case 37:
            case 38:
            case 40:
            case 42:
            case 43:
            case 44:
            case 45:
            case 48:
            case 49:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 57:
            case 58:
            case 59:
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
    // InternalJsonDsl.g:966:1: ruleExpressionLvl8 returns [EObject current=null] : (this_LogicalNegationExpression_0= ruleLogicalNegationExpression | this_PrimaryExpression_1= rulePrimaryExpression ) ;
    public final EObject ruleExpressionLvl8() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalNegationExpression_0 = null;

        EObject this_PrimaryExpression_1 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:972:2: ( (this_LogicalNegationExpression_0= ruleLogicalNegationExpression | this_PrimaryExpression_1= rulePrimaryExpression ) )
            // InternalJsonDsl.g:973:2: (this_LogicalNegationExpression_0= ruleLogicalNegationExpression | this_PrimaryExpression_1= rulePrimaryExpression )
            {
            // InternalJsonDsl.g:973:2: (this_LogicalNegationExpression_0= ruleLogicalNegationExpression | this_PrimaryExpression_1= rulePrimaryExpression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_DOUBLE)||LA10_0==30||LA10_0==32||LA10_0==34||(LA10_0>=37 && LA10_0<=38)||LA10_0==40||(LA10_0>=42 && LA10_0<=45)||(LA10_0>=48 && LA10_0<=49)||(LA10_0>=51 && LA10_0<=55)||(LA10_0>=57 && LA10_0<=59)) ) {
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
                    // InternalJsonDsl.g:983:3: this_PrimaryExpression_1= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLvl8Access().getPrimaryExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_1=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimaryExpression_1;
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


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalJsonDsl.g:1037:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalJsonDsl.g:1037:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalJsonDsl.g:1038:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalJsonDsl.g:1044:1: rulePrimaryExpression returns [EObject current=null] : (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | this_BracketExpression_3= ruleBracketExpression | ( () rulePointer ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_VariableCall_0 = null;

        EObject this_Constant_1 = null;

        EObject this_FunctionCall_2 = null;

        EObject this_BracketExpression_3 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1050:2: ( (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | this_BracketExpression_3= ruleBracketExpression | ( () rulePointer ) ) )
            // InternalJsonDsl.g:1051:2: (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | this_BracketExpression_3= ruleBracketExpression | ( () rulePointer ) )
            {
            // InternalJsonDsl.g:1051:2: (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | this_BracketExpression_3= ruleBracketExpression | ( () rulePointer ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOL:
            case RULE_NULL:
            case RULE_DOUBLE:
            case 34:
            case 59:
                {
                alt11=2;
                }
                break;
            case 37:
            case 38:
            case 40:
            case 42:
            case 43:
            case 44:
            case 45:
            case 48:
            case 49:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 57:
            case 58:
                {
                alt11=3;
                }
                break;
            case 30:
                {
                alt11=4;
                }
                break;
            case 32:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalJsonDsl.g:1052:3: this_VariableCall_0= ruleVariableCall
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
                    // InternalJsonDsl.g:1061:3: this_Constant_1= ruleConstant
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
                    // InternalJsonDsl.g:1070:3: this_FunctionCall_2= ruleFunctionCall
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
                    // InternalJsonDsl.g:1079:3: this_BracketExpression_3= ruleBracketExpression
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
                    // InternalJsonDsl.g:1088:3: ( () rulePointer )
                    {
                    // InternalJsonDsl.g:1088:3: ( () rulePointer )
                    // InternalJsonDsl.g:1089:4: () rulePointer
                    {
                    // InternalJsonDsl.g:1089:4: ()
                    // InternalJsonDsl.g:1090:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getPrimaryExpressionAction_4_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPointerParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    rulePointer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleBracketExpression"
    // InternalJsonDsl.g:1108:1: entryRuleBracketExpression returns [EObject current=null] : iv_ruleBracketExpression= ruleBracketExpression EOF ;
    public final EObject entryRuleBracketExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracketExpression = null;


        try {
            // InternalJsonDsl.g:1108:58: (iv_ruleBracketExpression= ruleBracketExpression EOF )
            // InternalJsonDsl.g:1109:2: iv_ruleBracketExpression= ruleBracketExpression EOF
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
    // InternalJsonDsl.g:1115:1: ruleBracketExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracketExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1121:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalJsonDsl.g:1122:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalJsonDsl.g:1122:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalJsonDsl.g:1123:3: otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBracketExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalJsonDsl.g:1127:3: ( (lv_sub_1_0= ruleExpression ) )
            // InternalJsonDsl.g:1128:4: (lv_sub_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:1128:4: (lv_sub_1_0= ruleExpression )
            // InternalJsonDsl.g:1129:5: lv_sub_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBracketExpressionAccess().getSubExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRulePointer"
    // InternalJsonDsl.g:1154:1: entryRulePointer returns [String current=null] : iv_rulePointer= rulePointer EOF ;
    public final String entryRulePointer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePointer = null;


        try {
            // InternalJsonDsl.g:1154:47: (iv_rulePointer= rulePointer EOF )
            // InternalJsonDsl.g:1155:2: iv_rulePointer= rulePointer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePointer=rulePointer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointer.getText(); 
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
    // $ANTLR end "entryRulePointer"


    // $ANTLR start "rulePointer"
    // InternalJsonDsl.g:1161:1: rulePointer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '?' ;
    public final AntlrDatatypeRuleToken rulePointer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1167:2: (kw= '?' )
            // InternalJsonDsl.g:1168:2: kw= '?'
            {
            kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPointerAccess().getQuestionMarkKeyword());
              	
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
    // $ANTLR end "rulePointer"


    // $ANTLR start "entryRuleVariableCall"
    // InternalJsonDsl.g:1176:1: entryRuleVariableCall returns [EObject current=null] : iv_ruleVariableCall= ruleVariableCall EOF ;
    public final EObject entryRuleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCall = null;


        try {
            // InternalJsonDsl.g:1176:53: (iv_ruleVariableCall= ruleVariableCall EOF )
            // InternalJsonDsl.g:1177:2: iv_ruleVariableCall= ruleVariableCall EOF
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
    // InternalJsonDsl.g:1183:1: ruleVariableCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_caller_1_0= ruleAuxiliarCaller ) )* ) ;
    public final EObject ruleVariableCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_caller_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1189:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_caller_1_0= ruleAuxiliarCaller ) )* ) )
            // InternalJsonDsl.g:1190:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_caller_1_0= ruleAuxiliarCaller ) )* )
            {
            // InternalJsonDsl.g:1190:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_caller_1_0= ruleAuxiliarCaller ) )* )
            // InternalJsonDsl.g:1191:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_caller_1_0= ruleAuxiliarCaller ) )*
            {
            // InternalJsonDsl.g:1191:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJsonDsl.g:1192:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJsonDsl.g:1192:4: (lv_name_0_0= RULE_ID )
            // InternalJsonDsl.g:1193:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getVariableCallAccess().getNameIDTerminalRuleCall_0_0());
              				
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

            // InternalJsonDsl.g:1209:3: ( (lv_caller_1_0= ruleAuxiliarCaller ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=33 && LA12_0<=34)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJsonDsl.g:1210:4: (lv_caller_1_0= ruleAuxiliarCaller )
            	    {
            	    // InternalJsonDsl.g:1210:4: (lv_caller_1_0= ruleAuxiliarCaller )
            	    // InternalJsonDsl.g:1211:5: lv_caller_1_0= ruleAuxiliarCaller
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVariableCallAccess().getCallerAuxiliarCallerParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_caller_1_0=ruleAuxiliarCaller();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVariableCallRule());
            	      					}
            	      					add(
            	      						current,
            	      						"caller",
            	      						lv_caller_1_0,
            	      						"org.xtext.example.mydsl.JsonDsl.AuxiliarCaller");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleVariableCall"


    // $ANTLR start "entryRuleAuxiliarCaller"
    // InternalJsonDsl.g:1232:1: entryRuleAuxiliarCaller returns [EObject current=null] : iv_ruleAuxiliarCaller= ruleAuxiliarCaller EOF ;
    public final EObject entryRuleAuxiliarCaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuxiliarCaller = null;


        try {
            // InternalJsonDsl.g:1232:55: (iv_ruleAuxiliarCaller= ruleAuxiliarCaller EOF )
            // InternalJsonDsl.g:1233:2: iv_ruleAuxiliarCaller= ruleAuxiliarCaller EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAuxiliarCallerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAuxiliarCaller=ruleAuxiliarCaller();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAuxiliarCaller; 
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
    // $ANTLR end "entryRuleAuxiliarCaller"


    // $ANTLR start "ruleAuxiliarCaller"
    // InternalJsonDsl.g:1239:1: ruleAuxiliarCaller returns [EObject current=null] : (this_FieldCaller_0= ruleFieldCaller | this_ArrayCaller_1= ruleArrayCaller ) ;
    public final EObject ruleAuxiliarCaller() throws RecognitionException {
        EObject current = null;

        EObject this_FieldCaller_0 = null;

        EObject this_ArrayCaller_1 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1245:2: ( (this_FieldCaller_0= ruleFieldCaller | this_ArrayCaller_1= ruleArrayCaller ) )
            // InternalJsonDsl.g:1246:2: (this_FieldCaller_0= ruleFieldCaller | this_ArrayCaller_1= ruleArrayCaller )
            {
            // InternalJsonDsl.g:1246:2: (this_FieldCaller_0= ruleFieldCaller | this_ArrayCaller_1= ruleArrayCaller )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalJsonDsl.g:1247:3: this_FieldCaller_0= ruleFieldCaller
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAuxiliarCallerAccess().getFieldCallerParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldCaller_0=ruleFieldCaller();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldCaller_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1256:3: this_ArrayCaller_1= ruleArrayCaller
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAuxiliarCallerAccess().getArrayCallerParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayCaller_1=ruleArrayCaller();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayCaller_1;
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
    // $ANTLR end "ruleAuxiliarCaller"


    // $ANTLR start "entryRuleFieldCaller"
    // InternalJsonDsl.g:1268:1: entryRuleFieldCaller returns [EObject current=null] : iv_ruleFieldCaller= ruleFieldCaller EOF ;
    public final EObject entryRuleFieldCaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldCaller = null;


        try {
            // InternalJsonDsl.g:1268:52: (iv_ruleFieldCaller= ruleFieldCaller EOF )
            // InternalJsonDsl.g:1269:2: iv_ruleFieldCaller= ruleFieldCaller EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldCallerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldCaller=ruleFieldCaller();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldCaller; 
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
    // $ANTLR end "entryRuleFieldCaller"


    // $ANTLR start "ruleFieldCaller"
    // InternalJsonDsl.g:1275:1: ruleFieldCaller returns [EObject current=null] : (otherlv_0= '~' ( (lv_key_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFieldCaller() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1281:2: ( (otherlv_0= '~' ( (lv_key_1_0= RULE_STRING ) ) ) )
            // InternalJsonDsl.g:1282:2: (otherlv_0= '~' ( (lv_key_1_0= RULE_STRING ) ) )
            {
            // InternalJsonDsl.g:1282:2: (otherlv_0= '~' ( (lv_key_1_0= RULE_STRING ) ) )
            // InternalJsonDsl.g:1283:3: otherlv_0= '~' ( (lv_key_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldCallerAccess().getTildeKeyword_0());
              		
            }
            // InternalJsonDsl.g:1287:3: ( (lv_key_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:1288:4: (lv_key_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1288:4: (lv_key_1_0= RULE_STRING )
            // InternalJsonDsl.g:1289:5: lv_key_1_0= RULE_STRING
            {
            lv_key_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_key_1_0, grammarAccess.getFieldCallerAccess().getKeySTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldCallerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"key",
              						lv_key_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
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
    // $ANTLR end "ruleFieldCaller"


    // $ANTLR start "entryRuleArrayCaller"
    // InternalJsonDsl.g:1309:1: entryRuleArrayCaller returns [EObject current=null] : iv_ruleArrayCaller= ruleArrayCaller EOF ;
    public final EObject entryRuleArrayCaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayCaller = null;


        try {
            // InternalJsonDsl.g:1309:52: (iv_ruleArrayCaller= ruleArrayCaller EOF )
            // InternalJsonDsl.g:1310:2: iv_ruleArrayCaller= ruleArrayCaller EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayCallerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayCaller=ruleArrayCaller();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayCaller; 
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
    // $ANTLR end "entryRuleArrayCaller"


    // $ANTLR start "ruleArrayCaller"
    // InternalJsonDsl.g:1316:1: ruleArrayCaller returns [EObject current=null] : (otherlv_0= '[' ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayCaller() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_index_1_0=null;
        Token otherlv_2=null;
        Token lv_index_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1322:2: ( (otherlv_0= '[' ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )* otherlv_4= ']' ) )
            // InternalJsonDsl.g:1323:2: (otherlv_0= '[' ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )* otherlv_4= ']' )
            {
            // InternalJsonDsl.g:1323:2: (otherlv_0= '[' ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )* otherlv_4= ']' )
            // InternalJsonDsl.g:1324:3: otherlv_0= '[' ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayCallerAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalJsonDsl.g:1328:3: ( (lv_index_1_0= RULE_INT ) )
            // InternalJsonDsl.g:1329:4: (lv_index_1_0= RULE_INT )
            {
            // InternalJsonDsl.g:1329:4: (lv_index_1_0= RULE_INT )
            // InternalJsonDsl.g:1330:5: lv_index_1_0= RULE_INT
            {
            lv_index_1_0=(Token)match(input,RULE_INT,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_index_1_0, grammarAccess.getArrayCallerAccess().getIndexINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArrayCallerRule());
              					}
              					addWithLastConsumed(
              						current,
              						"index",
              						lv_index_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalJsonDsl.g:1346:3: (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJsonDsl.g:1347:4: otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getArrayCallerAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalJsonDsl.g:1351:4: ( (lv_index_3_0= RULE_INT ) )
            	    // InternalJsonDsl.g:1352:5: (lv_index_3_0= RULE_INT )
            	    {
            	    // InternalJsonDsl.g:1352:5: (lv_index_3_0= RULE_INT )
            	    // InternalJsonDsl.g:1353:6: lv_index_3_0= RULE_INT
            	    {
            	    lv_index_3_0=(Token)match(input,RULE_INT,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_index_3_0, grammarAccess.getArrayCallerAccess().getIndexINTTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getArrayCallerRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"index",
            	      							lv_index_3_0,
            	      							"org.eclipse.xtext.common.Terminals.INT");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getArrayCallerAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleArrayCaller"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalJsonDsl.g:1378:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalJsonDsl.g:1378:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalJsonDsl.g:1379:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalJsonDsl.g:1385:1: ruleFunctionCall returns [EObject current=null] : (this_IOFunctions_0= ruleIOFunctions | this_InfoFunctions_1= ruleInfoFunctions | this_ManipFunctions_2= ruleManipFunctions | this_ArithFunctions_3= ruleArithFunctions | this_AlterFunctions_4= ruleAlterFunctions ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject this_IOFunctions_0 = null;

        EObject this_InfoFunctions_1 = null;

        EObject this_ManipFunctions_2 = null;

        EObject this_ArithFunctions_3 = null;

        EObject this_AlterFunctions_4 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1391:2: ( (this_IOFunctions_0= ruleIOFunctions | this_InfoFunctions_1= ruleInfoFunctions | this_ManipFunctions_2= ruleManipFunctions | this_ArithFunctions_3= ruleArithFunctions | this_AlterFunctions_4= ruleAlterFunctions ) )
            // InternalJsonDsl.g:1392:2: (this_IOFunctions_0= ruleIOFunctions | this_InfoFunctions_1= ruleInfoFunctions | this_ManipFunctions_2= ruleManipFunctions | this_ArithFunctions_3= ruleArithFunctions | this_AlterFunctions_4= ruleAlterFunctions )
            {
            // InternalJsonDsl.g:1392:2: (this_IOFunctions_0= ruleIOFunctions | this_InfoFunctions_1= ruleInfoFunctions | this_ManipFunctions_2= ruleManipFunctions | this_ArithFunctions_3= ruleArithFunctions | this_AlterFunctions_4= ruleAlterFunctions )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 40:
                {
                alt15=1;
                }
                break;
            case 42:
            case 43:
            case 44:
                {
                alt15=2;
                }
                break;
            case 45:
            case 48:
                {
                alt15=3;
                }
                break;
            case 49:
            case 51:
            case 52:
                {
                alt15=4;
                }
                break;
            case 53:
            case 54:
            case 55:
            case 57:
            case 58:
                {
                alt15=5;
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
                    // InternalJsonDsl.g:1393:3: this_IOFunctions_0= ruleIOFunctions
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
                    // InternalJsonDsl.g:1402:3: this_InfoFunctions_1= ruleInfoFunctions
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
                    // InternalJsonDsl.g:1411:3: this_ManipFunctions_2= ruleManipFunctions
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
                    // InternalJsonDsl.g:1420:3: this_ArithFunctions_3= ruleArithFunctions
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
                    // InternalJsonDsl.g:1429:3: this_AlterFunctions_4= ruleAlterFunctions
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
    // InternalJsonDsl.g:1441:1: entryRuleIOFunctions returns [EObject current=null] : iv_ruleIOFunctions= ruleIOFunctions EOF ;
    public final EObject entryRuleIOFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOFunctions = null;


        try {
            // InternalJsonDsl.g:1441:52: (iv_ruleIOFunctions= ruleIOFunctions EOF )
            // InternalJsonDsl.g:1442:2: iv_ruleIOFunctions= ruleIOFunctions EOF
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
    // InternalJsonDsl.g:1448:1: ruleIOFunctions returns [EObject current=null] : (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport ) ;
    public final EObject ruleIOFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Load_0 = null;

        EObject this_Store_1 = null;

        EObject this_Export_2 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1454:2: ( (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport ) )
            // InternalJsonDsl.g:1455:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport )
            {
            // InternalJsonDsl.g:1455:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt16=1;
                }
                break;
            case 38:
                {
                alt16=2;
                }
                break;
            case 40:
                {
                alt16=3;
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
                    // InternalJsonDsl.g:1456:3: this_Load_0= ruleLoad
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
                    // InternalJsonDsl.g:1465:3: this_Store_1= ruleStore
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
                    // InternalJsonDsl.g:1474:3: this_Export_2= ruleExport
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
    // InternalJsonDsl.g:1486:1: entryRuleInfoFunctions returns [EObject current=null] : iv_ruleInfoFunctions= ruleInfoFunctions EOF ;
    public final EObject entryRuleInfoFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoFunctions = null;


        try {
            // InternalJsonDsl.g:1486:54: (iv_ruleInfoFunctions= ruleInfoFunctions EOF )
            // InternalJsonDsl.g:1487:2: iv_ruleInfoFunctions= ruleInfoFunctions EOF
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
    // InternalJsonDsl.g:1493:1: ruleInfoFunctions returns [EObject current=null] : (this_Depth_0= ruleDepth | this_FieldInfo_1= ruleFieldInfo | this_Contains_2= ruleContains ) ;
    public final EObject ruleInfoFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Depth_0 = null;

        EObject this_FieldInfo_1 = null;

        EObject this_Contains_2 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1499:2: ( (this_Depth_0= ruleDepth | this_FieldInfo_1= ruleFieldInfo | this_Contains_2= ruleContains ) )
            // InternalJsonDsl.g:1500:2: (this_Depth_0= ruleDepth | this_FieldInfo_1= ruleFieldInfo | this_Contains_2= ruleContains )
            {
            // InternalJsonDsl.g:1500:2: (this_Depth_0= ruleDepth | this_FieldInfo_1= ruleFieldInfo | this_Contains_2= ruleContains )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt17=1;
                }
                break;
            case 43:
                {
                alt17=2;
                }
                break;
            case 44:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalJsonDsl.g:1501:3: this_Depth_0= ruleDepth
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
                    // InternalJsonDsl.g:1510:3: this_FieldInfo_1= ruleFieldInfo
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
                    // InternalJsonDsl.g:1519:3: this_Contains_2= ruleContains
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
    // InternalJsonDsl.g:1531:1: entryRuleManipFunctions returns [EObject current=null] : iv_ruleManipFunctions= ruleManipFunctions EOF ;
    public final EObject entryRuleManipFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManipFunctions = null;


        try {
            // InternalJsonDsl.g:1531:55: (iv_ruleManipFunctions= ruleManipFunctions EOF )
            // InternalJsonDsl.g:1532:2: iv_ruleManipFunctions= ruleManipFunctions EOF
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
    // InternalJsonDsl.g:1538:1: ruleManipFunctions returns [EObject current=null] : (this_Select_0= ruleSelect | this_Concat_1= ruleConcat ) ;
    public final EObject ruleManipFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Select_0 = null;

        EObject this_Concat_1 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1544:2: ( (this_Select_0= ruleSelect | this_Concat_1= ruleConcat ) )
            // InternalJsonDsl.g:1545:2: (this_Select_0= ruleSelect | this_Concat_1= ruleConcat )
            {
            // InternalJsonDsl.g:1545:2: (this_Select_0= ruleSelect | this_Concat_1= ruleConcat )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            else if ( (LA18_0==48) ) {
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
                    // InternalJsonDsl.g:1546:3: this_Select_0= ruleSelect
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
                    // InternalJsonDsl.g:1555:3: this_Concat_1= ruleConcat
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
    // InternalJsonDsl.g:1567:1: entryRuleArithFunctions returns [EObject current=null] : iv_ruleArithFunctions= ruleArithFunctions EOF ;
    public final EObject entryRuleArithFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithFunctions = null;


        try {
            // InternalJsonDsl.g:1567:55: (iv_ruleArithFunctions= ruleArithFunctions EOF )
            // InternalJsonDsl.g:1568:2: iv_ruleArithFunctions= ruleArithFunctions EOF
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
    // InternalJsonDsl.g:1574:1: ruleArithFunctions returns [EObject current=null] : (this_Sum_0= ruleSum | this_Product_1= ruleProduct | this_Mean_2= ruleMean ) ;
    public final EObject ruleArithFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Sum_0 = null;

        EObject this_Product_1 = null;

        EObject this_Mean_2 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1580:2: ( (this_Sum_0= ruleSum | this_Product_1= ruleProduct | this_Mean_2= ruleMean ) )
            // InternalJsonDsl.g:1581:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct | this_Mean_2= ruleMean )
            {
            // InternalJsonDsl.g:1581:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct | this_Mean_2= ruleMean )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt19=1;
                }
                break;
            case 51:
                {
                alt19=2;
                }
                break;
            case 52:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalJsonDsl.g:1582:3: this_Sum_0= ruleSum
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
                    // InternalJsonDsl.g:1591:3: this_Product_1= ruleProduct
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
                case 3 :
                    // InternalJsonDsl.g:1600:3: this_Mean_2= ruleMean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArithFunctionsAccess().getMeanParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Mean_2=ruleMean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Mean_2;
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
    // InternalJsonDsl.g:1612:1: entryRuleAlterFunctions returns [EObject current=null] : iv_ruleAlterFunctions= ruleAlterFunctions EOF ;
    public final EObject entryRuleAlterFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterFunctions = null;


        try {
            // InternalJsonDsl.g:1612:55: (iv_ruleAlterFunctions= ruleAlterFunctions EOF )
            // InternalJsonDsl.g:1613:2: iv_ruleAlterFunctions= ruleAlterFunctions EOF
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
    // InternalJsonDsl.g:1619:1: ruleAlterFunctions returns [EObject current=null] : (this_Add_0= ruleAdd | this_Insert_1= ruleInsert | this_Rename_2= ruleRename | this_Remove_3= ruleRemove | this_Delete_4= ruleDelete ) ;
    public final EObject ruleAlterFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;

        EObject this_Insert_1 = null;

        EObject this_Rename_2 = null;

        EObject this_Remove_3 = null;

        EObject this_Delete_4 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1625:2: ( (this_Add_0= ruleAdd | this_Insert_1= ruleInsert | this_Rename_2= ruleRename | this_Remove_3= ruleRemove | this_Delete_4= ruleDelete ) )
            // InternalJsonDsl.g:1626:2: (this_Add_0= ruleAdd | this_Insert_1= ruleInsert | this_Rename_2= ruleRename | this_Remove_3= ruleRemove | this_Delete_4= ruleDelete )
            {
            // InternalJsonDsl.g:1626:2: (this_Add_0= ruleAdd | this_Insert_1= ruleInsert | this_Rename_2= ruleRename | this_Remove_3= ruleRemove | this_Delete_4= ruleDelete )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt20=1;
                }
                break;
            case 54:
                {
                alt20=2;
                }
                break;
            case 55:
                {
                alt20=3;
                }
                break;
            case 58:
                {
                alt20=4;
                }
                break;
            case 57:
                {
                alt20=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalJsonDsl.g:1627:3: this_Add_0= ruleAdd
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAlterFunctionsAccess().getAddParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Add_0=ruleAdd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Add_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1636:3: this_Insert_1= ruleInsert
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAlterFunctionsAccess().getInsertParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Insert_1=ruleInsert();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Insert_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:1645:3: this_Rename_2= ruleRename
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAlterFunctionsAccess().getRenameParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Rename_2=ruleRename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Rename_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalJsonDsl.g:1654:3: this_Remove_3= ruleRemove
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAlterFunctionsAccess().getRemoveParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Remove_3=ruleRemove();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Remove_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalJsonDsl.g:1663:3: this_Delete_4= ruleDelete
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAlterFunctionsAccess().getDeleteParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Delete_4=ruleDelete();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Delete_4;
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
    // $ANTLR end "ruleAlterFunctions"


    // $ANTLR start "entryRuleLoad"
    // InternalJsonDsl.g:1675:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalJsonDsl.g:1675:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalJsonDsl.g:1676:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalJsonDsl.g:1682:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'LOAD' otherlv_1= '(' ( (lv_fileName_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fileName_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1688:2: ( (otherlv_0= 'LOAD' otherlv_1= '(' ( (lv_fileName_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJsonDsl.g:1689:2: (otherlv_0= 'LOAD' otherlv_1= '(' ( (lv_fileName_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJsonDsl.g:1689:2: (otherlv_0= 'LOAD' otherlv_1= '(' ( (lv_fileName_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJsonDsl.g:1690:3: otherlv_0= 'LOAD' otherlv_1= '(' ( (lv_fileName_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLOADKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:1698:3: ( (lv_fileName_2_0= ruleExpression ) )
            // InternalJsonDsl.g:1699:4: (lv_fileName_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:1699:4: (lv_fileName_2_0= ruleExpression )
            // InternalJsonDsl.g:1700:5: lv_fileName_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLoadAccess().getFileNameExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_fileName_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLoadRule());
              					}
              					set(
              						current,
              						"fileName",
              						lv_fileName_2_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleStore"
    // InternalJsonDsl.g:1725:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalJsonDsl.g:1725:46: (iv_ruleStore= ruleStore EOF )
            // InternalJsonDsl.g:1726:2: iv_ruleStore= ruleStore EOF
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
    // InternalJsonDsl.g:1732:1: ruleStore returns [EObject current=null] : (otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_2_0 = null;

        EObject lv_fileName_6_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1738:2: ( (otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // InternalJsonDsl.g:1739:2: (otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // InternalJsonDsl.g:1739:2: (otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= ruleExpression ) ) otherlv_7= ')' )
            // InternalJsonDsl.g:1740:3: otherlv_0= 'STORE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getSTOREKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:1748:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:1749:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:1749:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:1750:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStoreAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,31,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getStoreAccess().getINKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:1779:3: ( (lv_fileName_6_0= ruleExpression ) )
            // InternalJsonDsl.g:1780:4: (lv_fileName_6_0= ruleExpression )
            {
            // InternalJsonDsl.g:1780:4: (lv_fileName_6_0= ruleExpression )
            // InternalJsonDsl.g:1781:5: lv_fileName_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStoreAccess().getFileNameExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_fileName_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStoreRule());
              					}
              					set(
              						current,
              						"fileName",
              						lv_fileName_6_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:1806:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalJsonDsl.g:1806:47: (iv_ruleExport= ruleExport EOF )
            // InternalJsonDsl.g:1807:2: iv_ruleExport= ruleExport EOF
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
    // InternalJsonDsl.g:1813:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_2_0 = null;

        EObject lv_fileName_6_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1819:2: ( (otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // InternalJsonDsl.g:1820:2: (otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // InternalJsonDsl.g:1820:2: (otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= ruleExpression ) ) otherlv_7= ')' )
            // InternalJsonDsl.g:1821:3: otherlv_0= 'EXPORT_CSV' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_fileName_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORT_CSVKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:1829:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:1830:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:1830:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:1831:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExportAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,31,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getExportAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getExportAccess().getINKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getExportAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:1860:3: ( (lv_fileName_6_0= ruleExpression ) )
            // InternalJsonDsl.g:1861:4: (lv_fileName_6_0= ruleExpression )
            {
            // InternalJsonDsl.g:1861:4: (lv_fileName_6_0= ruleExpression )
            // InternalJsonDsl.g:1862:5: lv_fileName_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExportAccess().getFileNameExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_fileName_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExportRule());
              					}
              					set(
              						current,
              						"fileName",
              						lv_fileName_6_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleProcCall"
    // InternalJsonDsl.g:1887:1: entryRuleProcCall returns [EObject current=null] : iv_ruleProcCall= ruleProcCall EOF ;
    public final EObject entryRuleProcCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcCall = null;


        try {
            // InternalJsonDsl.g:1887:49: (iv_ruleProcCall= ruleProcCall EOF )
            // InternalJsonDsl.g:1888:2: iv_ruleProcCall= ruleProcCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcCall=ruleProcCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcCall; 
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
    // $ANTLR end "entryRuleProcCall"


    // $ANTLR start "ruleProcCall"
    // InternalJsonDsl.g:1894:1: ruleProcCall returns [EObject current=null] : (otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleProcCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1900:2: ( (otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJsonDsl.g:1901:2: (otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJsonDsl.g:1901:2: (otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJsonDsl.g:1902:3: otherlv_0= 'PRINT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcCallAccess().getPRINTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProcCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:1910:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:1911:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:1911:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:1912:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcCallAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcCallRule());
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

            otherlv_3=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProcCallAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleProcCall"


    // $ANTLR start "entryRuleDepth"
    // InternalJsonDsl.g:1937:1: entryRuleDepth returns [EObject current=null] : iv_ruleDepth= ruleDepth EOF ;
    public final EObject entryRuleDepth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepth = null;


        try {
            // InternalJsonDsl.g:1937:46: (iv_ruleDepth= ruleDepth EOF )
            // InternalJsonDsl.g:1938:2: iv_ruleDepth= ruleDepth EOF
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
    // InternalJsonDsl.g:1944:1: ruleDepth returns [EObject current=null] : (otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleDepth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1950:2: ( (otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJsonDsl.g:1951:2: (otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJsonDsl.g:1951:2: (otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJsonDsl.g:1952:3: otherlv_0= 'GET_DEPTH' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDepthAccess().getGET_DEPTHKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDepthAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:1960:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:1961:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:1961:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:1962:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDepthAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:1987:1: entryRuleFieldInfo returns [EObject current=null] : iv_ruleFieldInfo= ruleFieldInfo EOF ;
    public final EObject entryRuleFieldInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInfo = null;


        try {
            // InternalJsonDsl.g:1987:50: (iv_ruleFieldInfo= ruleFieldInfo EOF )
            // InternalJsonDsl.g:1988:2: iv_ruleFieldInfo= ruleFieldInfo EOF
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
    // InternalJsonDsl.g:1994:1: ruleFieldInfo returns [EObject current=null] : (otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleFieldInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2000:2: ( (otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalJsonDsl.g:2001:2: (otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalJsonDsl.g:2001:2: (otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalJsonDsl.g:2002:3: otherlv_0= 'GET_INFOS' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldInfoAccess().getGET_INFOSKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldInfoAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2010:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2011:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2011:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2012:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldInfoAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:2037:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalJsonDsl.g:2037:49: (iv_ruleContains= ruleContains EOF )
            // InternalJsonDsl.g:2038:2: iv_ruleContains= ruleContains EOF
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
    // InternalJsonDsl.g:2044:1: ruleContains returns [EObject current=null] : (otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')' ) ;
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
            // InternalJsonDsl.g:2050:2: ( (otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            // InternalJsonDsl.g:2051:2: (otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')' )
            {
            // InternalJsonDsl.g:2051:2: (otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')' )
            // InternalJsonDsl.g:2052:3: otherlv_0= 'IS' otherlv_1= '(' ( (lv_keys_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'IN' otherlv_7= '(' ( (lv_right_8_0= ruleExpression ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getISKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2060:3: ( (lv_keys_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2061:4: (lv_keys_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2061:4: (lv_keys_2_0= ruleExpression )
            // InternalJsonDsl.g:2062:5: lv_keys_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainsAccess().getKeysExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
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

            // InternalJsonDsl.g:2079:3: (otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalJsonDsl.g:2080:4: otherlv_3= ',' ( (lv_keys_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getContainsAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalJsonDsl.g:2084:4: ( (lv_keys_4_0= ruleExpression ) )
            	    // InternalJsonDsl.g:2085:5: (lv_keys_4_0= ruleExpression )
            	    {
            	    // InternalJsonDsl.g:2085:5: (lv_keys_4_0= ruleExpression )
            	    // InternalJsonDsl.g:2086:6: lv_keys_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainsAccess().getKeysExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,31,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getContainsAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_6=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getContainsAccess().getINKeyword_5());
              		
            }
            otherlv_7=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getContainsAccess().getLeftParenthesisKeyword_6());
              		
            }
            // InternalJsonDsl.g:2116:3: ( (lv_right_8_0= ruleExpression ) )
            // InternalJsonDsl.g:2117:4: (lv_right_8_0= ruleExpression )
            {
            // InternalJsonDsl.g:2117:4: (lv_right_8_0= ruleExpression )
            // InternalJsonDsl.g:2118:5: lv_right_8_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainsAccess().getRightExpressionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_9=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:2143:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalJsonDsl.g:2143:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalJsonDsl.g:2144:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalJsonDsl.g:2150:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? ) ;
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
            // InternalJsonDsl.g:2156:2: ( (otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? ) )
            // InternalJsonDsl.g:2157:2: (otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? )
            {
            // InternalJsonDsl.g:2157:2: (otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? )
            // InternalJsonDsl.g:2158:3: otherlv_0= 'SELECT' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2166:3: (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_DOUBLE)||(LA24_0>=24 && LA24_0<=25)||(LA24_0>=29 && LA24_0<=32)||LA24_0==34||(LA24_0>=37 && LA24_0<=38)||LA24_0==40||(LA24_0>=42 && LA24_0<=45)||(LA24_0>=48 && LA24_0<=49)||(LA24_0>=51 && LA24_0<=55)||(LA24_0>=57 && LA24_0<=59)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalJsonDsl.g:2167:4: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getAsteriskKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:2172:4: ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )?
                    {
                    // InternalJsonDsl.g:2172:4: ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_DOUBLE)||(LA23_0>=24 && LA23_0<=25)||(LA23_0>=29 && LA23_0<=30)||LA23_0==32||LA23_0==34||(LA23_0>=37 && LA23_0<=38)||LA23_0==40||(LA23_0>=42 && LA23_0<=45)||(LA23_0>=48 && LA23_0<=49)||(LA23_0>=51 && LA23_0<=55)||(LA23_0>=57 && LA23_0<=59)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalJsonDsl.g:2173:5: ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )*
                            {
                            // InternalJsonDsl.g:2173:5: ( (lv_fields_3_0= ruleExpression ) )
                            // InternalJsonDsl.g:2174:6: (lv_fields_3_0= ruleExpression )
                            {
                            // InternalJsonDsl.g:2174:6: (lv_fields_3_0= ruleExpression )
                            // InternalJsonDsl.g:2175:7: lv_fields_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSelectAccess().getFieldsExpressionParserRuleCall_2_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_20);
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

                            // InternalJsonDsl.g:2192:5: (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==35) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalJsonDsl.g:2193:6: otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_2_1_1_0());
                            	      					
                            	    }
                            	    // InternalJsonDsl.g:2197:6: ( (lv_fields_5_0= ruleExpression ) )
                            	    // InternalJsonDsl.g:2198:7: (lv_fields_5_0= ruleExpression )
                            	    {
                            	    // InternalJsonDsl.g:2198:7: (lv_fields_5_0= ruleExpression )
                            	    // InternalJsonDsl.g:2199:8: lv_fields_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSelectAccess().getFieldsExpressionParserRuleCall_2_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_20);
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
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_7=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSelectAccess().getFROMKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:2231:3: ( (lv_fromExpression_9_0= ruleExpression ) )
            // InternalJsonDsl.g:2232:4: (lv_fromExpression_9_0= ruleExpression )
            {
            // InternalJsonDsl.g:2232:4: (lv_fromExpression_9_0= ruleExpression )
            // InternalJsonDsl.g:2233:5: lv_fromExpression_9_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSelectAccess().getFromExpressionExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_10=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getSelectAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalJsonDsl.g:2254:3: ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) && (synpred1_InternalJsonDsl())) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJsonDsl.g:2255:4: ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')'
                    {
                    // InternalJsonDsl.g:2255:4: ( ( 'WHERE' )=>otherlv_11= 'WHERE' )
                    // InternalJsonDsl.g:2256:5: ( 'WHERE' )=>otherlv_11= 'WHERE'
                    {
                    otherlv_11=(Token)match(input,47,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getSelectAccess().getWHEREKeyword_8_0());
                      				
                    }

                    }

                    otherlv_12=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_8_1());
                      			
                    }
                    // InternalJsonDsl.g:2266:4: ( (lv_whereExpression_13_0= ruleExpression ) )
                    // InternalJsonDsl.g:2267:5: (lv_whereExpression_13_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2267:5: (lv_whereExpression_13_0= ruleExpression )
                    // InternalJsonDsl.g:2268:6: lv_whereExpression_13_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSelectAccess().getWhereExpressionExpressionParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
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

                    otherlv_14=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:2294:1: entryRuleConcat returns [EObject current=null] : iv_ruleConcat= ruleConcat EOF ;
    public final EObject entryRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcat = null;


        try {
            // InternalJsonDsl.g:2294:47: (iv_ruleConcat= ruleConcat EOF )
            // InternalJsonDsl.g:2295:2: iv_ruleConcat= ruleConcat EOF
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
    // InternalJsonDsl.g:2301:1: ruleConcat returns [EObject current=null] : (otherlv_0= 'CONCAT' otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) ) otherlv_5= ')' ) ;
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
            // InternalJsonDsl.g:2307:2: ( (otherlv_0= 'CONCAT' otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) ) otherlv_5= ')' ) )
            // InternalJsonDsl.g:2308:2: (otherlv_0= 'CONCAT' otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) ) otherlv_5= ')' )
            {
            // InternalJsonDsl.g:2308:2: (otherlv_0= 'CONCAT' otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) ) otherlv_5= ')' )
            // InternalJsonDsl.g:2309:3: otherlv_0= 'CONCAT' otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConcatAccess().getCONCATKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcatAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2317:3: ( (lv_expressions_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2318:4: (lv_expressions_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2318:4: (lv_expressions_2_0= ruleExpression )
            // InternalJsonDsl.g:2319:5: lv_expressions_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConcatAccess().getExpressionsExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            // InternalJsonDsl.g:2336:3: (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )
            // InternalJsonDsl.g:2337:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) )
            {
            otherlv_3=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getConcatAccess().getCommaKeyword_3_0());
              			
            }
            // InternalJsonDsl.g:2341:4: ( (lv_expressions_4_0= ruleExpression ) )
            // InternalJsonDsl.g:2342:5: (lv_expressions_4_0= ruleExpression )
            {
            // InternalJsonDsl.g:2342:5: (lv_expressions_4_0= ruleExpression )
            // InternalJsonDsl.g:2343:6: lv_expressions_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getConcatAccess().getExpressionsExpressionParserRuleCall_3_1_0());
              					
            }
            pushFollow(FOLLOW_13);
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

            otherlv_5=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSum"
    // InternalJsonDsl.g:2369:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalJsonDsl.g:2369:44: (iv_ruleSum= ruleSum EOF )
            // InternalJsonDsl.g:2370:2: iv_ruleSum= ruleSum EOF
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
    // InternalJsonDsl.g:2376:1: ruleSum returns [EObject current=null] : (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )? ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_expression_2_0 = null;

        EObject lv_fields_6_0 = null;

        EObject lv_fields_8_0 = null;

        EObject lv_whereExpression_12_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2382:2: ( (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )? ) )
            // InternalJsonDsl.g:2383:2: (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )? )
            {
            // InternalJsonDsl.g:2383:2: (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )? )
            // InternalJsonDsl.g:2384:3: otherlv_0= 'SUM' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getSUMKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSumAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2392:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2393:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2393:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2394:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSumAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,31,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSumAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalJsonDsl.g:2415:3: (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJsonDsl.g:2416:4: otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSumAccess().getONKeyword_4_0());
                      			
                    }
                    otherlv_5=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSumAccess().getLeftParenthesisKeyword_4_1());
                      			
                    }
                    // InternalJsonDsl.g:2424:4: ( (lv_fields_6_0= ruleExpression ) )
                    // InternalJsonDsl.g:2425:5: (lv_fields_6_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2425:5: (lv_fields_6_0= ruleExpression )
                    // InternalJsonDsl.g:2426:6: lv_fields_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSumAccess().getFieldsExpressionParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_fields_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSumRule());
                      						}
                      						add(
                      							current,
                      							"fields",
                      							lv_fields_6_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalJsonDsl.g:2443:4: (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==35) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalJsonDsl.g:2444:5: otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getSumAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalJsonDsl.g:2448:5: ( (lv_fields_8_0= ruleExpression ) )
                    	    // InternalJsonDsl.g:2449:6: (lv_fields_8_0= ruleExpression )
                    	    {
                    	    // InternalJsonDsl.g:2449:6: (lv_fields_8_0= ruleExpression )
                    	    // InternalJsonDsl.g:2450:7: lv_fields_8_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSumAccess().getFieldsExpressionParserRuleCall_4_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_fields_8_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSumRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"fields",
                    	      								lv_fields_8_0,
                    	      								"org.xtext.example.mydsl.JsonDsl.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getSumAccess().getRightParenthesisKeyword_4_4());
                      			
                    }

                    }
                    break;

            }

            // InternalJsonDsl.g:2473:3: ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) && (synpred2_InternalJsonDsl())) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJsonDsl.g:2474:4: ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')'
                    {
                    // InternalJsonDsl.g:2474:4: ( ( 'WHERE' )=>otherlv_10= 'WHERE' )
                    // InternalJsonDsl.g:2475:5: ( 'WHERE' )=>otherlv_10= 'WHERE'
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getSumAccess().getWHEREKeyword_5_0());
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getSumAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalJsonDsl.g:2485:4: ( (lv_whereExpression_12_0= ruleExpression ) )
                    // InternalJsonDsl.g:2486:5: (lv_whereExpression_12_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2486:5: (lv_whereExpression_12_0= ruleExpression )
                    // InternalJsonDsl.g:2487:6: lv_whereExpression_12_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSumAccess().getWhereExpressionExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_whereExpression_12_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSumRule());
                      						}
                      						set(
                      							current,
                      							"whereExpression",
                      							lv_whereExpression_12_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getSumAccess().getRightParenthesisKeyword_5_3());
                      			
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
    // InternalJsonDsl.g:2513:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalJsonDsl.g:2513:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalJsonDsl.g:2514:2: iv_ruleProduct= ruleProduct EOF
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
    // InternalJsonDsl.g:2520:1: ruleProduct returns [EObject current=null] : (otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )? ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_expression_2_0 = null;

        EObject lv_fields_6_0 = null;

        EObject lv_fields_8_0 = null;

        EObject lv_whereExpression_12_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2526:2: ( (otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )? ) )
            // InternalJsonDsl.g:2527:2: (otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )? )
            {
            // InternalJsonDsl.g:2527:2: (otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )? )
            // InternalJsonDsl.g:2528:3: otherlv_0= 'PRODUCT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProductAccess().getPRODUCTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProductAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2536:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2537:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2537:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2538:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProductAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,31,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProductAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalJsonDsl.g:2559:3: (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJsonDsl.g:2560:4: otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getProductAccess().getONKeyword_4_0());
                      			
                    }
                    otherlv_5=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getProductAccess().getLeftParenthesisKeyword_4_1());
                      			
                    }
                    // InternalJsonDsl.g:2568:4: ( (lv_fields_6_0= ruleExpression ) )
                    // InternalJsonDsl.g:2569:5: (lv_fields_6_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2569:5: (lv_fields_6_0= ruleExpression )
                    // InternalJsonDsl.g:2570:6: lv_fields_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProductAccess().getFieldsExpressionParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_fields_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProductRule());
                      						}
                      						add(
                      							current,
                      							"fields",
                      							lv_fields_6_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalJsonDsl.g:2587:4: (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==35) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalJsonDsl.g:2588:5: otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getProductAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalJsonDsl.g:2592:5: ( (lv_fields_8_0= ruleExpression ) )
                    	    // InternalJsonDsl.g:2593:6: (lv_fields_8_0= ruleExpression )
                    	    {
                    	    // InternalJsonDsl.g:2593:6: (lv_fields_8_0= ruleExpression )
                    	    // InternalJsonDsl.g:2594:7: lv_fields_8_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getProductAccess().getFieldsExpressionParserRuleCall_4_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_fields_8_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getProductRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"fields",
                    	      								lv_fields_8_0,
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

                    otherlv_9=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getProductAccess().getRightParenthesisKeyword_4_4());
                      			
                    }

                    }
                    break;

            }

            // InternalJsonDsl.g:2617:3: ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) && (synpred3_InternalJsonDsl())) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJsonDsl.g:2618:4: ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')'
                    {
                    // InternalJsonDsl.g:2618:4: ( ( 'WHERE' )=>otherlv_10= 'WHERE' )
                    // InternalJsonDsl.g:2619:5: ( 'WHERE' )=>otherlv_10= 'WHERE'
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getProductAccess().getWHEREKeyword_5_0());
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getProductAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalJsonDsl.g:2629:4: ( (lv_whereExpression_12_0= ruleExpression ) )
                    // InternalJsonDsl.g:2630:5: (lv_whereExpression_12_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2630:5: (lv_whereExpression_12_0= ruleExpression )
                    // InternalJsonDsl.g:2631:6: lv_whereExpression_12_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProductAccess().getWhereExpressionExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_whereExpression_12_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProductRule());
                      						}
                      						set(
                      							current,
                      							"whereExpression",
                      							lv_whereExpression_12_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getProductAccess().getRightParenthesisKeyword_5_3());
                      			
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


    // $ANTLR start "entryRuleMean"
    // InternalJsonDsl.g:2657:1: entryRuleMean returns [EObject current=null] : iv_ruleMean= ruleMean EOF ;
    public final EObject entryRuleMean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMean = null;


        try {
            // InternalJsonDsl.g:2657:45: (iv_ruleMean= ruleMean EOF )
            // InternalJsonDsl.g:2658:2: iv_ruleMean= ruleMean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMeanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMean=ruleMean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMean; 
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
    // $ANTLR end "entryRuleMean"


    // $ANTLR start "ruleMean"
    // InternalJsonDsl.g:2664:1: ruleMean returns [EObject current=null] : (otherlv_0= 'MEAN' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )? ) ;
    public final EObject ruleMean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_expression_2_0 = null;

        EObject lv_fields_6_0 = null;

        EObject lv_fields_8_0 = null;

        EObject lv_whereExpression_12_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2670:2: ( (otherlv_0= 'MEAN' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )? ) )
            // InternalJsonDsl.g:2671:2: (otherlv_0= 'MEAN' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )? )
            {
            // InternalJsonDsl.g:2671:2: (otherlv_0= 'MEAN' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )? )
            // InternalJsonDsl.g:2672:3: otherlv_0= 'MEAN' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )? ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMeanAccess().getMEANKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMeanAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2680:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2681:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2681:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2682:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMeanAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMeanRule());
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

            otherlv_3=(Token)match(input,31,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMeanAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalJsonDsl.g:2703:3: (otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJsonDsl.g:2704:4: otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMeanAccess().getONKeyword_4_0());
                      			
                    }
                    otherlv_5=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMeanAccess().getLeftParenthesisKeyword_4_1());
                      			
                    }
                    // InternalJsonDsl.g:2712:4: ( (lv_fields_6_0= ruleExpression ) )
                    // InternalJsonDsl.g:2713:5: (lv_fields_6_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2713:5: (lv_fields_6_0= ruleExpression )
                    // InternalJsonDsl.g:2714:6: lv_fields_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMeanAccess().getFieldsExpressionParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_fields_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMeanRule());
                      						}
                      						add(
                      							current,
                      							"fields",
                      							lv_fields_6_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalJsonDsl.g:2731:4: (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==35) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalJsonDsl.g:2732:5: otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getMeanAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalJsonDsl.g:2736:5: ( (lv_fields_8_0= ruleExpression ) )
                    	    // InternalJsonDsl.g:2737:6: (lv_fields_8_0= ruleExpression )
                    	    {
                    	    // InternalJsonDsl.g:2737:6: (lv_fields_8_0= ruleExpression )
                    	    // InternalJsonDsl.g:2738:7: lv_fields_8_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMeanAccess().getFieldsExpressionParserRuleCall_4_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_fields_8_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMeanRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"fields",
                    	      								lv_fields_8_0,
                    	      								"org.xtext.example.mydsl.JsonDsl.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getMeanAccess().getRightParenthesisKeyword_4_4());
                      			
                    }

                    }
                    break;

            }

            // InternalJsonDsl.g:2761:3: ( ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) && (synpred4_InternalJsonDsl())) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJsonDsl.g:2762:4: ( ( 'WHERE' )=>otherlv_10= 'WHERE' ) otherlv_11= '(' ( (lv_whereExpression_12_0= ruleExpression ) ) otherlv_13= ')'
                    {
                    // InternalJsonDsl.g:2762:4: ( ( 'WHERE' )=>otherlv_10= 'WHERE' )
                    // InternalJsonDsl.g:2763:5: ( 'WHERE' )=>otherlv_10= 'WHERE'
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getMeanAccess().getWHEREKeyword_5_0());
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getMeanAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalJsonDsl.g:2773:4: ( (lv_whereExpression_12_0= ruleExpression ) )
                    // InternalJsonDsl.g:2774:5: (lv_whereExpression_12_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2774:5: (lv_whereExpression_12_0= ruleExpression )
                    // InternalJsonDsl.g:2775:6: lv_whereExpression_12_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMeanAccess().getWhereExpressionExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_whereExpression_12_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMeanRule());
                      						}
                      						set(
                      							current,
                      							"whereExpression",
                      							lv_whereExpression_12_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getMeanAccess().getRightParenthesisKeyword_5_3());
                      			
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
    // $ANTLR end "ruleMean"


    // $ANTLR start "entryRuleAdd"
    // InternalJsonDsl.g:2801:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalJsonDsl.g:2801:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalJsonDsl.g:2802:2: iv_ruleAdd= ruleAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdd; 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalJsonDsl.g:2808:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'ADD' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= 'ON' otherlv_9= '(' ( (lv_fields_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) ;
    public final EObject ruleAdd() throws RecognitionException {
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
        Token otherlv_13=null;
        EObject lv_expression_2_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_fields_10_0 = null;

        EObject lv_fields_12_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2814:2: ( (otherlv_0= 'ADD' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= 'ON' otherlv_9= '(' ( (lv_fields_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) )
            // InternalJsonDsl.g:2815:2: (otherlv_0= 'ADD' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= 'ON' otherlv_9= '(' ( (lv_fields_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleExpression ) ) )* otherlv_13= ')' )? )
            {
            // InternalJsonDsl.g:2815:2: (otherlv_0= 'ADD' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= 'ON' otherlv_9= '(' ( (lv_fields_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleExpression ) ) )* otherlv_13= ')' )? )
            // InternalJsonDsl.g:2816:3: otherlv_0= 'ADD' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= 'ON' otherlv_9= '(' ( (lv_fields_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleExpression ) ) )* otherlv_13= ')' )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getADDKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAddAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2824:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2825:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2825:4: (lv_expression_2_0= ruleExpression )
            // InternalJsonDsl.g:2826:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAddRule());
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

            otherlv_3=(Token)match(input,31,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAddAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAddAccess().getINKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAddAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:2855:3: ( (lv_variable_6_0= ruleExpression ) )
            // InternalJsonDsl.g:2856:4: (lv_variable_6_0= ruleExpression )
            {
            // InternalJsonDsl.g:2856:4: (lv_variable_6_0= ruleExpression )
            // InternalJsonDsl.g:2857:5: lv_variable_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddAccess().getVariableExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_variable_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAddRule());
              					}
              					set(
              						current,
              						"variable",
              						lv_variable_6_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAddAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalJsonDsl.g:2878:3: (otherlv_8= 'ON' otherlv_9= '(' ( (lv_fields_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleExpression ) ) )* otherlv_13= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJsonDsl.g:2879:4: otherlv_8= 'ON' otherlv_9= '(' ( (lv_fields_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_fields_12_0= ruleExpression ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,50,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getAddAccess().getONKeyword_8_0());
                      			
                    }
                    otherlv_9=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getAddAccess().getLeftParenthesisKeyword_8_1());
                      			
                    }
                    // InternalJsonDsl.g:2887:4: ( (lv_fields_10_0= ruleExpression ) )
                    // InternalJsonDsl.g:2888:5: (lv_fields_10_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2888:5: (lv_fields_10_0= ruleExpression )
                    // InternalJsonDsl.g:2889:6: lv_fields_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAddAccess().getFieldsExpressionParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_fields_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAddRule());
                      						}
                      						add(
                      							current,
                      							"fields",
                      							lv_fields_10_0,
                      							"org.xtext.example.mydsl.JsonDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalJsonDsl.g:2906:4: (otherlv_11= ',' ( (lv_fields_12_0= ruleExpression ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==35) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalJsonDsl.g:2907:5: otherlv_11= ',' ( (lv_fields_12_0= ruleExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getAddAccess().getCommaKeyword_8_3_0());
                    	      				
                    	    }
                    	    // InternalJsonDsl.g:2911:5: ( (lv_fields_12_0= ruleExpression ) )
                    	    // InternalJsonDsl.g:2912:6: (lv_fields_12_0= ruleExpression )
                    	    {
                    	    // InternalJsonDsl.g:2912:6: (lv_fields_12_0= ruleExpression )
                    	    // InternalJsonDsl.g:2913:7: lv_fields_12_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAddAccess().getFieldsExpressionParserRuleCall_8_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_fields_12_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAddRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"fields",
                    	      								lv_fields_12_0,
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

                    otherlv_13=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getAddAccess().getRightParenthesisKeyword_8_4());
                      			
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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleInsert"
    // InternalJsonDsl.g:2940:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalJsonDsl.g:2940:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalJsonDsl.g:2941:2: iv_ruleInsert= ruleInsert EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsert; 
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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalJsonDsl.g:2947:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'INSERT' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) ;
    public final EObject ruleInsert() throws RecognitionException {
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
        EObject lv_value_2_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_whereExpression_10_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2953:2: ( (otherlv_0= 'INSERT' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) )
            // InternalJsonDsl.g:2954:2: (otherlv_0= 'INSERT' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            {
            // InternalJsonDsl.g:2954:2: (otherlv_0= 'INSERT' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            // InternalJsonDsl.g:2955:3: otherlv_0= 'INSERT' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getINSERTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:2963:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalJsonDsl.g:2964:4: (lv_value_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:2964:4: (lv_value_2_0= ruleExpression )
            // InternalJsonDsl.g:2965:5: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInsertAccess().getValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInsertRule());
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

            otherlv_3=(Token)match(input,31,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInsertAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInsertAccess().getINKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getInsertAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:2994:3: ( (lv_variable_6_0= ruleExpression ) )
            // InternalJsonDsl.g:2995:4: (lv_variable_6_0= ruleExpression )
            {
            // InternalJsonDsl.g:2995:4: (lv_variable_6_0= ruleExpression )
            // InternalJsonDsl.g:2996:5: lv_variable_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInsertAccess().getVariableExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_variable_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInsertRule());
              					}
              					set(
              						current,
              						"variable",
              						lv_variable_6_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getInsertAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalJsonDsl.g:3017:3: (otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalJsonDsl.g:3018:4: otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getInsertAccess().getLeftParenthesisKeyword_8_0());
                      			
                    }
                    otherlv_9=(Token)match(input,47,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getInsertAccess().getWHEREKeyword_8_1());
                      			
                    }
                    // InternalJsonDsl.g:3026:4: ( (lv_whereExpression_10_0= ruleExpression ) )
                    // InternalJsonDsl.g:3027:5: (lv_whereExpression_10_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:3027:5: (lv_whereExpression_10_0= ruleExpression )
                    // InternalJsonDsl.g:3028:6: lv_whereExpression_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInsertAccess().getWhereExpressionExpressionParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_whereExpression_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInsertRule());
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

                    otherlv_11=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getInsertAccess().getRightParenthesisKeyword_8_3());
                      			
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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleRename"
    // InternalJsonDsl.g:3054:1: entryRuleRename returns [EObject current=null] : iv_ruleRename= ruleRename EOF ;
    public final EObject entryRuleRename() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRename = null;


        try {
            // InternalJsonDsl.g:3054:47: (iv_ruleRename= ruleRename EOF )
            // InternalJsonDsl.g:3055:2: iv_ruleRename= ruleRename EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRenameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRename=ruleRename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRename; 
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
    // $ANTLR end "entryRuleRename"


    // $ANTLR start "ruleRename"
    // InternalJsonDsl.g:3061:1: ruleRename returns [EObject current=null] : (otherlv_0= 'RENAME' otherlv_1= '(' ( (lv_call_2_0= ruleVariableCall ) ) otherlv_3= ')' otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' otherlv_10= 'TO' otherlv_11= '(' ( (lv_nfields_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_nfields_14_0= ruleExpression ) ) )* otherlv_15= ')' ) ;
    public final EObject ruleRename() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_call_2_0 = null;

        EObject lv_fields_6_0 = null;

        EObject lv_fields_8_0 = null;

        EObject lv_nfields_12_0 = null;

        EObject lv_nfields_14_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:3067:2: ( (otherlv_0= 'RENAME' otherlv_1= '(' ( (lv_call_2_0= ruleVariableCall ) ) otherlv_3= ')' otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' otherlv_10= 'TO' otherlv_11= '(' ( (lv_nfields_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_nfields_14_0= ruleExpression ) ) )* otherlv_15= ')' ) )
            // InternalJsonDsl.g:3068:2: (otherlv_0= 'RENAME' otherlv_1= '(' ( (lv_call_2_0= ruleVariableCall ) ) otherlv_3= ')' otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' otherlv_10= 'TO' otherlv_11= '(' ( (lv_nfields_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_nfields_14_0= ruleExpression ) ) )* otherlv_15= ')' )
            {
            // InternalJsonDsl.g:3068:2: (otherlv_0= 'RENAME' otherlv_1= '(' ( (lv_call_2_0= ruleVariableCall ) ) otherlv_3= ')' otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' otherlv_10= 'TO' otherlv_11= '(' ( (lv_nfields_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_nfields_14_0= ruleExpression ) ) )* otherlv_15= ')' )
            // InternalJsonDsl.g:3069:3: otherlv_0= 'RENAME' otherlv_1= '(' ( (lv_call_2_0= ruleVariableCall ) ) otherlv_3= ')' otherlv_4= 'ON' otherlv_5= '(' ( (lv_fields_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )* otherlv_9= ')' otherlv_10= 'TO' otherlv_11= '(' ( (lv_nfields_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_nfields_14_0= ruleExpression ) ) )* otherlv_15= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRenameAccess().getRENAMEKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRenameAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:3077:3: ( (lv_call_2_0= ruleVariableCall ) )
            // InternalJsonDsl.g:3078:4: (lv_call_2_0= ruleVariableCall )
            {
            // InternalJsonDsl.g:3078:4: (lv_call_2_0= ruleVariableCall )
            // InternalJsonDsl.g:3079:5: lv_call_2_0= ruleVariableCall
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRenameAccess().getCallVariableCallParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_call_2_0=ruleVariableCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRenameRule());
              					}
              					set(
              						current,
              						"call",
              						lv_call_2_0,
              						"org.xtext.example.mydsl.JsonDsl.VariableCall");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRenameAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,50,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRenameAccess().getONKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRenameAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:3108:3: ( (lv_fields_6_0= ruleExpression ) )
            // InternalJsonDsl.g:3109:4: (lv_fields_6_0= ruleExpression )
            {
            // InternalJsonDsl.g:3109:4: (lv_fields_6_0= ruleExpression )
            // InternalJsonDsl.g:3110:5: lv_fields_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRenameAccess().getFieldsExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_fields_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRenameRule());
              					}
              					add(
              						current,
              						"fields",
              						lv_fields_6_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalJsonDsl.g:3127:3: (otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==35) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalJsonDsl.g:3128:4: otherlv_7= ',' ( (lv_fields_8_0= ruleExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getRenameAccess().getCommaKeyword_7_0());
            	      			
            	    }
            	    // InternalJsonDsl.g:3132:4: ( (lv_fields_8_0= ruleExpression ) )
            	    // InternalJsonDsl.g:3133:5: (lv_fields_8_0= ruleExpression )
            	    {
            	    // InternalJsonDsl.g:3133:5: (lv_fields_8_0= ruleExpression )
            	    // InternalJsonDsl.g:3134:6: lv_fields_8_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRenameAccess().getFieldsExpressionParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_fields_8_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRenameRule());
            	      						}
            	      						add(
            	      							current,
            	      							"fields",
            	      							lv_fields_8_0,
            	      							"org.xtext.example.mydsl.JsonDsl.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_9=(Token)match(input,31,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getRenameAccess().getRightParenthesisKeyword_8());
              		
            }
            otherlv_10=(Token)match(input,56,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getRenameAccess().getTOKeyword_9());
              		
            }
            otherlv_11=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getRenameAccess().getLeftParenthesisKeyword_10());
              		
            }
            // InternalJsonDsl.g:3164:3: ( (lv_nfields_12_0= ruleExpression ) )
            // InternalJsonDsl.g:3165:4: (lv_nfields_12_0= ruleExpression )
            {
            // InternalJsonDsl.g:3165:4: (lv_nfields_12_0= ruleExpression )
            // InternalJsonDsl.g:3166:5: lv_nfields_12_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRenameAccess().getNfieldsExpressionParserRuleCall_11_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_nfields_12_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRenameRule());
              					}
              					add(
              						current,
              						"nfields",
              						lv_nfields_12_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalJsonDsl.g:3183:3: (otherlv_13= ',' ( (lv_nfields_14_0= ruleExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==35) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalJsonDsl.g:3184:4: otherlv_13= ',' ( (lv_nfields_14_0= ruleExpression ) )
            	    {
            	    otherlv_13=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_13, grammarAccess.getRenameAccess().getCommaKeyword_12_0());
            	      			
            	    }
            	    // InternalJsonDsl.g:3188:4: ( (lv_nfields_14_0= ruleExpression ) )
            	    // InternalJsonDsl.g:3189:5: (lv_nfields_14_0= ruleExpression )
            	    {
            	    // InternalJsonDsl.g:3189:5: (lv_nfields_14_0= ruleExpression )
            	    // InternalJsonDsl.g:3190:6: lv_nfields_14_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRenameAccess().getNfieldsExpressionParserRuleCall_12_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_nfields_14_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRenameRule());
            	      						}
            	      						add(
            	      							current,
            	      							"nfields",
            	      							lv_nfields_14_0,
            	      							"org.xtext.example.mydsl.JsonDsl.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_15=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getRenameAccess().getRightParenthesisKeyword_13());
              		
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
    // $ANTLR end "ruleRename"


    // $ANTLR start "entryRuleDelete"
    // InternalJsonDsl.g:3216:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalJsonDsl.g:3216:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalJsonDsl.g:3217:2: iv_ruleDelete= ruleDelete EOF
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
    // InternalJsonDsl.g:3223:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'DELETE' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? ) ;
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
            // InternalJsonDsl.g:3229:2: ( (otherlv_0= 'DELETE' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? ) )
            // InternalJsonDsl.g:3230:2: (otherlv_0= 'DELETE' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? )
            {
            // InternalJsonDsl.g:3230:2: (otherlv_0= 'DELETE' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )? )
            // InternalJsonDsl.g:3231:3: otherlv_0= 'DELETE' otherlv_1= '(' (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? ) otherlv_6= ')' otherlv_7= 'FROM' otherlv_8= '(' ( (lv_fromExpression_9_0= ruleExpression ) ) otherlv_10= ')' ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )?
            {
            otherlv_0=(Token)match(input,57,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDELETEKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:3239:3: (otherlv_2= '*' | ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )? )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==26) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_DOUBLE)||(LA42_0>=24 && LA42_0<=25)||(LA42_0>=29 && LA42_0<=32)||LA42_0==34||(LA42_0>=37 && LA42_0<=38)||LA42_0==40||(LA42_0>=42 && LA42_0<=45)||(LA42_0>=48 && LA42_0<=49)||(LA42_0>=51 && LA42_0<=55)||(LA42_0>=57 && LA42_0<=59)) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalJsonDsl.g:3240:4: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getAsteriskKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:3245:4: ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )?
                    {
                    // InternalJsonDsl.g:3245:4: ( ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_DOUBLE)||(LA41_0>=24 && LA41_0<=25)||(LA41_0>=29 && LA41_0<=30)||LA41_0==32||LA41_0==34||(LA41_0>=37 && LA41_0<=38)||LA41_0==40||(LA41_0>=42 && LA41_0<=45)||(LA41_0>=48 && LA41_0<=49)||(LA41_0>=51 && LA41_0<=55)||(LA41_0>=57 && LA41_0<=59)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalJsonDsl.g:3246:5: ( (lv_fields_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )*
                            {
                            // InternalJsonDsl.g:3246:5: ( (lv_fields_3_0= ruleExpression ) )
                            // InternalJsonDsl.g:3247:6: (lv_fields_3_0= ruleExpression )
                            {
                            // InternalJsonDsl.g:3247:6: (lv_fields_3_0= ruleExpression )
                            // InternalJsonDsl.g:3248:7: lv_fields_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDeleteAccess().getFieldsExpressionParserRuleCall_2_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_20);
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

                            // InternalJsonDsl.g:3265:5: (otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==35) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // InternalJsonDsl.g:3266:6: otherlv_4= ',' ( (lv_fields_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getDeleteAccess().getCommaKeyword_2_1_1_0());
                            	      					
                            	    }
                            	    // InternalJsonDsl.g:3270:6: ( (lv_fields_5_0= ruleExpression ) )
                            	    // InternalJsonDsl.g:3271:7: (lv_fields_5_0= ruleExpression )
                            	    {
                            	    // InternalJsonDsl.g:3271:7: (lv_fields_5_0= ruleExpression )
                            	    // InternalJsonDsl.g:3272:8: lv_fields_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDeleteAccess().getFieldsExpressionParserRuleCall_2_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_20);
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
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDeleteAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_7=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDeleteAccess().getFROMKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDeleteAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:3304:3: ( (lv_fromExpression_9_0= ruleExpression ) )
            // InternalJsonDsl.g:3305:4: (lv_fromExpression_9_0= ruleExpression )
            {
            // InternalJsonDsl.g:3305:4: (lv_fromExpression_9_0= ruleExpression )
            // InternalJsonDsl.g:3306:5: lv_fromExpression_9_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeleteAccess().getFromExpressionExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_10=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getDeleteAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalJsonDsl.g:3327:3: ( ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) && (synpred5_InternalJsonDsl())) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalJsonDsl.g:3328:4: ( ( 'WHERE' )=>otherlv_11= 'WHERE' ) otherlv_12= '(' ( (lv_whereExpression_13_0= ruleExpression ) ) otherlv_14= ')'
                    {
                    // InternalJsonDsl.g:3328:4: ( ( 'WHERE' )=>otherlv_11= 'WHERE' )
                    // InternalJsonDsl.g:3329:5: ( 'WHERE' )=>otherlv_11= 'WHERE'
                    {
                    otherlv_11=(Token)match(input,47,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getDeleteAccess().getWHEREKeyword_8_0());
                      				
                    }

                    }

                    otherlv_12=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getDeleteAccess().getLeftParenthesisKeyword_8_1());
                      			
                    }
                    // InternalJsonDsl.g:3339:4: ( (lv_whereExpression_13_0= ruleExpression ) )
                    // InternalJsonDsl.g:3340:5: (lv_whereExpression_13_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:3340:5: (lv_whereExpression_13_0= ruleExpression )
                    // InternalJsonDsl.g:3341:6: lv_whereExpression_13_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeleteAccess().getWhereExpressionExpressionParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
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

                    otherlv_14=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleRemove"
    // InternalJsonDsl.g:3367:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalJsonDsl.g:3367:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalJsonDsl.g:3368:2: iv_ruleRemove= ruleRemove EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRemoveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRemove; 
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
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalJsonDsl.g:3374:1: ruleRemove returns [EObject current=null] : (otherlv_0= 'REMOVE' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) ;
    public final EObject ruleRemove() throws RecognitionException {
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
        EObject lv_value_2_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_whereExpression_10_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:3380:2: ( (otherlv_0= 'REMOVE' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? ) )
            // InternalJsonDsl.g:3381:2: (otherlv_0= 'REMOVE' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            {
            // InternalJsonDsl.g:3381:2: (otherlv_0= 'REMOVE' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )? )
            // InternalJsonDsl.g:3382:3: otherlv_0= 'REMOVE' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'IN' otherlv_5= '(' ( (lv_variable_6_0= ruleExpression ) ) otherlv_7= ')' (otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRemoveAccess().getREMOVEKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalJsonDsl.g:3390:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalJsonDsl.g:3391:4: (lv_value_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:3391:4: (lv_value_2_0= ruleExpression )
            // InternalJsonDsl.g:3392:5: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveAccess().getValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRemoveRule());
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

            otherlv_3=(Token)match(input,31,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRemoveAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRemoveAccess().getINKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRemoveAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalJsonDsl.g:3421:3: ( (lv_variable_6_0= ruleExpression ) )
            // InternalJsonDsl.g:3422:4: (lv_variable_6_0= ruleExpression )
            {
            // InternalJsonDsl.g:3422:4: (lv_variable_6_0= ruleExpression )
            // InternalJsonDsl.g:3423:5: lv_variable_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveAccess().getVariableExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_variable_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRemoveRule());
              					}
              					set(
              						current,
              						"variable",
              						lv_variable_6_0,
              						"org.xtext.example.mydsl.JsonDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getRemoveAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalJsonDsl.g:3444:3: (otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==30) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalJsonDsl.g:3445:4: otherlv_8= '(' otherlv_9= 'WHERE' ( (lv_whereExpression_10_0= ruleExpression ) ) otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getRemoveAccess().getLeftParenthesisKeyword_8_0());
                      			
                    }
                    otherlv_9=(Token)match(input,47,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getRemoveAccess().getWHEREKeyword_8_1());
                      			
                    }
                    // InternalJsonDsl.g:3453:4: ( (lv_whereExpression_10_0= ruleExpression ) )
                    // InternalJsonDsl.g:3454:5: (lv_whereExpression_10_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:3454:5: (lv_whereExpression_10_0= ruleExpression )
                    // InternalJsonDsl.g:3455:6: lv_whereExpression_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRemoveAccess().getWhereExpressionExpressionParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_whereExpression_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRemoveRule());
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

                    otherlv_11=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getRemoveAccess().getRightParenthesisKeyword_8_3());
                      			
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
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleConstant"
    // InternalJsonDsl.g:3481:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalJsonDsl.g:3481:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalJsonDsl.g:3482:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalJsonDsl.g:3488:1: ruleConstant returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_Array_1= ruleArray | this_JSonObject_2= ruleJSonObject ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_Primitive_0 = null;

        EObject this_Array_1 = null;

        EObject this_JSonObject_2 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:3494:2: ( (this_Primitive_0= rulePrimitive | this_Array_1= ruleArray | this_JSonObject_2= ruleJSonObject ) )
            // InternalJsonDsl.g:3495:2: (this_Primitive_0= rulePrimitive | this_Array_1= ruleArray | this_JSonObject_2= ruleJSonObject )
            {
            // InternalJsonDsl.g:3495:2: (this_Primitive_0= rulePrimitive | this_Array_1= ruleArray | this_JSonObject_2= ruleJSonObject )
            int alt45=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOL:
            case RULE_NULL:
            case RULE_DOUBLE:
                {
                alt45=1;
                }
                break;
            case 34:
                {
                alt45=2;
                }
                break;
            case 59:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalJsonDsl.g:3496:3: this_Primitive_0= rulePrimitive
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
                    // InternalJsonDsl.g:3505:3: this_Array_1= ruleArray
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
                    // InternalJsonDsl.g:3514:3: this_JSonObject_2= ruleJSonObject
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
    // InternalJsonDsl.g:3526:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalJsonDsl.g:3526:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalJsonDsl.g:3527:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalJsonDsl.g:3533:1: rulePrimitive returns [EObject current=null] : ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_num_1_0= ruleNUMBER ) ) | ( (lv_bool_2_0= RULE_BOOL ) ) | ( (lv_nil_3_0= RULE_NULL ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;
        Token lv_bool_2_0=null;
        Token lv_nil_3_0=null;
        AntlrDatatypeRuleToken lv_num_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:3539:2: ( ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_num_1_0= ruleNUMBER ) ) | ( (lv_bool_2_0= RULE_BOOL ) ) | ( (lv_nil_3_0= RULE_NULL ) ) ) )
            // InternalJsonDsl.g:3540:2: ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_num_1_0= ruleNUMBER ) ) | ( (lv_bool_2_0= RULE_BOOL ) ) | ( (lv_nil_3_0= RULE_NULL ) ) )
            {
            // InternalJsonDsl.g:3540:2: ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_num_1_0= ruleNUMBER ) ) | ( (lv_bool_2_0= RULE_BOOL ) ) | ( (lv_nil_3_0= RULE_NULL ) ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt46=1;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt46=2;
                }
                break;
            case RULE_BOOL:
                {
                alt46=3;
                }
                break;
            case RULE_NULL:
                {
                alt46=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalJsonDsl.g:3541:3: ( (lv_str_0_0= RULE_STRING ) )
                    {
                    // InternalJsonDsl.g:3541:3: ( (lv_str_0_0= RULE_STRING ) )
                    // InternalJsonDsl.g:3542:4: (lv_str_0_0= RULE_STRING )
                    {
                    // InternalJsonDsl.g:3542:4: (lv_str_0_0= RULE_STRING )
                    // InternalJsonDsl.g:3543:5: lv_str_0_0= RULE_STRING
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
                    // InternalJsonDsl.g:3560:3: ( (lv_num_1_0= ruleNUMBER ) )
                    {
                    // InternalJsonDsl.g:3560:3: ( (lv_num_1_0= ruleNUMBER ) )
                    // InternalJsonDsl.g:3561:4: (lv_num_1_0= ruleNUMBER )
                    {
                    // InternalJsonDsl.g:3561:4: (lv_num_1_0= ruleNUMBER )
                    // InternalJsonDsl.g:3562:5: lv_num_1_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPrimitiveAccess().getNumNUMBERParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_num_1_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                      					}
                      					set(
                      						current,
                      						"num",
                      						lv_num_1_0,
                      						"org.xtext.example.mydsl.JsonDsl.NUMBER");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:3580:3: ( (lv_bool_2_0= RULE_BOOL ) )
                    {
                    // InternalJsonDsl.g:3580:3: ( (lv_bool_2_0= RULE_BOOL ) )
                    // InternalJsonDsl.g:3581:4: (lv_bool_2_0= RULE_BOOL )
                    {
                    // InternalJsonDsl.g:3581:4: (lv_bool_2_0= RULE_BOOL )
                    // InternalJsonDsl.g:3582:5: lv_bool_2_0= RULE_BOOL
                    {
                    lv_bool_2_0=(Token)match(input,RULE_BOOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_bool_2_0, grammarAccess.getPrimitiveAccess().getBoolBOOLTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"bool",
                      						lv_bool_2_0,
                      						"org.xtext.example.mydsl.JsonDsl.BOOL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJsonDsl.g:3599:3: ( (lv_nil_3_0= RULE_NULL ) )
                    {
                    // InternalJsonDsl.g:3599:3: ( (lv_nil_3_0= RULE_NULL ) )
                    // InternalJsonDsl.g:3600:4: (lv_nil_3_0= RULE_NULL )
                    {
                    // InternalJsonDsl.g:3600:4: (lv_nil_3_0= RULE_NULL )
                    // InternalJsonDsl.g:3601:5: lv_nil_3_0= RULE_NULL
                    {
                    lv_nil_3_0=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_nil_3_0, grammarAccess.getPrimitiveAccess().getNilNULLTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"nil",
                      						lv_nil_3_0,
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
    // InternalJsonDsl.g:3621:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalJsonDsl.g:3621:46: (iv_ruleArray= ruleArray EOF )
            // InternalJsonDsl.g:3622:2: iv_ruleArray= ruleArray EOF
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
    // InternalJsonDsl.g:3628:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:3634:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) )
            // InternalJsonDsl.g:3635:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            {
            // InternalJsonDsl.g:3635:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            // InternalJsonDsl.g:3636:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']'
            {
            // InternalJsonDsl.g:3636:3: ()
            // InternalJsonDsl.g:3637:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayAccess().getArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalJsonDsl.g:3647:3: ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_DOUBLE)||(LA48_0>=24 && LA48_0<=25)||(LA48_0>=29 && LA48_0<=30)||LA48_0==32||LA48_0==34||(LA48_0>=37 && LA48_0<=38)||LA48_0==40||(LA48_0>=42 && LA48_0<=45)||(LA48_0>=48 && LA48_0<=49)||(LA48_0>=51 && LA48_0<=55)||(LA48_0>=57 && LA48_0<=59)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalJsonDsl.g:3648:4: ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    {
                    // InternalJsonDsl.g:3648:4: ( (lv_values_2_0= ruleExpression ) )
                    // InternalJsonDsl.g:3649:5: (lv_values_2_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:3649:5: (lv_values_2_0= ruleExpression )
                    // InternalJsonDsl.g:3650:6: lv_values_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayAccess().getValuesExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
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

                    // InternalJsonDsl.g:3667:4: (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==35) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalJsonDsl.g:3668:5: otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalJsonDsl.g:3672:5: ( (lv_values_4_0= ruleExpression ) )
                    	    // InternalJsonDsl.g:3673:6: (lv_values_4_0= ruleExpression )
                    	    {
                    	    // InternalJsonDsl.g:3673:6: (lv_values_4_0= ruleExpression )
                    	    // InternalJsonDsl.g:3674:7: lv_values_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrayAccess().getValuesExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
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
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:3701:1: entryRuleJSonObject returns [EObject current=null] : iv_ruleJSonObject= ruleJSonObject EOF ;
    public final EObject entryRuleJSonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonObject = null;


        try {
            // InternalJsonDsl.g:3701:51: (iv_ruleJSonObject= ruleJSonObject EOF )
            // InternalJsonDsl.g:3702:2: iv_ruleJSonObject= ruleJSonObject EOF
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
    // InternalJsonDsl.g:3708:1: ruleJSonObject returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleJSonObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fields_2_0 = null;

        EObject lv_fields_4_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:3714:2: ( ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' ) )
            // InternalJsonDsl.g:3715:2: ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' )
            {
            // InternalJsonDsl.g:3715:2: ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' )
            // InternalJsonDsl.g:3716:3: () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}'
            {
            // InternalJsonDsl.g:3716:3: ()
            // InternalJsonDsl.g:3717:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJSonObjectAccess().getJSonObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJSonObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalJsonDsl.g:3727:3: ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_DOUBLE)||(LA50_0>=24 && LA50_0<=25)||(LA50_0>=29 && LA50_0<=30)||LA50_0==32||LA50_0==34||(LA50_0>=37 && LA50_0<=38)||LA50_0==40||(LA50_0>=42 && LA50_0<=45)||(LA50_0>=48 && LA50_0<=49)||(LA50_0>=51 && LA50_0<=55)||(LA50_0>=57 && LA50_0<=59)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalJsonDsl.g:3728:4: ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )*
                    {
                    // InternalJsonDsl.g:3728:4: ( (lv_fields_2_0= ruleField ) )
                    // InternalJsonDsl.g:3729:5: (lv_fields_2_0= ruleField )
                    {
                    // InternalJsonDsl.g:3729:5: (lv_fields_2_0= ruleField )
                    // InternalJsonDsl.g:3730:6: lv_fields_2_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJSonObjectAccess().getFieldsFieldParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
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

                    // InternalJsonDsl.g:3747:4: (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==35) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalJsonDsl.g:3748:5: otherlv_3= ',' ( (lv_fields_4_0= ruleField ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJSonObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalJsonDsl.g:3752:5: ( (lv_fields_4_0= ruleField ) )
                    	    // InternalJsonDsl.g:3753:6: (lv_fields_4_0= ruleField )
                    	    {
                    	    // InternalJsonDsl.g:3753:6: (lv_fields_4_0= ruleField )
                    	    // InternalJsonDsl.g:3754:7: lv_fields_4_0= ruleField
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJSonObjectAccess().getFieldsFieldParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_34);
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
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalJsonDsl.g:3781:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalJsonDsl.g:3781:46: (iv_ruleField= ruleField EOF )
            // InternalJsonDsl.g:3782:2: iv_ruleField= ruleField EOF
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
    // InternalJsonDsl.g:3788:1: ruleField returns [EObject current=null] : ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:3794:2: ( ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalJsonDsl.g:3795:2: ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalJsonDsl.g:3795:2: ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalJsonDsl.g:3796:3: ( (lv_key_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalJsonDsl.g:3796:3: ( (lv_key_0_0= ruleExpression ) )
            // InternalJsonDsl.g:3797:4: (lv_key_0_0= ruleExpression )
            {
            // InternalJsonDsl.g:3797:4: (lv_key_0_0= ruleExpression )
            // InternalJsonDsl.g:3798:5: lv_key_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldAccess().getKeyExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_35);
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

            otherlv_1=(Token)match(input,61,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
              		
            }
            // InternalJsonDsl.g:3819:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalJsonDsl.g:3820:4: (lv_value_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:3820:4: (lv_value_2_0= ruleExpression )
            // InternalJsonDsl.g:3821:5: lv_value_2_0= ruleExpression
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


    // $ANTLR start "entryRuleNUMBER"
    // InternalJsonDsl.g:3842:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalJsonDsl.g:3842:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalJsonDsl.g:3843:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalJsonDsl.g:3849:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:3855:2: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) )
            // InternalJsonDsl.g:3856:2: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            {
            // InternalJsonDsl.g:3856:2: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_DOUBLE) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalJsonDsl.g:3857:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:3865:3: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DOUBLE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DOUBLE_1, grammarAccess.getNUMBERAccess().getDOUBLETerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleNUMBER"

    // $ANTLR start synpred1_InternalJsonDsl
    public final void synpred1_InternalJsonDsl_fragment() throws RecognitionException {   
        // InternalJsonDsl.g:2256:5: ( 'WHERE' )
        // InternalJsonDsl.g:2256:6: 'WHERE'
        {
        match(input,47,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalJsonDsl

    // $ANTLR start synpred2_InternalJsonDsl
    public final void synpred2_InternalJsonDsl_fragment() throws RecognitionException {   
        // InternalJsonDsl.g:2475:5: ( 'WHERE' )
        // InternalJsonDsl.g:2475:6: 'WHERE'
        {
        match(input,47,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalJsonDsl

    // $ANTLR start synpred3_InternalJsonDsl
    public final void synpred3_InternalJsonDsl_fragment() throws RecognitionException {   
        // InternalJsonDsl.g:2619:5: ( 'WHERE' )
        // InternalJsonDsl.g:2619:6: 'WHERE'
        {
        match(input,47,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalJsonDsl

    // $ANTLR start synpred4_InternalJsonDsl
    public final void synpred4_InternalJsonDsl_fragment() throws RecognitionException {   
        // InternalJsonDsl.g:2763:5: ( 'WHERE' )
        // InternalJsonDsl.g:2763:6: 'WHERE'
        {
        match(input,47,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalJsonDsl

    // $ANTLR start synpred5_InternalJsonDsl
    public final void synpred5_InternalJsonDsl_fragment() throws RecognitionException {   
        // InternalJsonDsl.g:3329:5: ( 'WHERE' )
        // InternalJsonDsl.g:3329:6: 'WHERE'
        {
        match(input,47,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalJsonDsl

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
    public final boolean synpred5_InternalJsonDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalJsonDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\16\2\uffff\1\5\1\6\1\uffff\1\16\1\43\1\6\1\16\1\43";
    static final String dfa_3s = "\1\73\1\42\2\uffff\1\5\1\6\1\uffff\1\42\1\44\1\6\1\42\1\44";
    static final String dfa_4s = "\2\uffff\1\2\1\3\2\uffff\1\1\5\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\5\2\16\uffff\2\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\1\2\1\3\4\2\2\uffff\2\2\1\uffff\5\2\1\uffff\3\2",
            "\1\2\1\6\15\2\4\uffff\1\4\1\5",
            "",
            "",
            "\1\7",
            "\1\10",
            "",
            "\1\2\1\6\15\2\4\uffff\1\4\1\5",
            "\1\11\1\12",
            "\1\13",
            "\1\2\1\6\15\2\4\uffff\1\4\1\5",
            "\1\11\1\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "115:3: (this_Assignment_0= ruleAssignment | this_Expression_1= ruleExpression | this_ProcCall_2= ruleProcCall )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0EFB3F65630003F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0EFB3D65630003F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0EFB3D65E70003F0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004800000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0EFB3D75630003F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1EFB3D65630003F0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2000000000000000L});

}