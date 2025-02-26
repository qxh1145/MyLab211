package week6.Short56;

import java.time.LocalDate;

public class Worker {
    protected String code;
    protected String name;
    protected int age;
    protected float salary;
    protected String workLocation;


    public Worker(String code, String name, int age, float salary, String workLocation) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
    public String toString() {
        return String.format("Code: %-10s | Name: %-17s | Age: %-5s | Salary: %-10s | Work Location: %-10s", this.code, this.name, this.age, this.salary, this.workLocation);
    }
}
