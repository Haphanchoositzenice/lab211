package view;

import controller.Controller;

import java.util.Scanner;

public class CalculatorView extends view.Menu<String> {


    static String[] mc =
            {
                    "Normal Calculator", "BMI Calculator", "Exit"
            };


    protected Controller controller;

    public CalculatorView() {
        super("========== Calculator Program ==========", mc);
        controller = new Controller();

    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter number: ");
                double n1 = sc1.nextDouble();
                System.out.println("Enter operator: ");
                char op = sc1.next().charAt(0);
                controller.Calculator(n1, op);
                break;

            }
        }
    }
    public void displayMemory(double memory) {
        System.out.println("Memory: " + memory);
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public void displayBMIResult(double bmi, String status) {
        System.out.println("BMI Number: " + bmi);
        System.out.println("BMI Status: " + status);
    }

    public void displayInvalidOption() {
        System.out.println("Invalid option. Please try again.");
    }
}
