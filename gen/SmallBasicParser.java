// Generated from D:/Diego/Programación/Lenguajes de Programación/Analizador Semántico/interprete/small-basic-interprete/small-basic-interprete/grammar\SmallBasic.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SmallBasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, COMENTARIO=11, ESP=12, PR=13, RELOP=14, OPSUM=15, OPMUL=16, TKN_FOR=17, 
		TKN_TO=18, TKN_STEP=19, TKN_ENDFOR=20, TKN_WHILE=21, TKN_ENDWHILE=22, 
		TKN_IF=23, TKN_THEN=24, TKN_ELSE=25, TKN_ELSEIF=26, TKN_ENDIF=27, TKN_SUB=28, 
		TKN_ENDSUB=29, TKN_GOTO=30, TKN_ARRAY=31, TKN_TEXTWINDOW=32, TKN_PROGRAM=33, 
		TKN_STACK=34, TKN_MINUS=35, ID=36, VERDADERO=37, FALSO=38, NUM=39, TEXT=40;
	public static final int
		RULE_s = 0, RULE_comandos = 1, RULE_condicional = 2, RULE_sinosi = 3, 
		RULE_sino = 4, RULE_para = 5, RULE_step = 6, RULE_mientras = 7, RULE_funcion = 8, 
		RULE_declaracion = 9, RULE_id = 10, RULE_llamado = 11, RULE_interna = 12, 
		RULE_parametros = 13, RULE_parametros2 = 14, RULE_etiqueta = 15, RULE_goto = 16, 
		RULE_expr = 17, RULE_expr2 = 18, RULE_expr3 = 19, RULE_arit = 20, RULE_arit2 = 21, 
		RULE_arit3 = 22, RULE_arit4 = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "comandos", "condicional", "sinosi", "sino", "para", "step", "mientras", 
			"funcion", "declaracion", "id", "llamado", "interna", "parametros", "parametros2", 
			"etiqueta", "goto", "expr", "expr2", "expr3", "arit", "arit2", "arit3", 
			"arit4"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "'['", "']'", "'.'", "','", "':'", "'Or'", 
			"'And'", null, null, null, null, "'+'", null, "'For'", "'To'", "'Step'", 
			"'EndFor'", "'While'", "'EndWhile'", "'If'", "'Then'", "'Else'", "'ElseIf'", 
			"'EndIf'", "'Sub'", "'EndSub'", "'Goto'", "'Array'", "'TextWindow'", 
			"'Program'", "'Stack'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "COMENTARIO", 
			"ESP", "PR", "RELOP", "OPSUM", "OPMUL", "TKN_FOR", "TKN_TO", "TKN_STEP", 
			"TKN_ENDFOR", "TKN_WHILE", "TKN_ENDWHILE", "TKN_IF", "TKN_THEN", "TKN_ELSE", 
			"TKN_ELSEIF", "TKN_ENDIF", "TKN_SUB", "TKN_ENDSUB", "TKN_GOTO", "TKN_ARRAY", 
			"TKN_TEXTWINDOW", "TKN_PROGRAM", "TKN_STACK", "TKN_MINUS", "ID", "VERDADERO", 
			"FALSO", "NUM", "TEXT"
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

	@Override
	public String getGrammarFileName() { return "SmallBasic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmallBasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69803843584L) != 0)) {
					{
					{
					setState(48);
					comandos();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TKN_SUB) {
					{
					{
					setState(54);
					funcion();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public InternaContext interna() {
			return getRuleContext(InternaContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public LlamadoContext llamado() {
			return getRuleContext(LlamadoContext.class,0);
		}
		public GotoContext goto_() {
			return getRuleContext(GotoContext.class,0);
		}
		public EtiquetaContext etiqueta() {
			return getRuleContext(EtiquetaContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comandos);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				condicional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				para();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				mientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				interna();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				declaracion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				llamado();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				goto_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				etiqueta();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode TKN_IF() { return getToken(SmallBasicParser.TKN_IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TKN_THEN() { return getToken(SmallBasicParser.TKN_THEN, 0); }
		public SinosiContext sinosi() {
			return getRuleContext(SinosiContext.class,0);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public TerminalNode TKN_ENDIF() { return getToken(SmallBasicParser.TKN_ENDIF, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(TKN_IF);
			setState(73);
			match(T__0);
			setState(74);
			expr(0);
			setState(75);
			match(T__1);
			setState(76);
			match(TKN_THEN);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69803843584L) != 0)) {
				{
				{
				setState(77);
				comandos();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			sinosi();
			setState(84);
			sino();
			setState(85);
			match(TKN_ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SinosiContext extends ParserRuleContext {
		public TerminalNode TKN_ELSEIF() { return getToken(SmallBasicParser.TKN_ELSEIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TKN_THEN() { return getToken(SmallBasicParser.TKN_THEN, 0); }
		public SinosiContext sinosi() {
			return getRuleContext(SinosiContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public SinosiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinosi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterSinosi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitSinosi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitSinosi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinosiContext sinosi() throws RecognitionException {
		SinosiContext _localctx = new SinosiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sinosi);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_ELSEIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(TKN_ELSEIF);
				setState(88);
				match(T__0);
				setState(89);
				expr(0);
				setState(90);
				match(T__1);
				setState(91);
				match(TKN_THEN);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69803843584L) != 0)) {
					{
					{
					setState(92);
					comandos();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				sinosi();
				}
				break;
			case TKN_ELSE:
			case TKN_ENDIF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SinoContext extends ParserRuleContext {
		public TerminalNode TKN_ELSE() { return getToken(SmallBasicParser.TKN_ELSE, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sino);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(TKN_ELSE);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69803843584L) != 0)) {
					{
					{
					setState(104);
					comandos();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TKN_ENDIF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParaContext extends ParserRuleContext {
		public TerminalNode TKN_FOR() { return getToken(SmallBasicParser.TKN_FOR, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode TKN_TO() { return getToken(SmallBasicParser.TKN_TO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public TerminalNode TKN_ENDFOR() { return getToken(SmallBasicParser.TKN_ENDFOR, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(TKN_FOR);
			setState(114);
			declaracion();
			setState(115);
			match(TKN_TO);
			setState(116);
			expr(0);
			setState(117);
			step();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69803843584L) != 0)) {
				{
				{
				setState(118);
				comandos();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(TKN_ENDFOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StepContext extends ParserRuleContext {
		public TerminalNode TKN_STEP() { return getToken(SmallBasicParser.TKN_STEP, 0); }
		public AritContext arit() {
			return getRuleContext(AritContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_step);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_STEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(TKN_STEP);
				setState(127);
				arit(0);
				}
				break;
			case PR:
			case TKN_FOR:
			case TKN_ENDFOR:
			case TKN_WHILE:
			case TKN_IF:
			case TKN_GOTO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode TKN_WHILE() { return getToken(SmallBasicParser.TKN_WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TKN_ENDWHILE() { return getToken(SmallBasicParser.TKN_ENDWHILE, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(TKN_WHILE);
			setState(132);
			match(T__0);
			setState(133);
			expr(0);
			setState(134);
			match(T__1);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69803843584L) != 0)) {
				{
				{
				setState(135);
				comandos();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(TKN_ENDWHILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode TKN_SUB() { return getToken(SmallBasicParser.TKN_SUB, 0); }
		public TerminalNode ID() { return getToken(SmallBasicParser.ID, 0); }
		public TerminalNode TKN_ENDSUB() { return getToken(SmallBasicParser.TKN_ENDSUB, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(TKN_SUB);
			setState(144);
			match(ID);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69803843584L) != 0)) {
				{
				{
				setState(145);
				comandos();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(TKN_ENDSUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			id();
			setState(154);
			match(T__2);
			setState(155);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SmallBasicParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					match(T__3);
					setState(159);
					expr(0);
					setState(160);
					match(T__4);
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SmallBasicParser.ID, 0); }
		public LlamadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterLlamado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitLlamado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitLlamado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadoContext llamado() throws RecognitionException {
		LlamadoContext _localctx = new LlamadoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_llamado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(T__0);
			setState(169);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InternaContext extends ParserRuleContext {
		public TerminalNode PR() { return getToken(SmallBasicParser.PR, 0); }
		public TerminalNode ID() { return getToken(SmallBasicParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public InternaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterInterna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitInterna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitInterna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InternaContext interna() throws RecognitionException {
		InternaContext _localctx = new InternaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(PR);
			setState(172);
			match(T__5);
			setState(173);
			match(ID);
			setState(174);
			match(T__0);
			setState(175);
			parametros();
			setState(176);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Parametros2Context parametros2() {
			return getRuleContext(Parametros2Context.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametros);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case PR:
			case TKN_MINUS:
			case ID:
			case VERDADERO:
			case FALSO:
			case NUM:
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				expr(0);
				setState(179);
				parametros2();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parametros2Context extends ParserRuleContext {
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Parametros2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterParametros2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitParametros2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitParametros2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros2Context parametros2() throws RecognitionException {
		Parametros2Context _localctx = new Parametros2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametros2);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__6);
				setState(185);
				parametros();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EtiquetaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SmallBasicParser.ID, 0); }
		public EtiquetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiqueta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterEtiqueta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitEtiqueta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitEtiqueta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtiquetaContext etiqueta() throws RecognitionException {
		EtiquetaContext _localctx = new EtiquetaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_etiqueta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
			setState(190);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GotoContext extends ParserRuleContext {
		public TerminalNode TKN_GOTO() { return getToken(SmallBasicParser.TKN_GOTO, 0); }
		public TerminalNode ID() { return getToken(SmallBasicParser.ID, 0); }
		public GotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitGoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitGoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoContext goto_() throws RecognitionException {
		GotoContext _localctx = new GotoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_goto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(TKN_GOTO);
			setState(193);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(196);
			expr2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(198);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(199);
					match(T__8);
					setState(200);
					expr2(0);
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr2Context extends ParserRuleContext {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		return expr2(0);
	}

	private Expr2Context expr2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr2Context _localctx = new Expr2Context(_ctx, _parentState);
		Expr2Context _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(207);
			expr3();
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr2);
					setState(209);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(210);
					match(T__9);
					setState(211);
					expr3();
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr3Context extends ParserRuleContext {
		public List<AritContext> arit() {
			return getRuleContexts(AritContext.class);
		}
		public AritContext arit(int i) {
			return getRuleContext(AritContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(SmallBasicParser.RELOP, 0); }
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitExpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr3);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				arit(0);
				setState(218);
				match(RELOP);
				setState(219);
				arit(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				arit(0);
				setState(222);
				match(T__2);
				setState(223);
				arit(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				arit(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AritContext extends ParserRuleContext {
		public Arit2Context arit2() {
			return getRuleContext(Arit2Context.class,0);
		}
		public AritContext arit() {
			return getRuleContext(AritContext.class,0);
		}
		public TerminalNode OPSUM() { return getToken(SmallBasicParser.OPSUM, 0); }
		public TerminalNode TKN_MINUS() { return getToken(SmallBasicParser.TKN_MINUS, 0); }
		public AritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterArit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitArit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitArit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritContext arit() throws RecognitionException {
		return arit(0);
	}

	private AritContext arit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AritContext _localctx = new AritContext(_ctx, _parentState);
		AritContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_arit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(229);
			arit2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new AritContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arit);
						setState(231);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(232);
						match(OPSUM);
						setState(233);
						arit2(0);
						}
						break;
					case 2:
						{
						_localctx = new AritContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arit);
						setState(234);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(235);
						match(TKN_MINUS);
						setState(236);
						arit2(0);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arit2Context extends ParserRuleContext {
		public Arit3Context arit3() {
			return getRuleContext(Arit3Context.class,0);
		}
		public Arit2Context arit2() {
			return getRuleContext(Arit2Context.class,0);
		}
		public TerminalNode OPMUL() { return getToken(SmallBasicParser.OPMUL, 0); }
		public Arit2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arit2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterArit2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitArit2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitArit2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arit2Context arit2() throws RecognitionException {
		return arit2(0);
	}

	private Arit2Context arit2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arit2Context _localctx = new Arit2Context(_ctx, _parentState);
		Arit2Context _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_arit2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(243);
			arit3();
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Arit2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arit2);
					setState(245);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(246);
					match(OPMUL);
					setState(247);
					arit3();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arit3Context extends ParserRuleContext {
		public TerminalNode TKN_MINUS() { return getToken(SmallBasicParser.TKN_MINUS, 0); }
		public Arit4Context arit4() {
			return getRuleContext(Arit4Context.class,0);
		}
		public Arit3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arit3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterArit3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitArit3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitArit3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arit3Context arit3() throws RecognitionException {
		Arit3Context _localctx = new Arit3Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_arit3);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(TKN_MINUS);
				setState(254);
				arit4();
				}
				break;
			case T__0:
			case PR:
			case ID:
			case VERDADERO:
			case FALSO:
			case NUM:
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				arit4();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arit4Context extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SmallBasicParser.TEXT, 0); }
		public TerminalNode NUM() { return getToken(SmallBasicParser.NUM, 0); }
		public TerminalNode VERDADERO() { return getToken(SmallBasicParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(SmallBasicParser.FALSO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public InternaContext interna() {
			return getRuleContext(InternaContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Arit4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arit4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).enterArit4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicListener ) ((SmallBasicListener)listener).exitArit4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicVisitor ) return ((SmallBasicVisitor<? extends T>)visitor).visitArit4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arit4Context arit4() throws RecognitionException {
		Arit4Context _localctx = new Arit4Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_arit4);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(TEXT);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(NUM);
				}
				break;
			case VERDADERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(VERDADERO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(FALSO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				id();
				}
				break;
			case PR:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				interna();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				match(T__0);
				setState(265);
				expr(0);
				setState(266);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 18:
			return expr2_sempred((Expr2Context)_localctx, predIndex);
		case 20:
			return arit_sempred((AritContext)_localctx, predIndex);
		case 21:
			return arit2_sempred((Arit2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr2_sempred(Expr2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arit_sempred(AritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arit2_sempred(Arit2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u010f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0005\u00008\b\u0000\n"+
		"\u0000\f\u0000;\t\u0000\u0003\u0000=\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001G\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002O\b\u0002\n\u0002\f\u0002R\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003^\b\u0003\n\u0003"+
		"\f\u0003a\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003f\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0005\u0004j\b\u0004\n\u0004\f\u0004m\t\u0004"+
		"\u0001\u0004\u0003\u0004p\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005x\b\u0005\n\u0005\f\u0005"+
		"{\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0082\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u0089\b\u0007\n\u0007\f\u0007\u008c\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0093\b\b\n\b\f\b\u0096"+
		"\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00a3\b\n\n\n\f\n\u00a6\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b7\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bc\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00ca"+
		"\b\u0011\n\u0011\f\u0011\u00cd\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00d5\b\u0012\n\u0012"+
		"\f\u0012\u00d8\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00e3\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00ee\b\u0014"+
		"\n\u0014\f\u0014\u00f1\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00f9\b\u0015\n\u0015\f\u0015"+
		"\u00fc\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0101\b"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u010d"+
		"\b\u0017\u0001\u0017\u0000\u0004\"$(*\u0018\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000"+
		"\u0000\u011a\u0000<\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000"+
		"\u0004H\u0001\u0000\u0000\u0000\u0006e\u0001\u0000\u0000\u0000\bo\u0001"+
		"\u0000\u0000\u0000\nq\u0001\u0000\u0000\u0000\f\u0081\u0001\u0000\u0000"+
		"\u0000\u000e\u0083\u0001\u0000\u0000\u0000\u0010\u008f\u0001\u0000\u0000"+
		"\u0000\u0012\u0099\u0001\u0000\u0000\u0000\u0014\u009d\u0001\u0000\u0000"+
		"\u0000\u0016\u00a7\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000\u0000"+
		"\u0000\u001a\u00b6\u0001\u0000\u0000\u0000\u001c\u00bb\u0001\u0000\u0000"+
		"\u0000\u001e\u00bd\u0001\u0000\u0000\u0000 \u00c0\u0001\u0000\u0000\u0000"+
		"\"\u00c3\u0001\u0000\u0000\u0000$\u00ce\u0001\u0000\u0000\u0000&\u00e2"+
		"\u0001\u0000\u0000\u0000(\u00e4\u0001\u0000\u0000\u0000*\u00f2\u0001\u0000"+
		"\u0000\u0000,\u0100\u0001\u0000\u0000\u0000.\u010c\u0001\u0000\u0000\u0000"+
		"02\u0003\u0002\u0001\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004=\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000068\u0003\u0010\b\u000076\u0001\u0000"+
		"\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		"<3\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000=\u0001\u0001\u0000"+
		"\u0000\u0000>G\u0003\u0004\u0002\u0000?G\u0003\n\u0005\u0000@G\u0003\u000e"+
		"\u0007\u0000AG\u0003\u0018\f\u0000BG\u0003\u0012\t\u0000CG\u0003\u0016"+
		"\u000b\u0000DG\u0003 \u0010\u0000EG\u0003\u001e\u000f\u0000F>\u0001\u0000"+
		"\u0000\u0000F?\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000FA\u0001"+
		"\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\u0003\u0001\u0000"+
		"\u0000\u0000HI\u0005\u0017\u0000\u0000IJ\u0005\u0001\u0000\u0000JK\u0003"+
		"\"\u0011\u0000KL\u0005\u0002\u0000\u0000LP\u0005\u0018\u0000\u0000MO\u0003"+
		"\u0002\u0001\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000ST\u0003\u0006\u0003\u0000TU\u0003\b\u0004"+
		"\u0000UV\u0005\u001b\u0000\u0000V\u0005\u0001\u0000\u0000\u0000WX\u0005"+
		"\u001a\u0000\u0000XY\u0005\u0001\u0000\u0000YZ\u0003\"\u0011\u0000Z[\u0005"+
		"\u0002\u0000\u0000[_\u0005\u0018\u0000\u0000\\^\u0003\u0002\u0001\u0000"+
		"]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000bc\u0003\u0006\u0003\u0000cf\u0001\u0000\u0000\u0000df\u0001"+
		"\u0000\u0000\u0000eW\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"f\u0007\u0001\u0000\u0000\u0000gk\u0005\u0019\u0000\u0000hj\u0003\u0002"+
		"\u0001\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lp\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000og\u0001\u0000\u0000"+
		"\u0000on\u0001\u0000\u0000\u0000p\t\u0001\u0000\u0000\u0000qr\u0005\u0011"+
		"\u0000\u0000rs\u0003\u0012\t\u0000st\u0005\u0012\u0000\u0000tu\u0003\""+
		"\u0011\u0000uy\u0003\f\u0006\u0000vx\u0003\u0002\u0001\u0000wv\u0001\u0000"+
		"\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"|}\u0005\u0014\u0000\u0000}\u000b\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"\u0013\u0000\u0000\u007f\u0082\u0003(\u0014\u0000\u0080\u0082\u0001\u0000"+
		"\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\r\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0015\u0000\u0000"+
		"\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u0086\u0003\"\u0011\u0000\u0086"+
		"\u008a\u0005\u0002\u0000\u0000\u0087\u0089\u0003\u0002\u0001\u0000\u0088"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005\u0016\u0000\u0000\u008e\u000f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u001c\u0000\u0000\u0090\u0094\u0005$\u0000\u0000\u0091\u0093"+
		"\u0003\u0002\u0001\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u001d\u0000\u0000\u0098\u0011"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0014\n\u0000\u009a\u009b\u0005"+
		"\u0003\u0000\u0000\u009b\u009c\u0003\"\u0011\u0000\u009c\u0013\u0001\u0000"+
		"\u0000\u0000\u009d\u00a4\u0005$\u0000\u0000\u009e\u009f\u0005\u0004\u0000"+
		"\u0000\u009f\u00a0\u0003\"\u0011\u0000\u00a0\u00a1\u0005\u0005\u0000\u0000"+
		"\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u0015\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005$\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0001\u0000\u0000\u00a9\u00aa\u0005\u0002\u0000\u0000\u00aa"+
		"\u0017\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\r\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0006\u0000\u0000\u00ad\u00ae\u0005$\u0000\u0000\u00ae\u00af\u0005"+
		"\u0001\u0000\u0000\u00af\u00b0\u0003\u001a\r\u0000\u00b0\u00b1\u0005\u0002"+
		"\u0000\u0000\u00b1\u0019\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\"\u0011"+
		"\u0000\u00b3\u00b4\u0003\u001c\u000e\u0000\u00b4\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u001b\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0005\u0007\u0000\u0000\u00b9\u00bc\u0003\u001a\r\u0000"+
		"\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u001d\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005$\u0000\u0000\u00be\u00bf\u0005\b\u0000\u0000\u00bf"+
		"\u001f\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u001e\u0000\u0000\u00c1"+
		"\u00c2\u0005$\u0000\u0000\u00c2!\u0001\u0000\u0000\u0000\u00c3\u00c4\u0006"+
		"\u0011\uffff\uffff\u0000\u00c4\u00c5\u0003$\u0012\u0000\u00c5\u00cb\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\n\u0002\u0000\u0000\u00c7\u00c8\u0005\t"+
		"\u0000\u0000\u00c8\u00ca\u0003$\u0012\u0000\u00c9\u00c6\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc#\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0006\u0012\uffff\uffff"+
		"\u0000\u00cf\u00d0\u0003&\u0013\u0000\u00d0\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\n\u0002\u0000\u0000\u00d2\u00d3\u0005\n\u0000\u0000\u00d3"+
		"\u00d5\u0003&\u0013\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7%\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0003(\u0014\u0000\u00da\u00db\u0005\u000e"+
		"\u0000\u0000\u00db\u00dc\u0003(\u0014\u0000\u00dc\u00e3\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0003(\u0014\u0000\u00de\u00df\u0005\u0003\u0000\u0000"+
		"\u00df\u00e0\u0003(\u0014\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e3\u0003(\u0014\u0000\u00e2\u00d9\u0001\u0000\u0000\u0000\u00e2\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\'\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0006\u0014\uffff\uffff\u0000\u00e5\u00e6"+
		"\u0003*\u0015\u0000\u00e6\u00ef\u0001\u0000\u0000\u0000\u00e7\u00e8\n"+
		"\u0003\u0000\u0000\u00e8\u00e9\u0005\u000f\u0000\u0000\u00e9\u00ee\u0003"+
		"*\u0015\u0000\u00ea\u00eb\n\u0002\u0000\u0000\u00eb\u00ec\u0005#\u0000"+
		"\u0000\u00ec\u00ee\u0003*\u0015\u0000\u00ed\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0)\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0006\u0015\uffff\uffff\u0000\u00f3\u00f4\u0003,\u0016\u0000\u00f4"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f5\u00f6\n\u0002\u0000\u0000\u00f6\u00f7"+
		"\u0005\u0010\u0000\u0000\u00f7\u00f9\u0003,\u0016\u0000\u00f8\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb+\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005#\u0000"+
		"\u0000\u00fe\u0101\u0003.\u0017\u0000\u00ff\u0101\u0003.\u0017\u0000\u0100"+
		"\u00fd\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"-\u0001\u0000\u0000\u0000\u0102\u010d\u0005(\u0000\u0000\u0103\u010d\u0005"+
		"\'\u0000\u0000\u0104\u010d\u0005%\u0000\u0000\u0105\u010d\u0005&\u0000"+
		"\u0000\u0106\u010d\u0003\u0014\n\u0000\u0107\u010d\u0003\u0018\f\u0000"+
		"\u0108\u0109\u0005\u0001\u0000\u0000\u0109\u010a\u0003\"\u0011\u0000\u010a"+
		"\u010b\u0005\u0002\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c"+
		"\u0102\u0001\u0000\u0000\u0000\u010c\u0103\u0001\u0000\u0000\u0000\u010c"+
		"\u0104\u0001\u0000\u0000\u0000\u010c\u0105\u0001\u0000\u0000\u0000\u010c"+
		"\u0106\u0001\u0000\u0000\u0000\u010c\u0107\u0001\u0000\u0000\u0000\u010c"+
		"\u0108\u0001\u0000\u0000\u0000\u010d/\u0001\u0000\u0000\u0000\u001839"+
		"<FP_ekoy\u0081\u008a\u0094\u00a4\u00b6\u00bb\u00cb\u00d6\u00e2\u00ed\u00ef"+
		"\u00fa\u0100\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}