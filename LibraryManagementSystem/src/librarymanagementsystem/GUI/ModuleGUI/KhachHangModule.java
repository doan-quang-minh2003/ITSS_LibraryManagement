//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package librarymanagementsystem.GUI.ModuleGUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import librarymanagementsystem.BUS.QLKhachHangBUS;
import librarymanagementsystem.DTO.QLKhachHangDTO;
import librarymanagementsystem.GUI.AlertGUI;
import librarymanagementsystem.GUI.ElementsGUI.TableGUI.QLKhachHangTable;
import librarymanagementsystem.GUI.ElementsGUI.FilterGUI.FilterElement.ComboCheckBox;
import librarymanagementsystem.GUI.ElementsGUI.FormGUI.ThemKhachHangForm;
import librarymanagementsystem.Toolkit.DataProcessing;
import librarymanagementsystem.Toolkit.FileProcessing.ExportFile;
import librarymanagementsystem.Toolkit.FileProcessing.ImportFile;

public class KhachHangModule {
    private static QLKhachHangBUS khachHangBUS = new QLKhachHangBUS();
    boolean tooglesearch = false;
    private static JPanel jPanel1;
    private static JLabel search_bar;
    private static JTextField searchtextfield;
    private static JLabel them_btn;
    private static JLabel nhapexcel_btn;
    private static JLabel xuatexcel_btn;
    private static JPanel khachHang_Table;
    private static JLabel refresh_btn;
    private static JLabel expand_btn;
    private static ComboCheckBox checkbox;

    public KhachHangModule() {
    }

    public JPanel getKhachHangModule() {
        this.initComponents();
        return jPanel1;
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        khachHang_Table = new JPanel();
        searchtextfield = new JTextField();
        search_bar = new JLabel();
        them_btn = new JLabel();
        nhapexcel_btn = new JLabel();
        xuatexcel_btn = new JLabel();
        refresh_btn = new JLabel();
        expand_btn = new JLabel();
        checkbox = new ComboCheckBox(new ArrayList(Arrays.asList(khachHangBUS.getHeaders())));
        jPanel1.setLayout((LayoutManager)null);
        jPanel1.setBounds(0, 0, 940, 600);
        jPanel1.getAccessibleContext().setAccessibleDescription("");
        jPanel1.setOpaque(false);
        searchtextfield.setFont(new Font("Tahoma", 0, 16));
        searchtextfield.setForeground(new Color(82, 210, 202));
        searchtextfield.setText("Tìm Kiếm...");
        searchtextfield.setBorder((Border)null);
        searchtextfield.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                KhachHangModule.this.searchtextfieldMouseClicked(evt);
            }
        });
        searchtextfield.setBounds(100, 63, 240, 30);
        searchtextfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                KhachHangModule.this.searchtextfieldKeyReleased(evt);
            }
        });
        jPanel1.add(searchtextfield);
        search_bar.setIcon(new ImageIcon(this.getClass().getResource("../../images/searchbox.png")));
        search_bar.setBounds(40, 55, 320, 46);
        jPanel1.add(search_bar);
        them_btn.setIcon(new ImageIcon(this.getClass().getResource("../../images/addbox.png")));
        them_btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                KhachHangModule.this.them_btnMouseClicked(evt);
            }
        });
        them_btn.setBounds(410, 30, 160, 78);
        jPanel1.add(them_btn);
        nhapexcel_btn.setIcon(new ImageIcon(this.getClass().getResource("../../images/importexcelbox.png")));
        nhapexcel_btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                KhachHangModule.this.nhapexcel_btnMouseClicked(evt);
            }
        });
        nhapexcel_btn.setBounds(580, 30, 160, 78);
        jPanel1.add(nhapexcel_btn);
        xuatexcel_btn.setIcon(new ImageIcon(this.getClass().getResource("../../images/exportexcelbox.png")));
        xuatexcel_btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                KhachHangModule.this.xuatexcel_btnMouseClicked(evt);
            }
        });
        xuatexcel_btn.setBounds(750, 30, 160, 78);
        jPanel1.add(xuatexcel_btn);
        expand_btn.setIcon(new ImageIcon(this.getClass().getResource("../../images/zoomout.png")));
        expand_btn.setBounds(45, 115, 34, 34);
        expand_btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                KhachHangModule.this.expand_btnMouseClicked(evt);
            }
        });
        jPanel1.add(expand_btn);
        refresh_btn.setIcon(new ImageIcon(this.getClass().getResource("../../images/reload.png")));
        refresh_btn.setBounds(89, 115, 34, 34);
        refresh_btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                KhachHangModule.this.refresh_btnMouseClicked(evt);
            }
        });
        jPanel1.add(refresh_btn);
        JPanel cb = checkbox.getCombobox();
        cb.setOpaque(false);
        cb.setBounds(150, 110, 200, 100);
        jPanel1.add(cb);
        khachHang_Table = (new QLKhachHangTable()).getTable();
        khachHang_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(khachHang_Table);
    }

    private void them_btnMouseClicked(MouseEvent evt) {
        System.out.println("Thêm");
        (new ThemKhachHangForm()).setVisible(true);
    }

    private void nhapexcel_btnMouseClicked(MouseEvent evt) {
        System.out.println("Nhập Excel");
        ArrayList<QLKhachHangDTO> sach = (new ImportFile()).readFileExcel_QLKhachHang();
        boolean finish = true;
        Iterator var4 = sach.iterator();

        while(var4.hasNext()) {
            QLKhachHangDTO e = (QLKhachHangDTO)var4.next();
            if (!khachHangBUS.add(e)) {
                finish = false;
                (new AlertGUI(2, "Error", "Lỗi Nhập", "Quay Lại")).setVisible(true);
                break;
            }
        }

        if (finish) {
            (new AlertGUI(3, "Success", "Nhập Loại Sách Thành Công!!!", "Quay Lại")).setVisible(true);
        }

    }

    private void xuatexcel_btnMouseClicked(MouseEvent evt) {
        System.out.println("Xuất Excel");
        (new ExportFile()).writeFileExcel_QLKhachHang();
    }

    private void searchtextfieldMouseClicked(MouseEvent evt) {
        if (!this.tooglesearch) {
            this.tooglesearch = true;
            searchtextfield.setText("");
        }

    }

    private void searchtextfieldKeyReleased(KeyEvent evt) {
        String search_str = searchtextfield.getText();
        System.out.println("Search: " + search_str);
        ArrayList<String> columns_checked = checkbox.getChecked();
        ArrayList<QLKhachHangDTO> khachHang = khachHangBUS.getArrKhachHang();
        ArrayList<QLKhachHangDTO> search_res = new ArrayList();
        new ArrayList();

        ArrayList pkey_1;
        ArrayList pKey_2;
        for(Iterator var7 = columns_checked.iterator(); var7.hasNext(); search_res = khachHangBUS.getKhachHang_full((new DataProcessing()).union_arr(pkey_1, pKey_2))) {
            String e = (String)var7.next();
            ArrayList<QLKhachHangDTO> search_temp = khachHangBUS.search(e, search_str);
            pkey_1 = new ArrayList();
            pKey_2 = new ArrayList();
            Iterator var11 = search_res.iterator();

            QLKhachHangDTO ele;
            while(var11.hasNext()) {
                ele = (QLKhachHangDTO)var11.next();
                pkey_1.add(ele.getMaKhachHang());
            }

            var11 = search_temp.iterator();

            while(var11.hasNext()) {
                ele = (QLKhachHangDTO)var11.next();
                pKey_2.add(ele.getMaKhachHang());
            }
        }

        khachHang = search_res;
        jPanel1.remove(khachHang_Table);
        jPanel1.repaint();
        jPanel1.revalidate();
        khachHang_Table = (new QLKhachHangTable()).getTable(khachHang);
        khachHang_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(khachHang_Table);
    }

    public void paintTable(ArrayList<QLKhachHangDTO> khachHang) {
        jPanel1.remove(khachHang_Table);
        jPanel1.repaint();
        jPanel1.revalidate();
        khachHang_Table = (new QLKhachHangTable()).getTable(khachHang);
        khachHang_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(khachHang_Table);
    }

    private void expand_btnMouseClicked(MouseEvent evt) {
        (new QLKhachHangTable()).expandMode();
    }

    private void refresh_btnMouseClicked(MouseEvent evt) {
        jPanel1.remove(khachHang_Table);
        jPanel1.repaint();
        jPanel1.revalidate();
        khachHang_Table = (new QLKhachHangTable()).getTable();
        khachHang_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(khachHang_Table);
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
            Logger.getLogger(TrangChuGUI.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(TrangChuGUI.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(TrangChuGUI.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            UnsupportedLookAndFeelException ex = var8;
            Logger.getLogger(TrangChuGUI.class.getName()).log(Level.SEVERE, (String)null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new TrangChuGUI()).setVisible(true);
            }
        });
    }
}
