/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.util.ArrayList;

/**
 *
 * @author GABRIEL
 */
public class GestorConexion {
    private static GestorConexion Sigleton=new GestorConexion();
     ArrayList<HiloConexion> Conexion=new ArrayList<HiloConexion>();
     
     
    public static GestorConexion getInstance(){
        return Sigleton;
    }
   
    public void EnviarMensaje(String sms){
        for (HiloConexion conexion : Conexion) {
            conexion.EnviarMensaje(sms);
        }
    }
    public void ConectaNueva(HiloConexion nuevo){
        Conexion.add(nuevo);
    }
}
