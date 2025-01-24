package chapter7;

import java.util.Arrays;
import java.util.Random;

/*
 * The LotteryTicket class generates a lottery ticket with a specified number of random numbers,
 * ensures the numbers are unique, and prints the ticket. The ticket generation ensures that
 * numbers are within a defined range.
 */
public class LotteryTicket {

    // Constant number to initialize the length of lottery ticket array
    private static final int LENGTH = 6;

    // Maximum value for a ticket number
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){

        // Generate the lottery ticket numbers
        int[] ticket = generateNumbers();

        // Print the ticket
        printTicket(ticket);
    }

    /**
     * Generates an array of random lottery ticket numbers, ensuring no duplicates.
     * Each number is within the range [1, MAX_TICKET_NUMBER].
     *
     * @return an array containing the unique randomly generated ticket numbers
     */
    public static int[] generateNumbers(){

        // Array to store the lottery ticket numbers
        int[] ticket = new int[LENGTH];

        // Create an instance of the Random class for generating random numbers
        Random random = new Random();


        // Generate unique random numbers for each element in the ticket array
        for(int i = 0; i < LENGTH; i++){

            int randomNumber;
            // Search the array to make sure that the number generated will be unique
            do{
                // Generate a random number within the valid range
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(linearSearch(ticket, randomNumber)); // Ensure no duplicates

            ticket[i] = randomNumber;
        }

        return ticket; // Return the generated ticket of unique numbers
    }

    /**
     *Performs a linear search to check if a number exists in the array
     *
     * @param array Array to search in
     * @param numberToSearchFor Value to search for in the array
     * @return true if the number exists, false otherwise
     */
    public static boolean linearSearch(int[] array, int numberToSearchFor)
    {
        /* Enhanced for loop:
         * Iterates through the array and
         * each time assigns the current element of the array to value
         */
        for(int value : array)
        {
            if(value == numberToSearchFor)
            {
                return true;    // Number found
            }
        }
        return false;   // Number not found
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
