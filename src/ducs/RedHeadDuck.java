package ducs;

import ducs.ducksbehavior.Duck;
import ducs.ducksbehavior.flyable.FlyBehavior;
import ducs.ducksbehavior.quackable.QuackBehavior;

public class RedHeadDuck extends Duck implements FlyBehavior, QuackBehavior {
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
