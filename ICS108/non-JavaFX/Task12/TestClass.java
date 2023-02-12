package Task12;

public class TestClass {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i< 10; i++) {
            int id = (int) (Math.random() * (1000000)) + 1;
            double gpa = (Math.random() * (4));
            int op = (int) (Math.random() * (2));
            if (op == 0) {
                students[i] = new Graduate(id, gpa);
            }
            else {
                students[i] = new Undergraduate(id, gpa);
            }
        }
        for (Student student: students) {
            System.out.println(student);
        }
    }
}


