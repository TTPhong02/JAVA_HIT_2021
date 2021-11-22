package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int dem=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
                dem++;
        }
        System.out.println("So chu so: " +dem);
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
                sum +=str.charAt(i) - 48 ;
        }
        int a = 1;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))) {
                if(sum % ( str.charAt(i) - 48) ==0 )
                    a *= str.charAt(i)  - 48  ;
            }
        }
        System.out.println("Tích: " + a);

    }

}
