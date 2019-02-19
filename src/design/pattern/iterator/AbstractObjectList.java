package design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {

    protected List<Object> objects = new ArrayList<Object>();

    public AbstractObjectList(List objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object obj) {
        this.objects.remove(obj);
    }

    public List getObjects() {
        return this.objects;
    }

    // 声明创建迭代器对象的抽象工厂方法
    public abstract AbstractIterator createIterator();
}

// 商品数据类：具体聚合类
class ProductList extends AbstractObjectList {
    public ProductList(List products) {
        super(products);
    }

    // 实现创建迭代器对象的具体工厂方法
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}


//商品数据类：具体聚合类
class ProductListInnerIterator extends AbstractObjectList {
    public ProductListInnerIterator(List products) {
        super(products);
    }

    public AbstractIterator createIterator() {
        return new ProductIterator();
    }

    // 商品迭代器：具体迭代器，内部类实现
    private class ProductIterator implements AbstractIterator {
        private int cursor1;
        private int cursor2;

        public ProductIterator() {
            cursor1 = 0;
            cursor2 = objects.size() - 1;
        }

        public void next() {
            if (cursor1 < objects.size()) {
                cursor1++;
            }
        }

        public boolean isLast() {
            return (cursor1 == objects.size());
        }

        public void previous() {
            if (cursor2 > -1) {
                cursor2--;
            }
        }

        public boolean isFirst() {
            return (cursor2 == -1);
        }

        public Object getNextItem() {
            return objects.get(cursor1);
        }

        public Object getPreviousItem() {
            return objects.get(cursor2);
        }
    }

}