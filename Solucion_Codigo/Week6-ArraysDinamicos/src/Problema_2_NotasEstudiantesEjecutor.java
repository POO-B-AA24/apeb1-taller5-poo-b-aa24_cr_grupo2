
/**
 *
 * @author MRodzDirect 😉 <Organico>
 */
import java.util.ArrayList;
import java.util.Random;

public class Problema_2_NotasEstudiantesEjecutor {

    public static void main(String[] args) {

        ArrayList<Problema_2_Estudiante> stud = new ArrayList<>();
        ArrayList<Problema_2_Materia> materia = new ArrayList<>();

        System.out.println("Ingrese la materia");
        boolean continuar = true;
        int cont = 0;
        do {

            Problema_2_Estudiante studi = new Problema_2_Estudiante(generarNombre(), generarEdad());
            Problema_2_Materia materi = new Problema_2_Materia("Materia" + (cont + 1), generarNota(), generarNota(), generarNota());
            System.out.println("Desea agregar otra materia?");
            studi.addMateria(materi);
            stud.add(studi);
            materia.add(materi);
            cont++;

        } while (continuar == true);

        for (Problema_2_Estudiante studi : stud) {
            for (Problema_2_Materia materi : materia) {
                if (studi.aprobo(materi)) {
                    System.out.println("El estudiante " + studi.getName() + " ha aprobado la materia " + materi.getName());
                } else {
                    System.out.println("El estudiante " + studi.getName() + " debe rendir un examen de recuperación en la materia " + materi.getName());
                }
            }
        }
    }

    // IGNORAR. ESTO ES OPCIONAL 
    // Funciones que usamos solo para automatizar el programa. Esto es opcional 
    public static int generarEdad() {
        Random r = new Random();
        int[] edades = {15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85};
        int indice = r.nextInt(edades.length);
        return edades[indice];
    }

    public static String generarNombre() {
        Random r = new Random();
        String[] names = {
            "Marco 😉<3", "Maria", "Jose", "Gabriela", "Antonio", "Ana", "Juan", "Patricia",
            "Francisco", "Carmen", "Pedro", "Alejandra", "Manuel", "Teresa", "Jorge", "Isabel",
            "Fernando", "Mariana", "Ricardo", "Sofia", "Luis", "Beatriz", "Sergio", "Daniela"
        };
        int indice = r.nextInt(names.length);
        return names[indice];
    }

    public static double generarNota() {
        Random r = new Random();
        double nota = 3.5 + (r.nextDouble() * (10 - 3.5)); // Limite inferior 3.5 , superior 10
        return nota;
    }
}
