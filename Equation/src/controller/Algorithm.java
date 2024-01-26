package controller;

import model.Model;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {
    Model model = new Model();
    public List<Double> solveSuperlativeEquation(double a, double b) {
        double result;
        List<Double> list = new ArrayList<>();
        if (a == 0 && b == 0) {
            return list;
        } else if (a == 0 && b != 0) {
            return null;
        } else {
            result = -b / a;
            if (result == 0) {
                result = 0;
            }
            System.out.println("Solution: x = " + result);

            list.add(a);
            list.add(b);
            list.add(result);
        }
        return list;
    }

    public List<Double> solveQuadraticEquation(double a, double b, double c) {
        List<Double> list = new ArrayList<>();
        double delta;
        double result_1 = 0;
        double result_2 = 0;
        if (a == 0 && b == 0 && c == 0) {
            return list;
        } else if (a == 0 && b != 0) {
            list = solveSuperlativeEquation(b, c);
        } else {
            delta = (b * b - 4 * a * c);
            if (delta < 0) {
                return null;
            } else if (delta == 0) {
                if (a == 0) {
                    return null;
                } else {
                    result_1 = (-b) / (2 * a);
                    result_2 = result_1;
                    System.out.println("Solutions: x1 = " + result_1 + " and x2 = " + result_1);
                }
            } else {
                result_1 = (-b + Math.sqrt(delta)) / (2 * a);
                result_2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Solutions: x1 = " + result_1 + " and x2 = " + result_2);
            }
            list.add(a);
            list.add(b);
            list.add(c);
            list.add(result_1);
            list.add(result_2);
        }
        return list;
    }

    public void findEvenOddSquareNumber(List<Double> list) {
        if (list == null) {
            System.out.println("None Result");
        } else if (!list.isEmpty()) {
            boolean odd = true;
            System.out.print("Odd number: ");
            for (double x : list) {
                if (model.isOdd(x)) {
                    if (odd) {
                        System.out.print(x);
                        odd = false;
                    }
                    else System.out.print(", " + x);
                }
            }
            System.out.println();
            boolean even = true;
            System.out.print("Even number: ");
            for (double x : list) {
                if (model.isEven(x)) {
                    if (even) {
                        System.out.print(x);
                        even = false;
                    }
                    else System.out.print(", " + x);

                }
            }
            System.out.println();
            boolean square = true;
            System.out.print("Square number: ");
            for (double x : list) {
                if (model.isSquare(x)) {
                    if (square) {
                        System.out.print(x);
                        square = false;
                    }
                    else System.out.print(", " + x);
                }
            }
            System.out.println();
        } else if (list.isEmpty()) {
            System.out.println("Infinity Result!!!");
        }
    }
}
