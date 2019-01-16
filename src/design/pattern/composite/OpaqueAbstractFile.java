package design.pattern.composite;

public abstract class OpaqueAbstractFile {
	
	private String name;
	
	public void addFile(OpaqueAbstractFile file) {
	    System.out.println("对不起，不支持该方法！");
	}
	public void removeFile(OpaqueAbstractFile file) {
	    System.out.println("对不起，不支持该方法！");
	}
	public OpaqueAbstractFile getChild() {
	    System.out.println("对不起，不支持该方法！");
	    return null;
	}
	public abstract void killVirus();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
