import java.time.LocalDate;

public class MuonTra {
private String maMuon;
private int maSV;
private String tenSV;
private String maSach;
private LocalDate ngayMuon;
private LocalDate ngayTra;

// Constructor
public MuonTra(String maMuon, int maSV, String tenSV, String maSach, LocalDate ngayMuon, LocalDate ngayTra) {
this.maMuon = maMuon;
this.maSV = maSV;
this.tenSV = tenSV;
this.maSach = maSach;
this.ngayMuon = ngayMuon;
this.ngayTra = ngayTra;
}

// CREATE
public static MuonTra create(String maMuon, int maSV, String tenSV, String maSach, LocalDate ngayMuon, LocalDate ngayTra) {
return new MuonTra(maMuon, maSV, tenSV, maSach, ngayMuon, ngayTra);
}

// READ
public void read() {
System.out.println("Mã mượn: " + maMuon);
System.out.println("Mã SV: " + maSV);
System.out.println("Tên SV: " + tenSV);
System.out.println("Mã sách: " + maSach);
System.out.println("Ngày mượn: " + ngayMuon);
System.out.println("Ngày trả: " + ngayTra);
}

// UPDATE
public void update(String tenSV, String maSach, LocalDate ngayMuon, LocalDate ngayTra) {
this.tenSV = tenSV;
this.maSach = maSach;
this.ngayMuon = ngayMuon;
this.ngayTra = ngayTra;
}

// DELETE
public void delete() {
this.maMuon = null;
this.maSV = 0;
this.tenSV = null;
this.maSach = null;
this.ngayMuon = null;
this.ngayTra = null;
}
}