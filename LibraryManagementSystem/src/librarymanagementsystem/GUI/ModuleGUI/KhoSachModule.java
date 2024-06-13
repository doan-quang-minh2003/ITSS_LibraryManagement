package librarymanagementsystem.GUI.ModuleGUI;

import java.util.ArrayList;
import java.util.Arrays;
import librarymanagementsystem.Toolkit.DataProcessing;
import librarymanagementsystem.Toolkit.FileProcessing.*;
import librarymanagementsystem.GUI.ElementsGUI.TableGUI.*;
import librarymanagementsystem.DTO.*;
import librarymanagementsystem.BUS.*;

import javax.swing.JPanel;
import librarymanagementsystem.GUI.ElementsGUI.FilterGUI.FilterElement.ComboCheckBox;
import librarymanagementsystem.GUI.ElementsGUI.FormGUI.ThemPhieuNhapForm;

public class KhoSachModule {
    private static QLKhoSachBUS khoSachBUS = new QLKhoSachBUS();
    boolean tooglesearch = false;
    
    public JPanel getKhoSachModule() {
        initComponents();
        
        return jPanel1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        khoSach_Table = new javax.swing.JPanel();
        searchtextfield = new javax.swing.JTextField();
        search_bar = new javax.swing.JLabel();
        them_btn = new javax.swing.JLabel();
        nhapexcel_btn = new javax.swing.JLabel();
        xuatexcel_btn = new javax.swing.JLabel();
        refresh_btn = new javax.swing.JLabel();
        expand_btn = new javax.swing.JLabel();
        checkbox = new ComboCheckBox(new ArrayList<String>(Arrays.asList(khoSachBUS.getHeaders())));
        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        jPanel1.setBounds(0, 0, 940, 600);
        //getContentPane().add(jPanel1);
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jPanel1.setOpaque(false);

        searchtextfield.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        searchtextfield.setForeground(new java.awt.Color(82, 210, 202));
        searchtextfield.setText("Tìm Kiếm...");
        searchtextfield.setBorder(null);
        searchtextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchtextfieldMouseClicked(evt);
            }
        });
        searchtextfield.setBounds(100, 63, 240, 30);
        searchtextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtextfieldKeyReleased(evt);
            }
        });
        
        jPanel1.add(searchtextfield);

        search_bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/searchbox.png"))); // NOI18N
        search_bar.setBounds(40, 55, 320, 46);
        jPanel1.add(search_bar);

        them_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/addbox.png"))); // NOI18N
        them_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                them_btnMouseClicked(evt);
            }
        });
        them_btn.setBounds(410, 30, 160, 78);
        jPanel1.add(them_btn);

        nhapexcel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/importexcelbox.png"))); // NOI18N
        nhapexcel_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhapexcel_btnMouseClicked(evt);
            }
        });
        nhapexcel_btn.setBounds(580, 30, 160, 78);
        
        jPanel1.add(nhapexcel_btn);

        xuatexcel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/exportexcelbox.png"))); // NOI18N
        xuatexcel_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xuatexcel_btnMouseClicked(evt);
            }
        });xuatexcel_btn.setBounds(750, 30, 160, 78);
        jPanel1.add(xuatexcel_btn);
        
        /** add Expand and Refresh btn **/
        expand_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/zoomout.png"))); // NOI18N
        expand_btn.setBounds(45, 115, 34, 34);
        expand_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expand_btnMouseClicked(evt);
            }
        });
        jPanel1.add(expand_btn);
        
        refresh_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/reload.png"))); // NOI18N
        refresh_btn.setBounds(89, 115, 34, 34);
        refresh_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh_btnMouseClicked(evt);
            }
        });
        jPanel1.add(refresh_btn);
        /** end **/
        
        /** Header Check Box **/
        JPanel cb = checkbox.getCombobox();
        cb.setOpaque(false);
        cb.setBounds(150, 110, 200, 100);
//        cb.setLocation(150, 115);
        jPanel1.add(cb);
        
        khoSach_Table = new QLKhoSachTable().getTable();
        khoSach_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(khoSach_Table);
        
        //pack();
    }// </editor-fold>                        

    private void them_btnMouseClicked(java.awt.event.MouseEvent evt) {                                      
        System.out.println("Thêm");
        new ThemPhieuNhapForm().setVisible(true);
    }                                     

    private void nhapexcel_btnMouseClicked(java.awt.event.MouseEvent evt) {                                           
        System.out.println("Nhập Excel");
//        ArrayList <QLLoaiSachDTO> sach = new ImportFile().readFileExcel_QLPhieuMuon();
//        
//        boolean finish = true;
//        for (QLLoaiSachDTO e : sach){
//            if (!khoSachBUS.add(e)){
//                finish = false;
//                new AlertGUI(2, "Error", "Lỗi Nhập", "Quay Lại").setVisible(true);
//                break;
//            }
//        }
//        
//        if (finish){
//            new AlertGUI(3, "Success", "Nhập Loại Sách Thành Công!!!", "Quay Lại").setVisible(true);
//        }
    }                                          

    private void xuatexcel_btnMouseClicked(java.awt.event.MouseEvent evt) {                                           
        System.out.println("Xuất Excel");
        new ExportFile().writeFileExcel_QLKhoSach();
    }                                          

    private void searchtextfieldMouseClicked(java.awt.event.MouseEvent evt) {                                                
        if (tooglesearch != true){
            tooglesearch = true;
            searchtextfield.setText("");
        }
        //checkbox.hidePop();
    }       
    
    private void searchtextfieldKeyReleased(java.awt.event.KeyEvent evt) {    
        String search_str = searchtextfield.getText();
        System.out.println("Search: " + search_str);
        //ArrayList <QLKhoSachDTO> loaiSach = khoSachBUS.search_all(search_str);
        
        /** Testing **/
        ArrayList <String> columns_checked = checkbox.getChecked();
        
        ArrayList <QLKhoSachDTO> khoSach = khoSachBUS.getArrKhoSach();
        ArrayList <QLKhoSachDTO> search_res = new ArrayList<>();
        ArrayList <QLKhoSachDTO> search_temp = new ArrayList<>();
        for (String e : columns_checked){
            search_temp = khoSachBUS.search(e, search_str);
            
            ArrayList <String> pkey_1 = new ArrayList<>();
            ArrayList <String> pKey_2 = new ArrayList<>();
            
            for (QLKhoSachDTO ele : search_res){
                pkey_1.add(ele.getMaSach());
            }
            
            for (QLKhoSachDTO ele : search_temp){
                pKey_2.add(ele.getMaSach());
            }
            
            search_res = khoSachBUS.getKhoSach_full(new DataProcessing().union_arr(pkey_1, pKey_2));
        }
        
        khoSach = search_res;
        /** End Testing **/

        /* Print Ma Sach
        for (QLKhoSachDTO e : loaiSach){
            System.out.println(e.getMaSach());
        }*/
        
        jPanel1.remove(khoSach_Table);
        jPanel1.repaint();
        jPanel1.revalidate();
        khoSach_Table = new QLKhoSachTable().getTable(khoSach);
        khoSach_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(khoSach_Table);
    }  
    
    public void paintTable(ArrayList <QLKhoSachDTO> khoSach){
        jPanel1.remove(khoSach_Table);
        jPanel1.repaint();
        jPanel1.revalidate();
        khoSach_Table = new QLKhoSachTable().getTable(khoSach);
        khoSach_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(khoSach_Table);
    }
    
    private void expand_btnMouseClicked(java.awt.event.MouseEvent evt){
        new QLKhoSachTable().expandMode();
    } 
    
    private void refresh_btnMouseClicked(java.awt.event.MouseEvent evt){
        jPanel1.remove(khoSach_Table);
        jPanel1.repaint();
        jPanel1.revalidate();
        khoSach_Table = new QLKhoSachTable().getTable();
        khoSach_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(khoSach_Table);
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
    private static javax.swing.JLabel search_bar;
    private static javax.swing.JTextField searchtextfield;
    private static javax.swing.JLabel them_btn;
    private static javax.swing.JLabel nhapexcel_btn;
    private static javax.swing.JLabel xuatexcel_btn;
    private static javax.swing.JPanel khoSach_Table;
    private static javax.swing.JLabel refresh_btn;
    private static javax.swing.JLabel expand_btn;
    private static ComboCheckBox checkbox;
    // End of variables declaration           
}

