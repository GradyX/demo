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

/*
 * 饿汉式单例类不能实现延迟加载，不管将来用不用始终占据内存；懒汉式单例类线程安全控制烦琐，而且性能受影响。可见，
 * 无论是饿汉式单例还是懒汉式单例都存在这样那样的问题，有没有一种方法，能够将两种单例的缺点都克服，而将两者的优点合二为一呢？答案是：Yes！
 * 下面我们来学习这种更好的被称之为Initialization Demand Holder (IoDH)的技术
 */

// Initialization on Demand Holder
class SingletonNew {
	private SingletonNew() {
	}

	private static class HolderClass {
		private final static SingletonNew instance = new SingletonNew();
	}

	public static SingletonNew getInstance() {
		return HolderClass.instance;
	}

	public static void main(String args[]) {
		Singleton s1, s2;
		s1 = Singleton.getInstance();
		s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
	}
}