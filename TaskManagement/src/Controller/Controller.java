package Controller;

import Common.Valid;
import Model.Model;

import java.util.ArrayList;

public class Controller {
    Valid v = new Valid();
    ArrayList<Model> tasks = new ArrayList<>();

    public String getTaskType() {
        System.out.println("Task type:");
        System.out.println("1. Code");
        System.out.println("2. Test");
        System.out.println("3. Manage");
        System.out.println("4. Learn");
        int choice = v.inputInt("Enter your choice:", 1, 4);
        String type = null;
        switch (choice) {
            case 1:
                type = "Code";
                break;
            case 2:
                type = "Test";
                break;
            case 3:
                type = "Manager";
                break;
            case 4:
                type = "Learn";
        }
        return type;
    }

    public void addTask() {
        int ID;
        if (tasks.isEmpty()) {
            ID = 1;
        } else {
            ID = tasks.get(tasks.size() - 1).getId() + 1;
        }

        String requirementName = v.inputString("Requirement name:","[A-Za-z0-9\\s]+");
        String taskTypeID = getTaskType();
        String date = v.inputDate("Date: ");
        double planFrom = v.inputDouble("From: ", 0, 17);
        double planTo = v.inputDouble("To: ", planFrom + 0.5, 17.5);
        String assign = v.inputString("Assignee: ","[A-Za-z0-9\\s]+");
        String reviewer = v.inputString("Reviewer: ","[A-Za-z0-9\\s]+");
        tasks.add(new Model(ID, taskTypeID, requirementName, date, planFrom, planTo, assign, reviewer));
    }

    public void removeTask() {
        int ID = v.inputInt("Enter ID: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        for (Model model : tasks) {
            if (model.getId() == ID) {
                tasks.remove(model);
                System.out.println("Remove successfully");
                return;
            }
        }
        System.out.println("ID does not exist");
    }

    public void display() {
        if(tasks.isEmpty()){
            System.out.println("No task");
            return;
        }
        System.out.println("-----------------------------------------Task-----------------------------------------");
        System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assign", "Reviewer");
        for (Model model : tasks) {
            double time= model.getPlanTo()-model.getPlanFrom();
            System.out.printf("%-5d%-15s%-15s%-15s%-15.1f%-15s%-15s\n",
                    model.getId(),
                    model.getRequirementName(),
                    model.getTaskTypeId(),
                    model.getDate(),
                    time,
                    model.getAssign(),
                    model.getReviewer()
            );
        }
    }
}
