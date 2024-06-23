/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioinig.controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public abstract class Repositorio<TIPO> {
    
    public List<TIPO> list;

    public Repositorio(){
        list = new ArrayList<>();
        cargarDatos();
        //mostrar();
    }
    
    public List<TIPO> getList(){
        return list;
    }
    
    public void deleteElement(TIPO tipo){
        list.remove(tipo);
    }
    
    public void insert(TIPO tipo){
        list.add(tipo);
    }
    
    public abstract void cargarDatos();
    public abstract void mostrar();
}
