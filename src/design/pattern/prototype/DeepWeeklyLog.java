package design.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*深克隆实现的原型模式 通过序列化来实现对象的深克隆*/
public class DeepWeeklyLog implements Cloneable, Serializable {
	
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
	
	public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
	  //将对象写入流中
	  ByteArrayOutputStream bao=new ByteArrayOutputStream();
	  ObjectOutputStream oos=new ObjectOutputStream(bao);
	  oos.writeObject(this);
	  //将对象从流中取出
	  ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
	  ObjectInputStream ois=new ObjectInputStream(bis);
	  return (WeeklyLog)ois.readObject();
	  }
	
}
