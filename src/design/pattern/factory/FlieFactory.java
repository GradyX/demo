package design.pattern.factory;

public class FlieFactory implements Factory {

	public Logger getLogger() {
		return new FileLogger();
	}

}
