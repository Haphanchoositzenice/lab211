package View;

import Controller.ExpenseList;


public class View extends Menu<String> {
    static String[] mc = {"Add new expense", "Remove an expense", "Display all expenses", "Exit"};
    ExpenseList expenseList = new ExpenseList();

    public View(){
        super("\n===== Task program =====", mc);
    }
    @Override
    public void execute(int n) {
        switch (n){
            case 1:
                System.out.println("-------- Add an expense --------");
                expenseList.addExpense();
                break;
            case 2:
                System.out.println("---------Display all expenses------------");
                expenseList.removeExpense();
                break;
            case 3:
                System.out.println("--------Delete an expense------");
                expenseList.display();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
