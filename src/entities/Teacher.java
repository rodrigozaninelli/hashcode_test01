package entities;

import java.util.HashSet;

public class Teacher extends Usuario{

    private HashSet<Course> courses;

    public Teacher(int userNumber, String userName) {
        super(userNumber, userName);
        HashSet<Course> courses = new HashSet<>();
    }

    public HashSet<Course> getCourses() {
        return courses;
    }

    public void addCourses(Course course) {
        courses.add(course);
    }
}
