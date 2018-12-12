package toy;

public class StaticClassLoaderTest {

	static {
		System.out.println("outer class " + System.currentTimeMillis());
	}
	
	private static class StaticClass {
		{
			System.out.println("static class " + System.currentTimeMillis());
		}
		
		public StaticClass() {
			System.out.println("static class init " + System.currentTimeMillis());
		}
	}
	
	private class InnerClass {
		{
			System.out.println("inner class " + System.currentTimeMillis());
		}
	}
	
	public static void main(String[] args) {
		new StaticClassLoaderTest();

	}

}
