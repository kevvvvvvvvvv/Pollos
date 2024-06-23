/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioinig.controlador;

import ejercicioinig.modelo.Empleado;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*@author kevin*/

public class repositorioEmpleado extends Repositorio<Empleado> {

    getData gd;
    
    public static Repositorio obj;
    
    private repositorioEmpleado() {
        
    }
        
    public static Repositorio getRepositorio() throws IOException{
        if(obj== null){
            obj = new repositorioEmpleado();
        }
        return obj;
    }
    
    @Override
    public void cargarDatos() {
       gd = new getData();
        try {
            list = gd.obtenerDatos();
        } catch (SQLException ex) {
            Logger.getLogger(repositorioEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
