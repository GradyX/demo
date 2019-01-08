package design.pattern.defaultadapter;

public abstract class DefaultAdapter implements AdapteeInterface {

    public void serviceMethod1() {
        System.out.println("default adapter service1");
    }
    
    public void serviceMethod2() {
        System.out.println("default adapter service2");
    }
    
    public void serviceMethod3() {
        System.out.println("default adapter service3");
    }
    
}
