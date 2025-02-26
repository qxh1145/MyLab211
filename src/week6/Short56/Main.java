package week6.Short56;

public class Main {
    public static void main(String[] args) {
        WorkerManagement wm = new WorkerManagement();

        while (true) {
            System.out.println("======== Worker Management =========");
            System.out.println("1. Add worker");
            System.out.println("2. Up salary");
            System.out.println("3. Down salary");
            System.out.println("4. Display all salary history");
            System.out.println("5. Exit");
            System.out.println("=====================================");
            int choice = Validation.getInt("Enter your choice: ", 1, 5);
            switch (choice) {
                case 1 -> wm.addWorker();
                case 2 -> wm.inscreaseSalary();
                case 3 -> wm.descreaseSalary();
                case 4 -> wm.displayHistory();
                case 5 -> System.exit(0);
            }
        }
    }
}
