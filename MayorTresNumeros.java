import java.util.Scanner;

public class MayorTresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese un numero");
        double num2 = scanner.nextDouble();
        System.out.println("Ingrese un numero");
        double num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es: " + num1);
            

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es: " + num2);

        } else {
            System.out.println("El numero mayor es: " + num3);
        }
        
        scanner.close();
    }
}
