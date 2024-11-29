import java.util.ArrayList;

public class ElementosConPares {
    // Método genérico para obtener elementos que aparecen un número par de veces
    public static <T> ArrayList<T> obtenerElementosConOcurrenciasPares(ArrayList<T> listaOriginal) {
        ArrayList<T> listaResultado = new ArrayList<>();

        for (T elementoActual : listaOriginal) {
            int frecuencia = 0;
            // Contar la frecuencia del elemento actual
            for (T elementoComparado : listaOriginal) {
                if (elementoComparado.equals(elementoActual)) {
                    frecuencia++;
                }
            }
            // Si la frecuencia es par y el elemento no está ya en la lista resultado, añadirlo
            if (frecuencia % 2 == 0 && !listaResultado.contains(elementoActual)) {
                listaResultado.add(elementoActual);
            }
        }
        return listaResultado;
    }

    public static void main(String[] args) {
        // Ejemplo con ArrayList de Strings
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("A");
        listaStrings.add("B");
        listaStrings.add("A");
        listaStrings.add("C");
        listaStrings.add("C");
        listaStrings.add("C");
        listaStrings.add("C");
        ArrayList<String> resultadoStrings = obtenerElementosConOcurrenciasPares(listaStrings);
        System.out.println("Strings con ocurrencias pares: " + resultadoStrings);

        // Ejemplo con ArrayList de Integers
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);
        listaEnteros.add(1);
        listaEnteros.add(2);
        ArrayList<Integer> resultadoEnteros = obtenerElementosConOcurrenciasPares(listaEnteros);
        System.out.println("Enteros con ocurrencias pares: " + resultadoEnteros);
    }
}