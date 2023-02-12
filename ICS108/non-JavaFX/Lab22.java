import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab22 {
    public static void main(String[] args) throws Exception {
        File firstFile = new File("C:/Users/Nawaf/1st.txt");
        File secondFile = new File("C:/Users/Nawaf/2nd.txt");
        File newFile = new File("mergedFile.txt");
        try (Scanner in1 = new Scanner(firstFile); Scanner in2 = new Scanner(secondFile);) {
            PrintWriter mergedFile = new PrintWriter(newFile);
            int a = in1.nextInt();
            int b = in2.nextInt();
            while (in1.hasNext() && in2.hasNext()) {
                if (a < b) {
                    mergedFile.print(a + " ");
                    a = in1.nextInt();
                }
                else if (a == b) {
                    mergedFile.print(a + " " + b + " ");
                    a = in1.nextInt();
                    b = in2.nextInt();

                }
                else {
                    mergedFile.print(b + " ");
                    b = in2.nextInt();

                }
            }
            if (a < b) {
                mergedFile.print(a + " " + in1.nextInt());
            }
            else if (a == b) {
                mergedFile.print(a + " ");

            }
            else {
                mergedFile.print(b + " " + in2.nextInt());

            }
            if (firstFile.length() < secondFile.length()) {
                while (in2.hasNext()) {
                    mergedFile.print(b + " ");
                    b = in2.nextInt();

                }
            }

            else if (firstFile.length() > secondFile.length()) {
                while (in1.hasNext()) {
                    mergedFile.print(a + " ");
                    a = in1.nextInt();

                }
            }
            mergedFile.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}