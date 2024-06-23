package ejercicioinig.controlador;

import ejercicioinig.modelo.Sucursal;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/*@author kevin*/
public class repositorioSucursal extends Repositorio<Sucursal>{

    public static Repositorio obj;
    
    getDataSucursal ds;
    
    private repositorioSucursal() {
        
    }
        
    public static Repositorio getRepositorio() throws IOException{
        if(obj== null){
            obj = new repositorioSucursal();
        }
        return obj;
    }   

    @Override
    public void cargarDatos() {
        ds = new getDataSucursal();
        try {
            list = ds.obtenerDatos();
        } catch (SQLException ex) {
            
            Logger.getLogger(repositorioSucursal.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void mostrar(){
        for(Sucursal s:list){
            System.out.println(s.getIdSursal());
        }
    }
    
}
