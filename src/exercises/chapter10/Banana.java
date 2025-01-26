package exercises.chapter10;

public class Banana extends Fruit{

    public Banana()
    {
        setCalories(500);
    }

    public void peel()
    {
        System.out.println("Banana has been peeled");
    }


    @Override
    public void makeJuice()
    {
        System.out.println("Banana juice is gross");
    }
}
