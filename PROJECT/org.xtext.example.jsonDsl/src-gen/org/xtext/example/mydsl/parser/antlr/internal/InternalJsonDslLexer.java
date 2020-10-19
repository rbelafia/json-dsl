package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonDslLexer extends Lexer {
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

    public InternalJsonDslLexer() {;} 
    public InternalJsonDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJsonDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalJsonDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:11:7: ( ';' )
            // InternalJsonDsl.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:12:7: ( '=' )
            // InternalJsonDsl.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:13:7: ( 'OR' )
            // InternalJsonDsl.g:13:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:14:7: ( 'AND' )
            // InternalJsonDsl.g:14:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:15:7: ( '==' )
            // InternalJsonDsl.g:15:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:16:7: ( '!=' )
            // InternalJsonDsl.g:16:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:17:7: ( '>' )
            // InternalJsonDsl.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:18:7: ( '>=' )
            // InternalJsonDsl.g:18:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:19:7: ( '<' )
            // InternalJsonDsl.g:19:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:20:7: ( '<=' )
            // InternalJsonDsl.g:20:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:21:7: ( '+' )
            // InternalJsonDsl.g:21:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:22:7: ( '-' )
            // InternalJsonDsl.g:22:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:23:7: ( '*' )
            // InternalJsonDsl.g:23:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:24:7: ( '/' )
            // InternalJsonDsl.g:24:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:25:7: ( '%' )
            // InternalJsonDsl.g:25:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:26:7: ( '!' )
            // InternalJsonDsl.g:26:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:27:7: ( '(' )
            // InternalJsonDsl.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:28:7: ( ')' )
            // InternalJsonDsl.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:29:7: ( '?' )
            // InternalJsonDsl.g:29:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:30:7: ( '~' )
            // InternalJsonDsl.g:30:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:31:7: ( '[' )
            // InternalJsonDsl.g:31:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:32:7: ( ',' )
            // InternalJsonDsl.g:32:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:33:7: ( ']' )
            // InternalJsonDsl.g:33:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:34:7: ( 'LOAD' )
            // InternalJsonDsl.g:34:9: 'LOAD'
            {
            match("LOAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:35:7: ( 'STORE' )
            // InternalJsonDsl.g:35:9: 'STORE'
            {
            match("STORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:36:7: ( 'IN' )
            // InternalJsonDsl.g:36:9: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:37:7: ( 'EXPORT_CSV' )
            // InternalJsonDsl.g:37:9: 'EXPORT_CSV'
            {
            match("EXPORT_CSV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:38:7: ( 'PRINT' )
            // InternalJsonDsl.g:38:9: 'PRINT'
            {
            match("PRINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:39:7: ( 'GET_DEPTH' )
            // InternalJsonDsl.g:39:9: 'GET_DEPTH'
            {
            match("GET_DEPTH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:40:7: ( 'GET_INFOS' )
            // InternalJsonDsl.g:40:9: 'GET_INFOS'
            {
            match("GET_INFOS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:41:7: ( 'IS' )
            // InternalJsonDsl.g:41:9: 'IS'
            {
            match("IS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:42:7: ( 'SELECT' )
            // InternalJsonDsl.g:42:9: 'SELECT'
            {
            match("SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:43:7: ( 'FROM' )
            // InternalJsonDsl.g:43:9: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:44:7: ( 'WHERE' )
            // InternalJsonDsl.g:44:9: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:45:7: ( 'CONCAT' )
            // InternalJsonDsl.g:45:9: 'CONCAT'
            {
            match("CONCAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:46:7: ( 'SUM' )
            // InternalJsonDsl.g:46:9: 'SUM'
            {
            match("SUM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:47:7: ( 'ON' )
            // InternalJsonDsl.g:47:9: 'ON'
            {
            match("ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:48:7: ( 'PRODUCT' )
            // InternalJsonDsl.g:48:9: 'PRODUCT'
            {
            match("PRODUCT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:49:7: ( 'MEAN' )
            // InternalJsonDsl.g:49:9: 'MEAN'
            {
            match("MEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:50:7: ( 'ADD' )
            // InternalJsonDsl.g:50:9: 'ADD'
            {
            match("ADD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:51:7: ( 'INSERT' )
            // InternalJsonDsl.g:51:9: 'INSERT'
            {
            match("INSERT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:52:7: ( 'RENAME' )
            // InternalJsonDsl.g:52:9: 'RENAME'
            {
            match("RENAME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:53:7: ( 'TO' )
            // InternalJsonDsl.g:53:9: 'TO'
            {
            match("TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:54:7: ( 'DELETE' )
            // InternalJsonDsl.g:54:9: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:55:7: ( 'REMOVE' )
            // InternalJsonDsl.g:55:9: 'REMOVE'
            {
            match("REMOVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:56:7: ( '{' )
            // InternalJsonDsl.g:56:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:57:7: ( '}' )
            // InternalJsonDsl.g:57:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:58:7: ( ':' )
            // InternalJsonDsl.g:58:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:3875:11: ( 'null' )
            // InternalJsonDsl.g:3875:13: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:3877:11: ( ( 'true' | 'false' ) )
            // InternalJsonDsl.g:3877:13: ( 'true' | 'false' )
            {
            // InternalJsonDsl.g:3877:13: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalJsonDsl.g:3877:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:3877:21: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:3879:13: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* 'e' ( '0' .. '9' )+ )
            // InternalJsonDsl.g:3879:15: ( '0' .. '9' )+ '.' ( '0' .. '9' )* 'e' ( '0' .. '9' )+
            {
            // InternalJsonDsl.g:3879:15: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJsonDsl.g:3879:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('.'); 
            // InternalJsonDsl.g:3879:31: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJsonDsl.g:3879:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('e'); 
            // InternalJsonDsl.g:3879:47: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJsonDsl.g:3879:48: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:3881:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalJsonDsl.g:3881:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalJsonDsl.g:3881:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJsonDsl.g:3881:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalJsonDsl.g:3881:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJsonDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:3883:10: ( ( '0' .. '9' )+ )
            // InternalJsonDsl.g:3883:12: ( '0' .. '9' )+
            {
            // InternalJsonDsl.g:3883:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJsonDsl.g:3883:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:3885:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJsonDsl.g:3885:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJsonDsl.g:3885:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalJsonDsl.g:3885:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJsonDsl.g:3885:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalJsonDsl.g:3885:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJsonDsl.g:3885:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:3885:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJsonDsl.g:3885:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalJsonDsl.g:3885:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJsonDsl.g:3885:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:3887:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJsonDsl.g:3887:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJsonDsl.g:3887:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJsonDsl.g:3887:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:3889:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJsonDsl.g:3889:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJsonDsl.g:3889:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJsonDsl.g:3889:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalJsonDsl.g:3889:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJsonDsl.g:3889:41: ( '\\r' )? '\\n'
                    {
                    // InternalJsonDsl.g:3889:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalJsonDsl.g:3889:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:3891:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJsonDsl.g:3891:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJsonDsl.g:3891:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJsonDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJsonDsl.g:3893:16: ( . )
            // InternalJsonDsl.g:3893:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalJsonDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_NULL | RULE_BOOL | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=58;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalJsonDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalJsonDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalJsonDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalJsonDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalJsonDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalJsonDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalJsonDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalJsonDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalJsonDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalJsonDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalJsonDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalJsonDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalJsonDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalJsonDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalJsonDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalJsonDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalJsonDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalJsonDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalJsonDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalJsonDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalJsonDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalJsonDsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalJsonDsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalJsonDsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalJsonDsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalJsonDsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalJsonDsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalJsonDsl.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalJsonDsl.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalJsonDsl.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalJsonDsl.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalJsonDsl.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalJsonDsl.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalJsonDsl.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalJsonDsl.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalJsonDsl.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalJsonDsl.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalJsonDsl.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalJsonDsl.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalJsonDsl.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalJsonDsl.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalJsonDsl.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalJsonDsl.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalJsonDsl.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalJsonDsl.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalJsonDsl.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalJsonDsl.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalJsonDsl.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalJsonDsl.g:1:298: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 50 :
                // InternalJsonDsl.g:1:308: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 51 :
                // InternalJsonDsl.g:1:318: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 52 :
                // InternalJsonDsl.g:1:330: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 53 :
                // InternalJsonDsl.g:1:338: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 54 :
                // InternalJsonDsl.g:1:347: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 55 :
                // InternalJsonDsl.g:1:359: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 56 :
                // InternalJsonDsl.g:1:375: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 57 :
                // InternalJsonDsl.g:1:391: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 58 :
                // InternalJsonDsl.g:1:399: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\2\uffff\1\60\2\63\1\67\1\71\1\73\3\uffff\1\101\10\uffff\15\63\3\uffff\3\63\1\142\1\55\1\uffff\2\55\5\uffff\1\145\1\146\1\uffff\2\63\24\uffff\4\63\1\156\1\157\10\63\1\172\1\63\3\uffff\3\63\1\uffff\1\142\5\uffff\1\177\1\u0080\3\63\1\u0084\1\63\2\uffff\12\63\1\uffff\4\63\2\uffff\1\u0094\2\63\1\uffff\5\63\1\u009d\2\63\1\u00a0\3\63\1\u00a4\1\u00a5\1\63\1\uffff\1\u00a7\3\63\1\u00ab\3\63\1\uffff\1\u00af\1\63\1\uffff\3\63\2\uffff\1\u00a5\1\uffff\1\u00b4\1\u00b5\1\63\1\uffff\3\63\1\uffff\1\u00ba\1\u00bb\1\u00bc\1\u00bd\2\uffff\1\63\1\u00bf\2\63\4\uffff\1\63\1\uffff\3\63\1\u00c6\1\u00c7\1\u00c8\3\uffff";
    static final String DFA16_eofS =
        "\u00c9\uffff";
    static final String DFA16_minS =
        "\1\0\1\uffff\1\75\1\116\1\104\3\75\3\uffff\1\52\10\uffff\1\117\1\105\1\116\1\130\1\122\1\105\1\122\1\110\1\117\2\105\1\117\1\105\3\uffff\1\165\1\162\1\141\1\56\1\101\1\uffff\2\0\5\uffff\2\60\1\uffff\2\104\24\uffff\1\101\1\117\1\114\1\115\2\60\1\120\1\111\1\124\1\117\1\105\1\116\1\101\1\115\1\60\1\114\3\uffff\1\154\1\165\1\154\1\uffff\1\56\5\uffff\2\60\1\104\1\122\1\105\1\60\1\105\2\uffff\1\117\1\116\1\104\1\137\1\115\1\122\1\103\1\116\1\101\1\117\1\uffff\1\105\1\154\1\145\1\163\2\uffff\1\60\1\105\1\103\1\uffff\2\122\1\124\1\125\1\104\1\60\1\105\1\101\1\60\1\115\1\126\1\124\2\60\1\145\1\uffff\1\60\3\124\1\60\1\103\1\105\1\116\1\uffff\1\60\1\124\1\uffff\3\105\2\uffff\1\60\1\uffff\2\60\1\137\1\uffff\1\124\1\120\1\106\1\uffff\4\60\2\uffff\1\103\1\60\1\124\1\117\4\uffff\1\123\1\uffff\1\110\1\123\1\126\3\60\3\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\uffff\1\75\1\122\1\116\3\75\3\uffff\1\57\10\uffff\1\117\1\125\1\123\1\130\1\122\1\105\1\122\1\110\1\117\2\105\1\117\1\105\3\uffff\1\165\1\162\1\141\1\71\1\172\1\uffff\2\uffff\5\uffff\2\172\1\uffff\2\104\24\uffff\1\101\1\117\1\114\1\115\2\172\1\120\1\117\1\124\1\117\1\105\1\116\1\101\1\116\1\172\1\114\3\uffff\1\154\1\165\1\154\1\uffff\1\71\5\uffff\2\172\1\104\1\122\1\105\1\172\1\105\2\uffff\1\117\1\116\1\104\1\137\1\115\1\122\1\103\1\116\1\101\1\117\1\uffff\1\105\1\154\1\145\1\163\2\uffff\1\172\1\105\1\103\1\uffff\2\122\1\124\1\125\1\111\1\172\1\105\1\101\1\172\1\115\1\126\1\124\2\172\1\145\1\uffff\1\172\3\124\1\172\1\103\1\105\1\116\1\uffff\1\172\1\124\1\uffff\3\105\2\uffff\1\172\1\uffff\2\172\1\137\1\uffff\1\124\1\120\1\106\1\uffff\4\172\2\uffff\1\103\1\172\1\124\1\117\4\uffff\1\123\1\uffff\1\110\1\123\1\126\3\172\3\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\6\uffff\1\13\1\14\1\15\1\uffff\1\17\1\21\1\22\1\23\1\24\1\25\1\26\1\27\15\uffff\1\56\1\57\1\60\5\uffff\1\64\2\uffff\1\71\1\72\1\1\1\5\1\2\2\uffff\1\64\2\uffff\1\6\1\20\1\10\1\7\1\12\1\11\1\13\1\14\1\15\1\67\1\70\1\16\1\17\1\21\1\22\1\23\1\24\1\25\1\26\1\27\20\uffff\1\56\1\57\1\60\3\uffff\1\63\1\uffff\1\65\1\66\1\71\1\3\1\45\7\uffff\1\32\1\37\12\uffff\1\53\4\uffff\1\4\1\50\3\uffff\1\44\17\uffff\1\30\10\uffff\1\41\2\uffff\1\47\3\uffff\1\61\1\62\1\uffff\1\31\3\uffff\1\34\3\uffff\1\42\4\uffff\1\40\1\51\4\uffff\1\43\1\52\1\55\1\54\1\uffff\1\46\6\uffff\1\35\1\36\1\33";
    static final String DFA16_specialS =
        "\1\2\51\uffff\1\0\1\1\u009d\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\55\2\54\2\55\1\54\22\55\1\54\1\5\1\52\2\55\1\14\1\55\1\53\1\15\1\16\1\12\1\10\1\22\1\11\1\55\1\13\12\47\1\43\1\1\1\7\1\2\1\6\1\17\1\55\1\4\1\51\1\34\1\40\1\27\1\32\1\31\1\51\1\26\2\51\1\24\1\35\1\51\1\3\1\30\1\51\1\36\1\25\1\37\2\51\1\33\3\51\1\21\1\55\1\23\1\50\1\51\1\55\5\51\1\46\7\51\1\44\5\51\1\45\6\51\1\41\1\55\1\42\1\20\uff81\55",
            "",
            "\1\57",
            "\1\62\3\uffff\1\61",
            "\1\65\11\uffff\1\64",
            "\1\66",
            "\1\70",
            "\1\72",
            "",
            "",
            "",
            "\1\77\4\uffff\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\114\16\uffff\1\113\1\115",
            "\1\116\4\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140\1\uffff\12\141",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\0\143",
            "\0\143",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\147",
            "\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\63\7\uffff\22\63\1\155\7\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\160",
            "\1\161\5\uffff\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\171\1\170",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\173",
            "",
            "",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\140\1\uffff\12\141",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0085",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b\4\uffff\1\u009c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u009e",
            "\1\u009f",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a6",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u00be",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "",
            "",
            "",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_NULL | RULE_BOOL | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_42 = input.LA(1);

                        s = -1;
                        if ( ((LA16_42>='\u0000' && LA16_42<='\uFFFF')) ) {s = 99;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_43 = input.LA(1);

                        s = -1;
                        if ( ((LA16_43>='\u0000' && LA16_43<='\uFFFF')) ) {s = 99;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0==';') ) {s = 1;}

                        else if ( (LA16_0=='=') ) {s = 2;}

                        else if ( (LA16_0=='O') ) {s = 3;}

                        else if ( (LA16_0=='A') ) {s = 4;}

                        else if ( (LA16_0=='!') ) {s = 5;}

                        else if ( (LA16_0=='>') ) {s = 6;}

                        else if ( (LA16_0=='<') ) {s = 7;}

                        else if ( (LA16_0=='+') ) {s = 8;}

                        else if ( (LA16_0=='-') ) {s = 9;}

                        else if ( (LA16_0=='*') ) {s = 10;}

                        else if ( (LA16_0=='/') ) {s = 11;}

                        else if ( (LA16_0=='%') ) {s = 12;}

                        else if ( (LA16_0=='(') ) {s = 13;}

                        else if ( (LA16_0==')') ) {s = 14;}

                        else if ( (LA16_0=='?') ) {s = 15;}

                        else if ( (LA16_0=='~') ) {s = 16;}

                        else if ( (LA16_0=='[') ) {s = 17;}

                        else if ( (LA16_0==',') ) {s = 18;}

                        else if ( (LA16_0==']') ) {s = 19;}

                        else if ( (LA16_0=='L') ) {s = 20;}

                        else if ( (LA16_0=='S') ) {s = 21;}

                        else if ( (LA16_0=='I') ) {s = 22;}

                        else if ( (LA16_0=='E') ) {s = 23;}

                        else if ( (LA16_0=='P') ) {s = 24;}

                        else if ( (LA16_0=='G') ) {s = 25;}

                        else if ( (LA16_0=='F') ) {s = 26;}

                        else if ( (LA16_0=='W') ) {s = 27;}

                        else if ( (LA16_0=='C') ) {s = 28;}

                        else if ( (LA16_0=='M') ) {s = 29;}

                        else if ( (LA16_0=='R') ) {s = 30;}

                        else if ( (LA16_0=='T') ) {s = 31;}

                        else if ( (LA16_0=='D') ) {s = 32;}

                        else if ( (LA16_0=='{') ) {s = 33;}

                        else if ( (LA16_0=='}') ) {s = 34;}

                        else if ( (LA16_0==':') ) {s = 35;}

                        else if ( (LA16_0=='n') ) {s = 36;}

                        else if ( (LA16_0=='t') ) {s = 37;}

                        else if ( (LA16_0=='f') ) {s = 38;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 39;}

                        else if ( (LA16_0=='^') ) {s = 40;}

                        else if ( (LA16_0=='B'||LA16_0=='H'||(LA16_0>='J' && LA16_0<='K')||LA16_0=='N'||LA16_0=='Q'||(LA16_0>='U' && LA16_0<='V')||(LA16_0>='X' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='e')||(LA16_0>='g' && LA16_0<='m')||(LA16_0>='o' && LA16_0<='s')||(LA16_0>='u' && LA16_0<='z')) ) {s = 41;}

                        else if ( (LA16_0=='\"') ) {s = 42;}

                        else if ( (LA16_0=='\'') ) {s = 43;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 44;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='$')||LA16_0=='&'||LA16_0=='.'||LA16_0=='@'||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='\u007F' && LA16_0<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}