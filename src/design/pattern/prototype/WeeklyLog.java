package design.pattern.prototype;

/*浅克隆实现的原型模式
在浅克隆中，如果原型对象的成员变量是值类型，将复制一份给克隆对象；如果原型对象的
成员变量是引用类型，则将引用对象的地址复制一份给克隆对象，也就是说原型对象和克隆
对象的成员变量指向相同的内存地址。*/
public class WeeklyLog implements Cloneable {
	
	private String title;
	private String content;
	private String date;
	
	public WeeklyLog clone() {
		Object obj = null;
		try
		{
		obj = super.clone();
		return (WeeklyLog)obj;
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("不支持复制！");
			return null;
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public void printLog() {
	    System.out.println("标题：" + title + "\t日期：" + date + "\n内容：" + content + "\n");;
	}
	
}
