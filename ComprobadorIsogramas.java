import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.HashSet;

public class ComprobadorIsogramas {

    public static boolean esIsograma(String entrada) {
        // Comprobar si la entrada está vacía
        if (entrada.isEmpty()) {
            return true; 
        }

        // Comprobar si la entrada contiene espacios (indica más de una palabra)
        if (entrada.contains(" ")) {
            return false;
        }
        
        // Normalizar la entrada: eliminar acentos y convertir a minúsculas
        String entradaNormalizada = normalizarTexto(entrada).toLowerCase();

        // Usar un HashSet para verificar caracteres únicos de manera eficiente
        HashSet<Character> caracteresUnicos = new HashSet<>();

        for (char caracter : entradaNormalizada.toCharArray()) {
            if (!caracteresUnicos.add(caracter)) {
                // Si el carácter ya está en el conjunto, no es un isograma
                return false;
            }
        }

        // Si todos los caracteres son únicos, es un isograma
        return true;
    }

    public static String normalizarTexto(String texto) {
        // Normaliza el texto a la forma NFD (Descomposición) para separar letras y acentos
        String textoNormalizado = Normalizer.normalize(texto, Form.NFD);
        // Eliminar caracteres no ASCII (acentos y marcas diacríticas)
        return textoNormalizado.replaceAll("[^\\p{ASCII}]", "");
    }

    public static void main(String[] args) {
        // Ejemplos de prueba
        System.out.println("Cadena vacía: " + esIsograma("")); // true
        System.out.println("Prueba 'reto': " + esIsograma("reto")); // true
        System.out.println("Prueba 'múrcielago': " + esIsograma("múrcielago")); // true
        System.out.println("Prueba 'PeRrO': " + esIsograma("PeRrO")); // false
        System.out.println("Prueba 'GaTo': " + esIsograma("GaTo")); // true
        System.out.println("Prueba 'dos palabras': " + esIsograma("dos palabras")); // false
        System.out.println("Prueba 'Hiperbólico': " + esIsograma("Hiperbólico")); // true
    }
}