package design.pattern.prototype;

//浅克隆实现的原型模式
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
	
}
