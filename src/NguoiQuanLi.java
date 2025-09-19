public class NguoiQuanLy {
    private String maQuanLy;
    private String hoTen;
    private String namSinh;
    private String email;
    private String gioiTinh;
    private String tenNguoiDung;
    private String matKhau;

    // Constructor
    public NguoiQuanLy(String maQuanLy, String hoTen, String namSinh, String email, String gioiTinh, String tenNguoiDung, String matKhau) {
        this.maQuanLy = maQuanLy;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.tenNguoiDung = tenNguoiDung;
        this.matKhau = matKhau;
    }

    // CREATE
    public static NguoiQuanLy create(String ma, String ten, String ns, String email, String gt, String user, String pass) {
        return new NguoiQuanLy(ma, ten, ns, email, gt, user, pass);
    }

    // READ
    public void read() {
        System.out.println("Mã quản lý: " + maQuanLy);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Email: " + email);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Tên người dùng: " + tenNguoiDung);
        System.out.println("Mật khẩu: " + matKhau);
    }

    // UPDATE
    public void update(String ten, String ns, String email, String gt, String user, String pass) {
        this.hoTen = ten;
        this.namSinh = ns;
        this.email = email;
        this.gioiTinh = gt;
        this.tenNguoiDung = user;
        this.matKhau = pass;
    }

    // DELETE
    public void delete() {
        this.maQuanLy = null;
        this.hoTen = null;
        this.namSinh = null;
        this.email = null;
        this.gioiTinh = null;
        this.tenNguoiDung = null;
        this.matKhau = null;
    }
}
