
package ejercicioinig.modelo;

import java.util.List;

/*@author kevin*/
public class Sucursal {
    private long idSursal;
    private String direccion;
    private String nombre;
    private String estado;
    private String telefono;
    private List<Empleado> empleados;

    public Sucursal(long idSursal, String direccion, String nombre, String estado, String telefono) {
        this.idSursal = idSursal;
        this.direccion = direccion;
        this.nombre = nombre;
        this.estado = estado;
        this.telefono = telefono;
    }

    public Sucursal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public long getIdSursal() {
        return idSursal;
    }

    public void setIdSursal(long idSursal) {
        this.idSursal = idSursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return direccion;
    }
    
    
}
