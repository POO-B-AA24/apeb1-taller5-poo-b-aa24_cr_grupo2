
import java.util.ArrayList;

public class Problema_5_Conflicto {

    String nombConfli;
    ArrayList<Problema5_Paises> paisesInvo;
    String fechaIni;
    String estadoAc;
    ArrayList<Problema_5_Eventos> eventos;

    public Problema_5_Conflicto(String nombCofli, ArrayList<Problema5_Paises> paisesInvo, String fechaIni) {
        this.nombConfli = nombCofli;
        this.paisesInvo = paisesInvo;
        this.fechaIni = fechaIni;
        this.estadoAc = "Activo";
        this.eventos = new ArrayList<>();
    }

    public void agEvento(Problema_5_Eventos evento) {
        eventos.add(evento);
        actualizar();
    }

    public void actualizar() {
        int totalPaises = paisesInvo.size();
        ArrayList<String> pc = new ArrayList<>();
        for (Problema_5_Eventos evento : eventos) {
            if (evento.getTipo().equals("Batalla") && !pc.contains(evento.getUbicacion())) { // dont know if it was needed at all (second conditional)
                pc.add(evento.getUbicacion());
            }
        }
        double ppc = (double) pc.size() / totalPaises;
        if (ppc > 0.5) {
            estadoAc = "Guerra Mundial";
        } else if (ppc >= 0.3) {
            estadoAc = "Reunión Urgente";
        }

        for (Problema5_Paises paisa : paisesInvo) { // flag
            if (paisa.getPercentPoblacionAsesinada() >= 0.50) {
                estadoAc = "Reunión Urgente";
                break;
            }
        }
        String[] paisesPrimerMundo = {"EEUU", "Rusia", "Reino Unido", "Francia", "Portugal"};
        boolean bn = false;
        for (Problema_5_Eventos evento : eventos) {
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

    }

    public ArrayList<Problema_5_Eventos> consultarEventos() {
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
