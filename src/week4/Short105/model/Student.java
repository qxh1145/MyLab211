package week4.Short105.model;

import java.util.Date;

public class Student extends Person{
    int yearOfAdmission;
    float entranceEngScore;

    public Student() {
        this.yearOfAdmission = 0;
        this.entranceEngScore = 0.0f;
    }

    @Override
    public void inputAll() throws Exception {
        super.inputAll();
        this.yearOfAdmission = validation.getInt("Enter year of admission: ");
        this.entranceEngScore = validation.getFloat("Enter entrance english score: ",1,100);
    }
}
