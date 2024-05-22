
import java.util.ArrayList;

public class Problema_1_CarritodeCompras {

    ArrayList<Problema_1_Producto> productos;
    ArrayList<Problema_1_Producto> almacen;
    double total;

    public Problema_1_CarritodeCompras(ArrayList<Problema_1_Producto> almacen) {
        this.almacen = almacen;
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }
    public void agregarProducto(String nombre, int cantidad) {
        for (Problema_1_Producto producto : almacen) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                if (producto.getCantidad() >= cantidad) {
                    productos.add(new Problema_1_Producto(nombre, producto.getPrecio(), cantidad));
                    producto.setCantidad(producto.getCantidad() - cantidad);
                    total += producto.getPrecio() * cantidad;
                    System.out.println("Producto " + nombre + " agregado al carrito.");
                } else {
                    System.out.println("No hay suficiente cantidad de este producto en la tienda.");
                }
                return;
            }
        }
        System.out.println("Producto no encontrado en la tienda.");
    }

    public double calcularTotal() {
        return total;
    }

    public void realizarPago(double montoPagado) {
        double totalConDescuento = total;
        if (total > 1000) {
            totalConDescuento = total * (0.1);
        }
        if (montoPagado >= totalConDescuento) {
            double cambio = montoPagado - totalConDescuento;
            System.out.println("Pago realizado con éxito. Su cambio es: $" + String.format("%.2f", cambio));
            total = 0;
            productos.clear();
        } else {
            double faltante = totalConDescuento - montoPagado;
            System.out.println("Pago insuficiente. Faltan: $" + String.format("%.2f", faltante));
        }
    }

    public void mostrarDetalleCompra() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }

        System.out.println("Detalle de la compra:");
        for (Problema_1_Producto producto : productos) {
            System.out.println(producto.getNombre() + " - Cantidad: " + producto.getCantidad() + " - Precio: $" + String.format("%.2f", producto.getPrecio()));
        }
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
