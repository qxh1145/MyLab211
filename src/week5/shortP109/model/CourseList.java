package week5.shortP109.model;

import week5.shortP109.view.Validation;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseList {

    private final ArrayList<Course> courses = new ArrayList<>();

    public void addCourse() {
        System.out.print("Online Course (O) or Offline Course (F): ");
        String choice = new Scanner(System.in).nextLine().trim().toUpperCase();
        Course course = (choice.equals("O")) ? new OnlineCourse() : new OfflineCourse();
        course.inputAll();
        courses.add(course);
        System.out.println("Course added successfully!");
    }

    public void printCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public void searchCourse() {
        String searchName = Validation.getString("Enter Course Name to Search: ");
        for (Course course : courses) {
            if (course.courseName.equalsIgnoreCase(searchName)) {
                System.out.println(course);
                return;
            }
        }
        System.out.println("Course not found.");
    }
}