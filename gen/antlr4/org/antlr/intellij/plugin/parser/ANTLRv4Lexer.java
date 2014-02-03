// Generated from ANTLRv4Lexer.g4 by ANTLR 4.2-SNAPSHOT
package org.antlr.intellij.plugin.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLRv4Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN_REF=1, RULE_REF=2, LEXER_CHAR_SET=3, DOC_COMMENT=4, BLOCK_COMMENT=5, 
		LINE_COMMENT=6, DOUBLE_QUOTE_STRING_LITERAL=7, BEGIN_ARG_ACTION=8, OPTIONS=9, 
		TOKENS=10, IMPORT=11, FRAGMENT=12, LEXER=13, PARSER=14, GRAMMAR=15, PROTECTED=16, 
		PUBLIC=17, PRIVATE=18, RETURNS=19, LOCALS=20, THROWS=21, CATCH=22, FINALLY=23, 
		MODE=24, COLON=25, COLONCOLON=26, COMMA=27, SEMI=28, LPAREN=29, RPAREN=30, 
		RARROW=31, LT=32, GT=33, ASSIGN=34, QUESTION=35, STAR=36, PLUS=37, PLUS_ASSIGN=38, 
		OR=39, DOLLAR=40, DOT=41, RANGE=42, AT=43, POUND=44, NOT=45, RBRACE=46, 
		ID=47, INT=48, STRING_LITERAL=49, WS=50, ARG_ACTION=51, UNTERMINATED_ARG_ACTION=52, 
		ACTION=53, UNTERMINATED_ACTION=54, UNTERMINATED_CHAR_SET=55, BEGIN_ACTION=56;
	public static final int ArgAction = 1;
	public static final int Action = 2;
	public static final int LexerCharSet = 3;
	public static String[] modeNames = {
		"DEFAULT_MODE", "ArgAction", "Action", "LexerCharSet"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"TOKEN_REF", "RULE_REF", "LEXER_CHAR_SET", "DOC_COMMENT", "BLOCK_COMMENT", 
		"LINE_COMMENT", "DOUBLE_QUOTE_STRING_LITERAL", "BEGIN_ARG_ACTION", "OPTIONS", 
		"TOKENS", "'import'", "'fragment'", "'lexer'", "'parser'", "'grammar'", 
		"'protected'", "'public'", "'private'", "'returns'", "'locals'", "'throws'", 
		"'catch'", "'finally'", "'mode'", "':'", "'::'", "','", "';'", "'('", 
		"')'", "'->'", "'<'", "'>'", "'='", "'?'", "'*'", "'+'", "'+='", "'|'", 
		"'$'", "'.'", "'..'", "'@'", "'#'", "'~'", "RBRACE", "ID", "INT", "STRING_LITERAL", 
		"WS", "ARG_ACTION", "UNTERMINATED_ARG_ACTION", "ACTION", "UNTERMINATED_ACTION", 
		"UNTERMINATED_CHAR_SET", "BEGIN_ACTION"
	};
	public static final String[] ruleNames = {
		"DOC_COMMENT", "BLOCK_COMMENT", "LINE_COMMENT", "DOUBLE_QUOTE_STRING_LITERAL", 
		"BEGIN_ARG_ACTION", "BEGIN_ACTION", "OPTIONS", "TOKENS", "IMPORT", "FRAGMENT", 
		"LEXER", "PARSER", "GRAMMAR", "PROTECTED", "PUBLIC", "PRIVATE", "RETURNS", 
		"LOCALS", "THROWS", "CATCH", "FINALLY", "MODE", "COLON", "COLONCOLON", 
		"COMMA", "SEMI", "LPAREN", "RPAREN", "RARROW", "LT", "GT", "ASSIGN", "QUESTION", 
		"STAR", "PLUS", "PLUS_ASSIGN", "OR", "DOLLAR", "DOT", "RANGE", "AT", "POUND", 
		"NOT", "RBRACE", "ID", "NameChar", "NameStartChar", "INT", "STRING_LITERAL", 
		"ESC_SEQ", "UNICODE_ESC", "HEX_DIGIT", "WS", "NESTED_ARG_ACTION", "ARG_ACTION_ESCAPE", 
		"ARG_ACTION_STRING_LITERAL", "ARG_ACTION_CHAR_LITERAL", "ARG_ACTION", 
		"UNTERMINATED_ARG_ACTION", "ARG_ACTION_CHAR", "NESTED_ACTION", "ACTION_ESCAPE", 
		"ACTION_STRING_LITERAL", "ACTION_CHAR_LITERAL", "ACTION_COMMENT", "ACTION", 
		"UNTERMINATED_ACTION", "ACTION_CHAR", "LEXER_CHAR_SET_BODY", "LEXER_CHAR_SET", 
		"UNTERMINATED_CHAR_SET"
	};


		private int _ruleType;

		protected void handleBeginArgAction() {
			if (inLexerRule()) {
				pushMode(LexerCharSet);
				more();
			} else {
				pushMode(ArgAction);
				more();
			}
		}

		@Override
		public Token emit() {
			if (_type == ID) {
				String firstChar = _input.getText(Interval.of(_tokenStartCharIndex, _tokenStartCharIndex));
				if (Character.isUpperCase(firstChar.charAt(0))) {
					_type = TOKEN_REF;
				} else {
					_type = RULE_REF;
				}

				if (_ruleType == Token.INVALID_TYPE) {
					_ruleType = _type;
				}
			} else if (_type == SEMI) {
				_ruleType = Token.INVALID_TYPE;
			}

			return super.emit();
		}

		private boolean inLexerRule() {
			return _ruleType == TOKEN_REF;
		}


	public ANTLRv4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ANTLRv4Lexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4: BEGIN_ARG_ACTION_action((RuleContext)_localctx, actionIndex); break;

		case 65: ACTION_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ACTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: 
		            popMode();
		        	if ( _modeStack.size()>0 ) more(); // keep scarfing until outermost }
		             break;
		}
	}
	private void BEGIN_ARG_ACTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: handleBeginArgAction(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2:\u0222\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\3\2\3\2\3\2\3\2\3\2\7\2\u009a\n\2\f\2\16\2\u009d\13\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3\u00a6\n\3\f\3\16\3\u00a9\13\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\7\4\u00b2\n\4\f\4\16\4\u00b5\13\4\3\5\3\5\3\5\3\5\7\5\u00bb"+
		"\n\5\f\5\16\5\u00be\13\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00d3\n\b\f\b\16\b\u00d6\13\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00e2\n\t\f\t\16\t\u00e5\13\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\7.\u0182"+
		"\n.\f.\16.\u0185\13.\3/\3/\5/\u0189\n/\3\60\3\60\3\61\6\61\u018e\n\61"+
		"\r\61\16\61\u018f\3\62\3\62\3\62\7\62\u0195\n\62\f\62\16\62\u0198\13\62"+
		"\3\62\3\62\3\63\3\63\3\63\5\63\u019f\n\63\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u01a6\n\64\5\64\u01a8\n\64\5\64\u01aa\n\64\5\64\u01ac\n\64\3\65\3\65"+
		"\3\66\6\66\u01b1\n\66\r\66\16\66\u01b2\3\67\3\67\3\67\3\67\3\67\38\38"+
		"\38\38\38\39\39\39\39\79\u01c3\n9\f9\169\u01c6\139\39\39\39\39\3:\3:\3"+
		":\3:\3:\5:\u01d1\n:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3"+
		">\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\7@\u01ef\n@\f@\16@\u01f2\13@\3@\3@"+
		"\3@\3@\3A\3A\3A\3A\3A\5A\u01fd\nA\3A\3A\3B\3B\5B\u0203\nB\3B\3B\3C\3C"+
		"\3C\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\6F\u0215\nF\rF\16F\u0216\3F\3F\3"+
		"G\3G\3G\3G\3H\3H\3H\3H\5\u009b\u00a7\u00bc\2I\6\6\b\7\n\b\f\t\16\n\20"+
		":\22\13\24\f\26\r\30\16\32\17\34\20\36\21 \22\"\23$\24&\25(\26*\27,\30"+
		".\31\60\32\62\33\64\34\66\358\36:\37< >!@\"B#D$F%H&J\'L(N)P*R+T,V-X.Z"+
		"/\\\60^\61`\2b\2d\62f\63h\2j\2l\2n\64p\2r\2t\2v\2x\65z\66|\2~\2\u0080"+
		"\2\u0082\2\u0084\2\u0086\2\u0088\67\u008a8\u008c\2\u008e\2\u0090\5\u0092"+
		"9\6\2\3\4\5\r\4\2\f\f\17\17\3\2$$\5\2\13\f\16\17\"\"\7\2\62;aa\u00b9\u00b9"+
		"\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301"+
		"\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801"+
		"\uf902\ufdd1\ufdf2\uffff\3\2\62;\4\2))^^\n\2$$))^^ddhhppttvv\5\2\62;C"+
		"Hch\4\2$$^^\3\2^_\u0234\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2"+
		"\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2"+
		"\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2"+
		"\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2"+
		"\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2"+
		"\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2"+
		"\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T"+
		"\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2d\3"+
		"\2\2\2\2f\3\2\2\2\2n\3\2\2\2\3p\3\2\2\2\3r\3\2\2\2\3t\3\2\2\2\3v\3\2\2"+
		"\2\3x\3\2\2\2\3z\3\2\2\2\3|\3\2\2\2\4~\3\2\2\2\4\u0080\3\2\2\2\4\u0082"+
		"\3\2\2\2\4\u0084\3\2\2\2\4\u0086\3\2\2\2\4\u0088\3\2\2\2\4\u008a\3\2\2"+
		"\2\4\u008c\3\2\2\2\5\u008e\3\2\2\2\5\u0090\3\2\2\2\5\u0092\3\2\2\2\6\u0094"+
		"\3\2\2\2\b\u00a1\3\2\2\2\n\u00ad\3\2\2\2\f\u00b6\3\2\2\2\16\u00c1\3\2"+
		"\2\2\20\u00c4\3\2\2\2\22\u00c9\3\2\2\2\24\u00d9\3\2\2\2\26\u00e8\3\2\2"+
		"\2\30\u00ef\3\2\2\2\32\u00f8\3\2\2\2\34\u00fe\3\2\2\2\36\u0105\3\2\2\2"+
		" \u010d\3\2\2\2\"\u0117\3\2\2\2$\u011e\3\2\2\2&\u0126\3\2\2\2(\u012e\3"+
		"\2\2\2*\u0135\3\2\2\2,\u013c\3\2\2\2.\u0142\3\2\2\2\60\u014a\3\2\2\2\62"+
		"\u014f\3\2\2\2\64\u0151\3\2\2\2\66\u0154\3\2\2\28\u0156\3\2\2\2:\u0158"+
		"\3\2\2\2<\u015a\3\2\2\2>\u015c\3\2\2\2@\u015f\3\2\2\2B\u0161\3\2\2\2D"+
		"\u0163\3\2\2\2F\u0165\3\2\2\2H\u0167\3\2\2\2J\u0169\3\2\2\2L\u016b\3\2"+
		"\2\2N\u016e\3\2\2\2P\u0170\3\2\2\2R\u0172\3\2\2\2T\u0174\3\2\2\2V\u0177"+
		"\3\2\2\2X\u0179\3\2\2\2Z\u017b\3\2\2\2\\\u017d\3\2\2\2^\u017f\3\2\2\2"+
		"`\u0188\3\2\2\2b\u018a\3\2\2\2d\u018d\3\2\2\2f\u0191\3\2\2\2h\u019b\3"+
		"\2\2\2j\u01a0\3\2\2\2l\u01ad\3\2\2\2n\u01b0\3\2\2\2p\u01b4\3\2\2\2r\u01b9"+
		"\3\2\2\2t\u01be\3\2\2\2v\u01d0\3\2\2\2x\u01d4\3\2\2\2z\u01d8\3\2\2\2|"+
		"\u01dc\3\2\2\2~\u01e0\3\2\2\2\u0080\u01e5\3\2\2\2\u0082\u01ea\3\2\2\2"+
		"\u0084\u01fc\3\2\2\2\u0086\u0202\3\2\2\2\u0088\u0206\3\2\2\2\u008a\u0209"+
		"\3\2\2\2\u008c\u020d\3\2\2\2\u008e\u0214\3\2\2\2\u0090\u021a\3\2\2\2\u0092"+
		"\u021e\3\2\2\2\u0094\u0095\7\61\2\2\u0095\u0096\7,\2\2\u0096\u0097\7,"+
		"\2\2\u0097\u009b\3\2\2\2\u0098\u009a\13\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7,\2\2\u009f\u00a0\7\61\2\2\u00a0"+
		"\7\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a7\3\2\2\2"+
		"\u00a4\u00a6\13\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7,\2\2\u00ab\u00ac\7\61\2\2\u00ac\t\3\2\2\2\u00ad\u00ae\7\61\2"+
		"\2\u00ae\u00af\7\61\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\n\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\13\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00bc\7$\2\2\u00b7\u00b8"+
		"\7^\2\2\u00b8\u00bb\13\2\2\2\u00b9\u00bb\n\3\2\2\u00ba\u00b7\3\2\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7$\2\2\u00c0"+
		"\r\3\2\2\2\u00c1\u00c2\7]\2\2\u00c2\u00c3\b\6\2\2\u00c3\17\3\2\2\2\u00c4"+
		"\u00c5\7}\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\7\3\2\u00c7\u00c8\b\7"+
		"\4\2\u00c8\21\3\2\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc"+
		"\7v\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7p\2\2\u00cf"+
		"\u00d0\7u\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\t\4\2\2\u00d2\u00d1\3\2"+
		"\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7}\2\2\u00d8\23\3\2\2\2"+
		"\u00d9\u00da\7v\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7m\2\2\u00dc\u00dd"+
		"\7g\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7u\2\2\u00df\u00e3\3\2\2\2\u00e0"+
		"\u00e2\t\4\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7}\2\2\u00e7\25\3\2\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7o\2\2\u00ea"+
		"\u00eb\7r\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7v\2\2"+
		"\u00ee\27\3\2\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7"+
		"c\2\2\u00f2\u00f3\7i\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6"+
		"\7p\2\2\u00f6\u00f7\7v\2\2\u00f7\31\3\2\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa"+
		"\7g\2\2\u00fa\u00fb\7z\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7t\2\2\u00fd"+
		"\33\3\2\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7t\2\2\u0101"+
		"\u0102\7u\2\2\u0102\u0103\7g\2\2\u0103\u0104\7t\2\2\u0104\35\3\2\2\2\u0105"+
		"\u0106\7i\2\2\u0106\u0107\7t\2\2\u0107\u0108\7c\2\2\u0108\u0109\7o\2\2"+
		"\u0109\u010a\7o\2\2\u010a\u010b\7c\2\2\u010b\u010c\7t\2\2\u010c\37\3\2"+
		"\2\2\u010d\u010e\7r\2\2\u010e\u010f\7t\2\2\u010f\u0110\7q\2\2\u0110\u0111"+
		"\7v\2\2\u0111\u0112\7g\2\2\u0112\u0113\7e\2\2\u0113\u0114\7v\2\2\u0114"+
		"\u0115\7g\2\2\u0115\u0116\7f\2\2\u0116!\3\2\2\2\u0117\u0118\7r\2\2\u0118"+
		"\u0119\7w\2\2\u0119\u011a\7d\2\2\u011a\u011b\7n\2\2\u011b\u011c\7k\2\2"+
		"\u011c\u011d\7e\2\2\u011d#\3\2\2\2\u011e\u011f\7r\2\2\u011f\u0120\7t\2"+
		"\2\u0120\u0121\7k\2\2\u0121\u0122\7x\2\2\u0122\u0123\7c\2\2\u0123\u0124"+
		"\7v\2\2\u0124\u0125\7g\2\2\u0125%\3\2\2\2\u0126\u0127\7t\2\2\u0127\u0128"+
		"\7g\2\2\u0128\u0129\7v\2\2\u0129\u012a\7w\2\2\u012a\u012b\7t\2\2\u012b"+
		"\u012c\7p\2\2\u012c\u012d\7u\2\2\u012d\'\3\2\2\2\u012e\u012f\7n\2\2\u012f"+
		"\u0130\7q\2\2\u0130\u0131\7e\2\2\u0131\u0132\7c\2\2\u0132\u0133\7n\2\2"+
		"\u0133\u0134\7u\2\2\u0134)\3\2\2\2\u0135\u0136\7v\2\2\u0136\u0137\7j\2"+
		"\2\u0137\u0138\7t\2\2\u0138\u0139\7q\2\2\u0139\u013a\7y\2\2\u013a\u013b"+
		"\7u\2\2\u013b+\3\2\2\2\u013c\u013d\7e\2\2\u013d\u013e\7c\2\2\u013e\u013f"+
		"\7v\2\2\u013f\u0140\7e\2\2\u0140\u0141\7j\2\2\u0141-\3\2\2\2\u0142\u0143"+
		"\7h\2\2\u0143\u0144\7k\2\2\u0144\u0145\7p\2\2\u0145\u0146\7c\2\2\u0146"+
		"\u0147\7n\2\2\u0147\u0148\7n\2\2\u0148\u0149\7{\2\2\u0149/\3\2\2\2\u014a"+
		"\u014b\7o\2\2\u014b\u014c\7q\2\2\u014c\u014d\7f\2\2\u014d\u014e\7g\2\2"+
		"\u014e\61\3\2\2\2\u014f\u0150\7<\2\2\u0150\63\3\2\2\2\u0151\u0152\7<\2"+
		"\2\u0152\u0153\7<\2\2\u0153\65\3\2\2\2\u0154\u0155\7.\2\2\u0155\67\3\2"+
		"\2\2\u0156\u0157\7=\2\2\u01579\3\2\2\2\u0158\u0159\7*\2\2\u0159;\3\2\2"+
		"\2\u015a\u015b\7+\2\2\u015b=\3\2\2\2\u015c\u015d\7/\2\2\u015d\u015e\7"+
		"@\2\2\u015e?\3\2\2\2\u015f\u0160\7>\2\2\u0160A\3\2\2\2\u0161\u0162\7@"+
		"\2\2\u0162C\3\2\2\2\u0163\u0164\7?\2\2\u0164E\3\2\2\2\u0165\u0166\7A\2"+
		"\2\u0166G\3\2\2\2\u0167\u0168\7,\2\2\u0168I\3\2\2\2\u0169\u016a\7-\2\2"+
		"\u016aK\3\2\2\2\u016b\u016c\7-\2\2\u016c\u016d\7?\2\2\u016dM\3\2\2\2\u016e"+
		"\u016f\7~\2\2\u016fO\3\2\2\2\u0170\u0171\7&\2\2\u0171Q\3\2\2\2\u0172\u0173"+
		"\7\60\2\2\u0173S\3\2\2\2\u0174\u0175\7\60\2\2\u0175\u0176\7\60\2\2\u0176"+
		"U\3\2\2\2\u0177\u0178\7B\2\2\u0178W\3\2\2\2\u0179\u017a\7%\2\2\u017aY"+
		"\3\2\2\2\u017b\u017c\7\u0080\2\2\u017c[\3\2\2\2\u017d\u017e\7\177\2\2"+
		"\u017e]\3\2\2\2\u017f\u0183\5b\60\2\u0180\u0182\5`/\2\u0181\u0180\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"_\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0189\5b\60\2\u0187\u0189\t\5\2\2"+
		"\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189a\3\2\2\2\u018a\u018b\t"+
		"\6\2\2\u018bc\3\2\2\2\u018c\u018e\t\7\2\2\u018d\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190e\3\2\2\2\u0191"+
		"\u0196\7)\2\2\u0192\u0195\5h\63\2\u0193\u0195\n\b\2\2\u0194\u0192\3\2"+
		"\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7)"+
		"\2\2\u019ag\3\2\2\2\u019b\u019e\7^\2\2\u019c\u019f\t\t\2\2\u019d\u019f"+
		"\5j\64\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019fi\3\2\2\2\u01a0"+
		"\u01ab\7w\2\2\u01a1\u01a9\5l\65\2\u01a2\u01a7\5l\65\2\u01a3\u01a5\5l\65"+
		"\2\u01a4\u01a6\5l\65\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8"+
		"\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9"+
		"\u01a2\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a1\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ack\3\2\2\2\u01ad\u01ae\t\n\2\2\u01aem\3\2"+
		"\2\2\u01af\u01b1\t\4\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3o\3\2\2\2\u01b4\u01b5\7]\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b7\b\67\3\2\u01b7\u01b8\b\67\5\2\u01b8q\3\2\2"+
		"\2\u01b9\u01ba\7^\2\2\u01ba\u01bb\13\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd"+
		"\b8\3\2\u01bds\3\2\2\2\u01be\u01c4\7$\2\2\u01bf\u01c0\7^\2\2\u01c0\u01c3"+
		"\13\2\2\2\u01c1\u01c3\n\13\2\2\u01c2\u01bf\3\2\2\2\u01c2\u01c1\3\2\2\2"+
		"\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7"+
		"\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\7$\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\b9\3\2\u01cau\3\2\2\2\u01cb\u01cc\7$\2\2\u01cc\u01cd\7^\2\2\u01cd"+
		"\u01d1\13\2\2\2\u01ce\u01cf\n\13\2\2\u01cf\u01d1\7$\2\2\u01d0\u01cb\3"+
		"\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\b:\3\2\u01d3"+
		"w\3\2\2\2\u01d4\u01d5\7_\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\b;\6\2\u01d7"+
		"y\3\2\2\2\u01d8\u01d9\7\2\2\3\u01d9\u01da\3\2\2\2\u01da\u01db\b<\6\2\u01db"+
		"{\3\2\2\2\u01dc\u01dd\13\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\b=\3\2"+
		"\u01df}\3\2\2\2\u01e0\u01e1\7}\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\b>"+
		"\3\2\u01e3\u01e4\b>\4\2\u01e4\177\3\2\2\2\u01e5\u01e6\7^\2\2\u01e6\u01e7"+
		"\13\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\b?\3\2\u01e9\u0081\3\2\2\2\u01ea"+
		"\u01f0\7$\2\2\u01eb\u01ec\7^\2\2\u01ec\u01ef\13\2\2\2\u01ed\u01ef\n\13"+
		"\2\2\u01ee\u01eb\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0"+
		"\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2"+
		"\2\2\u01f3\u01f4\7$\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\b@\3\2\u01f6\u0083"+
		"\3\2\2\2\u01f7\u01f8\7$\2\2\u01f8\u01f9\7^\2\2\u01f9\u01fd\13\2\2\2\u01fa"+
		"\u01fb\n\13\2\2\u01fb\u01fd\7$\2\2\u01fc\u01f7\3\2\2\2\u01fc\u01fa\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\bA\3\2\u01ff\u0085\3\2\2\2\u0200"+
		"\u0203\5\b\3\2\u0201\u0203\5\n\4\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2"+
		"\2\2\u0203\u0204\3\2\2\2\u0204\u0205\bB\3\2\u0205\u0087\3\2\2\2\u0206"+
		"\u0207\7\177\2\2\u0207\u0208\bC\7\2\u0208\u0089\3\2\2\2\u0209\u020a\7"+
		"\2\2\3\u020a\u020b\3\2\2\2\u020b\u020c\bD\6\2\u020c\u008b\3\2\2\2\u020d"+
		"\u020e\13\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\bE\3\2\u0210\u008d\3\2"+
		"\2\2\u0211\u0215\n\f\2\2\u0212\u0213\7^\2\2\u0213\u0215\13\2\2\2\u0214"+
		"\u0211\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0214\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\bF\3\2\u0219"+
		"\u008f\3\2\2\2\u021a\u021b\7_\2\2\u021b\u021c\3\2\2\2\u021c\u021d\bG\6"+
		"\2\u021d\u0091\3\2\2\2\u021e\u021f\7\2\2\3\u021f\u0220\3\2\2\2\u0220\u0221"+
		"\bH\6\2\u0221\u0093\3\2\2\2!\2\3\4\5\u009b\u00a7\u00b3\u00ba\u00bc\u00d4"+
		"\u00e3\u0183\u0188\u018f\u0194\u0196\u019e\u01a5\u01a7\u01a9\u01ab\u01b2"+
		"\u01c2\u01c4\u01d0\u01ee\u01f0\u01fc\u0202\u0214\u0216\b\3\6\2\5\2\2\7"+
		"\4\2\7\3\2\6\2\2\3C\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}