package design.pattern.composite;

public class OpaqueImageFile extends OpaqueAbstractFile {

	public OpaqueImageFile(String name) {
		setName(name);
	}
	
	public void killVirus() {
		//模拟杀毒
		System.out.println("----对图像文件'" + getName() + "'进行杀毒");
	}

}
