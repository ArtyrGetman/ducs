package ducs;

import ducs.ducksbehavior.Duck;
import ducs.ducksbehavior.Flyable;
import ducs.ducksbehavior.Quackable;

public class MallarDuck extends Duck implements Flyable, Quackable {
    @Override
   public void display() {
        System.out.println("Display Mallardack");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
