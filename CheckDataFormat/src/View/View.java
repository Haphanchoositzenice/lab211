package View;


import Controller.CheckDataFormatDAO;

public class View
{
    CheckDataFormatDAO c =  new CheckDataFormatDAO();


    public void run() {
        System.out.println("\n===== Validate Program =====");
        c.Validate();
    }
}
