
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Gramaticas.user;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\002\003\000\002\010" +
    "\004\000\002\010\004\000\002\010\004\000\002\010\004" +
    "\000\002\003\011\000\002\004\007\000\002\005\003\000" +
    "\002\005\005\000\002\006\005\000\002\006\005\000\002" +
    "\007\003\000\002\007\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\044\000\012\015\011\016\004\017\010\020\006\001" +
    "\002\000\004\004\012\001\002\000\004\002\000\001\002" +
    "\000\004\004\012\001\002\000\004\002\044\001\002\000" +
    "\004\004\012\001\002\000\004\004\012\001\002\000\004" +
    "\005\014\001\002\000\004\002\uffff\001\002\000\004\025" +
    "\015\001\002\000\004\007\016\001\002\000\004\024\020" +
    "\001\002\000\004\010\041\001\002\000\004\014\021\001" +
    "\002\000\004\011\022\001\002\000\006\007\023\024\025" +
    "\001\002\000\006\007\023\024\025\001\002\000\006\012" +
    "\035\013\034\001\002\000\004\014\027\001\002\000\010" +
    "\010\ufff9\012\ufff9\013\ufff9\001\002\000\010\024\033\025" +
    "\030\026\032\001\002\000\010\010\ufff5\012\ufff5\013\ufff5" +
    "\001\002\000\010\010\ufff6\012\ufff6\013\ufff6\001\002\000" +
    "\010\010\ufff4\012\ufff4\013\ufff4\001\002\000\010\010\ufff3" +
    "\012\ufff3\013\ufff3\001\002\000\006\007\023\024\025\001" +
    "\002\000\004\010\ufffa\001\002\000\010\010\ufff8\012\ufff8" +
    "\013\ufff8\001\002\000\006\010\040\013\034\001\002\000" +
    "\010\010\ufff7\012\ufff7\013\ufff7\001\002\000\004\006\042" +
    "\001\002\000\004\002\ufffb\001\002\000\004\002\ufffd\001" +
    "\002\000\004\002\001\001\002\000\004\002\ufffc\001\002" +
    "\000\004\002\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\044\000\006\002\006\010\004\001\001\000\004\003" +
    "\045\001\001\000\002\001\001\000\004\003\044\001\001" +
    "\000\002\001\001\000\004\003\042\001\001\000\004\003" +
    "\012\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\004\016\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\005\023\006\025\001\001\000\006\005\036\006\025\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\007\030\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\006\035" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public void syntax_error(Symbol s) {
        System.out.println("Error sintáctico en la línea " + (s.left + 1) + " columna " + s.right + ". Token inesperado: " + s.value);
    }
 
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception {
        System.out.println("Error sintáctico irrecuperable en la línea " + (s.left + 1) + " columna " + s.right + ". Token inesperado: " + s.value);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= programa EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Map<String,Object> start_val = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // programa ::= solicitud_usuario 
            {
              Map<String,Object> RESULT =null;
		int suleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int suright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Map<String,Object> su = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
               RESULT = su;
           
              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // solicitud_usuario ::= USUARIO_NUEVO solicitud_xson 
            {
              Map<String,Object> RESULT =null;
		int sxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sxright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Map<String,Object> sx = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        Map<String, Object> result = new HashMap<>();
                        result.put("tipo", "USUARIO_NUEVO");
                        result.put("datos", sx);
                        RESULT = result;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("solicitud_usuario",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // solicitud_usuario ::= MODIFICAR_USUARIO solicitud_xson 
            {
              Map<String,Object> RESULT =null;
		int sxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sxright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Map<String,Object> sx = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        Map<String, Object> result = new HashMap<>();
                        result.put("tipo", "MODIFICAR_USUARIO");
                        result.put("datos", sx);
                        RESULT = result;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("solicitud_usuario",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // solicitud_usuario ::= ELIMINAR_USUARIO solicitud_xson 
            {
              Map<String,Object> RESULT =null;
		int sxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sxright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Map<String,Object> sx = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        Map<String, Object> result = new HashMap<>();
                        result.put("tipo", "ELIMINAR_USUARIO");
                        result.put("datos", sx);
                        RESULT = result;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("solicitud_usuario",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // solicitud_usuario ::= LOGIN_USUARIO solicitud_xson 
            {
              Map<String,Object> RESULT =null;
		int sxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sxright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Map<String,Object> sx = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        Map<String, Object> result = new HashMap<>();
                        result.put("tipo", "LOGIN_USUARIO");
                        result.put("datos", sx);
                        RESULT = result;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("solicitud_usuario",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // solicitud_xson ::= XSON_VERSION REALIZAR_SOLICITUD STRING LLAVE_ABRE bloque_parametros LLAVE_CIERRA FIN_SOLICITUD 
            {
              Map<String,Object> RESULT =null;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int bpleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int bpright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<Map<String,Object>> bp = (List<Map<String,Object>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                     Map<String, Object> result = new HashMap<>();
                     result.put("version", "XSON_VERSION");
                     result.put("tipo_solicitud", tipo);
                     result.put("parametros", bp);
                     RESULT = result;
                 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("solicitud_xson",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // bloque_parametros ::= IDENTIFIER DOS_PUNTOS CORCHETE_ABRE lista_parametros CORCHETE_CIERRA 
            {
              List<Map<String,Object>> RESULT =null;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String nombre = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int lpleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int lpright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<Map<String,Object>> lp = (List<Map<String,Object>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                        RESULT = lp;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bloque_parametros",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // lista_parametros ::= parametro 
            {
              List<Map<String,Object>> RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Map<String,Object> p = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                       List<Map<String, Object>> list = new ArrayList<>();
                       list.add(p);
                       RESULT = list;
                   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("lista_parametros",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // lista_parametros ::= lista_parametros COMA parametro 
            {
              List<Map<String,Object>> RESULT =null;
		int lpleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lpright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<Map<String,Object>> lp = (List<Map<String,Object>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Map<String,Object> p = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                       lp.add(p);
                       RESULT = lp;
                   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("lista_parametros",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // parametro ::= LLAVE_ABRE lista_parametros LLAVE_CIERRA 
            {
              Map<String,Object> RESULT =null;
		int lpleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int lpright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<Map<String,Object>> lp = (List<Map<String,Object>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                Map<String, Object> map = new HashMap<>();
                map.put("subparametros", lp);
                RESULT = map;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametro",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // parametro ::= IDENTIFIER DOS_PUNTOS valor 
            {
              Map<String,Object> RESULT =null;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String nombre = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                Map<String, Object> map = new HashMap<>();
                map.put(nombre, v);
                RESULT = map;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametro",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // valor ::= STRING 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            RESULT = s;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // valor ::= NUMBER 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            RESULT = n;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // valor ::= IDENTIFIER 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            RESULT = id;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
