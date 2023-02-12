import java.util.Scanner;

public class Lab17_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letter = input.next();
        try {
            Grade(letter);
        }
        catch(Exception e) {
            System.out.println("Invalid grade");
        }
        input.close();
    }
    
    public static void Grade(String letter) throws Exception {
        String[] grades = {"A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};
        double[] points = {4.0, 3.75, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        boolean cond = false;
        int index = 0;
        for (int i = 0; !cond && i < 9; i++) {
            if (grades[i].equals(letter)) {
                cond = true;
            }
            else {
                index++;
            }
        }
        if (cond) {
            System.out.println("The quality points " + points[index]);
        }
        else {
            throw new Exception();
        }
    }
    
}
