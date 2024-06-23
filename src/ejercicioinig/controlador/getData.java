package ejercicioinig.controlador;

import java.sql.*;

public class getData {
    public void obtenerDatos() throws SQLException{
        Connection connection = null;
        RConnection rc = new RConnection();

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
                
                mostrar(id, nombre, apellido, fechaNac, telefono, correo);
            } 
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
