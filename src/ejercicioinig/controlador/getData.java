package ejercicioinig.controlador;

import java.sql.*;

public class getData {
    public void obtenerDatos() throws SQLException{
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pollofeliz","root","");
            
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
            
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Paso 6: Cerrar la conexión
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
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
