public class ShippingPlane extends Plane {
    private double load;
    private static double cost = 50;

    public ShippingPlane(int id, double load) {
        super(id);
        this.load = load;
    }

    public static void setCost(int cost) {
        ShippingPlane.cost = cost;
    }

    public double getCost() {
        return load * cost; 
    }

    public double getLoad() {
        return load; 
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String status() {
        if (landed) {
            return "The Shipping plane " + id + " on the ground";
        }

        else {
            return "The Shipping plane " + id + " has took off\nThe cost: " + getCost();
        }
    }

    public int compareTo(ShippingPlane o) {
        if (getLoad() > o.getLoad()) {
            return 1;
        }
        else if (getLoad() < o.getLoad()){
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ShippingPlane) {
        return ((ShippingPlane)this).getLoad() == ((ShippingPlane)o).getLoad();
        }
        else {
            return false;
        }
    }
}
