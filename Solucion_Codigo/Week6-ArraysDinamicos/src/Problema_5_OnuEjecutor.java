import java.util.ArrayList;
public class Problema_5_OnuEjecutor {
    public static void main(String[] args) {      
        ArrayList<Problema5_Paises> paisesInvolucrados = new ArrayList<>();
        paisesInvolucrados.add(new Problema5_Paises("Ecuador",20000000));
        paisesInvolucrados.add(new Problema5_Paises("Rusia",100000000));
        // Los paises solo poseen un atributo: es decir las muertes. Asi que mejor: Hicimos: Un arrayList de String para los paises ; y colocamos las muertes como un atributo de cada conflicto. De esta manera Evitando la creacion de una clase que solo utilizaria mas memoria y recursos en nuestro programa.
        Problema_5_Conflicto conflicto= new Problema_5_Conflicto("Conflicto A", paisesInvolucrados, "03-05-1941");
        Problema_5_Eventos evento1 = new Problema_5_Eventos("Guerra Civil", "15-04-1912", "Latinoamerica", "Batalla", "Revelacion del estado", true, 30); //las muertes las medimos Como Porcentaje De la poblacion total involucrada en el evento.
        Problema_5_Eventos evento2 = new Problema_5_Eventos("Asesinato Alcalde Capital", "09-12-2005", "Europa", "Batalla", "El alcalde recibió disparo en el corazón", true, 5);
        conflicto.agEvento(evento1);
        conflicto.agEvento(evento2);
        System.out.println("Nombre del conflicto: " + conflicto.getNombre());
        System.out.println("Estado actual del conflicto: " + conflicto.getEstadoActual());
       // Consultar eventos pertenecientes a un conflicto
        for (Problema_5_Eventos evento : conflicto.consultarEventos()) {
            System.out.println("Evento: " + evento.getNombre() + ", Tipo: " + evento.getTipo() + ", Fecha: " + evento.getFecha());
        }
        // Consultar todos los datos de cada conflicto.
        System.out.println(conflicto);
        // Consultar todos los eventos registrados
        System.out.println(evento1);
        System.out.println(evento2);
    }
}