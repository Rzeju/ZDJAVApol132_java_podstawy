package operators.aritmethic_operators;

public class RelationsOperators {

    public static void main(String[] args) {
        boolean result;

        boolean myTrue = true;
        boolean myFalse = false;

        int x = 17;
        int y = 21;
        long z = 35;

        result = x > y;
        System.out.println("x > y -> " + result);

        result = !(x > y);
        System.out.println("!(x > y) -> " + result);

        result = x == y;
        System.out.println("x == y -> " + result);

        result = x != y;
        System.out.println("x != y -> " + result);

        result = myTrue && myFalse;
        System.out.println("myTrue && myFalse -> " + result);

        result = myTrue || myFalse;
        System.out.println("myTrue || myFalse -> " + result);

        result = !(myTrue && myFalse);
        System.out.println("!(myTrue && myFalse) -> " + result);

        result = z > x;
        System.out.println("z > x -> " + result);

        result = z == y;
        System.out.println("z == y -> " + result);
    }
}
