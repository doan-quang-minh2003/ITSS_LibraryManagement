package librarymanagementsystem.GUI.ElementsGUI;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.general.PieDataset;

public class ChartDrawing{
   
    //** PieChart **//
    private PieDataset createDataSet_PieChart(ArrayList <String> key, ArrayList <Integer> value){
        DefaultPieDataset dataset = new DefaultPieDataset( );
        for (int i=0; i<key.size(); i++){
            dataset.setValue(key.get(i) , value.get(i) );  
        }
        return dataset;         
    }
   
    private JFreeChart createChart_PieChart(String title, PieDataset dataset ) {
        JFreeChart chart = ChartFactory.createPieChart(      
            title,  
            dataset,       
            true,           
            true, 
            false);
        chart.getPlot().setBackgroundPaint( new Color(241, 245, 248) );
        chart.getPlot().setOutlinePaint(new Color(91, 231, 196));
        chart.getTitle().setFont(new java.awt.Font("Arial", 1, 16));
        chart.getTitle().setPaint(new java.awt.Color(77, 97, 77));
        return chart;
    }
    
    public JFreeChart createChart_PieChart(String title, ArrayList <String> key, ArrayList <Integer> value ) {
        JFreeChart chart = ChartFactory.createPieChart(      
            title,  
            createDataSet_PieChart(key, value),       
            true,           
            true, 
            false);
        chart.getPlot().setBackgroundPaint( new Color(241, 245, 248) );
        chart.getPlot().setOutlinePaint(new Color(91, 231, 196));
        chart.getTitle().setFont(new java.awt.Font("Arial", 1, 16));
        chart.getTitle().setPaint(new java.awt.Color(77, 97, 77));
        return chart;
    }
    
    public JPanel pieChart(String title, ArrayList <String> name_value, ArrayList <Integer> value) {
        JFreeChart chart = createChart_PieChart(title, createDataSet_PieChart(name_value, value) );  
        return new ChartPanel( chart ); 
    }
    
    public JPanel pieChart_withoutLabel(String title, ArrayList <String> name_value, ArrayList <Integer> value) {
        JFreeChart chart = createChart_PieChart(title, createDataSet_PieChart(name_value, value) ); 
        PiePlot pieplot = (PiePlot) chart.getPlot();
        pieplot.setLabelGenerator(null);
        return new ChartPanel( chart ); 
    }

    public DefaultCategoryDataset createDataSet_LineChart(String series, ArrayList <Integer> value_1, ArrayList <Integer> value_2){
        DefaultCategoryDataset  dataset = new DefaultCategoryDataset( );
        for (int i=0; i<value_1.size(); i++){
            dataset.setValue(value_1.get(i), series, value_2.get(i));  
        }
        return dataset;
    }
    

    public JFreeChart createChart_LineChart(String title, String name_value_1, String name_value_2, DefaultCategoryDataset dataset ) {
        JFreeChart lineChart = ChartFactory.createLineChart(
            title,
            name_value_1, name_value_2,
            dataset,    
            PlotOrientation.VERTICAL,
            true,true,false);
        lineChart.getPlot().setBackgroundPaint( new Color(241, 245, 248) );
        lineChart.getPlot().setOutlinePaint(new Color(91, 231, 196));
        lineChart.getTitle().setFont(new java.awt.Font("Arial", 1, 16));
        
        CategoryPlot plot = (CategoryPlot) lineChart.getPlot();
        
        LineAndShapeRenderer render = new LineAndShapeRenderer();
 
        render.setSeriesPaint(0, new Color(82, 210, 202));
        
        plot.setRenderer(render);
        
        return lineChart;
    }
    
    public JPanel lineChart(String title, String series, String name_value_1, String name_value_2, ArrayList <Integer> value_1, ArrayList <Integer> value_2) {
        ChartPanel chart = new ChartPanel(createChart_LineChart(title, name_value_1, name_value_2, createDataSet_LineChart(series, value_1, value_2)));  
        return chart; 
    }
    
    
    private XYDataset createDataSet_XYChart(String series, ArrayList <Double> value_1, ArrayList <Double> value_2){

        XYSeries ser = new XYSeries(series);          
        for (int i=0; i<value_1.size(); i++){
            ser.add(value_1.get(i), value_2.get(i)); 
        }
        
        XYSeriesCollection dataset = new XYSeriesCollection( );          
        dataset.addSeries( ser );    
        return dataset;
    }
    
    private JFreeChart createChart_XYChart(String title, String name_value_1, String name_value_2, XYDataset dataset ) {

        JFreeChart xylineChart = ChartFactory.createXYLineChart(
            title ,
            name_value_1 ,
            name_value_2 ,
            dataset ,
            PlotOrientation.VERTICAL ,
            true , true , false);
        
        return xylineChart;
    }
    
    public JPanel xyChart(String title, String series, String name_value_1, String name_value_2, ArrayList <Double> value_1, ArrayList <Double> value_2) {
        ChartPanel chart = new ChartPanel(createChart_XYChart(title, name_value_1, name_value_2, createDataSet_XYChart(series, value_1, value_2)));  
        return chart; 
    }
    
    public CategoryDataset createDataSet_BarChart(String series, ArrayList <String> value_name, ArrayList <Integer> value){

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i=0; i<value_name.size(); i++){
            dataset.setValue(value.get(i), series, value_name.get(i));
        }
        return dataset;
    }
    
    public JFreeChart createChart_BarChart(String title, String series, CategoryDataset dataset ) {

        JFreeChart barChart = ChartFactory.createBarChart(
                title,
                "",
                series,
                dataset,
                PlotOrientation.HORIZONTAL,
                false, true, false);
        
        barChart.getPlot().setBackgroundPaint(Color.WHITE);
        barChart.getPlot().setOutlinePaint(new Color(84, 130, 53));
        
        BarRenderer renderer = (BarRenderer) barChart.getCategoryPlot().getRenderer();

        renderer.setSeriesPaint(0, new Color(91, 231, 196));
        renderer.setBarPainter(new StandardBarPainter());
        renderer.setDrawBarOutline(false);
        renderer.setItemMargin(0);
        
        CategoryPlot plot = barChart.getCategoryPlot();
        plot.getDomainAxis().setCategoryMargin(0.3);
        plot.getDomainAxis().setLowerMargin(0.1);
        plot.getDomainAxis().setUpperMargin(0.1);
        
        renderer.setSeriesOutlinePaint(0, new Color(213, 94, 0));
        renderer.setSeriesOutlinePaint(1, new Color(204, 121, 167));
        renderer.setSeriesOutlineStroke(0, new BasicStroke(2.5f));
        
        return barChart;
    }
    
    public JPanel barChart(String title, String series, ArrayList <String> value_name, ArrayList <Integer> value) {
        ChartPanel chart = new ChartPanel(createChart_BarChart(title, series, createDataSet_BarChart(series, value_name, value)));  
        return chart; 
    }
}
