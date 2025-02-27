package week6.Short54;

import java.util.ArrayList;

public class ContactList extends ArrayList<Contact> {
    public ContactList() {
        super();
    }

    public void addContact() {
        int id = this.size();
        String fullnamw = Validation.getString("Enter full name: ");
        String group = Validation.getString("Enter group: ");
        String address = Validation.getString("Enter address: ");
        String phone = Validation.checkPhone("Enter phone: ");
        String lastName = fullnamw.split("\\s+")[1];
        String firstName = fullnamw.split("\\s+")[0];
        String somethinf = group + address;
        System.out.println(somethinf);

        this.add(new Contact(id + 1, fullnamw, group, address, phone, lastName, firstName));
    }

    public void display() {
        System.out.printf("ID | Full name | Group | Address | Phone | Last name | First name\n", "%-10s | %-17s | %-10s | %-10s | %-10s | %-10s | %-10s");
        this.forEach(contact -> System.out.println(contact.toString()));
    }

    private void deleteContact(int id) {
        this.removeIf(contact -> contact.getId() == id);
    }
    public void deleteContact(){
        System.out.println("------- Delete a Contact -------");
        int id = Validation.getInt("Enter id: ");
        deleteContact(id);
        System.out.println("Successful");
    }
}
