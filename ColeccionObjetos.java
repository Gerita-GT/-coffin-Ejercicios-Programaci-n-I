import java.util.ArrayList;
import java.util.List;

public class ColeccionObjetos {

    public static void main(String[] args) {
        // Usar ArrayList en lugar de array
        List<String> objetos = new ArrayList<>(List.of("lámpara", "sofá", "televisor", "alfombra", "cuadro"));

        // Índice a buscar
        int indiceDeseado = 5;

        try {
            // Intentar acceder al elemento en el índice especificado
            String objetoEncontrado = objetos.get(indiceDeseado);
            System.out.printf("El objeto en la posición %d es: %s%n", indiceDeseado, objetoEncontrado);
        } catch (IndexOutOfBoundsException e) {
            // Capturar específicamente la excepción de índice fuera de rango
            System.out.printf("Error: No existe un objeto en la posición %d%n", indiceDeseado);
        }
    }
}