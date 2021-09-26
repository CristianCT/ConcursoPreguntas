/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionmongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import concurso.Jugador;
import concursopreguntas.ConcursoPreguntas;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pregunta.Pregunta;

/**
 *
 * @author Hp
 */
public class Connection {
    private DB db;
    private DBCollection collection;
    private BasicDBObject document;
    private String nameCollectionJugadores;
    private String nameCollectionPreguntas;
    public Connection() {
        this.nameCollectionJugadores = "HistorialJugadores";
    }
    
    public void addJugador(Jugador jugador, int puntaje){
        this.document = new BasicDBObject();
        document.put("name", jugador.getNombre());
        document.put("username", jugador.getNombreUsuario());
        document.put("puntaje", puntaje);
        collection.insert(document);
        System.out.println("Jugador Agregado");
    }    
    
    public ArrayList<Jugador> getHistorialJugadores(){
        
        ArrayList<Jugador> jugadores = new ArrayList<>();
        DBCursor cursor = collection.find();;
        ArrayList<DBObject> results = new ArrayList<DBObject>();
        while(cursor.hasNext()){
            results.add(cursor.next());
        }
        
        for(int x = 0 ; x < results.size(); x++){
            jugadores.add(new Jugador((String)results.get(x).get("name"),(String)results.get(x).get("username"), (int)results.get(x).get("puntaje")));
        }
        return jugadores;
    }
    
    public void connectionJugadores(){
        try {
            // TODO code application logic here
            Mongo mongo = new Mongo("localhost", 27017);
            db = mongo.getDB("JuegoPreguntas");
            collection = db.getCollection(this.nameCollectionJugadores);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ConcursoPreguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
