package Task12;

public class Undergraduate extends Student {

    public Undergraduate(int id, double gpa) {
        super(id, gpa);
    }

    @Override
    public String getStatus() {
        String status;
        if (super.getGpa() >= 3) {
            status = "Honor";
        }
        else if (super.getGpa() >= 2) {
            status = "Good";
        }
        else {
            status = "Probation";
        }
        return status;
    }
}