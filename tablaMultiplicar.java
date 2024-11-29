import java.util.Scanner;
public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero del que desea la tabla");
        int tabla = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int resultado = tabla * i;
            System.out.println(tabla + " * " + i + " = " + resultado);
        }

        scanner.close();
    }
}
