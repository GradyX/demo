package design.pattern.decorate;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void operation() {
	    super.operation();
		System.out.println("decorator B");
	}

}
