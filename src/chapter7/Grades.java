package chapter7;

import java.util.Scanner;

/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */
public class Grades {

    // Array to store the grades entered by the user
    private static int[] grades;

    // Scanner object for user input
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        // Ask the user to specify the number of grades to enter
        System.out.println("How many grades would you like to enter?");

        grades = new int[scanner.nextInt()]; // Initialize the length of grades array

        // Collect grades from the user
        getGrades();

        // Calculate and display the average, highest, and lowest grades
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
    }

    /**
     * Asks the user to enter grades and stores them in the grades array.
     */
    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i + 1));
            grades[i] = scanner.nextInt(); // Read and store each grade
        }
    }

    /**
     * Calculates the sum of all grades in the grades array.
     *
     * @return the total sum of the grades
     */
    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;   // Add each grade to the sum
        }
        return sum;
    }

    /**
     * Calculates the average of the grades in the grades array.
     *
     * @return the average grade as a double
     */
    public static double calculateAverage() {
        return (double) calculateSum() / grades.length; // Calculate and return the average
    }

    /**
     * Finds and returns the highest grade in the grades array.
     *
     * @return the highest grade
     */
    public static int getHighest() {
        int highest = grades[0]; // Initialize with the first grade
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade; // Update if a higher grade is found
            }
        }
        return highest;
    }

    /**
     * Finds and returns the lowest grade in the grades array.
     *
     * @return the lowest grade
     */
    public static int getLowest() {
        int lowest = grades[0]; // Initialize with the first grade
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade; // Update if a lower grade is found
            }
        }
        return lowest;
    }
}