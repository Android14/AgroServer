package Eventos;


import java.util.EventObject;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uagrm
 */
public class ReceptorEvento extends EventObject{
   Paquete Dato; 
   public ReceptorEvento(Object source,Paquete p) {
    super(source);
    Dato=p;
  } 
}


