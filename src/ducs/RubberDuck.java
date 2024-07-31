package ducs;

import ducs.ducksbehavior.Duck;
import ducs.ducksbehavior.flyable.FlyNoWay;
import ducs.ducksbehavior.flyable.FlyWithWings;
import ducs.ducksbehavior.quackable.Quack;
import ducs.ducksbehavior.quackable.QuackBehavior;
import ducs.ducksbehavior.quackable.Squeak;

public class RubberDuck extends Duck implements QuackBehavior {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    @Override
   public void display() {
        System.out.println("rubber duck");
    }

    @Override
    public void quack() {

    }
}
