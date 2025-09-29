## OOP_N04_25_26_HaiHa_ThanhLong_HongSon
## 👨‍🎓 Thông tin sinh viên
##
- **Thành Viên:** Nguyễn Hải Hà  
- **Mã sinh viên:** 23010469
##
- **Thành Viên:** Vũ Thành Long
- **Mã sinh viên:** 23010882
##
- **Thành Viên:** Phạm Hồng Sơn
- **Mã sinh viên:** 23010883    

## Hệ thống sẽ bao gồm các chức năng cơ bản sau:

+ Quản lý sách: Thêm, sửa, xóa thông tin sách; kiểm tra tình trạng sách. 
+ Quản lý độc giả: Thêm mới, cập nhật thông tin độc giả; kiểm soát số lượng sách mà mỗi 
độc giả có thể mượn, xem lịch sử ghi mượn,.. 
+ Quản lý mượn – trả sách: Xử lý yêu cầu mượn sách, ghi nhận ngày mượn, hạn trả, kiểm 
tra sách quá hạn và tính phí phạt nếu có. 
+ Tìm kiếm sách: Cho phép tra cứu sách theo các tiêu chí như mã sách, tiêu đề, tác giả, thể 
loại, năm xuất bản,… 
+ Báo cáo thống kê: Hiển thị danh sách sách đang được mượn, số lượng sách còn lại trong 
thư viện, danh sách độc giả vi phạm thời gian trả sách.


+ Quản lý sách: Thêm, sửa, xóa thông tin sách; kiểm tra tình trạng sách. 
+ Quản lý khách hàng: Thêm mới, cập nhật thông tin khách hàng; xem lịch sử mua sách,.. 
+ Quản lý mượn – trả sách: Xử lý yêu cầu mượn sách, ghi nhận ngày mượn, hạn trả, kiểm 
tra sách quá hạn và tính phí phạt nếu có. 
+ Tìm kiếm sách: Cho phép tra cứu sách theo các tiêu chí như mã sách, tiêu đề, tác giả, thể 
loại, năm xuất bản,… 
+ Báo cáo thống kê: Hiển thị danh sách sách đang được mượn, số lượng sách còn lại trong 
thư viện, danh sách độc giả vi phạm thời gian trả sách.

## Đối tượng nghiên cứu
Hệ thống tập trung vào quản lý các đối tượng chính trong thư viện, bao gồm:

//+ Người quản lí : Thêm , sửa , xóa người quản lí
//+ Sách: Thông tin về sách như mã sách, tiêu đề, tác giả, thể loại, số lượng, tình trạng.
//+ Độc giả: Quản lý danh sách độc giả, bao gồm họ tên, mã độc giả, thông tin liên hệ, lịch sử mượn – trả.
//+ Quá trình mượn – trả sách: Ghi nhận thông tin về sách đã mượn, hạn trả, tình trạng sách khi trả và các khoản phạt nếu trả muộn.

+ Người quản lí : thêm, sửa, xóa người quản lí (admin)
+ Sách : Thông tin về sách như mã sách, tên sách, tác giả, thể loại, giá bán,
+ Khách hàng : Quản lí danh sách khách hàng, bao gồm họ tên, mã khách hàng, thông tin liên hệ, lịch sử mua sách
+ Hóa đơn : Ghi nhận thông tin về sách đã mua , số tiền , ngày mua ,...
+ Nhân viên : 
## Công nghệ sử dụng:
+ Giao diện Java Spring Boot.
+ Ngôn ngữ lập trình: Java 
+ Môi trường lập trình: Vscode
+ Lưu trữ dữ liệu: MySQL để lưu thông tin sách, khách hàng và hóa đơn

## Sơ đồ khối yêu cầu : 
**1.1 UML Class Diagram**


<img width="793" height="574" alt="image" src="https://github.com/user-attachments/assets/a808cd2a-51bb-4e22-bca4-59ebfeed78d2" />

**1.1.1 Class Diagram của 3 đối tượng**
<img width="765" height="354" alt="image" src="https://github.com/user-attachments/assets/7d9a1807-c946-4674-a2d4-a18c94ca89a0" />



**1.2 UML Sequence Diagram**

**1.2.1 Đăng kí/Đăng nhập**

<img width="855" height="532" alt="image" src="https://github.com/user-attachments/assets/d91c9528-c2aa-409a-9954-329d19c65f03" />


**1.2.2 Quản lí sách**

<img width="867" height="534" alt="image" src="https://github.com/user-attachments/assets/7e8cf5a7-a4a4-444f-9712-79c203e7910d" />

**1.2.3 Kiểm tra/trả về**

<img width="1006" height="586" alt="image" src="https://github.com/user-attachments/assets/f83a4693-fc07-4f1b-9e12-3e0756f1b472" />
