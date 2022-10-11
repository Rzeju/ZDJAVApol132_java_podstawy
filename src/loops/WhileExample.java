package loops;

public class WhileExample {

    public static void main(String[] args) {

        int i = 0;
        while(i < 10) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println(" ");
        System.out.println("Druga pętla");

        int sum = 0;
        i = 0;
        while(i < 40) {
            System.out.println("i = " + i);
            sum = sum + i;
            i = i + 2;
        }

        System.out.println("Suma liczb = " + sum);

        System.out.println(" ");
        System.out.println("Trzecia pętla");

        i = 10;
        while(i >= 0) {
            System.out.println("i = " + i);
            i--;
        }

        i = 5;
        while (i < 4) {
            System.out.println("Ta pętla się nie wykona");
        }

        System.out.println(" ");
        System.out.println("Czwarta pętla");

        i = 0;
        int j = 0;
        int k = 0;
        while (i < 10) {
            j++;
            ++k;
            System.out.println("Wartość j = "  + j++);
            System.out.println("Wartosc k = " + ++k);
            i++;
        }
    }
}
