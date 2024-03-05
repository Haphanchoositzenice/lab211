/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.StudentDAO;
import Model.Student;
import java.util.ArrayList;
/**
 *
 * @author ROG
 */
public class View {
    StudentDAO studentDAO = new StudentDAO();
    ArrayList<Student> lt;

    public View() {

        lt = new ArrayList<>();
    }

    public void run() {
        System.out.println("\nCollection Sort Program");
        studentDAO.display(lt);
    }
}