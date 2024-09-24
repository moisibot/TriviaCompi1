
package modelo;

import java.util.List;

public class Trivia {
    private int id;
    private String titulo;
    private List<Pregunta> preguntas;
    private Usuario creador;

    public Trivia(int id, String titulo, List<Pregunta> preguntas, Usuario creador) {
        this.id = id;
        this.titulo = titulo;
        this.preguntas = preguntas;
        this.creador = creador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }

    
}