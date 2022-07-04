import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Person> list = new LinkedList<>();
        addPersonToLinkedList(list, new Person("Калиман", "Сапарбекова", "Октябрьевна"));
        addPersonToLinkedList(list, new Person("Юлия", "Смирнова", "Максимовна"));
        addPersonToLinkedList(list, new Person("Дмитрий", "Шишкин", "Артемович"));
        System.out.println(list);
        addPersonToLinkedList(list, new Person("Юлия", "Смирнова", "Максимовна"));
        System.out.println(list);

    }

    static void addPersonToLinkedList(LinkedList<Person> list, Person person) {
        if (list.contains(person)) {
            throw new IllegalArgumentException("This person is already exists in this list");
        }
        list.add(person);
    }
}

