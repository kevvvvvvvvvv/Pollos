/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioinig.controlador;

import ejercicioinig.Vista.Sucursal;
import java.io.IOException;

/* @author kevin*/

public class LogicaSucursal {
    
    Repositorio<Sucursal> rp;
    
    public LogicaSucursal() throws IOException{
       rp = repositorioSucursal.getRepositorio();
       crearEnlaces();
    }
    
    
    
    public void crearEnlaces(){
        
    }
    
}
