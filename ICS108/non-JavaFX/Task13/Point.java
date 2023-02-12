package Task13;
import java.util.Arrays;

public class Point implements Comparable<Point>, Cloneable {
    private double x, y;

    	public Point() {
		this(0, 0);
	}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;   
    }
    
    public double distance() {
        return Math.sqrt(Math.pow(this.getX(),2)+Math.pow(this.getY(),2));
    }

    @Override
    public int compareTo(Point o) {
        if (this.distance() > o.distance()) {
            return 1;
        }
        else if (this.distance() < o.distance()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Point = (" + x + ", "+ y + ")";
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        Point point = (Point) super.clone();
        return point; 
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Point[] points = new Point[3];
        points[0] = new Point(7, 2);
        points[1] = new Point(0, 6);
        points[2] = new Point(3, 2);


        System.out.println("Before sorting:");
        for (int i = 0; i < points.length; i++) {
            System.out.println(i +""+ points[i]);
        }

        Arrays.sort(points);

        System.out.println("After sorting:");
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }

        Point[] clonedPoints = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            clonedPoints[i] = points[i].clone();
        }

        System.out.println("Cloned points:");
        for (int i = 0; i < points.length; i++) {
            System.out.println(clonedPoints[i]);
        }
    }
}