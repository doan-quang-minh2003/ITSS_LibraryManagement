//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package librarymanagementsystem.Toolkit.FileProcessing;

import java.awt.Component;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import librarymanagementsystem.BUS.QLAdminBUS;
import librarymanagementsystem.BUS.QLChiTietSachBUS;
import librarymanagementsystem.BUS.QLKhachHangBUS;
import librarymanagementsystem.BUS.QLKhoSachBUS;
import librarymanagementsystem.BUS.QLLDPhatBUS;
import librarymanagementsystem.BUS.QLLoaiSachBUS;
import librarymanagementsystem.BUS.QLNhaCungCapBUS;
import librarymanagementsystem.BUS.QLNhanVienBUS;
import librarymanagementsystem.BUS.QLPhieuMuonBUS;
import librarymanagementsystem.BUS.QLPhieuNhapBUS;
import librarymanagementsystem.BUS.QLPhieuPhatBUS;
import librarymanagementsystem.BUS.QLPhieuXuatBUS;
import librarymanagementsystem.BUS.QLTheBUS;
import librarymanagementsystem.DTO.QLAdminDTO;
import librarymanagementsystem.DTO.QLChiTietSachDTO;
import librarymanagementsystem.DTO.QLKhachHangDTO;
import librarymanagementsystem.DTO.QLKhoSachDTO;
import librarymanagementsystem.DTO.QLLDPhatDTO;
import librarymanagementsystem.DTO.QLLoaiSachDTO;
import librarymanagementsystem.DTO.QLNhaCungCapDTO;
import librarymanagementsystem.DTO.QLNhanVienDTO;
import librarymanagementsystem.DTO.QLPhieuMuonDTO;
import librarymanagementsystem.DTO.QLPhieuNhapDTO;
import librarymanagementsystem.DTO.QLPhieuPhatDTO;
import librarymanagementsystem.DTO.QLPhieuXuatDTO;
import librarymanagementsystem.DTO.QLTheDTO;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

public class ExportFile {
    FileDialog fx = new FileDialog(new JFrame(), "Đọc file Excel", 1);

    public ExportFile() {
    }

    public String WriteFile() {
        this.fx.setFilenameFilter(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".xls");
            }
        });
        this.fx.setFile("untitled.xls");
        this.fx.setVisible(true);
        String var10000 = this.fx.getDirectory();
        String url = var10000 + this.fx.getFile();
        return url.equals("nullnull") ? null : url;
    }

    public void writeFileExcel_QLLoaiSach() {
        this.fx.setTitle("Xuất dữ liệu Loại Sách -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Loại Sách");
                QLLoaiSachBUS qlnccBUS = new QLLoaiSachBUS();
                ArrayList<QLLoaiSachDTO> list = qlnccBUS.getArrSach();
                int rownum = 0;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Mã Sách");
                row.createCell(1, CellType.STRING).setCellValue("Tên Sách");
                row.createCell(2, CellType.STRING).setCellValue("Tên Tác Giả");
                row.createCell(3, CellType.STRING).setCellValue("Tên NXB");
                row.createCell(4, CellType.STRING).setCellValue("Năm XB");
                row.createCell(5, CellType.STRING).setCellValue("Thể Loại");
                row.createCell(6, CellType.STRING).setCellValue("Ngôn Ngữ");
                row.createCell(7, CellType.STRING).setCellValue("Tóm Tắt Nội Dung");
                row.createCell(8, CellType.NUMERIC).setCellValue("Giá Tiền");
                row.createCell(9, CellType.NUMERIC).setCellValue("Số Trang");
                row.createCell(10, CellType.STRING).setCellValue("Hình Sách");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLLoaiSachDTO sach = (QLLoaiSachDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(sach.getMaSach());
                    row.createCell(1, CellType.STRING).setCellValue(sach.getTenSach());
                    row.createCell(2, CellType.STRING).setCellValue(sach.getTenTacGia());
                    row.createCell(3, CellType.STRING).setCellValue(sach.getTenNXB());
                    row.createCell(4, CellType.STRING).setCellValue((double)sach.getNamXB());
                    row.createCell(5, CellType.STRING).setCellValue(sach.getTheLoai());
                    row.createCell(6, CellType.STRING).setCellValue(sach.getNgonNgu());
                    row.createCell(7, CellType.STRING).setCellValue(sach.getTomTatNoiDung());
                    row.createCell(8, CellType.NUMERIC).setCellValue((double)sach.getGiaTien());
                    row.createCell(9, CellType.NUMERIC).setCellValue((double)sach.getSoTrang());
                    row.createCell(10, CellType.STRING).setCellValue(sach.getHinh());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public void writeFileExcel_QLNhaCungCap() {
        this.fx.setTitle("Xuất dữ liệu Nhà Cung Cấp -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Nhà Cung Cấp");
                QLNhaCungCapBUS nhaCungCapBUS = new QLNhaCungCapBUS();
                ArrayList<QLNhaCungCapDTO> list = nhaCungCapBUS.getArrNhaCungCap();
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Mã Nhà Cung Cấp");
                row.createCell(1, CellType.STRING).setCellValue("Tên Nhà Cung Cấp");
                row.createCell(2, CellType.STRING).setCellValue("Số Điện Thoại");
                row.createCell(3, CellType.STRING).setCellValue("Email");
                row.createCell(4, CellType.STRING).setCellValue("Địa Chỉ");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLNhaCungCapDTO nhaCungCap = (QLNhaCungCapDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(nhaCungCap.getMaNCC());
                    row.createCell(1, CellType.STRING).setCellValue(nhaCungCap.getTenNCC());
                    row.createCell(2, CellType.STRING).setCellValue(nhaCungCap.getSdt());
                    row.createCell(3, CellType.STRING).setCellValue(nhaCungCap.getEmail());
                    row.createCell(4, CellType.STRING).setCellValue(nhaCungCap.getDiaChi());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public void writeFileExcel_QLNhanVien() {
        this.fx.setTitle("Xuất dữ liệu Nhân Viên -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Nhân Viên");
                QLNhanVienBUS nhanVienBUS = new QLNhanVienBUS();
                ArrayList<QLNhanVienDTO> list = nhanVienBUS.getArrNhanVien();
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Mã Nhân Viên");
                row.createCell(1, CellType.STRING).setCellValue("Password");
                row.createCell(2, CellType.STRING).setCellValue("Họ Tên");
                row.createCell(3, CellType.STRING).setCellValue("Ngày Sinh");
                row.createCell(4, CellType.STRING).setCellValue("Địa Chỉ");
                row.createCell(5, CellType.STRING).setCellValue("Số Điện Thoại");
                row.createCell(6, CellType.STRING).setCellValue("Email");
                row.createCell(7, CellType.STRING).setCellValue("Chức Vụ");
                row.createCell(8, CellType.STRING).setCellValue("RFID_CODE");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLNhanVienDTO nhanVien = (QLNhanVienDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(nhanVien.getMaNhanVien());
                    row.createCell(1, CellType.STRING).setCellValue(nhanVien.getPassword());
                    row.createCell(2, CellType.STRING).setCellValue(nhanVien.getHoTen());
                    row.createCell(3, CellType.STRING).setCellValue(nhanVien.getNgaySinh());
                    row.createCell(4, CellType.STRING).setCellValue(nhanVien.getDiaChi());
                    row.createCell(5, CellType.STRING).setCellValue(nhanVien.getSdt());
                    row.createCell(6, CellType.STRING).setCellValue(nhanVien.getEmail());
                    row.createCell(7, CellType.STRING).setCellValue(nhanVien.getChucVu());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public void writeFileExcel_QLPhieuMuon() {
        this.fx.setTitle("Xuất dữ liệu Phiếu Mượn -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Phiếu Mượn");
                QLPhieuMuonBUS phieuMuonBUS = new QLPhieuMuonBUS();
                ArrayList<QLPhieuMuonDTO> list = phieuMuonBUS.getArrMuonTra();
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Mã Phiếu Mượn");
                row.createCell(1, CellType.STRING).setCellValue("Mã Thẻ");
                row.createCell(2, CellType.STRING).setCellValue("Ngày Mượn");
                row.createCell(3, CellType.NUMERIC).setCellValue("Thời Gian Mượn");
                row.createCell(4, CellType.STRING).setCellValue("Ngày Trả");
                row.createCell(5, CellType.STRING).setCellValue("ID Sách");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLPhieuMuonDTO phieuMuon = (QLPhieuMuonDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(phieuMuon.getMaPhieuMuon());
                    row.createCell(1, CellType.STRING).setCellValue(phieuMuon.getMaThe());
                    row.createCell(2, CellType.STRING).setCellValue(phieuMuon.getNgayMuon());
                    row.createCell(3, CellType.NUMERIC).setCellValue((double)phieuMuon.getThoiGianMuon());
                    row.createCell(4, CellType.STRING).setCellValue(phieuMuon.getNgayTra());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public void writeFileExcel_QLPhieuNhap() {
        this.fx.setTitle("Xuất dữ liệu Phiếu Nhập -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Phiếu Nhập");
                QLPhieuNhapBUS phieuNhapBUS = new QLPhieuNhapBUS();
                ArrayList<QLPhieuNhapDTO> list = phieuNhapBUS.getArrNhapKho();
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Mã Nhập");
                row.createCell(1, CellType.STRING).setCellValue("Ngày Nhập");
                row.createCell(2, CellType.STRING).setCellValue("Mã Sách");
                row.createCell(3, CellType.STRING).setCellValue("Số Lượng");
                row.createCell(4, CellType.STRING).setCellValue("Mã Nhân Viên");
                row.createCell(5, CellType.STRING).setCellValue("Mã Nhà Cung Cấp");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLPhieuNhapDTO phieuNhap = (QLPhieuNhapDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(phieuNhap.getMaNhap());
                    row.createCell(1, CellType.STRING).setCellValue(phieuNhap.getNgayNhap());
                    row.createCell(4, CellType.STRING).setCellValue(phieuNhap.getMaNhanVien());
                    row.createCell(5, CellType.STRING).setCellValue(phieuNhap.getMaNCC());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public void writeFileExcel_QLPhieuPhat() {
        this.fx.setTitle("Xuất dữ liệu Phiếu Phạt -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Phiếu Phạt");
                QLPhieuPhatBUS phieuPhatBUS = new QLPhieuPhatBUS();
                ArrayList<QLPhieuPhatDTO> list = phieuPhatBUS.getArrPhieuPhat();
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Mã Phiếu Phạt");
                row.createCell(1, CellType.STRING).setCellValue("Mã Phiếu Mượn");
                row.createCell(2, CellType.STRING).setCellValue("Mã Lý Do Phạt");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLPhieuPhatDTO phieuPhat = (QLPhieuPhatDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(phieuPhat.getMaPhieuPhat());
                    row.createCell(1, CellType.STRING).setCellValue(phieuPhat.getMaPhieuMuon());
                    row.createCell(2, CellType.STRING).setCellValue(phieuPhat.getMaLDPhat());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public void writeFileExcel_QLPhieuXuat() {
        this.fx.setTitle("Xuất dữ liệu Phiếu Xuất -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Phiếu Xuất");
                QLPhieuXuatBUS phieuXuatBUS = new QLPhieuXuatBUS();
                ArrayList<QLPhieuXuatDTO> list = phieuXuatBUS.getArrXuatKho();
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Mã Phiếu Xuất");
                row.createCell(1, CellType.STRING).setCellValue("Ngày Xuất");
                row.createCell(2, CellType.STRING).setCellValue("Mã Sách");
                row.createCell(3, CellType.STRING).setCellValue("Số Lượng");
                row.createCell(4, CellType.STRING).setCellValue("Mã Nhân Viên");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLPhieuXuatDTO phieuXuat = (QLPhieuXuatDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(phieuXuat.getMaXuat());
                    row.createCell(1, CellType.STRING).setCellValue(phieuXuat.getNgayXuat());
                    row.createCell(4, CellType.STRING).setCellValue(phieuXuat.getMaNhanVien());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public void writeFileExcel_QLThe() {
        this.fx.setTitle("Xuất dữ liệu Thẻ -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Thẻ");
                QLTheBUS theBUS = new QLTheBUS();
                ArrayList<QLTheDTO> list = theBUS.getArrThe();
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Mã Thẻ");
                row.createCell(1, CellType.STRING).setCellValue("Mã Khách Hàng");
                row.createCell(2, CellType.STRING).setCellValue("Ngày Cấp");
                row.createCell(3, CellType.STRING).setCellValue("Ngày Hết Hạn");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLTheDTO the = (QLTheDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(the.getMaThe());
                    row.createCell(1, CellType.STRING).setCellValue(the.getMaKhachHang());
                    row.createCell(2, CellType.STRING).setCellValue(the.getNgayCap());
                    row.createCell(3, CellType.STRING).setCellValue(the.getNgayHetHan());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public void writeFileExcel_QLAdmin() {
        this.fx.setTitle("Xuất dữ liệu Admin -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Admin");
                QLAdminBUS adminBUS = new QLAdminBUS();
                ArrayList<QLAdminDTO> list = adminBUS.getArrAdmin();
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Tài Khoản Admin");
                row.createCell(1, CellType.STRING).setCellValue("Password");
                row.createCell(2, CellType.STRING).setCellValue("RFID_CODE");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLAdminDTO admin = (QLAdminDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(admin.getTkAdmin());
                    row.createCell(1, CellType.STRING).setCellValue(admin.getPassword());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public void writeFileExcel_QLChiTietSach() {
        this.fx.setTitle("Xuất dữ liệu Chi Tiết Sách -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Chi Tiết Sách");
                QLChiTietSachBUS chiTietSachBUS = new QLChiTietSachBUS();
                ArrayList<QLChiTietSachDTO> list = chiTietSachBUS.getArrChiTietSach();
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("ID Sách");
                row.createCell(1, CellType.STRING).setCellValue("Mã Sách");
                row.createCell(2, CellType.STRING).setCellValue("Tình Trạng");
                row.createCell(3, CellType.STRING).setCellValue("Tên Sách");
                row.createCell(4, CellType.STRING).setCellValue("Tên Tác Giả");
                row.createCell(5, CellType.STRING).setCellValue("Tên NXB");
                row.createCell(6, CellType.STRING).setCellValue("Năm XB");
                row.createCell(7, CellType.STRING).setCellValue("Thể Loại");
                row.createCell(8, CellType.STRING).setCellValue("Ngôn Ngữ");
                row.createCell(9, CellType.STRING).setCellValue("Tóm Tắt Nội Dung");
                row.createCell(10, CellType.NUMERIC).setCellValue("Giá Tiền");
                row.createCell(11, CellType.NUMERIC).setCellValue("Số Trang");
                row.createCell(12, CellType.STRING).setCellValue("Hình Sách");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLChiTietSachDTO chiTietSach = (QLChiTietSachDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(chiTietSach.getIDSach());
                    row.createCell(1, CellType.STRING).setCellValue(chiTietSach.getMaSach());
                    row.createCell(2, CellType.STRING).setCellValue(chiTietSach.getTinhTrang());
                    row.createCell(3, CellType.STRING).setCellValue(chiTietSach.getSach().getTenSach());
                    row.createCell(4, CellType.STRING).setCellValue(chiTietSach.getSach().getTenTacGia());
                    row.createCell(5, CellType.STRING).setCellValue(chiTietSach.getSach().getTenNXB());
                    row.createCell(6, CellType.NUMERIC).setCellValue((double)chiTietSach.getSach().getNamXB());
                    row.createCell(7, CellType.STRING).setCellValue(chiTietSach.getSach().getTheLoai());
                    row.createCell(8, CellType.STRING).setCellValue(chiTietSach.getSach().getNgonNgu());
                    row.createCell(9, CellType.STRING).setCellValue(chiTietSach.getSach().getTomTatNoiDung());
                    row.createCell(10, CellType.NUMERIC).setCellValue((double)chiTietSach.getSach().getGiaTien());
                    row.createCell(11, CellType.NUMERIC).setCellValue((double)chiTietSach.getSach().getSoTrang());
                    row.createCell(12, CellType.STRING).setCellValue(chiTietSach.getSach().getHinh());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public void writeFileExcel_QLKhachHang() {
        this.fx.setTitle("Xuất dữ liệu Khách Hàng -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Khách Hàng");
                QLKhachHangBUS khachHangBUS = new QLKhachHangBUS();
                ArrayList<QLKhachHangDTO> list = khachHangBUS.getArrKhachHang();
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Mã Nhân Viên");
                row.createCell(1, CellType.STRING).setCellValue("Họ Tên");
                row.createCell(2, CellType.STRING).setCellValue("Ngày Sinh");
                row.createCell(3, CellType.STRING).setCellValue("Địa Chỉ");
                row.createCell(4, CellType.STRING).setCellValue("Số Điện Thoại");
                row.createCell(5, CellType.STRING).setCellValue("Email");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLKhachHangDTO khachHang = (QLKhachHangDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(khachHang.getMaKhachHang());
                    row.createCell(1, CellType.STRING).setCellValue(khachHang.getHoTen());
                    row.createCell(2, CellType.STRING).setCellValue(khachHang.getNgaySinh());
                    row.createCell(3, CellType.STRING).setCellValue(khachHang.getDiaChi());
                    row.createCell(4, CellType.STRING).setCellValue(khachHang.getSdt());
                    row.createCell(5, CellType.STRING).setCellValue(khachHang.getEmail());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public void writeFileExcel_QLKhoSach() {
        this.fx.setTitle("Xuất dữ liệu Kho Sách -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Kho Sách");
                QLKhoSachBUS khoSachBUS = new QLKhoSachBUS();
                ArrayList<QLKhoSachDTO> list = khoSachBUS.getArrKhoSach();
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Mã Sách");
                row.createCell(1, CellType.NUMERIC).setCellValue("Số Lượng");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLKhoSachDTO khoSach = (QLKhoSachDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(khoSach.getMaSach());
                    row.createCell(1, CellType.NUMERIC).setCellValue((double)khoSach.getSoLuong());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public void writeFileExcel_QLLDPhat() {
        this.fx.setTitle("Xuất dữ liệu Lý Do Phạt -> excel");
        String url = this.WriteFile();
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Lý Do Phạt");
                QLLDPhatBUS LDPhatBUS = new QLLDPhatBUS();
                ArrayList<QLLDPhatDTO> list = LDPhatBUS.getArrLDPhat();
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Mã Lý Do Phạt");
                row.createCell(1, CellType.STRING).setCellValue("Tên Lý Do Phạt");
                row.createCell(1, CellType.NUMERIC).setCellValue("Mức Độ");
                Iterator var9 = list.iterator();

                while(var9.hasNext()) {
                    QLLDPhatDTO LDPhat = (QLLDPhatDTO)var9.next();
                    ++rownum;
                    row = sheet.createRow(rownum);
                    row.createCell(0, CellType.STRING).setCellValue(LDPhat.getMaLDPhat());
                    row.createCell(1, CellType.STRING).setCellValue(LDPhat.getTenLDPhat());
                    row.createCell(2, CellType.NUMERIC).setCellValue((double)LDPhat.getMucDo());
                }

                for(int i = 0; i < rownum; ++i) {
                    sheet.autoSizeColumn(i);
                }

                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var21) {
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, var21);
            } catch (IOException var22) {
                IOException ex = var22;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var20) {
                    IOException ex = var20;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }

    public static void main(String[] args) {
        String url = "D:\\untitle.xls";
        if (url != null) {
            FileOutputStream outFile = null;

            try {
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("Loại Sách");
                int rownum = 1;
                Row row = sheet.createRow(rownum);
                row.createCell(0, CellType.STRING).setCellValue("Mã Sách");
                row.createCell(1, CellType.STRING).setCellValue("Tên Sách");
                row.createCell(2, CellType.STRING).setCellValue("Tên Tác Giả");
                File file = new File(url);
                file.getParentFile().mkdirs();
                outFile = new FileOutputStream(file);
                workbook.write(outFile);
                JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + file.getAbsolutePath());
            } catch (FileNotFoundException var18) {
                FileNotFoundException ex = var18;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } catch (IOException var19) {
                IOException ex = var19;
                Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
            } finally {
                try {
                    if (outFile != null) {
                        outFile.close();
                    }
                } catch (IOException var17) {
                    IOException ex = var17;
                    Logger.getLogger(ExportFile.class.getName()).log(Level.SEVERE, (String)null, ex);
                }

            }

        }
    }
}
