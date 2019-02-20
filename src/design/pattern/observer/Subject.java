package design.pattern.observer;

import java.util.ArrayList;

public abstract class Subject {

    protected ArrayList<Observer> observers;
    
    public void register(Observer observer) {
        observers.add(observer);
    }
    
    public void logout(Observer observer) {
        observers.remove(observer);
    }
    
    public abstract void notifyObserver();
    
}

class ConcreteSubject extends Subject {
    
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
    
}