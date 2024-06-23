
package ejercicioinig.modelo;

/*@author kevin*/
public class Sucursal {
    private long idSursal;
    private String direccion;
    private String estado;
    private String telefono;

    public Sucursal(long idSursal, String direccion, String estado, String telefono) {
        this.idSursal = idSursal;
        this.direccion = direccion;
        this.estado = estado;
        this.telefono = telefono;
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
