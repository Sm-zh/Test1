package Task10;

public class PartTimeEmployee extends Employee {
    private int hours;

    public PartTimeEmployee(int id, String name, int hours) {
        super(id, name);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public String toString() {
        return super.toString() + " Number of hours: " + hours + "\n";
    }
}
