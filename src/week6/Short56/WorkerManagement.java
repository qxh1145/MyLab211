package week6.Short56;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class WorkerManagement extends ArrayList<Worker> {
    ArrayList<SalaryHistory> sh = new ArrayList<>();

    public WorkerManagement() {
        super();
    }

    public void addWorker() {
    String code;
        while (true) {
            code = Validation.getString("Enter code: ");
            if (!(isDuplicate(code))) {
                break;
            }else {
                System.out.println("Duplicate code, please try again!");
            }
        }
        String name = Validation.getString("Enter name: ");
        int age = Validation.getInt("Enter age: ", 18, 50);
        float salary = Validation.getFloat("Enter salary: ");
        String workLocation = Validation.getString("Enter work location: ");

        this.add(new Worker(code, name, age, salary, workLocation));
    }

    public void increaseSalary(){
        String find = Validation.getString("Enter code to find: ");
        Worker worker = this.stream().filter(w -> w.getCode().equals(find)).findFirst().orElse(null);
        if (worker == null) {
            System.out.println("not found");
        } else {
            float increase;
            while (true) {
                System.out.println("Up/Down Salary");
                increase = Validation.getFloat("Enter salary: ");
                if (increase > worker.getSalary()) {
                    sh.add(new SalaryHistory(worker.getCode(), worker.name, worker.age, increase, worker.workLocation, "up", getDate()));
                    break;
                }
            }
            worker.setSalary(increase);
            System.out.println("Update success");
        }
    }
    
    

    public void descreaseSalary(){
        String find = Validation.getString("Enter code to find: ");
        Worker worker = this.stream().filter(w -> w.getCode().equals(find)).findFirst().orElse(null);
        if(worker == null){
            System.out.println("not found");
        }else {
            float decrease;
            while (true) {
                System.out.println("------- Up/Down Salary --------");
                decrease = Validation.getFloat("Enter salary: ");
                if (decrease < worker.getSalary()) {
                    sh.add(new SalaryHistory(worker.getCode(), worker.name, worker.age, decrease,worker.workLocation, "down", getDate()));
                    break;
                }
            }
            worker.setSalary(decrease);
            if (decrease < worker.getSalary()) {
                System.out.println("Update success");
        }
            System.out.println("Update success");
        }
    }
    public void display() {
        this.forEach(worker -> System.out.println(worker.toString()));
    }

    public void displayHistory() {
        sh.forEach(history -> System.out.println(history.toString()));
    }
    private boolean isDuplicate(String id) {
        return this.stream().anyMatch(w -> w.getCode().equals(id));
    }

    public String getDate(){
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy ");
        Calendar calendar = Calendar.getInstance();
        return date.format(calendar.getTime());
    }


}
