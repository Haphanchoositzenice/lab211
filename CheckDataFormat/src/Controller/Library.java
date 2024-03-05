package Controller;

import java.util.Scanner;

public class Library {
    protected Scanner sc;

    public Library() {
        sc = new Scanner(System.in);
    }
    public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
    
    public double checkInputDouble(String promt) {
        while (true) {
            System.out.print(promt);
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }
    
    public String inputString(String mes) {
        System.out.print(mes);
        while (true) {
            String result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    

    public boolean checkInputYN(String mes) {
        System.out.print(mes);
        while (true) {
            String result = sc.nextLine();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
}