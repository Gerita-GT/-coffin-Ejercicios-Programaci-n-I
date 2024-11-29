
import java.util.Scanner;

public class ContadorPares {
    public static void main(String[] args) {
        // Método principal que ejecuta el programa.

        Scanner scanner = new Scanner(System.in);
        // Se crea un objeto Scanner para leer la entrada del usuario desde la consola.

        System.out.println("Ingrese el límite hasta el que debe contar el programa");
        // Muestra un mensaje para que el usuario introduzca el límite superior.

        int limite = scanner.nextInt();
        // Lee el número ingresado por el usuario y lo almacena en la variable "limite".

        int contador = 0;
        // Se inicializa el contador de números pares en 0.

        for (int i = 1; i <= limite; i++) {
            // Bucle que recorre los números desde 1 hasta el valor de limite.

            if (i % 2 == 0) {
                // Condición que verifica si el número actual es par (divisible por 2).

                contador++;
                // Incrementa el contador si el número es par.
            }
        }

        System.err.println("Entre 1 y " + limite + ", hay " + contador + " numeros pares");
        // Muestra en la consola la cantidad de números pares encontrados. 
        // Se usa "System.err" para imprimir en la salida de error estándar (aunque podría ser 'System.out').

        scanner.close();
        // Cierra el objeto Scanner para liberar los recursos.  
    }

}