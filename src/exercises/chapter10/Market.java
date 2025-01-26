package exercises.chapter10;

public class Market {

    public static void main(String[] args) {

        Fruit apple1 = new Apple();
        ((Apple) apple1).removeSeeds();

        Apple apple2 = new Apple();
        apple2.removeSeeds();

        Banana banana1 = new Banana();
        banana1.peel();

        Fruit banana2 = new Banana();
        ((Banana) banana2).peel();

        Fruit orange = new Fruit();

        squeeze(apple1);
        squeeze(apple2);
        squeeze(banana1);
        squeeze(banana2);
        squeeze(orange);

    }

    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
}
