package validation;

import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author coi12
 */
public class validation
{

    public static Integer getInt(String promt, int min, int max)
    {
        Integer a = null;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print(promt + ": ");
            try
            {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= min && a <= max)
                {
                    break;
                }
            }
            catch (Exception e)
            {
                System.out.println("Please enter a number between " + min + " and " + max);
            }
        }
        return a;
    }

    public static String getString(String promt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(promt + ": ");
        return sc.nextLine();
    }


}