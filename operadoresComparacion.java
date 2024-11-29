import java.util.Scanner; // Importamos la clase Scanner para leer entrada del usuario

public class operadoresComparacion {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el primer número
        System.out.println("Ingresa 1 numero");
        double number1 = scanner.nextDouble(); // Leemos el primer número como un double
        
        // Solicitamos al usuario que ingrese el segundo número
        System.out.println("Ingresa otro numero");
        double number2 = scanner.nextDouble(); // Leemos el segundo número como un double
        
        // Realizamos comparaciones entre los dos números y mostramos los resultados

        // Comparación de igualdad
        System.out.println("¿El numero 1 es igual al numero 2? " + (number1 == number2));

        // Comparación de desigualdad
        System.out.println("¿El numero 1 es diferente al numero 2? " + (number1 != number2));

        // Comparación "menor que"
        System.out.println("¿El numero 1 es menor al numero 2? " + (number1 < number2));

        // Comparación "mayor que"
        System.out.println("¿El numero 1 es mayor al numero 2? " + (number1 > number2));

        // Comparación "menor o igual que"
        System.out.println("¿El numero 1 es menor o igual al numero 2? " + (number1 <= number2));

        // Comparación "mayor o igual que"
        System.out.println("¿El numero 1 es mayor o igual al numero 2? " + (number1 >= number2));
    
        // Cerramos el scanner para liberar recursos
        scanner.close();
    }
}