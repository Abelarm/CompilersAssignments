
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150930 (SVN rev 66)
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int ANDEQ = 48;
  public static final int TYPEOF = 78;
  public static final int ARROW = 51;
  public static final int BYNARYLITERAL = 96;
  public static final int RANG = 27;
  public static final int CONST = 70;
  public static final int REGEXLITERAL = 100;
  public static final int TARGET = 69;
  public static final int EXPORT = 75;
  public static final int PLUSEQ = 41;
  public static final int SEMI = 11;
  public static final int GET = 90;
  public static final int GEQ = 31;
  public static final int CATCH = 68;
  public static final int COMMA = 10;
  public static final int THROW = 66;
  public static final int THREERANG = 38;
  public static final int IDENTIFIERNAME = 89;
  public static final int LOGOR = 40;
  public static final int YIELD = 67;
  public static final int NOT = 19;
  public static final int TILDE = 18;
  public static final int ERROR = 102;
  public static final int VAR = 59;
  public static final int DECIMALLITERAL = 93;
  public static final int THREERANGEQ = 47;
  public static final int EQ = 32;
  public static final int DOT3 = 9;
  public static final int DMINUS = 15;
  public static final int MOD = 23;
  public static final int CLASS = 71;
  public static final int SUPER = 72;
  public static final int SIGNEDINTEGER = 97;
  public static final int PLUS = 16;
  public static final int QUESTION = 29;
  public static final int WHILE = 73;
  public static final int LPAR = 4;
  public static final int EXTENDS = 80;
  public static final int DELETE = 76;
  public static final int ASSIGN = 13;
  public static final int TWOSTAREQ = 52;
  public static final int BOOLEANLITERAL = 105;
  public static final int SWITCH = 79;
  public static final int DO = 53;
  public static final int FOR = 58;
  public static final int STAR = 20;
  public static final int VOID = 63;
  public static final int DIV = 21;
  public static final int RETURN = 74;
  public static final int ELSE = 60;
  public static final int TRY = 57;
  public static final int STAREQ = 43;
  public static final int BREAK = 65;
  public static final int DOT = 8;
  public static final int TYPEEQ = 34;
  public static final int TYPENEQ = 35;
  public static final int STRING_LITERAL = 99;
  public static final int NULL = 104;
  public static final int TWORANGEQ = 46;
  public static final int EOF = 0;
  public static final int COMMENT = 98;
  public static final int THIS = 61;
  public static final int RPAR = 5;
  public static final int DEFAULT = 81;
  public static final int DPLUS = 14;
  public static final int TWOLANG = 36;
  public static final int FUNCTION = 86;
  public static final int TWOLANGEQ = 45;
  public static final int IMPORT = 77;
  public static final int MINUS = 17;
  public static final int DEBUGGER = 85;
  public static final int LOGAND = 39;
  public static final int HEXLITERAL = 95;
  public static final int IN = 54;
  public static final int HAT = 28;
  public static final int RSQPAR = 7;
  public static final int OR = 25;
  public static final int SET = 91;
  public static final int error = 1;
  public static final int DIVEQ = 22;
  public static final int FINALLY = 84;
  public static final int ERROR_B = 103;
  public static final int CONTINUE = 87;
  public static final int RBPAR = 3;
  public static final int INSTANCEOF = 88;
  public static final int IF = 55;
  public static final int MODEQ = 44;
  public static final int LSQPAR = 6;
  public static final int OF = 83;
  public static final int TEMPLATE = 101;
  public static final int COLON = 12;
  public static final int TWORANG = 37;
  public static final int HATEQ = 50;
  public static final int OREQ = 49;
  public static final int CASE = 62;
  public static final int NEW = 56;
  public static final int LBPAR = 2;
  public static final int LANG = 26;
  public static final int NEQ = 33;
  public static final int AND = 24;
  public static final int STATIC = 92;
  public static final int LET = 82;
  public static final int WITH = 64;
  public static final int OCTALLITERAL = 94;
  public static final int LEQ = 30;
  public static final int MINUSEQ = 42;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "LBPAR",
  "RBPAR",
  "LPAR",
  "RPAR",
  "LSQPAR",
  "RSQPAR",
  "DOT",
  "DOT3",
  "COMMA",
  "SEMI",
  "COLON",
  "ASSIGN",
  "DPLUS",
  "DMINUS",
  "PLUS",
  "MINUS",
  "TILDE",
  "NOT",
  "STAR",
  "DIV",
  "DIVEQ",
  "MOD",
  "AND",
  "OR",
  "LANG",
  "RANG",
  "HAT",
  "QUESTION",
  "LEQ",
  "GEQ",
  "EQ",
  "NEQ",
  "TYPEEQ",
  "TYPENEQ",
  "TWOLANG",
  "TWORANG",
  "THREERANG",
  "LOGAND",
  "LOGOR",
  "PLUSEQ",
  "MINUSEQ",
  "STAREQ",
  "MODEQ",
  "TWOLANGEQ",
  "TWORANGEQ",
  "THREERANGEQ",
  "ANDEQ",
  "OREQ",
  "HATEQ",
  "ARROW",
  "TWOSTAREQ",
  "DO",
  "IN",
  "IF",
  "NEW",
  "TRY",
  "FOR",
  "VAR",
  "ELSE",
  "THIS",
  "CASE",
  "VOID",
  "WITH",
  "BREAK",
  "THROW",
  "YIELD",
  "CATCH",
  "TARGET",
  "CONST",
  "CLASS",
  "SUPER",
  "WHILE",
  "RETURN",
  "EXPORT",
  "DELETE",
  "IMPORT",
  "TYPEOF",
  "SWITCH",
  "EXTENDS",
  "DEFAULT",
  "LET",
  "OF",
  "FINALLY",
  "DEBUGGER",
  "FUNCTION",
  "CONTINUE",
  "INSTANCEOF",
  "IDENTIFIERNAME",
  "GET",
  "SET",
  "STATIC",
  "DECIMALLITERAL",
  "OCTALLITERAL",
  "HEXLITERAL",
  "BYNARYLITERAL",
  "SIGNEDINTEGER",
  "COMMENT",
  "STRING_LITERAL",
  "REGEXLITERAL",
  "TEMPLATE",
  "ERROR",
  "ERROR_B",
  "NULL",
  "BOOLEANLITERAL"
  };
}

