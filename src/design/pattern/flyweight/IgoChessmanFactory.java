package design.pattern.flyweight;

import java.util.Hashtable;

public class IgoChessmanFactory {

    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    
    private static Hashtable ht;
    
    private IgoChessmanFactory() {
        ht = new Hashtable();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        ht.put("b",black);
        white = new WhiteIgoChessman();
        ht.put("w",white);
        }
    
    //返回享元工厂类的唯一实例
    public static IgoChessmanFactory getInstance() {
        return instance;
    }
    
    //通过key来获取存储在Hashtable中的享元对象
    public static IgoChessman getIgoChessman(String color) {
    return (IgoChessman)ht.get(color);
    }
}
