package chapter12;

public class MultipleCatches {

    public static void main(String[] args){

        try
        {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 12 / a;

            int c[] = {1};
            c[42] = 99;
        }

        catch(ArithmeticException e)
        {
            System.out.println("Divde by zero: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index out of bounds: " + e);
        }

        System.out.println("After try/catch blocks");
    }
}
