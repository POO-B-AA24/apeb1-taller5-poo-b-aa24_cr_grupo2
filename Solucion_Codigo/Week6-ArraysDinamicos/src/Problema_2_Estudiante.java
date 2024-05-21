
/**
 *
 * @author MRodzDirect 😉 <Organico>
 */
import java.util.ArrayList;
import java.util.Random;

public class Problema_2_Estudiante {

    private String nombre;
    private int edad;
    private Problema_2_Materia[] materia;

    // otros atributos
    public Problema_2_Estudiante(String nombre, int edad, Problema_2_Materia[] materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
    }

    public String getName() {
        return nombre;
    }


    public Problema_2_Materia[] getMaterias() {
        return this.materia;
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
