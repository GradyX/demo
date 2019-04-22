package io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class FileMaker {
    
    public static void main(String []args) {
        FileMaker maker = new FileMaker();
        long start, end;
        maker.setFileSize(1);
        maker.setStoragePath("E://toy");
        maker.setCodedCharacterSet("UTF8");
        for(int i = 0; i < 10; i++) {
            start = System.currentTimeMillis();
            maker.makeFile("toyStr" + i + ".txt");
            end = System.currentTimeMillis();
            System.out.println("cost time : " + Utils.getAccurateCostmsTime(start, end));
        }
       
    }
    
    public void makeFile(String fileName) {
        File file = new File(storagePath+"/"+fileName);
        if(!file.exists()) {
            try {
                file.createNewFile();               
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("文件创建失败");
            } 
        }
        try {
            inputContext(file);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("文件创建失败");
        }
    
    }
    
    public void inputContext(File file) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        FileOutputStream out = new FileOutputStream(file);
        BufferedOutputStream bout = new BufferedOutputStream(out);
        OutputStreamWriter wout = new OutputStreamWriter(bout, this.codedCharacterSet);
        long lineCount = this.fileSize / 1024;
        StringBuffer strBuffer = new StringBuffer();
        Random random = new Random();
        for(long i = 0; i < lineCount; i++) {
            for(int j = 0; j < 1024; j++) {
                strBuffer.append(Utils.LETTERS_AND_NUMBERS[random.nextInt(62)]);
            }
            strBuffer.append("\r\n");
            wout.write(strBuffer.toString());
            strBuffer.delete(0, strBuffer.length());
        }
        wout.flush();
        wout.close();
    }
    
    
    private long fileSize;
    
    private String codedCharacterSet;

    private String storagePath;
    
    private File createFile;

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize * Utils.GBToByte();
    }

    public String getCodedCharacterSet() {
        return codedCharacterSet;
    }

    public void setCodedCharacterSet(String codedCharacterSet) {
        this.codedCharacterSet = codedCharacterSet;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }
    
    public File getCreateFile() {
        return createFile;
    }
}
