
/**
 *
 * @author MRodzDirect 😉 <Organico>
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Problema_2_NotasEstudiantesEjecutor {

    public static void main(String[] args) {
        Scanner jaja = new Scanner(System.in);
        ArrayList<Problema_2_Estudiante> stud = new ArrayList<>();

        System.out.println("Ingresar la cantidad de materias");
        int nMaterias = jaja.nextInt();
        boolean continuar = true;
        int newcont = 0;
        do {
            Problema_2_Materia[] materia = new Problema_2_Materia[nMaterias]; // un arreglo de materias por estudiante. Asi las notas seran diferentes para cada uno.
            int cont = 0;
            do {

                Problema_2_Materia materi = new Problema_2_Materia("Materia" + (cont + 1), generarNota(), generarNota(), generarNota());
                materia[cont] = (materi);
                System.out.println("Agrege datos de materia ----- =>"+ (cont + 1));
                System.out.println("----- Materias con datos: ----- => " + (cont + 1));
                //jaja.next();
                if (cont >= nMaterias) {
                    break;
                }
                cont++;

            } while (cont < nMaterias);

            Problema_2_Estudiante studi = new Problema_2_Estudiante(generarNombre(), generarEdad(), materia);

            stud.add(studi);
            System.out.println("Desea agregar otro estudiante?");
            System.out.println("----- Estudiantes agregados: ----- => " + (newcont + 1));

            if (!jaja.next().equalsIgnoreCase("Si")) {
                break;
            }
            newcont++;
        } while (continuar);

        for (Problema_2_Estudiante studi : stud) {
            for (Problema_2_Materia materi : studi.getMaterias()) {
                if (studi.aprobo(materi)) {
                    System.out.println("El estudiante " + studi.getName() + " ha aprobado la materia " + materi.getName());
                } else {
                    System.out.println("El estudiante " + studi.getName() + " debe rendir un examen de recuperacion en la materia " + materi.getName());
                }
            }
        }
    } // IGNORAR. ESTO ES OPCIONAL 
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
        double nota = 1 + (r.nextDouble() * (3.5 - 1)); // Limite inferior 1 , superior 3.5
        return nota;
    }
}
