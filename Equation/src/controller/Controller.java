
package controller;

import controller.Algorithm;
import model.Model;
import java.util.List;
import view.Menu;

public class Controller extends Menu<String>
{
    static String[] mc = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
    Model model;
    Algorithm algorithm;
    double a;
    double b;
    double c;

    public Controller() {
        super("\n========= Equation Program =========", mc);
        model = new Model();
        algorithm = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                calculateSuperlativeEquation();
                break;
            case 2:
                calculateQuadraticEquation();
                break;
            case 3:
                System.exit(0);
        }
    }

    public void calculateSuperlativeEquation() {
        System.out.print("Enter A: ");
        a = model.validateDouble();
        System.out.print("Enter B: ");
        b = model.validateDouble();
        List<Double> list = algorithm.solveSuperlativeEquation(a, b);
        algorithm.findEvenOddSquareNumber(list);
    }

    public void calculateQuadraticEquation() {
        System.out.print("Enter A: ");
        a = model.validateDouble();
        System.out.print("Enter B: ");
        b = model.validateDouble();
        System.out.print("Enter C: ");
        c = model.validateDouble();
        List<Double> list = algorithm.solveQuadraticEquation(a, b, c);
        algorithm.findEvenOddSquareNumber(list);
    }
}
