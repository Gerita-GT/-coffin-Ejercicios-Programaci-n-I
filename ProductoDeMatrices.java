import java.util.Scanner;

public class ProductoDeMatrices {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar dimensiones de las matrices
        System.out.println("Introduzca el número de filas de la matriz Primaria");
        int filasPrimaria = entrada.nextInt();
        System.out.println("Introduzca el número de columnas de la matriz Primaria");
        int columnasPrimaria = entrada.nextInt();
        int[][] matrizPrimaria = new int[filasPrimaria][columnasPrimaria];

        System.out.println("Introduzca el número de filas de la matriz Secundaria");
        int filasSecundaria = entrada.nextInt();
        System.out.println("Introduzca el número de columnas de la matriz Secundaria");
        int columnasSecundaria = entrada.nextInt();
        int[][] matrizSecundaria = new int[filasSecundaria][columnasSecundaria];

        // Verificar si la multiplicación es posible
        if (columnasPrimaria == filasSecundaria) {
            // Crear la matriz resultado
            int[][] matrizResultado = new int[filasPrimaria][columnasSecundaria];

            // Solicitar valores para la matriz Primaria
            for (int i = 0; i < matrizPrimaria.length; i++) {
                for (int j = 0; j < matrizPrimaria[i].length; j++) {
                    System.out.printf("Introduzca el valor para la posición [%d][%d] de la matriz Primaria: ", i, j);
                    matrizPrimaria[i][j] = entrada.nextInt();
                }
            }

            // Solicitar valores para la matriz Secundaria
            for (int i = 0; i < matrizSecundaria.length; i++) {
                for (int j = 0; j < matrizSecundaria[i].length; j++) {
                    System.out.printf("Introduzca el valor para la posición [%d][%d] de la matriz Secundaria: ", i, j);
                    matrizSecundaria[i][j] = entrada.nextInt();
                }
            }

            // Realizar la multiplicación de matrices
            for (int i = 0; i < filasPrimaria; i++) {
                for (int j = 0; j < columnasSecundaria; j++) {
                    for (int k = 0; k < columnasPrimaria; k++) {
                        matrizResultado[i][j] += matrizPrimaria[i][k] * matrizSecundaria[k][j];
                    }
                }
            }

            // Mostrar el resultado de la multiplicación
            System.out.println("Resultado del producto matricial:");
            for (int i = 0; i < matrizResultado.length; i++) {
                for (int j = 0; j < matrizResultado[i].length; j++) {
                    System.out.print(matrizResultado[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            // Mensaje de error si la multiplicación no es posible
            System.out.println("Error: La multiplicación no es posible debido a las dimensiones incompatibles.");
            System.out.println("Recuerde: El número de columnas de la matriz Primaria debe ser igual al número de filas de la matriz Secundaria.");
        }
        
        // Cerrar el scanner para liberar recursos
        entrada.close();
    }
}