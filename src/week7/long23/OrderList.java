package week7.long23;

import java.util.ArrayList;
import java.util.Hashtable;

public class OrderList extends ArrayList<Fruit> {
    private Hashtable<String, ArrayList<Fruit>> cart = new Hashtable<>();

    public void addFruit() {
        while (true) {
            String id = Validation.getString("Enter id: ");
            String fruitName = Validation.getString("Enter fruit name: ");
            float price = Validation.getFloat("Enter price: ");
            int quantity = Validation.getInt("Enter quantity: ");
            String origin = Validation.getString("Enter origin: ");
            this.add(new Fruit(id, fruitName, price, quantity, origin));

            String flag = Validation.getString("Do you want to continue (Y/N)? ", "[YyNn]").toUpperCase();
            if (flag.equals("N")) break;
        }
    }

    public void viewOrder() {
        if (cart.isEmpty()) {
            System.out.println("No orders yet.");
            return;
        }

        for (String customer : cart.keySet()) {
            ArrayList<Fruit> order = cart.get(customer);
            System.out.println("Customer: " + customer);
            System.out.printf("%-15s %-10s %-6s %-6s\n", "Product", "Quantity", "Price", "Amount");
            float total = 0;
            for (Fruit fruit : order) {
                float amount = fruit.getPrice() * fruit.getQuantity();
                System.out.printf("%-15s %-10d %-6.2f$ %-6.2f$\n", fruit.getFruitName(), fruit.getQuantity(), fruit.getPrice(), amount);
                total += amount;
            }
            System.out.println("Total: " + total + "$\n");
        }
    }

    public void shopping() {
        if (this.isEmpty()) {
            System.out.println("No fruits available.");
            return;
        }

        ArrayList<Fruit> buyList = new ArrayList<>();

        while (true) {
            exportFruit();
            String selectedID = Validation.getString("Enter Fruit ID to buy: ");
            Fruit selectedFruit = null;

            for (Fruit fruit : this) {
                if (fruit.getFruitID().equals(selectedID)) {
                    selectedFruit = fruit;
                    break;
                }
            }

            if (selectedFruit == null) {
                System.out.println("Invalid fruit ID!");
                continue;
            }

            int quantity = Validation.getInt("Enter quantity: ", 1, selectedFruit.getQuantity());

            Fruit orderedFruit = new Fruit(selectedFruit.getFruitID(), selectedFruit.getFruitName(), selectedFruit.getPrice(), quantity, selectedFruit.getOrigin());
            buyList.add(orderedFruit);
            selectedFruit.setQuantity(selectedFruit.getQuantity() - quantity);

            String flag = Validation.getString("Do you want to order more? (Y/N): ", "[YyNn]").toUpperCase();
            if (flag.equals("N")) break;
        }

        if (!buyList.isEmpty()) {
            String customerName = Validation.getString("Enter your name: ");
            cart.put(customerName, buyList);
            System.out.println("Order placed successfully!");
        }
    }

    public void exportFruit() {
        System.out.printf("%-10s %-17s %-17s %-10s\n", "ID", "Fruit Name", "Origin", "Price");
        for (Fruit fruit : this) {
            System.out.printf("%-10s %-17s %-17s %-10.2f$\n", fruit.getFruitID(), fruit.getFruitName(), fruit.getOrigin(), fruit.getPrice());
        }
    }
}
