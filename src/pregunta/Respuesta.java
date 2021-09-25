/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta;

/**
 *
 * @author Hp
 */
public class Respuesta {
    
    private String contenido;
    private boolean verdadera;
    private Pregunta pregunta;

    public Respuesta(String contenido, boolean verdadera, Pregunta pregunta) {
        this.contenido = contenido;
        this.verdadera = verdadera;
        this.pregunta = pregunta;
        this.pregunta.addRespuesta(this);
    }

    public String getContenido() {
        return this.contenido;
    }

    public boolean isVerdadera() {
        return this.verdadera;
    }
}
