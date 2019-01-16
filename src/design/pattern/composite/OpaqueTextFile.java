package design.pattern.composite;

public class OpaqueTextFile extends OpaqueAbstractFile {

	public OpaqueTextFile(String name) {
		setName(name);
	}

	public void killVirus() {
		//模拟杀毒
		System.out.println("----对文本文件'" + getName() + "'进行杀毒");
	}

}
