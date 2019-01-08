package design.pattern.adapter;

public class Client {

	public static void main(String[] args) {
	   ScoreOperation scoreOperation = new Adapter();
	   int[] scores = new int[]{100,98,78,63};
	   scoreOperation.sort(scores);
	}

}
