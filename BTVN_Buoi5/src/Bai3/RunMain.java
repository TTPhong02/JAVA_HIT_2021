package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        LOPHOC lophoc = new LOPHOC();
        System.out.println("Nhap ma lop hoc: ");
        lophoc.setMALH(sc.nextLine());
        System.out.println("Nhap ten lop hoc: ");
        lophoc.setTenLH(sc.nextLine());
        System.out.println("Nhap ngay mo: ");
        lophoc.setNGAYMO(sc.nextLine());
        System.out.println("Nhap giao vien: ");
        lophoc.setGV(sc.nextLine());
        System.out.println("Nhap danh sach sinh vien: ");
        lophoc.setN(sc.nextInt());
        ArrayList<SINHVIEN> x = new ArrayList<>();
        for (int i = 0; i < lophoc.getN(); i++) {
            SINHVIEN sinhvien = new SINHVIEN();
            sinhvien.NHAP();
            x.add(sinhvien);
        }
        lophoc.setX(x);
        int count = 0;
        for (int i = 0; i < lophoc.getN(); i++) {
            if (lophoc.getX().get(i).getKH() == 15) {
                count++;
            }
        }
        System.out.println("So sinh vien khoa 15 la: " + count);
        Sx(lophoc);

    }
    public static void Sx(LOPHOC lophoc){
        for( int i =0 ; i< lophoc.getN() - 1; i++){
            for( int j =i +1; j< lophoc.getN(); j++ ){
                if(lophoc.getX().get(i).getKH() > lophoc.getX().get(i).getKH()){
                    SINHVIEN temp = lophoc.getX().get(i) ;
                    lophoc.getX().set(i,lophoc.getX().get(j));
                    lophoc.getX().set(j,temp);
                }
            }
        }
        System.out.println("Danh sach sau khi sap xep: ");
        for(int i =0; i < lophoc.getN(); i++){
            lophoc.getX().get(i).XUAT();
        }
    }


    }



