package Task12;

public abstract class Student {
    private int id;
    private double gpa;    

    public Student(int id, double gpa) {
        this.id = id;
        this.gpa = gpa;
    }
    public abstract String getStatus();

    public double getGpa() {
        return gpa;
    }

    public final String toString() {
        if (this instanceof Graduate) {
            return "Graduate ID>> " + id + ", GPA>> " + Math.round(gpa*100.0)/100.0 + ", Status>> " + getStatus();
        }
        else {
            return "Undergraduate ID>> " + id + ", GPA>> " + Math.round(gpa*100.0)/100.0 + ", Status>> " + getStatus();
        }
    } 
}

