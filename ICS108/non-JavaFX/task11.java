import Task10.*;

public class task11 {
    public static void main(String[] args) {
        Employee[] employeeArray = createEmployeeArray();
        printFullTimeEmployees(employeeArray);
        double avgSalary = avgSalaryFullTimeEmployees(employeeArray);
        System.out.println("avg salary of full-time employees = " + avgSalary);
        printPartTimeEmployees(employeeArray);
        double avgHours = avgHoursPartTimeEmployees(employeeArray);
        System.out.println("avg hours of part-time employees = " + avgHours);
    }


    public static Employee[] createEmployeeArray() {
        Employee[] employees = new Employee[5];
        employees[0] = new FullTimeEmployee(202000, "Nasir", 28000);
        employees[1] = new FullTimeEmployee(2019000, "Faris", 16000);
        employees[2] = new FullTimeEmployee(2022000, "Nawaf", 18000);
        employees[3] = new PartTimeEmployee(2020100, "Saif", 6);
        employees[4] = new PartTimeEmployee(2022200, "Mohammed", 9);
        return employees;
    }

    public static void printFullTimeEmployees(Employee[] employees) {
        System.out.println("Full-Time employees are:");
        for (int i = 0; i<employees.length; i++) {
             if (employees[i] instanceof FullTimeEmployee) {
                System.out.print(employees[i]);
            }
        }

    }

    public static double avgSalaryFullTimeEmployees(Employee[] employees) {
        int totalSalary = 0, count = 0;
        for (int i = 0; i<employees.length; i++) {
            if (employees[i] instanceof FullTimeEmployee) {
                totalSalary += ((FullTimeEmployee) employees[i]).getSalary();
                count +=1;
            } 

        }
        return (double)totalSalary/count;
    }

    public static void printPartTimeEmployees(Employee[] employees) {
        System.out.println("Part-Time employees are:");
        for (int i = 0; i<employees.length; i++) {
             if (employees[i] instanceof PartTimeEmployee) {
                System.out.print(employees[i]);
            }
        }
    }

    public static double avgHoursPartTimeEmployees(Employee[] employees) {
        int totalHours = 0, count = 0;
        for (int i = 0; i<employees.length; i++) {
            if (employees[i] instanceof PartTimeEmployee) {
                totalHours += ((PartTimeEmployee) employees[i]).getHours();
                count += 1;
            } 

        }
        return (double)totalHours/count;
    }
}