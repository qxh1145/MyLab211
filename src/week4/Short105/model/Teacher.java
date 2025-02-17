package week4.Short105.model;

import java.util.Date;

public class Teacher extends Person {
    int yearInProfession;
    short contracType;
    int salaryCoefficent;

    public Teacher() {
        super();
        this.yearInProfession = 0;
        this.contracType = 0;
        this.salaryCoefficent = 0;
    }

    @Override
    public void inputAll() {
        try {
            super.inputAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        this.yearInProfession = validation.getInt("Enter year in profession: ");
        this.contracType = validation.getShort("Enter contract type: ");
        this.salaryCoefficent = validation.getInt("Enter salary coefficent: ");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Year in profession: %-10s | Contract type: %-10s | Salary coefficent: %-10s", this.yearInProfession, this.contracType, this.salaryCoefficent);
    }
}
