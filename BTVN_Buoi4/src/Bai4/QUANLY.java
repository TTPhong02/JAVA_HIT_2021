package Bai4;

import java.util.Scanner;

public class QUANLY {
    Scanner sc = new Scanner(System.in);
    private String MaQl;
    private String Hoten;

    public void NHAP(){
        System.out.println("Nhap ma quan ly: ");
        MaQl = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        Hoten = sc.nextLine();
    }
    public void XUAT(){
        System.out.print("Ma Quan Ly: "+MaQl);
        System.out.print("    Ho ten: "+Hoten);
        System.out.println("");
    }
}
