package Bai2;

import java.util.Scanner;

public class NHANSU {
    Scanner sc = new Scanner(System.in);
    private String Manhansu;
    private String Hoten;
    DATE NS ;
    public void NHAP(){
        System.out.println("Nhap ma nhan su: ");
        Manhansu = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        Hoten = sc.nextLine();
        NS = new DATE();
        NS.NHAP();
    }
    public void XUAT(){
        System.out.println("Ma Nhan Su: "+Manhansu);
        System.out.println("Nhap ho ten: "+Hoten);
        NS.XUAT();
    }


}
