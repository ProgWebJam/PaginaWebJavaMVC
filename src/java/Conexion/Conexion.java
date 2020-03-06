
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    private static Connection conexion = null;

    public static Connection getConexion() throws Exception {
        // Carga el driver de la base de datos
        Class.forName("oracle.jdbc.OracleDriver");
        
        System.out.println("Driver de ORACLE cargado");
    
        String nombreUsuario = "JMARULANDA";
        String password = "jh0n*";
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        conexion = DriverManager.getConnection(url, nombreUsuario, password);
        System.out.println("Conección establecida satisfactoriamente");

        return conexion;
    }
    
    
}
