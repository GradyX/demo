package design.pattern.decorate;

public class Decorator implements Component {
	
	Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}

	public void operation() {
		this.component.operation();
	}
	
	
	
}
