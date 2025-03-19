package week4.Short105.model;

import week4.Short105.view.Validation;

public class  Person  {
    Validation validation = new Validation();
    String ID;
    String fullName;
    String phone;
    int yearOFBirth;
    String major;

    public Person() {
        this.ID = "";
        this.fullName = "";
        this.phone = "";
        this.yearOFBirth = 0;
        this.major = "";
    }

    public Validation getValidation() {
        return validation;
    }

    public void setValidation(Validation validation) {
        this.validation = validation;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getYearOFBirth() {
        return yearOFBirth;
    }

    public void setYearOFBirth(int yearOFBirth) {
        this.yearOFBirth = yearOFBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void inputAll() throws Exception {
        ID = validation.checkID(validation.getString("Enter ID: "));
        fullName = Validation.getString("Enter full name", "^[a-zA-Z ]+$");
        phone = validation.getString("Enter phone: ","\\d{12}");
        yearOFBirth = validation.getInt("Enter year of birth: ");
        major = validation.getString("Enter major:  ", "^.{1,30}$");
    }

    @Override
    public String toString() {
        return String.format("ID: %-10s | Full Name: %-17s | Phone: %-10s | Year of birth: %-6s | Major: %-10s"
                ,this.ID,this.fullName,this.phone,this.yearOFBirth, this.major);
    }
}
