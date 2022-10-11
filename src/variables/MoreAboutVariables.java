package variables;

public class MoreAboutVariables {

    private final int globalVariable = 10;

    public void someMethod() {
        int localVariable;

        localVariable = globalVariable / 2;
        System.out.println("My global variable = " + globalVariable);
        System.out.println("My local variable = " + localVariable);

        //globalVariable = 22;
    }

    public static void main(String[] args) {
        MoreAboutVariables myObject = new MoreAboutVariables(); // tworze obiekt typu MoreAboutVariables
        myObject.someMethod();

        int methodResult = myObject.calculate();
        System.out.println("Metoda zwróciła wynik = " + methodResult);
    }


    public int calculate() {
        int localVariable = 100;

        int result = globalVariable * localVariable;

        return result;
    }
}
