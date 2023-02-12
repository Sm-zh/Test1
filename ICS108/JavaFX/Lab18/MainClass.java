package Lab18;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        File aFile = new File("unsortedStudents.txt");
        try (Scanner input = new Scanner(aFile)) {
            int size = input.nextInt();
            Student[] students = new Student[size];
            for (int i = 0; input.hasNextLine() && i < size; i++) {
                students[i] = new Student(input.nextInt(), input.next());
            }
            Arrays.sort(students);
            File nFile = new File("sortedStudentsByID.txt"); 
            
            try (PrintWriter sFile = new PrintWriter(nFile)){
                for (int i = 0; i < 10; i++) {
                    sFile.println(students[i]);
                }
                sFile.close();
            }
            catch(FileNotFoundException e) {
                e.printStackTrace();

            }

        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }   
    }
}
