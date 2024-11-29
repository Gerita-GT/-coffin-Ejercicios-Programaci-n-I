public class quiz2 
{
    public static void main(String[] args) 
    {
        final int TAX_THRESHOLD = 50;
        final double [] discounts = {0.15, 0.10}; // Descuentos del 15% y el 10%
        double [] productsPrices = {100, 200}; // Precios de los productos
        
        double totalTax = 0;
        for (int i = 0; i < productsPrices.length; i++)
        {
            totalTax += (productsPrices[i]-(productsPrices[i]*discounts[i]));
        }
    
        if (totalTax > TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}