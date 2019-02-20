package design.pattern.observer;

public interface Observer {

    public void update();
    
}

class ConcreteObserver implements Observer {
    
    public void update() {
        System.out.println("concrete observer update");
    }
    
}
