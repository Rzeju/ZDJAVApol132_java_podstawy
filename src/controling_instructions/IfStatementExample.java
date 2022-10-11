package controling_instructions;

public class IfStatementExample {

    public static void main(String[] args) {

        int someNumber = (int) (1001 * Math.random());

        if (someNumber < 300) {
            System.out.println("Wylosowana liczba jest minejsza od 300 -> " + someNumber);
        } else if (someNumber < 600) {
            System.out.println("Wylosowana liczba jest mniejsza od 600 ale wieksza od 300 -> " + someNumber);
        } else if (someNumber < 1000) {
            System.out.println("Wylosowana liczba jest mniejsza od 1000 ale większa od 600 -> " + someNumber);
        } else {
            System.out.println("Twoj szczęśliwy numerek");
        }

        System.out.println("Dalszy ciąg programu");

        someNumber -= 10000;

        System.out.println("Wartość produkut po odjęciu prowizji = " + someNumber);
    }
}
