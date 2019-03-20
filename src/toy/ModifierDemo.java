package toy;

/*Java定义了两类有趣的修饰符：transient和volatile，这些修饰符用来处理特殊的情况。
 * 如果用transient声明一个实例变量，当对象存储时，它的值不需要维持。
 * 
 * Volatile修饰符告诉编译器被volatile修饰的变量可以被程序的其他部分改变。
 * */

public class ModifierDemo {
    transient int a; // will not persist
    int b; // will persist

    public static void main(String[] args) {
        exer02();
    }

    public static void exercise01() {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer someints[] = new Integer[1000];
        System.out.println("Total memory is: " + r.totalMemory());
        mem1 = r.freeMemory();
        System.out.println("Initial free memory: " + mem1);
        r.gc();
        mem1 = r.freeMemory();
        System.out.println("Free memory after garbage collection: " + mem1);
        for (int i = 0; i < 1000; i++)
            someints[i] = new Integer(i); // allocate integers
        mem2 = r.freeMemory();
        System.out.println("Free memory after allocation: " + mem2);
        System.out.println("Memory used by allocation: " + (mem1 - mem2));
        // discard Integers
        for (int i = 0; i < 1000; i++)
            someints[i] = null;
        r.gc(); // request garbage collection
        mem2 = r.freeMemory();
        System.out.println("Free memory after collecting" + " discarded Integers: " + mem2);
    }

    public static void exer02() {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("E:/Notepad++/notepad++");
            p.waitFor();
            } catch (Exception e) {
            System.out.println("Error executing git Bash.");
            }
            System.out.println("Notepad returned " + p.exitValue()); 

    }

}
