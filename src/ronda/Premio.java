/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ronda;

/**
 *
 * @author Hp
 */
public class Premio {
    
    private int valor;
    private String concepto;

    public Premio(int valor, String concepto) {
        this.valor = valor;
        this.concepto = concepto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
