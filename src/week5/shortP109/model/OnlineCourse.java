package week5.shortP109.model;

import week5.shortP109.view.Validation;

public class OnlineCourse extends Course{

    String platform;
    String instructor;
    String note;

    public OnlineCourse() {
        this.platform = "";
        this.instructor = "";
        this.note= "";
    }

    @Override
    public void inputAll() {
        super.inputAll();
        platform = Validation.getString("Enter platform: ");
        instructor = Validation.getString("Enter instructor: ");
        note = Validation.getString("Enter note: ");
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Platform: %-12s | instructor: %-17s | Note: %-10s | :",
                this.platform,this.instructor,this.note);
    }
}
