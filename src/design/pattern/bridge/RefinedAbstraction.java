package design.pattern.bridge;

public class RefinedAbstraction extends Abstraction {

	void operation() {
		implementor.operationImpl();
	}

}
