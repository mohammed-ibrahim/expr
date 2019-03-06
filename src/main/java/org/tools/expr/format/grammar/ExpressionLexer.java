// Generated from ./src/main/resources/Expression.g4 by ANTLR 4.5.1
package org.tools.expr.format.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND=2, OR=3, NOT=4, TRUE=5, FALSE=6, LIKE=7, IN=8, GT=9, GE=10, 
		LT=11, LE=12, EQ=13, NE=14, IS=15, LPAREN=16, RPAREN=17, DECIMAL=18, IDENTIFIER=19, 
		SLITERAL=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "AND", "OR", "NOT", "TRUE", "FALSE", "LIKE", "IN", "GT", "GE", 
		"LT", "LE", "EQ", "NE", "IS", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", 
		"SLITERAL", "WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", null, null, null, null, null, null, null, "'>'", "'>='", 
		"'<'", "'<='", "'='", "'!='", "'is'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "AND", "OR", "NOT", "TRUE", "FALSE", "LIKE", "IN", "GT", "GE", 
		"LT", "LE", "EQ", "NE", "IS", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", 
		"SLITERAL", "WS"
	};
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


	public ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00f2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\5\23\u0099"+
		"\n\23\3\23\6\23\u009c\n\23\r\23\16\23\u009d\3\23\3\23\6\23\u00a2\n\23"+
		"\r\23\16\23\u00a3\5\23\u00a6\n\23\3\24\3\24\7\24\u00aa\n\24\f\24\16\24"+
		"\u00ad\13\24\3\25\3\25\7\25\u00b1\n\25\f\25\16\25\u00b4\13\25\3\25\3\25"+
		"\3\26\6\26\u00b9\n\26\r\26\16\26\u00ba\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2"+
		"S\2U\2W\2Y\2[\2]\2_\2\3\2!\3\2\62;\6\2,,C\\aac|\7\2,,\62;C\\aac|\3\2)"+
		")\5\2\13\f\16\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4"+
		"\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQq"+
		"q\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2"+
		"ZZzz\4\2[[{{\4\2\\\\||\u00de\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7g\3\2\2\2\tj\3\2\2\2\13n\3\2\2\2\rs\3\2"+
		"\2\2\17y\3\2\2\2\21~\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0086"+
		"\3\2\2\2\31\u0088\3\2\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u0090\3"+
		"\2\2\2!\u0093\3\2\2\2#\u0095\3\2\2\2%\u0098\3\2\2\2\'\u00a7\3\2\2\2)\u00ae"+
		"\3\2\2\2+\u00b8\3\2\2\2-\u00be\3\2\2\2/\u00c0\3\2\2\2\61\u00c2\3\2\2\2"+
		"\63\u00c4\3\2\2\2\65\u00c6\3\2\2\2\67\u00c8\3\2\2\29\u00ca\3\2\2\2;\u00cc"+
		"\3\2\2\2=\u00ce\3\2\2\2?\u00d0\3\2\2\2A\u00d2\3\2\2\2C\u00d4\3\2\2\2E"+
		"\u00d6\3\2\2\2G\u00d8\3\2\2\2I\u00da\3\2\2\2K\u00dc\3\2\2\2M\u00de\3\2"+
		"\2\2O\u00e0\3\2\2\2Q\u00e2\3\2\2\2S\u00e4\3\2\2\2U\u00e6\3\2\2\2W\u00e8"+
		"\3\2\2\2Y\u00ea\3\2\2\2[\u00ec\3\2\2\2]\u00ee\3\2\2\2_\u00f0\3\2\2\2a"+
		"b\7.\2\2b\4\3\2\2\2cd\5-\27\2de\5G$\2ef\5\63\32\2f\6\3\2\2\2gh\5I%\2h"+
		"i\5O(\2i\b\3\2\2\2jk\5G$\2kl\5I%\2lm\5S*\2m\n\3\2\2\2no\5S*\2op\5O(\2"+
		"pq\5U+\2qr\5\65\33\2r\f\3\2\2\2st\5\67\34\2tu\5-\27\2uv\5C\"\2vw\5Q)\2"+
		"wx\5\65\33\2x\16\3\2\2\2yz\5C\"\2z{\5=\37\2{|\5A!\2|}\5\65\33\2}\20\3"+
		"\2\2\2~\177\5=\37\2\177\u0080\5G$\2\u0080\22\3\2\2\2\u0081\u0082\7@\2"+
		"\2\u0082\24\3\2\2\2\u0083\u0084\7@\2\2\u0084\u0085\7?\2\2\u0085\26\3\2"+
		"\2\2\u0086\u0087\7>\2\2\u0087\30\3\2\2\2\u0088\u0089\7>\2\2\u0089\u008a"+
		"\7?\2\2\u008a\32\3\2\2\2\u008b\u008c\7?\2\2\u008c\34\3\2\2\2\u008d\u008e"+
		"\7#\2\2\u008e\u008f\7?\2\2\u008f\36\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092"+
		"\7u\2\2\u0092 \3\2\2\2\u0093\u0094\7*\2\2\u0094\"\3\2\2\2\u0095\u0096"+
		"\7+\2\2\u0096$\3\2\2\2\u0097\u0099\7/\2\2\u0098\u0097\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\t\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a5\3\2"+
		"\2\2\u009f\u00a1\7\60\2\2\u00a0\u00a2\t\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6&\3\2\2\2\u00a7\u00ab"+
		"\t\3\2\2\u00a8\u00aa\t\4\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac(\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ae\u00b2\7)\2\2\u00af\u00b1\n\5\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\7)\2\2\u00b6*\3\2\2\2\u00b7\u00b9\t\6\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\26\2\2\u00bd,\3\2\2\2\u00be\u00bf"+
		"\t\7\2\2\u00bf.\3\2\2\2\u00c0\u00c1\t\b\2\2\u00c1\60\3\2\2\2\u00c2\u00c3"+
		"\t\t\2\2\u00c3\62\3\2\2\2\u00c4\u00c5\t\n\2\2\u00c5\64\3\2\2\2\u00c6\u00c7"+
		"\t\13\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\t\f\2\2\u00c98\3\2\2\2\u00ca\u00cb"+
		"\t\r\2\2\u00cb:\3\2\2\2\u00cc\u00cd\t\16\2\2\u00cd<\3\2\2\2\u00ce\u00cf"+
		"\t\17\2\2\u00cf>\3\2\2\2\u00d0\u00d1\t\20\2\2\u00d1@\3\2\2\2\u00d2\u00d3"+
		"\t\21\2\2\u00d3B\3\2\2\2\u00d4\u00d5\t\22\2\2\u00d5D\3\2\2\2\u00d6\u00d7"+
		"\t\23\2\2\u00d7F\3\2\2\2\u00d8\u00d9\t\24\2\2\u00d9H\3\2\2\2\u00da\u00db"+
		"\t\25\2\2\u00dbJ\3\2\2\2\u00dc\u00dd\t\26\2\2\u00ddL\3\2\2\2\u00de\u00df"+
		"\t\27\2\2\u00dfN\3\2\2\2\u00e0\u00e1\t\30\2\2\u00e1P\3\2\2\2\u00e2\u00e3"+
		"\t\31\2\2\u00e3R\3\2\2\2\u00e4\u00e5\t\32\2\2\u00e5T\3\2\2\2\u00e6\u00e7"+
		"\t\33\2\2\u00e7V\3\2\2\2\u00e8\u00e9\t\34\2\2\u00e9X\3\2\2\2\u00ea\u00eb"+
		"\t\35\2\2\u00ebZ\3\2\2\2\u00ec\u00ed\t\36\2\2\u00ed\\\3\2\2\2\u00ee\u00ef"+
		"\t\37\2\2\u00ef^\3\2\2\2\u00f0\u00f1\t \2\2\u00f1`\3\2\2\2\n\2\u0098\u009d"+
		"\u00a3\u00a5\u00ab\u00b2\u00ba\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}