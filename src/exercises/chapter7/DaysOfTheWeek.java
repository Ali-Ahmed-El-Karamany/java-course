package exercises.chapter7;

/*
 * The DayOfTheWeek program asks the user to enter a number representing a day of the week,
 * then outputs the corresponding day name. The program assumes the user enters a number between 1 and 7.
 * Monday is the first day of the week.
 */

import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args) {
        // Array containing the days of the week, indexed from 0 to 6
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Create a Scanner object for reading user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number representing the day of the week (1 to 7)
        System.out.println("Enter a number for the day of the week");

        // Read the user's input (assumed to be between 1 and 7)
        int index = input.nextInt();

        // Close the scanner to prevent resource leak
        input.close();

        // Output the corresponding day name by using the user's input as an index
        // The index is adjusted by subtracting 1 (since array indices are 0-based)
        System.out.println("Corresponding day: " + week[index - 1]);
    }
}