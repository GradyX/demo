package design.pattern.factory;

public class DataBaseFactory implements Factory {

	public Logger getLogger() {
		return new DatebaseLogger();
	}

}
