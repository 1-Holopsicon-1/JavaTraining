package upcast_downcast;

public class Child extends Parent {
    public int id;

    // Overriding the parent method
    // to print the signature of the
    // child class
    @Override
    public void method() {
        System.out.println("Method from Child");
    }
}
