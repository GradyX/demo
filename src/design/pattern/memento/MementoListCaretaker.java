package design.pattern.memento;

import java.util.ArrayList;

public class MementoListCaretaker {
    
    // 定义一个集合来存储多个备忘录
    private ArrayList mementolist = new ArrayList();

    public Memento getMemento(int i) {
        return (Memento) mementolist.get(i);
    }

    public void setMemento(Memento memento) {
        mementolist.add(memento);
    }
    
}
