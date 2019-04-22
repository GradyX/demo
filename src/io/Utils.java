package io;

import java.io.File;

public class Utils {
    
    public static final char[] LETTERS_AND_NUMBERS = new char[62];
    
    static {
        int index = 0;
        for(char i = 'a'; i < 'a'+26; i++, index++) {
            LETTERS_AND_NUMBERS[index] = i;
        }
        for(char i = 'A'; i < 'A'+26; i++, index++) {
            LETTERS_AND_NUMBERS[index] = i;
        }
        for(char i = '0'; i < '0'+10; i++, index++) {
            LETTERS_AND_NUMBERS[index] = i;
        }
    }
     
    public static long GBToByte() {
        return 1024 * 1024 * 1024;
    }
    
    public static long getCostmsTime(long start, long end) {
        return (end-start)/1000;
    }
    
    public static long getAccurateCostmsTime(long start, long end) {
        return end-start;
    }
    
    public static void main(String[] args) {
/*   初始化只含大小字母和0-9数字的字符数组打印   
 *   for(int i = 0; i < LETTERS_AND_NUMBERS.length; i++) {
            System.out.println(LETTERS_AND_NUMBERS[i]);
        }*/
      File file = new File("E://toy//toyStr.txt");
      System.out.println(file.length());
    }
}
