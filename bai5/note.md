## printing

### thủ công
```
@Override
public String toString(){
    return new String(
        "data1: "+data1+", 
        data2: "+data2
    );
}
```

### class Printable
- extends Printable
- call method printProperties()

## tự goi 
- this(...)
- method call overloaded method

## static member
- uses:
    + counters and tracking
    + factory methods 

## truyền tham số 

## Một số lớp tiện ích
### String
- literal vs object
- String nếu thay đổi phải lưu qua 1 object khác
```Time for String: 1777ms```
- String Buffer
    + vd khi đọc text từ tệp tin
    + tạo xâu thông qua vòng lặp 
```Time for StringBuilder: 6ms```
### Math
- double -> double
### System
- kiểm soát I/O
- arraycopy()
