
import java.util.ArrayList;

public class Problema_1_CarritodeCompras {

    ArrayList<Problema_1_Producto> productosDelCliente; // esto es el carrito de compras del cliente (lista de cosas que el cliente comprara)
    ArrayList<Problema_1_Producto> almacen; // Nuestro almacen, es una lista de la clase Productos
    double total;

    public Problema_1_CarritodeCompras(ArrayList<Problema_1_Producto> almacen) {
        this.almacen = almacen;
        this.productosDelCliente = new ArrayList<>();
        this.total = 0.0;
    }
// IMPORTANTE: No confundir el carrito de compras del cliente. Con nuestra tienda. Ver arriba la definicion de cada atributo
    public void agregarProducto(String nombre, int cantidad) {
        for (Problema_1_Producto producto : almacen) { // recorre cada producto de nuestro almacen
            if (producto.getNombre().equalsIgnoreCase(nombre)) { //verificar si el producto existe
                if (producto.getCantidad() >= cantidad) { // verificar si hay suficiente cantidad de ese producto en nuestra tienda
                    productosDelCliente.add(new Problema_1_Producto(nombre, producto.getPrecio(), cantidad)); //agrega el producto al carrito de compras del cliente 
                    producto.setCantidad(producto.getCantidad() - cantidad); // eliminamos la cantidad que compro el cliente de el total de ese producto en nuestro almacen
                    total += producto.getPrecio() * cantidad; // acumulamos todo el costo$$$ del cliente que nos pagara luego (acumular el costo de cada producto)
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
            productosDelCliente.clear();
        } else {
            double faltante = totalConDescuento - montoPagado;
            System.out.println("Pago insuficiente. Faltan: $" + String.format("%.2f", faltante));
        }
    }

    public void mostrarDetalleCompra() {
        if (productosDelCliente.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }

        System.out.println("Detalle de la compra:");
        for (Problema_1_Producto producto : productosDelCliente) {
            System.out.println(producto.getNombre() + " - Cantidad: " + producto.getCantidad() + " - Precio: $" + String.format("%.2f", producto.getPrecio())); // Useful feature, use formating inside a println method : Casting String.format methods
        }
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
