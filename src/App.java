import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DichVuSach dv = new DichVuSach();

        // --- Thêm sách ---
        System.out.println("\n--- Thêm sách mới ---");
        System.out.print("Mã sách: ");
        String ma = sc.nextLine();
        System.out.print("Tên sách: ");
        String ten = sc.nextLine();
        System.out.print("Tác giả: ");
        String tg = sc.nextLine();
        System.out.print("Thể loại: ");
        String tl = sc.nextLine();
        System.out.print("Số lượng: ");
        int sl = Integer.parseInt(sc.nextLine());

        Sach s = new Sach(ma, ten, tg, tl, sl, 0);
        if (dv.themSach(s)) System.out.println(" Thêm thành công");
        else System.out.println(" Mã sách đã tồn tại");

        dv.hienThi();

        // --- Cập nhật sách ---
        System.out.println("\n--- Cập nhật sách ---");
        System.out.print("Nhập mã cần cập nhật: ");
        String maUpdate = sc.nextLine();
        Sach sach = dv.timSach(maUpdate);

        if (sach != null) {
            System.out.print("Tên mới: ");
            sach.setTenSach(sc.nextLine());
            System.out.print("Tác giả mới: ");
            sach.setTacGia(sc.nextLine());
            System.out.print("Thể loại mới: ");
            sach.setTheLoai(sc.nextLine());
            System.out.print("Số lượng mới: ");
            sach.setSoLuongTong(Integer.parseInt(sc.nextLine()));
            dv.capNhatSach(sach);
            System.out.println(" Đã cập nhật");
        } else {
            System.out.println(" Không tìm thấy sách");
        }

        dv.hienThi();

        // --- Xóa sách ---
        System.out.println("\n--- Xóa sách ---");
        System.out.print("Nhập mã cần xóa: ");
        String maDelete = sc.nextLine();
        if (dv.xoaSach(maDelete)) {
            System.out.println(" Đã xóa sách có mã: " + maDelete);
        } else {
            System.out.println(" Không tìm thấy sách để xóa");
        }

        dv.hienThi();

        sc.close();
    }
}
