package week7.long23;

public class Main {
    public static void main(String[] args) {
        OrderList orderList = new OrderList();
        while (true) {
            System.out.println("========= Fruit Shop ==========");
            System.out.println("1. Add fruit");
            System.out.println("2. View order list");
            System.out.println("3. Shopping");
            System.out.println("4. Exit");
            System.out.println("=====================================");
            int choice = Validation.getInt("Enter your choice: ", 1, 4);
            switch (choice) {
                case 1 -> orderList.addFruit();
                case 2 -> orderList.viewOrder();
                case 3 -> orderList.shopping();
                case 4 -> System.exit(0);
            }
        }
    }
}
