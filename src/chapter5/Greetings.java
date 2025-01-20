package chapter5;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args){

        //Get the name of the user
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        //Calling the function to greet the user and pass the name of the user as a parameter.
        greetUser(name);
    }

    /*
     * Greets the user
     *
     * @param name: The name of the user to be greeted.
     */
    public static void greetUser(String name)
    {
        System.out.println("Hi there, " + name);
    }
}
