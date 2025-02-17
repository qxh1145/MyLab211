package week4.Short105.controller;

import week4.Short105.model.TeacherAndStudent;
import week4.Short105.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAndStudentManagement extends Menu<String> {
    private Scanner scanner;
    TeacherAndStudent teacherAndStudent = new TeacherAndStudent();

    public StudentAndStudentManagement() {
        super("*** Information Management ***", new String[] {"Student", "Teacher", "Person", "Exit"});
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1 -> {
                try {
                    studentSubMenu();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            case 2 ->
                teacherSubMenu();
            case 3 ->
                personSubMenu();
            case 4 -> {
                System.out.println("Exiting...");
                stop();
            }
            default ->
                System.out.println("Invalid choice. Please choose again.");
        }
    }

    private void studentSubMenu() throws Exception {
        Menu<String> studentMenu = new Menu<>("***Student Management***", new String[] {"Input", "Print", "Exit"}) {
            @Override
            public void execute(int choice) throws Exception {
                switch (choice) {
                    case 1 -> {
                        System.out.println("Input student data");
                        teacherAndStudent.addStudent();
                    }
                    case 2 -> {
                        System.out.println("Print student data");
                        teacherAndStudent.displayStudent();
                    }
                    case 3 -> {
                        System.out.println("Exiting student sub menu...");
                        stop();
                    }

                    default ->
                        System.out.println("Invalid choice. Please choose again.");
                }
            }
        };
        studentMenu.run();
    }

    private void teacherSubMenu() {
        Menu<String> teacherMenu = new Menu<>("***Teacher Management***", new String[] {"Input", "Print", "Exit"}) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1 -> {
                        System.out.println("Input teacher data");
                        teacherAndStudent.addTeacher();
                    }
                    case 2 -> {
                        System.out.println("Print teacher data");
                        teacherAndStudent.displayTeacher();
                    }
                    case 3 -> {
                        System.out.println("Exiting teacher sub menu...");
                        stop();
                    }
                    default ->
                        System.out.println("Invalid choice. Please choose again.");
                }
            }
        };

        try {
            teacherMenu.run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void personSubMenu() {
        Menu<String> personMenu = new Menu<>("Person Sub Menu", new String[] {"Search", "Print all", "Exit"}) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1 -> {
                        System.out.println("Search person data");
                        teacherAndStudent.search();
                    }
                    case 2 -> {
                        System.out.println("Print all person data");
                        teacherAndStudent.displayAll();
                    }
                    case 3 -> {
                        System.out.println("Exiting person sub menu...");
                        stop();
                    }
                    default -> {
                        System.out.println("Invalid choice. Please choose again.");
                    }
                }
            }
        };

        try {
            personMenu.run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        StudentAndStudentManagement mainMenu = new StudentAndStudentManagement();
        try {
            mainMenu.run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}