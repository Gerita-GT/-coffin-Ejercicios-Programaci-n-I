public class quiz1 
{
    public static void main(String[] args) 
    {
        final int[] pricesFruits = {15, 10, 5}; //Precio de las papas, bananas, kiwis
        int [] quantitiesFruits = {2, 3, 4}; // Cantidad de papas, bananas, kiwis

        int totalSales = 0;
        for (int i=0; i<quantitiesFruits.length; i++)
        {
            totalSales += pricesFruits[i]*quantitiesFruits[i];
        }

        final int METER = 50;
        if (totalSales > METER) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}