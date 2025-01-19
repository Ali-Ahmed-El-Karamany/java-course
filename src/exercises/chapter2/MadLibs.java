package exercises.chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);

        //1- Get the season of the year
        System.out.println("Enter a season of the year");
        String season = scanner.next();

        //2- Get the whole number
        System.out.println("Enter a whole number");
        int num = scanner.nextInt();

        //3- Get the adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        //4- print the whole sentence
        System.out.println("On a " + adjective + " " +
                season + " day, " +
                "I drink a minimum of " + num + " " + "cups of coffee");


    }
}
