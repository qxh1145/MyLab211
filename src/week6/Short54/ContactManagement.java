package week6.Short54;

public class ContactManagement {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        while (true) {
            System.out.println("========= Contact program =========");
            System.out.println("1. Add contact");
            System.out.println("2. Display contact list");
            System.out.println("3. Delete a contact ");
            System.out.println("4. Exit");
            System.out.println("=====================================");
            int choice = Validation.getInt("Enter your choice: ", 1, 4);
            switch (choice) {
                case 1 -> contactList.addContact();
                case 2 -> contactList.display();
                case 3 -> contactList.deleteContact();
                case 4 -> System.exit(0);
            }
        }
    }
}
