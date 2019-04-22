package toy;

public class MyString {
    
    private char[] chars;
    
    public MyString() {
        this(Const.DEFAULT_SIZE);
    }
    
    public MyString(int stringMaxLength) {
        chars = new char[stringMaxLength + 1];
    }
    
    public static int subIndex(String str, String subStr) {
        int index = 0;
        for(int i = 0; i < str.length()-subStr.length(); i++) {
            for(int j = 0; j < subStr.length(); j++) {
                if(str.charAt(i+j) != subStr.charAt(j)) 
                    break;
                else if(j == subStr.length() - 1) {
                    index = i;
                }
            }
        }
        return index;
    }
    
    public static int subIndexKMP(String str, String subStr) {
        int index = 0;
        return index;
    }
    
    public static void main(String[] args) {
        String str = "ababcabcabab";
        String subStr = "abcac";        
        System.out.println(subIndex(str, subStr));
    }
    
    
}

final class Const {
    public static int DEFAULT_SIZE = 255;
}