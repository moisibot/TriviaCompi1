
package servicio;


import clienteXSON.ClienteXSON;
import java.util.List;
import modelo.Trivia;

public class ServicioTrivia {
    private ClienteXSON clienteXSON;

    public ServicioTrivia(ClienteXSON clienteXSON) {
        this.clienteXSON = clienteXSON;
    }

    public List<Trivia> obtenerTrivias() {
        // Implementar lógica para obtener trivias usando clienteXSON
        return null; // Placeholder
    }

    public Trivia obtenerTrivia(int id) {
        // Implementar lógica para obtener una trivia específica usando clienteXSON
        return null; // Placeholder
    }

    public boolean crearTrivia(Trivia trivia) {
        // Implementar lógica para crear una trivia usando clienteXSON
        return false; // Placeholder
    }

    public boolean actualizarTrivia(Trivia trivia) {
        // Implementar lógica para actualizar una trivia usando clienteXSON
        return false; // Placeholder
    }

    public boolean eliminarTrivia(int id) {
        // Implementar lógica para eliminar una trivia usando clienteXSON
        return false; // Placeholder
    }
}