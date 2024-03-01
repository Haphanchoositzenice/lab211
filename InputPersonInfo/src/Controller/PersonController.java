package Controller;

import Model.Person;

import java.util.ArrayList;
import java.util.Collections;

public class PersonController {
    Library l;

    public PersonController() {
        l = new Library();
    }


    public ArrayList<Person> addStudent(ArrayList<Person> lt) {
        while (true) {
            System.out.println("Input information of person");
            String name = l.inputString("Please input name: ");
            String address = l.inputString("Please input address: ");
            double salary = l.checkInputDouble("Please input salary: ");
            lt.add(new Person(name, address, salary));
            if (!l.checkInputYN("Do you want to enter more person information?(Y/N): ")) {
                return lt;
            }
        }

    }

    public void print(ArrayList<Person> lt) {
        if (lt.isEmpty()) {
            System.err.println("There are no person!!!");
            return;
        }
        Collections.sort(lt);
        for (int i = 0; i < lt.size(); i++) {
            System.out.println("\nInformation of person you have entered");
            System.out.println("Name: " + lt.get(i).getName());
            System.out.println("Address: " + lt.get(i).getAddress());
            System.out.println("Salary: " + lt.get(i).getSalary());
        }
    }

    public void display(ArrayList<Person> lt) {
        print(addStudent(lt));
    }
}
