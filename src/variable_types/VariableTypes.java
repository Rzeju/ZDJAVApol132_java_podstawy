package variable_types;

public class VariableTypes {

    public static void main(String[] args) {

        //TYPY PROSTE!!

        //typy liczb całkowitych

        int someInt = 10; // zajmuje 4 bajty danych(32 bity)
        long someLong = 10000L;// zajmuje 8 bajtów danych(64 bity)

        long int_result = someInt + someLong;
        System.out.println("Wynik dodawania = " + int_result);
        someInt += 15;
        System.out.println("SomeInt = " + someInt);

        someInt = 10;
        someInt = someInt + 15;
        System.out.println("SomeInt = " + someInt);

        //typy zmienno przecinkowe

        float someFloat = 3.14f; // zamuje 4 bajty, dokładność 6-7 miejsc po przecinku
        double someDouble = 3.14456983789d; // zamuje 8 bajty, dokładność 15 miejsc po przecinku

        double double_result = someFloat + someDouble;
        System.out.println("Wynik odejmowania zmiennych zmiennoprzecinkowych = " +  double_result);

        //typ logiczny

        boolean someTrue = true;
        boolean someFalse = false;

        System.out.println("Prawo to -> " + someTrue);
        System.out.println("Fałsz to ->" + someFalse);

        boolean and_result = someTrue && someFalse;
        boolean or_result = someTrue || someFalse;

        System.out.println("Wynik AND = " + and_result);
        System.out.println("Wynik OR = " +or_result);

        //typ znakowy

        char someChar = 'k';
        char nextChar = 'h';

        nextChar = 'l';

        System.out.println(someChar);
        System.out.println(nextChar);
        System.out.println(someChar + nextChar);

        // JEST TO TYP OBIEKTOWY!!!

        //typ łańcuchowy - tekst (łańcuch znaków 'charów')

        String someString = "This is some String!";
        System.out.println(someString);

        someString = someString + " New text";
        System.out.println(someString);
    }
}
