package ducs.ducksbehavior;

public abstract class Duck {

    private String duckType;
    private String color;

    public  void  swim(){
        System.out.println("swim");
    }
    protected abstract void  display();

}
