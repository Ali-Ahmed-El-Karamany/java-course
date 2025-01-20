package chapter5;

/*
 * Instant Credit Check Program
 *
 * This program determines whether a user qualifies for credit approval based on
 * their salary and credit score. The user is approved if their salary is more
 * than $25,000 and their credit score is 700 or higher. Otherwise, the application
 * rejects them.
 *
 * The program prompts the user to enter their salary and credit score, evaluates
 * their eligibility, and notifies them of the result.
 */

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 2500;                   //Minimum salary required for approval
    static int requiredCreditScore = 700;               //Minimum credit score required for approval
    static Scanner scanner = new Scanner(System.in);    //Scanner object for reading user input

    public static void main(String[] args){

        //Get the user's salary.
        double salary = getSalary();

        //get the user's credit score.
        int creditScore = getCreditScore();

        //Close the scanner to prevent resource leaks
        scanner.close();

        //Check if the user meets the qualification criteria
        boolean qualified = isQualified(creditScore,salary);

        //Notify the user of the result
        notifyUser(qualified);
    }

    /*
     * Asks the user to enter their salary and returns the value.
     *
     * @return The user's salary as a double.
     */
    public static double getSalary()
    {
        System.out.println("Enter your salary: ");

        double salary = scanner.nextDouble();
        return salary;
    }

    /*
     * Asks the user to enter their credit score and returns the value.
     *
     * @return The user's credit score as an integer.
     */
    public static int getCreditScore()
    {
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    /*
     * Evaluates whether the user is qualified for credit based on their salary
     * and credit score.
     *
     * @param creditScore: The user's credit score.
     * @param salary: The user's salary.
     * @return true if the user meets both criteria, false otherwise.
     */
    public static boolean isQualified(int creditScore, double salary)
    {
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }

    /*
     * Notifies the user of the result of their credit check.
     *
     * @param isQualified: true if the user is approved, false if rejected.
     */
    public static void notifyUser(boolean isQualified)
    {
        if(isQualified)
        {
            System.out.println("Congrats! You've been approved.");
        }
        else
        {
            System.out.println("Sorry. You've been declined");
        }
    }
}
