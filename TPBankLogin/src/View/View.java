package View;

import java.util.Locale;
import Controller.LoginDAO;
public class View extends Menu<String>{
    static String[] mc = {"Vietnamese", "English", "Exit"};
    LoginDAO program;
    Locale vietnamese = new Locale("Vi");
    Locale english = Locale.ENGLISH;
    public View() {
        super("\nLogin Program", mc);
        program = new LoginDAO();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.login(vietnamese);
                break;
            case 2:
                program.login(english);
                break;
            case 3:
                System.exit(0);
        }
    }
}
