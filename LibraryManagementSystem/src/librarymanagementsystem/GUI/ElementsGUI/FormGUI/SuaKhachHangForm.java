//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package librarymanagementsystem.GUI.ElementsGUI.FormGUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import librarymanagementsystem.BUS.QLKhachHangBUS;
import librarymanagementsystem.DTO.QLKhachHangDTO;
import librarymanagementsystem.GUI.AlertGUI;
import librarymanagementsystem.Toolkit.DataProcessing;

public class SuaKhachHangForm extends JFrame {
    int x_Mouse;
    int y_Mouse;
    static String error_mess;
    DataProcessing dp = new DataProcessing();
    static QLKhachHangBUS khBUS = new QLKhachHangBUS();
    String mkh;
    private JLabel addButton;
    private JLabel exitButton;
    private JPanel jPanel1;
    private JLabel nhanVienForm;
    private JLabel movingWindow;
    private JTextField hoTen_textField;
    private JTextField ngaySinh_textField;
    private JTextField sdt_textField;
    private JTextField email_textField;
    private JTextField diaChi_textField;

    public SuaKhachHangForm(String maKH) {
        QLKhachHangDTO kh = (new QLKhachHangBUS()).getKhachHang(maKH);
        this.mkh = maKH;
        this.initComponents(kh.getHoTen(), kh.getNgaySinh(), kh.getSdt(), kh.getEmail(), kh.getDiaChi());
        this.setSize(830, 336);
        this.setLocationRelativeTo((Component)null);
        this.setBackground(new Color(0, 0, 0, 0));
    }

    private void initComponents(String hoTen, String ngaySinh, String sdt, String email, String diaChi) {
        this.jPanel1 = new JPanel();
        this.addButton = new JLabel();
        this.exitButton = new JLabel();
        this.movingWindow = new JLabel();
        this.hoTen_textField = new JTextField();
        this.ngaySinh_textField = new JTextField();
        this.sdt_textField = new JTextField();
        this.email_textField = new JTextField();
        this.diaChi_textField = new JTextField();
        this.nhanVienForm = new JLabel();
        this.setDefaultCloseOperation(3);
        this.setUndecorated(true);
        this.getContentPane().setLayout((LayoutManager)null);
        this.jPanel1.setOpaque(false);
        this.jPanel1.setLayout((LayoutManager)null);
        this.addButton.setIcon(new ImageIcon(this.getClass().getResource("../../../images/addbtn.png")));
        this.addButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                SuaKhachHangForm.this.addButtonMouseClicked(evt);
            }
        });
        this.addButton.setBounds(10, 7, 35, 35);
        this.jPanel1.add(this.addButton);
        this.exitButton.setIcon(new ImageIcon(this.getClass().getResource("../../../images/exit.png")));
        this.exitButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                SuaKhachHangForm.this.exitButtonMouseClicked(evt);
            }
        });
        this.exitButton.setBounds(790, 16, 20, 20);
        this.jPanel1.add(this.exitButton);
        this.movingWindow.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                SuaKhachHangForm.this.movingWindowMouseDragged(evt);
            }
        });
        this.movingWindow.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                SuaKhachHangForm.this.movingWindowMousePressed(evt);
            }
        });
        this.movingWindow.setBounds(0, 0, 830, 60);
        this.jPanel1.add(this.movingWindow);
        this.hoTen_textField.setBackground(new Color(245, 247, 250));
        this.hoTen_textField.setFont(new Font("Tahoma", 0, 14));
        this.hoTen_textField.setText(hoTen);
        this.hoTen_textField.setBorder((Border)null);
        this.hoTen_textField.setOpaque(false);
        this.hoTen_textField.setBounds(48, 127, 190, 30);
        this.jPanel1.add(this.hoTen_textField);
        this.ngaySinh_textField.setBackground(new Color(245, 247, 250));
        this.ngaySinh_textField.setFont(new Font("Tahoma", 0, 14));
        this.ngaySinh_textField.setText(ngaySinh);
        this.ngaySinh_textField.setBorder((Border)null);
        this.ngaySinh_textField.setOpaque(false);
        this.ngaySinh_textField.setBounds(355, 127, 130, 30);
        this.jPanel1.add(this.ngaySinh_textField);
        this.sdt_textField.setBackground(new Color(245, 247, 250));
        this.sdt_textField.setFont(new Font("Tahoma", 0, 14));
        this.sdt_textField.setText(sdt);
        this.sdt_textField.setBorder((Border)null);
        this.sdt_textField.setOpaque(false);
        this.sdt_textField.setBounds(640, 127, 100, 30);
        this.jPanel1.add(this.sdt_textField);
        this.email_textField.setBackground(new Color(245, 247, 250));
        this.email_textField.setFont(new Font("Tahoma", 0, 14));
        this.email_textField.setText(email);
        this.email_textField.setBorder((Border)null);
        this.email_textField.setOpaque(false);
        this.email_textField.setBounds(48, 227, 157, 30);
        this.jPanel1.add(this.email_textField);
        this.diaChi_textField.setBackground(new Color(245, 247, 250));
        this.diaChi_textField.setFont(new Font("Tahoma", 0, 14));
        this.diaChi_textField.setText(diaChi);
        this.diaChi_textField.setBorder((Border)null);
        this.diaChi_textField.setOpaque(false);
        this.diaChi_textField.setBounds(355, 227, 300, 30);
        this.jPanel1.add(this.diaChi_textField);
        this.nhanVienForm.setIcon(new ImageIcon(this.getClass().getResource("../../../images/customerform.png")));
        this.nhanVienForm.setBounds(0, 0, 830, 336);
        this.jPanel1.add(this.nhanVienForm);
        this.jPanel1.setBounds(0, 0, 830, 336);
        this.getContentPane().add(this.jPanel1);
        this.pack();
    }

    private boolean check_input(String hoTen, String ngaySinh, String sdt, String email, String diaChi) {
        if (hoTen.equals("")) {
            error_mess = "Họ Tên trống!!!";
            return false;
        } else if (ngaySinh.equals("")) {
            error_mess = "Ngày Sinh trống!!!";
            return false;
        } else if (sdt.equals("")) {
            error_mess = "Số Điện Thoại trống!!!";
            return false;
        } else if (email.equals("")) {
            error_mess = "Email trống!!!";
            return false;
        } else if (diaChi.equals("")) {
            error_mess = "Địa Chỉ trống!!!";
            return false;
        } else if (!this.dp.check_ngaythangnam(ngaySinh)) {
            error_mess = "Ngày Sinh nhập sai!!!";
            return false;
        } else if (!this.dp.check_sdt(sdt)) {
            error_mess = "Số Điện Thoại nhập sai!!!";
            return false;
        } else if (!this.dp.check_email(email)) {
            error_mess = "Email nhập sai!!!";
            return false;
        } else {
            return true;
        }
    }

    private void movingWindowMouseDragged(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - this.x_Mouse, y - this.y_Mouse);
    }

    private void movingWindowMousePressed(MouseEvent evt) {
        this.x_Mouse = evt.getX();
        this.y_Mouse = evt.getY();
    }

    private void exitButtonMouseClicked(MouseEvent evt) {
        this.dispose();
    }

    private void addButtonMouseClicked(MouseEvent evt) {
        String hoTen = this.hoTen_textField.getText();
        String ngaySinh = this.ngaySinh_textField.getText();
        String sdt = this.sdt_textField.getText();
        String email = this.email_textField.getText();
        String diaChi = this.diaChi_textField.getText();
        String maKH = this.mkh;
        if (this.check_input(hoTen, ngaySinh, sdt, email, diaChi)) {
            int option = JOptionPane.showConfirmDialog((Component)null, "Bạn có muốn sửa Khách Hàng" + hoTen + " ?", "Xóa Khách Hàng", 0);
            if (option == 0) {
                System.out.println("Nhập Thành Công");
                if (khBUS.mod(maKH, hoTen, ngaySinh, diaChi, email, sdt)) {
                    (new AlertGUI(3, "Success", "Sửa Khách Hàng Thành Công!!!", "Quay Lại")).setVisible(true);
                    this.dispose();
                }
            }
        } else {
            System.err.println(error_mess);
            System.out.println("Sửa Thất Bại");
            (new AlertGUI(2, "Error", error_mess, "Quay Lại")).setVisible(true);
        }

        System.out.println(hoTen);
        System.out.println(ngaySinh);
        System.out.println(sdt);
        System.out.println(email);
        System.out.println(diaChi);
    }

    public static void main(String[] args) {
        try {
            UIManager.LookAndFeelInfo[] var12 = UIManager.getInstalledLookAndFeels();
            int var2 = var12.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                UIManager.LookAndFeelInfo info = var12[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(SuaKhachHangForm.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(SuaKhachHangForm.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(SuaKhachHangForm.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            UnsupportedLookAndFeelException ex = var8;
            Logger.getLogger(SuaKhachHangForm.class.getName()).log(Level.SEVERE, (String)null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new SuaKhachHangForm("KH000021")).setVisible(true);
            }
        });
    }
}
