package Bai2;

import java.util.Scanner;

public class Array {
    Scanner sc = new Scanner(System.in);
    private int n;
    private int[] arr;
    public Array(){
        this.n = 0;
        this.arr = null;
    }
    public Array(int n , int[] arr){
        this.n = n;
        this.arr = arr;
    }
    public void InputData(){
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        arr = new int[n];
        for( int i = 0; i < n; i++){
            System.out.println("a[" +i + "]= ");
            arr[i]= sc.nextInt();
        }
    }
    public void Show(){
        for( int i =0 ; i < n ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public float Sum(){
        int s = 0;
        for( int i = 0 ; i < n; i++)
            s+= arr[i];
        return s;
    }
    public void Filter(boolean flag){
        if(flag){
            for(int i =0 ; i< n ;i++){
                if(arr[i] % 2 == 0){
                    System.out.print(" "+ arr[i]);
                }
            }
        }
        else{
            for(int i =0 ; i < n ; i++){
                if(arr[i] % 2 != 0){
                    System.out.print(" "+arr[i]);
                }
            }
        }
    }
    public void setN(int n){
        this.n = n;
    }
    public int getN(){
        return n;
    }
    public void setArr( int[] arr){
        this.arr = arr;
    }
    public int[] getArr(){
        return arr;
    }
}
