
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controller;
import Model.Worker;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author ROG
 */
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

    public int getYear(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                int s = sc.nextInt();
                a = 2024-s;
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a year between " + 2006+m + " and " + 1974+n);
            }
        }
        return a;
    }
    
    public int getIntNoLimit(String promt) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                return a;
            } catch (Exception e) {
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
    
    public double checkInputDouble(String promt) {
        while (true) {
            System.out.print(promt);
            try {
                double result = Double.parseDouble(sc.nextLine());
                if (result > 0) {
                    return result;
                } else {
                    return 0;
                }
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }
    public boolean checkIdExist(ArrayList<Worker> lw, String id) {
        for (Worker worker : lw) {
            if (id.equalsIgnoreCase(worker.getId())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkWorkerExist(ArrayList<Worker> lw, String name, int age, int salary, String workLocation) {
        for (Worker worker : lw) {
            if (name.equalsIgnoreCase(worker.getName())
                    && age == worker.getAge()
                    && salary == worker.getSalary()) {
                return false;
            }
        }
        return true;
    }
}
