package exercises.chapter9;

/*
 * The Cake class represents a basic cake with a specific flavor and price.
 * This class acts as  superclass for other specialized types of cakes.
 */

public class Cake {

    private String flavor;  //  The flavor of the cake
    private double price;   //  The Price of the cake

    /**
     * Constructs a Cake object with the specified flavor and a default price.
     *
     * @param flavor The flavor of the cake.
     */
    public Cake(String flavor)
    {
        this.flavor = flavor;
        price = 10.5;
    }

    /**
     * Gets the flavor of the cake
     * @return The flavor of the cake
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Sets the specified flavor of the cake.
     * @param flavor The flavor to be set for the cake.
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * Gets the price of the cake.
     * @return The price of the cake.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the cake.
     * @param price The price of the cake.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
