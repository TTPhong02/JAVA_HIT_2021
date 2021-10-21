package BAI3;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String s = sc.nextLine();
        int dem=  0;
        int sum = 0;
        for ( int i = 0 ; i< s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                dem++;
                sum += s.charAt(i) - 48;
            }
        }
        if (dem != 0){
            System.out.println("True !");
            System.out.println("Trung binh cong : " + (float)sum/dem );
        }else{
            System.out.println("False !");
        }

    }

}


