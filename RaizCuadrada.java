import java.util.Scanner;

public class RaizCuadrada {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingresa un numero");
      // Muestra un mensaje en la consola solicitando al usuario ingresar un número.
      
      double number1 = scanner.nextDouble();
      // Lee un número de tipo 'double' ingresado por el usuario.
      
      try {
          // Inicia un bloque 'try' para manejar posibles excepciones.
      
          if (number1 < 0.0) {
              // Verifica si el número ingresado es negativo.
      
              throw new IllegalArgumentException("Un numero negativo no tiene raiz cuadrada");
              // Lanza una excepción de tipo 'IllegalArgumentException' con un mensaje personalizado si el número es negativo.
          }
      
          double raiz = Math.sqrt(number1);
          // Calcula la raíz cuadrada del número usando el método 'Math.sqrt'.
      
          System.out.println("La raíz cuadrada de " + number1 + " es: " + raiz);
          // Imprime el resultado de la raíz cuadrada en la consola.
          
      } catch (IllegalArgumentException e) {
          // Captura la excepción lanzada si el número es negativo.
      
          System.out.println(e.getMessage());
          // Imprime el mensaje de error asociado a la excepción.
      }
   
      scanner.close();
      // Cierra el objeto 'Scanner' para liberar los recursos.
      
   }   
}
