package BT;

public class TestNV {
    public static void main(String[] args) {
        NhanVien.soNV = 0;

        // Tạo đối tượng NhanVien
        NhanVien nhanVien1 = new NhanVien("John Doe", 5000, 1.5);
        NhanVien nhanVien2 = new NhanVien("Jane Smith", 6000, 1.8);

        // Hiển thị thông tin và lương của các nhân viên
        nhanVien1.inTTin();
        nhanVien2.inTTin();

        // Tăng lương cho nhân viên 1 và hiển thị lại thông tin
        nhanVien1.tangLuong(1000);
        nhanVien1.inTTin();

        System.out.println("So nhan vien: "+NhanVien.soNV);

        
    }
}

