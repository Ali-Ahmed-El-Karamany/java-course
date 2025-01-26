package exercises.chapter10;

public class Apple extends Fruit {

    public Apple()
    {
        setCalories(200);
    }

    public void removeSeeds()
    {
        System.out.println("Seeds have been removed from the apple");
    }

    @Override
    public void makeJuice()
    {
        System.out.println("Apple juice is my favourite");
    }
}
