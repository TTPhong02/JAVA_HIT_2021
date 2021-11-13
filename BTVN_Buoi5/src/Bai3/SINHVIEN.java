package Bai3;

import java.util.Scanner;

public class SINHVIEN extends NGUOI{
    Scanner sc = new Scanner(System.in);
    private String MASV;
    private String NGANH;
    private int KH;

    @Override
    public void NHAP() {
        super.NHAP();
        System.out.println("Nhap ma SV: ");
        MASV = sc.nextLine();
        System.out.println("Nhap nganh: ");
        NGANH = sc.nextLine();
        System.out.println("Nhap khoa: ");
        KH = sc.nextInt();
    }

    @Override
    public void XUAT() {
        super.XUAT();
        System.out.print("Ma SV: "+MASV);
        System.out.print("    Nganh: "+NGANH);
        System.out.println("    Khoa: "+KH);
    }

    public SINHVIEN() {
    }

    public String getMASV() {
        return MASV;
    }

    public void setMASV(String MASV) {
        this.MASV = MASV;
    }

    public String getNGANH() {
        return NGANH;
    }

    public void setNGANH(String NGANH) {
        this.NGANH = NGANH;
    }

    public int getKH() {
        return KH;
    }

    public void setKH(int KH) {
        this.KH = KH;
    }
}
