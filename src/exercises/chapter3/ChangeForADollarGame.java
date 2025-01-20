package exercises.chapter3;

/*
 * Make a program that calculates the change.
 * the objective of the game is to enter enough change to equal exactly one dollar
 */

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String args[]){

        //Initialize the worth of each coin (penny,nickel,dime,quarter,dollar)
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;

        //ask the user to enter the amount of each coin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter number of pennies");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter number of nickles");
        int numOfNickles = scanner.nextInt();

        System.out.println("Enter number of dimes");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter number of quarters");
        int numOfQuarters = scanner.nextInt();

        //close the scanner object to free the associated resources
        scanner.close();

        //Calculate the total amount of the coins in total
        double total = (numOfPennies * penny) + (numOfNickles * nickel) +
                            (numOfDimes * dime) + (numOfQuarters * quarter);

        if(total < dollar)
        {
            double amountUnder = dollar - total;
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountUnder) + " cents.");
        }

        else if(total > dollar)
        {
            double amountOver = total - dollar;
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }

        else {
            System.out.println("Congratulations! That's exactly $1.00! You win!");
        }
    }
}
