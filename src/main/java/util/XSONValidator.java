package util;

import Gramaticas.*;
import java.io.StringReader;

public class XSONValidator {
    public static boolean validarXSON(String xsonData) {
         try {
        Lexico lexer = new Lexico(new StringReader(xsonData));
        parser parser = new parser(lexer);       
            parser.parse();
            return true;
        } catch (Exception e) {
             System.err.println("Error de validación XSON: " + e.getMessage());
            return false;
        }
    }
}