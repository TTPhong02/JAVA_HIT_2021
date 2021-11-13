package Bai2;

import java.util.Scanner;

public class SANPHAM {
    Scanner sc = new Scanner(System.in);
    private String MASP;
    private String TENSP;
    private int SL;
    private Float DG;

    public void NHAP(){
        System.out.println("Nhap ma san pham: ");
        MASP = sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        TENSP = sc.nextLine();
        System.out.println("Nhap so luong: ");
        SL = sc.nextInt();
        System.out.println("Nhap don gia: ");
        DG = sc.nextFloat();
    }
    public void XUAT(){
        System.out.print("Ma Sp: "+MASP);
        System.out.print("     Ten Sp: "+TENSP);
        System.out.print("     So luong: "+SL);
        System.out.println("     Don gia: "+DG);
        System.out.println("Thanh Tien:   "+SL*DG);
    }

}
