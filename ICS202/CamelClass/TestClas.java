package CamelClass;

public class TestClas {
    public static void main(String[] args) {
        short age = 48;
        Camel shirtit = new Camel(100.0f, age, "Shirtit", 'M');
        shirtit.eat();
        System.out.println(shirtit);

    }
}
