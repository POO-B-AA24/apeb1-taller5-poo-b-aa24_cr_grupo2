import java.util.ArrayList;
public class Problema_1_ComprasEjecutor {
    public static void main(String[] args) {
        ArrayList<Problema_1_Producto> almacen= new ArrayList<>();
        almacen.add(new Problema_1_Producto("GASEOSA", 1.0, 100));
        almacen.add(new Problema_1_Producto("CHEETOS", 0.5, 100));
        almacen.add(new Problema_1_Producto("ALCOHOL", 3.2, 100));
        almacen.add(new Problema_1_Producto("POLLO", 1.5, 100));
        almacen.add(new Problema_1_Producto("PASTA DENTAL", 1.0, 100));
        almacen.add(new Problema_1_Producto("CAFÉ", 2.0, 100));
        almacen.add(new Problema_1_Producto("VEGETALES", 0.60, 100));
        Problema_1_CarritodeCompras carrito = new Problema_1_CarritodeCompras(almacen);
        carrito.agregarProducto("Pollo", 3);
        carrito.agregarProducto("cuchillo", 2);
        carrito.mostrarDetalleCompra();
        double total = carrito.calcularTotal();
        System.out.println("Total a pagar: $" + String.format("%.2f", total));
        carrito.realizarPago(20);
    }
}