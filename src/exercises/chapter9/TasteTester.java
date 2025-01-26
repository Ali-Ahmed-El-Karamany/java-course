package exercises.chapter9;

public class TasteTester {

    public static void main(String[] args) {

        Cake cake = new Cake("strawberry");
        cake.setPrice(15.99);
        System.out.println("Cake Flavor: " + cake.getFlavor());
        System.out.println("Cake Price: " + cake.getPrice());
        System.out.println("\t\t************************************************");

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(25);
        birthdayCake.setPrice(36);
        System.out.println("Cake Flavor: " + birthdayCake.getFlavor());
        System.out.println("Number of candles in the cake: : " + birthdayCake.getCandles());
        System.out.println("Cake Price: " + birthdayCake.getPrice());

        System.out.println("\t\t************************************************");

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTiers(3);
        weddingCake.setPrice(150);
        System.out.println("Cake Flavor: " + weddingCake.getFlavor());
        System.out.println("Cake Tiers: " + weddingCake.getTiers());
        System.out.println("Cake price: " + weddingCake.getPrice());


    }
}
