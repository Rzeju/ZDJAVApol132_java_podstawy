package operators.aritmethic_operators;

public class RelationsOperators {

    public static void main(String[] args) {
        //Zmienne pomocnicze
        boolean result;

        //Zmienne pomocnicze
        boolean myTrue = true;
        boolean myFalse = false;

        //Zmienne pomocnicze
        int x = 17;
        int y = 21;
        long z = 35;

        //Wyniki logiczne nierówności i porównań liczbowych
        //Czy x większy od y
        result = x > y;
        System.out.println("x > y -> " + result);

        // Zaprzeczenie wyrażenia x > y
        result = !(x > y);
        System.out.println("!(x > y) -> " + result);

        //Porównanie x i y, czy x = y???
        result = x == y;
        System.out.println("x == y -> " + result);

        //zaprzeczenie wyrażenia x == y, dosłownie tłumacząc x nie równa się y ???
        result = x != y;
        System.out.println("x != y -> " + result);

        //|Czy z większe od x
        result = z > x;
        System.out.println("z > x -> " + result);

        //Czy z równe y
        result = z == y;
        System.out.println("z == y -> " + result);

        //Wyniki działań logicznych
        //Iloczyn logiczny, koniunkcja, "i"
        result = myTrue && myFalse;
        System.out.println("myTrue && myFalse -> " + result);

        //Suma logiczna, alternatywa, "lub"
        result = myTrue || myFalse;
        System.out.println("myTrue || myFalse -> " + result);

        //Zaprfzeczenie iloczynku logicznego
        result = !(myTrue && myFalse);
        System.out.println("!(myTrue && myFalse) -> " + result);
    }
}
