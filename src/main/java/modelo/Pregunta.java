
package modelo;

import java.util.List;

public class Pregunta {
    private int id;
    private String texto;
    private List<Respuesta> respuestas;
    private int indiceRespuestaCorrecta;

    public Pregunta(int id, String texto, List<Respuesta> respuestas, int indiceRespuestaCorrecta) {
        this.id = id;
        this.texto = texto;
        this.respuestas = respuestas;
        this.indiceRespuestaCorrecta = indiceRespuestaCorrecta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public int getIndiceRespuestaCorrecta() {
        return indiceRespuestaCorrecta;
    }

    public void setIndiceRespuestaCorrecta(int indiceRespuestaCorrecta) {
        this.indiceRespuestaCorrecta = indiceRespuestaCorrecta;
    }

    
}
