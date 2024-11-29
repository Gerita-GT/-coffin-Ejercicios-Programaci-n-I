public class ReasignarValor{
        public static void main(String[] args) {
            int a = 4;
            int b = 2;
            System.out.println("El valor antes de llamar al método, a= " + a + " y de b= " + b );
            cambiarValor(a, b);
    
            System.out.println("El valor después de llamar al metodo, a= " + a + " y de b= " + b );
        }
    
        public static void cambiarValor (int a, int b){
            int c = a; //variable temporal para no perder el valor de a
            a = b;
            b = c;
    
            System.out.println("El valor dentro del metodo de a= " + a + " y de b= " + b );

        }
    } 
