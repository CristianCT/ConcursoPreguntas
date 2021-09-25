/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursopreguntas;

import concurso.Concurso;
import concurso.Jugador;
import conexionmongodb.Connection;
import interfaces.OpcionesConfiguracion;
import java.util.ArrayList;
import pregunta.Categoria;
import pregunta.Pregunta;
import pregunta.Respuesta;
import ronda.Premio;
import ronda.Ronda;



/**
 *
 * @author Hp
 */
public class ConcursoPreguntas {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
                
        /*Categoria categoria = new Categoria(1,"Muy Facil");
        Pregunta pregunta1 = new Pregunta("Pregunta", new ArrayList<Respuesta>(1), categoria);
        categoria.addPreguntas(pregunta1);*/
        
        Categoria categoria1 = new Categoria(1, "Muy facil");
        Categoria categoria2 = new Categoria(2, "Facil");
        Categoria categoria3 = new Categoria(3, "Normal");
        Categoria categoria4 = new Categoria(4, "Dificil");
        Categoria categoria5 = new Categoria(5, "Muy dificl");
        
        Pregunta pregunta1 = new Pregunta("¿Que es esto?", categoria1);
        Pregunta pregunta2 = new Pregunta("¿Que es esto11?", categoria1);
        Pregunta pregunta3 = new Pregunta("¿Que es esto11?", categoria1);
        Pregunta pregunta4 = new Pregunta("¿Que es esto11?", categoria1);
        Pregunta pregunta5 = new Pregunta("¿Que es esto11?", categoria1);
        Pregunta pregunta6 = new Pregunta("¿Que es esto11?", categoria2);
        Pregunta pregunta7 = new Pregunta("¿Que es esto11?", categoria2);
        Pregunta pregunta8 = new Pregunta("¿Que es esto11?", categoria2);
        Pregunta pregunta9 = new Pregunta("¿Que es esto11?", categoria2);
        Pregunta pregunta10 = new Pregunta("¿Que es esto11?", categoria2);
        Pregunta pregunta11 = new Pregunta("¿Que es esto11?", categoria3);
        Pregunta pregunta12 = new Pregunta("¿Que es esto11?", categoria3);
        Pregunta pregunta13 = new Pregunta("¿Que es esto11?", categoria3);
        Pregunta pregunta14 = new Pregunta("¿Que es esto11?", categoria3);
        Pregunta pregunta15 = new Pregunta("¿Que es esto11?", categoria3);
        Pregunta pregunta16 = new Pregunta("¿Que es esto11?", categoria4);
        Pregunta pregunta17 = new Pregunta("¿Que es esto11?", categoria4);
        Pregunta pregunta18 = new Pregunta("¿Que es esto11?", categoria4);
        Pregunta pregunta19 = new Pregunta("¿Que es esto11?", categoria4);
        Pregunta pregunta20 = new Pregunta("¿Que es esto11?", categoria4);
        Pregunta pregunta21 = new Pregunta("¿Que es esto11?", categoria5);
        Pregunta pregunta22 = new Pregunta("¿Que es esto11?", categoria5);
        Pregunta pregunta23 = new Pregunta("¿Que es esto11?", categoria5);
        Pregunta pregunta24 = new Pregunta("¿Que es esto11?", categoria5);
        Pregunta pregunta25 = new Pregunta("¿Que es esto11?", categoria5);
             
        Respuesta respuesta1 = new Respuesta("Esta es la respuesta", false, pregunta1);
        Respuesta respuesta2 = new Respuesta("Esta es la respuesta", false, pregunta1);
        Respuesta respuesta3 = new Respuesta("Esta es la respuesta", true, pregunta1);
        Respuesta respuesta4 = new Respuesta("Esta es la respuesta", false, pregunta1);
        
        Respuesta respuesta5 = new Respuesta("Esta es la respuesta0", false, pregunta2);
        Respuesta respuesta6 = new Respuesta("Esta es la respuesta0", true, pregunta2);
        Respuesta respuesta7 = new Respuesta("Esta es la respuesta0", false, pregunta2);
        Respuesta respuesta8 = new Respuesta("Esta es la respuesta0", false, pregunta2);
        
        Respuesta respuesta9 = new Respuesta("Esta es la respuesta0", false, pregunta3);
        Respuesta respuesta10 = new Respuesta("Esta es la respuesta0", false, pregunta3);
        Respuesta respuesta11 = new Respuesta("Esta es la respuesta0", false, pregunta3);
        Respuesta respuesta12 = new Respuesta("Esta es la respuesta0", true, pregunta3);
        
        Respuesta respuesta13 = new Respuesta("Esta es la respuesta0", true, pregunta4);
        Respuesta respuesta14 = new Respuesta("Esta es la respuesta0", false, pregunta4);
        Respuesta respuesta15 = new Respuesta("Esta es la respuesta0", false, pregunta4);
        Respuesta respuesta16 = new Respuesta("Esta es la respuesta0", false, pregunta4);
        
        Respuesta respuesta17 = new Respuesta("Esta es la respuesta0", true, pregunta5);
        Respuesta respuesta18 = new Respuesta("Esta es la respuesta0", false, pregunta5);
        Respuesta respuesta19 = new Respuesta("Esta es la respuesta0", false, pregunta5);
        Respuesta respuesta20 = new Respuesta("Esta es la respuesta0", false, pregunta5);
        
        Respuesta respuesta21 = new Respuesta("Esta es la respuesta0", false, pregunta6);
        Respuesta respuesta22 = new Respuesta("Esta es la respuesta0", true, pregunta6);
        Respuesta respuesta23 = new Respuesta("Esta es la respuesta0", false, pregunta6);
        Respuesta respuesta24 = new Respuesta("Esta es la respuesta0", false, pregunta6);
        
        Respuesta respuesta25 = new Respuesta("Esta es la respuesta0", true, pregunta7);
        Respuesta respuesta26 = new Respuesta("Esta es la respuesta0", false, pregunta7);
        Respuesta respuesta27 = new Respuesta("Esta es la respuesta0", false, pregunta7);
        Respuesta respuesta28 = new Respuesta("Esta es la respuesta0", false, pregunta7);
        
        Respuesta respuesta29 = new Respuesta("Esta es la respuesta0", false, pregunta8);
        Respuesta respuesta30 = new Respuesta("Esta es la respuesta0", false, pregunta8);
        Respuesta respuesta31 = new Respuesta("Esta es la respuesta0", true, pregunta8);
        Respuesta respuesta32 = new Respuesta("Esta es la respuesta0", false, pregunta8);
        
        Respuesta respuesta33 = new Respuesta("Esta es la respuesta0", false, pregunta9);
        Respuesta respuesta34 = new Respuesta("Esta es la respuesta0", false, pregunta9);
        Respuesta respuesta35 = new Respuesta("Esta es la respuesta0", false, pregunta9);
        Respuesta respuesta36 = new Respuesta("Esta es la respuesta0", true, pregunta9);
        
        Respuesta respuesta37 = new Respuesta("Esta es la respuesta0", false, pregunta10);
        Respuesta respuesta38 = new Respuesta("Esta es la respuesta0", false, pregunta10);
        Respuesta respuesta39 = new Respuesta("Esta es la respuesta0", true, pregunta10);
        Respuesta respuesta40 = new Respuesta("Esta es la respuesta0", false, pregunta10);
        
        Respuesta respuesta41 = new Respuesta("Esta es la respuesta0", false, pregunta11);
        Respuesta respuesta42 = new Respuesta("Esta es la respuesta0", true, pregunta11);
        Respuesta respuesta43 = new Respuesta("Esta es la respuesta0", false, pregunta11);
        Respuesta respuesta44 = new Respuesta("Esta es la respuesta0", false, pregunta11);
        
        Respuesta respuesta45 = new Respuesta("Esta es la respuesta0", true, pregunta12);
        Respuesta respuesta46 = new Respuesta("Esta es la respuesta0", false, pregunta12);
        Respuesta respuesta47 = new Respuesta("Esta es la respuesta0", false, pregunta12);
        Respuesta respuesta48 = new Respuesta("Esta es la respuesta0", false, pregunta12);
        
        Respuesta respuesta49 = new Respuesta("Esta es la respuesta0", false, pregunta13);
        Respuesta respuesta50 = new Respuesta("Esta es la respuesta0", false, pregunta13);
        Respuesta respuesta51 = new Respuesta("Esta es la respuesta0", false, pregunta13);
        Respuesta respuesta52 = new Respuesta("Esta es la respuesta0", true, pregunta13);
        
        Respuesta respuesta53 = new Respuesta("Esta es la respuesta0", false, pregunta14);
        Respuesta respuesta54 = new Respuesta("Esta es la respuesta0", true, pregunta14);
        Respuesta respuesta55 = new Respuesta("Esta es la respuesta0", false, pregunta14);
        Respuesta respuesta56 = new Respuesta("Esta es la respuesta0", false, pregunta14);
        
        Respuesta respuesta57 = new Respuesta("Esta es la respuesta0", false, pregunta15);
        Respuesta respuesta58 = new Respuesta("Esta es la respuesta0", false, pregunta15);
        Respuesta respuesta59 = new Respuesta("Esta es la respuesta0", false, pregunta15);
        Respuesta respuesta60 = new Respuesta("Esta es la respuesta0", true, pregunta15);
        
        Respuesta respuesta61 = new Respuesta("Esta es la respuesta0", false, pregunta16);
        Respuesta respuesta62 = new Respuesta("Esta es la respuesta0", true, pregunta16);
        Respuesta respuesta63 = new Respuesta("Esta es la respuesta0", false, pregunta16);
        Respuesta respuesta64 = new Respuesta("Esta es la respuesta0", false, pregunta16);
        
        Respuesta respuesta65 = new Respuesta("Esta es la respuesta0", true, pregunta17);
        Respuesta respuesta66 = new Respuesta("Esta es la respuesta0", false, pregunta17);
        Respuesta respuesta67 = new Respuesta("Esta es la respuesta0", false, pregunta17);
        Respuesta respuesta68 = new Respuesta("Esta es la respuesta0", false, pregunta17);
        
        Respuesta respuesta69 = new Respuesta("Esta es la respuesta0", false, pregunta18);
        Respuesta respuesta70 = new Respuesta("Esta es la respuesta0", false, pregunta18);
        Respuesta respuesta71 = new Respuesta("Esta es la respuesta0", false, pregunta18);
        Respuesta respuesta72 = new Respuesta("Esta es la respuesta0", true, pregunta18);
        
        Respuesta respuesta73 = new Respuesta("Esta es la respuesta0", false, pregunta19);
        Respuesta respuesta74 = new Respuesta("Esta es la respuesta0", false, pregunta19);
        Respuesta respuesta75 = new Respuesta("Esta es la respuesta0", false, pregunta19);
        Respuesta respuesta76 = new Respuesta("Esta es la respuesta0", true, pregunta19);
        
        Respuesta respuesta77 = new Respuesta("Esta es la respuesta0", false, pregunta20);
        Respuesta respuesta78 = new Respuesta("Esta es la respuesta0", false, pregunta20);
        Respuesta respuesta79 = new Respuesta("Esta es la respuesta0", true, pregunta20);
        Respuesta respuesta80 = new Respuesta("Esta es la respuesta0", false, pregunta20);
        
        Respuesta respuesta81 = new Respuesta("Esta es la respuesta0", false, pregunta21);
        Respuesta respuesta82 = new Respuesta("Esta es la respuesta0", true, pregunta21);
        Respuesta respuesta83 = new Respuesta("Esta es la respuesta0", false, pregunta21);
        Respuesta respuesta84 = new Respuesta("Esta es la respuesta0", false, pregunta21);
        
        Respuesta respuesta85 = new Respuesta("Esta es la respuesta0", true, pregunta22);
        Respuesta respuesta86 = new Respuesta("Esta es la respuesta0", false, pregunta22);
        Respuesta respuesta87 = new Respuesta("Esta es la respuesta0", false, pregunta22);
        Respuesta respuesta88 = new Respuesta("Esta es la respuesta0", false, pregunta22);
        
        Respuesta respuesta89 = new Respuesta("Esta es la respuesta0", false, pregunta23);
        Respuesta respuesta90 = new Respuesta("Esta es la respuesta0", false, pregunta23);
        Respuesta respuesta91 = new Respuesta("Esta es la respuesta0", false, pregunta23);
        Respuesta respuesta92 = new Respuesta("Esta es la respuesta0", true, pregunta23);
        
        Respuesta respuesta93 = new Respuesta("Esta es la respuesta0", true, pregunta24);
        Respuesta respuesta94 = new Respuesta("Esta es la respuesta0", false, pregunta24);
        Respuesta respuesta95 = new Respuesta("Esta es la respuesta0", false, pregunta24);
        Respuesta respuesta96 = new Respuesta("Esta es la respuesta0", false, pregunta24);
        
        Respuesta respuesta97 = new Respuesta("Esta es la respuesta0", true, pregunta25);
        Respuesta respuesta98 = new Respuesta("Esta es la respuesta0", false, pregunta25);
        Respuesta respuesta99 = new Respuesta("Esta es la respuesta0", false, pregunta25);
        Respuesta respuesta100 = new Respuesta("Esta es la respuesta0", false, pregunta25);
        
        Premio premio1 = new Premio(1000, "Primera Ronda");
        Premio premio2 = new Premio(2000, "Segunda Ronda");
        Premio premio3 = new Premio(3000, "Tercera Ronda");
        Premio premio4 = new Premio(4000, "Cuarta Ronda");
        Premio premio5 = new Premio(5000, "Quinta Ronda");
        
        Ronda ronda1 = new Ronda(categoria1, premio1);
        Ronda ronda2 = new Ronda(categoria2, premio2);
        Ronda ronda3 = new Ronda(categoria3, premio3);
        Ronda ronda4 = new Ronda(categoria4, premio4);
        Ronda ronda5 = new Ronda(categoria5, premio5);
        
        ArrayList<Ronda> rondas = new ArrayList<>();
        
        rondas.add(ronda1);
        rondas.add(ronda2);
        rondas.add(ronda3);
        rondas.add(ronda4);
        rondas.add(ronda5);
        
        Jugador jugador = new Jugador("NickName", "NickName");
        Concurso concurso = new Concurso(rondas, jugador);
        
        OpcionesConfiguracion opciones = new OpcionesConfiguracion(concurso);
        opciones.setVisible(true);
    }
}
