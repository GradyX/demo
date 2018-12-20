package design.pattern.prototype;

/*深克隆实现的原型模式*/
public class DeepWeeklyLog implements Cloneable {
	
	private String title;
	private String content;
	private String date;
	
	public DeepWeeklyLog clone() {
		Object obj = null;
		try
		{
		obj = super.clone();
		return (DeepWeeklyLog)obj;
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
