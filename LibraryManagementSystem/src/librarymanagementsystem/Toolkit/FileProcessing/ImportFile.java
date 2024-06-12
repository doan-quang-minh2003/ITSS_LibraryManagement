//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package librarymanagementsystem.Toolkit.FileProcessing;

import java.awt.Component;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import librarymanagementsystem.DTO.QLAdminDTO;
import librarymanagementsystem.DTO.QLChiTietSachDTO;
import librarymanagementsystem.DTO.QLKhachHangDTO;
import librarymanagementsystem.DTO.QLKhoSachDTO;
import librarymanagementsystem.DTO.QLLoaiSachDTO;
import librarymanagementsystem.DTO.QLNhaCungCapDTO;
import librarymanagementsystem.DTO.QLNhanVienDTO;
import librarymanagementsystem.DTO.QLPhieuMuonDTO;
import librarymanagementsystem.DTO.QLPhieuNhapDTO;
import librarymanagementsystem.DTO.QLPhieuXuatDTO;
import librarymanagementsystem.DTO.QLTheDTO;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ImportFile {
    FileDialog fx = new FileDialog(new JFrame(), "Đọc file Excel", 0);

    public ImportFile() {
    }

    private String getFile() {
        this.fx.setFile("*.xls");
        this.fx.setVisible(true);
        String var10000 = this.fx.getDirectory();
        String url = var10000 + this.fx.getFile();
        return url.equals("nullnull") ? null : url;
    }

    public ArrayList<QLLoaiSachDTO> readFileExcel_QLSach() {
        String url = this.getFile();
        if (url == null) {
            System.out.println("Lỗi Read File Excel");
        }

        FileInputStream inputFile = null;

        HSSFSheet sheet;
        try {
            inputFile = new FileInputStream(new File(url));
            HSSFWorkbook workbook = new HSSFWorkbook(inputFile);
            sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            Row rowfirst = (Row)rowIterator.next();
            ArrayList<QLLoaiSachDTO> arrSach = new ArrayList();

            label100:
            while(true) {
                if (rowIterator.hasNext()) {
                    Row row = (Row)rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();

                    while(true) {
                        if (!cellIterator.hasNext()) {
                            continue label100;
                        }

                        String maSach = ((Cell)cellIterator.next()).getStringCellValue();
                        String tenSach = ((Cell)cellIterator.next()).getStringCellValue();
                        String tenTacGia = ((Cell)cellIterator.next()).getStringCellValue();
                        String tenNXB = ((Cell)cellIterator.next()).getStringCellValue();
                        int namXB = (int)((Cell)cellIterator.next()).getNumericCellValue();
                        String theLoai = ((Cell)cellIterator.next()).getStringCellValue();
                        String ngonNgu = ((Cell)cellIterator.next()).getStringCellValue();
                        String tomTatNoiDung = ((Cell)cellIterator.next()).getStringCellValue();
                        int giaTien = (int)((Cell)cellIterator.next()).getNumericCellValue();
                        int soTrang = (int)((Cell)cellIterator.next()).getNumericCellValue();
                        String hinh = ((Cell)cellIterator.next()).getStringCellValue();
                        arrSach.add(new QLLoaiSachDTO(maSach, tenSach, tenTacGia, tenNXB, theLoai, ngonNgu, tomTatNoiDung, namXB, giaTien, soTrang, hinh));
                    }
                }

                ArrayList var8 = arrSach;
                return var8;
            }
        } catch (Exception var29) {
            Exception ex = var29;
            JOptionPane.showMessageDialog((Component)null, "Lỗi khi nhập dữ liệu từ file: " + ex.getMessage());
            sheet = null;
        } finally {
            try {
                if (inputFile != null) {
                    inputFile.close();
                }
            } catch (IOException var28) {
                IOException ex = var28;
                JOptionPane.showMessageDialog((Component)null, "Lỗi khi đóng file: " + ex.getMessage());
            }

        }

        return sheet;
    }

    public ArrayList<QLTheDTO> readFileExcel_QLThe() {
        String url = this.getFile();
        if (url == null) {
            System.out.println("Lỗi Read File Excel");
        }

        FileInputStream inputFile = null;

        HSSFSheet sheet;
        try {
            inputFile = new FileInputStream(new File(url));
            HSSFWorkbook workbook = new HSSFWorkbook(inputFile);
            sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            Row rowfirst = (Row)rowIterator.next();
            ArrayList<QLTheDTO> arrThe = new ArrayList();

            label100:
            while(true) {
                if (rowIterator.hasNext()) {
                    Row row = (Row)rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();

                    while(true) {
                        if (!cellIterator.hasNext()) {
                            continue label100;
                        }

                        String maThe = ((Cell)cellIterator.next()).getStringCellValue();
                        String maKhachHang = ((Cell)cellIterator.next()).getStringCellValue();
                        String ngayCap = ((Cell)cellIterator.next()).getStringCellValue();
                        String ngayHetHan = ((Cell)cellIterator.next()).getStringCellValue();
                        arrThe.add(new QLTheDTO(maThe, maKhachHang, ngayCap, ngayHetHan));
                    }
                }

                ArrayList var8 = arrThe;
                return var8;
            }
        } catch (Exception var22) {
            Exception ex = var22;
            JOptionPane.showMessageDialog((Component)null, "Lỗi khi nhập dữ liệu từ file: " + ex.getMessage());
            sheet = null;
        } finally {
            try {
                if (inputFile != null) {
                    inputFile.close();
                }
            } catch (IOException var21) {
                IOException ex = var21;
                JOptionPane.showMessageDialog((Component)null, "Lỗi khi đóng file: " + ex.getMessage());
            }

        }

        return sheet;
    }

    public ArrayList<QLNhanVienDTO> readFileExcel_QLNhanVien() {
        String url = this.getFile();
        if (url == null) {
            System.out.println("Lỗi Read File Excel");
        }

        FileInputStream inputFile = null;

        HSSFSheet sheet;
        try {
            inputFile = new FileInputStream(new File(url));
            HSSFWorkbook workbook = new HSSFWorkbook(inputFile);
            sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            ArrayList<QLNhanVienDTO> arrNhanVien = new ArrayList();

            label100:
            while(true) {
                if (rowIterator.hasNext()) {
                    Row row = (Row)rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();

                    while(true) {
                        if (!cellIterator.hasNext()) {
                            continue label100;
                        }

                        String maNhanVien = ((Cell)cellIterator.next()).getStringCellValue();
                        String password = ((Cell)cellIterator.next()).getStringCellValue();
                        String hoTen = ((Cell)cellIterator.next()).getStringCellValue();
                        String ngaySinh = ((Cell)cellIterator.next()).getStringCellValue();
                        String diaChi = ((Cell)cellIterator.next()).getStringCellValue();
                        String email = ((Cell)cellIterator.next()).getStringCellValue();
                        String chucVu = ((Cell)cellIterator.next()).getStringCellValue();
                        String sdt = ((Cell)cellIterator.next()).getStringCellValue();
                        arrNhanVien.add(new QLNhanVienDTO(maNhanVien, password, hoTen, ngaySinh, diaChi, email, chucVu, sdt));
                    }
                }

                ArrayList var7 = arrNhanVien;
                return var7;
            }
        } catch (Exception var25) {
            Exception ex = var25;
            JOptionPane.showMessageDialog((Component)null, "Lỗi khi nhập dữ liệu từ file: " + ex.getMessage());
            sheet = null;
        } finally {
            try {
                if (inputFile != null) {
                    inputFile.close();
                }
            } catch (IOException var24) {
                IOException ex = var24;
                JOptionPane.showMessageDialog((Component)null, "Lỗi khi đóng file: " + ex.getMessage());
            }

        }

        return sheet;
    }

    public ArrayList<QLKhachHangDTO> readFileExcel_QLKhachHang() {
        String url = this.getFile();
        if (url == null) {
            System.out.println("Lỗi Read File Excel");
        }

        FileInputStream inputFile = null;

        HSSFSheet sheet;
        try {
            inputFile = new FileInputStream(new File(url));
            HSSFWorkbook workbook = new HSSFWorkbook(inputFile);
            sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            ArrayList<QLKhachHangDTO> arrKhachHang = new ArrayList();

            label100:
            while(true) {
                if (rowIterator.hasNext()) {
                    Row row = (Row)rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();

                    while(true) {
                        if (!cellIterator.hasNext()) {
                            continue label100;
                        }

                        String maKhachHang = ((Cell)cellIterator.next()).getStringCellValue();
                        String hoTen = ((Cell)cellIterator.next()).getStringCellValue();
                        String ngaySinh = ((Cell)cellIterator.next()).getStringCellValue();
                        String diaChi = ((Cell)cellIterator.next()).getStringCellValue();
                        String email = ((Cell)cellIterator.next()).getStringCellValue();
                        String sdt = ((Cell)cellIterator.next()).getStringCellValue();
                        arrKhachHang.add(new QLKhachHangDTO(maKhachHang, hoTen, ngaySinh, diaChi, email, sdt));
                    }
                }

                ArrayList var7 = arrKhachHang;
                return var7;
            }
        } catch (Exception var23) {
            Exception ex = var23;
            JOptionPane.showMessageDialog((Component)null, "Lỗi khi nhập dữ liệu từ file: " + ex.getMessage());
            sheet = null;
        } finally {
            try {
                if (inputFile != null) {
                    inputFile.close();
                }
            } catch (IOException var22) {
                IOException ex = var22;
                JOptionPane.showMessageDialog((Component)null, "Lỗi khi đóng file: " + ex.getMessage());
            }

        }

        return sheet;
    }

    public ArrayList<QLNhaCungCapDTO> readFileExcel_QLNhaCungCap() {
        String url = this.getFile();
        if (url == null) {
            System.out.println("Lỗi Read File Excel");
        }

        FileInputStream inputFile = null;

        HSSFSheet sheet;
        try {
            inputFile = new FileInputStream(new File(url));
            HSSFWorkbook workbook = new HSSFWorkbook(inputFile);
            sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            ArrayList<QLNhaCungCapDTO> arrNhaCungCap = new ArrayList();

            label100:
            while(true) {
                if (rowIterator.hasNext()) {
                    Row row = (Row)rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();

                    while(true) {
                        if (!cellIterator.hasNext()) {
                            continue label100;
                        }

                        String maNCC = ((Cell)cellIterator.next()).getStringCellValue();
                        String tenNCC = ((Cell)cellIterator.next()).getStringCellValue();
                        String sdt = ((Cell)cellIterator.next()).getStringCellValue();
                        String email = ((Cell)cellIterator.next()).getStringCellValue();
                        String diaChi = ((Cell)cellIterator.next()).getStringCellValue();
                        arrNhaCungCap.add(new QLNhaCungCapDTO(maNCC, tenNCC, sdt, email, diaChi));
                    }
                }

                ArrayList var7 = arrNhaCungCap;
                return var7;
            }
        } catch (Exception var22) {
            Exception ex = var22;
            JOptionPane.showMessageDialog((Component)null, "Lỗi khi nhập dữ liệu từ file: " + ex.getMessage());
            sheet = null;
        } finally {
            try {
                if (inputFile != null) {
                    inputFile.close();
                }
            } catch (IOException var21) {
                IOException ex = var21;
                JOptionPane.showMessageDialog((Component)null, "Lỗi khi đóng file: " + ex.getMessage());
            }

        }

        return sheet;
    }

    public ArrayList<QLPhieuMuonDTO> readFileExcel_QLPhieuMuon() {
        String url = this.getFile();
        if (url == null) {
            System.out.println("Lỗi Read File Excel");
        }

        FileInputStream inputFile = null;

        HSSFSheet sheet;
        try {
            inputFile = new FileInputStream(new File(url));
            HSSFWorkbook workbook = new HSSFWorkbook(inputFile);
            sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            ArrayList<QLPhieuMuonDTO> arrPhieuMuon = new ArrayList();

            label100:
            while(true) {
                if (rowIterator.hasNext()) {
                    Row row = (Row)rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();

                    while(true) {
                        if (!cellIterator.hasNext()) {
                            continue label100;
                        }

                        String maMuonSach = ((Cell)cellIterator.next()).getStringCellValue();
                        String maThe = ((Cell)cellIterator.next()).getStringCellValue();
                        String ngayMuon = ((Cell)cellIterator.next()).getStringCellValue();
                        int thoiGianMuon = (int)((Cell)cellIterator.next()).getNumericCellValue();
                        String var13 = ((Cell)cellIterator.next()).getStringCellValue();
                    }
                }

                ArrayList var7 = arrPhieuMuon;
                return var7;
            }
        } catch (Exception var22) {
            Exception ex = var22;
            JOptionPane.showMessageDialog((Component)null, "Lỗi khi nhập dữ liệu từ file: " + ex.getMessage());
            sheet = null;
        } finally {
            try {
                if (inputFile != null) {
                    inputFile.close();
                }
            } catch (IOException var21) {
                IOException ex = var21;
                JOptionPane.showMessageDialog((Component)null, "Lỗi khi đóng file: " + ex.getMessage());
            }

        }

        return sheet;
    }

    public ArrayList<QLKhoSachDTO> readFileExcel_QLKhoSach() {
        String url = this.getFile();
        if (url == null) {
            System.out.println("Lỗi Read File Excel");
        }

        FileInputStream inputFile = null;

        HSSFSheet sheet;
        try {
            inputFile = new FileInputStream(new File(url));
            HSSFWorkbook workbook = new HSSFWorkbook(inputFile);
            sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            ArrayList<QLKhoSachDTO> arrKhoSach = new ArrayList();

            label100:
            while(true) {
                if (rowIterator.hasNext()) {
                    Row row = (Row)rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();

                    while(true) {
                        if (!cellIterator.hasNext()) {
                            continue label100;
                        }

                        String maSach = ((Cell)cellIterator.next()).getStringCellValue();
                        int soLuong = (int)((Cell)cellIterator.next()).getNumericCellValue();
                        arrKhoSach.add(new QLKhoSachDTO(maSach, soLuong));
                    }
                }

                ArrayList var7 = arrKhoSach;
                return var7;
            }
        } catch (Exception var19) {
            Exception ex = var19;
            JOptionPane.showMessageDialog((Component)null, "Lỗi khi nhập dữ liệu từ file: " + ex.getMessage());
            sheet = null;
        } finally {
            try {
                if (inputFile != null) {
                    inputFile.close();
                }
            } catch (IOException var18) {
                IOException ex = var18;
                JOptionPane.showMessageDialog((Component)null, "Lỗi khi đóng file: " + ex.getMessage());
            }

        }

        return sheet;
    }

    public ArrayList<QLChiTietSachDTO> readFileExcel_QLChiTietSach() {
        String url = this.getFile();
        if (url == null) {
            System.out.println("Lỗi Read File Excel");
        }

        FileInputStream inputFile = null;

        HSSFSheet sheet;
        try {
            inputFile = new FileInputStream(new File(url));
            HSSFWorkbook workbook = new HSSFWorkbook(inputFile);
            sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            ArrayList<QLChiTietSachDTO> arrChiTietSach = new ArrayList();

            label100:
            while(true) {
                if (rowIterator.hasNext()) {
                    Row row = (Row)rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();

                    while(true) {
                        if (!cellIterator.hasNext()) {
                            continue label100;
                        }

                        String IDSach = ((Cell)cellIterator.next()).getStringCellValue();
                        String maSach = ((Cell)cellIterator.next()).getStringCellValue();
                        String tinhTrang = ((Cell)cellIterator.next()).getStringCellValue();
                        arrChiTietSach.add(new QLChiTietSachDTO(IDSach, maSach, tinhTrang));
                    }
                }

                ArrayList var7 = arrChiTietSach;
                return var7;
            }
        } catch (Exception var20) {
            Exception ex = var20;
            JOptionPane.showMessageDialog((Component)null, "Lỗi khi nhập dữ liệu từ file: " + ex.getMessage());
            sheet = null;
        } finally {
            try {
                if (inputFile != null) {
                    inputFile.close();
                }
            } catch (IOException var19) {
                IOException ex = var19;
                JOptionPane.showMessageDialog((Component)null, "Lỗi khi đóng file: " + ex.getMessage());
            }

        }

        return sheet;
    }

    public ArrayList<QLAdminDTO> readFileExcel_QLAdmin() {
        String url = this.getFile();
        if (url == null) {
            System.out.println("Lỗi Read File Excel");
        }

        FileInputStream inputFile = null;

        HSSFSheet sheet;
        try {
            inputFile = new FileInputStream(new File(url));
            HSSFWorkbook workbook = new HSSFWorkbook(inputFile);
            sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            ArrayList<QLAdminDTO> arrAdmin = new ArrayList();

            label100:
            while(true) {
                if (rowIterator.hasNext()) {
                    Row row = (Row)rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();

                    while(true) {
                        if (!cellIterator.hasNext()) {
                            continue label100;
                        }

                        String tkAdmin = ((Cell)cellIterator.next()).getStringCellValue();
                        String password = ((Cell)cellIterator.next()).getStringCellValue();
                        arrAdmin.add(new QLAdminDTO(tkAdmin, password));
                    }
                }

                ArrayList var7 = arrAdmin;
                return var7;
            }
        } catch (Exception var19) {
            Exception ex = var19;
            JOptionPane.showMessageDialog((Component)null, "Lỗi khi nhập dữ liệu từ file: " + ex.getMessage());
            sheet = null;
        } finally {
            try {
                if (inputFile != null) {
                    inputFile.close();
                }
            } catch (IOException var18) {
                IOException ex = var18;
                JOptionPane.showMessageDialog((Component)null, "Lỗi khi đóng file: " + ex.getMessage());
            }

        }

        return sheet;
    }

    public ArrayList<QLPhieuXuatDTO> readFileExcel_QLXuatKhoSach() {
        String url = this.getFile();
        if (url == null) {
            System.out.println("Lỗi Read File Excel");
        }

        FileInputStream inputFile = null;

        HSSFSheet sheet;
        try {
            inputFile = new FileInputStream(new File(url));
            HSSFWorkbook workbook = new HSSFWorkbook(inputFile);
            sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            ArrayList<QLPhieuXuatDTO> arrXuatKhoSach = new ArrayList();

            while(rowIterator.hasNext()) {
                Row row = (Row)rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();

                while(cellIterator.hasNext()) {
                    String maXuat = ((Cell)cellIterator.next()).getStringCellValue();
                    String ngayXuat = ((Cell)cellIterator.next()).getStringCellValue();
                    ArrayList<String> maSach = new ArrayList();
                    ArrayList<Integer> soLuong = new ArrayList();
                    ArrayList<String> maSachTemp = new ArrayList();
                    ArrayList<Integer> soLuongTemp = new ArrayList();
                    HashMap<String, Integer> hmVT_Str = new HashMap();
                    HashMap<Integer, Integer> hmVT_Int = new HashMap();
                    HashMap<ArrayList<String>, String> hmStr = new HashMap();
                    HashMap<ArrayList<Integer>, Integer> hmInt = new HashMap();

                    int i;
                    for(i = 0; i < maSachTemp.size(); ++i) {
                        hmVT_Str.put((String)maSachTemp.get(i), 1);
                    }

                    Iterator var35 = hmStr.keySet().iterator();

                    ArrayList e;
                    int i;
                    while(var35.hasNext()) {
                        e = (ArrayList)var35.next();
                        maSachTemp = e;

                        for(i = 0; i < maSachTemp.size() && ((String)maSachTemp.get(i)).equals(e); ++i) {
                            String _maSach = ((Cell)cellIterator.next()).getStringCellValue();
                            hmStr.put(maSachTemp, _maSach);
                            maSach.add((String)hmStr.get(maSachTemp));
                        }
                    }

                    for(i = 0; i < soLuongTemp.size(); ++i) {
                        hmVT_Int.put((Integer)soLuongTemp.get(i), 1);
                    }

                    var35 = hmInt.keySet().iterator();

                    while(var35.hasNext()) {
                        e = (ArrayList)var35.next();
                        soLuongTemp = e;

                        for(i = 0; i < soLuongTemp.size() && ((Integer)soLuongTemp.get(i)).equals(e); ++i) {
                            int _soLuong = (int)((Cell)cellIterator.next()).getNumericCellValue();
                            hmInt.put(soLuongTemp, _soLuong);
                            soLuong.add((Integer)hmInt.get(soLuongTemp));
                        }
                    }

                    arrXuatKhoSach.add(new QLPhieuXuatDTO(maXuat, ngayXuat, maSach, soLuong));
                }
            }

            ArrayList var34 = arrXuatKhoSach;
            return var34;
        } catch (Exception var31) {
            Exception ex = var31;
            JOptionPane.showMessageDialog((Component)null, "Lỗi khi nhập dữ liệu từ file: " + ex.getMessage());
            sheet = null;
        } finally {
            try {
                if (inputFile != null) {
                    inputFile.close();
                }
            } catch (IOException var30) {
                IOException ex = var30;
                JOptionPane.showMessageDialog((Component)null, "Lỗi khi đóng file: " + ex.getMessage());
            }

        }

        return sheet;
    }

    public ArrayList<QLPhieuNhapDTO> readFileExcel_QLNhapKhoSach() {
        String url = this.getFile();
        if (url == null) {
            System.out.println("Lỗi Read File Excel");
        }

        FileInputStream inputFile = null;

        HSSFSheet sheet;
        try {
            inputFile = new FileInputStream(new File(url));
            HSSFWorkbook workbook = new HSSFWorkbook(inputFile);
            sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            ArrayList<QLPhieuNhapDTO> arrNhapKhoSach = new ArrayList();

            while(rowIterator.hasNext()) {
                Row row = (Row)rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();

                while(cellIterator.hasNext()) {
                    String maNhap = ((Cell)cellIterator.next()).getStringCellValue();
                    String ngayNhap = ((Cell)cellIterator.next()).getStringCellValue();
                    ArrayList<String> maSach = new ArrayList();
                    ArrayList<Integer> soLuong = new ArrayList();
                    ArrayList<String> maSachTemp = new ArrayList();
                    ArrayList<Integer> soLuongTemp = new ArrayList();
                    HashMap<String, Integer> hmVT_Str = new HashMap();
                    HashMap<Integer, Integer> hmVT_Int = new HashMap();
                    HashMap<ArrayList<String>, String> hmStr = new HashMap();
                    HashMap<ArrayList<Integer>, Integer> hmInt = new HashMap();

                    int i;
                    for(i = 0; i < maSachTemp.size(); ++i) {
                        hmVT_Str.put((String)maSachTemp.get(i), 1);
                    }

                    Iterator var35 = hmStr.keySet().iterator();

                    ArrayList e;
                    int i;
                    while(var35.hasNext()) {
                        e = (ArrayList)var35.next();
                        maSachTemp = e;

                        for(i = 0; i < maSachTemp.size() && ((String)maSachTemp.get(i)).equals(e); ++i) {
                            String _maSach = ((Cell)cellIterator.next()).getStringCellValue();
                            hmStr.put(maSachTemp, _maSach);
                            maSach.add((String)hmStr.get(maSachTemp));
                        }
                    }

                    for(i = 0; i < soLuongTemp.size(); ++i) {
                        hmVT_Int.put((Integer)soLuongTemp.get(i), 1);
                    }

                    var35 = hmInt.keySet().iterator();

                    while(var35.hasNext()) {
                        e = (ArrayList)var35.next();
                        soLuongTemp = e;

                        for(i = 0; i < soLuongTemp.size() && ((Integer)soLuongTemp.get(i)).equals(e); ++i) {
                            int _soLuong = (int)((Cell)cellIterator.next()).getNumericCellValue();
                            hmInt.put(soLuongTemp, _soLuong);
                            soLuong.add((Integer)hmInt.get(soLuongTemp));
                        }
                    }

                    arrNhapKhoSach.add(new QLPhieuNhapDTO(maNhap, ngayNhap, maSach, soLuong));
                }
            }

            ArrayList var34 = arrNhapKhoSach;
            return var34;
        } catch (Exception var31) {
            Exception ex = var31;
            JOptionPane.showMessageDialog((Component)null, "Lỗi khi nhập dữ liệu từ file: " + ex.getMessage());
            sheet = null;
        } finally {
            try {
                if (inputFile != null) {
                    inputFile.close();
                }
            } catch (IOException var30) {
                IOException ex = var30;
                JOptionPane.showMessageDialog((Component)null, "Lỗi khi đóng file: " + ex.getMessage());
            }

        }

        return sheet;
    }

    public static void main(String[] args) {
        (new ImportFile()).readFileExcel_QLSach();
    }
}
