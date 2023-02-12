package CamelClass;

public class Camel {
    private float weight;
    private short age;
    private String name;
    private char gender;
    private boolean alive;

    public Camel() {
        alive = false;
    }

    public Camel(float weight, short age, String name, char gender) {
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.gender = gender;
        alive = true;
    }

    public String toString() {
        if (alive) {
            return "Camel name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nGender: " + gender + "\n";
        }
        return "The camel is dead";
    }

    public void age_me() {
        if (alive) 
            age++;
        else 
            System.out.println("Dead camel cannot age");
    }

    public void age_me(short age) {
        if (alive)
            this.age += age;
        else    
            System.out.println("Dead camel cannot age");
    }

    public void eat() {
        if (alive)
            weight += weight * ((Math.random() * (4.9) + 0.1)/100);
            
        else
            System.out.println("Dead camel cannot eat");
    }

    public float getWeight() {
        return weight;
    }
}