import java.util.List;
import java.util.ArrayList;

public class Competicion
{
    private String nombre, lugar;
    private Fecha fecha;
    private List<Equipo> equipos; 
    
    
    public Competicion (String nombre, String lugar, Fecha fecha){
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.equipos = new ArrayList <>();
    }
    
    public void agregarEquipo(Equipo equipo){
        equipos.add(equipo);
        
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

    /**GET Method Propertie lugar*/
    public String getLugar(){
        return this.lugar;
    }//end method getLugar

    /**SET Method Propertie lugar*/
    public void setLugar(String lugar){
        this.lugar = lugar;
    }//end method setLugar

    /**GET Method Propertie fecha*/
    public Fecha getFecha(){
        return this.fecha;
    }//end method getFecha

    /**SET Method Propertie fecha*/
    public void setFecha(Fecha fecha){
        this.fecha = fecha;
    }//end method setFecha

    /**GET Method Propertie equipos*/
    public java.util.List<Equipo> getEquipos(){
        return this.equipos;
    }//end method getEquipos

    /**SET Method Propertie equipos*/
    public void setEquipos(java.util.List<Equipo> equipos){
        this.equipos = equipos;
    }//end method setEquipos

//End GetterSetterExtension Source Code


}//End class