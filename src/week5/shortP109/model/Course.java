package week5.shortP109.model;

import week5.shortP109.view.Validation;

public class Course {
    protected String courseID;
    protected String courseName;
    protected int credit;


    Validation validation = new Validation();
    public Course() {
        this.courseID = "";
        this.courseName = "";
        this.credit = 0;
    }

    public void inputAll(){
        courseID = validation.checkID(Validation.getString("Enter course ID: "));
        courseName = Validation.getString("Enter course name: ");
        credit = Validation.getInt("Enter credit: ",1,Integer.MAX_VALUE);

    }

    @Override
    public String toString() {
        return String.format("ID: %-10s | Course Name: %-17s | Credit: %-5s | ",
                this.courseID,this.courseName,this.credit);
    }
}
