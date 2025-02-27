package week6.Short54;

public class Contact {
    private int id;
    private String fullName;
    private String group;
    private String address;
    private String phone;
    private String lastName;
    private String firstName;

    public Contact(int id, String fullName, String group, String address, String phone, String lastName, String firstName) {
        this.id = id;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGroup() {
        return group;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String toString() {
        return String.format("%-10s | %-17s | %-10s | %-10s | %-10s | %-10s | %-10s", this.id, this.fullName, this.group, this.address, this.phone, this.lastName, this.firstName);
    }
}
