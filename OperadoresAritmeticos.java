import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num1= scanner.nextDouble();
        System.out.println("Ingrese un numero");
        double num2= scanner.nextDouble();
       
        //suma
       double suma = num1 + num2;
        
        //resta
        double resta = num1 - num2;
        
        //Multiplicacion
        double multiplicacion = num1*num2;
        
        //Division
        double division = num1 / num2;
        
        //Modulo
        double modulo = num1 % num2;
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("El modulo es: " + modulo);

        scanner.close();
    }
}
