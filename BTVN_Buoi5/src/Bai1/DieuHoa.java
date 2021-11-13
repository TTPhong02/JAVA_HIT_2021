package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    Scanner sc = new Scanner(System.in);
    private Float CS;
    private Float Gia;
    public void NHAP(){
        super.NHAP();
        System.out.println("Nhap cong suat: ");
        CS = sc.nextFloat();
        System.out.println("Nhap gia ban: ");
        Gia = sc.nextFloat();
    }
    public void XUAT() {
        super.XUAT();
        System.out.print("Cong suat: "+CS);
        System.out.print("    Gia ban: "+Gia);
        System.out.println("");
    }
    public DieuHoa() {
    }

    public DieuHoa(Float CS, Float gia) {
        this.CS = CS;
        Gia = gia;
    }

    public Float getCS() {
        return CS;
    }

    public void setCS(Float CS) {
        this.CS = CS;
    }

    public Float getGia() {
        return Gia;
    }

    public void setGia(Float gia) {
        Gia = gia;
    }
}
