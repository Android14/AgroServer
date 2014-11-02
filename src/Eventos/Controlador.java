/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;


import Server.Servidor;
import java.io.IOException;
import java.util.List;
//import com.google.gson.Gson;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author uagrm
 */
public class Controlador implements EscuchadorEventos {
    private Servidor server;
   // private Gson gson=new Gson();
    public Controlador(Servidor server) {
        this.server = server;
    }
    
    @Override
    public void OnConectar(ReceptorEvento e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Evento funciona");
        
    }

    @Override
    public void OnDesconectar(ReceptorEvento e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Escribir(ReceptorEvento e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Leer(ReceptorEvento e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
