
package servlet;

import clienteXSON.ClienteXSON;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Trivia;
import servicio.ServicioTrivia;


@WebServlet("/jugarTrivia")
public class JugarTriviaServlet extends HttpServlet {
    private ServicioTrivia servicioTrivia;

    @Override
    public void init() throws ServletException {
        super.init();
        ClienteXSON clienteXSON = new ClienteXSON("http://localhost:8080/api");
        this.servicioTrivia = new ServicioTrivia(clienteXSON);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int triviaId = Integer.parseInt(request.getParameter("id"));
        Trivia trivia = servicioTrivia.obtenerTrivia(triviaId);
        
        if (trivia != null) {
            request.setAttribute("trivia", trivia);
            request.getRequestDispatcher("/WEB-INF/jugarTrivia.jsp").forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/trivias");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aquí se procesarían las respuestas del usuario y se calcularía la puntuación
        // Por ahora, simplemente redirigimos a la lista de trivias
        response.sendRedirect(request.getContextPath() + "/trivias");
    }
}