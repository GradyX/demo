package design.pattern.flyweight;

/*Sunny软件公司开发人员通过对围棋棋子进行进一步分析，发现虽然黑色棋子和白色棋子可以
共享，但是它们将显示在棋盘的不同位置，如何让相同的黑子或者白子能够多次重复显示且
位于一个棋盘的不同地方？解决方法就是将棋子的位置定义为棋子的一个外部状态，在需要
时再进行设置。*/

public class Coordinates {
    
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
