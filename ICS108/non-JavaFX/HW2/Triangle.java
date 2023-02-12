package HW2;

public class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle(){
	} 

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double semiPerimeter = this.getPerimeter()/2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
    }

    public double getPerimeter() {
        return side1+side2+side3;
    }

    public String toString() {
		return super.toString() + "\nArea: " + getArea() +  " Perimeter: " + getPerimeter(); 
	}
}