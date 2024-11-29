import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el codigo que desea pedir: ");
        System.out.println("Menú");
        System.out.println("1 --> sumar");
        System.out.println("2 --> restar");
        System.out.println("3 --> multiplicar");
        System.out.println("4 --> dividir");
        System.out.println("Seleccione el codigo de la operación que desea realizar: ");
        int codigo = scanner.nextInt();

        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();

        switch (codigo) {
            case 1:
                int suma = num1 + num2;
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                int resta = num1 - num2;
                System.out.println("La resta es: " + resta);
                break;
            case 3:
                int multiplicacion = num1 * num2;
                System.out.println("La multiplicacion es: " + multiplicacion);
                break;    
            case 4:
                int division = num1 / num2;
                System.out.println("La division es: " + division);
                break;    
        
            default:
                System.out.println("Codigo no valido");
                break;
        }

        scanner.close();
    }
}
