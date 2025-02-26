package week6.Short56;

public class SalaryHistory extends Worker{
    private String status;
    private String date;

    public SalaryHistory(String code, String name, int age, float salary, String workLocation, String status, String date) {
        super(code, name, age, salary, workLocation);
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }

    public String toString() {
        return String.format("Code: %-10s | Name: %-17s | Age: %-5s | Salary: %-10s | Status: %-10s | Date: %-10s", this.code, this.name, this.age, this.salary, this.status, this.date);
    }
}
