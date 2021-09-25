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
public class Categoria {
    
    private int dificultad;
    private String textDificultad;
    private ArrayList<Pregunta> preguntas;

    public Categoria(int dificultad, String textDificultad) {
        this.dificultad = dificultad;
        this.textDificultad = textDificultad;
        this.preguntas = new ArrayList<>();
    }

    public int getDificultad() {
        return this.dificultad;
    }

    public String getTextDificultad() {
        return this.textDificultad;
    }
    
    public void addPregunta(Pregunta pregunta){
        this.preguntas.add(pregunta);
    }
    
    public Pregunta getRandomPregunta(){
        return this.preguntas.get((int)(Math.random()*this.preguntas.size()));
    }
    
    public ArrayList<Pregunta> getPreguntas(){
        return this.preguntas;
    }
}
