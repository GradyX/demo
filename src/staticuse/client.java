package staticuse;

/*//哈哈哈
*/
public class client {

	public static void main(String [] args) {
		Father a = new Sub();
		a.sm();
		Father b = new Father();
		client c = new client();
		c.print(b);
		c.print(a);
	}
	
	public void print(Father f) {
	    f.print();
	}
	
	public void print(Sub s) {
	    System.out.println("aha");
	    s.print();
	}
	
}
