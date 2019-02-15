package design.pattern.command;

/*命令模式类结构*/

public abstract class Command {
    public abstract void execute();
}

class Invoker {
    private Command command;

    // 构造注入
    public Invoker(Command command) {
        this.command = command;
    }

    // 设值注入
    public void setCommand(Command command) {
        this.command = command;
    }

    // 业务方法，用于调用命令类的execute()方法
    public void call() {
        command.execute();
    }
}

class ConcreteCommand extends Command {
    private Receiver receiver; // 维持一个对请求接收者对象的引用

    public void execute() {
        receiver.action(); // 调用请求接收者的业务处理方法action()
    }
}

class Receiver {
    public void action() {
        // 具体操作
    }
}