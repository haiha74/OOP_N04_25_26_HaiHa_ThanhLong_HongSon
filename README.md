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
**1 UML Class Diagram**

**1.1 Class Diagram của 3 đối tượng**

<img width="744" height="712" alt="uml" src="https://github.com/user-attachments/assets/2a20ac02-d58a-430f-89cc-d18e0a6df066" />

**1.2 UML Sequence Diagram**
**1.2.1 Biểu đồ tuần tự chức năng “Đăng nhập”**
<img width="869" height="424" alt="login" src="https://github.com/user-attachments/assets/b7ce3998-c60f-48db-a944-2501b6d62043" />

**1.2.2 Biểu đồ tuần tự chức năng “Thêm sách”**

<img width="814" height="310" alt="create" src="https://github.com/user-attachments/assets/815108e6-ba9b-469f-87f2-807a26ed78ea" />

**1.2.3 Biểu đồ tuần tự chức năng “Xem danh sách người dùng”**
<img width="814" height="310" alt="create" src="https://github.com/user-attachments/assets/445dd033-e890-4a10-8200-8d78d06e6405" />

**1.2.4 Biểu đồ tuần tự chức năng "Sửa thông tin nhân viên"**
<img width="916" height="407" alt="edit" src="https://github.com/user-attachments/assets/2c94f833-66ad-4dc3-a98f-4992f5817713" />

**1.2.5 Biểu đồ tuần tự chức năng “Xóa sách”**
<img width="753" height="317" alt="delete" src="https://github.com/user-attachments/assets/8b972e5e-00ad-46af-80a4-3bc191b94d17" />

**1.2.6 Biểu đồ tuần tự chức năng “Mua sách” (chức năng lõi)**
<img width="858" height="317" alt="muaSAch" src="https://github.com/user-attachments/assets/7f373407-bf7f-4ae6-b8f4-f80ea35ef979" />

**1.2.7 Biểu đồ tuần tự chức năng "Tìm kiếm sách"**
<img width="836" height="255" alt="search" src="https://github.com/user-attachments/assets/d99fdcce-5dc2-4b80-93b8-05145831cdfc" />

**1.2.8 Biểu đồ tuần tự chức năng "Đăng xuất"**
<img width="695" height="257" alt="logout" src="https://github.com/user-attachments/assets/927fbe8c-8612-4dfd-bac8-6a913c50c55e" />
