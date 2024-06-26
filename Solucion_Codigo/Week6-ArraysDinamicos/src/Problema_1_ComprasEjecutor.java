import java.util.ArrayList;
public class Problema_1_ComprasEjecutor {
    public static void main(String[] args) {
        ArrayList<Problema_1_Producto> almacen= new ArrayList<>(); // Se crea un almacen de productos
        almacen.add(new Problema_1_Producto("GASEOSA", 1.0, 100));
        almacen.add(new Problema_1_Producto("CHEETOS", 0.5, 100));
        almacen.add(new Problema_1_Producto("ALCOHOL", 3.2, 100));
        almacen.add(new Problema_1_Producto("POLLO", 1.5, 100));
        almacen.add(new Problema_1_Producto("PASTA DENTAL", 1.0, 100));
        almacen.add(new Problema_1_Producto("CAFÉ", 2.0, 100));
        almacen.add(new Problema_1_Producto("VEGETALES", 0.60, 100)); // Estos fueron todos los productos que tiene la tienda

        Problema_1_CarritodeCompras carrito = new Problema_1_CarritodeCompras(almacen); // Aqui suponemos que un cliente va a agregar productos de nuestra tienda a su carrito de compra
        carrito.agregarProducto("Pollo", 3); // este producto si existe en nuestra tienda
        carrito.agregarProducto("cuchillo", 2); // este no existe, asi que le decimos al cliente: Producto No disponible 
        carrito.mostrarDetalleCompra(); // Detalles de todo lo que comprara el cliente
        double total = carrito.calcularTotal();
        System.out.println("Total a pagar: $" + String.format("%.2f", total));
        carrito.realizarPago(20); // aqui el cliente paga por todo lo que tomo en su carrito
    }
}
