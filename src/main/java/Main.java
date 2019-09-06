
import java.text.NumberFormat;
import java.util.Scanner;

//7. Sales Tax
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println("Please enter the amount of the purchase ");

        float amountOfPurchase = keyboard.nextFloat();
        double stateTax = .04;
        double countyTax = .02;
        double totalSalesTax = stateTax + countyTax;
        double totalPurchaseAmount = (amountOfPurchase * totalSalesTax) + amountOfPurchase;
        

        System.out.println("Amount of the Purchase: " + amountOfPurchase + "\n"
                + "State Sales Tax: " + stateTax + "\n" + "County Sales Tax: " + countyTax
                + "\n" + "Total Sales Tax: " + totalSalesTax + "\n" + "Total amount of the sale: " 
                + formatter.format(totalPurchaseAmount));
     
     
    }

}
