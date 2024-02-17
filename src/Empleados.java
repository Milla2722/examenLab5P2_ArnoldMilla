
import java.util.Date;
import java.util.Random;

public class Empleados extends Usuarios{
    Random rand = new Random();
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

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
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
        return super.toString();
    }
    
    public void id(){
        int finalR = rand.nextInt(10000,100000);
        String id = "";
        
        if (departamento.equalsIgnoreCase("francisco morazan")){
            int departR = rand.nextInt(1,29);
            id += "01";
            
            if(departR < 10){
                id += "0";
                id += departR;
            }
            else{
                id += departR;
            }
        }
        else if(departamento.equalsIgnoreCase("comayagua")){
            int departR = rand.nextInt(1,12);
            id += "02";
            
            if(departR < 10){
                id += "0";
                id += departR;
            }
            else{
                id += departR;
            }
        }
        else if(departamento.equalsIgnoreCase("cortes")){
            int departR = rand.nextInt(1,14);
            id += "03";
            
            if(departR < 10){
                id += "0";
                id += departR;
            }
            else{
                id += departR;
            }
        }
        
        id += "-";
        id += fnacimiento.getYear()+1900;
        id += "-";
        id += finalR;
        
        setNumeroID(id);
    }
}
