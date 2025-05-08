package Ex2;

public class NoGenericMethods {
    public static <T, U, V> void printThree(T a, U b, V c) {
        System.out.println("Arguments:");
        System.out.println("1: " + a);
        System.out.println("2: " + b);
        System.out.println("3: " + c);
    }
}