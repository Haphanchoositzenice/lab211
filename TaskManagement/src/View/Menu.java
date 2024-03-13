package View;


import Common.Valid;

import java.util.ArrayList;

public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> mChon;
    Valid v = new Valid();

    public Menu() {
        mChon = new ArrayList<>();
    }

    public Menu(String td, String[] mc) {
        title = td;
        mChon = new ArrayList<>();
        for (String s : mc) {
            mChon.add((T) s);
        }
    }

    public void display() {
        System.out.println(title);
        for (int i = 0; i < mChon.size(); i++) {
            System.out.println((i + 1) + "." + mChon.get(i));
        }
    }

    public int getSelected() {
        display();
        return v.inputInt("Enter your choice: ", 1, mChon.size() + 1);
    }

    public abstract void execute(int n);

    public void run() {
        while (true) {
            int n = getSelected();
            execute(n);
            if (n > mChon.size()) {
                break;
            }
        }
    }
}