package chapter6;

import java.util.Scanner;

/*
 * This program calculates the total area of two rooms in a house.
 * Asks the user to input the dimensions of each room and
 * then uses the Rectangle class to compute the total area.
 */
public class HomeAreaCalculatorRedo {

    // Scanner object for user input
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Create an instance of HomeAreaCalculatorRedo to allow you to use non-static methods
        HomeAreaCalculatorRedo room = new HomeAreaCalculatorRedo();

        // Get dimensions for the kitchen
        Rectangle kitchen = room.getRoom();

        // Get dimensions for the bathroom
        Rectangle bathroom = room.getRoom();

        // Calculate the total area of the two rooms
        double area = room.calculateTotalArea(kitchen, bathroom);

        // Display the total area
        System.out.println("The total area is: " + area);

        // Close the scanner to prevent resource leaks
        room.scanner.close();
    }

    /*
     * Asks the user to input the dimensions of a room (length and width)
     * and returns a Rectangle object representing the room.
     *
     * @return A Rectangle object with the user-specified dimensions.
     */
    public Rectangle getRoom() {
        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        // Return a new Rectangle object with the specified dimensions
        return new Rectangle(length, width);
    }

    /*
     * Calculates the total area of two rooms by summing their areas.
     *
     * @param rectangle1: The first room as a Rectangle object.
     * @param rectangle2: The second room as a Rectangle object.
     * @return The total area of the two rooms as a double.
     */
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}