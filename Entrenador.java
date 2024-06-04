import java.util.List;
import java.util.ArrayList;
public class Entrenador
{
    private String nombre; 
    private Deporte especialidad; 
    private List<Equipo> equipos;
    
    
    public Entrenador (String nombre, Deporte especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad; 
        this.equipos = new ArrayList<>();
        
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

    /**GET Method Propertie especialidad*/
    public Deporte getEspecialidad(){
        return this.especialidad;
    }//end method getEspecialidad

    /**SET Method Propertie especialidad*/
    public void setEspecialidad(Deporte especialidad){
        this.especialidad = especialidad;
    }//end method setEspecialidad

    /**GET Method Propertie equipos*/
    public java.util.List<Equipo> getEquipos(){
        return this.equipos;
    }//end method getEquipos

    /**SET Method Propertie equipos*/
    public void setEquipos(java.util.List<Equipo> equipos){
        this.equipos = equipos;
    }//end method setEquipos

//End GetterSetterExtension Source Code

public void asignarEquipo (Equipo equipo){
    equipos.add(equipo);
    
}

}//End class