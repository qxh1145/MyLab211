package week5.shortP109.model;

import week5.shortP109.view.Validation;

import java.util.Date;

public class OfflineCourse extends Course{
    private Date begin;
    private Date end;
    private String campus;

    public OfflineCourse() {
        super();
        this.begin = null;
        this.end = null;
        this.campus = "";
    }

    public void inputAll() {
        super.inputAll();
        begin = validation.checkValidDate(Validation.getString("Enter begin date: "));
        end = validation.checkValidDate(Validation.getString("Enter end date: "));
        campus = Validation.getString("Enter campus: ");
    }
    public String toString() {
        return super.toString() + String.format("Begin: %-10s | End: %-10s | Campus: %-10s | :",
                validation.showDate(begin),validation.showDate(end),this.campus);
    }
}
