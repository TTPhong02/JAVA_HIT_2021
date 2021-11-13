package Bai1;

import java.util.ArrayList;
import java.util.Scanner;


public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n;
        System.out.println("Nhap so dieu hoa: ");
        n = sc.nextInt();
        ArrayList <DieuHoa> dieuhoa = new ArrayList<>();
        for( int i = 0 ; i< n ; i++){
            DieuHoa dh = new DieuHoa();
            dh.NHAP();
            dieuhoa.add(dh);
        }
        System.out.println("Thong tin danh sach: ");
        for( int i =0 ; i< n; i++){
            dieuhoa.get(i).XUAT();
        }
        checklist(dieuhoa);
    }
    public static void checklist(ArrayList<DieuHoa> dieuhoa){
        System.out.println("San pham co hang la Elextrolux :");
        DieuHoa dieuHoa = dieuhoa.get(0);
        for( int i =0 ; i < dieuhoa.size(); i++){
            if(dieuhoa.get(i).getTENHANG().compareToIgnoreCase("Elextrolux") == 0){
                dieuhoa.get(i).XUAT();
            }
            if(dieuhoa.get(i).getGia() < dieuHoa.getGia()){
                dieuHoa = dieuhoa.get(i);
            }
        }
        System.out.println("San pham co gia thap nhat: ");
        dieuHoa.XUAT();

    }
}
