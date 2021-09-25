/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ronda;

import pregunta.Categoria;
import pregunta.Pregunta;

/**
 *
 * @author Hp
 */
public class Ronda {
    
    private Categoria categoria;
    private Premio premio;

    public Ronda(Categoria categoria, Premio premio) {
        this.categoria = categoria;
        this.premio = premio;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public Premio getPremio() {
        return this.premio;
    }
}
