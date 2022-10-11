package casting;

public class Casting {

    public static void main(String[] args) {
        double someDouble = 10.3532348678678678697868796987d;
        float someFloat= 17.1214f;

        long someLong = 117L;
        int someInt = 57;

        short someShort = 12;
        byte someByte = 99;

        char someChar = 'A';

        //Przykłady na double
        System.out.println("Testowanie double'a");
        double testDouble;
        testDouble = someDouble;
        System.out.println("My test double = " + testDouble);
        testDouble = someFloat;
        System.out.println("My test double = " + testDouble);
        testDouble = someLong;
        System.out.println("My test double = " + testDouble);
        testDouble = someInt;
        System.out.println("My test double = " + testDouble);
        testDouble = someShort;
        System.out.println("My test double = " + testDouble);
        testDouble = someByte;
        System.out.println("My test double = " + testDouble);
        testDouble = someChar;
        System.out.println("My test double = " + testDouble);

        //Przerwa w tekscie
        System.out.println(" ");

        //Przykłady na long
        System.out.println("Testowanie longa");
        long testLong;
        testLong = someLong;
        System.out.println("My test long = " + testLong);
        testLong = someInt;
        System.out.println("My test long = " + testLong);
        testLong  = someShort;
        System.out.println("My test long = " + testLong);
        testLong = someByte;
        System.out.println("My test long = " + testLong);
        testLong = someChar;
        System.out.println("My test long = " + testLong);

        System.out.println(" ");

        System.out.println("PRZYPADKI UTRATY DANYCH!!!");
        //PRZYPADKI NIEPOZADANE - UTRATA INFORMACJI
        float testFloat = (float) someDouble;
        System.out.println("Some double = " + someDouble);
        System.out.println("Test float = " + testFloat);

        testLong = (long) someDouble;
        System.out.println("Some double = " + someDouble);
        System.out.println("Test long = " + testLong);

        long someLong2 = 92233720368787L;
        int testInt = (int) someLong2;
        System.out.println("Some long = " + someLong2);
        System.out.println("Test int = " + testInt);

    }
}
