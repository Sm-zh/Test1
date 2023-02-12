package Lab18;

public class Student implements Comparable<Student>{
    private int id;
    private  String name;

    public Student() {
        
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "ID: " + id + " Name: " + name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.id > o.id) {
            return 1;
        }
        else if (this.id == o.id) {
            return 0;
        }

        else {
            return -1;
        }
    }
}
