package toy;

public class ArrayDemo {

    public static void main(String[] args) {
/*        获得一个数组需要2步。第一步，你必须定义变量所需的
        类型。第二步，你必须使用运算符new来为数组所要存储的数据分配内存，并把它们分配
        给数组变量*/
        int [] intArray = new int[10];
        for(int i : intArray) {
            System.out.println(i);
        }
        
        Integer [] integerArray = new Integer[10];
        for(Integer i : integerArray) {
            System.out.println(i);
        }
        
        /*        数组可以在声明时被初始化。这个过程和简单类型初始化的过程一样。数组的初始化
        （array initializer）就是包括在花括号之内用逗号分开的表达式的列表*/
        int [] intArray2 = {0, 0};
        Integer [] integerArray2 = {new Integer(0), new Integer(0)};
        /*多维数组分配内存时，你只需指定第一个（最左边）维数的内存即可*/
        int [][] multidimensionalArray = new int[4][];
    }

}
