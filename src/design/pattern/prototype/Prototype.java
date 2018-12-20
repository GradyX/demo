package design.pattern.prototype;

/*它是声明克隆方法的接口，是所有具体原型类的公共父类，可以是抽象类也可以是接口，甚至还可以是具体实现类。*/
public class Prototype implements Cloneable{

    public Prototype clone() {
       Object object = null;
       try {
           object = super.clone();
       } catch (CloneNotSupportedException exception) {
           System.err.println("Not support cloneable");
       }
       return (Prototype)object;
    }
    
}
