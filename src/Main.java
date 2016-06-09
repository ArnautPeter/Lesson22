import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person sam = new Person("Sam", 25);
        Person mark = new Person("Mark", 35);
        Person bob = new Person("Bob", 15);

        List<Person> persons = new ArrayList<>();
        persons.add(sam);
        persons.add(mark);
        persons.add(bob);

        Collections.sort(persons);
        System.out.println("Compare by age " + persons);

        Collections.sort(persons, new PersonNameComporator());
        System.out.println("Compera by name " + persons);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
