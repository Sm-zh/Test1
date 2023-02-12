import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Lab19 {
    public static void main(String[] args) {
        Student[] stu1;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/Users/Nawaf/Downloads/unsortedStudents.dat"))) {
            stu1 = (Student[]) in.readObject();
            Arrays.sort(stu1);
            System.out.println(Arrays.toString(stu1));
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sortedStudent.dat"))) {
                out.writeObject(stu1);
            }
            catch (IOException e1) {
                e1.printStackTrace();
            }

        }
        catch (IOException e1) {
            e1.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }
}