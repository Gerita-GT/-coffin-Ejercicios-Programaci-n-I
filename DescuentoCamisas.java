import java.util.Scanner;

public class DescuentoCamisas 
{
    /* Una tienda de ropa está ofreciendo una promoción en la que se aplica un
    descuento del 15% sobre el precio original de cada prenda. Si una camiseta
    cuesta $25 y un pantalón cuesta $30, ¿Cuál será el precio total de ambas
    prendas después de aplicar el descuento? Además, si se compra una segunda
    camiseta, se aplica un descuento adicional del 5% sobre el precio ya
    descuento de la primera camiseta */

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        final double discount15 = 0.15;
        final double discount5 = 0.5;

        System.out.println("Ingrese el valor de la camisa");
        String priceShirt = scanner.nextDouble();
        System.out.println("Ingrese el valor del pantalon");
        String pricePants = scanner.nextDouble();

        double shirtDiscount = priceShirt*discount15;
        double pantsDiscount = pricePants*discount15;

        double totalDiscountShirt = priceShirt-shirtDiscount;
        double totalDiscountPants = pricePants-pantsDiscount;

        double totalPrice = 
        double totalPay = 


    }
}
