package standard_in_out;

public class PrintExamples {

    public static void main(String[] args) {
        int myNumber = 125;
        System.out.println("This is a simple text");
        System.out.println(myNumber);

        double result = 100.0 / 3.0;
        System.out.printf("100.0 / 3.0 = %5.2f \n", 100.0 / 3.0);
        System.out.printf("100.0 / 3.0 = %5.2f \n", result);

        System.out.printf("100 / 3 = %4d", 100 / 3);
    }
}
