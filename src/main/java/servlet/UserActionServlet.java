
package servlet;

import Gramaticas.user.LexerUsuario;
import Gramaticas.user.parser;
import java.io.IOException;
import java.io.StringReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java_cup.runtime.Symbol;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet("/UserActionServlet")
public class UserActionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String xsonInput = request.getParameter("xsonInput");
        
        try {
            Map<String, Object> result = parseXsonWithYourParser(xsonInput);
            
            if (result.containsKey("realizar_solicitud")) {
                String solicitud = (String) result.get("realizar_solicitud");
                Map<String, Object> datosUsuario = (Map<String, Object>) ((Map<String, Object>) result.get("DATOS_USUARIO")).get(0);
                
                switch (solicitud) {
                    case "USUARIO_NUEVO":
                        crearUsuario(datosUsuario, request, response);
                        break;
                    case "MODIFICAR_USUARIO":
                        modificarUsuario(datosUsuario, request, response);
                        break;
                    case "ELIMINAR_USUARIO":
                        eliminarUsuario(datosUsuario, request, response);
                        break;
                    case "LOGIN_USUARIO":
                        loginUsuario(datosUsuario, request, response);
                        break;
                    default:
                        throw new Exception("Solicitud desconocida: " + solicitud);
                }
            } else {
                throw new Exception("No se especificó solicitud en XSON");
            }
        } catch (Exception e) {
            request.setAttribute("error", "Error al procesar XSON: " + e.getMessage());
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        }
    }

    private Map<String, Object> parseXsonWithYourParser(String input) throws Exception {
        LexerUsuario lexer = new LexerUsuario(new StringReader(input));
        parser parser = new parser(lexer);
        Symbol result = parser.parse();
        return (Map<String, Object>) result.value;
    }

    private void crearUsuario(Map<String, Object> datosUsuario, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = (String) datosUsuario.get("USUARIO");
        String password = (String) datosUsuario.get("PASSWORD");
        String nombre = (String) datosUsuario.get("NOMBRE");
        String institucion = (String) datosUsuario.get("INSTITUCION");
        
        // Aquí deberías implementar la lógica para crear un nuevo usuario en tu sistema
        // Por ejemplo, usando un DAO para insertar en la base de datos
        
        boolean exito = true/* Llamada a tu lógica de negocio para crear usuario */;
        
        if (exito) {
            request.setAttribute("mensaje", "Usuario creado exitosamente");
        } else {
            request.setAttribute("error", "No se pudo crear el usuario");
        }
        request.getRequestDispatcher("/WEB-INF/views/resultado.jsp").forward(request, response);
    }

    private void modificarUsuario(Map<String, Object> datosUsuario, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuarioAntiguo = (String) datosUsuario.get("USUARIO_ANTIGUO");
        String usuarioNuevo = (String) datosUsuario.get("USUARIO_NUEVO");
        String nuevoPassword = (String) datosUsuario.get("NUEVO_PASSWORD");
        String institucion = (String) datosUsuario.get("INSTITUCION");
        
        // Implementa la lógica para modificar el usuario
        
        boolean exito = true/* Llamada a tu lógica de negocio para modificar usuario */;
        
        if (exito) {
            request.setAttribute("mensaje", "Usuario modificado exitosamente");
        } else {
            request.setAttribute("error", "No se pudo modificar el usuario");
        }
        request.getRequestDispatcher("/WEB-INF/views/resultado.jsp").forward(request, response);
    }

    private void eliminarUsuario(Map<String, Object> datosUsuario, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = (String) datosUsuario.get("USUARIO");
        
        // Implementa la lógica para eliminar el usuario
        
        boolean exito = true/* Llamada a tu lógica de negocio para eliminar usuario */;
        
        if (exito) {
            request.setAttribute("mensaje", "Usuario eliminado exitosamente");
        } else {
            request.setAttribute("error", "No se pudo eliminar el usuario");
        }
        request.getRequestDispatcher("/WEB-INF/views/resultado.jsp").forward(request, response);
    }

    private void loginUsuario(Map<String, Object> datosUsuario, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = (String) datosUsuario.get("USUARIO");
        String password = (String) datosUsuario.get("PASSWORD");
        
        // Implementa la lógica para verificar las credenciales del usuario
        
        boolean credencialesValidas = true/* Llamada a tu lógica de negocio para verificar credenciales */;
        
        if (credencialesValidas) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);
            response.sendRedirect("dashboard.jsp"); // Redirige a la página principal después del login
        } else {
            request.setAttribute("error", "Credenciales inválidas");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
    }
}