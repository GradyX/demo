package design.pattern.composite;

public class OpaqueVideoFile extends OpaqueAbstractFile {

	public OpaqueVideoFile(String name) {
		setName(name);
	}
	
	public void killVirus() {
		//模拟杀毒
		System.out.println("----对视频文件'" + getName() + "'进行杀毒");
	}

}
