package toy;

/**
 * 
 * @author gzc
 *
 */

public class EnumDemo {

	public static void main(String[] args) {
		System.out.println(Days.valueOf("FRIDAY"));
	}

}

enum Days {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
	
	private int today;
	Days(int day) {
		this.today = day;
	}
	
}