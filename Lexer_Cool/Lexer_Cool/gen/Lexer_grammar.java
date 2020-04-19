// Generated from E:/Beshoy/College/Compiler/Lexer_Cool/src\Lexer_grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexer_grammar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, EQUALS=19, LBRACE=20, RBRACE=21, 
		DOT=22, DARROW=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, 
		IN=30, INHERITS=31, LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, 
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, WHITESPACE=43, EOF_STRING=44, 
		SINGLE_BACKSLASH=45, SL_COMMENT=46, ML_COMMENT=47, E_COMMENT=48, OTHER=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COMMA", "PLUS", "MINUS", 
			"STAR", "SLASH", "TILDE", "LT", "LE", "EQUALS", "LBRACE", "RBRACE", "DOT", 
			"ASSIGN", "ATSYM", "COLON", "CASE", "ESAC", "IF", "FI", "WHILE", "THEN", 
			"ELSE", "LOOP", "POOL", "CLASS", "IN", "INHERITS", "OF", "LET", "NEW", 
			"ISVOID", "NOT", "DIGIT", "LLETTER", "ULETTER", "LETTER", "TRUE", "FALSE", 
			"BOOL_CONST", "INT_CONST", "TYPEID", "OBJECTID", "WHITESPACE", "EOF_STRING", 
			"SINGLE_BACKSLASH", "STR_CONST", "SL_COMMENT", "ML_COMMENT", "E_COMMENT", 
			"OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
			"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
			"'}'", "'.'", "'=>'", "'<='", "'<-'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
			"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
			"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", 
			"DARROW", "LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", 
			"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", 
			"ISVOID", "NOT", "WHITESPACE", "EOF_STRING", "SINGLE_BACKSLASH", "SL_COMMENT", 
			"ML_COMMENT", "E_COMMENT", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


		/*
			YOU CAN ADD YOUR MEMBER VARIABLES AND METHODS HERE
		*/
		/**
		* Function to report errors.
		* Use this function whenever your lexer encounters any erroneous input
		* DO NOT EDIT THIS FUNCTION
		*/
		public void reportError(String errorString){
			setText(errorString);
			setType(ERROR);
		}

		public void unmatched(){
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();
			reportError(text);
		}

	        public void comment() {
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();

			text = text.substring(2, text.length() - 2);
			int itr = 0, i = 0;
	                while( itr < text.length())
			{
				if(text.charAt(itr) == '(' && text.charAt(itr + 1) == '*') { i++; itr += 2;}
	                        else if(text.charAt(itr) == '*' && text.charAt(itr + 1) == ')') { i--; itr += 2;}
				else { itr++;}
			}
	                if( i == 1) reportError("EOF in comment");
		}

		public void processString() {
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();
			//write your code to test strings here
	                text = text.substring(1, text.length() -1);
	                String newString  = "";
			if(text.length() > 1024)
	                {
	                	reportError("String constant too long");
			}
			else
			{
				int itr = 0;
				while(itr < text.length())
				{
					if(text.charAt(itr) == '\n')
	                                {
						reportError("Unterminated string constant");
					}
					else if(text.charAt(itr) == '\0')
					{
						 reportError("String contains null character");
					}
					else if(text.charAt(itr) == '\\')
					{
	                                        char next = text.charAt(itr + 1);
	                                        switch(next) {
						case 'n':
							newString = newString.concat("\n");
							break;
						case '\n':
							newString = newString.concat("\n");
							break;
						case '0':
							newString = newString.concat("0");
							break;
						case 'b':
							newString = newString.concat("\b");
							break;
						case 'f':
							newString = newString.concat("\f");
							break;
						case 't':
							newString = newString.concat("\t");
							break;
						default :
							newString = newString.concat(String.valueOf(text.charAt(itr +1)));
							break;
	 					}
						itr += 2;
						continue;
					}
					else
					{
						 newString = newString.concat(String.valueOf(text.charAt(itr)));
					}
					itr += 1;
				}
				setText(newString);
			}
		}


	public Lexer_grammar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexer_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 47:
			EOF_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			SINGLE_BACKSLASH_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			STR_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			E_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			OTHER_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void EOF_STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			reportError("EOF found in string");
			break;
		}
	}
	private void SINGLE_BACKSLASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			reportError("single Backslash found in string");
			break;
		}
	}
	private void STR_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			processString();
			break;
		}
	}
	private void E_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			reportError("UnMatched comment identifier.");
			break;
		}
	}
	private void OTHER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			unmatched();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u015f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,"+
		"\3,\5,\u00ff\n,\3-\6-\u0102\n-\r-\16-\u0103\3.\3.\3.\3.\7.\u010a\n.\f"+
		".\16.\u010d\13.\3/\3/\3/\3/\7/\u0113\n/\f/\16/\u0116\13/\3\60\6\60\u0119"+
		"\n\60\r\60\16\60\u011a\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0123\n\61\f"+
		"\61\16\61\u0126\13\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\7\63\u0134\n\63\f\63\16\63\u0137\13\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\7\64\u0140\n\64\f\64\16\64\u0143\13\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\7\65\u014e\n\65\f\65\16\65\u0151\13\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\4\u0141"+
		"\u014f\28\3\r\5\31\7\t\t\n\13\16\r\17\17\20\21\21\23\22\25\23\27\24\31"+
		"\32\33\25\35\26\37\27!\30#\33%\f\'\13)\'+(-\37/\36\61&\63%\65\35\67#9"+
		"$;\34= ?!A)C\"E*G+I,K\2M\2O\2Q\2S\2U\2W\6Y\7[\4]\5_-a.c/e\bg\60i\61k\62"+
		"m\63\3\2\30\4\2EEee\4\2CCcc\4\2UUuu\4\2GGgg\4\2KKkk\4\2HHhh\4\2YYyy\4"+
		"\2JJjj\4\2NNnn\4\2VVvv\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2XXxx\4\2FFf"+
		"f\4\2C\\c|\4\2WWww\5\2\13\f\16\17\"\"\4\2$$^^\4\2\f\f$$\4\2\f\f\17\17"+
		"\2\u016a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_"+
		"\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2"+
		"\2\2\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7t\3\2\2\2\tv\3\2\2\2\13x\3\2\2"+
		"\2\rz\3\2\2\2\17|\3\2\2\2\21~\3\2\2\2\23\u0080\3\2\2\2\25\u0082\3\2\2"+
		"\2\27\u0084\3\2\2\2\31\u0086\3\2\2\2\33\u0089\3\2\2\2\35\u008b\3\2\2\2"+
		"\37\u008d\3\2\2\2!\u008f\3\2\2\2#\u0091\3\2\2\2%\u0094\3\2\2\2\'\u0096"+
		"\3\2\2\2)\u0098\3\2\2\2+\u009d\3\2\2\2-\u00a2\3\2\2\2/\u00a5\3\2\2\2\61"+
		"\u00a8\3\2\2\2\63\u00ae\3\2\2\2\65\u00b3\3\2\2\2\67\u00b8\3\2\2\29\u00bd"+
		"\3\2\2\2;\u00c2\3\2\2\2=\u00c8\3\2\2\2?\u00cb\3\2\2\2A\u00d3\3\2\2\2C"+
		"\u00d6\3\2\2\2E\u00da\3\2\2\2G\u00de\3\2\2\2I\u00e5\3\2\2\2K\u00e9\3\2"+
		"\2\2M\u00eb\3\2\2\2O\u00ed\3\2\2\2Q\u00ef\3\2\2\2S\u00f1\3\2\2\2U\u00f6"+
		"\3\2\2\2W\u00fe\3\2\2\2Y\u0101\3\2\2\2[\u0105\3\2\2\2]\u010e\3\2\2\2_"+
		"\u0118\3\2\2\2a\u011e\3\2\2\2c\u012a\3\2\2\2e\u012f\3\2\2\2g\u013b\3\2"+
		"\2\2i\u0148\3\2\2\2k\u0157\3\2\2\2m\u015c\3\2\2\2op\7=\2\2p\4\3\2\2\2"+
		"qr\7?\2\2rs\7@\2\2s\6\3\2\2\2tu\7*\2\2u\b\3\2\2\2vw\7+\2\2w\n\3\2\2\2"+
		"xy\7.\2\2y\f\3\2\2\2z{\7-\2\2{\16\3\2\2\2|}\7/\2\2}\20\3\2\2\2~\177\7"+
		",\2\2\177\22\3\2\2\2\u0080\u0081\7\61\2\2\u0081\24\3\2\2\2\u0082\u0083"+
		"\7\u0080\2\2\u0083\26\3\2\2\2\u0084\u0085\7>\2\2\u0085\30\3\2\2\2\u0086"+
		"\u0087\7>\2\2\u0087\u0088\7?\2\2\u0088\32\3\2\2\2\u0089\u008a\7?\2\2\u008a"+
		"\34\3\2\2\2\u008b\u008c\7}\2\2\u008c\36\3\2\2\2\u008d\u008e\7\177\2\2"+
		"\u008e \3\2\2\2\u008f\u0090\7\60\2\2\u0090\"\3\2\2\2\u0091\u0092\7>\2"+
		"\2\u0092\u0093\7/\2\2\u0093$\3\2\2\2\u0094\u0095\7B\2\2\u0095&\3\2\2\2"+
		"\u0096\u0097\7<\2\2\u0097(\3\2\2\2\u0098\u0099\t\2\2\2\u0099\u009a\t\3"+
		"\2\2\u009a\u009b\t\4\2\2\u009b\u009c\t\5\2\2\u009c*\3\2\2\2\u009d\u009e"+
		"\t\5\2\2\u009e\u009f\t\4\2\2\u009f\u00a0\t\3\2\2\u00a0\u00a1\t\2\2\2\u00a1"+
		",\3\2\2\2\u00a2\u00a3\t\6\2\2\u00a3\u00a4\t\7\2\2\u00a4.\3\2\2\2\u00a5"+
		"\u00a6\t\7\2\2\u00a6\u00a7\t\6\2\2\u00a7\60\3\2\2\2\u00a8\u00a9\t\b\2"+
		"\2\u00a9\u00aa\t\t\2\2\u00aa\u00ab\t\6\2\2\u00ab\u00ac\t\n\2\2\u00ac\u00ad"+
		"\t\5\2\2\u00ad\62\3\2\2\2\u00ae\u00af\t\13\2\2\u00af\u00b0\t\t\2\2\u00b0"+
		"\u00b1\t\5\2\2\u00b1\u00b2\t\f\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\t\5\2"+
		"\2\u00b4\u00b5\t\n\2\2\u00b5\u00b6\t\4\2\2\u00b6\u00b7\t\5\2\2\u00b7\66"+
		"\3\2\2\2\u00b8\u00b9\t\n\2\2\u00b9\u00ba\t\r\2\2\u00ba\u00bb\t\r\2\2\u00bb"+
		"\u00bc\t\16\2\2\u00bc8\3\2\2\2\u00bd\u00be\t\16\2\2\u00be\u00bf\t\r\2"+
		"\2\u00bf\u00c0\t\r\2\2\u00c0\u00c1\t\n\2\2\u00c1:\3\2\2\2\u00c2\u00c3"+
		"\t\2\2\2\u00c3\u00c4\t\n\2\2\u00c4\u00c5\t\3\2\2\u00c5\u00c6\t\4\2\2\u00c6"+
		"\u00c7\t\4\2\2\u00c7<\3\2\2\2\u00c8\u00c9\t\6\2\2\u00c9\u00ca\t\f\2\2"+
		"\u00ca>\3\2\2\2\u00cb\u00cc\t\6\2\2\u00cc\u00cd\t\t\2\2\u00cd\u00ce\t"+
		"\5\2\2\u00ce\u00cf\t\17\2\2\u00cf\u00d0\t\6\2\2\u00d0\u00d1\t\13\2\2\u00d1"+
		"\u00d2\t\4\2\2\u00d2@\3\2\2\2\u00d3\u00d4\t\r\2\2\u00d4\u00d5\t\7\2\2"+
		"\u00d5B\3\2\2\2\u00d6\u00d7\t\n\2\2\u00d7\u00d8\t\5\2\2\u00d8\u00d9\t"+
		"\13\2\2\u00d9D\3\2\2\2\u00da\u00db\t\f\2\2\u00db\u00dc\t\5\2\2\u00dc\u00dd"+
		"\t\b\2\2\u00ddF\3\2\2\2\u00de\u00df\t\6\2\2\u00df\u00e0\t\4\2\2\u00e0"+
		"\u00e1\t\20\2\2\u00e1\u00e2\t\r\2\2\u00e2\u00e3\t\6\2\2\u00e3\u00e4\t"+
		"\21\2\2\u00e4H\3\2\2\2\u00e5\u00e6\t\f\2\2\u00e6\u00e7\t\r\2\2\u00e7\u00e8"+
		"\t\13\2\2\u00e8J\3\2\2\2\u00e9\u00ea\4\62;\2\u00eaL\3\2\2\2\u00eb\u00ec"+
		"\4c|\2\u00ecN\3\2\2\2\u00ed\u00ee\4C\\\2\u00eeP\3\2\2\2\u00ef\u00f0\t"+
		"\22\2\2\u00f0R\3\2\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\t\17\2\2\u00f3\u00f4"+
		"\t\23\2\2\u00f4\u00f5\t\5\2\2\u00f5T\3\2\2\2\u00f6\u00f7\7h\2\2\u00f7"+
		"\u00f8\t\3\2\2\u00f8\u00f9\t\n\2\2\u00f9\u00fa\t\4\2\2\u00fa\u00fb\t\5"+
		"\2\2\u00fbV\3\2\2\2\u00fc\u00ff\5S*\2\u00fd\u00ff\5U+\2\u00fe\u00fc\3"+
		"\2\2\2\u00fe\u00fd\3\2\2\2\u00ffX\3\2\2\2\u0100\u0102\5K&\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"Z\3\2\2\2\u0105\u010b\5O(\2\u0106\u010a\7a\2\2\u0107\u010a\5Q)\2\u0108"+
		"\u010a\5K&\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2"+
		"\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\\"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0114\5M\'\2\u010f\u0113\7a\2\2\u0110"+
		"\u0113\5Q)\2\u0111\u0113\5K&\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2"+
		"\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115^\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\t\24\2\2\u0118"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b\60\2\2\u011d`\3\2\2\2\u011e\u0124"+
		"\7$\2\2\u011f\u0123\7^\2\2\u0120\u0123\5_\60\2\u0121\u0123\n\25\2\2\u0122"+
		"\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127\u0128\7\2\2\3\u0128\u0129\b\61\3\2\u0129b\3\2\2\2"+
		"\u012a\u012b\7$\2\2\u012b\u012c\7^\2\2\u012c\u012d\7$\2\2\u012d\u012e"+
		"\b\62\4\2\u012ed\3\2\2\2\u012f\u0135\7$\2\2\u0130\u0134\7^\2\2\u0131\u0134"+
		"\n\26\2\2\u0132\u0134\5_\60\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2"+
		"\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7$\2\2\u0139"+
		"\u013a\b\63\5\2\u013af\3\2\2\2\u013b\u013c\7/\2\2\u013c\u013d\7/\2\2\u013d"+
		"\u0141\3\2\2\2\u013e\u0140\13\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3"+
		"\2\2\2\u0141\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0145\t\27\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b"+
		"\64\2\2\u0147h\3\2\2\2\u0148\u0149\7*\2\2\u0149\u014a\7,\2\2\u014a\u014f"+
		"\3\2\2\2\u014b\u014e\5i\65\2\u014c\u014e\13\2\2\2\u014d\u014b\3\2\2\2"+
		"\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7,\2\2\u0153"+
		"\u0154\7+\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b\65\2\2\u0156j\3\2\2\2"+
		"\u0157\u0158\7,\2\2\u0158\u0159\7+\2\2\u0159\u015a\3\2\2\2\u015a\u015b"+
		"\b\66\6\2\u015bl\3\2\2\2\u015c\u015d\13\2\2\2\u015d\u015e\b\67\7\2\u015e"+
		"n\3\2\2\2\21\2\u00fe\u0103\u0109\u010b\u0112\u0114\u011a\u0122\u0124\u0133"+
		"\u0135\u0141\u014d\u014f\b\b\2\2\3\61\2\3\62\3\3\63\4\3\66\5\3\67\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}