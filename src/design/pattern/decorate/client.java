package design.pattern.decorate;

public class client {

    public static void main(String[] args) {
        Component a = new ConcreteComponent();
        Decorator b = new ConcreteDecoratorA(a);
        Decorator c = new ConcreteDecoratorB(b);
        c.operation();
    }

}
