package standard_in_out;

import java.util.Scanner;

public class StdInOutExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nextLine = scanner.nextLine();
        System.out.println(scanner);
        System.out.println(nextLine);

        int nextInt = scanner.nextInt();
        System.out.println(nextInt);

        double nextDouble = scanner.nextDouble();
        System.out.println(nextDouble);

        boolean nextBoolean = scanner.nextBoolean();
        System.out.println(nextBoolean);



    }
}
