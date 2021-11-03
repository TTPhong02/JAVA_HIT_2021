package Bai4;

import java.util.Scanner;

public class PHONGMAY {
    Scanner sc = new Scanner(System.in);
    private String Maphong;
    private String TenPhong;
    private Float Dientich;
    private QUANLY x;
    private MAY y[];
    private int n;

    public void NHAP(){
        System.out.println("Nhap ma phong: ");
        Maphong = sc.nextLine();
        System.out.println("Nhap Ten Phong: ");
        TenPhong = sc.nextLine();
        System.out.println("Nhap dien tich phong: ");
        Dientich = sc.nextFloat();
        x = new QUANLY();
        x.NHAP();
        System.out.println("Nhap so luong may: ");
        n = sc.nextInt();
        y = new MAY[n];
        for( int i = 0 ; i<n; i++){
            System.out.println("Nhap thong tin may so "+(i+1));
            y[i] = new MAY();
            y[i].NHAP();
        }
    }
    public void XUAT(){
        System.out.println("=======Thong tin ve Phong May =======");
        System.out.print("Ma phong: "+Maphong);
        System.out.print("     Ten phong: "+TenPhong);
        System.out.print("     Dien tich: "+Dientich);
        System.out.println(" ");
        x.XUAT();
        for(int i =0 ; i< n ; i++){
            y[i].XUAT();
        }
    }
}
