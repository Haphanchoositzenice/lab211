/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Common.Common;
import Model.User;
import View.Menu;
import java.util.ArrayList;
import java.util.Hashtable;
/**
 *
 * @author ROG
 */
public class Controller extends Menu<String>{
    static String[] mc = {"Add a Contact", "Display all contact", "Delete a contact", "Exit"};
    Common c = new Common();
    ArrayList<User> UserList;
    Hashtable<String, ArrayList<User>> ht;

    public Controller() {
        super("\nFruit Shop Manager:", mc);
        
        UserList = new ArrayList<>();
        ht= new Hashtable<>();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                createUser();
                break;
            case 2:
                displayAllContacts();
                break;
            case 3:
                delete();   
                break;
            case 4:
                System.exit(0);
        }
    }
    
    public void createUser() {
        boolean continueAdding = true;
        while (continueAdding) {
        String name = c.getString("Enter name: ");
        String group = c.getString("Enter Group: ");
        String address = c.getString("Enter Address: ");
        String phoneNumber = c.getString("Enter Phone: ");
        c.getPhoneNumber(phoneNumber);
        UserList.add(new User(name, group, address, phoneNumber));
        System.out.println("Add Successful");
        break;
    }
}
    
    public void displayAllContacts() {
    System.out.println("ID\tName\t\tFirst Name\tLast Name\tGroup\t\tAddress\t\tPhone");
    for (int i = 0; i < UserList.size(); i++) {
        User user = UserList.get(i);
        String[] nameParts = user.getName().split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];
        System.out.println((i+1) + "\t" + user.getName() + "\t\t" + firstName + "\t\t" + lastName + "\t\t" + user.getGroup() + "\t\t" + user.getAddress() + "\t\t" + user.getPhoneNumber());
    }
}
    
    public void delete() {
    String id = c.getString("Enter ID of the contact to delete: ");
    
    boolean contactFound = false;
    User contactToRemove = null;
    for (User user : UserList) {
        
    }

    if (contactToRemove != null) {
        UserList.remove(contactToRemove);
        System.out.println("Contact deleted successfully!");
    } else {
        System.err.println("No contact found with ID " + id);
    }
}
    
}