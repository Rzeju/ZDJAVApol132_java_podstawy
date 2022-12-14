package repetition;

public class Arrays {

    public static void main(String[] args) {

        //Przykład utworzenia tablicy, jej elementy zostaną zainicjalizowane wartościami domyslnymi- czyli 0
        // myArray -> [0, 0, 0, 0, 0]
        int[] myArray = new int[5];

        //Przypisanie do elementów tablicy nowych wartości
        //Do elementow tablicy odwołuje się poprzez index
        myArray[0] = 2;
        myArray[1] = 7;
        myArray[2] = 5;
        myArray[3] = -5;
        myArray[4] = 1;

        //Przykład utworzenia tablicy wraz z podaniem konkretnych wartości elementów
        int[] newArray = {-10, 5, 9, 2, -17};
        System.out.println("Obecna wartość pierwszego elementu");
        System.out.println(newArray[0]);
        //Przypisanie nowej wartości do pierwszego elementu tablicy
        newArray[0] = 100;
        System.out.println("Nowa wartość pierwszego elementu");
        System.out.println(newArray[0]);

        //Przykład dostępu do długości tablicy
        System.out.println("Długości tablic");
        System.out.println(myArray.length);
        System.out.println(newArray.length);

        //Wyświetlanie tablic!!

        //Wyświetlenie zmiennej,do której przyporządkowana jest tablica wyświetla na ekranie referencję do tej tablicy
        //Zauważ, że te refernejcę są od siebie różne (wskazuja na inne tablice)
        System.out.println(myArray);
        System.out.println(newArray);

        //Wyświetlenie elementów tablicy na piechotę
        System.out.println("Pierwsza tablica, wyświetlanie na piechotę");
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);

        System.out.println("Wyświetlenie elementów tablicy pętlą for");
        //Wyświetlenie elementów tablicy w pętli for
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        System.out.println("Wyjście poza zakres tablicy");
        //Może się zdarzyć, że będziemy prosić o dostęp to elementu, który jest poza zakresem tablicy
        //Wtedy otrzymamy błąd w wykonywanym programie
        for (int i = 0; i < 10; i++) {
            System.out.println(newArray[i] + ", i = " + i);
        }
    }
}
