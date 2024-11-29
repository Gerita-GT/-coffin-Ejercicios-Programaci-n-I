import java.util.Scanner;

public class EntradaDeDatos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        byte edad = scanner.nextByte();
        System.out.print("Ingrese su altura: ");
        double altura = scanner.nextDouble();
        
        System.out.print("Su nombre es: " + nombre + ", tiene " + edad + " años "+ " y su altura es " + altura);

       scanner.close();
    }
}