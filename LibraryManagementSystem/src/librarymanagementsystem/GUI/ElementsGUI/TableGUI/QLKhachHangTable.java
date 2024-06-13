//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package librarymanagementsystem.GUI.ElementsGUI.TableGUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import librarymanagementsystem.BUS.QLKhachHangBUS;
import librarymanagementsystem.DTO.QLKhachHangDTO;

public class QLKhachHangTable {
    public QLKhachHangTable() {
    }

    private static JFrame createFrame() {
        JFrame frame = new JFrame("Testing");
        frame.setDefaultCloseOperation(3);
        frame.setSize(new Dimension(700, 500));
        return frame;
    }

    private static ObjectTableModel<QLKhachHangDTO> createObjectDataModel() {
        return new ObjectTableModel<QLKhachHangDTO>() {
            public Object getValueAt(QLKhachHangDTO khachHang, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return khachHang.getMaKhachHang();
                    case 1:
                        return khachHang.getHoTen();
                    case 2:
                        return khachHang.getNgaySinh();
                    case 3:
                        return khachHang.getDiaChi();
                    case 4:
                        return khachHang.getSdt();
                    case 5:
                        return khachHang.getEmail();
                    default:
                        return null;
                }
            }

            public int getColumnCount() {
                return 6;
            }

            public String getColumnName(int column) {
                switch (column) {
                    case 0:
                        return "Mã Khách Hàng";
                    case 1:
                        return "Họ Tên";
                    case 2:
                        return "Ngày Sinh";
                    case 3:
                        return "Địa Chỉ";
                    case 4:
                        return "Số Điện Thoại";
                    case 5:
                        return "Email";
                    default:
                        return null;
                }
            }
        };
    }

    private static PaginationDataProvider<QLKhachHangDTO> createDataProvider(ObjectTableModel<QLKhachHangDTO> objectDataModel) {
        List<QLKhachHangDTO> list = (new QLKhachHangBUS()).getArrKhachHang();
        return new InMemoryPaginationDataProvider(list, objectDataModel);
    }

    private static PaginationDataProvider<QLKhachHangDTO> createDataProvider(ObjectTableModel<QLKhachHangDTO> objectDataModel, ArrayList<QLKhachHangDTO> khachhang) {
        List<QLKhachHangDTO> list = khachhang;
        return new InMemoryPaginationDataProvider(list, objectDataModel);
    }

    public JPanel getTable() {
        ObjectTableModel<QLKhachHangDTO> objectDataModel = createObjectDataModel();
        JTable table = new JTable(objectDataModel);
        table.setRowHeight(35);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(0);
        table.setFont(new Font("verdana", 0, 13));
        table.getTableHeader().setBackground(new Color(91, 243, 207));
        table.getTableHeader().setPreferredSize(new Dimension(0, 35));
        table.getTableHeader().setFont(new Font("verdana", 1, 14));
        table.getTableHeader().setForeground(Color.WHITE);
        ArrayList<Integer> width = new ArrayList();
        width.add(160);
        width.add(220);
        width.add(170);
        width.add(380);
        width.add(220);
        width.add(220);
        table.setAutoCreateRowSorter(true);
        PaginationDataProvider<QLKhachHangDTO> dataProvider = createDataProvider(objectDataModel);
        PaginatedTableDecorator<QLKhachHangDTO> paginatedDecorator = PaginatedTableDecorator.decorate(table, dataProvider, new int[]{5, 10, 20, 50, 75, 100}, 10, width);
        paginatedDecorator.getClickEvent_KhachHang();
        JPanel p = paginatedDecorator.getContentPanel();
        return p;
    }

    public JPanel getTable(ArrayList<QLKhachHangDTO> khachhang) {
        ObjectTableModel<QLKhachHangDTO> objectDataModel = createObjectDataModel();
        JTable table = new JTable(objectDataModel);
        table.setRowHeight(35);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(0);
        table.setFont(new Font("verdana", 0, 13));
        table.getTableHeader().setBackground(new Color(91, 243, 207));
        table.getTableHeader().setPreferredSize(new Dimension(0, 35));
        table.getTableHeader().setFont(new Font("verdana", 1, 14));
        table.getTableHeader().setForeground(Color.WHITE);
        ArrayList<Integer> width = new ArrayList();
        width.add(160);
        width.add(220);
        width.add(170);
        width.add(380);
        width.add(220);
        width.add(220);
        table.setAutoCreateRowSorter(true);
        PaginationDataProvider<QLKhachHangDTO> dataProvider = createDataProvider(objectDataModel, khachhang);
        PaginatedTableDecorator<QLKhachHangDTO> paginatedDecorator = PaginatedTableDecorator.decorate(table, dataProvider, new int[]{5, 10, 20, 50, 75, 100}, 10, width);
        paginatedDecorator.getClickEvent_KhachHang();
        JPanel p = paginatedDecorator.getContentPanel();
        return p;
    }

    public void expandMode() {
        final JFrame frame = createFrame();
        JPanel p = (new QLKhachHangTable()).getTable();
        p.setSize(1200, 780);
        p.setBackground(new Color(255, 255, 255));
        frame.add(p);
        frame.setBackground(new Color(255, 255, 255));
        frame.setSize(1200, 740);
        frame.setLocationRelativeTo((Component)null);
        frame.setDefaultCloseOperation(0);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("asdjhgsakdjhaskjdhsajik");
                frame.dispose();
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = createFrame();
        JPanel p = (new QLKhachHangTable()).getTable();
        p.setSize(700, 500);
        p.setBackground(new Color(255, 255, 255));
        frame.add(p);
        frame.setBackground(new Color(255, 255, 255));
        frame.setLocationRelativeTo((Component)null);
        frame.setVisible(true);
    }
}
