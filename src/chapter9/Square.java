package chapter9;

/**
 * The Square class represents a specialized type of Rectangle
 * where all sides are equal. It overrides the behavior of certain
 * methods from the Rectangle class to suit the properties of a square.
 */
public class Square extends Rectangle {

    /**
     * Calculates the perimeter of the square.
     * Overrides the Rectangle's calculatePerimeter method.
     *
     * @return the calculated perimeter of the square.
     */
    @Override
    public double calculatePerimeter() {
        return sides * length;
    }
}
