package chapter9;

/**
 * The Rectangle class represents a rectangle shape with specific attributes 
 * such as length, width, and the number of sides. 
 * It provides methods to calculate the perimeter.
 */
public class Rectangle {

    // Protected fields to store rectangle properties
    protected double length; // The length of the rectangle
    protected double width;  // The width of the rectangle
    protected double sides = 4; // The number of sides of a rectangle, default is 4

    /**
     * Gets the length of the rectangle.
     *
     * @return the length of the rectangle.
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the rectangle.
     *
     * @param length the length to assign to the rectangle.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Gets the width of the rectangle.
     *
     * @return the width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle.
     *
     * @param width the width to assign to the rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets the number of sides of the rectangle.
     *
     * @return the number of sides of the rectangle.
     */
    public double getSides() {
        return sides;
    }

    /**
     * Sets the number of sides of the rectangle.
     *
     * @param sides the number of sides to assign to the rectangle.
     */
    public void setSides(double sides) {
        this.sides = sides;
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return the calculated perimeter of the rectangle.
     */
    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }
}
