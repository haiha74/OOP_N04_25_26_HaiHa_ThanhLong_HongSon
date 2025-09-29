public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String theLoai;
    private int soLuongTong;
    private int soLuongMuon;

    public Sach(String maSach, String tenSach, String tacGia, String theLoai, int soLuongTong, int soLuongMuon) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.soLuongTong = soLuongTong;
        this.soLuongMuon = soLuongMuon;
    }

    // Getter & Setter
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTenSach() { return tenSach; }
    public void setTenSach(String tenSach) { this.tenSach = tenSach; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public int getSoLuongTong() { return soLuongTong; }
    public void setSoLuongTong(int soLuongTong) { this.soLuongTong = soLuongTong; }

    public int getSoLuongMuon() { return soLuongMuon; }
    public void setSoLuongMuon(int soLuongMuon) { this.soLuongMuon = soLuongMuon; }

    @Override
    public String toString() {
        return maSach + " | " + tenSach + " | " + tacGia + " | " + theLoai +
               " | Tổng: " + soLuongTong + " | Đang mượn: " + soLuongMuon;
    }
}
