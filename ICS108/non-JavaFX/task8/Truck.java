package task8;

public class Truck extends Vehicle {
    private double load;

    public Truck(int id, int wheels, double load) {
        super();
        this.load = load;

    }

    public String toString() {
        return super.toString() + " " + load;
    }
    
}
