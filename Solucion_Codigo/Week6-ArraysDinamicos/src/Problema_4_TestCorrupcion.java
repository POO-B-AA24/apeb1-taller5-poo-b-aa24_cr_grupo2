
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Problema_4_TestCorrupcion {

    public static void main(String[] args) {

        ArrayList<Problema_4_CasoCorrupcion> casos = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean continuarCasos, continuarGente;

        int i = 1; // contador de casos
        do {
            continuarCasos = true;
            // FECHAS ------------------------
            // Esto es util para despues
            LocalDate today = LocalDate.now();
            long minDay = today.toEpochDay() - 30; // 30 days ago
            long maxDay = today.toEpochDay() - 3; // 3 days ago
            long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);

            // Eso era util. jaja
            // FIN FECHAS -------------------------
            // caso de corrupcion
            LocalDate randomDate = LocalDate.ofEpochDay(randomDay); // fecha autogenerada jeje.
            // Ignorar la linea de arriba, es para hacer mas cheto el programa
            Problema_4_CasoCorrupcion caso = new Problema_4_CasoCorrupcion("Caso " + i, randomDate, "Iniciado");
            casos.add(caso);

            ArrayList<Problema_4_PersonaImplicada> personas = new ArrayList<>(); // cada caso tiene su propio arraylist
            int j = 1; // contador de personas

            do {
                continuarGente = true;
                Problema_4_PersonaImplicada persona = new Problema_4_PersonaImplicada("Caso" + i + " Persona " + j, 30 + j, "Ocupacion " + j, j % 2 == 0 ? "acusado" : "testigo"); // Solo hacemos que personas pares sean acusados, los impares son testigos
                personas.add(persona);

                if (persona.getImplicacion().equals("acusado")) {
                    persona.colaborar(); // Por defecto diremos que todas las personas colaboraron
                    persona.pagarFianza(10000);  // Danio por defecto es 10k

                    caso.addPersonasImplicadas(persona);

                }
                // continuar ingresando gente?
                System.out.println(" Desea ingresar otra persona? (Si / No)");
                if (!in.nextLine().equalsIgnoreCase("Si")) {
                    continuarGente = false;
                    break;
                }
                j++;
            } while (continuarGente);

            //personas involucradas :
            System.out.println("Personas implicadas en el " + caso.getName() + ":");
            caso.imprimirPersonasImplicadas();

            // estado del caso:
            caso.updateFechaCasos();
            System.out.println("Estado del " + caso.getName() + ": " + caso.getEstado());

            // continuar ingresando Casos?
            System.out.println(" Desea ingresar otro caso? (Si / No)");
            if (!in.nextLine().equalsIgnoreCase("Si")) {
                continuarCasos = false;
                break;
            }
            i++;
        } while (continuarCasos);
    }
}
