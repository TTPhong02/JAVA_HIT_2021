package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class LOPHOC {
    Scanner sc = new Scanner(System.in);
    private String MALH;
    private String TenLH;
    private String NGAYMO;
    private ArrayList<SINHVIEN> x = new ArrayList<>();
    private int n;
    private String GV;

    public LOPHOC() {
    }

    public String getMALH() {
        return MALH;
    }

    public void setMALH(String MALH) {

        this.MALH = MALH;
    }

    public String getTenLH() {

        return TenLH;
    }

    public void setTenLH(String tenLH) {

        TenLH = tenLH;
    }

    public String getNGAYMO() {

        return NGAYMO;
    }

    public void setNGAYMO(String NGAYMO) {

        this.NGAYMO = NGAYMO;
    }

    public ArrayList<SINHVIEN> getX() {

        return x;
    }

    public void setX(ArrayList<SINHVIEN> x) {

        this.x = x;
    }

    public String getGV() {
        return GV;
    }

    public void setGV(String GV) {
        this.GV = GV;
    }

    public int getN() {
        int n = this.n;
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
}
