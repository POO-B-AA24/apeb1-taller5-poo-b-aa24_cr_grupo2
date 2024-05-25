
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Problema_4_CasoCorrupcion {

    private String name;
    private LocalDate date;
    ;
    private String estado;
    private ArrayList<Problema_4_PersonaImplicada> personasImplicadas;

    public Problema_4_CasoCorrupcion(String name, LocalDate date, String estado) {
        this.name = name;
        this.date = date;
        this.estado = estado;
        this.personasImplicadas = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    public String getEstado(){
        return this.estado;
    }

    public void addPersonasImplicadas(Problema_4_PersonaImplicada persona) {
        this.personasImplicadas.add(persona);

    }

    // Para casos:
    public void updateFechaCasos() {
        this.estado = (ChronoUnit.DAYS.between(this.date, LocalDate.now()) > 14) ? "Urgente" : pasoUnaSemana(); // Improved the logic
       
    }

    public String pasoUnaSemana() {
        return (ChronoUnit.DAYS.between(this.date, LocalDate.now()) > 7) ? "Alerta" : "Iniciado";
    }

    /*
    public void investigar(ArrayList<PersonaImplicada> personas) {
        Scanner in = new Scanner(System.in);
    }*/
    
    // Esto reemplazo el imprimir gente implicada:
        public void imprimirPersonasImplicadas() {
        for (Problema_4_PersonaImplicada persona : this.personasImplicadas) {
            System.out.println(persona.getName() + " (" + persona.getImplicacion() + ")");
        }
    }

    // String buildersito
    public String toString(ArrayList<Problema_4_PersonaImplicada> personas) {
        StringBuilder sb = new StringBuilder();
        sb.append("CasoCorrupcion{");
        sb.append("name=").append(name);
        sb.append(", date=").append(date);
        sb.append(", estado=").append(estado);
        sb.append('}');
        for (Problema_4_PersonaImplicada persona : personas) {
            sb.append(" Persona implicadas = ").append(persona.toString());

        }
        return sb.toString();
    }

    public void setPersonasImplicadas(ArrayList<Problema_4_PersonaImplicada> personasImplicadas) {
        this.personasImplicadas = personasImplicadas;
    }

    public ArrayList<Problema_4_PersonaImplicada> getPersonasImplicadas() {
        return this.personasImplicadas;
    }

}
