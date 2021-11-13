package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class PHIEU {
    Scanner sc = new Scanner(System.in);
    private String MAPH;
    private String TENPH;
    private DateTime a;
    private ArrayList<SANPHAM> x = new ArrayList<>();
    private int n;
    public void NHAP(){
        System.out.println("Nhap ma phieu: ");
        MAPH = sc.nextLine();
        System.out.println("Nhap ten Phieu: ");
        TENPH = sc.nextLine();
        a = new DateTime();
        a.NHAP();
        System.out.println("Nhap so san pham: ");
        n = sc.nextInt();
        for(int i = 0 ; i<n; i++){
            SANPHAM sanpham  = new SANPHAM();
            sanpham.NHAP();
            x.add(sanpham);
        }
    }
    public void XUAT(){
        System.out.print("Ma phieu: "+MAPH);
        System.out.print("     Ten phieu: "+TENPH);
        a.XUAT();
        float t = 0;
        for ( int i = 0 ; i< n ; i++){
            x.get(i).XUAT();
        }
    }
}
