package controller;

import java.util.Scanner;

public class Validation {
    private Scanner sc = new Scanner(System.in);
    public double checkDouble(double inputDouble) {
        int a = Integer.parseInt(null);
        while (true)
        {
            try
            {
                inputDouble = Double.parseDouble(sc.nextLine());
                return inputDouble;
            } catch (NumberFormatException e) {
                System.out.println("Please input Double number!!!");
                System.out.print("Enter Double number: ");
            } catch (NullPointerException e){
                System.out.println("Please input Double number!!!");
                System.out.print("Enter Double number: ");
            }
        }
    }
    public char checkOperation(char op){
        boolean a = true;
        while((op != '+' ||op != '-' ||op != '*' ||op != '/' ||op != '^' ||op != '=') && a == true){
            System.out.println("Enter again!! (+, -, *, /, ^, =)");
            a = false;
        }
        return op;
    }
}
