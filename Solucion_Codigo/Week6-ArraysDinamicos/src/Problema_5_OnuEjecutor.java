import java.util.ArrayList;
public class Problema_5_OnuEjecutor {
    public static void main(String[] args) {      
        ArrayList<String> paisesInvolucrados = new ArrayList<>();
        paisesInvolucrados.add("Ecuador");
        paisesInvolucrados.add("Rusia");
        Problema_5_Conflicto conflicto= new Problema_5_Conflicto("Conflicto A", paisesInvolucrados, "03-05-1941");
        Ejercicio_5_Eventos evento1 = new Ejercicio_5_Eventos("Guerra Civil", "15-04-1912", "Latinoamerica", "Batalla", "Revelacion del estado", true, 30);
        Ejercicio_5_Eventos evento2 = new Ejercicio_5_Eventos("Asesinato Alcalde Capital", "09-12-2005", "Europa", "Batalla", "El alcaldo recibió disparo en el corazón", true, 5);
        conflicto.agEvento(evento1);
        conflicto.agEvento(evento2);
        System.out.println("Nombre del conflicto: " + conflicto.getNombre());
        System.out.println("Estado actual del conflicto: " + conflicto.getEstadoActual());
        for (Ejercicio_5_Eventos evento : conflicto.consultarEventos()) {
            System.out.println("Evento: " + evento.getNombre() + ", Tipo: " + evento.getTipo() + ", Fecha: " + evento.getFecha());
        }
        System.out.println(conflicto);
        System.out.println(evento1);
        System.out.println(evento2);
    }
}