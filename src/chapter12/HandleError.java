package chapter12;

// Importing the Random class to generate random numbers
import java.util.Random;

/**
 * program generates random integers and performs a division operation,
 * handling the ArithmeticException (such as division by zero)
 * to ensure the program continues executing without crashing.
 */
class HandleError {

    public static void main(String[] args) {

        // Variable initialization
        int a = 0, b = 0, c = 0;

        // Creating an instance of Random class for generating random numbers
        Random r = new Random();

        // Loop to perform multiple iterations of random calculations
        for (int i = 0; i < 3; i++) {
            try {
                // Generating two random integers
                b = r.nextInt();
                c = r.nextInt();

                // Attempting division; may cause an ArithmeticException if c is 0
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                // Handling division by zero error
                System.out.println("Exception: "+ e);

                // Setting 'a' to zero to allow program execution to continue
                a = 0;
            }

            // Printing the result of 'a' after each iteration
            System.out.println("a: " + a);
        }
    }
}
