package design.pattern.facade;

public class Facade {
	
	private SubSystemA subSystemA;
	private SubSystemB subSystemB;
	private SubSystemC subSystemC;
	
	public void method() {
		subSystemA.methodA();
		subSystemB.methodB();
		subSystemC.methodC();
	}

}
