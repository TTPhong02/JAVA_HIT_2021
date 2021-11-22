package Bai2;

import java.awt.print.Book;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books books = new Books();
        int n ;
        System.out.println("Nhap danh sach Book: ");
        n = sc.nextInt();
        System.out.println("Nhap chuong tirnh muon chay: ");
        while(true){
            System.out.println("Nhap chuong tirnh muon chay: ");
            Integer x = sc.nextInt();
            switch (x){
                case 1:
                    Addbook(books,n);
                    break;
                case 2:
                    break;
                case 3:
                    DeleteBook(books, n);
                    break;
                case 4:

                    break;
                case 5:
                    SortPrice(books,n);
                    break;
                case "6":

                    break;
                case "0":

                default:
                    System.out.println("Nhap lai !");
                    break;

            }
        }
    }
    public static void Input(Books books, int n){
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i< n ;i++){
            System.out.println("Nhap Id sach: ");
            books.setId(sc.nextLine());
            System.out.println("Nhap ten sach: ");
            books.setName(sc.nextLine());
            System.out.println("Nhap nguoi xuat ban: ");
            books.setPublisher(sc.nextLine());
            System.out.println("Nhap gia: ");
            books.setPrice(sc.nextFloat());
        }
    }
    public static void Output(Books books, int n){

        for( int i= 0 ; i< n; i ++){
            System.out.print("Id: "+books.getId());
            System.out.print("    Name: "+books.getName());
            System.out.println("     Publisher: "+books.getPublisher());
            System.out.println("     Price: "+books.getPrice());
        }
    }
    public static void Addbook(Books books,int n){
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i<n; i++){
            System.out.println("Nhap ID moi");
                String newId = sc.nextLine();
                if(newId == books.getId()){
                    Input(n);
                }
        }
        n++;
    }
    public static void DeleteBook(Books books, int n ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id muon xoa: ");
        String dId = sc.nextLine();
        for( int i = 0 ; i < n ;i++){
            for( int j =i+1 ; j<n; j++){
                if(dId == books.getId()){
                    books.setId(i,books.getId(j));
                }
            }
        }
    }
    public static void SortPrice(Books books, int n){
        System.out.println("Sap xep theo gia giam dan");
        for( int i = 0 ; i< n-1;i++){
            for( int j = i+1; j< n ;j++){
                if(books.getPrice(i) > books.getPrice(j)){
                    Books temp = books.getPrice(i);
                    books.setPrice(i,books.getPrice(j));
                    books.setPrice(j,temp);
                }
            }
        }
    }
}

