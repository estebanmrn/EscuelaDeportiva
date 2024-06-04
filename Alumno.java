import java.util.List;
import java.util.ArrayList;
public class Alumno
{
    private String nombre, genero;
    private int edad;
    private List<Deporte> deportes;
    
    
    public Alumno (String nombre, String genero, int edad){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad; 
        this.deportes = new ArrayList<>();
        
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie genero*/
    public String getGenero(){
        return this.genero;
    }//end method getGenero

    /**SET Method Propertie genero*/
    public void setGenero(String genero){
        this.genero = genero;
    }//end method setGenero

    /**GET Method Propertie edad*/
    public int getEdad(){
        return this.edad;
    }//end method getEdad

    /**SET Method Propertie edad*/
    public void setEdad(int edad){
        this.edad = edad;
    }//end method setEdad

    /**GET Method Propertie deportes*/
    public java.util.List<Deporte> getDeportes(){
        return this.deportes;
    }//end method getDeportes

    /**SET Method Propertie deportes*/
    public void setDeportes(java.util.List<Deporte> deportes){
        this.deportes = deportes;
    }//end method setDeportes
    
    public void inscribirDeporte (Deporte deporte){
        deportes.add(deporte);
        
    }
}
