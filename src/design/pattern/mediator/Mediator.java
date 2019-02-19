package design.pattern.mediator;

import java.util.ArrayList;

public abstract class Mediator {

    protected ArrayList<Colleague> colleagues; // 用于存储同事对象
    // 注册方法，用于增加同事对象

    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    // 声明抽象的业务方法
    public abstract void operation();

}

class ConcreteMediator extends Mediator {
    // 实现业务方法，封装同事之间的调用
    public void operation() {
        // 通过中介者调用同事类的方法
    }
}