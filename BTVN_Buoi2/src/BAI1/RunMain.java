package BAI1;

import java.util.Scanner;
    public class RunMain {
        public static void main(String[] args) {
            int a,b,c;
            System.out.println("Nhap 3 so nguyen: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.println("So lon nhat la : " + Max(a,b,c)  );

        }
        public static int Max (int a, int b ,int c){
            int max = a;
            if(b > max) {
                max = b;
            }
            if( c > max){
                max= c;
            }
            return max;
        }
    }

