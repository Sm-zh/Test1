import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

import LabProject.Course;
import LabProject.Section;
import LabProject.Student;

public class Insets {
    public static void main(String[] args) {
        TreeMap<String, Section> courses = new TreeMap<>();        
        File file = new File("C:\\Users\\Nawaf\\OneDrive\\DeskTop\\CourseOffering.txt");
        try (Scanner input = new Scanner(file)) {
            input.nextLine();
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] info = line.split(",");
                Course course = new Course("MATH 101", "PHYS 101");
                Section section = new Section(course, info[5] + " " + info[6], info[7]);
                Student finshedCourse = new Student("MATH 101");
                if ((course.getPrerequisite()).equals(finshedCourse.getFinishedCourses())) {
                    courses.put(info[0], section);
                }
                System.out.println(courses);
                // System.out.println(arr[0] + " " + arr[5] + " " + arr[6] + " " + arr[7]);
                // System.out.println((arr[0].split("-"))[0]);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
