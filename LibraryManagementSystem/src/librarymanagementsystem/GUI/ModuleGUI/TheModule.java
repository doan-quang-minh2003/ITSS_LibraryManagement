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
import librarymanagementsystem.BUS.QLTheBUS;
import librarymanagementsystem.DTO.QLTheDTO;
import librarymanagementsystem.GUI.AlertGUI;
import librarymanagementsystem.GUI.Table.QLTheTable;
import librarymanagementsystem.GUI.ThanhPhanGUI.ComboCheckBox;
import librarymanagementsystem.GUI.ThemSuaGUI.ThemTheForm;
import librarymanagementsystem.Toolkit.DataProcessing;
import librarymanagementsystem.Toolkit.FileProcessing.ExportFile;
import librarymanagementsystem.Toolkit.FileProcessing.ImportFile;

public class TheModule {
    private static QLTheBUS theBUS = new QLTheBUS(0);
    boolean tooglesearch = false;
    private static JPanel jPanel1;
    private static JLabel search_bar;
    private static JTextField searchtextfield;
    private static JLabel them_btn;
    private static JLabel nhapexcel_btn;
    private static JLabel xuatexcel_btn;
    private static JPanel the_Table;
    private static JLabel refresh_btn;
    private static JLabel expand_btn;
    private static ComboCheckBox checkbox;

    public TheModule() {
    }

    public JPanel getTheModule() {
        this.initComponents();
        return jPanel1;
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        the_Table = new JPanel();
        searchtextfield = new JTextField();
        search_bar = new JLabel();
        them_btn = new JLabel();
        nhapexcel_btn = new JLabel();
        xuatexcel_btn = new JLabel();
        refresh_btn = new JLabel();
        expand_btn = new JLabel();
        checkbox = new ComboCheckBox(new ArrayList(Arrays.asList((new QLTheBUS()).getHeaders())));
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
                TheModule.this.searchtextfieldMouseClicked(evt);
            }
        });
        searchtextfield.setBounds(100, 63, 240, 30);
        searchtextfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                TheModule.this.searchtextfieldKeyReleased(evt);
            }
        });
        jPanel1.add(searchtextfield);
        search_bar.setIcon(new ImageIcon(this.getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T185554.332.png")));
        search_bar.setBounds(40, 55, 320, 46);
        jPanel1.add(search_bar);
        them_btn.setIcon(new ImageIcon(this.getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T203841.556.png")));
        them_btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TheModule.this.them_btnMouseClicked(evt);
            }
        });
        them_btn.setBounds(410, 30, 160, 78);
        jPanel1.add(them_btn);
        nhapexcel_btn.setIcon(new ImageIcon(this.getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T203937.073.png")));
        nhapexcel_btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TheModule.this.nhapexcel_btnMouseClicked(evt);
            }
        });
        nhapexcel_btn.setBounds(580, 30, 160, 78);
        jPanel1.add(nhapexcel_btn);
        xuatexcel_btn.setIcon(new ImageIcon(this.getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T203932.633.png")));
        xuatexcel_btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TheModule.this.xuatexcel_btnMouseClicked(evt);
            }
        });
        xuatexcel_btn.setBounds(750, 30, 160, 78);
        jPanel1.add(xuatexcel_btn);
        expand_btn.setIcon(new ImageIcon(this.getClass().getResource("../../images/output-onlinepngtools - 2020-06-10T234019.664.png")));
        expand_btn.setBounds(45, 115, 34, 34);
        expand_btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TheModule.this.expand_btnMouseClicked(evt);
            }
        });
        jPanel1.add(expand_btn);
        refresh_btn.setIcon(new ImageIcon(this.getClass().getResource("../../images/output-onlinepngtools - 2020-06-10T234012.187.png")));
        refresh_btn.setBounds(89, 115, 34, 34);
        refresh_btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TheModule.this.refresh_btnMouseClicked(evt);
            }
        });
        jPanel1.add(refresh_btn);
        JPanel cb = checkbox.getCombobox();
        cb.setOpaque(false);
        cb.setBounds(150, 110, 200, 100);
        jPanel1.add(cb);
        the_Table = (new QLTheTable()).getTable();
        the_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(the_Table);
    }

    private void them_btnMouseClicked(MouseEvent evt) {
        System.out.println("Thêm");
        (new ThemTheForm()).setVisible(true);
    }

    private void nhapexcel_btnMouseClicked(MouseEvent evt) {
        System.out.println("Nhập Excel");
        ArrayList<QLTheDTO> sach = (new ImportFile()).readFileExcel_QLThe();
        boolean finish = true;
        Iterator var4 = sach.iterator();

        while(var4.hasNext()) {
            QLTheDTO e = (QLTheDTO)var4.next();
            if (!theBUS.add(e)) {
                finish = false;
                (new AlertGUI(2, "Error", "Lỗi Nhập", "Quay Lại")).setVisible(true);
                break;
            }
        }

        if (finish) {
            (new AlertGUI(3, "Success", "Nhập Thẻ Thành Công!!!", "Quay Lại")).setVisible(true);
        }

    }

    private void xuatexcel_btnMouseClicked(MouseEvent evt) {
        System.out.println("Xuất Excel");
        (new ExportFile()).writeFileExcel_QLThe();
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
        ArrayList<QLTheDTO> the = (new QLTheBUS(0)).getArrThe();
        ArrayList<QLTheDTO> search_res = new ArrayList();
        new ArrayList();

        ArrayList pkey_1;
        ArrayList pKey_2;
        for(Iterator var7 = columns_checked.iterator(); var7.hasNext(); search_res = (new QLTheBUS(0)).getThe_full((new DataProcessing()).union_arr(pkey_1, pKey_2))) {
            String e = (String)var7.next();
            ArrayList<QLTheDTO> search_temp = (new QLTheBUS(0)).search(e, search_str);
            pkey_1 = new ArrayList();
            pKey_2 = new ArrayList();
            Iterator var11 = search_res.iterator();

            QLTheDTO ele;
            while(var11.hasNext()) {
                ele = (QLTheDTO)var11.next();
                pkey_1.add(ele.getMaThe());
            }

            var11 = search_temp.iterator();

            while(var11.hasNext()) {
                ele = (QLTheDTO)var11.next();
                pKey_2.add(ele.getMaThe());
            }
        }

        the = search_res;
        jPanel1.remove(the_Table);
        jPanel1.repaint();
        jPanel1.revalidate();
        the_Table = (new QLTheTable()).getTable(the);
        the_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(the_Table);
    }

    public void paintTable(ArrayList<QLTheDTO> the) {
        jPanel1.remove(the_Table);
        jPanel1.repaint();
        jPanel1.revalidate();
        the_Table = (new QLTheTable()).getTable(the);
        the_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(the_Table);
    }

    private void expand_btnMouseClicked(MouseEvent evt) {
        (new QLTheTable()).expandMode();
    }

    private void refresh_btnMouseClicked(MouseEvent evt) {
        jPanel1.remove(the_Table);
        jPanel1.repaint();
        jPanel1.revalidate();
        the_Table = (new QLTheTable()).getTable();
        the_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(the_Table);
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
