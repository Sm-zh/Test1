package HW2;
import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double side1, side2, side3;
        System.out.print("Enter the sides of the Triangle: ");
        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();
        System.out.print("Enter the color of the Triangle: ");
        String color = input.next();
        System.out.print("True or False, is the Triangle filled? ");
        Boolean filled = input.nextBoolean();
        GeometricObject triangle = new Triangle(side1, side2, side3, color, filled);
        System.out.print(triangle);
        input.close();
    }
}

