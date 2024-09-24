
package servlet;

import clienteXSON.ClienteXSON;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Trivia;
import servicio.ServicioTrivia;


@WebServlet("/trivias")
public class ListarTriviasServlet extends HttpServlet {
    private ServicioTrivia servicioTrivia;

    @Override
    public void init() throws ServletException {
        super.init();
        ClienteXSON clienteXSON = new ClienteXSON("http://localhost:8080/api");
        this.servicioTrivia = new ServicioTrivia(clienteXSON);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Trivia> trivias = servicioTrivia.obtenerTrivias();
        request.setAttribute("trivias", trivias);
        request.getRequestDispatcher("/WEB-INF/listarTrivias.jsp").forward(request, response);
    }
}