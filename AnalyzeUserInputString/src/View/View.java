package View;


import Controller.StringDAO;

public class View {
    StringDAO s  = new StringDAO();
    public View() {
    }

    public void run() {
        System.out.println("\n===== Analysis String Program =====");
        s.analysisString();
    }
}