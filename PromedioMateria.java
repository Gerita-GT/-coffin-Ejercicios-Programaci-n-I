/*  Programa q calcula el promedio de las materias para la UFPS-O. También notifica cuanto necesitas para pasar la materia 
    según las tres primeras notas */

    import java.util.Scanner;

    public class PromedioMateria {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);  // Se crea el objeto Scanner para leer la entrada del usuario.
    
            final double PERCENTAGE = 0.25;  // Asumiendo que cada calificación tiene el mismo peso del 25%.
    
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular el promedio de su materia.");
            System.out.println("2. Calcular cuánto necesita sacar en el examen final para pasar.");
            System.out.print("Ingrese su opción: ");
            int opcion = scn.nextInt();  // Lee la opción seleccionada por el usuario.
    
            // Variables para almacenar las calificaciones.
            double firstNote, secondNote, thirdNote, fourthNote;
    
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la primera calificación de su materia:");
                    firstNote = scn.nextDouble();  // Lee la primera calificación.
                    
                    System.out.println("Ingrese la segunda calificación de su materia:");
                    secondNote = scn.nextDouble();  // Lee la segunda calificación.
                    
                    System.out.println("Ingrese la tercera calificación de su materia:");
                    thirdNote = scn.nextDouble();  // Lee la tercera calificación.
                    
                    System.out.println("Ingrese la cuarta calificación de su materia:");
                    fourthNote = scn.nextDouble();  // Lee la cuarta calificación.
    
                    // Calcula el promedio ponderado.
                    double promedio = (firstNote + secondNote + thirdNote + fourthNote) / 4;
    
                    // Verifica si el estudiante pasa la materia.
                    if (promedio >= 3.0) {
                        System.out.println("¡Felicidades! Ha pasado la materia. Su promedio es: " + promedio);
                    } else {
                        System.out.println("Lamentablemente, no ha pasado la materia. Su promedio es: " + promedio);
                    }
                    break;
    
                case 2:
                    System.out.println("Ingrese la primera calificación:");
                    firstNote = scn.nextDouble();
                    
                    System.out.println("Ingrese la segunda calificación:");
                    secondNote = scn.nextDouble();
                    
                    System.out.println("Ingrese la tercera calificación:");
                    thirdNote = scn.nextDouble();
                    
                    System.out.println("Ingrese la nota mínima que necesita para pasar (Ej. 3.0):");
                    double notaMinima = scn.nextDouble();
    
                    // Calcula la nota necesaria en el examen final.
                    double notaNecesaria = (notaMinima * 4) - (firstNote + secondNote + thirdNote);
                    if (notaNecesaria <= 5.0) {
                        System.out.println("Necesita obtener " + notaNecesaria + " en el examen final para pasar.");
                    } else {
                        System.out.println("Es imposible pasar la materia, ya que necesita más de 5.0 en el examen final.");
                    }
                    break;
    
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
    
            scn.close();  // Cierra el objeto Scanner para liberar los recursos.
        }
    }
    