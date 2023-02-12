package HW2;

public class ComparableCircleTest {
	public static void main(String[] args) {
		// Create two instances of ComparableCircle objects
		ComparableCircle comparableCircle1 = new ComparableCircle(27.5);
		ComparableCircle comparableCircle2 = new ComparableCircle(5);
        GeometricObject regtangle = new Rectangle(6, 80, "Yellow", false);

		// Display comparableCircles
		System.out.println("\nComparableCircle1:");
		System.out.println(comparableCircle1);
		System.out.println("\nComparableCircle2:");
		System.out.println(comparableCircle2+"\n");

		// Find and display the larger of the two ComparableCircle objects
        if (comparableCircle1.compareTo(comparableCircle2) == 1) {
            System.out.println("ComparableCircle1 is the larger of the two Circles"); 
        }
        
        else if (comparableCircle1.compareTo(comparableCircle2) == 0) {
            System.out.println("Two ComparableCircles are equale"); 
        }

        else {
            System.out.println("ComparableCircle2 is the larger of the two Circles"); 
        }

        if (regtangle.getArea() > comparableCircle2.getArea()) {
            System.out.println("Regtangle is the larger"); 
        }
        
        else if (regtangle.getArea() == comparableCircle2.getArea()) {
            System.out.println(" The regtangle and the ComparableCircles are equale"); 
        }

        else {
            System.out.println("ComparableCircle is the larger"); 
        }
        
	}
}