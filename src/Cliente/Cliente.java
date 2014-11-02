/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.awt.Frame;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author GABRIEL
 */
public class Cliente extends Thread{
    String url;
    VCliente ventana;
    int port;
    Socket s;
    boolean bConectado;
    public Cliente(String url, VCliente ventana, int port) {
        this.url = url;
        this.ventana = ventana;
        this.port = port;
        s=null;
    }
    public void run(){
        try {
             s=new Socket(url, port);
             DataInputStream dis=new DataInputStream(s.getInputStream());
             bConectado=true;
             while (bConectado) {                
                String mensaje=dis.readUTF();
                ventana.RecibirMensajes(mensaje);
            }
            //JOptionPane.showMessageDialog(ventana, "Conectado el cliente");
        } catch (Exception e) {
        }
    
    }
 
    public void EnviarMensaje(String mensaje){
        try {
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF(mensaje);
        } catch (Exception e) {
        }
    }
}
