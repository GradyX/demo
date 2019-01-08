package design.pattern.adapter;

import java.util.Arrays;

public class QuickSort {

	public int[] sort(int[] values) {
		Arrays.sort(values,0,values.length-1);
		return values;
	}
	
}
