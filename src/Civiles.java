
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Civiles extends Usuarios{
    Random rand = new Random();
    private ArrayList <Tramites> tramites = new ArrayList();

    public Civiles() {
    }

    public Civiles(String nombre, String apellido, String contrasena, String departamento, char sexo, Date fnacimiento) {
        super(nombre, apellido, contrasena, departamento, sexo, fnacimiento);
    }

    public ArrayList<Tramites> getTramites() {
        return tramites;
    }

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }
    
    public void setTramites(ArrayList<Tramites> tramites) {
        this.tramites = tramites;
    }

    @Override   
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
