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
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import librarymanagementsystem.BUS.QLTheBUS;
import librarymanagementsystem.DTO.QLTheDTO;
import librarymanagementsystem.GUI.AlertGUI;
import librarymanagementsystem.Toolkit.DataProcessing;

public class SuaTheForm extends JFrame {
    int x_Mouse;
    int y_Mouse;
    static String error_mess;
    DataProcessing dp = new DataProcessing();
    static QLTheBUS theBUS = new QLTheBUS();
    String mt;
    QLTheDTO the;
    private JLabel addButton;
    private JLabel exitButton;
    private JPanel jPanel1;
    private JLabel nhanVienForm;
    private JLabel movingWindow;
    private JTextField ngayCap_textField;
    private JLabel maKH_Label;
    private JLabel ngayHetHan_Label;

    public SuaTheForm(String maThe) {
        this.the = (new QLTheBUS()).getThe(maThe);
        this.mt = maThe;
        this.initComponents(this.the.getMaKhachHang(), this.the.getNgayCap(), this.the.getNgayHetHan());
        this.setSize(830, 243);
        this.setLocationRelativeTo((Component)null);
        this.setBackground(new Color(0, 0, 0, 0));
    }

    private void initComponents(String maKH, String ngayCap, String ngayHetHan) {
        this.jPanel1 = new JPanel();
        this.addButton = new JLabel();
        this.exitButton = new JLabel();
        this.movingWindow = new JLabel();
        this.ngayCap_textField = new JTextField();
        this.maKH_Label = new JLabel();
        this.ngayHetHan_Label = new JLabel();
        this.nhanVienForm = new JLabel();
        this.setDefaultCloseOperation(3);
        this.setUndecorated(true);
        this.getContentPane().setLayout((LayoutManager)null);
        this.jPanel1.setOpaque(false);
        this.jPanel1.setLayout((LayoutManager)null);
        this.addButton.setIcon(new ImageIcon(this.getClass().getResource("../../../images/addbtn.png")));
        this.addButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                SuaTheForm.this.addButtonMouseClicked(evt);
            }
        });
        this.addButton.setBounds(10, 7, 35, 35);
        this.jPanel1.add(this.addButton);
        this.exitButton.setIcon(new ImageIcon(this.getClass().getResource("../../../images/exit.png")));
        this.exitButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                SuaTheForm.this.exitButtonMouseClicked(evt);
            }
        });
        this.exitButton.setBounds(790, 16, 20, 20);
        this.jPanel1.add(this.exitButton);
        this.movingWindow.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                SuaTheForm.this.movingWindowMouseDragged(evt);
            }
        });
        this.movingWindow.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                SuaTheForm.this.movingWindowMousePressed(evt);
            }
        });
        this.movingWindow.setBounds(0, 0, 830, 60);
        this.jPanel1.add(this.movingWindow);
        this.maKH_Label.setBackground(new Color(245, 247, 250));
        this.maKH_Label.setFont(new Font("Tahoma", 0, 14));
        this.maKH_Label.setText(maKH);
        this.maKH_Label.setBorder((Border)null);
        this.maKH_Label.setOpaque(false);
        this.maKH_Label.setBounds(48, 125, 160, 30);
        this.jPanel1.add(this.maKH_Label);
        this.ngayCap_textField.setBackground(new Color(245, 247, 250));
        this.ngayCap_textField.setFont(new Font("Tahoma", 0, 14));
        this.ngayCap_textField.setText(ngayCap);
        this.ngayCap_textField.setBorder((Border)null);
        this.ngayCap_textField.setOpaque(false);
        this.ngayCap_textField.setBounds(305, 125, 160, 30);
        this.jPanel1.add(this.ngayCap_textField);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c1 = Calendar.getInstance();
        Date tmp = Date.valueOf(this.ngayCap_textField.getText());
        c1.setTime(tmp);
        c1.roll(1, 1);
        this.ngayHetHan_Label.setBackground(new Color(245, 247, 250));
        this.ngayHetHan_Label.setFont(new Font("Tahoma", 0, 14));
        this.ngayHetHan_Label.setText(dateFormat.format(c1.getTime()));
        this.ngayHetHan_Label.setBorder((Border)null);
        this.ngayHetHan_Label.setOpaque(false);
        this.ngayHetHan_Label.setBounds(560, 125, 160, 30);
        this.jPanel1.add(this.ngayHetHan_Label);
        this.nhanVienForm.setIcon(new ImageIcon(this.getClass().getResource("../../../images/cardform.png")));
        this.nhanVienForm.setBounds(0, 0, 830, 243);
        this.jPanel1.add(this.nhanVienForm);
        this.jPanel1.setBounds(0, 0, 830, 243);
        this.getContentPane().add(this.jPanel1);
        this.pack();
    }

    private boolean check_input(String maKH, String ngayCap) {
        if (ngayCap.equals("")) {
            error_mess = "Ngày Cấp trống!!!";
            return false;
        } else if (!this.dp.check_ngaythangnam(ngayCap)) {
            error_mess = "Ngày Cấp nhập sai!!!";
            return false;
        } else if (!this.dp.check_maKhachHang(maKH)) {
            error_mess = "Mã Khách Hàng nhập sai!!!";
            return false;
        } else if ((new QLKhachHangBUS(0)).getKhachHang(maKH) == null) {
            error_mess = "Mã Khách Hàng không tồn tại!!!";
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
        String maKH = this.maKH_Label.getText();
        String ngayCap = this.ngayCap_textField.getText();
        String var10000 = Integer.toString(Integer.parseInt(this.ngayCap_textField.getText().substring(0, 4)) + 1);
        String ngayHetHan = var10000 + this.ngayCap_textField.getText().substring(4);
        String maThe = this.mt;
        if (this.check_input(maKH, ngayCap)) {
            int option = JOptionPane.showConfirmDialog((Component)null, "Bạn có muốn sửa Thẻ " + maThe + " ?", "Xóa Thẻ", 0);
            if (option == 0) {
                System.out.println("Nhập Thành Công");
                if (theBUS.mod(maThe, maKH, ngayCap, ngayHetHan)) {
                    (new AlertGUI(3, "Success", "Sửa Thẻ Thành Công!!!", "Quay Lại")).setVisible(true);
                    this.dispose();
                }
            }
        } else {
            System.err.println(error_mess);
            System.out.println("Sửa Thất Bại");
            (new AlertGUI(2, "Error", error_mess, "Quay Lại")).setVisible(true);
        }

        System.out.println(maThe);
        System.out.println(maKH);
        System.out.println(ngayCap);
        System.out.println(ngayHetHan);
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
            Logger.getLogger(SuaTheForm.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(SuaTheForm.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(SuaTheForm.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            UnsupportedLookAndFeelException ex = var8;
            Logger.getLogger(SuaTheForm.class.getName()).log(Level.SEVERE, (String)null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new SuaTheForm("T000020")).setVisible(true);
            }
        });
    }
}
