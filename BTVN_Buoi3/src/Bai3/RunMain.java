package Bai3;

import java.util.Random;

public class RunMain {
    public static void main(String[] args) {
        Random rd = new Random();
        Guns DiepBeDe = new Guns();
        Guns DoanXinhGai = new Guns();
        DiepBeDe.setWeaponName("Kar98");
        DiepBeDe.setAmmoNumber(100);
        DoanXinhGai.setWeaponName("AWM");
        DoanXinhGai.setAmmoNumber(100);
        while(DiepBeDe.getAmmoNumber() != 0 && DoanXinhGai.getAmmoNumber() != 0){
            DiepBeDe.Shoot(rd.nextInt(10));
            DoanXinhGai.Shoot(rd.nextInt(10));
            if(DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() == 0){
                DiepBeDe.Load(rd.nextInt(10)+1);
                DoanXinhGai.Load(rd.nextInt(10) +1);
            }
            else{
                if(DiepBeDe.getAmmoNumber()==0){
                    System.out.println("Doan da het dan!");
                    System.out.println("Doan thua!");

                }
                if(DoanXinhGai.getAmmoNumber()==0){
                    System.out.println("Diep da het dan!");
                    System.out.println("Diep thua");
                }
            }
        }
    }
}
