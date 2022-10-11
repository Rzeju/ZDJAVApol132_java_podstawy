package loops;

public class BreakAndContinueExample {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            //System.out.println("Przed continue");
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }

        int j = 0;
        while (true) {
            if (j > 50) {
                break;
            }
            j++;
        }
        System.out.println("j = " + j);

        //PRZYKLAD WADLIWEJ KOLEJNOSCI continue i break
        for (int i = 0; i < 100; i++) {
            //System.out.println("Przed continue");
            if (i > 40) {
                System.out.println("i = " + i);
                break;
            }
            if (i == 40) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
