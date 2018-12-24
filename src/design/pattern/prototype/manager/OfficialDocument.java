package design.pattern.prototype.manager;

public interface OfficialDocument {
    public OfficialDocument clone();

    public void display();
}

// 可行性分析报告(Feasibility Analysis Report)类
class FAR implements OfficialDocument {
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }
        return far;
    }

    public void display() {
        System.out.println("《可行性分析报告》");
    }
}

// 软件需求规格说明书(Software Requirements Specification)类
class SRS implements OfficialDocument {
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }
        return srs;
    }

    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}