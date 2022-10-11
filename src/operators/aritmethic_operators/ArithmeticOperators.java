package operators.aritmethic_operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 0;

        c = a + b;
        System.out.println("Wynik dodawania: " + c);

        c = a - b;
        System.out.println("Wynik odejmowania: " + c);

        c = a * b;
        System.out.println("Wynik mnożenia: " + c);

        c = b / a;
        System.out.println("Wynik dzielenia: " + c);

        c = b % a;
        System.out.println("Reszta z dzielenia: " + c);

        c = b % 4;
        System.out.println("Reszta z dzielenia: " + c);

        c += a;
        System.out.println("Wynik dodawani (skócona forma): " + c);
    }
}
