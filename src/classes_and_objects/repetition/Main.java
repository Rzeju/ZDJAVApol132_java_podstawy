package classes_and_objects.repetition;

public class Main {

    public static void main(String[] args) {

        Person me = new Person("Piotr", "Andrzejak", 29, 177);

        String firstName = me.getFirstName();

        System.out.println(me.getFirstName());

        me.setFirstName("Andrzej");

        System.out.println(me.getFirstName());


        System.out.println(me.toString());

        Person somePerson = new Person();
        System.out.println(somePerson.toString());
        somePerson.setFirstName("SomeName");
        somePerson.setLastName("SomeLastname");
        somePerson.setAge(99);
        somePerson.setHeight(180);
        System.out.println(somePerson.toString());

        //somePerson.testMethod();
        somePerson.setAge(100);
        somePerson.testMethod();
    }
}
