/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Eventos.Controlador;
import Eventos.EscuchadorEventos;
import Eventos.Paquete;
import Eventos.ReceptorEvento;
import java.awt.Frame;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;
import javax.swing.event.EventListenerList;

/**
 *
 * @author GABRIEL
 */
public class Servidor extends  Thread{
    private int port;
    Frame ventana;
    private EventListenerList ListenerList=new EventListenerList();
    private Controlador controler=null;
    
    public Servidor(int port, Frame ventana) {
        this.port = port;
        this.ventana = ventana;
        this.AgregarEscuchadorRecibido(controler);
    }
    public void run(){
        ServerSocket ss=null;
        try {
            ss=new ServerSocket(port);
            while (true) {                
            Socket s=ss.accept();    
            GestorConexion.getInstance().ConectaNueva(new HiloConexion(s));
            
                Controlador c=new Controlador(this);
                c.OnConectar(new ReceptorEvento("localhost",new Paquete("127.0.0.1", "Prueba")));
                AgregarEscuchadorRecibido(c);
            }
            
            //JOptionPane.showMessageDialog(ventana,"Se conecto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(ventana,"Error al abrir puerto");
        }
    }
    
    
    
       void AgregarEscuchadorRecibido(EscuchadorEventos l) {
        ListenerList.add(EscuchadorEventos.class, l);
    }

    void EliminarEscuchadorRecibido(EscuchadorEventos l) {
         ListenerList.remove(EscuchadorEventos.class, l);
    }
     protected void DespacharEventosRecibido(ReceptorEvento e) {
     EscuchadorEventos[] ls = ListenerList.getListeners(EscuchadorEventos.class);
     for (EscuchadorEventos l : ls) {
      l.OnConectar(e);
      
     }
     }
}
