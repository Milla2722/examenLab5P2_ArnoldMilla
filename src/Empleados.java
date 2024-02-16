
import java.util.Date;

public class Empleados extends Usuarios{
    private String carrera, puesto, Ttrabajado;

    public Empleados() {
        super();
    }

    public Empleados(String carrera, String puesto, String Ttrabajado, String nombre, String apellido, String contrasena, String departamento, String numeroID, boolean sexo, Date fnacimiento) {
        super(nombre, apellido, contrasena, departamento, numeroID, sexo, fnacimiento);
        this.carrera = carrera;
        this.puesto = puesto;
        this.Ttrabajado = Ttrabajado;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTtrabajado() {
        return Ttrabajado;
    }

    public void setTtrabajado(String Ttrabajado) {
        this.Ttrabajado = Ttrabajado;
    }

    @Override       ///////////////////////////////////Arreglar despues
    public String toString() {
        return super.toString() + "Empleados{" + "carrera=" + carrera + ", puesto=" + puesto + ", Ttrabajado=" + Ttrabajado + '}';
    }
    
    
}
