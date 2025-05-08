package Ex1;

public class MainNoGenericMethods {
    public static void main(String[] args) {
        NoGenericMethods example = new NoGenericMethods("HI!", "See You!!!", "Good Morning Vietnam!!!!");
        example.printAll();

        NoGenericMethods numbers = new NoGenericMethods(1, 2, 3);
        numbers.printAll();
    }
}