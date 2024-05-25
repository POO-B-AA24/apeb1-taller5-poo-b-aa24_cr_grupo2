
/**
 *
 * @author MRodzDirect 😉 <Organico>
 */
public class Problema5_Paises {

    private String name;
    private int muertes;

    private int poblacion;

    public Problema5_Paises(String name, int poblacion) {
        this.name = name;
        this.poblacion = poblacion;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }

    public double getPercentPoblacionAsesinada() {
        return (double) muertes / poblacion;
    }

    @Override
    public String toString() {
        return "Problema5_Paises{" + "name=" + name + ", muertes=" + muertes + ", poblacion=" + poblacion + '}';
    }
}
