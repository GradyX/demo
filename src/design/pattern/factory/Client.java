package design.pattern.factory;

public class Client {

	public static void main(String []args) {
		Factory loggerFactory = null;
		loggerFactory = new FlieFactory();//此处使用配置文件加反射机制创建对象可以满足闭合原则
		Logger logger = loggerFactory.getLogger();
		logger.writeLog();
	}
	
}
