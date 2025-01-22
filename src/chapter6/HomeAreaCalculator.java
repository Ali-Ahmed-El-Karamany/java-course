package chapter6;

/*
 * Home Area Calculator Program
 *
 * This program calculates the total area of two rooms in a house.
 * It uses the Rectangle class to create instances representing two rooms,
 * calculates their individual areas, and then sums them up to find the total area.
 */

public class HomeAreaCalculator {

    public static void main(String[] args) {

        /*******************
         * RECTANGLE 1
         ********************/

        // Create an instance of the Rectangle class for the first room
        Rectangle room1 = new Rectangle();

        // Set the length and width of the first room
        room1.setLength(25);
        room1.setWidth(50);

        // Calculate and store the area of the first room
        double room1Area = room1.calculateArea();

        // Print the area of the first room
        System.out.println("Area of room1 is: " + room1Area);

        /*******************
         * RECTANGLE 2
         ********************/

        // Create an instance of the Rectangle class for the second room using the parameterized constructor
        Rectangle room2 = new Rectangle(50, 75);

        // Calculate and store the area of the second room
        double room2Area = room2.calculateArea();

        // Print the area of the second room
        System.out.println("Area of room2 is: " + room2Area);

        // Calculate the total area of the two rooms
        double totalArea = room1Area + room2Area;

        // Print the total area
        System.out.println("The total area of two rooms is: " + totalArea);
    }
}
