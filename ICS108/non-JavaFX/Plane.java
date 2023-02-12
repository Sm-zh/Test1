public abstract class Plane {
    public int id;
    public boolean landed = true;

    public Plane(int id) {
        this.id = id;
    }

    public void landed() {
        landed = true;
    }

    public void takeOff() {
        landed = false;
    }
    public abstract int getID();
    public abstract String status();
    public abstract boolean equals(Object o);

}

