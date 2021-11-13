package Bai4;

public class RunMain {
    public static void main(String[] args) {
        SUM<Integer> x = new SUM<>(4,5);
        System.out.println("Tong 2 so nguyen: "+ (x.getSoA() + x.getSoB()));
        SUM<Long> y = new SUM<>(6l,5l);
        System.out.println("Tong 2 so nguyen: "+ (y.getSoA() + y.getSoB()));
        SUM<Float> z = new SUM<>(4.3f,5.6f);
        System.out.println("Tong 2 so nguyen: "+ (z.getSoA() + z.getSoB()));
        SUM<Double> t = new SUM<>(4.2,5.5);
        System.out.println("Tong 2 so nguyen: "+ (t.getSoA() + t.getSoB()));
    }



}
