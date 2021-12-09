package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person person1 = new Employee("Phong", "Ha Noi",3500);
        Person person2 = new Customer("Thanh Phong", "Ha Nam",4000);
        person1.display();
        person2.display();

    }
}
