/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import View.PersonRepository;
import View.Menu;
/**
 *
 * @author ROG
 */
public class PersonMenu extends Menu<String>{
    static String[] mc = {"Find person info", "Copy Text to new file", "Exit"};
    PersonRepository program;

    public PersonMenu() {
        super("\nFile Processing", mc);
        program = new PersonRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.findPersonInfo();
                break;
            case 2:
                program.copyNewFile();
                break;
            case 3:
                System.exit(0);
        }
    }
}