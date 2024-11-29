import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero del que desea el factorial");
        int numero = scanner.nextInt();

        int factorial=1;
        int i=1;

        while (i<=numero) {
            factorial=factorial*i;
            i++;
        }
        
        System.out.println("El factorial es: " + factorial);

        scanner.close();
    }
}
