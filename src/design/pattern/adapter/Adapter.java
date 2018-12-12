package design.pattern.adapter;

public class Adapter implements ScoreOperation {

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
