package BAI2;

import java.util.Scanner;

    public class RunMain {
        //tao mang
        public static void nhap(int[] a, int n) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap phan tu mang: ");
            for (int i = 0; i < n; i++) {
                System.out.print("a[" + i + "]= ");
                a[i] = sc.nextInt();
            }
        }
        //xuat gia tri sau khi tao
        public static void xuat(int[] a, int n) {
            for (int i = 0; i < n; i++) {
                System.out.print(" " + a[i]);
            }
            System.out.println("");
        }
        //them phan tu mang
        public static void them(int[] a, int n, int vtt,int st) {
            for( int i = n; i > vtt ; i--){
                a[i] = a[i-1];
            }
            a[vtt]= st;
        }
        //xoa phan tu mang
        public static void xoa( int[] a, int n , int vtx){
            for( int i = vtx ; i < n -1; i++  ){
                a[i] = a[i+1];
            }
        }
        // dao nguoc mang
        public static void Reverse( int[] a, int n ){
            for ( int i = n-1 ; i >= 0 ; i--){
                System.out.print(" "+ a[i]);
            }
        }
        //hien thi phan tu a[1] va ca so chia het cho a[1]
        public static void Search( int[] a, int n){
            for( int i = 0 ; i < n ; i++) {
                if (a[i] % a[1]==0)
                    System.out.println(" "+a[i]);
            }
            System.out.println("Phan tu a[1]= " + a[1]);
        }
        //kiem tra so nguyen to
        public static byte isPrime(int n){
            if(n<2)
                return 0;
            for( int i = 2 ; i*i <= n; i++){
                if(n % i == 0)
                    return 0;
            }
            return 1;
        }
        //tong cac so nguyen to
        public static int sum(int[] a, int n){
            int s = 0;
            for( int i = 0 ; i < n ;i++){
                if(isPrime(a[i]) == 1 ) {
                    s += a[i];
                }
            }
            return s;
        }
        //exit
        public static void exit() {
            System.exit(0);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap n : ");
            int n = sc.nextInt();
            int[] a = new int[100];
            while(true){
                System.out.println("Nhap k: ");
                int k= sc.nextInt();
                switch (k){
                    case 1 :
                        nhap(a,n);
                        break;
                    case 2:
                        xuat(a,n);
                        break;
                    case 3:
                        System.out.println("Nhap vi tri muon them: ");
                        int vtt = sc.nextInt();
                        System.out.println("Nhap so muon them: ");
                        int st = sc.nextInt();
                        them(a,n,vtt,st);
                        n++;
                        xuat(a,n);
                        break;
                    case 4:
                        System.out.println("Nhap vi tri xoa: ");
                        int vtx = sc.nextInt();
                        xoa(a,n,vtx);
                        n--;
                        break;
                    case 5:
                        System.out.println("Mang sau khi dao nguoc: ");
                        Reverse(a,n);
                        break;
                    case 6:
                        System.out.println("Cac so chia het cho phan tu a[1]: ");
                        Search(a,n);
                        break;
                    case 7:
                        System.out.println("Tong cac so nguyen to co trong mang: ");
                        System.out.println(sum(a,n));
                        break;
                    case 8:
                        exit();
                    default:
                        System.out.println("Nhap lai!");
                }
            }

        }
    }

