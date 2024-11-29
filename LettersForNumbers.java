// Importaciones necesarias para el manejo de caracteres especiales y estructuras de datos
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.HashMap;

public class LettersForNumbers {

    // Método para normalizar texto eliminando acentos y caracteres especiales
    public static String normalizarSinAcentos(String palabra) {
        // Convierte la palabra a su forma normalizada, separando letras base y diacríticos
        String palabraNormalizada = Normalizer.normalize(palabra, Form.NFD);
        // Elimina todos los caracteres que no sean ASCII básico
        palabraNormalizada = palabraNormalizada.replaceAll("[^\\p{ASCII}]", "");
        return palabraNormalizada;
    }
    
    // Método principal para convertir letras a sus posiciones en el alfabeto
    public static String modificadorAlfabetico (String palabra){
        // Verifica si la entrada es nula o vacía
        if (palabra == null || palabra.isEmpty()) {
            return "";
        }

        // Crea un mapa para asociar cada letra con su posición en el alfabeto
        HashMap<Character,Integer> indiceAlfabetico = new HashMap<>();

        // Inicializa el mapa con las letras del alfabeto y sus posiciones
        indiceAlfabetico.put('a', 1); indiceAlfabetico.put('b', 2); /* ... y así sucesivamente ... */ indiceAlfabetico.put('z', 26);

        // Normaliza la palabra: quita acentos, convierte a minúsculas y elimina espacios
        palabra = normalizarSinAcentos(palabra).toLowerCase().replaceAll("\\s+", "");

        // Convierte la palabra en un array de caracteres
        char [] caracteresPalabra = palabra.toCharArray();

        // StringBuilder para construir el resultado eficientemente
        StringBuilder resultado = new StringBuilder();

        // Itera sobre cada carácter y lo convierte a su posición numérica
        for (char c : caracteresPalabra) {
            resultado.append(indiceAlfabetico.get(c) + " ");
        }
        return resultado.toString();
    }

    // Método main para probar la funcionalidad
    public static void main(String[] args) {
        System.out.println(modificadorAlfabetico("abc def"));
        System.out.println(modificadorAlfabetico("áéíóú")); // Prueba con acentos
        System.out.println(modificadorAlfabetico("hello world")); // Prueba con frase
        System.out.println(modificadorAlfabetico("")); // Prueba con cadena vacía
    }
}