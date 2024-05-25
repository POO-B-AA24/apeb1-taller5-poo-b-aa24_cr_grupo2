public class Problema_5_Eventos {
    String nombreEven;
    String fechaOcu;
    String ubi;
    String tipo;
    String descripcion;
    boolean armn;
    int muertesComoPorcentajeDelPais;
    public Problema_5_Eventos(String nombreEven, String fechaOcu, String ubi,String tipo, String descripcion, boolean armas, int muertes) {
        this.nombreEven = nombreEven;
        this.fechaOcu = fechaOcu;
        this.ubi = ubi;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.armn=armas;
        this.muertesComoPorcentajeDelPais = muertes;
    }
    public String getNombre() {
        return nombreEven;
    }

    public String getFecha() {
        return fechaOcu;
    }

    public String getUbicacion() {
        return ubi;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean siUsaArmasNucleares() {
        return armn;
    }

    public int getBajasPorcentuales() {
        return muertesComoPorcentajeDelPais;
    }  
    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombreEven + ", fecha=" + fechaOcu + ", ubicacion=" + ubi + ", tipo=" + tipo + ", descripcion=" + descripcion + ", usaArmasNucleares=" + armn + ", bajasPorcentuales=" + muertesComoPorcentajeDelPais + '}';
    }
}