import java.util.Scanner;

public class ArrayEjercicio {
    public static void main(String[] args) {
        // Método principal que se ejecuta al iniciar el programa. 
        // "public" indica que es accesible desde cualquier parte.
        // "static" significa que pertenece a la clase y no requiere una instancia para ser ejecutado.
        // "void" indica que no devuelve valor.
        // "String[] args" permite recibir argumentos desde la línea de comandos.
    
        int suma = 0;
        // Se declara e inicializa la variable "suma" con valor 0. 
        // Esta variable almacenará la suma de los números ingresados.
    
        Scanner scanner = new Scanner(System.in);
        // Se crea un objeto "Scanner" para leer la entrada del usuario desde la consola ('System.in').
    
        int numeros[] = new int[5];
        // Se declara un arreglo de enteros llamado "numeros" con capacidad para almacenar 5 elementos.
    
        for (int i = 0; i < numeros.length; i++) {
            // Comienza un bucle "for" que recorre las posiciones del arreglo numeros.
            // desde "i = 0" hasta "i < numeros.length" (Esta función nos dice la magnitud del arreglo).
    
            System.out.print("Ingresa el numero en la posicion " + i + ":");
            // Imprime un mensaje solicitando al usuario que ingrese un número para la posición actual i del arreglo.
    
            numeros[i] = scanner.nextInt();
            // Lee un número entero ingresado por el usuario y lo almacena en la posición i del arreglo numeros.
    
            suma += numeros[i];
            // Suma el número ingresado a la variable suma. 
        }
    
        double promedio = suma / (double) numeros.length;
        // Calcula el promedio dividiendo la suma total entre la cantidad de elementos en el arreglo.
    
        System.out.println("El promedio es " + promedio);
        // Imprime el promedio calculado en la consola. Se concatena el mensaje con el valor de promedio.
    
        scanner.close();
        // Cierra el objeto Scanner para liberar recursos asociados con la entrada estándar.
    }    
}

