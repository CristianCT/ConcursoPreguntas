/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Pregunta {
    
    private String contenido;
    private ArrayList<Respuesta> respuestas;
    private Categoria categoria;

    public Pregunta(String contenido, Categoria categoria) {   
        this.contenido = contenido;
        this.respuestas = respuestas;
        this.categoria = categoria; 
        this.respuestas = new ArrayList<>();
        this.categoria.addPregunta(this);
    }

    public String getContenido() {
        return this.contenido;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return this.respuestas;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void addRespuesta(Respuesta respuesta) {
        this.respuestas.add(respuesta);
    }
}
