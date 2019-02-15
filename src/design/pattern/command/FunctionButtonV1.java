package design.pattern.command;

/*这种写法FunctionButton请求发送类和Handler处理类有很高的耦合*/
public class FunctionButtonV1 {

    private Handler help; // HelpHandler：帮助文档处理类，请求接收者
    // 在FunctionButton的onClick()方法中调用HelpHandler的display()方法

    public void onClick() {
        help = new Handler();
        help.display(); // 显示帮助文档
    }

}
