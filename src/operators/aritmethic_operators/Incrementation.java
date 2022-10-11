package operators.aritmethic_operators;

public class Incrementation {

    public static void main(String[] args) {
        int i =0;

        //Inkrementacja -> i = i + 1 lub i += 1
        System.out.println("Wartość zmiennej przed pierwszą inkrementacji i = " + i);

        System.out.println("Wywołanie postinkrementacji i = " + i++);

        System.out.println("Wartośc zmiennej po postinkrementacji i = " + i);

        System.out.println("Wywołanie preinkrementacji i = " + ++i);

        System.out.println("Wartośc zmiennej po preinkrementacji i = " + i);

        //Dekrementacja -> i = i - 1 lub i -= 1

        i = 10;

        System.out.println("Wywołanie postdekrementacji i = " + i--);

        System.out.println("Wartośc zmiennej po postdekrementacji i = " + i);

        System.out.println("Wywołanie predekrementacji i = " + --i);

        System.out.println("Wartośc zmiennej po predekrementacji i = " + i);
    }
}
