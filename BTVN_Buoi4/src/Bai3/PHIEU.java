package Bai3;

import java.util.Scanner;

public class PHIEU {
    Scanner sc = new Scanner(System.in);
    private String Maphieu;
    private HANG[] x;
    private int n ;

    public void NHAP(){
        System.out.println("Nhap Ma Phieu: ");
        Maphieu = sc.nextLine();
        System.out.println("Nhap so mat hang: ");
        n = sc.nextInt();
        x = new HANG[n];
        for( int i = 0  ; i < n ; i++){
            System.out.println("Nhap thong tin mat hang so "+(i+1));
            x[i] = new HANG();
            x[i].NHAP();
        }
    }
    public void XUAT(){
        System.out.println("=============Phieu Hang Hoa============");
        System.out.println("Ma phieu: "+Maphieu);
        float s = 0;
        for(int i = 0 ; i< n ; i++){
            x[i].XUAT();
            s += x[i].getDongia();
        }
        System.out.println("Tong tien trong phieu : "+s);
    }

}
