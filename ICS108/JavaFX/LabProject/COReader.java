package LabProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class COReader {
    public static TreeMap<String, Section> cOReader(File file, File file2, File file3) {
        TreeMap<String, Section> courses = new TreeMap<>(); 
        TreeMap<String, ArrayList<String>> dPcourses = new TreeMap<>();   
        dPcourses = DPReader.dPReader(file2);
        ArrayList<String> fcourse = new ArrayList<>();
        fcourse = FCReader.fCReader(file3);
        String[] courseName = new String[1];
        try (Scanner input = new Scanner(file)) {
            input.nextLine();
            while(input.hasNext()){
                String line = input.nextLine();
                String[] info = line.split(",");
                courseName = info[0].split("-");
                if (!fcourse.contains(courseName[0])) {
                    Course course = new Course((dPcourses.get(courseName[0])).get(0), (dPcourses.get(courseName[0])).get(0));
                    Section section = new Section(course, info[5] + " " + info[6], info[7]);
                    if (course.getPrerequisite().contains(";")) {
                        String[] prerequisites = (course.getPrerequisite()).split(";");
                        if (fcourse.contains((prerequisites[0])) && fcourse.contains((prerequisites[1]))) {
                            courses.put(info[0], section);
                        }
                    }
                    else if (fcourse.contains(course.getPrerequisite())) {
                        courses.put(info[0], section);
                    }
                }
            }
                
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }

}
