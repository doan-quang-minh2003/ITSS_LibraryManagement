package librarymanagementsystem.DTO;

public class QLNhanVienDTO {
    String maNhanVien, password, hoTen, ngaySinh, diaChi, email, chucVu, sdt, salt;

    public QLNhanVienDTO(String maQuanLy, String password, String hoTen, String ngaySinh, String diaChi, String email, String chucVu, String sdt) {
        this.maNhanVien = maQuanLy;
        this.password = password;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.email = email;
        this.chucVu = chucVu;
        this.sdt = sdt;
    }
    
    public QLNhanVienDTO(String maNhanVien, String password, String hoTen, String ngaySinh, String diaChi, String email, String chucVu, String sdt, String salt) {
        this.maNhanVien = maNhanVien;
        this.password = password;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.email = email;
        this.chucVu = chucVu;
        this.sdt = sdt;
        this.salt = salt;
    }


    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    
}
