package homeWork5;

import java.util.Locale;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("uk", "UA"));

        System.out.println("-----------------------------------");
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        double tax;



        if (income > 0 && income <= 10000) {
            tax = income * 0.025d;
            System.out.println(tax);
        } else if (income > 10000 && income <= 25000) {
            tax = income * 0.043d;
            System.out.println(tax);
        } else if (income > 25000) {
            tax = income * 0.067d;
            System.out.println(tax);
        } else {
            System.out.println("error");
        }

        scanner.close();
    }
}