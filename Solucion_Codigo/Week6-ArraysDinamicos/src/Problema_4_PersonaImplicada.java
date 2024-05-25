
import java.util.Scanner;

public class Problema_4_PersonaImplicada {

    private String name;
    private int age;
    private String ocupacion;
    private String implicacion;
    private int pena;
    boolean colaboro;
    private double fianza;
    private double damageCaused;

    public Problema_4_PersonaImplicada(String name, int age, String ocupacion, String implicacion) {
        this.name = name;
        this.age = age;
        this.ocupacion = ocupacion;
        this.implicacion = implicacion;
        this.pena = 3; // 3 anios de pena por defecto
        this.damageCaused = 0;
        this.fianza=0.0;
        this.colaboro = false; // suponer q es falso desde el comienzo
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonaImplicada{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", ocupacion=").append(ocupacion);
        sb.append(", implicacion=").append(implicacion);
        sb.append(", pena=").append(pena);
        sb.append(", damageCaused=").append(damageCaused);
        sb.append('}');
        return sb.toString();
    }

//getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getImplicacion() {
        return implicacion;
    }
// Fin getter

    public void colaborar() {
        this.colaboro = true;
    }

    public void setPena(int pena) {
        this.pena = pena;
    }

    public void reducirPena() {
        this.pena -= 2; // SI DIJO LA VERDAD LE REDUZCO 2 ANIOS DE PENA
    }

    public String dijoLaVerdad() {
        Scanner in = new Scanner("si"); // Supongamos que siempre dijo la verdad
        System.out.println("Este acusado: Dijo la verdad?");
        if (in.nextLine().equalsIgnoreCase("si")) {
            reducirPena(); // SI DIJO LA VERDAD LE REDUZCO 2 ANIOS DE PENA
            return "Si";
        } else {
            return "No";
        }
    }

    public void pagarFianza(int damageCaused) {
        if (this.implicacion.equals("acusado") && this.colaboro) {
            this.fianza = Math.min(this.fianza, damageCaused * 0.5);
        }
    }
}
