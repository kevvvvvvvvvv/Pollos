/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioinig.controlador;

import ejercicioinig.modelo.Sucursal;
import ejercicioinig.modelo.Empleado;
import java.io.IOException;

/* @author kevin*/

public class LogicaSucursal {
    
    Repositorio<Sucursal> rp;
    Repositorio<Empleado> re;
    
    public LogicaSucursal() throws IOException{
       rp = repositorioSucursal.getRepositorio();
       re = repositorioEmpleado.getRepositorio();
       crearEnlaces();
       mostrar();
    }
    
    public void crearEnlaces(){
        if(rp.getList()!=null && re.getList()!=null){
           for(Sucursal s:rp.getList()){
               for(Empleado e:re.getList()){
                   if(s.getIdSursal() == e.getIdSucursal()){
                      s.getEmpleados().add(e);
                   }
               }
           }
        }
    }
    
    public boolean evaluarIdS(long id){
        
        for(Sucursal sucu:rp.getList()){
            if(sucu.getIdSursal() == id){
                return true;
            }
        }
        return false;
    }
    
    public long generarId(){
        if(re.getList().isEmpty()){
            return 1;
        }
        
        return re.getList().get(re.getList().size()-1).getIdEmpleado()+1;
    }
    
    
    public void mostrar(){
        for(Sucursal s:rp.list){
            System.out.println(s.getIdSursal());
        }
    }
    
    
}
