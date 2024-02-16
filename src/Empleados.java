
import java.util.Date;

public class Empleados extends Usuarios{
    private String carrera, puesto;
    private int Ttrabajado;

    public Empleados() {
        super();
    }

    public Empleados(String carrera, String puesto, int Ttrabajado, String nombre, String apellido, String contrasena, String departamento, char sexo, Date fnacimiento) {
        super(nombre, apellido, contrasena, departamento, sexo, fnacimiento);
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

    public int getTtrabajado() {
        return Ttrabajado;
    }

    public void setTtrabajado(int Ttrabajado) {
        this.Ttrabajado = Ttrabajado;
    }

    @Override       ///////////////////////////////////Arreglar despues
    public String toString() {
        return super.toString() + "Empleados{" + "carrera=" + carrera + ", puesto=" + puesto + ", Ttrabajado=" + Ttrabajado + '}';
    }
    
    
}
