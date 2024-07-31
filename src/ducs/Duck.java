package ducs;

public abstract class Duck {

    public  void  quack(){
        System.out.println("quack");
    }
    public  void  swim(){
        System.out.println("swim");
    }

    public void  fly(){
        System.out.println(" duck fly");
    }

    abstract void  display();

}
