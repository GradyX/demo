package design.pattern.singleton;

public class Singleton {

	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
    public static void main(String[] args) {
        SingletonNew s1, s2;
        s1 = SingletonNew.getInstance();
        s2 = SingletonNew.getInstance();
        System.out.println(s1 == s2);
    }
}

// 恶汉式
class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}

// 懒汉式 双重检查锁定(Double-CheckLocking)。
class LazySingleton {
	private volatile static LazySingleton instance = null;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		// 第一重判断
		if (instance == null) {
			// 锁定代码块
			synchronized (LazySingleton.class) {
				// 第二重判断
				if (instance == null) {
					instance = new LazySingleton(); // 创建单例实例
				}
			}
		}
		return instance;
	}
}

/*需要注意的是，如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之
前增加修饰符volatile，被volatile修饰的成员变量可以确保多个线程都能够正确处理，且该代
码只能在JDK 1.5及以上版本中才能正确执行。由于volatile关键字会屏蔽Java虚拟机所做的一
些代码优化，可能会导致系统运行效率降低，因此即使使用双重检查锁定来实现单例模式也
不是一种完美的实现方式*/

/*
 * 饿汉式单例类不能实现延迟加载，不管将来用不用始终占据内存；懒汉式单例类线程安全控制烦琐，而且性能受影响。可见，
 * 无论是饿汉式单例还是懒汉式单例都存在这样那样的问题，有没有一种方法，能够将两种单例的缺点都克服，而将两者的优点合二为一呢？答案是：Yes！
 * 下面我们来学习这种更好的被称之为Initialization Demand Holder (IoDH)的技术
 * 用IoDH，我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能
 */

// Initialization on Demand Holder
class SingletonNew {
    
    static {
        System.out.println("loader SingletonNew");
    }
    
	private SingletonNew() {
	    System.out.println("Init SingletonNew");
	}

	private static class HolderClass {
	    
	    static {
	        System.out.println("loader HolderClass");    
	    }
	    
		private final static SingletonNew instance = new SingletonNew();
	}
	
	public static SingletonNew getInstance() {
	    System.out.println("Invoke SingletonNew");
		return HolderClass.instance;
	}

}