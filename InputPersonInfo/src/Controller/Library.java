package Controller;


import java.util.Scanner;

public class Library {
    protected Scanner sc;

    public Library() {
        sc = new Scanner(System.in);
    }

    public double checkInputDouble(String promt) {
        while (true) {
            System.out.print(promt);
            try {
                double result = Double.parseDouble(sc.nextLine());
                if (result < 0) {
                    System.out.println("Salary must be greater than zero.");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.out.println("You must input digit.");
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
            System.err.println("Please input y/Y or n/N!!!");
            System.out.print("Please enter again: ");
        }
    }
}
