
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        System.out.println("4. EUR to INR");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double result = 0;

        if (choice == 1) {
            result = amount * 0.012;   
            System.out.println("Converted Amount: $" + result);

        } else if (choice == 2) {
            result = amount * 83.0;    
            System.out.println("Converted Amount:" + result + " Rs ");

        } else if (choice == 3) {
            result = amount * 0.011;   
            System.out.println("Converted Amount: " + result + " Euro ");

        } else if (choice == 4) {
            result = amount * 90.0;    
            System.out.println("Converted Amount: " + result + " Rs ");

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
