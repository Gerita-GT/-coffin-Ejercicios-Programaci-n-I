import java.util.Scanner;
import java.util.Locale;

public class AreaPoligono {
    public static void main(String[] args) {
        // Configuración del Scanner para leer entrada con punto decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Menú de polígonos con sus respectivas opciones
        System.out.println("Menú de figuras geométricas:");
        System.out.println("Opción 1  -----> Triángulo");
        System.out.println("Opción 2  -----> Cuadrilátero");
        System.out.println("Opción 3  -----> Pentágono");
        System.out.println("Opción 4  -----> Hexágono");
        System.out.println("Opción 5  -----> Heptágono");
        System.out.println("Opción 6  -----> Octágono");
        System.out.println("Opción 7  -----> Nonágono");
        System.out.println("Opción 8  -----> Decágono");
        System.out.println("Opción 9  -----> Hendecágono");
        System.out.println("Opción 10 -----> Dodecágono");
        
        byte codigo; // Variable para almacenar la opción del usuario

        // Validación del código de entrada (entre 1 y 10)
        do {
            System.out.println("Ingrese el código de la figura deseada");
            codigo = scanner.nextByte();
            if (codigo < 1 || codigo > 10) {
                System.out.println("Ingrese un código válido");
            }
        } while ((codigo < 1) || (codigo > 10));

        // Solicitar longitud del lado del polígono
        System.out.print("Ingresa la longitud del lado de la figura: ");
        double lado = scanner.nextDouble();
        
        // Variables para almacenar resultados
        double area = 0; // Almacena el área calculada
        String nombreFigura = ""; // Almacena el nombre del polígono

        // Cálculo del área según el polígono seleccionado
        switch (codigo) {
            case 1: // Triángulo
                nombreFigura = "Triángulo";
                // Fórmula: (√3 / 4) * lado²
                // Calcula el área de un triángulo equilátero
                area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);
                break;
            case 2: // Cuadrilátero
                nombreFigura = "Cuadrilátero";
                // Fórmula simple: lado²
                // Calcula el área de un cuadrado
                area = Math.pow(lado, 2);
                break;
            case 3: // Pentágono
                nombreFigura = "Pentágono";
                // Fórmula compleja que involucra raíces cuadradas
                // Calcula el área de un pentágono regular
                area = (1.0 / 4) * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(lado, 2);
                break;
            case 4: // Hexágono
                nombreFigura = "Hexágono";
                // Fórmula que usa raíz cuadrada de 3
                // Calcula el área de un hexágono regular
                area = (3 * Math.sqrt(3) / 2) * Math.pow(lado, 2);
                break;
            case 5: // Heptágono
                nombreFigura = "Heptágono";
                // Fórmula que usa tangente y pi
                // Calcula el área de un heptágono regular
                area = (7.0 / 4) * Math.pow(lado, 2) * (1 / Math.tan(Math.PI / 7));
                break;
            case 6: // Octágono
                nombreFigura = "Octágono";
                // Fórmula que usa raíz cuadrada
                // Calcula el área de un octágono regular
                area = 2 * (1 + Math.sqrt(2)) * Math.pow(lado, 2);
                break;
            case 7: // Nonágono
                nombreFigura = "Nonágono";
                // Fórmula que usa tangente y pi
                // Calcula el área de un nonágono regular
                area = (9.0 / 4) * Math.pow(lado, 2) * (1 / Math.tan(Math.PI / 9));
                break;
            case 8: // Decágono
                nombreFigura = "Decágono";
                // Fórmula compleja con múltiples raíces
                // Calcula el área de un decágono regular
                area = (5.0 / 2) * Math.pow(lado, 2) * Math.sqrt(5 + 2 * Math.sqrt(5));
                break;
            case 9: // Hendecágono
                nombreFigura = "Hendecágono";
                // Fórmula que usa tangente y pi
                // Calcula el área de un hendecágono regular
                area = (11.0 / 4) * Math.pow(lado, 2) * (1 / Math.tan(Math.PI / 11));
                break;
            case 10: // Dodecágono
                nombreFigura = "Dodecágono";
                // Fórmula que usa raíz cuadrada
                // Calcula el área de un dodecágono regular
                area = 3 * Math.pow(lado, 2) * (2 + Math.sqrt(3));
                break;
            default:
                System.out.println("Código no válido");
                break;
        }

        // Impresión del resultado con formato
        // %s: cadena (nombre del polígono)
        // %.2f: número decimal con 2 decimales
        System.out.printf("El área del %s con lado %.2f es: %.2f\n", nombreFigura, lado, area);

        // Cierre del scanner para liberar recursos
        scanner.close();
    }
}