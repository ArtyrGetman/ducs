package ducs;

import ducs.ducksbehavior.Duck;
import ducs.ducksbehavior.Flyable;
import ducs.ducksbehavior.Quackable;

public class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("RedHeadDuck");
    }

    @Override
    public void fly() {
        System.out.println("fly");

    }

    @Override
    public void quack() {

    }
}
