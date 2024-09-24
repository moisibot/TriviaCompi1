package Gramaticas.reporteria;

import java_cup.runtime.*;

%%

%class LexerReporteria
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

// Palabras clave de Reportería
"REALIZAR_SOLICITUD"   { return symbol(sym.REALIZAR_SOLICITUD); }
"FIN_SOLICITUD"        { return symbol(sym.FIN_SOLICITUD); }
"REPORTE"              { return symbol(sym.REPORTE); }
"SELECCIONAR"          { return symbol(sym.SELECCIONAR); }
"FILTRAR"              { return symbol(sym.FILTRAR); }
"POR"                  { return symbol(sym.POR); }
"AND"                  { return symbol(sym.AND); }
"OR"                   { return symbol(sym.OR); }
"NOT"                  { return symbol(sym.NOT); }

// Símbolos
"{"                    { return symbol(sym.LLAVE_ABRE); }
"}"                    { return symbol(sym.LLAVE_CIERRA); }
":"                    { return symbol(sym.DOS_PUNTOS); }
","                    { return symbol(sym.COMA); }

// Operadores
"="                    { return symbol(sym.OPERADOR, yytext()); }
"<"                    { return symbol(sym.OPERADOR, yytext()); }
">"                    { return symbol(sym.OPERADOR, yytext()); }
"<="                   { return symbol(sym.OPERADOR, yytext()); }
">="                   { return symbol(sym.OPERADOR, yytext()); }
"!="                   { return symbol(sym.OPERADOR, yytext()); }

{Identifier}           { return symbol(sym.IDENTIFIER, yytext()); }
{Number}               { return symbol(sym.NUMBER, Double.parseDouble(yytext())); }
{String}               { return symbol(sym.STRING, yytext().substring(1, yytext().length() - 1)); }

{WhiteSpace}           { /* Ignorar */ }

// Error fallback
[^]                    { throw new Error("Caracter ilegal <"+yytext()+">"); }