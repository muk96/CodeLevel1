package org.example.todolist;

import java.util.List;
import java.util.Scanner;

public class ToDoListApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ToDoListInterface toDoList = new ToDoList(); //Liskov Substitution -> any subclass can be substituted
    //in place of a superclass

    public static void main(String[] args){
        while(true){
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Display Incomplete Tasks");
            System.out.println("4. Quit");

            int choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    System.out.print("Enter task : ");
                    String task = scanner.next();
                    toDoList.addTask(task);
                    break;
                case 2 :
                    System.out.print("Enter task index : ");
                    int index = scanner.nextInt();
                    toDoList.markTaskAsCompleted(index);
                    break;
                case 3 :
                    List<String> incompleteTasks = toDoList.getIncompleteTasks();
                    if(incompleteTasks.isEmpty())
                        System.out.println("No incomplete tasks");
                    else {
                        System.out.println("Incomplete tasks :");
                        for (String incompleteTask : incompleteTasks) {
                            System.out.println(incompleteTask);
                        }
                    }
                    break;
                case 4 :
                    return;
                default :
                    System.out.println("Invalid choice!");
            }

            System.out.println();
        }
    }
}
