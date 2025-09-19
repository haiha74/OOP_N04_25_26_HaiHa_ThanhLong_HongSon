import java.util.HashMap;

public class DichVuSach {
    private HashMap<String, Sach> ds = new HashMap<>();

    // thêm sách
    public boolean themSach(Sach s) {
        if (ds.containsKey(s.getMaSach())) return false;
        ds.put(s.getMaSach(), s);
        return true;
    }

    // tìm sách
    public Sach timSach(String ma) {
        return ds.get(ma);
    }

    // cập nhật sách
    public void capNhatSach(Sach s) {
        ds.put(s.getMaSach(), s);
    }

    // xóa sách
    public boolean xoaSach(String ma) {
        if (ds.containsKey(ma)) {
            ds.remove(ma);
            return true;
        }
        return false;
    }

    // hiển thị tất cả
    public void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            for (Sach s : ds.values()) {
                System.out.println(s);
            }
        }
    }
}
