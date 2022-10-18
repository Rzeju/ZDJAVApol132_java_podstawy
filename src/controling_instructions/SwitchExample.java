package controling_instructions;

//import klasy Scanner
//Klasy znajdujące się w innych pakietach trzeba zaimportować aby były dostępne i gotowe od użycia w naszej klasie
//W tym przypadku jest to klasa narzędziowa java, poznajemy to po nazwach pakietów
//java.util.Scanner --> (java.utilities.Scanner = java.narzędzia.Scanner)
import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        //zmienna pomocnicza
        //używamy jest w instrukcji case
        //służy to pokazaniu, że dany case może zawierać różne instrukcji (w tym przypadku if->else)
        int someNumber = 11;

        //Utworzneie scanner, będzie służył do wprowadzania wartość z konsoli
        Scanner scanner = new Scanner(System.in);
        //Zmienna pod, którą przypiszemy wartość z konsoli
        int numberOfTheDay;
        //Informacja dla użytkownika programu
        System.out.print("Podaj liczbę = ");
        //Przypisanie wartość podanej przez użytkownika w konsoli
        //Pamiętaj aby podać liczbę załkowitą (int)
        //W przeciwnym razie program zakończy się błędem
        numberOfTheDay = scanner.nextInt();

        //Instrukcja switch wywoływana dla na zmiennej numberOfTheDay
        switch (numberOfTheDay) {
            //Przypadek dla numberOfTheDay = 1
            case 1:
                System.out.println("Poniedziałek");
                //Przykład instrukcji if w jednym w przypadków switcha
                //w warunku zastosowana dzielenie modulo 2 (reszta z dzielenia przez 2)
                if (someNumber % 2 == 0) {
                    System.out.println("Liczba jest parzysta");
                } else {
                    System.out.println("Liczba jest nieparzysta");
                }
                //Zakończenie przypadku dla tego warunku switcha
                //Break przerywa działa instrukcji w której jest wywołany (tutaj konkretny case)
                break;
            //Przypadek dla numberOfTheDay = 2
            case 2:
                System.out.println("Wtorek");
                //Zakończenie przypadku dla tego warunku switcha
                //Break przerywa działa instrukcji w której jest wywołany (tutaj konkretny case)
                break;
            //Przypadek dla numberOfTheDay = 3
            case 3:
                System.out.println("Środa");
                //Zakończenie przypadku dla tego warunku switcha
                //Break przerywa działa instrukcji w której jest wywołany (tutaj konkretny case)
                break;
            //Przypadek dla numberOfTheDay = 4
            case 4:
                System.out.println("Czwartek");
                //Zakończenie przypadku dla tego warunku switcha
                //Break przerywa działa instrukcji w której jest wywołany (tutaj konkretny case)
                break;
            //Przypadek dla numberOfTheDay = 5
            case 5:
                System.out.println("Piątek");
                //Zakończenie przypadku dla tego warunku switcha
                //Break przerywa działa instrukcji w której jest wywołany (tutaj konkretny case)
                break;
            //Przypadek dla numberOfTheDay = 6
            case 6:
                System.out.println("Sobota");
                //Zakończenie przypadku dla tego warunku switcha
                //Break przerywa działa instrukcji w której jest wywołany (tutaj konkretny case)
                break;
            //Przypadek dla numberOfTheDay = 7
            case 7:
                System.out.println("Niedziela");
                //Zakończenie przypadku dla tego warunku switcha
                //Break przerywa działa instrukcji w której jest wywołany (tutaj konkretny case)
                break;
            //Blok default dla wszystkich pozostałych przypadków
            default:
                System.out.println("Nie ma takiego dnia tygodnia");
                //Zakończenie przypadku dla tego warunku switcha
                //Break przerywa działa instrukcji w której jest wywołany (tutaj konkretny case)
                break;
        }

        System.out.println("Dalszy kod programu");

    }
}
