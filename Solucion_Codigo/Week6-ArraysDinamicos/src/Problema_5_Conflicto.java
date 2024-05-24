import java.util.ArrayList;
public class Problema_5_Conflicto {
    String nombConfli;
    ArrayList<String> paisesInvo;
    String fechaIni;
    String estadoAc;
    ArrayList<Ejercicio_5_Eventos> eventos;
    public Problema_5_Conflicto(String nombCofli, ArrayList<String> paisesInvo, String fechaIni) {
        this.nombConfli = nombCofli;
        this.paisesInvo = paisesInvo;
        this.fechaIni = fechaIni;
        this.estadoAc = "Activo";
        this.eventos = new ArrayList<>();
    }
    public void agEvento(Ejercicio_5_Eventos evento) {
        eventos.add(evento);
        actualizar();
    }
    public void actualizar() {
        int totalPaises = paisesInvo.size();
        ArrayList<String> pc = new ArrayList<>();
        for (Ejercicio_5_Eventos evento : eventos) {
            if (evento.getTipo().equals("Batalla") && !pc.contains(evento.getUbicacion())) {
                pc.add(evento.getUbicacion());
            }
        }
        double ppc = (double) pc.size() / totalPaises;
        if (ppc > 0.5) {
            estadoAc = "Guerra Mundial";
        } else if (ppc >= 0.3) {
            estadoAc = "Reunión Urgente";
        }
        String[] paisesPrimerMundo = {"EEUU", "Rusia", "Reino Unido", "Francia", "Portoviejo"};
        boolean bn = false;
        for (Ejercicio_5_Eventos evento : eventos) {
            for (String pais : paisesPrimerMundo) {
                if (evento.getUbicacion().equals(pais) && evento.siUsaArmasNucleares()) {
                    bn = true;
                    break;
                }
            }
        }
        if (bn) {
            estadoAc = "Guerra Mundial";
        }
        for (Ejercicio_5_Eventos evento : eventos) {
            if (evento.getBajasPorcentuales() >= 50) {
                estadoAc = "Reunión Urgente";
                break;
            }
        }
    }
    public ArrayList<Ejercicio_5_Eventos> consultarEventos() {
        return eventos;
    }
    public String getNombre() {
        return nombConfli;
    }

    public String getEstadoActual() {
        return estadoAc;
    }

    @Override
    public String toString() {
        return "Conflicto{" + "nombre=" + nombConfli + ", paisesInvolucrados=" + paisesInvo + ", fechaInicio=" + fechaIni + ", estadoActual=" + estadoAc + ", eventos=" + eventos + '}';
    }

}