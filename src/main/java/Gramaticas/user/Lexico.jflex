package Gramaticas.user;
import java_cup.runtime.*;
%%

%class LexerUsuario
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

// Palabras clave de Usuario
"REALIZAR_SOLICITUD"   { return symbol(sym.REALIZAR_SOLICITUD); }
"FIN_SOLICITUD"        { return symbol(sym.FIN_SOLICITUD); }
"USUARIO_NUEVO"        { return symbol(sym.USUARIO_NUEVO); }
"MODIFICAR_USUARIO"    { return symbol(sym.MODIFICAR_USUARIO); }
"ELIMINAR_USUARIO"     { return symbol(sym.ELIMINAR_USUARIO); }
"LOGIN_USUARIO"        { return symbol(sym.LOGIN_USUARIO); }

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