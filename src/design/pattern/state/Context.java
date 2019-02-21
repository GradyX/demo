package design.pattern.state;

/*环境类又称为上下文类，它是拥有多种状态的对象。相当于水*/

public class Context {

    private State state;
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void request() {
        state.handle(); //调用状态对象的业务方法
    }
    
}
