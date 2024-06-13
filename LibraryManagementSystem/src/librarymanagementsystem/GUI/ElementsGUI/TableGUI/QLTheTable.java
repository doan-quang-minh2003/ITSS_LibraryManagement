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
import librarymanagementsystem.BUS.QLTheBUS;
import librarymanagementsystem.DTO.QLTheDTO;

public class QLTheTable {
    public QLTheTable() {
    }

    private static JFrame createFrame() {
        JFrame frame = new JFrame("Testing");
        frame.setDefaultCloseOperation(3);
        frame.setSize(new Dimension(700, 500));
        return frame;
    }

    private static ObjectTableModel<QLTheDTO> createObjectDataModel() {
        return new ObjectTableModel<QLTheDTO>() {
            public Object getValueAt(QLTheDTO the, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return the.getMaThe();
                    case 1:
                        return the.getMaKhachHang();
                    case 2:
                        return the.getNgayCap();
                    case 3:
                        return the.getNgayHetHan();
                    default:
                        return null;
                }
            }

            public int getColumnCount() {
                return 4;
            }

            public String getColumnName(int column) {
                switch (column) {
                    case 0:
                        return "Mã Thẻ";
                    case 1:
                        return "Mã Khách Hàng";
                    case 2:
                        return "Ngày Cấp";
                    case 3:
                        return "Ngày Hết Hạn";
                    default:
                        return null;
                }
            }
        };
    }

    private static PaginationDataProvider<QLTheDTO> createDataProvider(ObjectTableModel<QLTheDTO> objectDataModel) {
        List<QLTheDTO> list = (new QLTheBUS()).getArrThe();
        return new InMemoryPaginationDataProvider(list, objectDataModel);
    }

    private static PaginationDataProvider<QLTheDTO> createDataProvider(ObjectTableModel<QLTheDTO> objectDataModel, ArrayList<QLTheDTO> the) {
        List<QLTheDTO> list = the;
        return new InMemoryPaginationDataProvider(list, objectDataModel);
    }

    public JPanel getTable() {
        ObjectTableModel<QLTheDTO> objectDataModel = createObjectDataModel();
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
        width.add(200);
        width.add(250);
        width.add(200);
        width.add(200);
        table.setAutoCreateRowSorter(true);
        PaginationDataProvider<QLTheDTO> dataProvider = createDataProvider(objectDataModel);
        PaginatedTableDecorator<QLTheDTO> paginatedDecorator = PaginatedTableDecorator.decorate(table, dataProvider, new int[]{5, 10, 20, 50, 75, 100}, 10, width);
        paginatedDecorator.getClickEvent_The();
        JPanel p = paginatedDecorator.getContentPanel();
        return p;
    }

    public JPanel getTable(ArrayList<QLTheDTO> the) {
        ObjectTableModel<QLTheDTO> objectDataModel = createObjectDataModel();
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
        width.add(200);
        width.add(250);
        width.add(200);
        width.add(200);
        table.setAutoCreateRowSorter(true);
        PaginationDataProvider<QLTheDTO> dataProvider = createDataProvider(objectDataModel, the);
        PaginatedTableDecorator<QLTheDTO> paginatedDecorator = PaginatedTableDecorator.decorate(table, dataProvider, new int[]{5, 10, 20, 50, 75, 100}, 10, width);
        paginatedDecorator.getClickEvent_The();
        JPanel p = paginatedDecorator.getContentPanel();
        return p;
    }

    public void expandMode() {
        final JFrame frame = createFrame();
        JPanel p = (new QLTheTable()).getTable();
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
        JPanel p = (new QLTheTable()).getTable();
        p.setSize(700, 500);
        p.setBackground(new Color(255, 255, 255));
        frame.add(p);
        frame.setBackground(new Color(255, 255, 255));
        frame.setLocationRelativeTo((Component)null);
        frame.setVisible(true);
    }
}
