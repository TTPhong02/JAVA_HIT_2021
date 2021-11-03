package Bai4;

import java.util.Scanner;

public class MAY {
    Scanner sc = new Scanner(System.in);
    private String Mamay;
    private String Kieumay;
    private String Tinhtrang;

    public void NHAP(){
        System.out.println(" Nhap ma may: ");
        Mamay = sc.nextLine();
        System.out.println("Nhap kieu may: ");
        Kieumay = sc.nextLine();
        System.out.println("Nhap Tinh trang may: ");
        Tinhtrang = sc.nextLine();
    }
    public void XUAT(){
        System.out.print("Ma may: "+Mamay);
        System.out.print("    Kieu May: "+ Kieumay);
        System.out.print("    Tinh trang may: "+Tinhtrang);
        System.out.println("");
    }
}
