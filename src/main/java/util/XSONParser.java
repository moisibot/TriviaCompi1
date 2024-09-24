package util;

import modelo.Usuario;
import org.json.JSONObject;
import org.json.JSONArray;

public class XSONParser {
    public Usuario parseUsuario(String xsonInput) throws Exception {
        // Extraer el tipo de solicitud
        String tipoSolicitud = extraerTipoSolicitud(xsonInput);
        
        // Extraer el JSON
        String jsonStr = extraerJSON(xsonInput);
        JSONObject json = new JSONObject(jsonStr);
        JSONArray datosUsuario = json.getJSONArray("DATOS_USUARIO");
        JSONObject usuarioJson = datosUsuario.getJSONObject(0);

        Usuario usuario = new Usuario();

        switch (tipoSolicitud) {
            case "USUARIO_NUEVO":
                usuario.setUsername(usuarioJson.getString("USUARIO"));
                usuario.setPassword(usuarioJson.getString("PASSWORD"));
                usuario.setNombre(usuarioJson.getString("NOMBRE"));
                usuario.setInstitucion(usuarioJson.getString("INSTITUCION"));
                break;
            case "MODIFICAR_USUARIO":
                usuario.setOldUsername(usuarioJson.getString("USUARIO_ANTIGUO"));
                usuario.setUsername(usuarioJson.getString("USUARIO_NUEVO"));
                usuario.setPassword(usuarioJson.getString("NUEVO_PASSWORD"));
                usuario.setInstitucion(usuarioJson.getString("INSTITUCION"));
                break;
            case "ELIMINAR_USUARIO":
            case "LOGIN_USUARIO":
                usuario.setUsername(usuarioJson.getString("USUARIO"));
                if (tipoSolicitud.equals("LOGIN_USUARIO")) {
                    usuario.setPassword(usuarioJson.getString("PASSWORD"));
                }
                break;
            default:
                throw new IllegalArgumentException("Tipo de solicitud no reconocido: " + tipoSolicitud);
        }

        usuario.setTipoSolicitud(tipoSolicitud);
        return usuario;
    }

    private String extraerTipoSolicitud(String xsonInput) {
        int inicio = xsonInput.indexOf("<!realizar_solicitud: \"") + 23;
        int fin = xsonInput.indexOf("\" >", inicio);
        return xsonInput.substring(inicio, fin);
    }

    private String extraerJSON(String xsonInput) {
        int inicio = xsonInput.indexOf("{");
        int fin = xsonInput.lastIndexOf("}") + 1;
        return xsonInput.substring(inicio, fin);
    }
}