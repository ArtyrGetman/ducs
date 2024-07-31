package ducs.ducksbehavior.quackable;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("QUACK");
    }
}
