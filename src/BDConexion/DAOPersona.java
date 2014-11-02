/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BDConexion;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GABRIEL
 */
public class DAOPersona {
    private SimpleDateFormat dateFormat;

    public DAOPersona() {

        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public void Insertar(int ID,String Nombre){
       try {
            Connection connection = Conexion.getConnection();

            String consulta = "insert into Persona values ("+ID+",'"+Nombre+"')";
//            HashMap<String, Object> parametros = new HashMap<String, Object>();
//            parametros.put("1", idUsuario);
              Conexion.executeCommand(connection, consulta, null);
              
//            ResultSet rs = Conexion.executeQuery(connection, consulta, parametros);
//            if (rs.next()) {
//                usuario = resultSetToPuntos(rs);
//            }
//            rs.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//     public void (int telefono,String Nombre, int Estado,String imagen){
//       try {
//            Connection connection = Conexion.getConnection();
//
//            String consulta = "insert into Usuario values ("+telefono+",'"+Nombre+"',"+Estado+",'"+imagen+"')";
////            HashMap<String, Object> parametros = new HashMap<String, Object>();
////            parametros.put("1", idUsuario);
//              Conexion.executeCommand(connection, consulta, null);
//              
////            ResultSet rs = Conexion.executeQuery(connection, consulta, parametros);
////            if (rs.next()) {
////                usuario = resultSetToPuntos(rs);
////            }
////            rs.close();
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    public Usuario getUsuario(int idUsuario) {
//
//        Usuario usuario = null;
//
//        try {
//            Connection connection = Conexion.getConnection();
//
//            String consulta = "SELECT * "
//                    + "FROM Usuario "
//                    + "WHERE Telefono = ?";
//            HashMap<String, Object> parametros = new HashMap<String, Object>();
//            parametros.put("1", idUsuario);
//
//            ResultSet rs = Conexion.executeQuery(connection, consulta, parametros);
//            if (rs.next()) {
//                usuario = resultSetToUsuario(rs);
//            }
//            rs.close();
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return usuario;
//    }
//
////    public List<Usuario> getPuntos(String fecha) {
////
////        List<Usuario> listEmpresas = new ArrayList<Usuario>();
////
////        try {
////
////            Connection connection = Conexion.getConnection();
////
////            String consulta = "SELECT * "
////                    + "FROM Puntos "
////                    + "WHERE FechaActualizacion > CAST(? AS DATETIME)";
////            HashMap<String, Object> parametros = new HashMap<String, Object>();
////            parametros.put("1", fecha);
////
////            ResultSet rs = Conexion.executeQuery(connection, consulta, parametros);
////            while (rs.next()) {
////                usuario empresa = resultSetToPuntos(rs);
////
////                listEmpresas.add(empresa);
////            }
////
////        } catch (ClassNotFoundException ex) {
////            Logger.getLogger(PuntosDAO.class.getName()).log(Level.SEVERE, null, ex);
////        } catch (SQLException ex) {
////            Logger.getLogger(PuntosDAO.class.getName()).log(Level.SEVERE, null, ex);
////        } catch (Exception ex) {
////            Logger.getLogger(PuntosDAO.class.getName()).log(Level.SEVERE, null, ex);
////        }
////
////        return listEmpresas;
////    }
//
//    private Usuario resultSetToUsuario(ResultSet rs) throws SQLException, ParseException {
//
//        Usuario usuario = new Usuario();
//        usuario.setTelefono(rs.getInt("Telefono"));
//        usuario.setNombre(rs.getString("Nombre"));
//        usuario.setEstado(rs.getInt("Estado"));
//        return usuario;
//    }
    public static void main(String[] args) {
        DAOPersona u=new DAOPersona();
        u.Insertar(6864, "Alex");
    }
}
