
import java.util.Scanner;

public class CookieCalories {

    public static void main(String[] args) {
        //4 cookies perserving and 1 serving is 300 calories so
        //there are 75 calories per cookie
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the total amount of cookies eaten");
        int amountOfCookiesEaten = keyboard.nextInt();
        int caloriesPerCookie = 75;
        int totalAmountOfCalories = amountOfCookiesEaten * caloriesPerCookie;

        System.out.println("Total cookies eaten: " + amountOfCookiesEaten + "\n"
                + "Total Calories Consumed: " + totalAmountOfCalories);

    }

}
