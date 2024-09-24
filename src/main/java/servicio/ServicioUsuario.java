package servicio;

import modelo.Usuario;
import java.util.HashMap;
import java.util.Map;

public class ServicioUsuario {
    private Map<String, Usuario> usuarios = new HashMap<>();

    public String crearUsuario(Usuario usuario) {
        if (usuarios.containsKey(usuario.getUsername())) {
            return "Error: El usuario ya existe.";
        }
        usuarios.put(usuario.getUsername(), usuario);
        return "Usuario creado con éxito.";
    }

    public String modificarUsuario(Usuario usuario) {
        if (!usuarios.containsKey(usuario.getOldUsername())) {
            return "Error: Usuario no encontrado.";
        }
        usuarios.remove(usuario.getOldUsername());
        usuarios.put(usuario.getUsername(), usuario);
        return "Usuario modificado con éxito.";
    }

    public String eliminarUsuario(String username) {
        if (usuarios.remove(username) != null) {
            return "Usuario eliminado con éxito.";
        }
        return "Error: Usuario no encontrado.";
    }

    public String loginUsuario(String username, String password) {
        Usuario usuario = usuarios.get(username);
        if (usuario != null && usuario.getPassword().equals(password)) {
            return "Login exitoso.";
        }
        return "Error: Usuario o contraseña incorrectos.";
    }
}