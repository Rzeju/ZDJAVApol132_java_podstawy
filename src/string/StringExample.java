package string;

public class StringExample {

    public static final String SOME_CONSTANT = " HELLO";

    public static void main(String[] args) {

        String myString = "My String";
        myString += " New Text"; // myString = myString + "New Text"
        // i = i + 3 --> i += 3;
        myString += SOME_CONSTANT;

        String newString = myString.intern();

        System.out.println(myString);
        System.out.println(newString);

        String objectString = new String("Hiho");
        String intern = objectString.intern();

        //Konkatenacja Stringów
        String text1 = "My name is ";
        String text2 = "John Doe";
        String finalText = text1 + text2;
        System.out.println(finalText);

        String text3 = "This is ";
        String text4 = "a test";
        String finalText2 = text3.concat(text4);
        System.out.println(finalText2);

        //Porównywanie Stringów
        System.out.println(finalText.equals(finalText2));
        String test1 = "Test";
        String test2 = "Test";
        System.out.println(test1.equals(test2));

        //Metody klasy String
        System.out.println("This is test value".length());
        System.out.println(finalText.toUpperCase());
        System.out.println(finalText.toLowerCase());

        String testValue = "This is test value";
        System.out.println(testValue.indexOf("is"));
        System.out.println(testValue.replaceAll("s", "P"));

    }
}
