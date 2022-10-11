package loops;

public class ForExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Jest to krok numer = " + i);
        }

        int result = 0;
        for (int i = 0; i < 10; i++) { //i = i + 1
            result = result + i;
        }
        System.out.println("Suma cyfr = " + result);

        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random() * 101));
        }

        for (int i = 0; i < 100; i = i +3) {
            System.out.println("i = " + i);
        }
    }
}
