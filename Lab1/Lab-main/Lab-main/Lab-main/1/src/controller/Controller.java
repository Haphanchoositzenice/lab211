/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.Scanner;
import common.Algorithm;
import common.Library;
import model.Model;
import view.Menu;
import view.MenuCon;


/**
 *
 * @author ROG
 */
public class Controller extends Menu
{

    static String[] mc =
    {
        "BubbleSort", "QuickSort", "Exit"
    };

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    protected MenuCon menuCon;
    public Controller(Model model)
    {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = model.getSize_array();
        array = model.getArray();
        menuCon = new MenuCon(model);
    }


    public void execute(int n) {
        Scanner sc = new Scanner(System.in);
            switch (n) {
                case 1: {
                    library.display(array);
                    algorithm.bubbleSort(array);
                    System.out.println("\nSorted array by Bubble Sort: ");
                    library.display(array);
                    System.out.println("");
                    System.out.println("1.Binary search\n2.Linear Search");
                    int choice = sc.nextInt();
                    menuCon.execute(choice);
                    break;
                }
                case 2: {
                    library.display(array);
                    algorithm.quickSort(array, 0, array.length - 1);
                    System.out.println("\nSorted array by Quick Sort: ");
                    library.display(array);
                    System.out.println("1.Binary search\n2.Linear Search");
                    int choice = sc.nextInt();
                    menuCon.execute(choice);
                    break;
                }

                case 3:
                    System.out.println("Exitting");
                    System.exit(0);
                    break;
            }
        }
}


