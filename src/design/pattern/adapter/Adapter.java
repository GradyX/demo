package design.pattern.adapter;


public class Adapter implements ScoreOperation {

  //对象适配器模式，因为适配器类与适配者类是关联关系（也可称之为委派关系）
	QuickSort sort;
	BinarySearch search;
	
	public Adapter() {
		sort = new QuickSort();
		search = new BinarySearch();
	}
	
	public int[] sort(int[] scores) {
		return sort.sort(scores);
	}

	public int search(int[] scores, int scoresscores) {
		return search.search(scores, scoresscores);
	}

}
