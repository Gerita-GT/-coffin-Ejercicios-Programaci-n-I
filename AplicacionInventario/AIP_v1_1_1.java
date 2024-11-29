package AplicacionInventario;

import java.util.Scanner;

class Producto 
{
    String nombre;
    int cantidad;
    double precio;

    // Constructor
    public Producto(String nombre, int cantidad, double precio) 
    {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;

    }
}

public class AIP_v1_1_1  
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        
        // Definir el tamaño del array
        System.out.print("¿Cuántos productos desea ingresar? ");
        int numProductos = Integer.parseInt(scanner.nextLine());
        Producto[] productos = new Producto[numProductos];

        // Capturar los datos de cada producto
        for (int i = 0; i < numProductos; i++) 
        {
            System.out.println("Producto " + (i + 1) + ":");
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese la cantidad del producto: ");
            int cantidadProducto = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el precio del producto: ");
            double precioProducto = Double.parseDouble(scanner.nextLine());

            // Crear un nuevo objeto Producto y almacenarlo en el array
            productos[i] = new Producto(nombreProducto, cantidadProducto, precioProducto);
        }

        // Mostrar el resumen de los productos ingresados
        System.out.println("\nResumen de productos ingresados:");
        for (Producto producto : productos) {
            double total = producto.cantidad * producto.precio;
            System.out.printf("Nombre: %s, Cantidad: %d, Precio: %.2f, Total: %.2f\n",
                    producto.nombre, producto.cantidad, producto.precio, total);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
