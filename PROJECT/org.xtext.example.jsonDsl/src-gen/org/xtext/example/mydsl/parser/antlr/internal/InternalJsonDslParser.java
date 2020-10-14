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

@SuppressWarnings("all")
public class InternalJsonDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FIELD_NAME", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_BOOL", "RULE_NULL", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'OR'", "'AND'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'('", "')'", "'?'", "'~'", "'['", "','", "']'", "'LOAD'", "'STORE'", "'IN'", "'EXPORT_CSV'", "'PRINT'", "'GET_DEPTH'", "'GET_INFOS'", "'EXTRACT'", "'SELECT'", "'FROM'", "'WHERE'", "'CONCAT'", "'WITH'", "'SUM'", "'PRODUCT'", "'MEAN'", "'ON'", "'ADD'", "'INSERT'", "'RENAME'", "'TO'", "'ERASE'", "'DELETE'", "'REMOVE'", "'AT'", "'{'", "'}'", "':'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=7;
    public static final int RULE_NULL=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=11;
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
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_BOOL=8;
    public static final int RULE_NUMBER=6;
    public static final int RULE_FIELD_NAME=4;
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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

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

                if ( ((LA1_0>=RULE_FIELD_NAME && LA1_0<=RULE_NULL)||LA1_0==27||(LA1_0>=31 && LA1_0<=32)||LA1_0==34||LA1_0==36||(LA1_0>=39 && LA1_0<=40)||(LA1_0>=42 && LA1_0<=47)||LA1_0==50||(LA1_0>=52 && LA1_0<=54)||(LA1_0>=56 && LA1_0<=58)||(LA1_0>=60 && LA1_0<=62)||LA1_0==64) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJsonDsl.g:79:3: (lv_stmts_0_0= ruleSimpleStatement )
            	    {
            	    // InternalJsonDsl.g:79:3: (lv_stmts_0_0= ruleSimpleStatement )
            	    // InternalJsonDsl.g:80:4: lv_stmts_0_0= ruleSimpleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStmtsSimpleStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_stmts_0_0=ruleSimpleStatement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getSimpleStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleStatement=ruleSimpleStatement();

            state._fsp--;

             current =iv_ruleSimpleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

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

                    				newCompositeNode(grammarAccess.getSimpleStatementAccess().getAssignmentParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;


                    				current = this_Assignment_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:125:4: this_Expression_1= ruleExpression
                    {

                    				newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:134:4: this_ProcCall_2= ruleProcCall
                    {

                    				newCompositeNode(grammarAccess.getSimpleStatementAccess().getProcCallParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_4);
                    this_ProcCall_2=ruleProcCall();

                    state._fsp--;


                    				current = this_ProcCall_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleStatementAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

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

            					newCompositeNode(grammarAccess.getAssignmentAccess().getLeftHandSideVariableCallParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_leftHandSide_0_0=ruleVariableCall();

            state._fsp--;


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

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalJsonDsl.g:189:3: ( (lv_rightHandSide_2_0= ruleExpression ) )
            // InternalJsonDsl.g:190:4: (lv_rightHandSide_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:190:4: (lv_rightHandSide_2_0= ruleExpression )
            // InternalJsonDsl.g:191:5: lv_rightHandSide_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getRightHandSideExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rightHandSide_2_0=ruleExpression();

            state._fsp--;


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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:219:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:225:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalJsonDsl.g:226:2: this_BinaryExpression_0= ruleBinaryExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BinaryExpression_0=ruleBinaryExpression();

            state._fsp--;


            		current = this_BinaryExpression_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

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


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalJsonDsl.g:237:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalJsonDsl.g:237:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalJsonDsl.g:238:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalJsonDsl.g:244:1: ruleBinaryExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:250:2: (this_OrExpression_0= ruleOrExpression )
            // InternalJsonDsl.g:251:2: this_OrExpression_0= ruleOrExpression
            {

            		newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOrExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            		current = this_OrExpression_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalJsonDsl.g:262:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalJsonDsl.g:262:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalJsonDsl.g:263:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalJsonDsl.g:269:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_values_0_0= ruleAndExpression ) ) (otherlv_1= 'OR' ( (lv_values_2_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:275:2: ( ( ( (lv_values_0_0= ruleAndExpression ) ) (otherlv_1= 'OR' ( (lv_values_2_0= ruleAndExpression ) ) )* ) )
            // InternalJsonDsl.g:276:2: ( ( (lv_values_0_0= ruleAndExpression ) ) (otherlv_1= 'OR' ( (lv_values_2_0= ruleAndExpression ) ) )* )
            {
            // InternalJsonDsl.g:276:2: ( ( (lv_values_0_0= ruleAndExpression ) ) (otherlv_1= 'OR' ( (lv_values_2_0= ruleAndExpression ) ) )* )
            // InternalJsonDsl.g:277:3: ( (lv_values_0_0= ruleAndExpression ) ) (otherlv_1= 'OR' ( (lv_values_2_0= ruleAndExpression ) ) )*
            {
            // InternalJsonDsl.g:277:3: ( (lv_values_0_0= ruleAndExpression ) )
            // InternalJsonDsl.g:278:4: (lv_values_0_0= ruleAndExpression )
            {
            // InternalJsonDsl.g:278:4: (lv_values_0_0= ruleAndExpression )
            // InternalJsonDsl.g:279:5: lv_values_0_0= ruleAndExpression
            {

            					newCompositeNode(grammarAccess.getOrExpressionAccess().getValuesAndExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_values_0_0=ruleAndExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_0_0,
            						"org.xtext.example.mydsl.JsonDsl.AndExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:296:3: (otherlv_1= 'OR' ( (lv_values_2_0= ruleAndExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJsonDsl.g:297:4: otherlv_1= 'OR' ( (lv_values_2_0= ruleAndExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrExpressionAccess().getORKeyword_1_0());
            	    			
            	    // InternalJsonDsl.g:301:4: ( (lv_values_2_0= ruleAndExpression ) )
            	    // InternalJsonDsl.g:302:5: (lv_values_2_0= ruleAndExpression )
            	    {
            	    // InternalJsonDsl.g:302:5: (lv_values_2_0= ruleAndExpression )
            	    // InternalJsonDsl.g:303:6: lv_values_2_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getValuesAndExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_values_2_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_2_0,
            	    							"org.xtext.example.mydsl.JsonDsl.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalJsonDsl.g:325:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalJsonDsl.g:325:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalJsonDsl.g:326:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalJsonDsl.g:332:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_values_0_0= ruleEqExpression ) ) (otherlv_1= 'AND' ( (lv_values_2_0= ruleEqExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:338:2: ( ( ( (lv_values_0_0= ruleEqExpression ) ) (otherlv_1= 'AND' ( (lv_values_2_0= ruleEqExpression ) ) )* ) )
            // InternalJsonDsl.g:339:2: ( ( (lv_values_0_0= ruleEqExpression ) ) (otherlv_1= 'AND' ( (lv_values_2_0= ruleEqExpression ) ) )* )
            {
            // InternalJsonDsl.g:339:2: ( ( (lv_values_0_0= ruleEqExpression ) ) (otherlv_1= 'AND' ( (lv_values_2_0= ruleEqExpression ) ) )* )
            // InternalJsonDsl.g:340:3: ( (lv_values_0_0= ruleEqExpression ) ) (otherlv_1= 'AND' ( (lv_values_2_0= ruleEqExpression ) ) )*
            {
            // InternalJsonDsl.g:340:3: ( (lv_values_0_0= ruleEqExpression ) )
            // InternalJsonDsl.g:341:4: (lv_values_0_0= ruleEqExpression )
            {
            // InternalJsonDsl.g:341:4: (lv_values_0_0= ruleEqExpression )
            // InternalJsonDsl.g:342:5: lv_values_0_0= ruleEqExpression
            {

            					newCompositeNode(grammarAccess.getAndExpressionAccess().getValuesEqExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_values_0_0=ruleEqExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_0_0,
            						"org.xtext.example.mydsl.JsonDsl.EqExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:359:3: (otherlv_1= 'AND' ( (lv_values_2_0= ruleEqExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJsonDsl.g:360:4: otherlv_1= 'AND' ( (lv_values_2_0= ruleEqExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndExpressionAccess().getANDKeyword_1_0());
            	    			
            	    // InternalJsonDsl.g:364:4: ( (lv_values_2_0= ruleEqExpression ) )
            	    // InternalJsonDsl.g:365:5: (lv_values_2_0= ruleEqExpression )
            	    {
            	    // InternalJsonDsl.g:365:5: (lv_values_2_0= ruleEqExpression )
            	    // InternalJsonDsl.g:366:6: lv_values_2_0= ruleEqExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getValuesEqExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_values_2_0=ruleEqExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_2_0,
            	    							"org.xtext.example.mydsl.JsonDsl.EqExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqExpression"
    // InternalJsonDsl.g:388:1: entryRuleEqExpression returns [EObject current=null] : iv_ruleEqExpression= ruleEqExpression EOF ;
    public final EObject entryRuleEqExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqExpression = null;


        try {
            // InternalJsonDsl.g:388:53: (iv_ruleEqExpression= ruleEqExpression EOF )
            // InternalJsonDsl.g:389:2: iv_ruleEqExpression= ruleEqExpression EOF
            {
             newCompositeNode(grammarAccess.getEqExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqExpression=ruleEqExpression();

            state._fsp--;

             current =iv_ruleEqExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqExpression"


    // $ANTLR start "ruleEqExpression"
    // InternalJsonDsl.g:395:1: ruleEqExpression returns [EObject current=null] : ( ( (lv_values_0_0= ruleCompExpression ) ) ( (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_values_3_0= ruleCompExpression ) ) )* ) ;
    public final EObject ruleEqExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:401:2: ( ( ( (lv_values_0_0= ruleCompExpression ) ) ( (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_values_3_0= ruleCompExpression ) ) )* ) )
            // InternalJsonDsl.g:402:2: ( ( (lv_values_0_0= ruleCompExpression ) ) ( (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_values_3_0= ruleCompExpression ) ) )* )
            {
            // InternalJsonDsl.g:402:2: ( ( (lv_values_0_0= ruleCompExpression ) ) ( (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_values_3_0= ruleCompExpression ) ) )* )
            // InternalJsonDsl.g:403:3: ( (lv_values_0_0= ruleCompExpression ) ) ( (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_values_3_0= ruleCompExpression ) ) )*
            {
            // InternalJsonDsl.g:403:3: ( (lv_values_0_0= ruleCompExpression ) )
            // InternalJsonDsl.g:404:4: (lv_values_0_0= ruleCompExpression )
            {
            // InternalJsonDsl.g:404:4: (lv_values_0_0= ruleCompExpression )
            // InternalJsonDsl.g:405:5: lv_values_0_0= ruleCompExpression
            {

            					newCompositeNode(grammarAccess.getEqExpressionAccess().getValuesCompExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_values_0_0=ruleCompExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqExpressionRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_0_0,
            						"org.xtext.example.mydsl.JsonDsl.CompExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:422:3: ( (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_values_3_0= ruleCompExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }
                else if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJsonDsl.g:423:4: (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_values_3_0= ruleCompExpression ) )
            	    {
            	    // InternalJsonDsl.g:423:4: (otherlv_1= '==' | otherlv_2= '!=' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==20) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==21) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalJsonDsl.g:424:5: otherlv_1= '=='
            	            {
            	            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            	            					newLeafNode(otherlv_1, grammarAccess.getEqExpressionAccess().getEqualsSignEqualsSignKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalJsonDsl.g:429:5: otherlv_2= '!='
            	            {
            	            otherlv_2=(Token)match(input,21,FOLLOW_6); 

            	            					newLeafNode(otherlv_2, grammarAccess.getEqExpressionAccess().getExclamationMarkEqualsSignKeyword_1_0_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalJsonDsl.g:434:4: ( (lv_values_3_0= ruleCompExpression ) )
            	    // InternalJsonDsl.g:435:5: (lv_values_3_0= ruleCompExpression )
            	    {
            	    // InternalJsonDsl.g:435:5: (lv_values_3_0= ruleCompExpression )
            	    // InternalJsonDsl.g:436:6: lv_values_3_0= ruleCompExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqExpressionAccess().getValuesCompExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_values_3_0=ruleCompExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.xtext.example.mydsl.JsonDsl.CompExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqExpression"


    // $ANTLR start "entryRuleCompExpression"
    // InternalJsonDsl.g:458:1: entryRuleCompExpression returns [EObject current=null] : iv_ruleCompExpression= ruleCompExpression EOF ;
    public final EObject entryRuleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompExpression = null;


        try {
            // InternalJsonDsl.g:458:55: (iv_ruleCompExpression= ruleCompExpression EOF )
            // InternalJsonDsl.g:459:2: iv_ruleCompExpression= ruleCompExpression EOF
            {
             newCompositeNode(grammarAccess.getCompExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompExpression=ruleCompExpression();

            state._fsp--;

             current =iv_ruleCompExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompExpression"


    // $ANTLR start "ruleCompExpression"
    // InternalJsonDsl.g:465:1: ruleCompExpression returns [EObject current=null] : ( ( (lv_values_0_0= ruleAddExpression ) ) ( (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '<' | otherlv_4= '<=' ) ( (lv_values_5_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleCompExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_5_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:471:2: ( ( ( (lv_values_0_0= ruleAddExpression ) ) ( (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '<' | otherlv_4= '<=' ) ( (lv_values_5_0= ruleAddExpression ) ) )* ) )
            // InternalJsonDsl.g:472:2: ( ( (lv_values_0_0= ruleAddExpression ) ) ( (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '<' | otherlv_4= '<=' ) ( (lv_values_5_0= ruleAddExpression ) ) )* )
            {
            // InternalJsonDsl.g:472:2: ( ( (lv_values_0_0= ruleAddExpression ) ) ( (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '<' | otherlv_4= '<=' ) ( (lv_values_5_0= ruleAddExpression ) ) )* )
            // InternalJsonDsl.g:473:3: ( (lv_values_0_0= ruleAddExpression ) ) ( (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '<' | otherlv_4= '<=' ) ( (lv_values_5_0= ruleAddExpression ) ) )*
            {
            // InternalJsonDsl.g:473:3: ( (lv_values_0_0= ruleAddExpression ) )
            // InternalJsonDsl.g:474:4: (lv_values_0_0= ruleAddExpression )
            {
            // InternalJsonDsl.g:474:4: (lv_values_0_0= ruleAddExpression )
            // InternalJsonDsl.g:475:5: lv_values_0_0= ruleAddExpression
            {

            					newCompositeNode(grammarAccess.getCompExpressionAccess().getValuesAddExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_values_0_0=ruleAddExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_0_0,
            						"org.xtext.example.mydsl.JsonDsl.AddExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:492:3: ( (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '<' | otherlv_4= '<=' ) ( (lv_values_5_0= ruleAddExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    alt8=1;
                    }
                    break;
                case 23:
                    {
                    alt8=1;
                    }
                    break;
                case 24:
                    {
                    alt8=1;
                    }
                    break;
                case 25:
                    {
                    alt8=1;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalJsonDsl.g:493:4: (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '<' | otherlv_4= '<=' ) ( (lv_values_5_0= ruleAddExpression ) )
            	    {
            	    // InternalJsonDsl.g:493:4: (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '<' | otherlv_4= '<=' )
            	    int alt7=4;
            	    switch ( input.LA(1) ) {
            	    case 22:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt7=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt7) {
            	        case 1 :
            	            // InternalJsonDsl.g:494:5: otherlv_1= '>'
            	            {
            	            otherlv_1=(Token)match(input,22,FOLLOW_6); 

            	            					newLeafNode(otherlv_1, grammarAccess.getCompExpressionAccess().getGreaterThanSignKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalJsonDsl.g:499:5: otherlv_2= '>='
            	            {
            	            otherlv_2=(Token)match(input,23,FOLLOW_6); 

            	            					newLeafNode(otherlv_2, grammarAccess.getCompExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalJsonDsl.g:504:5: otherlv_3= '<'
            	            {
            	            otherlv_3=(Token)match(input,24,FOLLOW_6); 

            	            					newLeafNode(otherlv_3, grammarAccess.getCompExpressionAccess().getLessThanSignKeyword_1_0_2());
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalJsonDsl.g:509:5: otherlv_4= '<='
            	            {
            	            otherlv_4=(Token)match(input,25,FOLLOW_6); 

            	            					newLeafNode(otherlv_4, grammarAccess.getCompExpressionAccess().getLessThanSignEqualsSignKeyword_1_0_3());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalJsonDsl.g:514:4: ( (lv_values_5_0= ruleAddExpression ) )
            	    // InternalJsonDsl.g:515:5: (lv_values_5_0= ruleAddExpression )
            	    {
            	    // InternalJsonDsl.g:515:5: (lv_values_5_0= ruleAddExpression )
            	    // InternalJsonDsl.g:516:6: lv_values_5_0= ruleAddExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getValuesAddExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_values_5_0=ruleAddExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_5_0,
            	    							"org.xtext.example.mydsl.JsonDsl.AddExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalJsonDsl.g:538:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalJsonDsl.g:538:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalJsonDsl.g:539:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
             newCompositeNode(grammarAccess.getAddExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;

             current =iv_ruleAddExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalJsonDsl.g:545:1: ruleAddExpression returns [EObject current=null] : ( ( (lv_values_0_0= ruleMultExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_values_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:551:2: ( ( ( (lv_values_0_0= ruleMultExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_values_3_0= ruleMultExpression ) ) )* ) )
            // InternalJsonDsl.g:552:2: ( ( (lv_values_0_0= ruleMultExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_values_3_0= ruleMultExpression ) ) )* )
            {
            // InternalJsonDsl.g:552:2: ( ( (lv_values_0_0= ruleMultExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_values_3_0= ruleMultExpression ) ) )* )
            // InternalJsonDsl.g:553:3: ( (lv_values_0_0= ruleMultExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_values_3_0= ruleMultExpression ) ) )*
            {
            // InternalJsonDsl.g:553:3: ( (lv_values_0_0= ruleMultExpression ) )
            // InternalJsonDsl.g:554:4: (lv_values_0_0= ruleMultExpression )
            {
            // InternalJsonDsl.g:554:4: (lv_values_0_0= ruleMultExpression )
            // InternalJsonDsl.g:555:5: lv_values_0_0= ruleMultExpression
            {

            					newCompositeNode(grammarAccess.getAddExpressionAccess().getValuesMultExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_values_0_0=ruleMultExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_0_0,
            						"org.xtext.example.mydsl.JsonDsl.MultExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:572:3: ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_values_3_0= ruleMultExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }
                else if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJsonDsl.g:573:4: (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_values_3_0= ruleMultExpression ) )
            	    {
            	    // InternalJsonDsl.g:573:4: (otherlv_1= '+' | otherlv_2= '-' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==26) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==27) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalJsonDsl.g:574:5: otherlv_1= '+'
            	            {
            	            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            	            					newLeafNode(otherlv_1, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalJsonDsl.g:579:5: otherlv_2= '-'
            	            {
            	            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            	            					newLeafNode(otherlv_2, grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalJsonDsl.g:584:4: ( (lv_values_3_0= ruleMultExpression ) )
            	    // InternalJsonDsl.g:585:5: (lv_values_3_0= ruleMultExpression )
            	    {
            	    // InternalJsonDsl.g:585:5: (lv_values_3_0= ruleMultExpression )
            	    // InternalJsonDsl.g:586:6: lv_values_3_0= ruleMultExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAddExpressionAccess().getValuesMultExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_values_3_0=ruleMultExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.xtext.example.mydsl.JsonDsl.MultExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalJsonDsl.g:608:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalJsonDsl.g:608:55: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalJsonDsl.g:609:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
             newCompositeNode(grammarAccess.getMultExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;

             current =iv_ruleMultExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // InternalJsonDsl.g:615:1: ruleMultExpression returns [EObject current=null] : ( ( (lv_values_0_0= ruleUnaryMinusExpression ) ) ( (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_values_4_0= ruleUnaryMinusExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:621:2: ( ( ( (lv_values_0_0= ruleUnaryMinusExpression ) ) ( (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_values_4_0= ruleUnaryMinusExpression ) ) )* ) )
            // InternalJsonDsl.g:622:2: ( ( (lv_values_0_0= ruleUnaryMinusExpression ) ) ( (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_values_4_0= ruleUnaryMinusExpression ) ) )* )
            {
            // InternalJsonDsl.g:622:2: ( ( (lv_values_0_0= ruleUnaryMinusExpression ) ) ( (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_values_4_0= ruleUnaryMinusExpression ) ) )* )
            // InternalJsonDsl.g:623:3: ( (lv_values_0_0= ruleUnaryMinusExpression ) ) ( (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_values_4_0= ruleUnaryMinusExpression ) ) )*
            {
            // InternalJsonDsl.g:623:3: ( (lv_values_0_0= ruleUnaryMinusExpression ) )
            // InternalJsonDsl.g:624:4: (lv_values_0_0= ruleUnaryMinusExpression )
            {
            // InternalJsonDsl.g:624:4: (lv_values_0_0= ruleUnaryMinusExpression )
            // InternalJsonDsl.g:625:5: lv_values_0_0= ruleUnaryMinusExpression
            {

            					newCompositeNode(grammarAccess.getMultExpressionAccess().getValuesUnaryMinusExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_values_0_0=ruleUnaryMinusExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultExpressionRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_0_0,
            						"org.xtext.example.mydsl.JsonDsl.UnaryMinusExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:642:3: ( (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_values_4_0= ruleUnaryMinusExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    alt12=1;
                    }
                    break;
                case 29:
                    {
                    alt12=1;
                    }
                    break;
                case 30:
                    {
                    alt12=1;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // InternalJsonDsl.g:643:4: (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_values_4_0= ruleUnaryMinusExpression ) )
            	    {
            	    // InternalJsonDsl.g:643:4: (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' )
            	    int alt11=3;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalJsonDsl.g:644:5: otherlv_1= '*'
            	            {
            	            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            	            					newLeafNode(otherlv_1, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalJsonDsl.g:649:5: otherlv_2= '/'
            	            {
            	            otherlv_2=(Token)match(input,29,FOLLOW_6); 

            	            					newLeafNode(otherlv_2, grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalJsonDsl.g:654:5: otherlv_3= '%'
            	            {
            	            otherlv_3=(Token)match(input,30,FOLLOW_6); 

            	            					newLeafNode(otherlv_3, grammarAccess.getMultExpressionAccess().getPercentSignKeyword_1_0_2());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalJsonDsl.g:659:4: ( (lv_values_4_0= ruleUnaryMinusExpression ) )
            	    // InternalJsonDsl.g:660:5: (lv_values_4_0= ruleUnaryMinusExpression )
            	    {
            	    // InternalJsonDsl.g:660:5: (lv_values_4_0= ruleUnaryMinusExpression )
            	    // InternalJsonDsl.g:661:6: lv_values_4_0= ruleUnaryMinusExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultExpressionAccess().getValuesUnaryMinusExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_values_4_0=ruleUnaryMinusExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_4_0,
            	    							"org.xtext.example.mydsl.JsonDsl.UnaryMinusExpression");
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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleUnaryMinusExpression"
    // InternalJsonDsl.g:683:1: entryRuleUnaryMinusExpression returns [EObject current=null] : iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF ;
    public final EObject entryRuleUnaryMinusExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryMinusExpression = null;


        try {
            // InternalJsonDsl.g:683:61: (iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF )
            // InternalJsonDsl.g:684:2: iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryMinusExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryMinusExpression=ruleUnaryMinusExpression();

            state._fsp--;

             current =iv_ruleUnaryMinusExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:690:1: ruleUnaryMinusExpression returns [EObject current=null] : ( (otherlv_0= '-' ( (lv_value_1_0= ruleUnaryMinusExpression ) ) ) | ( (lv_value_2_0= ruleNegationExpression ) ) ) ;
    public final EObject ruleUnaryMinusExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:696:2: ( ( (otherlv_0= '-' ( (lv_value_1_0= ruleUnaryMinusExpression ) ) ) | ( (lv_value_2_0= ruleNegationExpression ) ) ) )
            // InternalJsonDsl.g:697:2: ( (otherlv_0= '-' ( (lv_value_1_0= ruleUnaryMinusExpression ) ) ) | ( (lv_value_2_0= ruleNegationExpression ) ) )
            {
            // InternalJsonDsl.g:697:2: ( (otherlv_0= '-' ( (lv_value_1_0= ruleUnaryMinusExpression ) ) ) | ( (lv_value_2_0= ruleNegationExpression ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_FIELD_NAME && LA13_0<=RULE_NULL)||(LA13_0>=31 && LA13_0<=32)||LA13_0==34||LA13_0==36||(LA13_0>=39 && LA13_0<=40)||LA13_0==42||(LA13_0>=44 && LA13_0<=47)||LA13_0==50||(LA13_0>=52 && LA13_0<=54)||(LA13_0>=56 && LA13_0<=58)||(LA13_0>=60 && LA13_0<=62)||LA13_0==64) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalJsonDsl.g:698:3: (otherlv_0= '-' ( (lv_value_1_0= ruleUnaryMinusExpression ) ) )
                    {
                    // InternalJsonDsl.g:698:3: (otherlv_0= '-' ( (lv_value_1_0= ruleUnaryMinusExpression ) ) )
                    // InternalJsonDsl.g:699:4: otherlv_0= '-' ( (lv_value_1_0= ruleUnaryMinusExpression ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getUnaryMinusExpressionAccess().getHyphenMinusKeyword_0_0());
                    			
                    // InternalJsonDsl.g:703:4: ( (lv_value_1_0= ruleUnaryMinusExpression ) )
                    // InternalJsonDsl.g:704:5: (lv_value_1_0= ruleUnaryMinusExpression )
                    {
                    // InternalJsonDsl.g:704:5: (lv_value_1_0= ruleUnaryMinusExpression )
                    // InternalJsonDsl.g:705:6: lv_value_1_0= ruleUnaryMinusExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryMinusExpressionAccess().getValueUnaryMinusExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleUnaryMinusExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryMinusExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.xtext.example.mydsl.JsonDsl.UnaryMinusExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:724:3: ( (lv_value_2_0= ruleNegationExpression ) )
                    {
                    // InternalJsonDsl.g:724:3: ( (lv_value_2_0= ruleNegationExpression ) )
                    // InternalJsonDsl.g:725:4: (lv_value_2_0= ruleNegationExpression )
                    {
                    // InternalJsonDsl.g:725:4: (lv_value_2_0= ruleNegationExpression )
                    // InternalJsonDsl.g:726:5: lv_value_2_0= ruleNegationExpression
                    {

                    					newCompositeNode(grammarAccess.getUnaryMinusExpressionAccess().getValueNegationExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleNegationExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnaryMinusExpressionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.JsonDsl.NegationExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleNegationExpression"
    // InternalJsonDsl.g:747:1: entryRuleNegationExpression returns [EObject current=null] : iv_ruleNegationExpression= ruleNegationExpression EOF ;
    public final EObject entryRuleNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationExpression = null;


        try {
            // InternalJsonDsl.g:747:59: (iv_ruleNegationExpression= ruleNegationExpression EOF )
            // InternalJsonDsl.g:748:2: iv_ruleNegationExpression= ruleNegationExpression EOF
            {
             newCompositeNode(grammarAccess.getNegationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegationExpression=ruleNegationExpression();

            state._fsp--;

             current =iv_ruleNegationExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegationExpression"


    // $ANTLR start "ruleNegationExpression"
    // InternalJsonDsl.g:754:1: ruleNegationExpression returns [EObject current=null] : ( (otherlv_0= '!' ( (lv_value_1_0= ruleNegationExpression ) ) ) | ( (lv_value_2_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleNegationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:760:2: ( ( (otherlv_0= '!' ( (lv_value_1_0= ruleNegationExpression ) ) ) | ( (lv_value_2_0= rulePrimaryExpression ) ) ) )
            // InternalJsonDsl.g:761:2: ( (otherlv_0= '!' ( (lv_value_1_0= ruleNegationExpression ) ) ) | ( (lv_value_2_0= rulePrimaryExpression ) ) )
            {
            // InternalJsonDsl.g:761:2: ( (otherlv_0= '!' ( (lv_value_1_0= ruleNegationExpression ) ) ) | ( (lv_value_2_0= rulePrimaryExpression ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_FIELD_NAME && LA14_0<=RULE_NULL)||LA14_0==32||LA14_0==34||LA14_0==36||(LA14_0>=39 && LA14_0<=40)||LA14_0==42||(LA14_0>=44 && LA14_0<=47)||LA14_0==50||(LA14_0>=52 && LA14_0<=54)||(LA14_0>=56 && LA14_0<=58)||(LA14_0>=60 && LA14_0<=62)||LA14_0==64) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalJsonDsl.g:762:3: (otherlv_0= '!' ( (lv_value_1_0= ruleNegationExpression ) ) )
                    {
                    // InternalJsonDsl.g:762:3: (otherlv_0= '!' ( (lv_value_1_0= ruleNegationExpression ) ) )
                    // InternalJsonDsl.g:763:4: otherlv_0= '!' ( (lv_value_1_0= ruleNegationExpression ) )
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getNegationExpressionAccess().getExclamationMarkKeyword_0_0());
                    			
                    // InternalJsonDsl.g:767:4: ( (lv_value_1_0= ruleNegationExpression ) )
                    // InternalJsonDsl.g:768:5: (lv_value_1_0= ruleNegationExpression )
                    {
                    // InternalJsonDsl.g:768:5: (lv_value_1_0= ruleNegationExpression )
                    // InternalJsonDsl.g:769:6: lv_value_1_0= ruleNegationExpression
                    {

                    						newCompositeNode(grammarAccess.getNegationExpressionAccess().getValueNegationExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleNegationExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNegationExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.xtext.example.mydsl.JsonDsl.NegationExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:788:3: ( (lv_value_2_0= rulePrimaryExpression ) )
                    {
                    // InternalJsonDsl.g:788:3: ( (lv_value_2_0= rulePrimaryExpression ) )
                    // InternalJsonDsl.g:789:4: (lv_value_2_0= rulePrimaryExpression )
                    {
                    // InternalJsonDsl.g:789:4: (lv_value_2_0= rulePrimaryExpression )
                    // InternalJsonDsl.g:790:5: lv_value_2_0= rulePrimaryExpression
                    {

                    					newCompositeNode(grammarAccess.getNegationExpressionAccess().getValuePrimaryExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=rulePrimaryExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNegationExpressionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.JsonDsl.PrimaryExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegationExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalJsonDsl.g:811:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalJsonDsl.g:811:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalJsonDsl.g:812:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:818:1: rulePrimaryExpression returns [EObject current=null] : (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_FieldInvoquer_6= ruleFieldInvoquer | ( () rulePointer ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_VariableCall_0 = null;

        EObject this_Constant_1 = null;

        EObject this_FunctionCall_2 = null;

        EObject this_Expression_4 = null;

        EObject this_FieldInvoquer_6 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:824:2: ( (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_FieldInvoquer_6= ruleFieldInvoquer | ( () rulePointer ) ) )
            // InternalJsonDsl.g:825:2: (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_FieldInvoquer_6= ruleFieldInvoquer | ( () rulePointer ) )
            {
            // InternalJsonDsl.g:825:2: (this_VariableCall_0= ruleVariableCall | this_Constant_1= ruleConstant | this_FunctionCall_2= ruleFunctionCall | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_FieldInvoquer_6= ruleFieldInvoquer | ( () rulePointer ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt15=1;
                }
                break;
            case RULE_NUMBER:
            case RULE_STRING:
            case RULE_BOOL:
            case RULE_NULL:
            case 36:
            case 64:
                {
                alt15=2;
                }
                break;
            case 39:
            case 40:
            case 42:
            case 44:
            case 45:
            case 46:
            case 47:
            case 50:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            case RULE_FIELD_NAME:
                {
                alt15=5;
                }
                break;
            case 34:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalJsonDsl.g:826:3: this_VariableCall_0= ruleVariableCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableCall_0=ruleVariableCall();

                    state._fsp--;


                    			current = this_VariableCall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:835:3: this_Constant_1= ruleConstant
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constant_1=ruleConstant();

                    state._fsp--;


                    			current = this_Constant_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:844:3: this_FunctionCall_2= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_2=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJsonDsl.g:853:3: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // InternalJsonDsl.g:853:3: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // InternalJsonDsl.g:854:4: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_13);
                    this_Expression_4=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonDsl.g:872:3: this_FieldInvoquer_6= ruleFieldInvoquer
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFieldInvoquerParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldInvoquer_6=ruleFieldInvoquer();

                    state._fsp--;


                    			current = this_FieldInvoquer_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJsonDsl.g:881:3: ( () rulePointer )
                    {
                    // InternalJsonDsl.g:881:3: ( () rulePointer )
                    // InternalJsonDsl.g:882:4: () rulePointer
                    {
                    // InternalJsonDsl.g:882:4: ()
                    // InternalJsonDsl.g:883:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getPrimaryExpressionAction_5_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPointerParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_2);
                    rulePointer();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleFieldInvoquer"
    // InternalJsonDsl.g:901:1: entryRuleFieldInvoquer returns [EObject current=null] : iv_ruleFieldInvoquer= ruleFieldInvoquer EOF ;
    public final EObject entryRuleFieldInvoquer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInvoquer = null;


        try {
            // InternalJsonDsl.g:901:54: (iv_ruleFieldInvoquer= ruleFieldInvoquer EOF )
            // InternalJsonDsl.g:902:2: iv_ruleFieldInvoquer= ruleFieldInvoquer EOF
            {
             newCompositeNode(grammarAccess.getFieldInvoquerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldInvoquer=ruleFieldInvoquer();

            state._fsp--;

             current =iv_ruleFieldInvoquer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldInvoquer"


    // $ANTLR start "ruleFieldInvoquer"
    // InternalJsonDsl.g:908:1: ruleFieldInvoquer returns [EObject current=null] : ( (lv_field_0_0= RULE_FIELD_NAME ) ) ;
    public final EObject ruleFieldInvoquer() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:914:2: ( ( (lv_field_0_0= RULE_FIELD_NAME ) ) )
            // InternalJsonDsl.g:915:2: ( (lv_field_0_0= RULE_FIELD_NAME ) )
            {
            // InternalJsonDsl.g:915:2: ( (lv_field_0_0= RULE_FIELD_NAME ) )
            // InternalJsonDsl.g:916:3: (lv_field_0_0= RULE_FIELD_NAME )
            {
            // InternalJsonDsl.g:916:3: (lv_field_0_0= RULE_FIELD_NAME )
            // InternalJsonDsl.g:917:4: lv_field_0_0= RULE_FIELD_NAME
            {
            lv_field_0_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_2); 

            				newLeafNode(lv_field_0_0, grammarAccess.getFieldInvoquerAccess().getFieldFIELD_NAMETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFieldInvoquerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"field",
            					lv_field_0_0,
            					"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldInvoquer"


    // $ANTLR start "entryRulePointer"
    // InternalJsonDsl.g:936:1: entryRulePointer returns [String current=null] : iv_rulePointer= rulePointer EOF ;
    public final String entryRulePointer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePointer = null;


        try {
            // InternalJsonDsl.g:936:47: (iv_rulePointer= rulePointer EOF )
            // InternalJsonDsl.g:937:2: iv_rulePointer= rulePointer EOF
            {
             newCompositeNode(grammarAccess.getPointerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePointer=rulePointer();

            state._fsp--;

             current =iv_rulePointer.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:943:1: rulePointer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '?' ;
    public final AntlrDatatypeRuleToken rulePointer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:949:2: (kw= '?' )
            // InternalJsonDsl.g:950:2: kw= '?'
            {
            kw=(Token)match(input,34,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPointerAccess().getQuestionMarkKeyword());
            	

            }


            	leaveRule();

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
    // InternalJsonDsl.g:958:1: entryRuleVariableCall returns [EObject current=null] : iv_ruleVariableCall= ruleVariableCall EOF ;
    public final EObject entryRuleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCall = null;


        try {
            // InternalJsonDsl.g:958:53: (iv_ruleVariableCall= ruleVariableCall EOF )
            // InternalJsonDsl.g:959:2: iv_ruleVariableCall= ruleVariableCall EOF
            {
             newCompositeNode(grammarAccess.getVariableCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableCall=ruleVariableCall();

            state._fsp--;

             current =iv_ruleVariableCall; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:965:1: ruleVariableCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_caller_1_0= ruleAuxiliarCaller ) )* ) ;
    public final EObject ruleVariableCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_caller_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:971:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_caller_1_0= ruleAuxiliarCaller ) )* ) )
            // InternalJsonDsl.g:972:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_caller_1_0= ruleAuxiliarCaller ) )* )
            {
            // InternalJsonDsl.g:972:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_caller_1_0= ruleAuxiliarCaller ) )* )
            // InternalJsonDsl.g:973:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_caller_1_0= ruleAuxiliarCaller ) )*
            {
            // InternalJsonDsl.g:973:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJsonDsl.g:974:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJsonDsl.g:974:4: (lv_name_0_0= RULE_ID )
            // InternalJsonDsl.g:975:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableCallAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            // InternalJsonDsl.g:991:3: ( (lv_caller_1_0= ruleAuxiliarCaller ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=35 && LA16_0<=36)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalJsonDsl.g:992:4: (lv_caller_1_0= ruleAuxiliarCaller )
            	    {
            	    // InternalJsonDsl.g:992:4: (lv_caller_1_0= ruleAuxiliarCaller )
            	    // InternalJsonDsl.g:993:5: lv_caller_1_0= ruleAuxiliarCaller
            	    {

            	    					newCompositeNode(grammarAccess.getVariableCallAccess().getCallerAuxiliarCallerParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_caller_1_0=ruleAuxiliarCaller();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:1014:1: entryRuleAuxiliarCaller returns [EObject current=null] : iv_ruleAuxiliarCaller= ruleAuxiliarCaller EOF ;
    public final EObject entryRuleAuxiliarCaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuxiliarCaller = null;


        try {
            // InternalJsonDsl.g:1014:55: (iv_ruleAuxiliarCaller= ruleAuxiliarCaller EOF )
            // InternalJsonDsl.g:1015:2: iv_ruleAuxiliarCaller= ruleAuxiliarCaller EOF
            {
             newCompositeNode(grammarAccess.getAuxiliarCallerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuxiliarCaller=ruleAuxiliarCaller();

            state._fsp--;

             current =iv_ruleAuxiliarCaller; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1021:1: ruleAuxiliarCaller returns [EObject current=null] : (this_FieldCaller_0= ruleFieldCaller | this_ArrayCaller_1= ruleArrayCaller ) ;
    public final EObject ruleAuxiliarCaller() throws RecognitionException {
        EObject current = null;

        EObject this_FieldCaller_0 = null;

        EObject this_ArrayCaller_1 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1027:2: ( (this_FieldCaller_0= ruleFieldCaller | this_ArrayCaller_1= ruleArrayCaller ) )
            // InternalJsonDsl.g:1028:2: (this_FieldCaller_0= ruleFieldCaller | this_ArrayCaller_1= ruleArrayCaller )
            {
            // InternalJsonDsl.g:1028:2: (this_FieldCaller_0= ruleFieldCaller | this_ArrayCaller_1= ruleArrayCaller )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalJsonDsl.g:1029:3: this_FieldCaller_0= ruleFieldCaller
                    {

                    			newCompositeNode(grammarAccess.getAuxiliarCallerAccess().getFieldCallerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldCaller_0=ruleFieldCaller();

                    state._fsp--;


                    			current = this_FieldCaller_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1038:3: this_ArrayCaller_1= ruleArrayCaller
                    {

                    			newCompositeNode(grammarAccess.getAuxiliarCallerAccess().getArrayCallerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayCaller_1=ruleArrayCaller();

                    state._fsp--;


                    			current = this_ArrayCaller_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:1050:1: entryRuleFieldCaller returns [EObject current=null] : iv_ruleFieldCaller= ruleFieldCaller EOF ;
    public final EObject entryRuleFieldCaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldCaller = null;


        try {
            // InternalJsonDsl.g:1050:52: (iv_ruleFieldCaller= ruleFieldCaller EOF )
            // InternalJsonDsl.g:1051:2: iv_ruleFieldCaller= ruleFieldCaller EOF
            {
             newCompositeNode(grammarAccess.getFieldCallerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldCaller=ruleFieldCaller();

            state._fsp--;

             current =iv_ruleFieldCaller; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1057:1: ruleFieldCaller returns [EObject current=null] : (otherlv_0= '~' ( (lv_key_1_0= RULE_FIELD_NAME ) ) ) ;
    public final EObject ruleFieldCaller() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1063:2: ( (otherlv_0= '~' ( (lv_key_1_0= RULE_FIELD_NAME ) ) ) )
            // InternalJsonDsl.g:1064:2: (otherlv_0= '~' ( (lv_key_1_0= RULE_FIELD_NAME ) ) )
            {
            // InternalJsonDsl.g:1064:2: (otherlv_0= '~' ( (lv_key_1_0= RULE_FIELD_NAME ) ) )
            // InternalJsonDsl.g:1065:3: otherlv_0= '~' ( (lv_key_1_0= RULE_FIELD_NAME ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldCallerAccess().getTildeKeyword_0());
            		
            // InternalJsonDsl.g:1069:3: ( (lv_key_1_0= RULE_FIELD_NAME ) )
            // InternalJsonDsl.g:1070:4: (lv_key_1_0= RULE_FIELD_NAME )
            {
            // InternalJsonDsl.g:1070:4: (lv_key_1_0= RULE_FIELD_NAME )
            // InternalJsonDsl.g:1071:5: lv_key_1_0= RULE_FIELD_NAME
            {
            lv_key_1_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_2); 

            					newLeafNode(lv_key_1_0, grammarAccess.getFieldCallerAccess().getKeyFIELD_NAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldCallerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:1091:1: entryRuleArrayCaller returns [EObject current=null] : iv_ruleArrayCaller= ruleArrayCaller EOF ;
    public final EObject entryRuleArrayCaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayCaller = null;


        try {
            // InternalJsonDsl.g:1091:52: (iv_ruleArrayCaller= ruleArrayCaller EOF )
            // InternalJsonDsl.g:1092:2: iv_ruleArrayCaller= ruleArrayCaller EOF
            {
             newCompositeNode(grammarAccess.getArrayCallerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayCaller=ruleArrayCaller();

            state._fsp--;

             current =iv_ruleArrayCaller; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1098:1: ruleArrayCaller returns [EObject current=null] : (otherlv_0= '[' ( (lv_index_1_0= RULE_NUMBER ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_NUMBER ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayCaller() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_index_1_0=null;
        Token otherlv_2=null;
        Token lv_index_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1104:2: ( (otherlv_0= '[' ( (lv_index_1_0= RULE_NUMBER ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_NUMBER ) ) )* otherlv_4= ']' ) )
            // InternalJsonDsl.g:1105:2: (otherlv_0= '[' ( (lv_index_1_0= RULE_NUMBER ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_NUMBER ) ) )* otherlv_4= ']' )
            {
            // InternalJsonDsl.g:1105:2: (otherlv_0= '[' ( (lv_index_1_0= RULE_NUMBER ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_NUMBER ) ) )* otherlv_4= ']' )
            // InternalJsonDsl.g:1106:3: otherlv_0= '[' ( (lv_index_1_0= RULE_NUMBER ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_NUMBER ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayCallerAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalJsonDsl.g:1110:3: ( (lv_index_1_0= RULE_NUMBER ) )
            // InternalJsonDsl.g:1111:4: (lv_index_1_0= RULE_NUMBER )
            {
            // InternalJsonDsl.g:1111:4: (lv_index_1_0= RULE_NUMBER )
            // InternalJsonDsl.g:1112:5: lv_index_1_0= RULE_NUMBER
            {
            lv_index_1_0=(Token)match(input,RULE_NUMBER,FOLLOW_17); 

            					newLeafNode(lv_index_1_0, grammarAccess.getArrayCallerAccess().getIndexNUMBERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayCallerRule());
            					}
            					addWithLastConsumed(
            						current,
            						"index",
            						lv_index_1_0,
            						"org.xtext.example.mydsl.JsonDsl.NUMBER");
            				

            }


            }

            // InternalJsonDsl.g:1128:3: (otherlv_2= ',' ( (lv_index_3_0= RULE_NUMBER ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJsonDsl.g:1129:4: otherlv_2= ',' ( (lv_index_3_0= RULE_NUMBER ) )
            	    {
            	    otherlv_2=(Token)match(input,37,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayCallerAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJsonDsl.g:1133:4: ( (lv_index_3_0= RULE_NUMBER ) )
            	    // InternalJsonDsl.g:1134:5: (lv_index_3_0= RULE_NUMBER )
            	    {
            	    // InternalJsonDsl.g:1134:5: (lv_index_3_0= RULE_NUMBER )
            	    // InternalJsonDsl.g:1135:6: lv_index_3_0= RULE_NUMBER
            	    {
            	    lv_index_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_17); 

            	    						newLeafNode(lv_index_3_0, grammarAccess.getArrayCallerAccess().getIndexNUMBERTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getArrayCallerRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"index",
            	    							lv_index_3_0,
            	    							"org.xtext.example.mydsl.JsonDsl.NUMBER");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArrayCallerAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:1160:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalJsonDsl.g:1160:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalJsonDsl.g:1161:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1167:1: ruleFunctionCall returns [EObject current=null] : (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport | this_Depth_3= ruleDepth | this_FieldInfo_4= ruleFieldInfo | this_Extract_5= ruleExtract | this_Select_6= ruleSelect | this_Concat_7= ruleConcat | this_Sum_8= ruleSum | this_Product_9= ruleProduct | this_Mean_10= ruleMean | this_Add_11= ruleAdd | this_Insert_12= ruleInsert | this_Rename_13= ruleRename | this_Remove_14= ruleRemove | this_Erase_15= ruleErase | this_Delete_16= ruleDelete ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject this_Load_0 = null;

        EObject this_Store_1 = null;

        EObject this_Export_2 = null;

        EObject this_Depth_3 = null;

        EObject this_FieldInfo_4 = null;

        EObject this_Extract_5 = null;

        EObject this_Select_6 = null;

        EObject this_Concat_7 = null;

        EObject this_Sum_8 = null;

        EObject this_Product_9 = null;

        EObject this_Mean_10 = null;

        EObject this_Add_11 = null;

        EObject this_Insert_12 = null;

        EObject this_Rename_13 = null;

        EObject this_Remove_14 = null;

        EObject this_Erase_15 = null;

        EObject this_Delete_16 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1173:2: ( (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport | this_Depth_3= ruleDepth | this_FieldInfo_4= ruleFieldInfo | this_Extract_5= ruleExtract | this_Select_6= ruleSelect | this_Concat_7= ruleConcat | this_Sum_8= ruleSum | this_Product_9= ruleProduct | this_Mean_10= ruleMean | this_Add_11= ruleAdd | this_Insert_12= ruleInsert | this_Rename_13= ruleRename | this_Remove_14= ruleRemove | this_Erase_15= ruleErase | this_Delete_16= ruleDelete ) )
            // InternalJsonDsl.g:1174:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport | this_Depth_3= ruleDepth | this_FieldInfo_4= ruleFieldInfo | this_Extract_5= ruleExtract | this_Select_6= ruleSelect | this_Concat_7= ruleConcat | this_Sum_8= ruleSum | this_Product_9= ruleProduct | this_Mean_10= ruleMean | this_Add_11= ruleAdd | this_Insert_12= ruleInsert | this_Rename_13= ruleRename | this_Remove_14= ruleRemove | this_Erase_15= ruleErase | this_Delete_16= ruleDelete )
            {
            // InternalJsonDsl.g:1174:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Export_2= ruleExport | this_Depth_3= ruleDepth | this_FieldInfo_4= ruleFieldInfo | this_Extract_5= ruleExtract | this_Select_6= ruleSelect | this_Concat_7= ruleConcat | this_Sum_8= ruleSum | this_Product_9= ruleProduct | this_Mean_10= ruleMean | this_Add_11= ruleAdd | this_Insert_12= ruleInsert | this_Rename_13= ruleRename | this_Remove_14= ruleRemove | this_Erase_15= ruleErase | this_Delete_16= ruleDelete )
            int alt19=17;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt19=1;
                }
                break;
            case 40:
                {
                alt19=2;
                }
                break;
            case 42:
                {
                alt19=3;
                }
                break;
            case 44:
                {
                alt19=4;
                }
                break;
            case 45:
                {
                alt19=5;
                }
                break;
            case 46:
                {
                alt19=6;
                }
                break;
            case 47:
                {
                alt19=7;
                }
                break;
            case 50:
                {
                alt19=8;
                }
                break;
            case 52:
                {
                alt19=9;
                }
                break;
            case 53:
                {
                alt19=10;
                }
                break;
            case 54:
                {
                alt19=11;
                }
                break;
            case 56:
                {
                alt19=12;
                }
                break;
            case 57:
                {
                alt19=13;
                }
                break;
            case 58:
                {
                alt19=14;
                }
                break;
            case 62:
                {
                alt19=15;
                }
                break;
            case 60:
                {
                alt19=16;
                }
                break;
            case 61:
                {
                alt19=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalJsonDsl.g:1175:3: this_Load_0= ruleLoad
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getLoadParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Load_0=ruleLoad();

                    state._fsp--;


                    			current = this_Load_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:1184:3: this_Store_1= ruleStore
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getStoreParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Store_1=ruleStore();

                    state._fsp--;


                    			current = this_Store_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:1193:3: this_Export_2= ruleExport
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getExportParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Export_2=ruleExport();

                    state._fsp--;


                    			current = this_Export_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJsonDsl.g:1202:3: this_Depth_3= ruleDepth
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getDepthParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Depth_3=ruleDepth();

                    state._fsp--;


                    			current = this_Depth_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJsonDsl.g:1211:3: this_FieldInfo_4= ruleFieldInfo
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getFieldInfoParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldInfo_4=ruleFieldInfo();

                    state._fsp--;


                    			current = this_FieldInfo_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJsonDsl.g:1220:3: this_Extract_5= ruleExtract
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getExtractParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Extract_5=ruleExtract();

                    state._fsp--;


                    			current = this_Extract_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalJsonDsl.g:1229:3: this_Select_6= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getSelectParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_6=ruleSelect();

                    state._fsp--;


                    			current = this_Select_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalJsonDsl.g:1238:3: this_Concat_7= ruleConcat
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getConcatParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Concat_7=ruleConcat();

                    state._fsp--;


                    			current = this_Concat_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalJsonDsl.g:1247:3: this_Sum_8= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getSumParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_8=ruleSum();

                    state._fsp--;


                    			current = this_Sum_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalJsonDsl.g:1256:3: this_Product_9= ruleProduct
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getProductParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Product_9=ruleProduct();

                    state._fsp--;


                    			current = this_Product_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalJsonDsl.g:1265:3: this_Mean_10= ruleMean
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getMeanParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mean_10=ruleMean();

                    state._fsp--;


                    			current = this_Mean_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalJsonDsl.g:1274:3: this_Add_11= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getAddParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_11=ruleAdd();

                    state._fsp--;


                    			current = this_Add_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalJsonDsl.g:1283:3: this_Insert_12= ruleInsert
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getInsertParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insert_12=ruleInsert();

                    state._fsp--;


                    			current = this_Insert_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalJsonDsl.g:1292:3: this_Rename_13= ruleRename
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getRenameParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rename_13=ruleRename();

                    state._fsp--;


                    			current = this_Rename_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalJsonDsl.g:1301:3: this_Remove_14= ruleRemove
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getRemoveParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_Remove_14=ruleRemove();

                    state._fsp--;


                    			current = this_Remove_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalJsonDsl.g:1310:3: this_Erase_15= ruleErase
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getEraseParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_Erase_15=ruleErase();

                    state._fsp--;


                    			current = this_Erase_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalJsonDsl.g:1319:3: this_Delete_16= ruleDelete
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getDeleteParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delete_16=ruleDelete();

                    state._fsp--;


                    			current = this_Delete_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleLoad"
    // InternalJsonDsl.g:1331:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalJsonDsl.g:1331:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalJsonDsl.g:1332:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1338:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fileName_1_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1344:2: ( (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) ) )
            // InternalJsonDsl.g:1345:2: (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) )
            {
            // InternalJsonDsl.g:1345:2: (otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) ) )
            // InternalJsonDsl.g:1346:3: otherlv_0= 'LOAD' ( (lv_fileName_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLOADKeyword_0());
            		
            // InternalJsonDsl.g:1350:3: ( (lv_fileName_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:1351:4: (lv_fileName_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1351:4: (lv_fileName_1_0= RULE_STRING )
            // InternalJsonDsl.g:1352:5: lv_fileName_1_0= RULE_STRING
            {
            lv_fileName_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_fileName_1_0, grammarAccess.getLoadAccess().getFileNameSTRINGTerminalRuleCall_1_0());
            				

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


            	leaveRule();

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
    // InternalJsonDsl.g:1372:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalJsonDsl.g:1372:46: (iv_ruleStore= ruleStore EOF )
            // InternalJsonDsl.g:1373:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1379:1: ruleStore returns [EObject current=null] : (otherlv_0= 'STORE' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_fileName_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_fileName_3_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1385:2: ( (otherlv_0= 'STORE' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_fileName_3_0= RULE_STRING ) ) ) )
            // InternalJsonDsl.g:1386:2: (otherlv_0= 'STORE' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_fileName_3_0= RULE_STRING ) ) )
            {
            // InternalJsonDsl.g:1386:2: (otherlv_0= 'STORE' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_fileName_3_0= RULE_STRING ) ) )
            // InternalJsonDsl.g:1387:3: otherlv_0= 'STORE' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_fileName_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getSTOREKeyword_0());
            		
            // InternalJsonDsl.g:1391:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJsonDsl.g:1392:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:1392:4: (lv_expression_1_0= ruleExpression )
            // InternalJsonDsl.g:1393:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getStoreAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getINKeyword_2());
            		
            // InternalJsonDsl.g:1414:3: ( (lv_fileName_3_0= RULE_STRING ) )
            // InternalJsonDsl.g:1415:4: (lv_fileName_3_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1415:4: (lv_fileName_3_0= RULE_STRING )
            // InternalJsonDsl.g:1416:5: lv_fileName_3_0= RULE_STRING
            {
            lv_fileName_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_fileName_3_0, grammarAccess.getStoreAccess().getFileNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fileName",
            						lv_fileName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:1436:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalJsonDsl.g:1436:47: (iv_ruleExport= ruleExport EOF )
            // InternalJsonDsl.g:1437:2: iv_ruleExport= ruleExport EOF
            {
             newCompositeNode(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExport=ruleExport();

            state._fsp--;

             current =iv_ruleExport; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1443:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT_CSV' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_fileName_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_fileName_3_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1449:2: ( (otherlv_0= 'EXPORT_CSV' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_fileName_3_0= RULE_STRING ) ) ) )
            // InternalJsonDsl.g:1450:2: (otherlv_0= 'EXPORT_CSV' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_fileName_3_0= RULE_STRING ) ) )
            {
            // InternalJsonDsl.g:1450:2: (otherlv_0= 'EXPORT_CSV' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_fileName_3_0= RULE_STRING ) ) )
            // InternalJsonDsl.g:1451:3: otherlv_0= 'EXPORT_CSV' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_fileName_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORT_CSVKeyword_0());
            		
            // InternalJsonDsl.g:1455:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJsonDsl.g:1456:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:1456:4: (lv_expression_1_0= ruleExpression )
            // InternalJsonDsl.g:1457:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExportAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExportRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getExportAccess().getINKeyword_2());
            		
            // InternalJsonDsl.g:1478:3: ( (lv_fileName_3_0= RULE_STRING ) )
            // InternalJsonDsl.g:1479:4: (lv_fileName_3_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1479:4: (lv_fileName_3_0= RULE_STRING )
            // InternalJsonDsl.g:1480:5: lv_fileName_3_0= RULE_STRING
            {
            lv_fileName_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_fileName_3_0, grammarAccess.getExportAccess().getFileNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fileName",
            						lv_fileName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:1500:1: entryRuleProcCall returns [EObject current=null] : iv_ruleProcCall= ruleProcCall EOF ;
    public final EObject entryRuleProcCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcCall = null;


        try {
            // InternalJsonDsl.g:1500:49: (iv_ruleProcCall= ruleProcCall EOF )
            // InternalJsonDsl.g:1501:2: iv_ruleProcCall= ruleProcCall EOF
            {
             newCompositeNode(grammarAccess.getProcCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcCall=ruleProcCall();

            state._fsp--;

             current =iv_ruleProcCall; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1507:1: ruleProcCall returns [EObject current=null] : (otherlv_0= 'PRINT' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleProcCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1513:2: ( (otherlv_0= 'PRINT' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalJsonDsl.g:1514:2: (otherlv_0= 'PRINT' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalJsonDsl.g:1514:2: (otherlv_0= 'PRINT' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalJsonDsl.g:1515:3: otherlv_0= 'PRINT' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProcCallAccess().getPRINTKeyword_0());
            		
            // InternalJsonDsl.g:1519:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJsonDsl.g:1520:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:1520:4: (lv_expression_1_0= ruleExpression )
            // InternalJsonDsl.g:1521:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProcCallAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcCallRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:1542:1: entryRuleDepth returns [EObject current=null] : iv_ruleDepth= ruleDepth EOF ;
    public final EObject entryRuleDepth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepth = null;


        try {
            // InternalJsonDsl.g:1542:46: (iv_ruleDepth= ruleDepth EOF )
            // InternalJsonDsl.g:1543:2: iv_ruleDepth= ruleDepth EOF
            {
             newCompositeNode(grammarAccess.getDepthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepth=ruleDepth();

            state._fsp--;

             current =iv_ruleDepth; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1549:1: ruleDepth returns [EObject current=null] : (otherlv_0= 'GET_DEPTH' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleDepth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1555:2: ( (otherlv_0= 'GET_DEPTH' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalJsonDsl.g:1556:2: (otherlv_0= 'GET_DEPTH' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalJsonDsl.g:1556:2: (otherlv_0= 'GET_DEPTH' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalJsonDsl.g:1557:3: otherlv_0= 'GET_DEPTH' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDepthAccess().getGET_DEPTHKeyword_0());
            		
            // InternalJsonDsl.g:1561:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJsonDsl.g:1562:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:1562:4: (lv_expression_1_0= ruleExpression )
            // InternalJsonDsl.g:1563:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDepthAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDepthRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:1584:1: entryRuleFieldInfo returns [EObject current=null] : iv_ruleFieldInfo= ruleFieldInfo EOF ;
    public final EObject entryRuleFieldInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInfo = null;


        try {
            // InternalJsonDsl.g:1584:50: (iv_ruleFieldInfo= ruleFieldInfo EOF )
            // InternalJsonDsl.g:1585:2: iv_ruleFieldInfo= ruleFieldInfo EOF
            {
             newCompositeNode(grammarAccess.getFieldInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldInfo=ruleFieldInfo();

            state._fsp--;

             current =iv_ruleFieldInfo; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1591:1: ruleFieldInfo returns [EObject current=null] : (otherlv_0= 'GET_INFOS' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleFieldInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1597:2: ( (otherlv_0= 'GET_INFOS' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalJsonDsl.g:1598:2: (otherlv_0= 'GET_INFOS' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalJsonDsl.g:1598:2: (otherlv_0= 'GET_INFOS' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalJsonDsl.g:1599:3: otherlv_0= 'GET_INFOS' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldInfoAccess().getGET_INFOSKeyword_0());
            		
            // InternalJsonDsl.g:1603:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJsonDsl.g:1604:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:1604:4: (lv_expression_1_0= ruleExpression )
            // InternalJsonDsl.g:1605:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFieldInfoAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldInfoRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleExtract"
    // InternalJsonDsl.g:1626:1: entryRuleExtract returns [EObject current=null] : iv_ruleExtract= ruleExtract EOF ;
    public final EObject entryRuleExtract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtract = null;


        try {
            // InternalJsonDsl.g:1626:48: (iv_ruleExtract= ruleExtract EOF )
            // InternalJsonDsl.g:1627:2: iv_ruleExtract= ruleExtract EOF
            {
             newCompositeNode(grammarAccess.getExtractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtract=ruleExtract();

            state._fsp--;

             current =iv_ruleExtract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtract"


    // $ANTLR start "ruleExtract"
    // InternalJsonDsl.g:1633:1: ruleExtract returns [EObject current=null] : (otherlv_0= 'EXTRACT' ( (lv_value_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) ) ;
    public final EObject ruleExtract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;

        EObject lv_auxiliar_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1639:2: ( (otherlv_0= 'EXTRACT' ( (lv_value_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) ) )
            // InternalJsonDsl.g:1640:2: (otherlv_0= 'EXTRACT' ( (lv_value_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) )
            {
            // InternalJsonDsl.g:1640:2: (otherlv_0= 'EXTRACT' ( (lv_value_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) )
            // InternalJsonDsl.g:1641:3: otherlv_0= 'EXTRACT' ( (lv_value_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExtractAccess().getEXTRACTKeyword_0());
            		
            // InternalJsonDsl.g:1645:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalJsonDsl.g:1646:4: (lv_value_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:1646:4: (lv_value_1_0= ruleExpression )
            // InternalJsonDsl.g:1647:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExtractAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtractRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:1664:3: ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) )
            // InternalJsonDsl.g:1665:4: (lv_auxiliar_2_0= ruleArithmeticAuxiliar )
            {
            // InternalJsonDsl.g:1665:4: (lv_auxiliar_2_0= ruleArithmeticAuxiliar )
            // InternalJsonDsl.g:1666:5: lv_auxiliar_2_0= ruleArithmeticAuxiliar
            {

            					newCompositeNode(grammarAccess.getExtractAccess().getAuxiliarArithmeticAuxiliarParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_auxiliar_2_0=ruleArithmeticAuxiliar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtractRule());
            					}
            					set(
            						current,
            						"auxiliar",
            						lv_auxiliar_2_0,
            						"org.xtext.example.mydsl.JsonDsl.ArithmeticAuxiliar");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtract"


    // $ANTLR start "entryRuleSelect"
    // InternalJsonDsl.g:1687:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalJsonDsl.g:1687:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalJsonDsl.g:1688:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1694:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_fields_1_0= RULE_FIELD_NAME ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) )* otherlv_4= 'FROM' ( (lv_from_5_0= ruleExpression ) ) (otherlv_6= 'WHERE' ( (lv_condition_7_0= ruleExpression ) ) )? ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fields_1_0=null;
        Token otherlv_2=null;
        Token lv_fields_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_from_5_0 = null;

        EObject lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1700:2: ( (otherlv_0= 'SELECT' ( (lv_fields_1_0= RULE_FIELD_NAME ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) )* otherlv_4= 'FROM' ( (lv_from_5_0= ruleExpression ) ) (otherlv_6= 'WHERE' ( (lv_condition_7_0= ruleExpression ) ) )? ) )
            // InternalJsonDsl.g:1701:2: (otherlv_0= 'SELECT' ( (lv_fields_1_0= RULE_FIELD_NAME ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) )* otherlv_4= 'FROM' ( (lv_from_5_0= ruleExpression ) ) (otherlv_6= 'WHERE' ( (lv_condition_7_0= ruleExpression ) ) )? )
            {
            // InternalJsonDsl.g:1701:2: (otherlv_0= 'SELECT' ( (lv_fields_1_0= RULE_FIELD_NAME ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) )* otherlv_4= 'FROM' ( (lv_from_5_0= ruleExpression ) ) (otherlv_6= 'WHERE' ( (lv_condition_7_0= ruleExpression ) ) )? )
            // InternalJsonDsl.g:1702:3: otherlv_0= 'SELECT' ( (lv_fields_1_0= RULE_FIELD_NAME ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) )* otherlv_4= 'FROM' ( (lv_from_5_0= ruleExpression ) ) (otherlv_6= 'WHERE' ( (lv_condition_7_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
            		
            // InternalJsonDsl.g:1706:3: ( (lv_fields_1_0= RULE_FIELD_NAME ) )
            // InternalJsonDsl.g:1707:4: (lv_fields_1_0= RULE_FIELD_NAME )
            {
            // InternalJsonDsl.g:1707:4: (lv_fields_1_0= RULE_FIELD_NAME )
            // InternalJsonDsl.g:1708:5: lv_fields_1_0= RULE_FIELD_NAME
            {
            lv_fields_1_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_21); 

            					newLeafNode(lv_fields_1_0, grammarAccess.getSelectAccess().getFieldsFIELD_NAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					addWithLastConsumed(
            						current,
            						"fields",
            						lv_fields_1_0,
            						"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
            				

            }


            }

            // InternalJsonDsl.g:1724:3: (otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalJsonDsl.g:1725:4: otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,37,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJsonDsl.g:1729:4: ( (lv_fields_3_0= RULE_FIELD_NAME ) )
            	    // InternalJsonDsl.g:1730:5: (lv_fields_3_0= RULE_FIELD_NAME )
            	    {
            	    // InternalJsonDsl.g:1730:5: (lv_fields_3_0= RULE_FIELD_NAME )
            	    // InternalJsonDsl.g:1731:6: lv_fields_3_0= RULE_FIELD_NAME
            	    {
            	    lv_fields_3_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_21); 

            	    						newLeafNode(lv_fields_3_0, grammarAccess.getSelectAccess().getFieldsFIELD_NAMETerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSelectRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"fields",
            	    							lv_fields_3_0,
            	    							"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getFROMKeyword_3());
            		
            // InternalJsonDsl.g:1752:3: ( (lv_from_5_0= ruleExpression ) )
            // InternalJsonDsl.g:1753:4: (lv_from_5_0= ruleExpression )
            {
            // InternalJsonDsl.g:1753:4: (lv_from_5_0= ruleExpression )
            // InternalJsonDsl.g:1754:5: lv_from_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getFromExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_from_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_5_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:1771:3: (otherlv_6= 'WHERE' ( (lv_condition_7_0= ruleExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==49) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJsonDsl.g:1772:4: otherlv_6= 'WHERE' ( (lv_condition_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getWHEREKeyword_5_0());
                    			
                    // InternalJsonDsl.g:1776:4: ( (lv_condition_7_0= ruleExpression ) )
                    // InternalJsonDsl.g:1777:5: (lv_condition_7_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:1777:5: (lv_condition_7_0= ruleExpression )
                    // InternalJsonDsl.g:1778:6: lv_condition_7_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSelectAccess().getConditionExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_7_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_7_0,
                    							"org.xtext.example.mydsl.JsonDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:1800:1: entryRuleConcat returns [EObject current=null] : iv_ruleConcat= ruleConcat EOF ;
    public final EObject entryRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcat = null;


        try {
            // InternalJsonDsl.g:1800:47: (iv_ruleConcat= ruleConcat EOF )
            // InternalJsonDsl.g:1801:2: iv_ruleConcat= ruleConcat EOF
            {
             newCompositeNode(grammarAccess.getConcatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcat=ruleConcat();

            state._fsp--;

             current =iv_ruleConcat; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1807:1: ruleConcat returns [EObject current=null] : (otherlv_0= 'CONCAT' ( (lv_first_1_0= ruleExpression ) ) otherlv_2= 'WITH' ( (lv_second_3_0= ruleExpression ) ) ) ;
    public final EObject ruleConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_first_1_0 = null;

        EObject lv_second_3_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1813:2: ( (otherlv_0= 'CONCAT' ( (lv_first_1_0= ruleExpression ) ) otherlv_2= 'WITH' ( (lv_second_3_0= ruleExpression ) ) ) )
            // InternalJsonDsl.g:1814:2: (otherlv_0= 'CONCAT' ( (lv_first_1_0= ruleExpression ) ) otherlv_2= 'WITH' ( (lv_second_3_0= ruleExpression ) ) )
            {
            // InternalJsonDsl.g:1814:2: (otherlv_0= 'CONCAT' ( (lv_first_1_0= ruleExpression ) ) otherlv_2= 'WITH' ( (lv_second_3_0= ruleExpression ) ) )
            // InternalJsonDsl.g:1815:3: otherlv_0= 'CONCAT' ( (lv_first_1_0= ruleExpression ) ) otherlv_2= 'WITH' ( (lv_second_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConcatAccess().getCONCATKeyword_0());
            		
            // InternalJsonDsl.g:1819:3: ( (lv_first_1_0= ruleExpression ) )
            // InternalJsonDsl.g:1820:4: (lv_first_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:1820:4: (lv_first_1_0= ruleExpression )
            // InternalJsonDsl.g:1821:5: lv_first_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConcatAccess().getFirstExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_first_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConcatRule());
            					}
            					set(
            						current,
            						"first",
            						lv_first_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConcatAccess().getWITHKeyword_2());
            		
            // InternalJsonDsl.g:1842:3: ( (lv_second_3_0= ruleExpression ) )
            // InternalJsonDsl.g:1843:4: (lv_second_3_0= ruleExpression )
            {
            // InternalJsonDsl.g:1843:4: (lv_second_3_0= ruleExpression )
            // InternalJsonDsl.g:1844:5: lv_second_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConcatAccess().getSecondExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_second_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConcatRule());
            					}
            					set(
            						current,
            						"second",
            						lv_second_3_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:1865:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalJsonDsl.g:1865:44: (iv_ruleSum= ruleSum EOF )
            // InternalJsonDsl.g:1866:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1872:1: ruleSum returns [EObject current=null] : (otherlv_0= 'SUM' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;

        EObject lv_auxiliar_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1878:2: ( (otherlv_0= 'SUM' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) ) )
            // InternalJsonDsl.g:1879:2: (otherlv_0= 'SUM' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) )
            {
            // InternalJsonDsl.g:1879:2: (otherlv_0= 'SUM' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) )
            // InternalJsonDsl.g:1880:3: otherlv_0= 'SUM' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getSUMKeyword_0());
            		
            // InternalJsonDsl.g:1884:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJsonDsl.g:1885:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:1885:4: (lv_expression_1_0= ruleExpression )
            // InternalJsonDsl.g:1886:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSumAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:1903:3: ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) )
            // InternalJsonDsl.g:1904:4: (lv_auxiliar_2_0= ruleArithmeticAuxiliar )
            {
            // InternalJsonDsl.g:1904:4: (lv_auxiliar_2_0= ruleArithmeticAuxiliar )
            // InternalJsonDsl.g:1905:5: lv_auxiliar_2_0= ruleArithmeticAuxiliar
            {

            					newCompositeNode(grammarAccess.getSumAccess().getAuxiliarArithmeticAuxiliarParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_auxiliar_2_0=ruleArithmeticAuxiliar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"auxiliar",
            						lv_auxiliar_2_0,
            						"org.xtext.example.mydsl.JsonDsl.ArithmeticAuxiliar");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:1926:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalJsonDsl.g:1926:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalJsonDsl.g:1927:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1933:1: ruleProduct returns [EObject current=null] : (otherlv_0= 'PRODUCT' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;

        EObject lv_auxiliar_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:1939:2: ( (otherlv_0= 'PRODUCT' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) ) )
            // InternalJsonDsl.g:1940:2: (otherlv_0= 'PRODUCT' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) )
            {
            // InternalJsonDsl.g:1940:2: (otherlv_0= 'PRODUCT' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) )
            // InternalJsonDsl.g:1941:3: otherlv_0= 'PRODUCT' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProductAccess().getPRODUCTKeyword_0());
            		
            // InternalJsonDsl.g:1945:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJsonDsl.g:1946:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:1946:4: (lv_expression_1_0= ruleExpression )
            // InternalJsonDsl.g:1947:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProductAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:1964:3: ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) )
            // InternalJsonDsl.g:1965:4: (lv_auxiliar_2_0= ruleArithmeticAuxiliar )
            {
            // InternalJsonDsl.g:1965:4: (lv_auxiliar_2_0= ruleArithmeticAuxiliar )
            // InternalJsonDsl.g:1966:5: lv_auxiliar_2_0= ruleArithmeticAuxiliar
            {

            					newCompositeNode(grammarAccess.getProductAccess().getAuxiliarArithmeticAuxiliarParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_auxiliar_2_0=ruleArithmeticAuxiliar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductRule());
            					}
            					set(
            						current,
            						"auxiliar",
            						lv_auxiliar_2_0,
            						"org.xtext.example.mydsl.JsonDsl.ArithmeticAuxiliar");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:1987:1: entryRuleMean returns [EObject current=null] : iv_ruleMean= ruleMean EOF ;
    public final EObject entryRuleMean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMean = null;


        try {
            // InternalJsonDsl.g:1987:45: (iv_ruleMean= ruleMean EOF )
            // InternalJsonDsl.g:1988:2: iv_ruleMean= ruleMean EOF
            {
             newCompositeNode(grammarAccess.getMeanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMean=ruleMean();

            state._fsp--;

             current =iv_ruleMean; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:1994:1: ruleMean returns [EObject current=null] : (otherlv_0= 'MEAN' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) ) ;
    public final EObject ruleMean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;

        EObject lv_auxiliar_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2000:2: ( (otherlv_0= 'MEAN' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) ) )
            // InternalJsonDsl.g:2001:2: (otherlv_0= 'MEAN' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) )
            {
            // InternalJsonDsl.g:2001:2: (otherlv_0= 'MEAN' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) ) )
            // InternalJsonDsl.g:2002:3: otherlv_0= 'MEAN' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMeanAccess().getMEANKeyword_0());
            		
            // InternalJsonDsl.g:2006:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJsonDsl.g:2007:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:2007:4: (lv_expression_1_0= ruleExpression )
            // InternalJsonDsl.g:2008:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMeanAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeanRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:2025:3: ( (lv_auxiliar_2_0= ruleArithmeticAuxiliar ) )
            // InternalJsonDsl.g:2026:4: (lv_auxiliar_2_0= ruleArithmeticAuxiliar )
            {
            // InternalJsonDsl.g:2026:4: (lv_auxiliar_2_0= ruleArithmeticAuxiliar )
            // InternalJsonDsl.g:2027:5: lv_auxiliar_2_0= ruleArithmeticAuxiliar
            {

            					newCompositeNode(grammarAccess.getMeanAccess().getAuxiliarArithmeticAuxiliarParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_auxiliar_2_0=ruleArithmeticAuxiliar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeanRule());
            					}
            					set(
            						current,
            						"auxiliar",
            						lv_auxiliar_2_0,
            						"org.xtext.example.mydsl.JsonDsl.ArithmeticAuxiliar");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleArithmeticAuxiliar"
    // InternalJsonDsl.g:2048:1: entryRuleArithmeticAuxiliar returns [EObject current=null] : iv_ruleArithmeticAuxiliar= ruleArithmeticAuxiliar EOF ;
    public final EObject entryRuleArithmeticAuxiliar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticAuxiliar = null;


        try {
            // InternalJsonDsl.g:2048:59: (iv_ruleArithmeticAuxiliar= ruleArithmeticAuxiliar EOF )
            // InternalJsonDsl.g:2049:2: iv_ruleArithmeticAuxiliar= ruleArithmeticAuxiliar EOF
            {
             newCompositeNode(grammarAccess.getArithmeticAuxiliarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticAuxiliar=ruleArithmeticAuxiliar();

            state._fsp--;

             current =iv_ruleArithmeticAuxiliar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticAuxiliar"


    // $ANTLR start "ruleArithmeticAuxiliar"
    // InternalJsonDsl.g:2055:1: ruleArithmeticAuxiliar returns [EObject current=null] : ( () (otherlv_1= 'ON' ( (lv_fields_2_0= RULE_FIELD_NAME ) ) (otherlv_3= ',' ( (lv_fields_4_0= RULE_FIELD_NAME ) ) )* )? (otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) ) )? ) ;
    public final EObject ruleArithmeticAuxiliar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_fields_2_0=null;
        Token otherlv_3=null;
        Token lv_fields_4_0=null;
        Token otherlv_5=null;
        EObject lv_condition_6_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2061:2: ( ( () (otherlv_1= 'ON' ( (lv_fields_2_0= RULE_FIELD_NAME ) ) (otherlv_3= ',' ( (lv_fields_4_0= RULE_FIELD_NAME ) ) )* )? (otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) ) )? ) )
            // InternalJsonDsl.g:2062:2: ( () (otherlv_1= 'ON' ( (lv_fields_2_0= RULE_FIELD_NAME ) ) (otherlv_3= ',' ( (lv_fields_4_0= RULE_FIELD_NAME ) ) )* )? (otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) ) )? )
            {
            // InternalJsonDsl.g:2062:2: ( () (otherlv_1= 'ON' ( (lv_fields_2_0= RULE_FIELD_NAME ) ) (otherlv_3= ',' ( (lv_fields_4_0= RULE_FIELD_NAME ) ) )* )? (otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) ) )? )
            // InternalJsonDsl.g:2063:3: () (otherlv_1= 'ON' ( (lv_fields_2_0= RULE_FIELD_NAME ) ) (otherlv_3= ',' ( (lv_fields_4_0= RULE_FIELD_NAME ) ) )* )? (otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) ) )?
            {
            // InternalJsonDsl.g:2063:3: ()
            // InternalJsonDsl.g:2064:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArithmeticAuxiliarAccess().getArithmeticAuxiliarAction_0(),
            					current);
            			

            }

            // InternalJsonDsl.g:2070:3: (otherlv_1= 'ON' ( (lv_fields_2_0= RULE_FIELD_NAME ) ) (otherlv_3= ',' ( (lv_fields_4_0= RULE_FIELD_NAME ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==55) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJsonDsl.g:2071:4: otherlv_1= 'ON' ( (lv_fields_2_0= RULE_FIELD_NAME ) ) (otherlv_3= ',' ( (lv_fields_4_0= RULE_FIELD_NAME ) ) )*
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getArithmeticAuxiliarAccess().getONKeyword_1_0());
                    			
                    // InternalJsonDsl.g:2075:4: ( (lv_fields_2_0= RULE_FIELD_NAME ) )
                    // InternalJsonDsl.g:2076:5: (lv_fields_2_0= RULE_FIELD_NAME )
                    {
                    // InternalJsonDsl.g:2076:5: (lv_fields_2_0= RULE_FIELD_NAME )
                    // InternalJsonDsl.g:2077:6: lv_fields_2_0= RULE_FIELD_NAME
                    {
                    lv_fields_2_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_24); 

                    						newLeafNode(lv_fields_2_0, grammarAccess.getArithmeticAuxiliarAccess().getFieldsFIELD_NAMETerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArithmeticAuxiliarRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"fields",
                    							lv_fields_2_0,
                    							"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
                    					

                    }


                    }

                    // InternalJsonDsl.g:2093:4: (otherlv_3= ',' ( (lv_fields_4_0= RULE_FIELD_NAME ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==37) ) {
                            int LA22_2 = input.LA(2);

                            if ( (LA22_2==RULE_FIELD_NAME) ) {
                                alt22=1;
                            }


                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalJsonDsl.g:2094:5: otherlv_3= ',' ( (lv_fields_4_0= RULE_FIELD_NAME ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_15); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArithmeticAuxiliarAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalJsonDsl.g:2098:5: ( (lv_fields_4_0= RULE_FIELD_NAME ) )
                    	    // InternalJsonDsl.g:2099:6: (lv_fields_4_0= RULE_FIELD_NAME )
                    	    {
                    	    // InternalJsonDsl.g:2099:6: (lv_fields_4_0= RULE_FIELD_NAME )
                    	    // InternalJsonDsl.g:2100:7: lv_fields_4_0= RULE_FIELD_NAME
                    	    {
                    	    lv_fields_4_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_24); 

                    	    							newLeafNode(lv_fields_4_0, grammarAccess.getArithmeticAuxiliarAccess().getFieldsFIELD_NAMETerminalRuleCall_1_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getArithmeticAuxiliarRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_4_0,
                    	    								"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
                    	    						

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

            // InternalJsonDsl.g:2118:3: (otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJsonDsl.g:2119:4: otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getArithmeticAuxiliarAccess().getWHEREKeyword_2_0());
                    			
                    // InternalJsonDsl.g:2123:4: ( (lv_condition_6_0= ruleExpression ) )
                    // InternalJsonDsl.g:2124:5: (lv_condition_6_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2124:5: (lv_condition_6_0= ruleExpression )
                    // InternalJsonDsl.g:2125:6: lv_condition_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getArithmeticAuxiliarAccess().getConditionExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticAuxiliarRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_6_0,
                    							"org.xtext.example.mydsl.JsonDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticAuxiliar"


    // $ANTLR start "entryRuleAdd"
    // InternalJsonDsl.g:2147:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalJsonDsl.g:2147:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalJsonDsl.g:2148:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:2154:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'ADD' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_variable_3_0= ruleExpression ) ) (otherlv_4= 'ON' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) (otherlv_6= ',' ( (lv_fields_7_0= RULE_FIELD_NAME ) ) )* )? ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_fields_5_0=null;
        Token otherlv_6=null;
        Token lv_fields_7_0=null;
        EObject lv_value_1_0 = null;

        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2160:2: ( (otherlv_0= 'ADD' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_variable_3_0= ruleExpression ) ) (otherlv_4= 'ON' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) (otherlv_6= ',' ( (lv_fields_7_0= RULE_FIELD_NAME ) ) )* )? ) )
            // InternalJsonDsl.g:2161:2: (otherlv_0= 'ADD' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_variable_3_0= ruleExpression ) ) (otherlv_4= 'ON' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) (otherlv_6= ',' ( (lv_fields_7_0= RULE_FIELD_NAME ) ) )* )? )
            {
            // InternalJsonDsl.g:2161:2: (otherlv_0= 'ADD' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_variable_3_0= ruleExpression ) ) (otherlv_4= 'ON' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) (otherlv_6= ',' ( (lv_fields_7_0= RULE_FIELD_NAME ) ) )* )? )
            // InternalJsonDsl.g:2162:3: otherlv_0= 'ADD' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_variable_3_0= ruleExpression ) ) (otherlv_4= 'ON' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) (otherlv_6= ',' ( (lv_fields_7_0= RULE_FIELD_NAME ) ) )* )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getADDKeyword_0());
            		
            // InternalJsonDsl.g:2166:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalJsonDsl.g:2167:4: (lv_value_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:2167:4: (lv_value_1_0= ruleExpression )
            // InternalJsonDsl.g:2168:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAddAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getINKeyword_2());
            		
            // InternalJsonDsl.g:2189:3: ( (lv_variable_3_0= ruleExpression ) )
            // InternalJsonDsl.g:2190:4: (lv_variable_3_0= ruleExpression )
            {
            // InternalJsonDsl.g:2190:4: (lv_variable_3_0= ruleExpression )
            // InternalJsonDsl.g:2191:5: lv_variable_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAddAccess().getVariableExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_variable_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_3_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:2208:3: (otherlv_4= 'ON' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) (otherlv_6= ',' ( (lv_fields_7_0= RULE_FIELD_NAME ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJsonDsl.g:2209:4: otherlv_4= 'ON' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) (otherlv_6= ',' ( (lv_fields_7_0= RULE_FIELD_NAME ) ) )*
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getAddAccess().getONKeyword_4_0());
                    			
                    // InternalJsonDsl.g:2213:4: ( (lv_fields_5_0= RULE_FIELD_NAME ) )
                    // InternalJsonDsl.g:2214:5: (lv_fields_5_0= RULE_FIELD_NAME )
                    {
                    // InternalJsonDsl.g:2214:5: (lv_fields_5_0= RULE_FIELD_NAME )
                    // InternalJsonDsl.g:2215:6: lv_fields_5_0= RULE_FIELD_NAME
                    {
                    lv_fields_5_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_26); 

                    						newLeafNode(lv_fields_5_0, grammarAccess.getAddAccess().getFieldsFIELD_NAMETerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"fields",
                    							lv_fields_5_0,
                    							"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
                    					

                    }


                    }

                    // InternalJsonDsl.g:2231:4: (otherlv_6= ',' ( (lv_fields_7_0= RULE_FIELD_NAME ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==37) ) {
                            int LA25_2 = input.LA(2);

                            if ( (LA25_2==RULE_FIELD_NAME) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalJsonDsl.g:2232:5: otherlv_6= ',' ( (lv_fields_7_0= RULE_FIELD_NAME ) )
                    	    {
                    	    otherlv_6=(Token)match(input,37,FOLLOW_15); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAddAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalJsonDsl.g:2236:5: ( (lv_fields_7_0= RULE_FIELD_NAME ) )
                    	    // InternalJsonDsl.g:2237:6: (lv_fields_7_0= RULE_FIELD_NAME )
                    	    {
                    	    // InternalJsonDsl.g:2237:6: (lv_fields_7_0= RULE_FIELD_NAME )
                    	    // InternalJsonDsl.g:2238:7: lv_fields_7_0= RULE_FIELD_NAME
                    	    {
                    	    lv_fields_7_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_26); 

                    	    							newLeafNode(lv_fields_7_0, grammarAccess.getAddAccess().getFieldsFIELD_NAMETerminalRuleCall_4_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAddRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_7_0,
                    	    								"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:2260:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalJsonDsl.g:2260:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalJsonDsl.g:2261:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:2267:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'INSERT' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_variable_3_0= ruleExpression ) ) ( (lv_specifier_4_0= ruleArraySpecifier ) ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_specifier_4_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2273:2: ( (otherlv_0= 'INSERT' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_variable_3_0= ruleExpression ) ) ( (lv_specifier_4_0= ruleArraySpecifier ) ) ) )
            // InternalJsonDsl.g:2274:2: (otherlv_0= 'INSERT' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_variable_3_0= ruleExpression ) ) ( (lv_specifier_4_0= ruleArraySpecifier ) ) )
            {
            // InternalJsonDsl.g:2274:2: (otherlv_0= 'INSERT' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_variable_3_0= ruleExpression ) ) ( (lv_specifier_4_0= ruleArraySpecifier ) ) )
            // InternalJsonDsl.g:2275:3: otherlv_0= 'INSERT' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'IN' ( (lv_variable_3_0= ruleExpression ) ) ( (lv_specifier_4_0= ruleArraySpecifier ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getINSERTKeyword_0());
            		
            // InternalJsonDsl.g:2279:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalJsonDsl.g:2280:4: (lv_value_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:2280:4: (lv_value_1_0= ruleExpression )
            // InternalJsonDsl.g:2281:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getINKeyword_2());
            		
            // InternalJsonDsl.g:2302:3: ( (lv_variable_3_0= ruleExpression ) )
            // InternalJsonDsl.g:2303:4: (lv_variable_3_0= ruleExpression )
            {
            // InternalJsonDsl.g:2303:4: (lv_variable_3_0= ruleExpression )
            // InternalJsonDsl.g:2304:5: lv_variable_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getVariableExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_variable_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_3_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:2321:3: ( (lv_specifier_4_0= ruleArraySpecifier ) )
            // InternalJsonDsl.g:2322:4: (lv_specifier_4_0= ruleArraySpecifier )
            {
            // InternalJsonDsl.g:2322:4: (lv_specifier_4_0= ruleArraySpecifier )
            // InternalJsonDsl.g:2323:5: lv_specifier_4_0= ruleArraySpecifier
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getSpecifierArraySpecifierParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_specifier_4_0=ruleArraySpecifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"specifier",
            						lv_specifier_4_0,
            						"org.xtext.example.mydsl.JsonDsl.ArraySpecifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:2344:1: entryRuleRename returns [EObject current=null] : iv_ruleRename= ruleRename EOF ;
    public final EObject entryRuleRename() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRename = null;


        try {
            // InternalJsonDsl.g:2344:47: (iv_ruleRename= ruleRename EOF )
            // InternalJsonDsl.g:2345:2: iv_ruleRename= ruleRename EOF
            {
             newCompositeNode(grammarAccess.getRenameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRename=ruleRename();

            state._fsp--;

             current =iv_ruleRename; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:2351:1: ruleRename returns [EObject current=null] : (otherlv_0= 'RENAME' ( (lv_call_1_0= ruleVariableCall ) ) otherlv_2= 'ON' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )* otherlv_6= 'TO' ( (lv_nfields_7_0= RULE_FIELD_NAME ) ) (otherlv_8= ',' ( (lv_nfields_9_0= RULE_FIELD_NAME ) ) )* ) ;
    public final EObject ruleRename() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_fields_3_0=null;
        Token otherlv_4=null;
        Token lv_fields_5_0=null;
        Token otherlv_6=null;
        Token lv_nfields_7_0=null;
        Token otherlv_8=null;
        Token lv_nfields_9_0=null;
        EObject lv_call_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2357:2: ( (otherlv_0= 'RENAME' ( (lv_call_1_0= ruleVariableCall ) ) otherlv_2= 'ON' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )* otherlv_6= 'TO' ( (lv_nfields_7_0= RULE_FIELD_NAME ) ) (otherlv_8= ',' ( (lv_nfields_9_0= RULE_FIELD_NAME ) ) )* ) )
            // InternalJsonDsl.g:2358:2: (otherlv_0= 'RENAME' ( (lv_call_1_0= ruleVariableCall ) ) otherlv_2= 'ON' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )* otherlv_6= 'TO' ( (lv_nfields_7_0= RULE_FIELD_NAME ) ) (otherlv_8= ',' ( (lv_nfields_9_0= RULE_FIELD_NAME ) ) )* )
            {
            // InternalJsonDsl.g:2358:2: (otherlv_0= 'RENAME' ( (lv_call_1_0= ruleVariableCall ) ) otherlv_2= 'ON' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )* otherlv_6= 'TO' ( (lv_nfields_7_0= RULE_FIELD_NAME ) ) (otherlv_8= ',' ( (lv_nfields_9_0= RULE_FIELD_NAME ) ) )* )
            // InternalJsonDsl.g:2359:3: otherlv_0= 'RENAME' ( (lv_call_1_0= ruleVariableCall ) ) otherlv_2= 'ON' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )* otherlv_6= 'TO' ( (lv_nfields_7_0= RULE_FIELD_NAME ) ) (otherlv_8= ',' ( (lv_nfields_9_0= RULE_FIELD_NAME ) ) )*
            {
            otherlv_0=(Token)match(input,58,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameAccess().getRENAMEKeyword_0());
            		
            // InternalJsonDsl.g:2363:3: ( (lv_call_1_0= ruleVariableCall ) )
            // InternalJsonDsl.g:2364:4: (lv_call_1_0= ruleVariableCall )
            {
            // InternalJsonDsl.g:2364:4: (lv_call_1_0= ruleVariableCall )
            // InternalJsonDsl.g:2365:5: lv_call_1_0= ruleVariableCall
            {

            					newCompositeNode(grammarAccess.getRenameAccess().getCallVariableCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_call_1_0=ruleVariableCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRenameRule());
            					}
            					set(
            						current,
            						"call",
            						lv_call_1_0,
            						"org.xtext.example.mydsl.JsonDsl.VariableCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getRenameAccess().getONKeyword_2());
            		
            // InternalJsonDsl.g:2386:3: ( (lv_fields_3_0= RULE_FIELD_NAME ) )
            // InternalJsonDsl.g:2387:4: (lv_fields_3_0= RULE_FIELD_NAME )
            {
            // InternalJsonDsl.g:2387:4: (lv_fields_3_0= RULE_FIELD_NAME )
            // InternalJsonDsl.g:2388:5: lv_fields_3_0= RULE_FIELD_NAME
            {
            lv_fields_3_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_30); 

            					newLeafNode(lv_fields_3_0, grammarAccess.getRenameAccess().getFieldsFIELD_NAMETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameRule());
            					}
            					addWithLastConsumed(
            						current,
            						"fields",
            						lv_fields_3_0,
            						"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
            				

            }


            }

            // InternalJsonDsl.g:2404:3: (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==37) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalJsonDsl.g:2405:4: otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) )
            	    {
            	    otherlv_4=(Token)match(input,37,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRenameAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalJsonDsl.g:2409:4: ( (lv_fields_5_0= RULE_FIELD_NAME ) )
            	    // InternalJsonDsl.g:2410:5: (lv_fields_5_0= RULE_FIELD_NAME )
            	    {
            	    // InternalJsonDsl.g:2410:5: (lv_fields_5_0= RULE_FIELD_NAME )
            	    // InternalJsonDsl.g:2411:6: lv_fields_5_0= RULE_FIELD_NAME
            	    {
            	    lv_fields_5_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_30); 

            	    						newLeafNode(lv_fields_5_0, grammarAccess.getRenameAccess().getFieldsFIELD_NAMETerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRenameRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"fields",
            	    							lv_fields_5_0,
            	    							"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_6=(Token)match(input,59,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getRenameAccess().getTOKeyword_5());
            		
            // InternalJsonDsl.g:2432:3: ( (lv_nfields_7_0= RULE_FIELD_NAME ) )
            // InternalJsonDsl.g:2433:4: (lv_nfields_7_0= RULE_FIELD_NAME )
            {
            // InternalJsonDsl.g:2433:4: (lv_nfields_7_0= RULE_FIELD_NAME )
            // InternalJsonDsl.g:2434:5: lv_nfields_7_0= RULE_FIELD_NAME
            {
            lv_nfields_7_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_26); 

            					newLeafNode(lv_nfields_7_0, grammarAccess.getRenameAccess().getNfieldsFIELD_NAMETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameRule());
            					}
            					addWithLastConsumed(
            						current,
            						"nfields",
            						lv_nfields_7_0,
            						"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
            				

            }


            }

            // InternalJsonDsl.g:2450:3: (otherlv_8= ',' ( (lv_nfields_9_0= RULE_FIELD_NAME ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==37) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==RULE_FIELD_NAME) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalJsonDsl.g:2451:4: otherlv_8= ',' ( (lv_nfields_9_0= RULE_FIELD_NAME ) )
            	    {
            	    otherlv_8=(Token)match(input,37,FOLLOW_15); 

            	    				newLeafNode(otherlv_8, grammarAccess.getRenameAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalJsonDsl.g:2455:4: ( (lv_nfields_9_0= RULE_FIELD_NAME ) )
            	    // InternalJsonDsl.g:2456:5: (lv_nfields_9_0= RULE_FIELD_NAME )
            	    {
            	    // InternalJsonDsl.g:2456:5: (lv_nfields_9_0= RULE_FIELD_NAME )
            	    // InternalJsonDsl.g:2457:6: lv_nfields_9_0= RULE_FIELD_NAME
            	    {
            	    lv_nfields_9_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_26); 

            	    						newLeafNode(lv_nfields_9_0, grammarAccess.getRenameAccess().getNfieldsFIELD_NAMETerminalRuleCall_7_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRenameRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"nfields",
            	    							lv_nfields_9_0,
            	    							"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleErase"
    // InternalJsonDsl.g:2478:1: entryRuleErase returns [EObject current=null] : iv_ruleErase= ruleErase EOF ;
    public final EObject entryRuleErase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErase = null;


        try {
            // InternalJsonDsl.g:2478:46: (iv_ruleErase= ruleErase EOF )
            // InternalJsonDsl.g:2479:2: iv_ruleErase= ruleErase EOF
            {
             newCompositeNode(grammarAccess.getEraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErase=ruleErase();

            state._fsp--;

             current =iv_ruleErase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErase"


    // $ANTLR start "ruleErase"
    // InternalJsonDsl.g:2485:1: ruleErase returns [EObject current=null] : (otherlv_0= 'ERASE' ( (lv_value_1_0= ruleExpression ) ) (otherlv_2= 'ON' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )* )? ) ;
    public final EObject ruleErase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_fields_3_0=null;
        Token otherlv_4=null;
        Token lv_fields_5_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2491:2: ( (otherlv_0= 'ERASE' ( (lv_value_1_0= ruleExpression ) ) (otherlv_2= 'ON' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )* )? ) )
            // InternalJsonDsl.g:2492:2: (otherlv_0= 'ERASE' ( (lv_value_1_0= ruleExpression ) ) (otherlv_2= 'ON' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )* )? )
            {
            // InternalJsonDsl.g:2492:2: (otherlv_0= 'ERASE' ( (lv_value_1_0= ruleExpression ) ) (otherlv_2= 'ON' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )* )? )
            // InternalJsonDsl.g:2493:3: otherlv_0= 'ERASE' ( (lv_value_1_0= ruleExpression ) ) (otherlv_2= 'ON' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )* )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEraseAccess().getERASEKeyword_0());
            		
            // InternalJsonDsl.g:2497:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalJsonDsl.g:2498:4: (lv_value_1_0= ruleExpression )
            {
            // InternalJsonDsl.g:2498:4: (lv_value_1_0= ruleExpression )
            // InternalJsonDsl.g:2499:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEraseAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEraseRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:2516:3: (otherlv_2= 'ON' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJsonDsl.g:2517:4: otherlv_2= 'ON' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )*
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getEraseAccess().getONKeyword_2_0());
                    			
                    // InternalJsonDsl.g:2521:4: ( (lv_fields_3_0= RULE_FIELD_NAME ) )
                    // InternalJsonDsl.g:2522:5: (lv_fields_3_0= RULE_FIELD_NAME )
                    {
                    // InternalJsonDsl.g:2522:5: (lv_fields_3_0= RULE_FIELD_NAME )
                    // InternalJsonDsl.g:2523:6: lv_fields_3_0= RULE_FIELD_NAME
                    {
                    lv_fields_3_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_26); 

                    						newLeafNode(lv_fields_3_0, grammarAccess.getEraseAccess().getFieldsFIELD_NAMETerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEraseRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"fields",
                    							lv_fields_3_0,
                    							"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
                    					

                    }


                    }

                    // InternalJsonDsl.g:2539:4: (otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==37) ) {
                            int LA29_2 = input.LA(2);

                            if ( (LA29_2==RULE_FIELD_NAME) ) {
                                alt29=1;
                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalJsonDsl.g:2540:5: otherlv_4= ',' ( (lv_fields_5_0= RULE_FIELD_NAME ) )
                    	    {
                    	    otherlv_4=(Token)match(input,37,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEraseAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalJsonDsl.g:2544:5: ( (lv_fields_5_0= RULE_FIELD_NAME ) )
                    	    // InternalJsonDsl.g:2545:6: (lv_fields_5_0= RULE_FIELD_NAME )
                    	    {
                    	    // InternalJsonDsl.g:2545:6: (lv_fields_5_0= RULE_FIELD_NAME )
                    	    // InternalJsonDsl.g:2546:7: lv_fields_5_0= RULE_FIELD_NAME
                    	    {
                    	    lv_fields_5_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_26); 

                    	    							newLeafNode(lv_fields_5_0, grammarAccess.getEraseAccess().getFieldsFIELD_NAMETerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEraseRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_5_0,
                    	    								"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
                    	    						

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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErase"


    // $ANTLR start "entryRuleDelete"
    // InternalJsonDsl.g:2568:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalJsonDsl.g:2568:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalJsonDsl.g:2569:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:2575:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'DELETE' ( (lv_fields_1_0= RULE_FIELD_NAME ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) )* otherlv_4= 'FROM' ( (lv_from_5_0= ruleExpression ) ) (otherlv_6= 'WHERE' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')' )? ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fields_1_0=null;
        Token otherlv_2=null;
        Token lv_fields_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_from_5_0 = null;

        EObject lv_condition_8_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2581:2: ( (otherlv_0= 'DELETE' ( (lv_fields_1_0= RULE_FIELD_NAME ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) )* otherlv_4= 'FROM' ( (lv_from_5_0= ruleExpression ) ) (otherlv_6= 'WHERE' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')' )? ) )
            // InternalJsonDsl.g:2582:2: (otherlv_0= 'DELETE' ( (lv_fields_1_0= RULE_FIELD_NAME ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) )* otherlv_4= 'FROM' ( (lv_from_5_0= ruleExpression ) ) (otherlv_6= 'WHERE' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')' )? )
            {
            // InternalJsonDsl.g:2582:2: (otherlv_0= 'DELETE' ( (lv_fields_1_0= RULE_FIELD_NAME ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) )* otherlv_4= 'FROM' ( (lv_from_5_0= ruleExpression ) ) (otherlv_6= 'WHERE' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')' )? )
            // InternalJsonDsl.g:2583:3: otherlv_0= 'DELETE' ( (lv_fields_1_0= RULE_FIELD_NAME ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) )* otherlv_4= 'FROM' ( (lv_from_5_0= ruleExpression ) ) (otherlv_6= 'WHERE' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')' )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDELETEKeyword_0());
            		
            // InternalJsonDsl.g:2587:3: ( (lv_fields_1_0= RULE_FIELD_NAME ) )
            // InternalJsonDsl.g:2588:4: (lv_fields_1_0= RULE_FIELD_NAME )
            {
            // InternalJsonDsl.g:2588:4: (lv_fields_1_0= RULE_FIELD_NAME )
            // InternalJsonDsl.g:2589:5: lv_fields_1_0= RULE_FIELD_NAME
            {
            lv_fields_1_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_21); 

            					newLeafNode(lv_fields_1_0, grammarAccess.getDeleteAccess().getFieldsFIELD_NAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteRule());
            					}
            					addWithLastConsumed(
            						current,
            						"fields",
            						lv_fields_1_0,
            						"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
            				

            }


            }

            // InternalJsonDsl.g:2605:3: (otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==37) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalJsonDsl.g:2606:4: otherlv_2= ',' ( (lv_fields_3_0= RULE_FIELD_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,37,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJsonDsl.g:2610:4: ( (lv_fields_3_0= RULE_FIELD_NAME ) )
            	    // InternalJsonDsl.g:2611:5: (lv_fields_3_0= RULE_FIELD_NAME )
            	    {
            	    // InternalJsonDsl.g:2611:5: (lv_fields_3_0= RULE_FIELD_NAME )
            	    // InternalJsonDsl.g:2612:6: lv_fields_3_0= RULE_FIELD_NAME
            	    {
            	    lv_fields_3_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_21); 

            	    						newLeafNode(lv_fields_3_0, grammarAccess.getDeleteAccess().getFieldsFIELD_NAMETerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDeleteRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"fields",
            	    							lv_fields_3_0,
            	    							"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDeleteAccess().getFROMKeyword_3());
            		
            // InternalJsonDsl.g:2633:3: ( (lv_from_5_0= ruleExpression ) )
            // InternalJsonDsl.g:2634:4: (lv_from_5_0= ruleExpression )
            {
            // InternalJsonDsl.g:2634:4: (lv_from_5_0= ruleExpression )
            // InternalJsonDsl.g:2635:5: lv_from_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDeleteAccess().getFromExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_from_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_5_0,
            						"org.xtext.example.mydsl.JsonDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:2652:3: (otherlv_6= 'WHERE' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJsonDsl.g:2653:4: otherlv_6= 'WHERE' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeleteAccess().getWHEREKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,32,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getDeleteAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalJsonDsl.g:2661:4: ( (lv_condition_8_0= ruleExpression ) )
                    // InternalJsonDsl.g:2662:5: (lv_condition_8_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2662:5: (lv_condition_8_0= ruleExpression )
                    // InternalJsonDsl.g:2663:6: lv_condition_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getDeleteAccess().getConditionExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_condition_8_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeleteRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_8_0,
                    							"org.xtext.example.mydsl.JsonDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDeleteAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:2689:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalJsonDsl.g:2689:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalJsonDsl.g:2690:2: iv_ruleRemove= ruleRemove EOF
            {
             newCompositeNode(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;

             current =iv_ruleRemove; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:2696:1: ruleRemove returns [EObject current=null] : (otherlv_0= 'REMOVE' ( (lv_variable_1_0= ruleVariableCall ) ) ( (lv_specifier_2_0= ruleArraySpecifier ) ) ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_variable_1_0 = null;

        EObject lv_specifier_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2702:2: ( (otherlv_0= 'REMOVE' ( (lv_variable_1_0= ruleVariableCall ) ) ( (lv_specifier_2_0= ruleArraySpecifier ) ) ) )
            // InternalJsonDsl.g:2703:2: (otherlv_0= 'REMOVE' ( (lv_variable_1_0= ruleVariableCall ) ) ( (lv_specifier_2_0= ruleArraySpecifier ) ) )
            {
            // InternalJsonDsl.g:2703:2: (otherlv_0= 'REMOVE' ( (lv_variable_1_0= ruleVariableCall ) ) ( (lv_specifier_2_0= ruleArraySpecifier ) ) )
            // InternalJsonDsl.g:2704:3: otherlv_0= 'REMOVE' ( (lv_variable_1_0= ruleVariableCall ) ) ( (lv_specifier_2_0= ruleArraySpecifier ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAccess().getREMOVEKeyword_0());
            		
            // InternalJsonDsl.g:2708:3: ( (lv_variable_1_0= ruleVariableCall ) )
            // InternalJsonDsl.g:2709:4: (lv_variable_1_0= ruleVariableCall )
            {
            // InternalJsonDsl.g:2709:4: (lv_variable_1_0= ruleVariableCall )
            // InternalJsonDsl.g:2710:5: lv_variable_1_0= ruleVariableCall
            {

            					newCompositeNode(grammarAccess.getRemoveAccess().getVariableVariableCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_variable_1_0=ruleVariableCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoveRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.example.mydsl.JsonDsl.VariableCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:2727:3: ( (lv_specifier_2_0= ruleArraySpecifier ) )
            // InternalJsonDsl.g:2728:4: (lv_specifier_2_0= ruleArraySpecifier )
            {
            // InternalJsonDsl.g:2728:4: (lv_specifier_2_0= ruleArraySpecifier )
            // InternalJsonDsl.g:2729:5: lv_specifier_2_0= ruleArraySpecifier
            {

            					newCompositeNode(grammarAccess.getRemoveAccess().getSpecifierArraySpecifierParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_specifier_2_0=ruleArraySpecifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoveRule());
            					}
            					set(
            						current,
            						"specifier",
            						lv_specifier_2_0,
            						"org.xtext.example.mydsl.JsonDsl.ArraySpecifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleArraySpecifier"
    // InternalJsonDsl.g:2750:1: entryRuleArraySpecifier returns [EObject current=null] : iv_ruleArraySpecifier= ruleArraySpecifier EOF ;
    public final EObject entryRuleArraySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecifier = null;


        try {
            // InternalJsonDsl.g:2750:55: (iv_ruleArraySpecifier= ruleArraySpecifier EOF )
            // InternalJsonDsl.g:2751:2: iv_ruleArraySpecifier= ruleArraySpecifier EOF
            {
             newCompositeNode(grammarAccess.getArraySpecifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArraySpecifier=ruleArraySpecifier();

            state._fsp--;

             current =iv_ruleArraySpecifier; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:2757:1: ruleArraySpecifier returns [EObject current=null] : ( () (otherlv_1= 'AT' ( (lv_index_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleExpression ) ) )* )? (otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) ) )? ) ;
    public final EObject ruleArraySpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_index_2_0 = null;

        EObject lv_fields_4_0 = null;

        EObject lv_condition_6_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2763:2: ( ( () (otherlv_1= 'AT' ( (lv_index_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleExpression ) ) )* )? (otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) ) )? ) )
            // InternalJsonDsl.g:2764:2: ( () (otherlv_1= 'AT' ( (lv_index_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleExpression ) ) )* )? (otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) ) )? )
            {
            // InternalJsonDsl.g:2764:2: ( () (otherlv_1= 'AT' ( (lv_index_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleExpression ) ) )* )? (otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) ) )? )
            // InternalJsonDsl.g:2765:3: () (otherlv_1= 'AT' ( (lv_index_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleExpression ) ) )* )? (otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) ) )?
            {
            // InternalJsonDsl.g:2765:3: ()
            // InternalJsonDsl.g:2766:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArraySpecifierAccess().getArraySpecifierAction_0(),
            					current);
            			

            }

            // InternalJsonDsl.g:2772:3: (otherlv_1= 'AT' ( (lv_index_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleExpression ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==63) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJsonDsl.g:2773:4: otherlv_1= 'AT' ( (lv_index_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleExpression ) ) )*
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getArraySpecifierAccess().getATKeyword_1_0());
                    			
                    // InternalJsonDsl.g:2777:4: ( (lv_index_2_0= ruleExpression ) )
                    // InternalJsonDsl.g:2778:5: (lv_index_2_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2778:5: (lv_index_2_0= ruleExpression )
                    // InternalJsonDsl.g:2779:6: lv_index_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getArraySpecifierAccess().getIndexExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_index_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArraySpecifierRule());
                    						}
                    						add(
                    							current,
                    							"index",
                    							lv_index_2_0,
                    							"org.xtext.example.mydsl.JsonDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonDsl.g:2796:4: (otherlv_3= ',' ( (lv_fields_4_0= ruleExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==37) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalJsonDsl.g:2797:5: otherlv_3= ',' ( (lv_fields_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArraySpecifierAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalJsonDsl.g:2801:5: ( (lv_fields_4_0= ruleExpression ) )
                    	    // InternalJsonDsl.g:2802:6: (lv_fields_4_0= ruleExpression )
                    	    {
                    	    // InternalJsonDsl.g:2802:6: (lv_fields_4_0= ruleExpression )
                    	    // InternalJsonDsl.g:2803:7: lv_fields_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getArraySpecifierAccess().getFieldsExpressionParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_fields_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArraySpecifierRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_4_0,
                    	    								"org.xtext.example.mydsl.JsonDsl.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalJsonDsl.g:2822:3: (otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalJsonDsl.g:2823:4: otherlv_5= 'WHERE' ( (lv_condition_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getArraySpecifierAccess().getWHEREKeyword_2_0());
                    			
                    // InternalJsonDsl.g:2827:4: ( (lv_condition_6_0= ruleExpression ) )
                    // InternalJsonDsl.g:2828:5: (lv_condition_6_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2828:5: (lv_condition_6_0= ruleExpression )
                    // InternalJsonDsl.g:2829:6: lv_condition_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getArraySpecifierAccess().getConditionExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArraySpecifierRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_6_0,
                    							"org.xtext.example.mydsl.JsonDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleConstant"
    // InternalJsonDsl.g:2851:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalJsonDsl.g:2851:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalJsonDsl.g:2852:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:2858:1: ruleConstant returns [EObject current=null] : ( ( () rulePrimitive ) | this_Array_2= ruleArray | this_Object_3= ruleObject ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_Array_2 = null;

        EObject this_Object_3 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2864:2: ( ( ( () rulePrimitive ) | this_Array_2= ruleArray | this_Object_3= ruleObject ) )
            // InternalJsonDsl.g:2865:2: ( ( () rulePrimitive ) | this_Array_2= ruleArray | this_Object_3= ruleObject )
            {
            // InternalJsonDsl.g:2865:2: ( ( () rulePrimitive ) | this_Array_2= ruleArray | this_Object_3= ruleObject )
            int alt36=3;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case RULE_STRING:
            case RULE_BOOL:
            case RULE_NULL:
                {
                alt36=1;
                }
                break;
            case 36:
                {
                alt36=2;
                }
                break;
            case 64:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalJsonDsl.g:2866:3: ( () rulePrimitive )
                    {
                    // InternalJsonDsl.g:2866:3: ( () rulePrimitive )
                    // InternalJsonDsl.g:2867:4: () rulePrimitive
                    {
                    // InternalJsonDsl.g:2867:4: ()
                    // InternalJsonDsl.g:2868:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getConstantAction_0_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getConstantAccess().getPrimitiveParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    rulePrimitive();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:2883:3: this_Array_2= ruleArray
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getArrayParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Array_2=ruleArray();

                    state._fsp--;


                    			current = this_Array_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:2892:3: this_Object_3= ruleObject
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getObjectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Object_3=ruleObject();

                    state._fsp--;


                    			current = this_Object_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:2904:1: entryRulePrimitive returns [String current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final String entryRulePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitive = null;


        try {
            // InternalJsonDsl.g:2904:49: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalJsonDsl.g:2905:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:2911:1: rulePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_NUMBER_1= RULE_NUMBER | this_BOOL_2= RULE_BOOL | this_NULL_3= RULE_NULL ) ;
    public final AntlrDatatypeRuleToken rulePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_NUMBER_1=null;
        Token this_BOOL_2=null;
        Token this_NULL_3=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:2917:2: ( (this_STRING_0= RULE_STRING | this_NUMBER_1= RULE_NUMBER | this_BOOL_2= RULE_BOOL | this_NULL_3= RULE_NULL ) )
            // InternalJsonDsl.g:2918:2: (this_STRING_0= RULE_STRING | this_NUMBER_1= RULE_NUMBER | this_BOOL_2= RULE_BOOL | this_NULL_3= RULE_NULL )
            {
            // InternalJsonDsl.g:2918:2: (this_STRING_0= RULE_STRING | this_NUMBER_1= RULE_NUMBER | this_BOOL_2= RULE_BOOL | this_NULL_3= RULE_NULL )
            int alt37=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt37=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt37=2;
                }
                break;
            case RULE_BOOL:
                {
                alt37=3;
                }
                break;
            case RULE_NULL:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalJsonDsl.g:2919:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getPrimitiveAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:2927:3: this_NUMBER_1= RULE_NUMBER
                    {
                    this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    			current.merge(this_NUMBER_1);
                    		

                    			newLeafNode(this_NUMBER_1, grammarAccess.getPrimitiveAccess().getNUMBERTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:2935:3: this_BOOL_2= RULE_BOOL
                    {
                    this_BOOL_2=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    			current.merge(this_BOOL_2);
                    		

                    			newLeafNode(this_BOOL_2, grammarAccess.getPrimitiveAccess().getBOOLTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalJsonDsl.g:2943:3: this_NULL_3= RULE_NULL
                    {
                    this_NULL_3=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    			current.merge(this_NULL_3);
                    		

                    			newLeafNode(this_NULL_3, grammarAccess.getPrimitiveAccess().getNULLTerminalRuleCall_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalJsonDsl.g:2954:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalJsonDsl.g:2954:46: (iv_ruleArray= ruleArray EOF )
            // InternalJsonDsl.g:2955:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:2961:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:2967:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) )
            // InternalJsonDsl.g:2968:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            {
            // InternalJsonDsl.g:2968:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            // InternalJsonDsl.g:2969:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']'
            {
            // InternalJsonDsl.g:2969:3: ()
            // InternalJsonDsl.g:2970:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayAccess().getArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJsonDsl.g:2980:3: ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_FIELD_NAME && LA39_0<=RULE_NULL)||LA39_0==27||(LA39_0>=31 && LA39_0<=32)||LA39_0==34||LA39_0==36||(LA39_0>=39 && LA39_0<=40)||LA39_0==42||(LA39_0>=44 && LA39_0<=47)||LA39_0==50||(LA39_0>=52 && LA39_0<=54)||(LA39_0>=56 && LA39_0<=58)||(LA39_0>=60 && LA39_0<=62)||LA39_0==64) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJsonDsl.g:2981:4: ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    {
                    // InternalJsonDsl.g:2981:4: ( (lv_values_2_0= ruleExpression ) )
                    // InternalJsonDsl.g:2982:5: (lv_values_2_0= ruleExpression )
                    {
                    // InternalJsonDsl.g:2982:5: (lv_values_2_0= ruleExpression )
                    // InternalJsonDsl.g:2983:6: lv_values_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getArrayAccess().getValuesExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_values_2_0=ruleExpression();

                    state._fsp--;


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

                    // InternalJsonDsl.g:3000:4: (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==37) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalJsonDsl.g:3001:5: otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJsonDsl.g:3005:5: ( (lv_values_4_0= ruleExpression ) )
                    	    // InternalJsonDsl.g:3006:6: (lv_values_4_0= ruleExpression )
                    	    {
                    	    // InternalJsonDsl.g:3006:6: (lv_values_4_0= ruleExpression )
                    	    // InternalJsonDsl.g:3007:7: lv_values_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayAccess().getValuesExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_values_4_0=ruleExpression();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleObject"
    // InternalJsonDsl.g:3034:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalJsonDsl.g:3034:47: (iv_ruleObject= ruleObject EOF )
            // InternalJsonDsl.g:3035:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalJsonDsl.g:3041:1: ruleObject returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fields_2_0 = null;

        EObject lv_fields_4_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:3047:2: ( ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' ) )
            // InternalJsonDsl.g:3048:2: ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' )
            {
            // InternalJsonDsl.g:3048:2: ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' )
            // InternalJsonDsl.g:3049:3: () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}'
            {
            // InternalJsonDsl.g:3049:3: ()
            // InternalJsonDsl.g:3050:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectAccess().getObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalJsonDsl.g:3060:3: ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_FIELD_NAME) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalJsonDsl.g:3061:4: ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )*
                    {
                    // InternalJsonDsl.g:3061:4: ( (lv_fields_2_0= ruleField ) )
                    // InternalJsonDsl.g:3062:5: (lv_fields_2_0= ruleField )
                    {
                    // InternalJsonDsl.g:3062:5: (lv_fields_2_0= ruleField )
                    // InternalJsonDsl.g:3063:6: lv_fields_2_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_fields_2_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_2_0,
                    							"org.xtext.example.mydsl.JsonDsl.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonDsl.g:3080:4: (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==37) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalJsonDsl.g:3081:5: otherlv_3= ',' ( (lv_fields_4_0= ruleField ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_15); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJsonDsl.g:3085:5: ( (lv_fields_4_0= ruleField ) )
                    	    // InternalJsonDsl.g:3086:6: (lv_fields_4_0= ruleField )
                    	    {
                    	    // InternalJsonDsl.g:3086:6: (lv_fields_4_0= ruleField )
                    	    // InternalJsonDsl.g:3087:7: lv_fields_4_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_fields_4_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectRule());
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
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,65,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleField"
    // InternalJsonDsl.g:3114:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalJsonDsl.g:3114:46: (iv_ruleField= ruleField EOF )
            // InternalJsonDsl.g:3115:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalJsonDsl.g:3121:1: ruleField returns [EObject current=null] : ( ( (lv_key_0_0= RULE_FIELD_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:3127:2: ( ( ( (lv_key_0_0= RULE_FIELD_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalJsonDsl.g:3128:2: ( ( (lv_key_0_0= RULE_FIELD_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalJsonDsl.g:3128:2: ( ( (lv_key_0_0= RULE_FIELD_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalJsonDsl.g:3129:3: ( (lv_key_0_0= RULE_FIELD_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalJsonDsl.g:3129:3: ( (lv_key_0_0= RULE_FIELD_NAME ) )
            // InternalJsonDsl.g:3130:4: (lv_key_0_0= RULE_FIELD_NAME )
            {
            // InternalJsonDsl.g:3130:4: (lv_key_0_0= RULE_FIELD_NAME )
            // InternalJsonDsl.g:3131:5: lv_key_0_0= RULE_FIELD_NAME
            {
            lv_key_0_0=(Token)match(input,RULE_FIELD_NAME,FOLLOW_35); 

            					newLeafNode(lv_key_0_0, grammarAccess.getFieldAccess().getKeyFIELD_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.xtext.example.mydsl.JsonDsl.FIELD_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,66,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
            		
            // InternalJsonDsl.g:3151:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalJsonDsl.g:3152:4: (lv_value_2_0= ruleExpression )
            {
            // InternalJsonDsl.g:3152:4: (lv_value_2_0= ruleExpression )
            // InternalJsonDsl.g:3153:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;


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


            	leaveRule();

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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\20\2\uffff\1\4\1\6\1\uffff\1\20\1\45\1\6\1\20\1\45";
    static final String dfa_3s = "\1\100\1\44\2\uffff\1\4\1\6\1\uffff\1\44\1\46\1\6\1\44\1\46";
    static final String dfa_4s = "\2\uffff\1\2\1\3\2\uffff\1\1\5\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\1\4\2\21\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\1\2\1\3\4\2\2\uffff\1\2\1\uffff\3\2\1\uffff\3\2\1\uffff\3\2\1\uffff\1\2",
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x7774FD95880003F2L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x7774F595880003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002002000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x8002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x7774F5D5880003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});

}