package loops;

public class DoWhileExample {

    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 10);

        do {
            System.out.println("W nieskończoność");
            i++;
        } while (i < 20);
    }
}
