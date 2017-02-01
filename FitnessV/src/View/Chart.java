package View;
import java.awt.Color;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class Chart {
	
	private XYDataset dataset;
	private JFreeChart chart;
	private ChartPanel panel;
	
	public Chart(){
		
	}
	public void createPieChart(){
		DefaultPieDataset tempSet = new DefaultPieDataset();
		JFreeChart tempChart = ChartFactory.createPieChart(
				"Test Chart",
				(PieDataset) dataset,
				true,
				true,
				false);
	}
	public JFreeChart createLineChart(){
		JFreeChart tempChart = ChartFactory.createXYLineChart(
				"Test Chart",
				"X",
				"Y",
				dataset,
				PlotOrientation.VERTICAL,
				true,
				true,
				false);
		return tempChart;
	}
	public void getDataset(ArrayList list, String parameter){
		
	}
}
