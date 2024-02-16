
import java.util.ArrayList;
import java.util.Date;

public class Civiles extends Usuarios{
    private ArrayList <Tramites> tramites = new ArrayList();

    public Civiles() {
    }

    public Civiles(String nombre, String apellido, String contrasena, String departamento, char sexo, Date fnacimiento) {
        super(nombre, apellido, contrasena, departamento, sexo, fnacimiento);
    }

    public ArrayList<Tramites> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramites> tramites) {
        this.tramites = tramites;
    }

    @Override   
    public String toString() {
        return super.toString();
    }
    
    
}
