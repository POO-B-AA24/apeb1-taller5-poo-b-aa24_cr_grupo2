
/**
 *
 * @author MRodzDirect 😉 <Organico>
 */
public class Problema_2_Materia {

    private String nombre;
    private double ACD;
    private double APE;
    private double AA;

    public Problema_2_Materia(String nombre, double ACD, double APE, double AA) {
        this.nombre = nombre;
        this.ACD = ACD;
        this.APE = APE;
        this.AA = AA;
    }

    public String getName() {
        return nombre;
    }

    public double getACD() {
        return ACD;
    }

    public double getAPE() {
        return APE;
    }

    public double getAA() {
        return AA;
    }
}
