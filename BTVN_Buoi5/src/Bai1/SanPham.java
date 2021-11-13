package Bai1;

import java.util.Scanner;

public class SanPham {
    Scanner sc = new Scanner(System.in);
    private String MASP;
    private String TENSP;
    private String TENHANG;
    private String NGAY;
    public void NHAP(){
        System.out.println("Nhap ma san pham: ");
        MASP = sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        TENSP = sc.nextLine();
        System.out.println("Nhap ten Hang: ");
        TENHANG = sc.nextLine();
        System.out.println("Nhap ngay nhap: ");
        NGAY = sc.nextLine();
    }
    public void XUAT(){
        System.out.print("Ma SP: "+MASP);
        System.out.print("    Ten SP: "+TENSP);
        System.out.print("    Ten Hang: "+TENHANG);
        System.out.print("    Ngay Nhap: "+NGAY);
        System.out.println("");
    }
    public SanPham() {
    }

    public SanPham(String MASP, String TENSP, String TENHANG, String NGAY) {
        this.MASP = MASP;
        this.TENSP = TENSP;
        this.TENHANG = TENHANG;
        this.NGAY = NGAY;
    }

    public String getMASP() {
        return MASP;
    }

    public void setMASP(String MASP) {
        this.MASP = MASP;
    }

    public String getTENSP() {
        return TENSP;
    }

    public void setTENSP(String TENSP) {
        this.TENSP = TENSP;
    }

    public String getTENHANG() {
        return TENHANG;
    }

    public void setTENHANG(String TENHANG) {
        this.TENHANG = TENHANG;
    }

    public String getNGAY() {
        return NGAY;
    }

    public void setNGAY(String NGAY) {
        this.NGAY = NGAY;
    }
}
