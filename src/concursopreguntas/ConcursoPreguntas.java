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
        
        Pregunta pregunta1 = new Pregunta("¿Pregunta1?", categoria1);
        Pregunta pregunta2 = new Pregunta("¿Pregunta2?", categoria1);
        Pregunta pregunta3 = new Pregunta("¿Pregunta3?", categoria1);
        Pregunta pregunta4 = new Pregunta("¿Pregunta4?", categoria1);
        Pregunta pregunta5 = new Pregunta("¿Pregunta5?", categoria1);
        Pregunta pregunta6 = new Pregunta("¿Pregunta6?", categoria2);
        Pregunta pregunta7 = new Pregunta("¿Pregunta7?", categoria2);
        Pregunta pregunta8 = new Pregunta("¿Pregunta8?", categoria2);
        Pregunta pregunta9 = new Pregunta("¿Pregunta9?", categoria2);
        Pregunta pregunta10 = new Pregunta("¿Pregunta10?", categoria2);
        Pregunta pregunta11 = new Pregunta("¿Pregunta11?", categoria3);
        Pregunta pregunta12 = new Pregunta("¿Pregunta12?", categoria3);
        Pregunta pregunta13 = new Pregunta("¿Pregunta13?", categoria3);
        Pregunta pregunta14 = new Pregunta("¿Pregunta14?", categoria3);
        Pregunta pregunta15 = new Pregunta("¿Pregunta15?", categoria3);
        Pregunta pregunta16 = new Pregunta("¿Pregunta16?", categoria4);
        Pregunta pregunta17 = new Pregunta("¿Pregunta17?", categoria4);
        Pregunta pregunta18 = new Pregunta("¿Pregunta18?", categoria4);
        Pregunta pregunta19 = new Pregunta("¿Pregunta19?", categoria4);
        Pregunta pregunta20 = new Pregunta("¿Pregunta20?", categoria4);
        Pregunta pregunta21 = new Pregunta("¿Pregunta21?", categoria5);
        Pregunta pregunta22 = new Pregunta("¿Pregunta22?", categoria5);
        Pregunta pregunta23 = new Pregunta("¿Pregunta22?", categoria5);
        Pregunta pregunta24 = new Pregunta("¿Pregunta24?", categoria5);
        Pregunta pregunta25 = new Pregunta("¿Pregunta25?", categoria5);
        
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        
        Respuesta respuesta1 = new Respuesta("Respuesta A Pregunta1", false, pregunta1);
        Respuesta respuesta2 = new Respuesta("Respuesta B Pregunta1", false, pregunta1);
        Respuesta respuesta3 = new Respuesta("Respuesta C Pregunta1", true, pregunta1);
        Respuesta respuesta4 = new Respuesta("Respuesta D Pregunta1", false, pregunta1);
        
        Respuesta respuesta5 = new Respuesta("Respuesta A Pregunta2", false, pregunta2);
        Respuesta respuesta6 = new Respuesta("Respuesta B Pregunta2", true, pregunta2);
        Respuesta respuesta7 = new Respuesta("Respuesta C Pregunta2", false, pregunta2);
        Respuesta respuesta8 = new Respuesta("Respuesta D Pregunta2", false, pregunta2);
        
        Respuesta respuesta9 = new Respuesta("Respuesta A Pregunta3", false, pregunta3);
        Respuesta respuesta10 = new Respuesta("Respuesta B Pregunta3", false, pregunta3);
        Respuesta respuesta11 = new Respuesta("Respuesta C Pregunta3", false, pregunta3);
        Respuesta respuesta12 = new Respuesta("Respuesta D Pregunta3", true, pregunta3);
        
        Respuesta respuesta13 = new Respuesta("Respuesta A Pregunta4", true, pregunta4);
        Respuesta respuesta14 = new Respuesta("Respuesta B Pregunta4", false, pregunta4);
        Respuesta respuesta15 = new Respuesta("Respuesta C Pregunta4", false, pregunta4);
        Respuesta respuesta16 = new Respuesta("Respuesta D Pregunta4", false, pregunta4);
        
        Respuesta respuesta17 = new Respuesta("Respuesta A Pregunta5", true, pregunta5);
        Respuesta respuesta18 = new Respuesta("Respuesta B Pregunta5", false, pregunta5);
        Respuesta respuesta19 = new Respuesta("Respuesta C Pregunta5", false, pregunta5);
        Respuesta respuesta20 = new Respuesta("Respuesta D Pregunta5", false, pregunta5);
        
        Respuesta respuesta21 = new Respuesta("Respuesta A Pregunta6", false, pregunta6);
        Respuesta respuesta22 = new Respuesta("Respuesta B Pregunta6", true, pregunta6);
        Respuesta respuesta23 = new Respuesta("Respuesta C Pregunta6", false, pregunta6);
        Respuesta respuesta24 = new Respuesta("Respuesta D Pregunta6", false, pregunta6);
        
        Respuesta respuesta25 = new Respuesta("Respuesta A Pregunta7", true, pregunta7);
        Respuesta respuesta26 = new Respuesta("Respuesta B Pregunta7", false, pregunta7);
        Respuesta respuesta27 = new Respuesta("Respuesta C Pregunta7", false, pregunta7);
        Respuesta respuesta28 = new Respuesta("Respuesta D Pregunta7", false, pregunta7);
        
        Respuesta respuesta29 = new Respuesta("Respuesta A Pregunta8", false, pregunta8);
        Respuesta respuesta30 = new Respuesta("Respuesta B Pregunta8", false, pregunta8);
        Respuesta respuesta31 = new Respuesta("Respuesta C Pregunta8", true, pregunta8);
        Respuesta respuesta32 = new Respuesta("Respuesta D Pregunta8", false, pregunta8);
        
        Respuesta respuesta33 = new Respuesta("Respuesta A Pregunta9", false, pregunta9);
        Respuesta respuesta34 = new Respuesta("Respuesta B Pregunta9", false, pregunta9);
        Respuesta respuesta35 = new Respuesta("Respuesta C Pregunta9", false, pregunta9);
        Respuesta respuesta36 = new Respuesta("Respuesta D Pregunta9", true, pregunta9);
        
        Respuesta respuesta37 = new Respuesta("Respuesta A Pregunta10", false, pregunta10);
        Respuesta respuesta38 = new Respuesta("Respuesta B Pregunta10", false, pregunta10);
        Respuesta respuesta39 = new Respuesta("Respuesta C Pregunta10", true, pregunta10);
        Respuesta respuesta40 = new Respuesta("Respuesta D Pregunta10", false, pregunta10);
        
        Respuesta respuesta41 = new Respuesta("Respuesta A Pregunta11", false, pregunta11);
        Respuesta respuesta42 = new Respuesta("Respuesta B Pregunta11", true, pregunta11);
        Respuesta respuesta43 = new Respuesta("Respuesta C Pregunta11", false, pregunta11);
        Respuesta respuesta44 = new Respuesta("Respuesta D Pregunta11", false, pregunta11);
        
        Respuesta respuesta45 = new Respuesta("Respuesta A Pregunta12", true, pregunta12);
        Respuesta respuesta46 = new Respuesta("Respuesta B Pregunta12", false, pregunta12);
        Respuesta respuesta47 = new Respuesta("Respuesta C Pregunta12", false, pregunta12);
        Respuesta respuesta48 = new Respuesta("Respuesta D Pregunta12", false, pregunta12);
        
        Respuesta respuesta49 = new Respuesta("Respuesta A Pregunta13", false, pregunta13);
        Respuesta respuesta50 = new Respuesta("Respuesta B Pregunta13", false, pregunta13);
        Respuesta respuesta51 = new Respuesta("Respuesta C Pregunta13", false, pregunta13);
        Respuesta respuesta52 = new Respuesta("Respuesta D Pregunta13", true, pregunta13);
        
        Respuesta respuesta53 = new Respuesta("Respuesta A Pregunta14", false, pregunta14);
        Respuesta respuesta54 = new Respuesta("Respuesta B Pregunta14", true, pregunta14);
        Respuesta respuesta55 = new Respuesta("Respuesta C Pregunta14", false, pregunta14);
        Respuesta respuesta56 = new Respuesta("Respuesta D Pregunta14", false, pregunta14);
        
        Respuesta respuesta57 = new Respuesta("Respuesta A Pregunta15", false, pregunta15);
        Respuesta respuesta58 = new Respuesta("Respuesta B Pregunta15", false, pregunta15);
        Respuesta respuesta59 = new Respuesta("Respuesta C Pregunta15", false, pregunta15);
        Respuesta respuesta60 = new Respuesta("Respuesta D Pregunta15", true, pregunta15);
        
        Respuesta respuesta61 = new Respuesta("Respuesta A Pregunta16", false, pregunta16);
        Respuesta respuesta62 = new Respuesta("Respuesta B Pregunta16", true, pregunta16);
        Respuesta respuesta63 = new Respuesta("Respuesta C Pregunta16", false, pregunta16);
        Respuesta respuesta64 = new Respuesta("Respuesta D Pregunta16", false, pregunta16);
        
        Respuesta respuesta65 = new Respuesta("Respuesta A Pregunta17", true, pregunta17);
        Respuesta respuesta66 = new Respuesta("Respuesta B Pregunta17", false, pregunta17);
        Respuesta respuesta67 = new Respuesta("Respuesta C Pregunta17", false, pregunta17);
        Respuesta respuesta68 = new Respuesta("Respuesta D Pregunta17", false, pregunta17);
        
        Respuesta respuesta69 = new Respuesta("Respuesta A Pregunta18", false, pregunta18);
        Respuesta respuesta70 = new Respuesta("Respuesta B Pregunta18", false, pregunta18);
        Respuesta respuesta71 = new Respuesta("Respuesta C Pregunta18", false, pregunta18);
        Respuesta respuesta72 = new Respuesta("Respuesta D Pregunta18", true, pregunta18);
        
        Respuesta respuesta73 = new Respuesta("Respuesta A Pregunta19", false, pregunta19);
        Respuesta respuesta74 = new Respuesta("Respuesta B Pregunta19", false, pregunta19);
        Respuesta respuesta75 = new Respuesta("Respuesta C Pregunta19", false, pregunta19);
        Respuesta respuesta76 = new Respuesta("Respuesta D Pregunta19", true, pregunta19);
        
        Respuesta respuesta77 = new Respuesta("Respuesta A Pregunta20", false, pregunta20);
        Respuesta respuesta78 = new Respuesta("Respuesta B Pregunta20", false, pregunta20);
        Respuesta respuesta79 = new Respuesta("Respuesta C Pregunta20", true, pregunta20);
        Respuesta respuesta80 = new Respuesta("Respuesta D Pregunta20", false, pregunta20);
        
        Respuesta respuesta81 = new Respuesta("Respuesta A Pregunta21", false, pregunta21);
        Respuesta respuesta82 = new Respuesta("Respuesta B Pregunta21", true, pregunta21);
        Respuesta respuesta83 = new Respuesta("Respuesta C Pregunta21", false, pregunta21);
        Respuesta respuesta84 = new Respuesta("Respuesta D Pregunta21", false, pregunta21);
        
        Respuesta respuesta85 = new Respuesta("Respuesta A Pregunta22", true, pregunta22);
        Respuesta respuesta86 = new Respuesta("Respuesta B Pregunta22", false, pregunta22);
        Respuesta respuesta87 = new Respuesta("Respuesta C Pregunta22", false, pregunta22);
        Respuesta respuesta88 = new Respuesta("Respuesta D Pregunta22", false, pregunta22);
        
        Respuesta respuesta89 = new Respuesta("Respuesta A Pregunta23", false, pregunta23);
        Respuesta respuesta90 = new Respuesta("Respuesta B Pregunta23", false, pregunta23);
        Respuesta respuesta91 = new Respuesta("Respuesta C Pregunta23", false, pregunta23);
        Respuesta respuesta92 = new Respuesta("Respuesta D Pregunta23", true, pregunta23);
        
        Respuesta respuesta93 = new Respuesta("Respuesta A Pregunta24", true, pregunta24);
        Respuesta respuesta94 = new Respuesta("Respuesta B Pregunta24", false, pregunta24);
        Respuesta respuesta95 = new Respuesta("Respuesta C Pregunta24", false, pregunta24);
        Respuesta respuesta96 = new Respuesta("Respuesta D Pregunta24", false, pregunta24);
        
        Respuesta respuesta97 = new Respuesta("Respuesta A Pregunta25", true, pregunta25);
        Respuesta respuesta98 = new Respuesta("Respuesta B Pregunta25", false, pregunta25);
        Respuesta respuesta99 = new Respuesta("Respuesta C Pregunta25", false, pregunta25);
        Respuesta respuesta100 = new Respuesta("Respuesta D Pregunta25", false, pregunta25);
                        
        ArrayList<Ronda> rondas = new ArrayList<>();
        
        rondas.add(new Ronda(categoria1, new Premio(1000, "Primera Ronda")));
        rondas.add(new Ronda(categoria2, new Premio(2000, "Segunda Ronda")));
        rondas.add(new Ronda(categoria3, new Premio(3000, "Tercera Ronda")));
        rondas.add(new Ronda(categoria4, new Premio(4000, "Cuarta Ronda")));
        rondas.add(new Ronda(categoria5, new Premio(5000, "Quinta Ronda")));
        
        Jugador jugador = new Jugador("NickName", "NickName");
        Concurso concurso = new Concurso(rondas, jugador);
        
        OpcionesConfiguracion opciones = new OpcionesConfiguracion(concurso);
        opciones.setVisible(true);
    }
}
