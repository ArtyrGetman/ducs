package ducs.ducksbehavior;

import ducs.ducksbehavior.flyable.FlyBehavior;
import ducs.ducksbehavior.quackable.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void flyBehavior() {
        flyBehavior.fly();

    }

    public void swim() {
        System.out.println("swim");
    }

    protected abstract void display();

}
