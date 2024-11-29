public class NumerosPrimos {
    public static void main(String[] args) {
        final int MAX_NUMBER = 100;

        System.err.println("Los numero primos hasta " + MAX_NUMBER + " son: ");

        for (int numero = 1; numero <= MAX_NUMBER; numero++) {

            int cantidadDivisores=0;

            for (int i = 1; i <= numero; i++) {
                if (numero%i==0) {
                    cantidadDivisores++;
                }
            }
            if (cantidadDivisores==2) {
                System.out.println(numero);
            }
            }
        }
}


