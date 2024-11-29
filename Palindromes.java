import java.util.HashMap;

public class Palindromes {

    public static boolean isPalindrome(int number) {
        // Convertimos el número a una cadena para poder manipularlo carácter por carácter.
        String numberString = String.valueOf(number);

        // Creamos un mapa (HashMap) para contar la frecuencia de cada carácter (dígito) del número.
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Recorremos la cadena y contabilizamos cuántas veces aparece cada dígito.
        for (char digit : numberString.toCharArray()) {
            // Si el dígito ya existe en el mapa, incrementamos su contador; 
            // si no, lo agregamos con valor inicial de 1.
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
        }

        // Invertimos la cadena usando StringBuilder para verificar si es un palíndromo directamente.
        String reversedString = new StringBuilder(numberString).reverse().toString();
        if (numberString.equals(reversedString)) {
            // Si la cadena original es igual a la invertida, el número es un palíndromo.
            return true;
        }

        // Si el número no es un palíndromo directo, verificamos si puede ser reorganizado para formar uno.
        int oddCount = 0;  // Variable para contar los dígitos con frecuencia impar.
        for (int frequency : frequencyMap.values()) {
            // Si la frecuencia de un dígito es impar, incrementamos el contador de impares.
            if (frequency % 2 != 0) {
                oddCount++;
            }
        }

        // Para que un número pueda ser reorganizado como palíndromo:
        // - Si tiene longitud par, todos los dígitos deben tener frecuencia par.
        // - Si tiene longitud impar, solo uno de los dígitos puede tener frecuencia impar.
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        // Pruebas con varios números para verificar si son palíndromos o pueden ser reorganizados como palíndromos.
        System.out.println("¿El número 5 es palíndromo? " + isPalindrome(5));
        System.out.println("¿El número 2121 es palíndromo? " + isPalindrome(2121));
        System.out.println("¿El número 1331 es palíndromo? " + isPalindrome(1331));
        System.out.println("¿El número 3357665 es palíndromo? " + isPalindrome(3357665));
        System.out.println("¿El número 1294 es palíndromo? " + isPalindrome(1294));
    }
}
