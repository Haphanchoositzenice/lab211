package View;

import Controller.Controller;
public class View {
    Controller controller = new Controller();
    public void run() {
        System.out.println("\n===== Analysis Path Program =====");
        controller.checkInputPath();
    }
}
