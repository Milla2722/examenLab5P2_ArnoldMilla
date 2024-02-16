
import java.util.Date;
import java.util.logging.Logger;

public class Tramites {
    private String nombre, descripcion, numeroID;
    private Date fechaEnv;

    public Tramites() {
    }

    public Tramites(String nombre, String descripcion, String numeroID, Date fechaEnv) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroID = numeroID;
        this.fechaEnv = fechaEnv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }

    public Date getFechaEnv() {
        return fechaEnv;
    }

    public void setFechaEnv(Date fechaEnv) {
        this.fechaEnv = fechaEnv;
    }

    @Override   ///////////////////////////////////Arreglar despues
    public String toString() {
        return "Tramites{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", numeroID=" + numeroID + ", fechaEnv=" + fechaEnv + '}';
    }
    
}
