package statics.static_fields;

public class Main {

    public static void main(String[] args) {
        //Odwołanie się do pola statycznego poprzez nazwę klasy (bez tworzenia obiektu)
        System.out.println(StaticFieldsExample.myStaticNumber);

        //Odwołanie się do pola niestatycznego poprzez nazwę klasy (bezutworzenia obiektu)
        //KOMPILATOR ZGŁOSI BŁĄD!!!
        //   System.out.println(StaticFieldsExample.myNumber);

        //Utworzenie obiektu klasy StaticFieldsExample
        StaticFieldsExample staticFieldsExample = new StaticFieldsExample();
        //Dostęp do pola poprzez obiekt
        System.out.println(staticFieldsExample.myNumber);
    }
}
