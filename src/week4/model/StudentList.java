package week4.model;

import week4.view.Validation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class StudentList extends ArrayList<Student> {

    private final Validation validation = new Validation();

    public StudentList() {
        super();
    }

    private void display(ArrayList<Student> studentLists) {
        if (studentLists.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("=".repeat(40));
        System.out.printf("%-20s %-10s %-15s%n", "Student Name", "Semester", "Course Name");
        System.out.println("=".repeat(40));
        studentLists.forEach(student ->
                System.out.printf("%-20s %-10d %-15s%n", student.getStudentName(), student.getSemester(), student.getCourseName())
        );
        System.out.println("=".repeat(40));
        System.out.println("Total students: " + studentLists.size());
    }

    public void display() {
        this.display(this);
    }

    public void create() {
            if (this.size() >= 3) {
                String check = validation.getString("Do you want to continue (Y/N)? ", "[YyNn]").toUpperCase();
                if (check.equals("N")) return;
            }
            String id = validation.getString("Enter student ID: ");
            String sName = validation.getString("Enter student name: ");
            String course = validation.getString("Enter course: ");
            int semester = validation.getInt("Enter semester: ");
            this.add(new Student(id, sName, course, semester));
            System.out.println("Student added successfully!");

    }

    public void findAndSort() {
        String find = validation.getString("Enter student name or part of name: ");
        ArrayList<Student> result = search(student -> student.getStudentName().toLowerCase().contains(find.toLowerCase()));

        if (result.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        result.sort(Comparator.comparing(Student::getStudentName));
        display(result);
    }

    private ArrayList<Student> search(Predicate<Student> p) {
        ArrayList<Student> result = new ArrayList<>();
        this.forEach(student -> {
            if (p.test(student)) {
                result.add(student);
            }
        });
        return result;
    }

    public void updateOrDelete() {
        String studentId = validation.getString("Enter student ID to find: ");
        Student student = this.stream().filter(s -> s.getStudentID().equals(studentId)).findFirst().orElse(null);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("Student found: " + student);
        String choice = validation.getString("Do you want to update (U) or delete (D)? ", "[UuDd]").toUpperCase();

        if (choice.equals("U")) {
            update(student);
        } else if (choice.equals("D")) {
            delete(student);
        }
    }

    private void update(Student student) {
        student.setStudentName(validation.getString("Enter new student name: "));
        student.setCourseName(validation.getString("Enter new course: "));
        student.setSemester(validation.getInt("Enter new semester: "));
        System.out.println("Student updated successfully!");
    }

    private void delete(Student student) {
        this.remove(student);
        System.out.println("Student deleted successfully!");
    }

    public void report() {
        Map<String, Integer> reportMap = new HashMap<>();

        for (Student student : this) {
            String key = student.getStudentName() + " | " + student.getCourseName();
            reportMap.put(key, reportMap.getOrDefault(key, 0) + 1);
        }

        System.out.println("Student Report:");
        System.out.println("=".repeat(40));
        System.out.printf("%-20s %-15s %-10s%n", "Student Name", "Course", "Total");
        System.out.println("=".repeat(40));
        for (Map.Entry<String, Integer> entry : reportMap.entrySet()) {
            String[] parts = entry.getKey().split(" \\| ");
            System.out.printf("%-20s %-15s %-10d%n", parts[0], parts[1], entry.getValue());
        }
        System.out.println("=".repeat(40));
    }
}
