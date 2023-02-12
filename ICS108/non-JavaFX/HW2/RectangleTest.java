package HW2;

public class RectangleTest {
    public static void main(String[] args) {

        GeometricObject regtangle1 = new Rectangle(8, 6, "Red", true);
        GeometricObject regtangle2 = new Rectangle(6, 8, "Yellow", false);
        if (regtangle1.equals(regtangle2)) {
            System.out.println("Rectangle1 is equal to Rectangle2"); 
        }

        else {
            System.out.println("Rectangle1 is not equal to Rectangle2"); 
        }
    }
}
