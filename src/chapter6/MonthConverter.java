package chapter6;

/*
 * The MonthConverter class demonstrates the usage of the Month class to convert
 * between month numbers and their corresponding names.
 */
public class MonthConverter {

    public static void main(String[] args) {

        // Get and print the name of the month for a given month number
        System.out.println(Month.getMonth(2));

        // Get and print the number of the month for a given month name
        System.out.println(Month.getMonth("January"));
    }
}
