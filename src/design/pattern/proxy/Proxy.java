package design.pattern.proxy;

public class Proxy extends Subject {

	private RealSubject subject;
	
	public void preRequest() {
	    
	}
	
	public void request() {
		subject.request();
	}

	public void postRequest() {
	    
	}
}
