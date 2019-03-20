package toy;

import java.util.Arrays;

public class Test {
    
    public static String getMaxNumStr(String str) throws Exception {
        if(str.length() == 0 || str.length() > 255) {
            throw new Exception("参数错误");
        }
        char[] values = str.toCharArray();
        int count = 0;
        char charAt = 'a';
        StringBuffer temp = new StringBuffer();
        for(int i = 0; i < values.length; i++) {
            charAt = values[i];
            if(charAt >= '0' && charAt <= '9') {
                temp.append(charAt);
                count++;
            }
        }
        String maxNumStr = temp.toString();
        if(count > 0) {
/*            String maxNumStr = temp.toString();
            if(maxNumStr.charAt(0) == '0') {
                maxNumStr  maxNumStr.substring(1, count);
            }*/
            return maxNumStr;
        }
        else {
            return "";
        }
    }

    public static void main(String[] args) {
        //System.out.println(getMaxNumStr("abdasjfeighe017840egeh560"));
        int [] i = {1,2,5,87,-97,-1};
        //getSmallNums(i, 3);
    }

    public static void getSmallNums(int [] numbers, int n) throws Exception {
        if(numbers == null || numbers.length < 1 || numbers.length < n || n < 0) {
            throw new Exception();
        }
        Arrays.sort(numbers);
        int [] smallNums = new int[n];
        for(int i = 0; i < n; i++) {
            smallNums[i] = numbers[i];
        }
    }
    
}
