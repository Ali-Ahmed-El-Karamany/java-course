package chapter7;

import java.util.Arrays;
import java.util.Random;

/*
 * The LotteryTicket class generates a lottery ticket with a specified number of random numbers,
 * and prints it. The ticket generation ensures that numbers are within a defined range.
 */
public class LotteryTicket {

    // Constant for the number of numbers in a lottery ticket
    private static final int LENGTH = 6;

    // Maximum value for a ticket number (inclusive)
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){

        // Generate the lottery ticket numbers
        int[] ticket = generateNumbers();

        // Print the ticket
        printTicket(ticket);
    }

    /*
     * Generates an array of random lottery ticket numbers.
     * Each number is within the range [1, MAX_TICKET_NUMBER].
     *
     * @return an array containing the randomly generated ticket numbers
     */
    public static int[] generateNumbers(){

        // Array to store the lottery ticket numbers
        int[] ticket = new int[LENGTH];

        // Create an instance of the Random class for generating random numbers
        Random random = new Random();

        // Generate random numbers for each element in the ticket array
        for(int i = 0; i < LENGTH; i++){
            // Generate a random number between 1 and MAX_TICKET_NUMBER
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }

        return ticket; // Return the generated ticket
    }

    /*
     * Prints the lottery ticket numbers in a formatted style.
     * Numbers are separated by a " | " delimiter.
     *
     * @param ticket: the array of numbers representing the lottery ticket
     */
    public static void printTicket(int[] ticket){
        for(int i = 0; i < LENGTH; i++){
            // Print each number with a " | " delimiter
            System.out.print(ticket[i] + " | ");
        }
    }
}
