package librarymanagementsystem.GUI.ModuleGUI;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JLabel;
import librarymanagementsystem.BUS.QLPhieuMuonBUS;
import librarymanagementsystem.BUS.QLLoaiSachBUS;
import librarymanagementsystem.GUI.ElementsGUI.ChartDrawing;
import librarymanagementsystem.GUI.ElementsGUI.ChoiceGUI.dashboardCard_3;
import librarymanagementsystem.Toolkit.ThongKe;
import librarymanagementsystem.Toolkit.DataProcessing;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;

public class ThongKeModule_KhoSach {
    private static DataProcessing dp = new DataProcessing();
    private static ThongKe tk = new ThongKe();
    private static QLPhieuMuonBUS phieuMuonBUS = new QLPhieuMuonBUS(0);
    
    public JPanel getThongKeKhoSachGUI() {
        initComponents();
        new QLLoaiSachBUS();
        
        JLabel report = new JLabel();
        report.setToolTipText("Xuất Report");
        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/report.png"))); // NOI18N
        report.setBounds(905, 7, 30, 30);
        jPanel1.add(report);
        
        JPanel card_1 = new dashboardCard_3("Số Loại Sách", Integer.toString(tk.getSoLuongKho_LoaiSach()), "../../../images/books.png").getdashboardCard();
        JPanel card_2 = new dashboardCard_3("Tổng Số Sách", Integer.toString(tk.getSoLuongKho_ChiTietSach()), "../../../images/books1.png").getdashboardCard();
        JPanel card_3 = new dashboardCard_3("Số Sách Trung Bình", Integer.toString(tk.getSoLuongKho_ChiTietSachTrungBinh()), "../../../images/books2.png").getdashboardCard();
        JPanel card_4 = new dashboardCard_3("Số Sách Lớn Nhất", Integer.toString(tk.getSoLuongKho_ChiTietSachLonNhat()), "../../../images/books3.png").getdashboardCard();
        card_1.setBounds(20, 40 - 10, 240, 143);
        card_2.setBounds(250, 40 - 10, 240, 143);
        card_3.setBounds(480, 40 - 10, 240, 143);
        card_4.setBounds(710, 40 - 10, 240, 143);
        
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        jPanel1.add(card_1);
        jPanel1.add(card_2);
        jPanel1.add(card_3);
        jPanel1.add(card_4);
        /** End Cards **/
        
        /** Charts **/
        ChartDrawing chart = new ChartDrawing();

        ArrayList <String> value_name = tk.getSoLuongKho_LoaiSacharr();
        ArrayList <Integer> value = tk.getSoLuongKho_ChiTietSacharr();
        
        JFreeChart freechart = chart.createChart_BarChart("Biểu Đồ về Phân Bố Sách (Kho Sách)", "Số Lượng Sách", chart.createDataSet_BarChart("Số Lượng Sách", value_name, value));
        freechart.getCategoryPlot().setOrientation(PlotOrientation.VERTICAL);
        freechart.getPlot().setOutlinePaint(new Color(241, 245, 248));
        BarRenderer renderer = (BarRenderer) freechart.getCategoryPlot().getRenderer();

        renderer.setSeriesPaint(0, new Color(255, 87, 51));
        
        JPanel chartsachthuvien = new ChartPanel(freechart);
        chartsachthuvien.setBounds(35, 180, 880, 380);
        jPanel1.add(chartsachthuvien);
        
        return jPanel1;
    }

                          
    private static void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        jPanel1.setLayout(null);
        jPanel1.setBounds(0, 0, 940, 600);
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        
    }              
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private static javax.swing.JPanel jPanel1;
    // End of variables declaration               
}
