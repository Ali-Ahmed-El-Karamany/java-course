package chapter6;

/**
 * Rectangle Class
 *
 * This class models a rectangle with attributes for its length and width.
 * It provides methods to set and get these attributes, as well as calculate
 * the rectangle's area and perimeter.
 */
public class Rectangle {

    // Fields for storing the dimensions of the rectangle (length and width)
    private double length;
    private double width;

    /**
     * Default Constructor
     * Initializes the rectangle with default values of 0 for length and width.
     */
    public Rectangle() {
        length = 0;
        width = 0;
    }

    /*
     * Parameterized Constructor
     * Initializes the rectangle with specified length and width.
     *
     * @param length: The length of the rectangle.
     * @param width:  The width of the rectangle.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /*
     * Gets the length of the rectangle.
     *
     * @return The length of the rectangle.
     */
    public double getLength() {
        return length;
    }

    /*
     * Gets the width of the rectangle.
     *
     * @return The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /*
     * Sets the length of the rectangle.
     *
     * @param length: The new length of the rectangle.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /*
     * Sets the width of the rectangle.
     *
     * @param width: The new width of the rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /*
     * Calculates the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
    public double calculateArea() {
        return length * width;
    }

    /*
     * Calculates the perimeter of the rectangle.
     *
     * @return The perimeter of the rectangle.
     */
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}


