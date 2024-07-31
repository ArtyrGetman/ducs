package ducs;

import ducs.ducksbehavior.Duck;
import ducs.ducksbehavior.Quackable;

public class RubberDuck extends Duck implements Quackable {
    @Override
   public void display() {
        System.out.println("rubber duck");
    }

    @Override
    public void quack() {

    }
}
