public class Fibonacci {
    private static final int MAX_NUMBER = 50;

    public static void printFibonacciFor() {
        StringBuilder result = new StringBuilder();
        long firstNumber = 0, secondNumber = 1;
        
        // Primer número
        result.append(firstNumber);
        
        // Si MAX_NUMBER es 1, terminamos aquí
        if (MAX_NUMBER > 1) {
            result.append(",").append(secondNumber);
            
            // Resto de la secuencia
            for (int i = 2; i < MAX_NUMBER; i++) {
                long nextNumber = firstNumber + secondNumber;
                result.append(",").append(nextNumber);
                
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
        }
        
        System.out.println(result);
    }

    public static void printFibonacciWhile() {
        StringBuilder result = new StringBuilder();
        long firstNumber = 0, secondNumber = 1;
        
        // Primer número
        result.append(firstNumber);
        
        // Si MAX_NUMBER es 1, terminamos aquí
        if (MAX_NUMBER > 1) {
            result.append(",").append(secondNumber);
            
            // Resto de la secuencia
            int i = 2;
            while (i < MAX_NUMBER) {
                long nextNumber = firstNumber + secondNumber;
                result.append(",").append(nextNumber);
                
                firstNumber = secondNumber;
                secondNumber = nextNumber;
                i++;
            }
        }
        
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci usando for:");
        printFibonacciFor();
        
        System.out.println("\nFibonacci usando while:");
        printFibonacciWhile();
    }
}