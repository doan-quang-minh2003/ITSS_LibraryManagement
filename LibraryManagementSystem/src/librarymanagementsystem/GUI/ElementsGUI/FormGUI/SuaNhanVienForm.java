
package librarymanagementsystem.GUI.ElementsGUI.FormGUI;

import java.awt.Color;
import javax.swing.JOptionPane;
import librarymanagementsystem.GUI.*;
import librarymanagementsystem.Toolkit.DataProcessing;
import librarymanagementsystem.BUS.QLNhanVienBUS;
import librarymanagementsystem.DTO.QLNhanVienDTO;
import librarymanagementsystem.Toolkit.PasswordHashing;

public class SuaNhanVienForm extends javax.swing.JFrame{
    int x_Mouse, y_Mouse; // For Moving Window
    static String error_mess;
    DataProcessing dp = new DataProcessing();
    static QLNhanVienBUS nccBUS = new QLNhanVienBUS();
    String mnv;
    
    public SuaNhanVienForm(String maNV) {
        QLNhanVienDTO nv = new QLNhanVienBUS().getNhanVien(maNV);
        mnv = maNV;
        initComponents(nv.getPassword(), nv.getHoTen(), nv.getNgaySinh(), nv.getSdt(), nv.getEmail(), nv.getChucVu(), nv.getDiaChi());
        setSize(830, 487);
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String password, String hoTen, String ngaySinh, String sdt, String email, String chucVu, String diaChi) {

        jPanel1 = new javax.swing.JPanel();
        addButton = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();
        movingWindow = new javax.swing.JLabel();
        password_textField = new javax.swing.JPasswordField();
        hoTen_textField = new javax.swing.JTextField();
        ngaySinh_textField = new javax.swing.JTextField();
        sdt_textField = new javax.swing.JTextField();
        email_textField = new javax.swing.JTextField();
        chucVu_textField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        diaChi_textField = new javax.swing.JTextField();
        nhanVienForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../../images/addbtn.png"))); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        addButton.setBounds(10, 7, 35, 35);
        jPanel1.add(addButton);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../../images/exit.png"))); // NOI18N
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        exitButton.setBounds(790, 16, 20, 20);
        jPanel1.add(exitButton);

        movingWindow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingWindowMouseDragged(evt);
            }
        });
        movingWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingWindowMousePressed(evt);
            }
        });
        movingWindow.setBounds(0, 0, 830, 60);
        jPanel1.add(movingWindow);
        
        
        hoTen_textField.setBackground(new java.awt.Color(245, 247, 250));
        hoTen_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hoTen_textField.setText(hoTen);
        hoTen_textField.setBorder(null);
        hoTen_textField.setOpaque(false);
        hoTen_textField.setBounds(48, 127, 190, 30);
        jPanel1.add(hoTen_textField);

        password_textField.setBackground(new java.awt.Color(245, 247, 250));
        password_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password_textField.setText("");
        password_textField.setBorder(null);
        password_textField.setOpaque(false);
        password_textField.setBounds(355, 127, 130, 30);
        jPanel1.add(password_textField);

        
        ngaySinh_textField.setBackground(new java.awt.Color(245, 247, 250));
        ngaySinh_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ngaySinh_textField.setText(ngaySinh);
        ngaySinh_textField.setBorder(null);
        ngaySinh_textField.setOpaque(false);
        ngaySinh_textField.setBounds(620, 127, 100, 30);
        jPanel1.add(ngaySinh_textField);
        
        sdt_textField.setBackground(new java.awt.Color(245, 247, 250));
        sdt_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sdt_textField.setText(sdt);
        sdt_textField.setBorder(null);
        sdt_textField.setOpaque(false);
        sdt_textField.setBounds(520, 250, 157, 30);
        jPanel1.add(sdt_textField);

        email_textField.setBackground(new java.awt.Color(245, 247, 250));
        email_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email_textField.setText(email);
        email_textField.setBorder(null);
        email_textField.setOpaque(false);
        email_textField.setBounds(50, 250, 190, 30);
        jPanel1.add(email_textField);
        
        
        chucVu_textField.setBackground(new java.awt.Color(245, 247, 250));
        chucVu_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chucVu_textField.setText(chucVu);
        chucVu_textField.setBorder(null);
        chucVu_textField.setOpaque(false);
        chucVu_textField.setBounds(50, 370, 190, 30);
        jPanel1.add(chucVu_textField);
        
        diaChi_textField.setBackground(new java.awt.Color(245, 247, 250));
        diaChi_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        diaChi_textField.setText(diaChi);
        diaChi_textField.setBorder(null);
        diaChi_textField.setOpaque(false);
        diaChi_textField.setBounds(370, 370, 400, 30);
        jPanel1.add(diaChi_textField);


        nhanVienForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../../images/staffform.png"))); // NOI18N
        nhanVienForm.setBounds(0, 0, 830, 487);
        jPanel1.add(nhanVienForm);
        jPanel1.setBounds(0, 0, 830, 487);
        
        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean check_input(String password,String hoTen, String ngaySinh, String sdt, String email, String chucVu, String diaChi){
        if (password.equals("")){
            error_mess = "Password trống!!!";
            return false;
        }
        if (hoTen.equals("")){
            error_mess = "Họ Tên trống!!!";
            return false;
        }
        else if (ngaySinh.equals("")){
            error_mess = "Ngày Sinh trống!!!";
            return false;
        }
        else if (sdt.equals("")){
            error_mess = "Số Điện Thoại trống!!!";
            return false;
        }
        else if (email.equals("")){
            error_mess = "Email trống!!!";
            return false;
        }
        if (chucVu.equals("")){
            error_mess = "Chức Vụ trống!!!";
            return false;
        }
        else if (diaChi.equals("")){
            error_mess = "Địa Chỉ trống!!!";
            return false;
        }
        else if (dp.check_ngaythangnam(ngaySinh)!=true){
            error_mess = "Ngày Sinh nhập sai!!!";
            return false;
        }
        else if (dp.check_sdt(sdt)!=true){
            error_mess = "Số Điện Thoại nhập sai!!!";
            return false;
        }
        else if (dp.check_email(email)!=true){
            error_mess = "Email nhập sai!!!";
            return false;
        }
        
        return true;
    }
    
    private void movingWindowMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingWindowMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        setLocation(x - x_Mouse, y - y_Mouse);
    }//GEN-LAST:event_movingWindowMouseDragged

    
    private void movingWindowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingWindowMousePressed
        x_Mouse = evt.getX();
        y_Mouse = evt.getY();
    }//GEN-LAST:event_movingWindowMousePressed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitButtonMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        String password = password_textField.getText();
        String hoTen = hoTen_textField.getText();
        String ngaySinh = ngaySinh_textField.getText();
        String sdt = sdt_textField.getText();
        String email = email_textField.getText();
        String chucVu = chucVu_textField.getText();
        String diaChi = diaChi_textField.getText();
        String maNV = mnv;
        
        if (password.equals("")){
            password = new QLNhanVienBUS(0).getNhanVien(maNV).getPassword();
        }
        else{
            PasswordHashing t = new PasswordHashing();
            t.setSalt(new QLNhanVienBUS(0).getNhanVien(maNV).getSalt());
            password = t.getHashedPassword(password);
        }
        
        if (check_input(password, hoTen, ngaySinh, sdt, email, chucVu, diaChi)){
            int option = JOptionPane.showConfirmDialog(
                null, 
                "Bạn có muốn sửa Nhân Viên" + hoTen + " ?", 
                "Xóa Nhân Viên", 
                JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION){
                System.out.println("Nhập Thành Công");
                if (nccBUS.mod(maNV, password, hoTen, ngaySinh, diaChi, email, chucVu, sdt)){
                    new AlertGUI(3, "Success", "Sửa Nhân Viên Thành Công!!!", "Quay Lại").setVisible(true);
                    this.dispose();
                }
            }
        }
        else{
            System.err.println(error_mess);
            System.out.println("Sửa Thất Bại");
            new AlertGUI(2, "Error", error_mess, "Quay Lại").setVisible(true);
            // Alert Form
        }
        
        System.out.println(hoTen);
        System.out.println(ngaySinh);
        System.out.println(sdt);
        System.out.println(email);
        System.out.println(chucVu);
        System.out.println(diaChi);
        
    }//GEN-LAST:event_addButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(SuaNhanVienForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaNhanVienForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaNhanVienForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaNhanVienForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaNhanVienForm("QL000013").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nhanVienForm;
    private javax.swing.JLabel movingWindow;
    private javax.swing.JPasswordField password_textField;
    private javax.swing.JTextField hoTen_textField;
    private javax.swing.JTextField ngaySinh_textField;
    private javax.swing.JTextField sdt_textField;
    private javax.swing.JTextField email_textField;
    private javax.swing.JTextField chucVu_textField;
    private javax.swing.JTextField diaChi_textField;
    // End of variables declaration//GEN-END:variables
}
