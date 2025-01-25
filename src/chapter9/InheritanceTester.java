package chapter9;

/**
 * The InheritanceTester class designed to test and demonstrate
 * the concepts of inheritance using the Person and Employee classes.
 * It serves as the entry point for running inheritance-related examples.
 */

public class InheritanceTester {

    public static void main(String[] args) {
        //Employee employee1 = new Employee();

        testSquareOverride();

    }

    public static void testSquareOverride(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
}
