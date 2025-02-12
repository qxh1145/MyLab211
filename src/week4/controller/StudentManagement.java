package week4.controller;

import week4.model.StudentList;
import week4.view.Menu;

public class StudentManagement extends Menu<String> {
    static String[] menu = {
            " Create",
            " Find and Sort",
            " Update/Delete",
            " Report",
            " Exit"
    };

    private final StudentList studentList = new StudentList();

    public StudentManagement() {
        super("WELCOME TO STUDENT MANAGEMENT", menu);
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1 -> studentList.create();
            case 2 -> studentList.findAndSort();
            case 3 -> studentList.updateOrDelete();
            case 4 -> studentList.report();
            case 5 -> {
                System.out.println("Exiting program...");
                System.exit(0);
            }
            default -> System.out.println("Invalid choice! Please select a valid option.");
        }
    }

    public static void main(String[] args) {
        new StudentManagement().run();
    }
}
