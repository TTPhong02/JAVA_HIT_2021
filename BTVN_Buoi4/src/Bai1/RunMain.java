package Bai1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Nhap so cuon sach: ");
        n = sc.nextInt();
        SACH[] x = new SACH[n];
        for( int i =0 ; i <n ; i++){
            System.out.println("Cuon sach "+(i+1));
            x[i] = new SACH();
            x[i].NHAP();
        }
        for( int i =0 ; i < n ; i++){
            System.out.println("Thong tin cuon sach "+(i+1));
            x[i].XUAT();
        }

    }

}
