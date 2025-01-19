package chapter3;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String arg[]) {

        //Initialize the Required salary and working years variables.
        int requiredSalary = 30000;
        int requiredWorkingYears = 2;

        //Get the person's salary and working years.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = scanner.nextInt();

        System.out.println("Enter the number of working years with your employer");
        double years = scanner.nextDouble();

        scanner.close();

        //check if the person is qualified for the loan

        if(salary >= requiredSalary)
        {
            if(years >= requiredWorkingYears)
            {
                System.out.println("Congrats! You qualify for the loan");
            }
            else {
                System.out.println("Sorry, you must have worked at your current job "  + requiredWorkingYears + " years.");
            }
        }

        else {
            System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan");
        }
    }
}
