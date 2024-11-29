import java.util.ArrayList;
import java.util.HashSet;

public class RepeatedElements{

    public static <T> HashSet<T> obtenerRepetidosPares (ArrayList<T> elementos) { // T representa una coleccion generica, es decir, recibe y retorna cualquier tipo de datos

        HashSet<T> resultadosRepetidos = new HashSet<>(); //Se usa hash set ya que esta colection no admite elementos repetidos

        for (T elem : elementos) { //Este for toma solo el primer elemnto del Arraylist
            int contadorElementos = 0;
            for (T e : elementos) { //Este for compara el elemento tomado en el primer for con el resto del Arraylist
                if (e.equals(elem)) { //Si el elemento actual es igual al tomado en el primer bucle se aumenta el contador
                    contadorElementos++;
                }
            }
            if (contadorElementos % 2 == 0) { //Se verifica que los repetidos sean pares
                resultadosRepetidos.add(elem);
            }
        }
        return resultadosRepetidos;
    }


    public static void main(String[] args) {
        //Array para Strings
        ArrayList<String> elementosString = new ArrayList<>();
        elementosString.add("A");
        elementosString.add("B");
        elementosString.add("A");
        elementosString.add("C");
        elementosString.add("C");
        elementosString.add("C");
        elementosString.add("C");

        System.out.println("String repetidos " + obtenerRepetidosPares(elementosString));

        //Array para enteros
        ArrayList<Integer> elementosInt = new ArrayList<>();
        elementosInt.add(1);
        elementosInt.add(2);
        elementosInt.add(3);
        elementosInt.add(1);
        elementosInt.add(2);

        System.out.println("Enteros repetidos " + obtenerRepetidosPares(elementosInt));
    }
}