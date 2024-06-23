package ejercicioinig.controlador;

import ejercicioinig.modelo.Empleado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class getData {
    
    public List<Empleado> list;
    
    public List<Empleado> obtenerDatos() throws SQLException{
        Connection connection = null;
        RConnection rc = new RConnection();
        Empleado empleado;
        list = new ArrayList<>();

            connection = rc.conectar();
            Statement statement = connection.createStatement();
            String sql = "SELECT id,nombre,apellido,fechaNac,telefono,correo FROM empleado";
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                long id = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String fechaNac = resultSet.getString("fechaNac");
                String telefono = resultSet.getString("telefono");
                String correo = resultSet.getString("correo");
                long idS = resultSet.getLong("idSucursal");
                
                empleado = new Empleado(id,nombre,apellido,fechaNac,telefono,correo,idS);
                
                list.add(empleado);
                //mostrar(id, nombre, apellido, fechaNac, telefono, correo);
            }
            
          return list;  
    }
    
    
    public long generarId() throws SQLException{
        Connection connection = null;
        RConnection rc = new RConnection();
        ResultSet resultSet = null;
        long maxId=0;
        
        connection = rc.conectar();
        Statement statement = connection.createStatement();
        String sql = "SELECT MAX(id) AS max_id FROM empleado";
        resultSet = statement.executeQuery(sql);

            
        if (resultSet.next()) {
            maxId = resultSet.getLong("max_id");
        }
        
        return maxId+1;
    }
    
    public void mostrar(long id, String nombre, String apellido, String fechaNac, String telefono, String correo){
        System.out.println(id);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(fechaNac);
        System.out.println(telefono);
        System.out.println(correo);
    }
}
