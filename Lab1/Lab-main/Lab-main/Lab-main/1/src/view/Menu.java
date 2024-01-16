/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import common.Library;
import java.util.ArrayList;

/**
 *
 * @author ROG
 */
public abstract class Menu
{

    protected String title;
    protected ArrayList<String> choices;
    Library l = new Library();

    public Menu()
    {
        choices = new ArrayList<>();
    }

    public Menu(String td, String[] mc)
    {
        title = td;
        choices = new ArrayList<>();
        for (String s : mc)
        {
            choices.add(s);
        }
    }

    public void display()
    {
        System.out.println(title);
        System.out.println("--------------------------------");
        for (int i = 0; i < choices.size(); i++)
        {
            System.out.println((i + 1) + "." + choices.get(i));
        }
        System.out.println("--------------------------------");
    }

    public int getSelected()
    {
        display();
        return l.getInt("Enter your choice", 1, choices.size() + 1);
    }

    public abstract void execute(int n);

    public void run()
    {
        while (true)
        {
            int n = getSelected();
            execute(n);
            if (n > choices.size())
            {
                break;
            }
        }
    }
}
