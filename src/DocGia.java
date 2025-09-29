public class DocGia {
    private String maDocGia;
    private String hoTen;
    private String namSinh;
    private String email;
    private String gioiTinh;
    private String diaChi;
    private String soDienThoai;

    // Constructor
    public DocGia(String maDocGia, String hoTen, String namSinh, String email, String gioiTinh, String diaChi, String soDienThoai) {
        this.maDocGia = maDocGia;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    // CREATE
    public static DocGia create(String ma, String ten, String ns, String email, String gt, String dc, String sdt) {
        return new DocGia(ma, ten, ns, email, gt, dc, sdt);
    }

    // READ
    public void read() {
        System.out.println("Mã độc giả: " + maDocGia);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Email: " + email);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + soDienThoai);
    }

    // UPDATE
    public void update(String ten, String ns, String email, String gt, String dc, String sdt) {
        this.hoTen = ten;
        this.namSinh = ns;
        this.email = email;
        this.gioiTinh = gt;
        this.diaChi = dc;
        this.soDienThoai = sdt;
    }

    // DELETE
    public void delete() {
        this.maDocGia = null;
        this.hoTen = null;
        this.namSinh = null;
        this.email = null;
        this.gioiTinh = null;
        this.diaChi = null;
        this.soDienThoai = null;
    }
}
