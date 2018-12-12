package design.pattern.composite;

public abstract class AbstractFile {
	
	private String name;
	
	public abstract void addFile(AbstractFile file);
	public abstract void removeFile(AbstractFile file);
	public abstract AbstractFile getChild();
	public abstract void killVirus();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
