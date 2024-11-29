import java.util.Scanner;

public class DivisionSegura {
   public DivisionSegura() {
      // Constructor vacío
   }

   public static void main(String[] args) {
      // Crear un objeto Scanner para leer la entrada del usuario
      Scanner entradaUsuario = new Scanner(System.in);

      // Solicitar y leer el dividendo
      System.out.println("Ingrese el dividendo");
      double dividendo = entradaUsuario.nextDouble();

      // Solicitar y leer el divisor
      System.out.println("Ingrese el divisor");
      double divisor = entradaUsuario.nextDouble();

      try {
         // Verificar si el divisor es cero
         if (divisor == 0.0) {
            // Lanzar una excepción si el divisor es cero
            throw new ArithmeticException("Una división por cero es indeterminada");
         }

         // Realizar la división
         double resultado = dividendo / divisor;
         
         // Mostrar el resultado
         System.out.println("El resultado es " + resultado);
      } catch (ArithmeticException excepcion) {
         // Capturar y manejar la excepción de división por cero
         System.out.println(excepcion.getMessage());
      }

      // Cerrar el Scanner para liberar recursos
      entradaUsuario.close();
   }
}