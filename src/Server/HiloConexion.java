/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GABRIEL
 */
public class HiloConexion extends Thread{
    Socket s;
    DataInputStream dis;
    DataOutputStream dos;
    public HiloConexion( Socket s) throws IOException{
      this.s=s;
    dis=new DataInputStream(s.getInputStream());
    dos=new DataOutputStream(s.getOutputStream());
    start();
    }
    public void run(){
        while (true) {            
            try {
                String menj=dis.readUTF();
                GestorConexion.getInstance().EnviarMensaje(menj);
               
            } catch (IOException ex) {
                Logger.getLogger(HiloConexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
    }
    public void EnviarMensaje(String mensaje){
        try {
            dos.writeUTF(mensaje);
        } catch (Exception e) {
        }
    }
}
