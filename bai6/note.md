# Kết tập. Kế thừa
## Kết tập
- các cách cài đặt
- tái sử dụng thông qua đối tượng

## Kế thừa
- extension, redefinition 
- tái sử dụng thông qua lớp
### Nguyên lý kế thừa
- lớp con không thể kế thừa các thành phần private của lớp cha
- không được phép kế thừa 
    + constructor
    + destructor
    + operator=
### Cú pháp
- lớp cha là final thì không kế thừa được từ nó
- đặt protected 
- super(ds tham số): bắt buộc nếu lớp cha không có constructor mặc định
