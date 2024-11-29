package AplicacionInventario;

import java.util.Scanner;

    class Producto {
        String nombre;
        int cantidad;
        double precio;
    
        // Constructor
        public Producto(String nombre, int cantidad, double precio) {
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precio = precio;
        }
    }
    
    public class yanose
    {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numProductos = 0;
            
            // Definir el tamaño del array con validación
            while (true) {
                System.out.print("¿Cuántos productos desea ingresar? ");
                String input = scanner.nextLine();
                try {
                    numProductos = Integer.parseInt(input);
                    if (numProductos > 0) {
                        break; // Salir del bucle si la entrada es válida
                    } else {
                        System.out.println("Por favor, ingrese un número positivo.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número.");
                }
            }
    
            Producto[] productos = new Producto[numProductos];
    
            // Capturar los datos de cada producto
            for (int i = 0; i < numProductos; i++) {
                System.out.println("Producto " + (i + 1) + ":");
                System.out.print("Ingrese el nombre del producto: ");
                String nombreProducto = scanner.nextLine();
    
                int cantidadProducto = 0;
                // Validar la cantidad del producto
                while (true) {
                    System.out.print("Ingrese la cantidad del producto: ");
                    String cantidadInput = scanner.nextLine();
                    try {
                        cantidadProducto = Integer.parseInt(cantidadInput);
                        if (cantidadProducto >= 0) {
                            break; // Salir del bucle si la entrada es válida
                        } else {
                            System.out.println("La cantidad no puede ser negativa. Intente de nuevo.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida. Por favor, ingrese un número.");
                    }
                }
    
                double precioProducto = 0.0;
                // Validar el precio del producto
                while (true) {
                    System.out.print("Ingrese el precio del producto: ");
                    String precioInput = scanner.nextLine();
                    try {
                        precioProducto = Double.parseDouble(precioInput);
                        if (precioProducto >= 0) {
                            break; // Salir del bucle si la entrada es válida
                        } else {
                            System.out.println("El precio no puede ser negativo. Intente de nuevo.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida. Por favor, ingrese un número.");
                    }
                }
    
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