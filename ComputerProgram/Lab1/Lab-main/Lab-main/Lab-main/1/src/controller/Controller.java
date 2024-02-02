/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;


/**
 *
 * @author ROG
 */
public class Controller
{
    Validation validation = new Validation();
    Model model = new Model();

    public void Calculator(double n1, char op){
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextDouble();
        validation.checkDouble(n1);
        model.setN1(n1);
        op = sc.next().charAt(0);
        validation.checkDouble(op);
        model.calculate(op);
    }

}


