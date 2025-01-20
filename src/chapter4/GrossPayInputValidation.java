package chapter4;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args){

        //Initialize the rate, and maximum hours variables
        int rate = 15;
        int maxHours = 40;


        //Get the number of hours that the employee worked during the week
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate the input that it lies between 1 to 40 hours
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            //update the sentinel
            hoursWorked = scanner.nextDouble();
        }

        //close the scanner object to free the associated resources
        scanner.close();

        //Calculate the gross pay for the employee
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: " + gross + "$");



    }
}