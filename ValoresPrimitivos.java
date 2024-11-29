
import java.util.Scanner;
public class ValoresPrimitivos {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        // Enteros
        int yearMinutes = 525600; // int comprende números entre [-2 Mil Millones, casi 2 Mil Millones] utiliza 4bytes
        byte age = 32; // byte comprende números entre [-128, 127], utiliza 1byte
        short moneyNequi = 25300; // short comprende números entre [-32768, 32767] utiliza 2bytes
        // long comprende números entre [-90000000000000000, 90000000000000000] (son 16 ceros) utiliza 8bytes

        // Decimales
        float discount05 = 5;
        double e = 2.718281828459045;

        // Caracter
        char inicial = 'T';

        System.out.println("¿Cuántos minutos tiene un año? R/ " + yearMinutes);
        System.out.println("La edad es: " + age);
        System.out.println("En neki solo tengo: " + moneyNequi);
        System.out.println("¿De cuánto es el descuento? R/ " + discount05);
        System.out.println("Cifra completa de Euler: " + e);
        System.out.println("¿Cuál es su inicial? R/ " + inicial);
        System.out.println("Charly, Charly ¿Estás aquí?");

        // Boolean, o sea, verdadero o falso
        boolean charlyCharly = false;

            if (charlyCharly) {
                System.out.println("Charly responde: No.");
            } else {
                System.out.println("Charly responde: Sí.");
            }

        escaner.close();
    }
}
