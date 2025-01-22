package exercises.chapter6;

/*
 * The PhoneBill class represents a phone bill with features such as base cost,
 * allotted minutes, minutes used, overage fee calculation, tax calculation,
 * and total bill calculation.
 */
public class PhoneBill {

    private int id; // Unique identifier for the phone bill
    private double baseCost; // The base cost of the phone bill
    private int allottedMinutes; // The number of minutes included in the plan
    private int minutesUsed; // The number of minutes used in the billing period

    /*
     * Default constructor that initializes the phone bill with default values.
     */
    public PhoneBill()
    {
        id = 0;
        baseCost = 75.3;
        allottedMinutes = 700;
        minutesUsed = 700;
    }

    /*
     * Constructor that initializes the phone bill with the specified id and default values
     * for base cost, allotted minutes, and minutes used.
     *
     * @param id: the unique identifier for the phone bill
     */
    public PhoneBill(int id)
    {
        this.id = id;
        baseCost = 75.3;
        allottedMinutes = 700;
        minutesUsed = 700;
    }

    /*
     * Constructor that initializes the phone bill with the specified values for all fields.
     *
     * @param id: the unique identifier for the phone bill
     * @param baseCost: the base cost of the phone bill
     * @param minutesAllotted: the number of minutes included in the plan
     * @param minutesUsed: the number of minutes used in the billing period
     */
    public PhoneBill(int id, double baseCost, int minutesAllotted, int minutesUsed)
    {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = minutesAllotted;
        this.minutesUsed = minutesUsed;
    }

    /*
     * Sets the unique identifier for the phone bill.
     *
     * @param id: the unique identifier for the phone bill
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /*
     * Retrieves the unique identifier for the phone bill.
     *
     * @return the unique identifier for the phone bill
     */
    public int getId()
    {
        return id;
    }

    /*
     * Sets the base cost for the phone bill.
     *
     * @param baseCost: the base cost of the phone bill
     */
    public void setBaseCost(double baseCost)
    {
        this.baseCost = baseCost;
    }

    /*
     * Retrieves the base cost of the phone bill.
     *
     * @return the base cost of the phone bill
     */
    public double getBaseCost()
    {
        return baseCost;
    }

    /*
     * Sets the allotted minutes for the phone plan.
     *
     * @param allottedMinutes: the number of minutes included in the plan
     */
    public void setAllottedMinutes(int allottedMinutes)
    {
        this.allottedMinutes = allottedMinutes;
    }

    /*
     * Retrieves the allotted minutes for the phone plan.
     *
     * @return the number of minutes included in the plan
     */
    public int getAllottedMinutes()
    {
        return allottedMinutes;
    }

    /*
     * Sets the number of minutes used in the billing period.
     *
     * @param minutesUsed: the number of minutes used in the billing period
     */
    public void setMinutesUsed(int minutesUsed)
    {
        this.minutesUsed = minutesUsed;
    }

    /*
     * Retrieves the number of minutes used in the billing period.
     *
     * @return the number of minutes used in the billing period
     */
    public int getMinutesUsed()
    {
        return minutesUsed;
    }

    /*
     * Calculates the overage fee for the phone bill based on minutes used beyond the allotted minutes.
     *
     * @return the overage fee if the minutes used exceeds the allotted minutes, otherwise 0
     */
    public double calculateOverageFee()
    {
        double overageRate = 0.25; // Overage rate per minute
        if(minutesUsed <= allottedMinutes)
        {
            return 0; // No overage if minutes used are within the allotted limit
        }
        else
        {
            int overageMinutes = minutesUsed - allottedMinutes; // Calculate overage minutes
            return overageMinutes * overageRate; // Return the overage fee
        }
    }

    /*
     * Calculates the tax for the phone bill based on the base cost and any overage fees.
     *
     * @return the calculated tax for the phone bill
     */
    public double calculateTax()
    {
        double taxRate = 0.15; // Tax rate for the phone bill

        // Calculate tax as a percentage of the base cost plus any overage fee
        return (baseCost + calculateOverageFee()) * taxRate;
    }

    /*
     * Calculates the total bill, including the base cost, overage fees, and tax.
     *
     * @return the total bill amount
     */
    public double calculateTotalBill()
    {
        // Total bill is the sum of the base cost, overage fee, and tax
        return baseCost + calculateOverageFee() + calculateTax();
    }

    /*
     * Prints an itemized breakdown of the phone bill, including base cost, overage fee, tax, and total.
     */
    public void printItemizedBill()
    {
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverageFee()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotalBill()));
    }
}
