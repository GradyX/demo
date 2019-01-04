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
/*		引入钩子函数对复杂产品的构建进行精细的控制，不仅指定buildPartX()方法的执
		行顺序，还可以控制是否需要执行某个buildPartX()方法。
		if(!builder.isPartC())
		{
		builder. buildPartC();
		}*/
		return builder.getResult();
	}
	
}
