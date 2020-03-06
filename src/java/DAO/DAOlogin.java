/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Jhon
 */
public class DAOlogin{
    
    private Connection conexion;

    public DAOlogin() throws Exception {
        conexion = Conexion.getConexion();
    }
    
    public boolean autenticacion (String usuario, String contrasena){

        try{
            String consulta = "SELECT * FROM LOGIN WHERE USUARIO=? AND CONTRASENA=?";
            PreparedStatement pst = conexion.prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contrasena);
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                
                System.out.println("Datos Correctos: " );
                return true;
            }
                    
        }catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        System.out.println("Datos incorrectos: " );
        return false;
    }
/*    
    public static void main (String [] args) throws Exception{
        DAOlogin co = new DAOlogin();
        
        
        System.out.println(co.autenticacion("jmarulanda", "sup3r4dm1n"));
        //System.out.println(co.autenticacion("ja", "s"));
    }
*/   
}
