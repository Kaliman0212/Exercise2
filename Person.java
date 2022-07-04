public class Person{

    private String name;
    private String surname;
    private String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            throw new IllegalArgumentException("Object is not an instance of class Person!");
        }
        Person person = (Person) obj;
        return (person.name.equals(this.name)
                && person.surname.equals(this.surname)
                && person.patronymic.equals(this.patronymic)
        );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}