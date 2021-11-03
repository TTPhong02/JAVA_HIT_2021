package Bai3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HANG {
    Scanner sc = new Scanner(System.in);
    private String Mahang;
    private String Tenhang;
    private Float Dongia;

    public void NHAP(){
        System.out.println("Nhap ma hang: ");
        Mahang = sc.nextLine();
        System.out.println("Nhap Ten hang: ");
        Tenhang =sc.nextLine();
        System.out.println("Nhap Don gia: ");
        Dongia = sc.nextFloat();
    }
    public void XUAT(){
        System.out.print("Ma Hang: "+Mahang);
        System.out.print("   Ten Hang: "+Tenhang);
        System.out.print("   Don Gia: "+ Dongia);
        System.out.println("");
    }

    public Float getDongia() {
        return Dongia;
    }

}
