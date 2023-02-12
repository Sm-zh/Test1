package Task10;

public class FullTimeEmployee extends Employee {
    private double salary;
    public static int x = 702;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    public String toString() {
        return super.toString() + " Salary: " + salary + "\n";
    }
    public static void main(String[] args) {
		Employee employee = new PartTimeEmployee(1122, "Saif", 6);
		System.out.print(employee + " " + x);
	 }
}
