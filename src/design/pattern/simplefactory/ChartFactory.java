package design.pattern.simplefactory;

public class ChartFactory {
	
	public static Chart getChart(int i) {
		Chart chart = null;
		switch(i) {
			case 1:
				chart = new LineChart();
				break;
			case 2:
				chart = new PieChart();
				break;
			case 3:
				chart = new HistogramChart();
				break;
			default:
				System.out.println("输入图表类型有误");
		}
		return chart;
	}
	
}
