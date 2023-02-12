package LabProject;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeMap;

public class MainReader {
    static File file = new File("C:\\Users\\Nawaf\\OneDrive\\DeskTop\\CourseOffering.txt");
    static File file2 = new File("C:\\Users\\Nawaf\\OneDrive\\DeskTop\\DegreePlan.txt");
    static File file3 = new File("C:\\Users\\Nawaf\\OneDrive\\DeskTop\\FinishedCourses.txt");

    public static TreeMap<String, Section> courses() {
        return COReader.cOReader(file, file2, file3);
    }

    public static TreeMap<String, ArrayList<String>> dPlan() {
        return DPReader.dPReader(file2);
    }

    public static ArrayList<String> fCourses(){
        return FCReader.fCReader(file3);
    }
}
