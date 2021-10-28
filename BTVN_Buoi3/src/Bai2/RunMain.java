package Bai2;

import java.sql.SQLOutput;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();
        System.out.println("Mang thu nhat : ");
        arr1.InputData();
        System.out.println("Mang thu hai: ");
        arr2.InputData();
        if( (arr1.Sum() / arr1.getN()) > (arr2.Sum()/ arr2.getN()))
            arr1.Show();
        else if((arr1.Sum() / arr1.getN()) < (arr2.Sum()/ arr2.getN()))
            arr2.Show();
        else
            System.out.println("Bye");
    }
}
