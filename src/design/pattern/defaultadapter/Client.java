package design.pattern.defaultadapter;

public class Client {

    public static void main(String [] args) {
        AdapteeInterface adaptee = new ConcreteDefaultAdapter();
        adaptee.serviceMethod1();
        adaptee.serviceMethod2();
    }
    
}
