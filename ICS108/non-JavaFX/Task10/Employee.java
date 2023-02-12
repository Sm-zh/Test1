package Task10;

public class Employee {
    private int id;
    private String name;

    public Employee() {
        this(0, "");
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + " Name: " + name;
    }

    public Employee[] createEmployeeArray() {
        Employee[] employees  = new Employee[4];
        employees[0] = new FullTimeEmployee(202000, "Nasser", 28000);
        employees[1] = new FullTimeEmployee(2019000, "Faris", 16000);
        employees[2] = new FullTimeEmployee(2022000, "Nawaf", 18000);
        employees[3] = new PartTimeEmployee(2020100, "Saif", 6);
        return employees;
    }
}