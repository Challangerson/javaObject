public class PersonChecker {

    public static void main(String[] args) {
        Person person = new Person(null, "Kowalski", 30, 180, 80);

        System.out.println(person.getImie());


        Person person2 = new Person("Jan", "Kowalski", 30, 180, -30);

        System.out.println(person2.getWaga());
    }
}
