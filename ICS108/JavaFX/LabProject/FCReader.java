package LabProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FCReader {
    public static ArrayList<String> fCReader(File file) {
        ArrayList<String> fCourses = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while(input.hasNext()){
                String word = input.nextLine();
                fCourses.add((word.split(","))[0]);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fCourses;
    }
    
}
