package chapter6;

/*
 * The Month class provides utility methods to map month numbers to their corresponding names
 * and vice versa. Uses enhanced switch statement for simplicity and readability.
 */
public class Month {

    /*
     * Returns the name of the month corresponding to the given number.
     *
     * @param month: the month number (1 for January, 2 for February, ..., 12 for December).
     * @return the name of the month if the number is valid; otherwise, an error message.
     */
    public static String getMonth(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month. Please enter a value between 1 and 12.";
        };
    }

    /*
     * Returns the month number corresponding to the given name.
     *
     * @param month: the name of the month (e.g., "January", "February", ..., "December").
     * @return the number of the month if the name is valid; otherwise, -1.
     */
    public static int getMonth(String month) {
        return switch (month) {
            case "January" -> 1;
            case "February" -> 2;
            case "March" -> 3;
            case "April" -> 4;
            case "May" -> 5;
            case "June" -> 6;
            case "July" -> 7;
            case "August" -> 8;
            case "September" -> 9;
            case "October" -> 10;
            case "November" -> 11;
            case "December" -> 12;
            default -> -1;
        };
    }
}
