/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso;

import conexionmongodb.Connection;
import java.util.ArrayList;
import pregunta.Pregunta;
import ronda.Ronda;

/**
 *
 * @author Hp
 */
public class Concurso {
    
    private ArrayList<Ronda> rondas;
    private Jugador jugador;
    private int acumulado;
    private Connection conexion;

    public Concurso(ArrayList<Ronda> rondas, Jugador jugador) {
        this.rondas = rondas;
        this.jugador = jugador;
        this.acumulado = 0;
        this.conexion = new Connection();
    }
    
    public Concurso() {
        this.rondas = null;
        this.jugador = null;
        this.conexion = null;
    }

    public Jugador getJugador() {
        return this.jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public ArrayList<Ronda> getRondas() {
        return rondas;
    }

    public int getAcumulado() {
        return acumulado;
    }
    
    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }
    
    public void saveResults() {
        this.conexion.connectionJugadores();
        this.conexion.addJugador(this.jugador, this.acumulado);
    }
    
    public ArrayList<Jugador> getDBJugadores() {
        this.conexion.connectionJugadores();
        return this.conexion.getHistorialJugadores();
    }
    
    /*public ArrayList<Pregunta> getPreguntas(){
        this.conexion.connectionPreguntas();
    }*/
}
