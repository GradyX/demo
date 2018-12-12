package design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {

	private List<AbstractFile> childFiles = new ArrayList<AbstractFile>();
	
	public Folder(String name) {
		setName(name);
	}
	
	public void addFile(AbstractFile file) {
		childFiles.add(file);
	}

	public void removeFile(AbstractFile file) {
		childFiles.remove(file);
	}

	public AbstractFile getChild() {
		return childFiles.get(0);
	}

	@Override
	public void killVirus() {
		System.out.println("****对文件夹'" + getName() + "'进行杀毒");
		for(Object obj : childFiles) {
			((AbstractFile)obj).killVirus();
		}
	}

}
