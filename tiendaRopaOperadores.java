

public class tiendaRopaOperadores
{
    public static void main(String[] args) {
      Double tShirt = 25.0;
      Double pants = 30.0;
       
       //Pago en caso de comprar solo una camiseta
       Double pay = (tShirt-(tShirt*0.15))+(pants-(pants*0.15));
       
       //Si se compran 2 camisetas:
       Double pay2 = (tShirt-(tShirt*0.15))+(pants-(pants*0.15)+(tShirt-(tShirt*0.05)));
       
       
      System.out.println("El pago del cliente si compra 1 una sola camiseta es: " + pay);
      System.out.println("El pago del cliente si compra dos camisetas es: " + pay2);
    }
}
