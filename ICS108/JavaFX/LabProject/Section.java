package LabProject;
public class Section {
    private Course course;
    private String time;
    private String location;

    public Section(Course course, String time, String location) {
        this.course = course;
        this.time = time;
        this.location = location;
    }

    public Course getCourse() {
        return course;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public String toString() {
        return course + " Time: " + time + " Location: " + location;
    }
    
}