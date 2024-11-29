
import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        Double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero");
        Double num2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer numero");
        Double num3 = scanner.nextDouble();
        
        Double media = ((num1 + num2 + num3) / 3);
        
        System.out.println("El resultado de la media es; " + media);

        scanner.close();
    }
}
