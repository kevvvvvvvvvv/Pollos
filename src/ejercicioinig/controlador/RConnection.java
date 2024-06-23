
package ejercicioinig.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RConnection {
   String bd ="PolloFeliz"; 
   String url ="jdbc:mysql://localhost:3306/";
   
   String user="root";
   String password = "";
   String driver = "com.mysql.cj.jdbc.Driver";
   Connection cx;

    public RConnection() {
        
    }
   
    public Connection conectar() {
       try {
           try {
               Class.forName(driver);
           } catch (ClassNotFoundException ex) {
               System.out.println("No se ha conectado a la base de datos");
               Logger.getLogger(RConnection.class.getName()).log(Level.SEVERE, null, ex);
           }
           cx = DriverManager.getConnection(url+bd,user,password);
           System.out.println("Se ha conectado a base de datos");
       } catch (SQLException ex) {
           System.out.println("No se ha conectado a la base de datos");
           Logger.getLogger(RConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
       return cx;
    }
    
    public void desconectar() {
       try {
           cx.close();
       } catch (SQLException ex) {
           System.out.println("No se conectó a la base de datos");
           Logger.getLogger(RConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   
}
