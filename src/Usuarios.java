
import java.util.Date;


public abstract class Usuarios {
    protected String nombre, apellido, contrasena, departamento, numeroID;
    protected char  sexo;
    protected Date fnacimiento;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String contrasena, String departamento, char sexo, Date fnacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.departamento = departamento;
        this.sexo = sexo;
        this.fnacimiento = fnacimiento;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }

    public char isSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    @Override           ///////////////////////////////////Arreglar despues
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", contrasena=" + contrasena + ", departamento=" + departamento + ", numeroID=" + numeroID + ", sexo=" + sexo + ", fnacimiento=" + fnacimiento + '}';
    }
    
    
    public abstract void id();
}
