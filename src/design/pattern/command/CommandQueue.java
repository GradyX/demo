package design.pattern.command;

import java.util.ArrayList;

public class CommandQueue {
    // 定义一个ArrayList来存储命令队列
    private ArrayList<AbstractCommand> commands = new ArrayList<AbstractCommand>();

    public void addCommand(AbstractCommand command) {
        commands.add(command);
    }

    public void removeCommand(AbstractCommand command) {
        commands.remove(command);
    }

    // 循环调用每一个命令对象的execute()方法
    public void execute() {
        for (Object command : commands) {
            ((AbstractCommand) command).execute();
        }
    }
}

/*在增加了命令队列类CommandQueue以后，请求发送者类Invoker将针对CommandQueue编程，代码修改如下：*/
class CommandQueueInvoker {
    private CommandQueue commandQueue; // 维持一个CommandQueue对象的引用
    // 构造注入
    
    public CommandQueueInvoker(CommandQueue commandQueue) {
      this. commandQueue = commandQueue;
    }

    // 设值注入
    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    // 调用CommandQueue类的execute()方法
    public void call() {
        commandQueue.execute();
    }
}