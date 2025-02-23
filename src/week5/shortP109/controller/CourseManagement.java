package week5.shortP109.controller;

import week5.shortP109.model.CourseList;
import week5.shortP109.view.Validation;

import java.util.Scanner;

public class CourseManagement {
    public static void main(String[] args) {
        CourseList courseList = new CourseList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Course\n2. Print All Courses\n3. Search Course\n4. Exit");
            int choice = Validation.getInt("Enter your choice: ", 1, 4);
            switch (choice) {
                case 1 -> courseList.addCourse();
                case 2 -> courseList.printCourses();
                case 3 -> courseList.searchCourse();
                case 4 -> { System.out.println("Exiting..."); return; }
            }
        }
    }
}
