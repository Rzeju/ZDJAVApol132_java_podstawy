package arrays;

public class TwoDimensionArray {

    public static void main(String[] args) {

        //Utworzenie tablicy dwuwymiarowej bez podania liczby kolumn
        String[][] string2DArray_1 = new String[2][];
        //Elementy w wierszach tablicy nie są zainicjalizowane
        System.out.println(string2DArray_1[0]);
        System.out.println(string2DArray_1[1]);
        //Obrazowy przykład inicjalizacji tablicy powyżej
        //   1. null      ----> [null, null]
        //   2. null

        //Utowrzenie tablicy dwuwymiarowej z podaniem liczby kolumn
        String[][] string2DArray_2 = new String[2][3];
        System.out.println(string2DArray_2[0]);
        System.out.println(string2DArray_2[1]);
        System.out.println(string2DArray_2[0].length);
        System.out.println(string2DArray_2[1].length);
        //Wyświetlenie kilku elementów z tablicy
        System.out.println(string2DArray_2[0][0]);
        System.out.println(string2DArray_2[1][1]);

        //Obrazowy przykład inicjalizacji tablicy powyżej
        //  1. [ null, null, null ]   ----> [ [ null, null, null ], [ null, null, null ] ]
        //  2. [ null, null, null ]

        // (W przypadku gdyby tablica zawierała liczby) -> int[][] int2Dtable = new int[2][3]
        //  1. [ 0, 0, 0 ]
        //  2. [ 0, 0, 0 ]

        String[] array_1 = {"Stirng_1", "String_2", "String_3"};
        String[] array_2 = {"Stirng_4", "String_5", "String_6", "String_7"};

        //Porownanie referencji obecnych i nowych tablic
        System.out.println("Porównanie wierszy");
        System.out.println(string2DArray_1[0]);
        System.out.println(string2DArray_1[1]);
        System.out.println(array_1);
        System.out.println(array_2);

        string2DArray_1[0] = array_1;
        string2DArray_1[1] = array_2;

        //Wyswietlenie referencji po przypisaniu nowych wartosci
        System.out.println(string2DArray_1[0]);
        System.out.println(string2DArray_1[1]);

        //Wyświetlanie elementów tablicy (for)
        for (int i = 0; i < string2DArray_1.length; i++) {
            for (int j = 0; j < string2DArray_1[i].length; j++) {
                System.out.println(string2DArray_1[i][j]);
            }
        }

        //Wyświetlanie elementów tablicy (foreach)
        for (String[] strings : string2DArray_1) {
            for (String string : strings) {
                System.out.println(string);
            }
        }

        //Przyklad umieszczenia w tablicy String[2][3] tablicy o dlugości 3 oraz 4
        //Nie istotna jest długość tablicy a jedynie typ danych
        //Przypisywana jest referencja
        System.out.println("Wypisanie elementów drugiej tablicy");
        string2DArray_2[0] = array_1;
        string2DArray_2[1] = array_2;

        //Wyświetlanie elementów tablicy (for)
        for (int i = 0; i < string2DArray_2.length; i++) {
            for (int j = 0; j < string2DArray_2[i].length; j++) {
                System.out.println(string2DArray_2[i][j]);
            }
        }

        //Wyświetlanie elementów tablicy (foreach)
        for (String[] strings : string2DArray_2) {
            for (String string : strings) {
                System.out.println(string);
            }
        }
    }
}
