/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Scanner;

/**
 *
 * @author ROG
 */
public class Common {
    protected Scanner sc;

    public Common() {
        sc = new Scanner(System.in);
    }

    public String getString(String mes) {
        System.out.print(mes);
        return sc.nextLine();
    }

    public int getInt(String print, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(print + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
                if (a != m || a != n){
                    if (m==n){
                        System.out.println("There is only "+m);
                        continue;
                    }
                    else{
                        System.out.println("Please enter a number between " + m + " and " + n);
                        continue;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

    public double getDouble(String print) {
        double a;
        while (true) {
            System.out.print(print + ": ");
            try {
                String s = sc.nextLine();
                a = Double.parseDouble(s);
                break;
            } catch (Exception e) {
                System.out.println("Please enter a double");
            }
        }
        return a;
    }
}