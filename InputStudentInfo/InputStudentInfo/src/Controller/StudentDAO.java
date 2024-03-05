/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Student;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author ROG
 */
public class StudentDAO {
    Library l;

    public StudentDAO() {
        l = new Library();
    }


    public ArrayList<Student> addStudent(ArrayList<Student> lt) {
        while (true) {
            System.out.println("Please input student information");
            String name = l.inputString("Name: ");
            String classes = l.inputString("Classes: ");
            double mark = l.checkInputDouble("Mark: ");
            lt.add(new Student(name, mark, classes));
            if (!l.checkInputYN("Do you want to enter more student information?(Y/N): ")) {
                return lt;
            }
        }

    }

    public void print(ArrayList<Student> lt) {
        if (lt.isEmpty()) {
            System.err.println("There are no student!!!");
            return;
        }
        Collections.sort(lt);
        for (int i = 0; i < lt.size(); i++) {
            int n = i + 1;
            System.out.println("--------Student " + n + "--------");
            System.out.println("Name: " + lt.get(i).getName());
            System.out.println("Classes: " + lt.get(i).getClasses());
            System.out.println("Mark: " + lt.get(i).getMark());
        }
    }

    public void display(ArrayList<Student> lt) {
        print(addStudent(lt));
    }
}