package Bai3;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class NGUOI {
    Scanner sc = new Scanner(System.in);
    private String HT;
    private String NS;
    private String QQ;
    public void NHAP(){
        System.out.println("Nhap ho ten: ");
        HT = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        NS = sc.nextLine();
        System.out.println("Nhap que quan: ");
        QQ = sc.nextLine();
    }
    public void XUAT(){
        System.out.println("Ho Ten: "+HT);
        System.out.println("Ngay sinh: "+NS);
        System.out.println("Que quan: "+QQ);
    }

    public String getHT() {
        return HT;
    }

    public void setHT(String HT) {
        this.HT = HT;
    }

    public String getNS() {
        return NS;
    }

    public void setNS(String NS) {
        this.NS = NS;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }
}
