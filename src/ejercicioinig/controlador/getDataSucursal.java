/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicioinig.controlador;


import ejercicioinig.modelo.Sucursal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*@author kevin*/
public class getDataSucursal {
    
    List<Sucursal> list = new ArrayList<>();
    
    public getDataSucursal(){
        
    }
    
    public List<Sucursal> obtenerDatos() throws SQLException{
        Connection connection = null;
        RConnection rc = new RConnection();
        Sucursal sc = null;
            connection = rc.conectar();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM sucursal";
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
               
                long id = resultSet.getLong("idSucursal");
                String dire = resultSet.getString("direccion");
                String nombre = resultSet.getString("nombre");
                String estado = resultSet.getString("estado");
                String telefono = resultSet.getString("telefono");
                
                sc = new Sucursal(id,dire,nombre,estado,telefono);
                
                list.add(sc);
                //mostrar(id,dire,nombre,estado,telefono);
            }
            rc.desconectar();
            return list;
    }
    
    public void mostrar(long id, String nombre, String apellido, String fechaNac, String telefono){
        System.out.println(id);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(fechaNac);
        System.out.println(telefono);
    }
}
