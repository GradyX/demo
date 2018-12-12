package design.pattern.builder;

public class Client {

	public static void main(String[] args) {
/*		Builder builder = new ConcreateBuilder();
		Director director = new Director();
		director.setBuilder(builder);
		Product product = director.construct();*/
		//没有指挥类会怎么样？
		Builder builder = new ConcreateBuilder();
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		Product product = builder.getResult();
	}

}
