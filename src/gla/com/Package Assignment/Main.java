Main Class (Outside Package)

        File: MainClass.java

import college.student.Student;
import college.faculty.Faculty;

public class MainClass {
    public static void main(String[] args) {

        Student s = new Student("Rahul", 101);
        Faculty f = new Faculty("Dr. Sharma", "Java");

        s.displayStudent();
        f.displayFaculty();
    }
}