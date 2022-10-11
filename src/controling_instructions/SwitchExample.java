package controling_instructions;


import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        int someNumber = 11;

        Scanner scanner = new Scanner(System.in);
        int numberOfTheDay;
        System.out.print("Podaj liczbę = ");
        numberOfTheDay = scanner.nextInt();

        switch (numberOfTheDay) {
            case 1:
                System.out.println("Poniedziałek");
                if (someNumber % 2 == 0) {
                    System.out.println("Liczba jest parzysta");
                } else {
                    System.out.println("Liczba jest nieparzysta");
                }
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nie ma takiego dnia tygodnia");
                break;
        }

        System.out.println("Dalszy kod programu");

    }
}
