/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BDConexion;

/**
 *
 * @author GABRIEL
 */
public class Persona {
    private int ID;
    private String Nombre;

    public Persona(int ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }


    
    
}
