public class Problema_3_Departamento {
    String nombre;
    int numEmpl;
    double proAnu;
    String cat;
    public Problema_3_Departamento(String nombre, int numEmpl, double proAnu, String cat) {
        this.nombre = nombre;
        this.numEmpl = numEmpl;
        this.proAnu = proAnu;
        this.cat = cat;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumEmpl() {
        return numEmpl;
    }
    public double getProAnu() {
        return proAnu;
    }
    public String getCat() {
        return cat;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumEmpl(int numEmpl) {
        this.numEmpl = numEmpl;
    }

    public void setProAnu(double proAnu) {
        this.proAnu = proAnu;
    }
    public void setCat(String cat) {
        this.cat = cat;
    }
    public void definirCat(int numEmpl, double proAnu, String cat) {
        if (numEmpl <= 10 && proAnu == 500000) {
            this.cat = "C";
        } else {
            if (numEmpl <= 20 && proAnu == 1000000) {
                this.cat = "B";
            } else {
                if (numEmpl > 20 && proAnu >     1000000) {
                    this.cat = "A";
                }
            }
        }

    }

    @Override
    public String toString() {
        return "Problema_3_Departamento{" + "nombre=" + nombre + ", numEmpl=" + numEmpl + ", proAnu=" + proAnu + ", cat=" + cat + '}';
    }  
}