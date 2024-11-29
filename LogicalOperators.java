
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Solicita al usuario que ingrese tres números
        System.out.println("Ingresa el primer número:");
        double firstNumber = inputScanner.nextDouble();  // Primer número ingresado por el usuario

        System.out.println("Ingresa el segundo número:");
        double secondNumber = inputScanner.nextDouble(); // Segundo número ingresado

        System.out.println("Ingresa el tercer número:");
        double thirdNumber = inputScanner.nextDouble();  // Tercer número ingresado

        
        // Ejemplo de uso de AND (&&)
        System.out.println("¿El primer número es mayor que el segundo y menor que el tercero?");
        System.out.println("Resultado: " + (firstNumber > secondNumber && firstNumber < thirdNumber));

        // Ejemplo de uso de OR (||)
        System.out.println("¿El primer número es mayor que el segundo o menor que el tercero?");
        System.out.println("Resultado: " + (firstNumber > secondNumber || firstNumber < thirdNumber));

        // Ejemplo de uso de NOT (!)
        System.out.println("¿El primer número NO es igual al segundo?");
        System.out.println("Resultado: " + !(firstNumber == secondNumber));

        // Condición compuesta usando todos los operadores
        System.out.println("¿El primer número es mayor que el segundo, el tercero es positivo y el primer número es distinto del tercero?");
        boolean complexCondition = (firstNumber > secondNumber) && (thirdNumber > 0) && (firstNumber != thirdNumber);
        System.out.println("Resultado: " + complexCondition);

        // Comparación adicional
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("Los tres números son iguales.");
        } else {
            System.out.println("Los números no son iguales.");
        }

        // Cierra el scanner para liberar recursos
        inputScanner.close();
    }
}

