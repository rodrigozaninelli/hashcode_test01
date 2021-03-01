package entities;


import java.util.HashSet;

public class Course {

    private String courseName;
    private HashSet<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        HashSet<Student> students = new HashSet<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public HashSet<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student){
        students.add(student);
    }

}
