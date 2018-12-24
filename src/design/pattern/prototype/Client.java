package design.pattern.prototype;

public class Client {
    
    public static void main(String[] args) {
        WeeklyLog log = new WeeklyLog();
        log.setTitle("周报");
        log.setDate("2018/12/20");
        log.setContent("快到周末放假了");
        log.printLog();
        WeeklyLog cloneLog = log.clone();
        log.setContent("小边不是小编。");
        cloneLog.printLog();
        System.out.println(log.getContent() == cloneLog.getContent());
    }

}
