package BT;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;

    public static int soNV;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soNV++;
    }

    public boolean tangLuong(double tang) {
        if (tang > 0) {
            this.luongCoBan += tang;
            return true;
        } else {
            return false;
        }
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public void inTTin() {
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong thang: " + tinhLuong());
    }

    public double tinhTongLuong(NhanVien... dsNV){
        double tong = 0;
        for (NhanVien nv : dsNV) {
            tong += nv.tinhLuong();
        }
        return tong;
    }
}
