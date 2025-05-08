package Ex2;

public class MainEx2 {
    public static void main(String[] args) {
        Person p = new Person("Marc", "Marquez", 30);

        NoGenericMethods.printThree(p, "How you doing? ", 42);
        System.out.println("---");
        NoGenericMethods.printThree("Text", 3.14, p);
    }
}