package Bai3;

public class Guns {
    private String weaponName;
    private int ammoNumber;
    public void Load(int x){
        ammoNumber += x;
    }
    public void Shoot(int x){
        if (ammoNumber - x > 0)
            ammoNumber -= x;
        if ( ammoNumber == 0)
            System.out.println("Het dan !");
    }
    public Guns(){

    }
    public Guns(String weaponName, int ammoNumber){
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }
    public void setWeaponName(String name){
        this.weaponName = weaponName;
    }
    public String getWeaponName(){
        return weaponName;
    }
    public void setAmmoNumber(int ammoNumber){
        this.ammoNumber = ammoNumber;
    }
    public int getAmmoNumber(){
        return ammoNumber;
    }
}
