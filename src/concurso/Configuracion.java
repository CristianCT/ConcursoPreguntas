/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso;

import java.util.ArrayList;
import pregunta.Categoria;

/**
 *
 * @author Hp
 */
public class Configuracion {
    
    private ArrayList<Categoria> categorias;
    private Jugador jugador;

    public Configuracion(ArrayList<Categoria> categorias, Jugador jugador) {
        this.categorias = categorias;
        this.jugador = jugador;
    }

    public ArrayList<Categoria> getRondas() {
        return categorias;
    }
    
    public Jugador getJugador(){
        return this.jugador;
    }
}
