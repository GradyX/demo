package design.pattern.prototype;

public class Client {
    
    public static void main(String[] args) {
/*        WeeklyLog log = new WeeklyLog();
        log.setTitle("周报");
        log.setDate("2018/12/20");
        log.setContent("快到周末放假了");
        log.printLog();
        WeeklyLog cloneLog = log.clone();
        log.setContent("小边不是小编。");
        cloneLog.printLog();
        System.out.println(log.getContent() == cloneLog.getContent());*/
        WeeklyLog log_previous = new WeeklyLog(); //创建原型对象
        log_previous.setTitle("张无忌");
        log_previous.setDate("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");
        System.out.println("****周报****");
        System.out.println("周次：" + log_previous.getDate());
        System.out.println("姓名：" + log_previous.getTitle());
        System.out.println("内容：" + log_previous.getContent());
        System.out.println("--------------------------------");
        WeeklyLog log_new;
        log_new = log_previous.clone(); //调用克隆方法创建克隆对象
        log_new.setDate("第13周");
        System.out.println("****周报****");
        System.out.println("周次：" + log_new.getDate());
        System.out.println("姓名：" + log_new.getTitle());
        System.out.println("内容：" + log_new.getContent());
        System.out.println(log_previous == log_new);
        System.out.println(log_previous.getDate() == log_new.getDate());
        System.out.println(log_previous.getTitle() == log_new.getTitle());
        System.out.println(log_previous.getContent() == log_new.getContent());
    }

}
