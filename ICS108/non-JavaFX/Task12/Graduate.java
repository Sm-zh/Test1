package Task12;

public class Graduate extends Student {

    public Graduate(int id, double gpa) {
        super(id, gpa);
    }

    @Override
    public String getStatus() {
        String status;
        if (super.getGpa() >= 3) {
            status = "Good";
        }
        else {
            status = "probation";
        }
        return status;
    }
}