package View;

import Controller.Controller;
import Common.Valid;
import Model.Model;
import java.util.ArrayList;
public class View extends Menu<String> {
    static String[] mc = {"Add Task", "Delete Task", "Display Task", "Exit"};
    ArrayList<Model> lt = new ArrayList<>();
    Controller c = new Controller();
    Valid v = new Valid();

    public View(){
        super("\n===== Task program =====", mc);
        lt = new ArrayList<>();
    }


    @Override
    public void execute(int n) {
        switch (n){
            case 1:
                c.addTask();
                break;
            case 2:
                c.removeTask();
                break;
            case 3:
                c.display();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
