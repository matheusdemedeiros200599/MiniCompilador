/* The following code was generated by JFlex 1.6.1 */

//Importacoes

package analisador;
import static analisador.Token.*;

//Definicoes

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Aluno/Documents/Matheus M/CC/Fase 5/Compiladores/TrabalhoCompiladores/src/main/java/analisador/Lexer.flex</tt>
 */
public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\1\6\1\6\1\5\22\0\1\3\7\0\1\13"+
    "\1\14\1\11\1\10\1\0\1\12\1\0\1\4\12\2\3\0\1\7"+
    "\3\0\27\1\1\41\2\1\4\0\1\1\1\0\1\15\1\35\1\31"+
    "\1\34\1\17\1\37\1\24\1\36\1\23\2\1\1\16\1\25\1\33"+
    "\1\21\1\40\1\26\1\22\1\32\1\20\1\27\1\30\4\1\12\0"+
    "\1\6\u1fa2\0\1\6\1\6\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\2\2\1\14\15\2\1\4"+
    "\1\15\1\0\12\2\1\16\7\2\1\17\1\2\1\20"+
    "\6\2\1\0\2\2\1\21\4\2\1\22\10\2\1\23"+
    "\1\2\1\24\1\25\6\2\1\26\11\2\1\27\1\3"+
    "\3\2\1\30\10\2\1\31\7\2\1\32\4\2\1\33"+
    "\7\2\1\34\12\2\1\35\1\2\1\36\6\2\1\37"+
    "\3\2\1\40\1\41\1\42\4\2\1\43\4\2\1\44"+
    "\1\45\4\2\1\46\6\2\1\47\2\2\1\50\12\2"+
    "\1\51\3\2\1\52\1\2\1\53\1\54\2\2\1\55"+
    "\1\2\1\56\10\2\1\57\5\2\1\60\1\61\14\2"+
    "\1\62\1\63\1\64\1\65\2\2\1\66\4\2\1\67"+
    "\1\70\2\2\1\71\1\72\1\73\1\2\1\74\4\2"+
    "\1\75\2\2\1\76\1\2\1\77\2\2\1\100";

  private static int [] zzUnpackAction() {
    int [] result = new int[267];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\42\0\104\0\146\0\42\0\210\0\252\0\42"+
    "\0\42\0\42\0\314\0\42\0\356\0\u0110\0\u0132\0\u0154"+
    "\0\u0176\0\u0198\0\u01ba\0\u01dc\0\u01fe\0\u0220\0\u0242\0\u0264"+
    "\0\u0286\0\u02a8\0\u02ca\0\u02ec\0\u030e\0\42\0\u0330\0\u0352"+
    "\0\u0374\0\u0396\0\u03b8\0\u03da\0\u03fc\0\u041e\0\u0440\0\u0462"+
    "\0\u0484\0\u04a6\0\u04c8\0\u04ea\0\u050c\0\u052e\0\u0550\0\u0572"+
    "\0\u0594\0\u05b6\0\u05d8\0\u05fa\0\u061c\0\u063e\0\u0660\0\u0682"+
    "\0\u06a4\0\u06c6\0\u06e8\0\u070a\0\u072c\0\104\0\u074e\0\u0770"+
    "\0\u0792\0\u07b4\0\104\0\u07d6\0\u07f8\0\u081a\0\u083c\0\u085e"+
    "\0\u0880\0\u08a2\0\u08c4\0\u08e6\0\u0908\0\104\0\104\0\u092a"+
    "\0\u094c\0\u096e\0\u0990\0\u09b2\0\u09d4\0\104\0\u09f6\0\u0a18"+
    "\0\u0a3a\0\u0a5c\0\u0a7e\0\u0aa0\0\u0ac2\0\u0ae4\0\u0b06\0\104"+
    "\0\42\0\u0b28\0\u0b4a\0\u0b6c\0\104\0\u0b8e\0\u0bb0\0\u0bd2"+
    "\0\u0bf4\0\u0c16\0\u0c38\0\u0c5a\0\u0c7c\0\104\0\u0c9e\0\u0cc0"+
    "\0\u0ce2\0\u0d04\0\u0d26\0\u0d48\0\u0d6a\0\104\0\u0d8c\0\u0dae"+
    "\0\u0dd0\0\u0df2\0\104\0\u0e14\0\u0e36\0\u0e58\0\u0e7a\0\u0e9c"+
    "\0\u0ebe\0\u0ee0\0\104\0\u0f02\0\u0f24\0\u0f46\0\u0f68\0\u0f8a"+
    "\0\u0fac\0\u0fce\0\u0ff0\0\u1012\0\u1034\0\104\0\u1056\0\104"+
    "\0\u1078\0\u109a\0\u10bc\0\u10de\0\u1100\0\u1122\0\104\0\u1144"+
    "\0\u1166\0\u1188\0\104\0\104\0\104\0\u11aa\0\u11cc\0\u11ee"+
    "\0\u1210\0\104\0\u1232\0\u1254\0\u1276\0\u1298\0\104\0\104"+
    "\0\u12ba\0\u12dc\0\u12fe\0\u1320\0\104\0\u1342\0\u1364\0\u1386"+
    "\0\u13a8\0\u13ca\0\u13ec\0\104\0\u140e\0\u1430\0\104\0\u1452"+
    "\0\u1474\0\u1496\0\u14b8\0\u14da\0\u14fc\0\u151e\0\u1540\0\u1562"+
    "\0\u1584\0\104\0\u15a6\0\u15c8\0\u15ea\0\104\0\u160c\0\104"+
    "\0\u162e\0\u1650\0\u1672\0\104\0\u1694\0\104\0\u16b6\0\u16d8"+
    "\0\u16fa\0\u171c\0\u173e\0\u1760\0\u1782\0\u17a4\0\104\0\u17c6"+
    "\0\u17e8\0\u180a\0\u182c\0\u184e\0\104\0\104\0\u1870\0\u1892"+
    "\0\u18b4\0\u18d6\0\u18f8\0\u191a\0\u193c\0\u195e\0\u1980\0\u19a2"+
    "\0\u19c4\0\u19e6\0\104\0\104\0\104\0\104\0\u1a08\0\u1a2a"+
    "\0\104\0\u1a4c\0\u1a6e\0\u1a90\0\u1ab2\0\104\0\104\0\u1ad4"+
    "\0\u1af6\0\104\0\104\0\104\0\u1b18\0\104\0\u1b3a\0\u1b5c"+
    "\0\u1b7e\0\u1ba0\0\104\0\u1bc2\0\u1be4\0\104\0\u1c06\0\104"+
    "\0\u1c28\0\u1c4a\0\104";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[267];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\0\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\3\1\24\2\3\1\25"+
    "\1\26\1\27\1\30\1\31\2\3\1\32\1\33\1\34"+
    "\43\0\2\3\12\0\25\3\2\0\1\4\43\0\1\35"+
    "\44\0\1\36\44\0\1\37\30\0\2\3\12\0\1\3"+
    "\1\40\1\3\1\41\1\3\1\42\17\3\1\0\2\3"+
    "\12\0\2\3\1\43\1\3\1\44\1\3\1\45\16\3"+
    "\1\0\2\3\12\0\14\3\1\46\1\47\1\50\6\3"+
    "\1\0\2\3\12\0\6\3\1\51\16\3\1\0\2\3"+
    "\12\0\12\3\1\52\12\3\1\0\2\3\12\0\2\3"+
    "\1\53\22\3\1\0\2\3\12\0\16\3\1\54\6\3"+
    "\1\0\2\3\12\0\4\3\1\55\20\3\1\0\2\3"+
    "\12\0\1\56\1\3\1\57\22\3\1\0\2\3\12\0"+
    "\1\60\4\3\1\61\17\3\1\0\2\3\12\0\2\3"+
    "\1\62\22\3\1\0\2\3\12\0\1\63\24\3\1\0"+
    "\2\3\12\0\2\3\1\64\22\3\1\0\2\3\12\0"+
    "\1\65\5\3\1\66\3\3\1\67\12\3\1\0\2\3"+
    "\12\0\1\70\4\3\1\71\17\3\1\0\2\3\12\0"+
    "\4\3\1\72\20\3\5\35\2\0\33\35\2\0\1\73"+
    "\40\0\2\3\12\0\2\3\1\74\4\3\1\75\15\3"+
    "\1\0\2\3\12\0\2\3\1\76\22\3\1\0\2\3"+
    "\12\0\11\3\1\77\13\3\1\0\2\3\12\0\6\3"+
    "\1\100\16\3\1\0\2\3\12\0\7\3\1\101\15\3"+
    "\1\0\2\3\12\0\10\3\1\102\14\3\1\0\2\3"+
    "\12\0\4\3\1\103\20\3\1\0\2\3\12\0\14\3"+
    "\1\104\10\3\1\0\2\3\12\0\3\3\1\105\5\3"+
    "\1\106\13\3\1\0\2\3\12\0\10\3\1\107\14\3"+
    "\1\0\2\3\12\0\3\3\1\110\21\3\1\0\2\3"+
    "\12\0\1\111\2\3\1\112\17\3\1\113\1\3\1\0"+
    "\2\3\12\0\3\3\1\114\2\3\1\115\16\3\1\0"+
    "\2\3\12\0\17\3\1\116\5\3\1\0\2\3\12\0"+
    "\5\3\1\117\17\3\1\0\2\3\12\0\3\3\1\120"+
    "\1\3\1\121\17\3\1\0\2\3\12\0\5\3\1\122"+
    "\7\3\1\123\7\3\1\0\2\3\12\0\4\3\1\124"+
    "\20\3\1\0\2\3\12\0\16\3\1\125\6\3\1\0"+
    "\2\3\12\0\4\3\1\126\20\3\1\0\2\3\12\0"+
    "\20\3\1\127\4\3\1\0\2\3\12\0\1\3\1\130"+
    "\12\3\1\131\10\3\1\0\2\3\12\0\10\3\1\132"+
    "\14\3\1\0\2\3\12\0\16\3\1\133\6\3\1\0"+
    "\2\3\12\0\5\3\1\134\4\3\1\135\2\3\1\136"+
    "\7\3\1\0\2\3\12\0\4\3\1\137\20\3\1\0"+
    "\2\3\12\0\12\3\1\140\12\3\2\0\1\73\11\0"+
    "\1\141\26\0\2\3\12\0\1\142\24\3\1\0\2\3"+
    "\12\0\4\3\1\143\20\3\1\0\2\3\12\0\12\3"+
    "\1\144\12\3\1\0\2\3\12\0\1\145\24\3\1\0"+
    "\2\3\12\0\6\3\1\146\16\3\1\0\2\3\12\0"+
    "\23\3\1\147\1\3\1\0\2\3\12\0\4\3\1\150"+
    "\1\151\17\3\1\0\2\3\12\0\1\152\24\3\1\0"+
    "\2\3\12\0\12\3\1\153\12\3\1\0\2\3\12\0"+
    "\2\3\1\154\22\3\1\0\2\3\12\0\5\3\1\155"+
    "\17\3\1\0\2\3\12\0\1\3\1\156\23\3\1\0"+
    "\2\3\12\0\4\3\1\157\20\3\1\0\2\3\12\0"+
    "\6\3\1\160\16\3\1\0\2\3\12\0\2\3\1\161"+
    "\22\3\1\0\2\3\12\0\14\3\1\162\10\3\1\0"+
    "\2\3\12\0\4\3\1\163\20\3\1\0\2\3\12\0"+
    "\17\3\1\164\5\3\1\0\2\3\12\0\1\165\24\3"+
    "\1\0\2\3\12\0\4\3\1\166\20\3\1\0\2\3"+
    "\12\0\16\3\1\167\6\3\1\0\2\3\12\0\1\170"+
    "\24\3\1\0\2\3\12\0\12\3\1\171\12\3\1\0"+
    "\2\3\12\0\15\3\1\172\7\3\1\0\2\3\12\0"+
    "\1\173\24\3\1\0\2\3\12\0\1\174\1\3\1\175"+
    "\2\3\1\176\7\3\1\177\4\3\1\200\1\201\1\3"+
    "\1\0\2\3\12\0\14\3\1\202\10\3\1\0\2\3"+
    "\12\0\1\203\24\3\1\0\2\3\12\0\15\3\1\204"+
    "\7\3\1\0\2\3\12\0\15\3\1\205\7\3\1\0"+
    "\2\3\12\0\14\3\1\206\10\3\1\0\2\3\12\0"+
    "\3\3\1\207\21\3\1\0\2\3\12\0\5\3\1\210"+
    "\17\3\1\0\2\3\12\0\6\3\1\211\16\3\1\0"+
    "\2\3\12\0\14\3\1\212\10\3\1\0\2\3\12\0"+
    "\1\213\24\3\1\0\2\3\12\0\1\3\1\214\23\3"+
    "\1\0\2\3\12\0\2\3\1\215\22\3\1\0\2\3"+
    "\12\0\4\3\1\216\20\3\1\0\2\3\12\0\1\217"+
    "\24\3\1\0\2\3\12\0\5\3\1\220\17\3\1\0"+
    "\2\3\12\0\4\3\1\221\20\3\1\0\2\3\12\0"+
    "\5\3\1\222\17\3\1\0\2\3\12\0\3\3\1\223"+
    "\21\3\1\0\2\3\12\0\5\3\1\224\1\225\16\3"+
    "\1\0\2\3\12\0\6\3\1\226\16\3\1\0\2\3"+
    "\12\0\5\3\1\227\17\3\1\0\2\3\12\0\1\230"+
    "\24\3\1\0\2\3\12\0\14\3\1\231\10\3\1\0"+
    "\2\3\12\0\4\3\1\232\20\3\1\0\2\3\12\0"+
    "\4\3\1\233\20\3\1\0\2\3\12\0\7\3\1\234"+
    "\15\3\1\0\2\3\12\0\4\3\1\235\20\3\1\0"+
    "\2\3\12\0\1\3\1\236\23\3\1\0\2\3\12\0"+
    "\15\3\1\237\1\240\6\3\1\0\2\3\12\0\2\3"+
    "\1\241\22\3\1\0\2\3\12\0\2\3\1\242\22\3"+
    "\1\0\2\3\12\0\12\3\1\243\12\3\1\0\2\3"+
    "\12\0\1\244\4\3\1\245\17\3\1\0\2\3\12\0"+
    "\1\246\24\3\1\0\2\3\12\0\1\247\24\3\1\0"+
    "\2\3\12\0\4\3\1\250\20\3\1\0\2\3\12\0"+
    "\2\3\1\251\22\3\1\0\2\3\12\0\4\3\1\252"+
    "\20\3\1\0\2\3\12\0\6\3\1\253\16\3\1\0"+
    "\2\3\12\0\13\3\1\254\11\3\1\0\2\3\12\0"+
    "\4\3\1\255\20\3\1\0\2\3\12\0\3\3\1\256"+
    "\21\3\1\0\2\3\12\0\21\3\1\257\3\3\1\0"+
    "\2\3\12\0\13\3\1\260\11\3\1\0\2\3\12\0"+
    "\16\3\1\261\6\3\1\0\2\3\12\0\14\3\1\262"+
    "\10\3\1\0\2\3\12\0\16\3\1\263\6\3\1\0"+
    "\2\3\12\0\1\264\24\3\1\0\2\3\12\0\5\3"+
    "\1\265\17\3\1\0\2\3\12\0\5\3\1\266\17\3"+
    "\1\0\2\3\12\0\4\3\1\267\20\3\1\0\2\3"+
    "\12\0\17\3\1\270\5\3\1\0\2\3\12\0\3\3"+
    "\1\271\21\3\1\0\2\3\12\0\10\3\1\272\14\3"+
    "\1\0\2\3\12\0\7\3\1\273\15\3\1\0\2\3"+
    "\12\0\14\3\1\274\10\3\1\0\2\3\12\0\11\3"+
    "\1\275\13\3\1\0\2\3\12\0\23\3\1\276\1\3"+
    "\1\0\2\3\12\0\16\3\1\277\6\3\1\0\2\3"+
    "\12\0\5\3\1\300\17\3\1\0\2\3\12\0\4\3"+
    "\1\301\20\3\1\0\2\3\12\0\4\3\1\302\20\3"+
    "\1\0\2\3\12\0\17\3\1\303\5\3\1\0\2\3"+
    "\12\0\5\3\1\304\17\3\1\0\2\3\12\0\3\3"+
    "\1\305\21\3\1\0\2\3\12\0\4\3\1\306\20\3"+
    "\1\0\2\3\12\0\2\3\1\307\22\3\1\0\2\3"+
    "\12\0\1\310\24\3\1\0\2\3\12\0\1\311\24\3"+
    "\1\0\2\3\12\0\3\3\1\312\21\3\1\0\2\3"+
    "\12\0\1\313\24\3\1\0\2\3\12\0\2\3\1\314"+
    "\22\3\1\0\2\3\12\0\4\3\1\315\20\3\1\0"+
    "\2\3\12\0\4\3\1\316\20\3\1\0\2\3\12\0"+
    "\2\3\1\317\22\3\1\0\2\3\12\0\2\3\1\320"+
    "\22\3\1\0\2\3\12\0\2\3\1\321\22\3\1\0"+
    "\2\3\12\0\4\3\1\322\20\3\1\0\2\3\12\0"+
    "\4\3\1\323\20\3\1\0\2\3\12\0\12\3\1\324"+
    "\12\3\1\0\2\3\12\0\6\3\1\325\16\3\1\0"+
    "\2\3\12\0\14\3\1\326\10\3\1\0\2\3\12\0"+
    "\1\327\24\3\1\0\2\3\12\0\14\3\1\330\10\3"+
    "\1\0\2\3\12\0\6\3\1\331\16\3\1\0\2\3"+
    "\12\0\6\3\1\332\16\3\1\0\2\3\12\0\10\3"+
    "\1\333\14\3\1\0\2\3\12\0\1\3\1\334\23\3"+
    "\1\0\2\3\12\0\1\3\1\335\23\3\1\0\2\3"+
    "\12\0\4\3\1\336\20\3\1\0\2\3\12\0\15\3"+
    "\1\337\7\3\1\0\2\3\12\0\10\3\1\340\14\3"+
    "\1\0\2\3\12\0\6\3\1\341\16\3\1\0\2\3"+
    "\12\0\5\3\1\342\17\3\1\0\2\3\12\0\3\3"+
    "\1\343\21\3\1\0\2\3\12\0\5\3\1\344\17\3"+
    "\1\0\2\3\12\0\1\3\1\345\23\3\1\0\2\3"+
    "\12\0\1\346\24\3\1\0\2\3\12\0\3\3\1\347"+
    "\21\3\1\0\2\3\12\0\1\350\24\3\1\0\2\3"+
    "\12\0\2\3\1\351\22\3\1\0\2\3\12\0\10\3"+
    "\1\352\14\3\1\0\2\3\12\0\4\3\1\353\20\3"+
    "\1\0\2\3\12\0\4\3\1\354\20\3\1\0\2\3"+
    "\12\0\1\355\24\3\1\0\2\3\12\0\4\3\1\356"+
    "\20\3\1\0\2\3\12\0\23\3\1\357\1\3\1\0"+
    "\2\3\12\0\5\3\1\360\17\3\1\0\2\3\12\0"+
    "\2\3\1\361\22\3\1\0\2\3\12\0\5\3\1\362"+
    "\17\3\1\0\2\3\12\0\6\3\1\363\16\3\1\0"+
    "\2\3\12\0\21\3\1\364\3\3\1\0\2\3\12\0"+
    "\16\3\1\365\6\3\1\0\2\3\12\0\1\366\24\3"+
    "\1\0\2\3\12\0\4\3\1\367\20\3\1\0\2\3"+
    "\12\0\17\3\1\370\5\3\1\0\2\3\12\0\2\3"+
    "\1\371\22\3\1\0\2\3\12\0\1\372\24\3\1\0"+
    "\2\3\12\0\4\3\1\373\20\3\1\0\2\3\12\0"+
    "\4\3\1\374\20\3\1\0\2\3\12\0\3\3\1\375"+
    "\21\3\1\0\2\3\12\0\1\376\24\3\1\0\2\3"+
    "\12\0\3\3\1\377\21\3\1\0\2\3\12\0\6\3"+
    "\1\u0100\16\3\1\0\2\3\12\0\16\3\1\u0101\6\3"+
    "\1\0\2\3\12\0\10\3\1\u0102\14\3\1\0\2\3"+
    "\12\0\4\3\1\u0103\20\3\1\0\2\3\12\0\10\3"+
    "\1\u0104\14\3\1\0\2\3\12\0\3\3\1\u0105\21\3"+
    "\1\0\2\3\12\0\4\3\1\u0106\20\3\1\0\2\3"+
    "\12\0\2\3\1\u0107\22\3\1\0\2\3\12\0\4\3"+
    "\1\u0108\20\3\1\0\2\3\12\0\16\3\1\u0109\6\3"+
    "\1\0\2\3\12\0\3\3\1\u010a\21\3\1\0\2\3"+
    "\12\0\4\3\1\u010b\20\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7276];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\2\1\3\11\1\1\1\11"+
    "\21\1\1\11\1\0\33\1\1\0\45\1\1\11\252\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[267];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
public String lexema;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 142) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return ERRO;
            }
          case 65: break;
          case 2: 
            { lexema=yytext(); return ID;
            }
          case 66: break;
          case 3: 
            { lexema=yytext(); return NUM_INTEIRO;
            }
          case 67: break;
          case 4: 
            { /*Ignore*/
            }
          case 68: break;
          case 5: 
            { return DIVISAO;
            }
          case 69: break;
          case 6: 
            { return ATRIBUICAO;
            }
          case 70: break;
          case 7: 
            { return SOMA;
            }
          case 71: break;
          case 8: 
            { return MULTIPLICACAO;
            }
          case 72: break;
          case 9: 
            { return SUBTRACAO;
            }
          case 73: break;
          case 10: 
            { return ABRE_PARENTESIS;
            }
          case 74: break;
          case 11: 
            { return FECHA_PARENTESIS;
            }
          case 75: break;
          case 12: 
            { return E;
            }
          case 76: break;
          case 13: 
            { return COMPARACAO;
            }
          case 77: break;
          case 14: 
            { return OU;
            }
          case 78: break;
          case 15: 
            { return SE;
            }
          case 79: break;
          case 16: 
            { return DE;
            }
          case 80: break;
          case 17: 
            { return ATE;
            }
          case 81: break;
          case 18: 
            { return ECO;
            }
          case 82: break;
          case 19: 
            { return INT;
            }
          case 83: break;
          case 20: 
            { return MOD;
            }
          case 84: break;
          case 21: 
            { return VAR;
            }
          case 85: break;
          case 22: 
            { return NAO;
            }
          case 86: break;
          case 23: 
            { return XOU;
            }
          case 87: break;
          case 24: 
            { return LEIA;
            }
          case 88: break;
          case 25: 
            { return REAL;
            }
          case 89: break;
          case 26: 
            { return CASO;
            }
          case 90: break;
          case 27: 
            { return FACA;
            }
          case 91: break;
          case 28: 
            { return PARA;
            }
          case 92: break;
          case 29: 
            { return ENTAO;
            }
          case 93: break;
          case 30: 
            { return TIMER;
            }
          case 94: break;
          case 31: 
            { return VETOR;
            }
          case 95: break;
          case 32: 
            { return SENAO;
            }
          case 96: break;
          case 33: 
            { return DEBUG;
            }
          case 97: break;
          case 34: 
            { return FALSO;
            }
          case 98: break;
          case 35: 
            { return FIMSE;
            }
          case 99: break;
          case 36: 
            { return PAUSA;
            }
          case 100: break;
          case 37: 
            { return PASSO;
            }
          case 101: break;
          case 38: 
            { return LOGICO;
            }
          case 102: break;
          case 39: 
            { return REPITA;
            }
          case 103: break;
          case 40: 
            { return INICIO;
            }
          case 104: break;
          case 41: 
            { return FUNCAO;
            }
          case 105: break;
          case 42: 
            { return ARQUIVO;
            }
          case 106: break;
          case 43: 
            { return ESCOLHA;
            }
          case 107: break;
          case 44: 
            { return ESCREVA;
            }
          case 108: break;
          case 45: 
            { return RETORNE;
            }
          case 109: break;
          case 46: 
            { return INTEIRO;
            }
          case 110: break;
          case 47: 
            { return FIMPARA;
            }
          case 111: break;
          case 48: 
            { return ESCREVAL;
            }
          case 112: break;
          case 49: 
            { return ENQUANTO;
            }
          case 113: break;
          case 50: 
            { return ALEATORIO;
            }
          case 114: break;
          case 51: 
            { return ALGORITMO;
            }
          case 115: break;
          case 52: 
            { return LIMPATELA;
            }
          case 116: break;
          case 53: 
            { return OUTROCASO;
            }
          case 117: break;
          case 54: 
            { return CARACTERE;
            }
          case 118: break;
          case 55: 
            { return FIMREPITA;
            }
          case 119: break;
          case 56: 
            { return FIMFUNCAO;
            }
          case 120: break;
          case 57: 
            { return INTERROMPA;
            }
          case 121: break;
          case 58: 
            { return VERDADEIRO;
            }
          case 122: break;
          case 59: 
            { return CRONOMETRO;
            }
          case 123: break;
          case 60: 
            { return FIMESCOLHA;
            }
          case 124: break;
          case 61: 
            { return FIMENQUANTO;
            }
          case 125: break;
          case 62: 
            { return FIMALGORITMO;
            }
          case 126: break;
          case 63: 
            { return PROCEDIMENTO;
            }
          case 127: break;
          case 64: 
            { return FIMPROCEDIMENTO;
            }
          case 128: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
