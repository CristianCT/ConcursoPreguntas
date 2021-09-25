/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso;

import ronda.Premio;

/**
 *
 * @author Hp
 */
public class Jugador {
    
    private String nombre;
    private String nombreUsuario;
    private int maxPuntaje = 0;

    public Jugador(String nombre, String nombreUsuario) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
    }
    
    public Jugador(String nombre, String nombreUsuario, int maxPuntaje) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.maxPuntaje = maxPuntaje;
    }
    
    public Jugador() {
        this.nombre = "";
        this.nombreUsuario = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    public int getMaxPuntaje(){
        return this.maxPuntaje;
    }
}
