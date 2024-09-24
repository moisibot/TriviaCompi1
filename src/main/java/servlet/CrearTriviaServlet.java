
package servlet;
import clienteXSON.ClienteXSON;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Pregunta;
import modelo.Trivia;
import modelo.Usuario;
import servicio.ServicioTrivia;



@WebServlet("/crearTrivia")
public class CrearTriviaServlet extends HttpServlet {
    private ServicioTrivia servicioTrivia;

    @Override
    public void init() throws ServletException {
        super.init();
        ClienteXSON clienteXSON = new ClienteXSON("http://localhost:8080/api");
        this.servicioTrivia = new ServicioTrivia(clienteXSON);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/crearTrivia.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        Usuario creador = (Usuario) request.getSession().getAttribute("usuario");

        Trivia nuevaTrivia = new Trivia(0, titulo, (List<Pregunta>) creador, null);

        boolean creacionExitosa = servicioTrivia.crearTrivia(nuevaTrivia);

        if (creacionExitosa) {
            response.sendRedirect(request.getContextPath() + "/trivias");
        } else {
            request.setAttribute("error", "Error al crear la trivia");
            request.getRequestDispatcher("/WEB-INF/crearTrivia.jsp").forward(request, response);
        }
    }
}