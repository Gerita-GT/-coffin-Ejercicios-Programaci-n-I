public class CuentaBancaria {   
    public static void main(String[] args) {
       
      Double money = 1000.0;
      Double descuentoSemana = 200.0;
      
      Double total = money - (descuentoSemana*4);
      
      System.out.println("Valor final del mes: " + total);
    }
}

