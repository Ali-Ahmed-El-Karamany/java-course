package exercises.chapter9;

/*
 * The BirthdayCake class represents a specialized type of Cake
 * designed for birthday celebrations. It adds a field for the
 * number of candles.
 */

public class BirthdayCake extends Cake{

    private int candles;    //  Number of candles

    /**
     * Constructs a BirthdayCake object with a default flavor of "Vanilla".
     */
    public BirthdayCake()
    {
        super("Vanilla");
    }

    /**
     * Gets the number of candles of the cake.
     * @return The number of candles.
     */
    public int getCandles() {
        return candles;
    }

    /**
     * Sets the number of candles of th cake.
     * @param candles The number of candles of the cake.
     */
    public void setCandles(int candles) {
        this.candles = candles;
    }
}
