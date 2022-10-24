package statics.static_fields;

public class StaticFieldsExample {
    //Pole obiektowe (każdy obiekt posiada swoją kopię tego pola)
    //Każdy obiekt może mieć inną wartość tego pola
    public int myNumber = 10;
    //Pole klasowe (jest wspólne dla wszystkich obiektów w tej klasie)
    //Każdy obiekt ma dostęp dotej samej wartości
    public static int myStaticNumber = 15;
}
