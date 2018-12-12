package design.pattern.builder;

public class Director {
	
	private Builder builder;
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	//产品构建与组装方法
	public Product construct() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.getResult();
	}
	
}
