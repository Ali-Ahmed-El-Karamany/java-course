package exercises.chapter5;

/*
 * Phone Bill Calculator Program
 *
 * This program calculates the total cost of a user's cell phone bill based on their plan fee
 * and overage minutes. The user is charged $0.25 per overage minute, and a 15% tax is applied
 * to the subtotal. The program prints an itemized bill detailing the plan fee, overage fees,
 * tax, and the total amount due.
 */

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String[] args){

        //Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the base cost of their plan
        System.out.println("Enter your plan fee:");
        double planFee = scanner.nextDouble();

        // Ask the user to enter the number of overage minutes
        System.out.println("Enter the number of your overage minutes:");
        double overageMinutes = scanner.nextDouble();

        // close the scanner to prevent resource leaks
        scanner.close();

        // Calculate the overage fees
        double overageFee = calculateOverageFee(overageMinutes);

        // Calculate the tax
        double tax = calculateTax(planFee, overageFee);

        // Calculate and print the total bill
        calculateAndPrintBill(planFee, overageFee, tax);
    }

    /*
     * Calculates the overage fees based on the number of extra minutes used.
     *
     * @param extraMinutes: The number of overage minutes.
     * @return The overage fee calculated at a rate of $0.25 per minute.
     */
    public static double calculateOverageFee(double extraMinutes)
    {
        double rate = 0.25; // Rate per overage minute
        double overageFee = extraMinutes * rate;
        return overageFee;
    }

    /*
     * Calculates the tax on the subtotal of the plan fee and overage fees.
     *
     * @param planFee: The base cost of the plan.
     * @param overageFee: The calculated overage fees.
     * @return The tax, calculated at a rate of 15% on the subtotal.
     */
    public static double calculateTax(double planFee, double overageFee)
    {
        double rate = 0.15; // Tax Rate
        double subtotal = planFee + overageFee;
        double tax = subtotal * rate;
        return tax;
    }

    /*
     * Calculates the total bill and prints an itemized statement.
     *
     * @param planFee: The base cost of the plan.
     * @param overageFee: The calculated overage fees.
     * @param tax: The calculated tax on the subtotal.
     */
    public static void calculateAndPrintBill(double planFee, double overageFee, double tax)
    {
        double totalBill = planFee + overageFee + tax;

        // Print the itemized bill
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", planFee));
        System.out.println("Overage: $" + String.format("%.2f", overageFee));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", totalBill));
    }
}
