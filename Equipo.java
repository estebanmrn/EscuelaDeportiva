import java.util.List;
import java.util.ArrayList;

public class Equipo
{
    private String nombre, categoria;
    private List<Alumno> jugadores;
    private Entrenador entrenador;
    
    
    public Equipo (String nombre, String categoria, Entrenador entrenador){
        this.nombre = nombre;
        this.categoria = categoria;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>();
        entrenador.asignarEquipo(this);
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

    /**GET Method Propertie categoria*/
    public String getCategoria(){
        return this.categoria;
    }//end method getCategoria

    /**SET Method Propertie categoria*/
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }//end method setCategoria

    /**GET Method Propertie jugadores*/
    public java.util.List<Alumno> getJugadores(){
        return this.jugadores;
    }//end method getJugadores

    /**SET Method Propertie jugadores*/
    public void setJugadores(java.util.List<Alumno> jugadores){
        this.jugadores = jugadores;
    }//end method setJugadores

    /**GET Method Propertie entrenador*/
    public Entrenador getEntrenador(){
        return this.entrenador;
    }//end method getEntrenador

    /**SET Method Propertie entrenador*/
    public void setEntrenador(Entrenador entrenador){
        this.entrenador = entrenador;
    }//end method setEntrenador

//End GetterSetterExtension Source Code

public void agregarJugador (Alumno alumno){
    jugadores.add(alumno);
}

}//End class