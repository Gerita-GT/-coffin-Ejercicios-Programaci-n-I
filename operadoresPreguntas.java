import java.util.Scanner;
public class operadoresPreguntas{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese un numero");
        double num2 = scanner.nextDouble();
        System.out.println("Ingrese un numero");
        double num3 = scanner.nextDouble();

        System.err.println("num1>num2 && num1<num3: " + (num1>num2 && num1<num3) );


        scanner.close();
    }
    
}
