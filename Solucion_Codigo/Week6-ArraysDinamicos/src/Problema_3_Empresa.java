import java.util.ArrayList;
public class Problema_3_Empresa {
    String nombre;
    String ruc;
    String direccion;
    ArrayList<Problema_3_Departamento> depa;
    public Problema_3_Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.depa = new ArrayList<>();
    }
    public void agregarDepartamento(Problema_3_Departamento departamento) {
        depa.add(departamento);
    }
    public void mostrarDepartamentos() {
        System.out.println("Detalles de los departamentos de la empresa " + nombre + ":");
        for (Problema_3_Departamento departamento : depa) {
            System.out.println(departamento);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Problema_3_Departamento> getDepartamentos() {
        return depa;
    }
}