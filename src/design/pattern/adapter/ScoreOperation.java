package design.pattern.adapter;

public interface ScoreOperation {

	int[] sort(int[] scores);
	
	int search(int[] scores, int searchScore);
	
}
