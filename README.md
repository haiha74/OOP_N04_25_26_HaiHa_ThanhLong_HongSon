## OOP_N04_25_26_HaiHa_ThanhLong_HongSon : Dự án xây dựng ứng dụng web Cửa hàng sách Long-Sơn-Hà
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
+ Quản lý admin : Admin có mọi quyền thêm, sửa, xóa, cập nhật sách-nhân viên-khách hàng.
+ Quản lý sách: Thêm, sửa, xóa thông tin sách , cập nhật số lượng sách.
+ Quản lý khách hàng: Thêm, sửa, xóa, cập nhật thông tin khách hàng; xem lịch sử mua hàng.
+ Quản lý nhân viên : Thêm, sửa, xóa, cập nhật nhân viên , nhân viên quản lý sách-khách hàng. 
+ Tìm kiếm sách: Cho phép tìm kiếm sách theo tên.


## Đối tượng nghiên cứu
Hệ thống tập trung vào quản lý các đối tượng chính trong thư viện, bao gồm:

+ Người quản lí (admin) : Thêm , sửa , xóa người quản lí-nhân viên-khách hàng-sách.
+ Sách: Thông tin về sách như tên sách, tác giả, thể loại, số lượng sách, giá bán.
+ Khách hàng: Quản lý danh sách khách hàng, bao gồm họ tên, thông tin liên hệ, địa chỉ , tên sách đã mua.
+ Nhân viên : Quản lí nhân viên , nhân viên có quyền quản lí sách-khách hàng.

## Công nghệ sử dụng:
+ Giao diện Java Spring Boot.
+ Ngôn ngữ lập trình: Java .
+ Môi trường lập trình: Vscode.
+ Lưu trữ dữ liệu: MySQL kết hợp sử dụng Aiven để lưu trữ thông tin : sách , khách hàng , nhân viên , admin.

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
