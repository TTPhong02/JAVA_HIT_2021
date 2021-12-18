package Bai1;

    import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunMain {
    public static void main(String[] args) {

        List <Person> person = new ArrayList <>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so person: ");
        n=sc.nextInt();
        for(int i=0; i<n; i++) {
            Person person1 = new Person();
            person1.Nhap();
            person.add(person1);
        }

        Collections.sort(person);
        for(Person person1 : person) {
            System.out.println(person1.toString());
        }


        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person first, Person late) {
                return first.getId() - late.getId();
            }
        });
        System.out.println("-------------------------");
        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person first, Person late) {
                if(first.getName().compareToIgnoreCase(late.getName())==0) {
                    return late.getAddress().compareTo(first.getAddress());
                }
                else {
                    return first.getName().compareTo(late.getName());
                }

            }
        });

        for (Person person1 : person) {
            System.out.println(person1.toString());
        }

    }
}
