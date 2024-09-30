public class SinhVien {
    private String hoTen;
    private String maSinhVien;
    private String namSinh;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSinhVien, String namSinh) {
        this.hoTen = hoTen;
        this.maSinhVien = maSinhVien;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }
}