package chapter3;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

import java.util.Scanner;

public class GradeMessage {
    public static void main(String arg[]) {

        //Get the user's letter grade
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your letter grade.");
        String grade = scanner.next();
        scanner.close();

        //Intialize message variable to store the output message
        String message;

        //update the message variable according to the letter grade
        switch(grade){
            case("A"):
                message = "Excellent job!";
                break;
            case("B"):
                message = "Great job!";
                break;
            case("C"):
                message = "Good job!";
                break;
            case("D"):
                message = "You have to work a bit harder";
                break;
            case("F"):
                message = "Oh you failed";
                break;
            default:
                message = "Error!...invalid Grade";
                break;
        }
        System.out.println(message);

    }
}
