package arrays;

public class OneDimensionArrayExample {

    public static void main(String[] args) {

        int[] myIntArray = new int[5];

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[2]);

        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;
        myIntArray[4] = 5;

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[3]);
        System.out.println(myIntArray[4]);
        //System.out.println(myIntArray[10]);

        System.out.println(" ");
        System.out.println("Inicjalizacja tablicy poprzez pętle ");
        int[] newArray = new int[10];
        System.out.println("Długość tablicy = " + newArray.length);
        for (int i = 0; i < 10; i++){
            newArray[i] = i + 100;
        }

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = i + 100;
        }

        System.out.println("Wyświetlenei zawartości tablicy (for)");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        System.out.println("Wyświetlenei zawartości tablicy (foreach)");
        for (int element: newArray) { //for each
            System.out.println(element);
        }

        System.out.println("Inicjalizacja tablic z wartosciami");
        int[] array_1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array_2 = {1, 2, 3, 4, 5, 6};

        for (int i_1 : array_1) {
            System.out.println(i_1);
        }

        for (int i_2 : array_2) {
            System.out.println(i_2);
        }

        System.out.println(array_1);
        System.out.println(array_2);
    }
}
