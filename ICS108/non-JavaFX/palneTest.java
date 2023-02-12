class palneTest {
    public static void main(String[] args) {
        Plane newPlane1 = new ShippingPlane(1, 50);
        Plane newPlane2 = new PassangerPlane(2, 50);
        Plane newPlane3 = new PassangerPlane(3, 50);
        newPlane2.takeOff();
        System.out.println(newPlane1.status());
        System.out.println(newPlane2.status());
        System.out.println(newPlane3.status());
        System.out.println(newPlane1.equals(newPlane3));
    }
}
