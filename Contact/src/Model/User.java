package Model;

public class User {
    private int id;
    private String name;
    private String firstName;
    private String lastName;
    private String group;
    private String address;
    private String phoneNumber;

    

    public User(String name, String group, String address, String phoneNumber) {
        this.name = name;
        this.group = group;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t\t" + firstName + "\t\t" + lastName + "\t\t" + group + "\t" + address + "\t\t" + phoneNumber;
    }

    
}