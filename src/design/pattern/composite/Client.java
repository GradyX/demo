package design.pattern.composite;

public class Client {

	public static void main(String[] args) {
		AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4	;
		
		folder1 = new Folder("Sunny的资料");
		folder2 = new Folder("图像文件");
		folder3 = new Folder("文本文件");
		folder4 = new Folder("视频文件");
		
		file1 = new ImageFile("小龙女.jpg");
		file2 = new ImageFile("张无忌.gif");
		file3 = new TextFile("九阴真经.txt");
		file4 = new TextFile("葵花宝典.doc");
		file5 = new VideoFile("笑傲江湖.rmvb");
		
		folder2.addFile(file1);
		folder2.addFile(file2);
		folder3.addFile(file3);
		folder3.addFile(file4);
		folder4.addFile(file5);
		folder1.addFile(folder2);
		folder1.addFile(folder3);
		folder1.addFile(folder4);
		
		//从“Sunny的资料”节点开始进行杀毒操作
		folder1.killVirus();
	}

}
