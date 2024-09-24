package Gramaticas.web;
import java_cup.runtime.*;

%%

%class LexerWeb
%public
%unicode
%standalone
%cup
%line
%column
%ignorecase
%{
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]
Identifier     = [:jletter:] [:jletterdigit:]*
Number         = [0-9]+ ("." [0-9]+)?
String         = \"[^\"]*\"

%%

// Palabras clave de Web
"REALIZAR_SOLICITUD"   { return symbol(sym.REALIZAR_SOLICITUD); }
"FIN_SOLICITUD"        { return symbol(sym.FIN_SOLICITUD); }
"NUEVA_TRIVIA"         { return symbol(sym.NUEVA_TRIVIA); }
"MODIFICAR_TRIVIA"     { return symbol(sym.MODIFICAR_TRIVIA); }
"ELIMINAR_TRIVIA"      { return symbol(sym.ELIMINAR_TRIVIA); }
"AGREGAR_COMPONENTE"   { return symbol(sym.AGREGAR_COMPONENTE); }
"MODIFICAR_COMPONENTE" { return symbol(sym.MODIFICAR_COMPONENTE); }
"ELIMINAR_COMPONENTE"  { return symbol(sym.ELIMINAR_COMPONENTE); }

// Símbolos
"{"                    { return symbol(sym.LLAVE_ABRE); }
"}"                    { return symbol(sym.LLAVE_CIERRA); }
":"                    { return symbol(sym.DOS_PUNTOS); }
","                    { return symbol(sym.COMA); }

{Identifier}           { return symbol(sym.IDENTIFIER, yytext()); }
{Number}               { return symbol(sym.NUMBER, Double.parseDouble(yytext())); }
{String}               { return symbol(sym.STRING, yytext().substring(1, yytext().length() - 1)); }

{WhiteSpace}           { /* Ignorar */ }

// Error fallback
[^]                    { throw new Error("Caracter ilegal <"+yytext()+">"); }