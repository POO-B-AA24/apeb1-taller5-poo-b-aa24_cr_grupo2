
public class Problema_3_EmpresaEjecutor {

    public static void main(String[] args) {
        System.out.println("Ingrese el nombre de la empresa");
        Problema_3_Empresa empresa = new Problema_3_Empresa("Landixxxxx", "123456789", "24 de mayo");
        Problema_3_Departamento depto1 = new Problema_3_Departamento("Produccion", 60, 1200000,"");
        Problema_3_Departamento depto2 = new Problema_3_Departamento("Venta", 25, 60000000,"");
        Problema_3_Departamento depto3 = new Problema_3_Departamento("Recursos Humanos", 10, 500000,"");
        empresa.agregarDepartamento(depto1);
        empresa.agregarDepartamento(depto2);
        empresa.agregarDepartamento(depto3);
        empresa.mostrarDepartamentos();
        depto1.definirCat(60, 12000000, "");
        depto2.definirCat(20, 1000000, "");
        depto3.definirCat(10, 500000, "");
        System.out.println(depto1.toString());
        System.out.println(depto2.toString());
        System.out.println(depto3.toString());
    }
}
