package Bai1;

public class RunMain {
    public static void main (String[] args){
        Person x = new Person();
        x.setName("Tran Thanh Phong");
        x.setAge(19);
        x.setGender("Nam");
        x.setHobby("Choi game, xem phim");
        System.out.println(x);

        Person y = new Person("Tran Thanh Phong", 20,"Nam", "Choi game,xem phim");
        System.out.println(y);
    }
}
