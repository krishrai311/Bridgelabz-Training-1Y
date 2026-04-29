package com.gla.Storybased;

import java.util.*;
class Student {
    int id;
    String name;
    List<String> courses;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }
}

class RegistrationSystem {
    static HashMap<Integer, Student> students = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Register Course");
            System.out.println("3. View Registrations");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: registerCourse(); break;
                case 3: viewRegistrations(); break;
                case 4: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        if (students.containsKey(id)) {
            System.out.println("Student ID already exists!");
            return;
        }

        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        students.put(id, new Student(id, name));
        System.out.println("Student added successfully!");
    }

    static void registerCourse() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        if (!students.containsKey(id)) {
            System.out.println("Student not found!");
            return;
        }

        sc.nextLine();
        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        Student s = students.get(id);

        if (s.courses.contains(course)) {
            System.out.println("Already registered for this course!");
        } else {
            s.courses.add(course);
            System.out.println("Course registered successfully!");
        }
    }

    static void viewRegistrations() {
        for (Student s : students.values()) {
            System.out.println("\nID: " + s.id + ", Name: " + s.name);
            System.out.println("Courses: " + s.courses);
        }
    }
}
