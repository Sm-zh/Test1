package task8;

public class Vehicle {
    private int id;
    private int wheels;

    public Vehicle() {
    }
    
    public Vehicle(int id, int wheels) {
        this.id = id;
        this.wheels = wheels;
    }
    

    public String toString() {
        return id + " " + wheels;
    }
}
