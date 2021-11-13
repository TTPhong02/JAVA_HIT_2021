package Bai2;

import java.util.Scanner;

public class DateTime {
    Scanner sc = new Scanner(System.in);
    private int D;
    private int M;
    private int Y;
    public void NHAP(){
        System.out.println("Nhap ngay: ");
        D = sc.nextInt();
        System.out.println("Nhap thang: ");
        M = sc.nextInt();
        System.out.println("Nhap nam: ");
        Y = sc.nextInt();
    }
    public void XUAT(){
        System.out.println("Ngay thang: "+D+"/"+M+"/"+Y);
    }
}
