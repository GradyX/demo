package design.pattern.composite;

public class TextFile extends AbstractFile {

	public TextFile(String name) {
		setName(name);
	}
	
	public void addFile(AbstractFile file) {
		System.out.println("对不起，不支持该方法！");
	}

	public void removeFile(AbstractFile file) {
		System.out.println("对不起，不支持该方法！");
	}

	public AbstractFile getChild() {
		System.out.println("对不起，不支持该方法！");
		return null;
	}

	public void killVirus() {
		//模拟杀毒
		System.out.println("----对文本文件'" + getName() + "'进行杀毒");
	}

}
