package week4.Short105.model;

import week4.Short105.view.Validation;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TeacherAndStudent extends ArrayList<Person> {

    public TeacherAndStudent() {
        super();
    }

    public void addTeacher(){
        Teacher teacher = new Teacher();
        teacher.inputAll();
        this.add(teacher);
    }
    public void addStudent() throws Exception {
        Student student = new Student();
        student.inputAll();
        this.add(student);
    }

    public void displayTeacher() {
        for (Person person : this) {
            if (person instanceof Teacher) {
                System.out.println(person);
            }
        }
    }

    public void displayStudent() {
        for (Person person : this) {
            if (person instanceof Student) {
                System.out.println(person);
            }
        }
    }

    private void displayAll(ArrayList<Person> list){
        for (Person person : list) {
            System.out.println(person);
        }
    }
    public void displayAll() {
        displayAll(this);
    }

    private ArrayList<Person> search(Predicate<Person> p){
        ArrayList<Person> rs = new ArrayList<>();
        this.forEach(person -> {
            if (p.test(person)) {
                rs.add(person);
            }
        });
        if (rs.isEmpty()) {
            System.out.println("List empty");
        }
        return rs;
    }
    public void search(){
        ArrayList<Person> rs = null;

        String findID = Validation.getString("Enter id you want to find: ");
        rs = search(person -> person.getID().contains(findID));

        if (rs != null){
            displayAll(rs);
        }
    }
}
