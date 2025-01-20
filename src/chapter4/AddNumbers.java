package chapter4;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            //Get two numbers from the user
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            //Add the sum of the numbers
            double sum = num1 + num2;

            //print the summation of the numbers
            System.out.println("The sum is " + sum);

            /*
             *Ask the user whether to continue or to exit.
             * true --> continue
             * false --> exit
             */
            System.out.println("Would you like to start over? True or False");

            //update the sentinel
            again = scanner.nextBoolean();

        } while(again);

        //close the scanner object to free the associated resources
        scanner.close();
    }
}