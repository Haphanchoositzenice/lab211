package view;

import common.Algorithm;
import common.Library;
import model.Model;

import java.util.Scanner;

public class MenuCon extends Menu {

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public MenuCon(Model model)
    {
        library = new Library();
        algorithm = new Algorithm();
        size_array = model.getSize_array();
        array = model.getArray();
    }


    @Override
    public void execute(int n) {
            switch (n) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter number to find(Binary Search):");
                    int n1 = sc.nextInt();
                    System.out.println("\nBinary Search: ");
                    System.out.println("The number u want to find at index: " + algorithm.binarySearch(array, n1, 0, array.length));
                    System.exit(0);
                    break;
                case 2:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter number to find(Linear Search): ");
                    int n2 = sc1.nextInt();
                    System.out.println("\nLinear Search: ");
                    System.out.println("The number u want to find at index: " + algorithm.linearSearch(array, n2));
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter again");
                    if(n!=1 || n!=2){
                        return;
                    }
                    break;
            }

    }
}
