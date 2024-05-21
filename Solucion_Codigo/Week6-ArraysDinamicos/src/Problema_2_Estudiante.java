

/**
 *
 * @author MRodzDirect 😉 <Organico> 
 */
import java.util.ArrayList;
import java.util.Random;
public class Problema_2_Estudiante {
    

    private String nombre;
    private int edad;
    private ArrayList<Problema_2_Materia> materia = new ArrayList<>();

    // otros atributos
    
    public Problema_2_Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getName(){
        return nombre;
    }
/*
    public void setMateria(Problema_2_Materia materia) {
        this.materia.add() materia;
    }*/ // Esta porcion queda obsoleta
    
    public void addListaMaterias(ArrayList<Problema_2_Materia> materia) {
        this.materia=(materia);
    }

    public boolean aprobo(Problema_2_Materia materia) {
        double total = materia.getACD() + materia.getAPE() + materia.getAA();
        if (total >= 7.0) {
            return true;
        } else {
            return false;
        }
    }
}
