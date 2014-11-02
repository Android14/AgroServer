package Eventos;


import java.util.EventListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uagrm
 */
public interface EscuchadorEventos extends EventListener{
   public void OnConectar(ReceptorEvento e); 
   public void OnDesconectar(ReceptorEvento e); 
   public void Escribir(ReceptorEvento e); 
   public void Leer(ReceptorEvento e); 
}
 