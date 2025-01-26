package exercises.chapter9;

/*
 * The WeddingCake class represents a specialized type of Cake
 * designed for weddings. It adds a field for the number of tiers.
 */

public class WeddingCake extends Cake {

    private int tiers;  //  Number of tiers of the cake.

    /*
     * Constructs weddingCake object with a default flavor "Chocolate".
     */
    public WeddingCake()
    {
        super("Chocolate");
    }

    /**
     * Gets the number of tiers of the cake.
     * @return The number of tiers.
     */
    public int getTiers() {
        return tiers;
    }

    /**
     * Sets the number of tiers of the cake.
     * @param tiers The number of tiers of the cake.
     */
    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
