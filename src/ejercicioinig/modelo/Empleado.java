package ejercicioinig.modelo;

/*@author kevin*/

public class Empleado {
    private long idEmpleado;
    private String nombre;
    private String apellido;
    private String date;
    private String telefono;
    private String correo;
    private long idSucursal;

    public Empleado(long idEmpleado, String nombre, String apellido, String date, String telefono, String correo, long idSucursal) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.date = date;
        this.telefono = telefono;
        this.correo = correo;
        this.idSucursal = idSucursal;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(long idSucursal) {
        this.idSucursal = idSucursal;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    
}
