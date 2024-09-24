package Gramaticas;
import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.LinkedList;

%%
%class Lexico
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
    
    private LinkedList<String> listaErrores;
%}

%init{
    yyline = 1;
    yycolumn = 1;
    listaErrores = new LinkedList<>();
    yybegin(YYINITIAL);
%init}

SaltosLinea     = \r|\n|\r\n
EspaciosBlancos = {SaltosLinea} | [ \t\f]
Identificador   = [a-zA-Z_$][a-zA-Z0-9_$]*
Enteros         = 0 | ([1-9][0-9]*)
Decimal         = {Enteros}\.[0-9]+
ComentarioLinea = "//".*
ComentarioMultilinea = "/*" ~"*/"
NumeroNegativo  = -({Enteros}|{Decimal})

// XSON tokens
XSON_VERSION = "<?xson version=\"1.0\" ?>"
REALIZAR_SOLICITUD = "<!realizar_solicitud:"
FIN_SOLICITUD = "<fin_solicitud_realizada!>"
REALIZAR_SOLICITUDES = "<!realizar_solicitudes>"
FIN_SOLICITUDES = "<!fin_solicitudes_realizada>"
LLAVE_ABRE = "{"
LLAVE_CIERRA = "}"
CORCHETE_ABRE = "["
CORCHETE_CIERRA = "]"
COMA = ","
DOS_PUNTOS = ":"
BLOQUE_PARAMETROS = "\"bloque_parametros\""

// SQLKV tokens
SELECCIONAR = "SELECCIONAR"
REPORTE = "REPORTE"
FILTRAR = "FILTRAR"
POR = "POR"
AND = "AND"
OR = "OR"
NOT = "NOT"

// Solicitudes específicas
USUARIO_NUEVO = "USUARIO_NUEVO"
MODIFICAR_USUARIO = "MODIFICAR_USUARIO"
ELIMINAR_USUARIO = "ELIMINAR_USUARIO"
LOGIN_USUARIO = "LOGIN_USUARIO"
NUEVA_TRIVIA = "NUEVA_TRIVIA"
ELIMINAR_TRIVIA = "ELIMINAR_TRIVIA"
MODIFICAR_TRIVIA = "MODIFICAR_TRIVIA"
AGREGAR_COMPONENTE = "AGREGAR_COMPONENTE"
ELIMINAR_COMPONENTE = "ELIMINAR_COMPONENTE"
MODIFICAR_COMPONENTE = "MODIFICAR_COMPONENTE"

// Parámetros comunes
ID_TRIVIA = "ID_TRIVIA"
USUARIO = "USUARIO"
PASSWORD = "PASSWORD"
NOMBRE = "NOMBRE"
TIEMPO_PREGUNTA = "TIEMPO_PREGUNTA"
TEMA = "TEMA"
FECHA_CREACION = "FECHA_CREACION"
FECHA_MODIFICACION = "FECHA_MODIFICACION"
INSTITUCION = "INSTITUCION"
USUARIO_CREACION = "USUARIO_CREACION"
USUARIO_ANTIGUO = "USUARIO_ANTIGUO"
USUARIO_NUEVO = "USUARIO_NUEVO"
NUEVO_PASSWORD = "NUEVO_PASSWORD"

// Clases de componentes
CAMPO_TEXTO = "CAMPO_TEXTO"
AREA_TEXTO = "AREA_TEXTO"
CHECKBOX = "CHECKBOX"
RADIO = "RADIO"
FICHERO = "FICHERO"
COMBO = "COMBO"

// Parámetros de componentes
ID = "ID"
TRIVIA = "TRIVIA"
CLASE = "CLASE"
INDICE = "INDICE"
TEXTO_VISIBLE = "TEXTO_VISIBLE"
OPCIONES = "OPCIONES"
FILAS = "FILAS"
COLUMNAS = "COLUMNAS"
RESPUESTA = "RESPUESTA"

// Common tokens
STRING = \"([^\"\\]|\\[\"\\bfnrt])*\"
NUMBER = {Enteros} | {Decimal} | {NumeroNegativo}
OPERADOR = "<" | ">" | "=" | ">=" | "<=" | "!="
FECHA = [0-9]{4}-[0-9]{2}-[0-9]{2}
ID_ESPECIAL = [$_-][a-zA-Z0-9_$-]*
SEPARADOR_OPCIONES = "|"
BOOLEAN = "true" | "false"

%%
<YYINITIAL> {
    // XSON rules
    {XSON_VERSION}      { return symbol(sym.XSON_VERSION); }
    {REALIZAR_SOLICITUD} { return symbol(sym.REALIZAR_SOLICITUD); }
    {FIN_SOLICITUD}     { return symbol(sym.FIN_SOLICITUD); }
    {REALIZAR_SOLICITUDES} { return symbol(sym.REALIZAR_SOLICITUDES); }
    {FIN_SOLICITUDES}   { return symbol(sym.FIN_SOLICITUDES); }
    {LLAVE_ABRE}        { return symbol(sym.LLAVE_ABRE); }
    {LLAVE_CIERRA}      { return symbol(sym.LLAVE_CIERRA); }
    {CORCHETE_ABRE}     { return symbol(sym.CORCHETE_ABRE); }
    {CORCHETE_CIERRA}   { return symbol(sym.CORCHETE_CIERRA); }
    {COMA}              { return symbol(sym.COMA); }
    {DOS_PUNTOS}        { return symbol(sym.DOS_PUNTOS); }
    {BLOQUE_PARAMETROS} { return symbol(sym.BLOQUE_PARAMETROS); }

    // SQLKV rules
    {SELECCIONAR}       { return symbol(sym.SELECCIONAR); }
    {REPORTE}           { return symbol(sym.REPORTE); }
    {FILTRAR}           { return symbol(sym.FILTRAR); }
    {POR}               { return symbol(sym.POR); }
    {AND}               { return symbol(sym.AND); }
    {OR}                { return symbol(sym.OR); }
    {NOT}               { return symbol(sym.NOT); }

    // Solicitudes específicas
    {USUARIO_NUEVO}     { return symbol(sym.USUARIO_NUEVO); }
    {MODIFICAR_USUARIO} { return symbol(sym.MODIFICAR_USUARIO); }
    {ELIMINAR_USUARIO}  { return symbol(sym.ELIMINAR_USUARIO); }
    {LOGIN_USUARIO}     { return symbol(sym.LOGIN_USUARIO); }
    {NUEVA_TRIVIA}      { return symbol(sym.NUEVA_TRIVIA); }
    {ELIMINAR_TRIVIA}   { return symbol(sym.ELIMINAR_TRIVIA); }
    {MODIFICAR_TRIVIA}  { return symbol(sym.MODIFICAR_TRIVIA); }
    {AGREGAR_COMPONENTE} { return symbol(sym.AGREGAR_COMPONENTE); }
    {ELIMINAR_COMPONENTE} { return symbol(sym.ELIMINAR_COMPONENTE); }
    {MODIFICAR_COMPONENTE} { return symbol(sym.MODIFICAR_COMPONENTE); }

    // Parámetros comunes
    {ID_TRIVIA}         { return symbol(sym.ID_TRIVIA); }
    {USUARIO}           { return symbol(sym.USUARIO); }
    {PASSWORD}          { return symbol(sym.PASSWORD); }
    {NOMBRE}            { return symbol(sym.NOMBRE); }
    {TIEMPO_PREGUNTA}   { return symbol(sym.TIEMPO_PREGUNTA); }
    {TEMA}              { return symbol(sym.TEMA); }
    {FECHA_CREACION}    { return symbol(sym.FECHA_CREACION); }
    {FECHA_MODIFICACION} { return symbol(sym.FECHA_MODIFICACION); }
    {INSTITUCION}       { return symbol(sym.INSTITUCION); }
    {USUARIO_CREACION}  { return symbol(sym.USUARIO_CREACION); }
    {USUARIO_ANTIGUO}   { return symbol(sym.USUARIO_ANTIGUO); }
    {USUARIO_NUEVO}     { return symbol(sym.USUARIO_NUEVO); }
    {NUEVO_PASSWORD}    { return symbol(sym.NUEVO_PASSWORD); }

    // Clases de componentes
    {CAMPO_TEXTO}       { return symbol(sym.CAMPO_TEXTO); }
    {AREA_TEXTO}        { return symbol(sym.AREA_TEXTO); }
    {CHECKBOX}          { return symbol(sym.CHECKBOX); }
    {RADIO}             { return symbol(sym.RADIO); }
    {FICHERO}           { return symbol(sym.FICHERO); }
    {COMBO}             { return symbol(sym.COMBO); }

    // Parámetros de componentes
    {ID}                { return symbol(sym.ID); }
    {TRIVIA}            { return symbol(sym.TRIVIA); }
    {CLASE}             { return symbol(sym.CLASE); }
    {INDICE}            { return symbol(sym.INDICE); }
    {TEXTO_VISIBLE}     { return symbol(sym.TEXTO_VISIBLE); }
    {OPCIONES}          { return symbol(sym.OPCIONES); }
    {FILAS}             { return symbol(sym.FILAS); }
    {COLUMNAS}          { return symbol(sym.COLUMNAS); }
    {RESPUESTA}         { return symbol(sym.RESPUESTA); }

    // Common rules
    {Identificador}     { return symbol(sym.IDENTIFIER, yytext()); }
    {STRING}            { return symbol(sym.STRING, yytext()); }
    {NUMBER}            { return symbol(sym.NUMBER, Double.parseDouble(yytext())); }
    {OPERADOR}          { return symbol(sym.OPERADOR, yytext()); }
    {FECHA}             { return symbol(sym.FECHA, yytext()); }
    {ID_ESPECIAL}       { return symbol(sym.ID_ESPECIAL, yytext()); }
    {SEPARADOR_OPCIONES} { return symbol(sym.SEPARADOR_OPCIONES); }
    {BOOLEAN}           { return symbol(sym.BOOLEAN, Boolean.parseBoolean(yytext())); }
    {EspaciosBlancos}   { /* ignorar */ }
    {ComentarioLinea}   { /* ignorar */ }
    {ComentarioMultilinea} { /* ignorar */ }

    // Error fallback
    [^] { 
        String errorMsg = "Error lexico: Caracter invalido <" + yytext() + "> en linea " + (yyline + 1) + ", columna " + (yycolumn + 1) + ")";
        listaErrores.add(errorMsg);
        System.out.println(errorMsg);
    }
}

<<EOF>> { return symbol(sym.EOF); }