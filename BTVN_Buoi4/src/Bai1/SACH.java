package Bai1;

import java.util.Scanner;

public class SACH {
    private String Masach;
    private String Tensach;
    private String Nxb;
    private int Sotrang;
    private float Giatien;
    Scanner sc = new Scanner(System.in);
    public void NHAP(){
        System.out.println("Nhap ma sach: ");
        Masach = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        Tensach = sc.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        Nxb= sc.nextLine();
        System.out.println("Nhap so trang : ");
        Sotrang = sc.nextInt();
        System.out.println("Nhap gia tien : ");
        Giatien = sc.nextFloat();
    }
    public void XUAT(){
        System.out.println("Ma Sach: "+Masach);
        System.out.println("Ten Sach: "+Tensach);
        System.out.println("NXB : "+Nxb);
        System.out.println("So trang: "+Sotrang);
        System.out.println("Gia: "+Giatien);
    }
}
