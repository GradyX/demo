package design.pattern.bridge;

public abstract class Abstraction {

	protected Implementor implementor;
	
	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	abstract void operation();
}
