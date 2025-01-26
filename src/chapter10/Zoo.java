package chapter10;

public class Zoo {

    public static void main(String[] args) {

        Dog lucky = new Dog();
        lucky.makeSound();
        lucky.fetch();

        System.out.println("\t\t************************************");

        Animal sasha = new Dog();
        sasha.makeSound();

        System.out.println("\t\t************************************");

        Animal kitty = new Cat();
        kitty.makeSound();
        ((Cat) kitty).scratch();
    }
}
