import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicito por consola dos palabras para comparar.
        System.out.println("Ingrese una palabra");
        String word1 = scanner.next();
        System.out.println("Ingrese otra palabra");
        String word2 = scanner.next();

        // Este boolean utiliza una varibale resultado para igualarla al método que comprueba el anagrama.
        boolean result= checkAnagrams(word1, word2);
        if(result) {
            System.out.println("Las palabras " + word1 + " y " + word2 + " SÍ son anagramas");
        } else {
            System.out.println("Las palabras " + word1 + " y " + word2 + " NO son anagramas");
        }

        scanner.close();
    }

    // Método que verifica el anagrama.
    public static boolean checkAnagrams (String word1, String word2 ){
        // Aqui se utiliza el método toLowerCase para convertir en minúsculas las palabras ingresadas.
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();

        // El método equals compara si dos objetos String (word1 y word2) son iguales en contenido.
        if (word1.equals(word2)){
            return false; // Retorna falso cuando los dos objetos son iguales en contenido.
        }

        // El método toCharArray() convierte un String en un array de caracteres (char[]).
        char[] characters1 = word1.toCharArray();
        char[] characters2 = word2.toCharArray();

        /* Es un método estático de la clase Arrays que ordena los elementos de un array.
        En este caso, ordena los caracteres de cada array en orden ascendente. */
        Arrays.sort(characters1);
        Arrays.sort(characters2);

        // Aquí el método equals compara su los dos objetos en diferente orden son anagramas.
        return(Arrays.equals(characters1,characters2));
    }
}