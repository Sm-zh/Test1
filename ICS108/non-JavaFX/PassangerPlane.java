public class PassangerPlane extends Plane {
    private int numberOfPassanger;
    private static int cost = 120;
    
    public PassangerPlane(int id, int numberOfPassanger) {
        super(id);
        this.numberOfPassanger = numberOfPassanger;
    }

    public static void setCost(int cost) {
        PassangerPlane.cost = cost;
    }

    public int getCost() {
        return cost * numberOfPassanger;
    }

    public int getPassanger() {
        return numberOfPassanger;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String status() {
        if (landed) {
            return "Passanger plane " + id + " on the ground";
        }

        else {
            return "Passanger plane " + id + " has took off\nThe cost: " + getCost();
        }
    }

    public int compareTo(PassangerPlane o) {
        if (getPassanger() > o.getPassanger()) {
            return 1;
        }
        else if (getPassanger() < o.getPassanger()){
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof PassangerPlane) {
            return ((PassangerPlane)this).getPassanger() == ((PassangerPlane)o).getPassanger();
        }
        else {
            return false;
        }
    }

}

