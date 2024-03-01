package View;

import Controller.PersonController;
import Model.Person;

import java.util.ArrayList;

public class View {
    PersonController personController = new PersonController();
    ArrayList<Person> lt;
    public View() {
        lt = new ArrayList<>();
    }

    public void run() {
        System.out.println("\n=====Management person programmer");
        personController.display(lt);
    }
}
