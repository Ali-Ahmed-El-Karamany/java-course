package exercises.chapter6;

public class PhoneBillCalculator {

    public static void main(String[] args) {

        /********************************
                     FIRST BILL
         *********************************/
        PhoneBill bill1 = new PhoneBill(1);
        bill1.setMinutesUsed(800);
        bill1.printItemizedBill();

        /********************************
         FIRST BILL
         *********************************/
        PhoneBill bill2 = new PhoneBill(50,100,1500,1490);
        bill2.printItemizedBill();
    }
}
