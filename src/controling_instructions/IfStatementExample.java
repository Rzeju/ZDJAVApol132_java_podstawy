package controling_instructions;

public class IfStatementExample {

    public static void main(String[] args) {

        //Wygenerowanie liczby losowej
        int someNumber = (int) (1001 * Math.random());

        //Sprawdzenie czy wynik losowania jest mniejszy od 300
        if (someNumber < 300) {
            //Jeśli mniejszy od 300 wykonaj poniższy kod
            System.out.println("Wylosowana liczba jest minejsza od 300 -> " + someNumber);
        //Sprawdzenie czy wylosowana liczba jest mniejsz aod 600
        } else if (someNumber < 600) {
            //Jeśli mniejszy od 600 wykonaj poniższy kod
            System.out.println("Wylosowana liczba jest mniejsza od 600 ale wieksza od 300 -> " + someNumber);
        //Sprawdzenie czy wylosowana liczba jest mniejsz aod 1000
        } else if (someNumber < 1000) {
            //Jeśli mniejszy od 600 wykonaj poniższy kod
            System.out.println("Wylosowana liczba jest mniejsza od 1000 ale większa od 600 -> " + someNumber);
        //W przypadku jeśli żaden warunek nie zostanie spełniony wykonuje się blok else
        } else {
            //Kod uruchomi się w przypadku nie spełnienia żadnego z warunków
            System.out.println("Twoj szczęśliwy numerek");
        }

        System.out.println("Dalszy ciąg programu");
    }
}
