package design.pattern.adapter;

//类适配器模式结构,适配器与适配者之间是继承（或实现）关系
public class ScoreOperationObjAdapter extends QuickSort implements ScoreOperation {

    @Override
    public int search(int[] scores, int searchScore) {
        return 0;
    }

}
