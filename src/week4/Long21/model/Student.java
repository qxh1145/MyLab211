package week4.Long21.model;

public class Student {
    private String studentID;
    private String studentName;
    private int semester;
    private String courseName;

    public Student(String studentID, String studentName, String courseName, int semester) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    @Override
    public String toString() {
       return String.format("%-5s | %-17s | %-8s | %-5s",this.getStudentID(), this.getStudentName(), this.getCourseName(),this.semester);
    }
}
