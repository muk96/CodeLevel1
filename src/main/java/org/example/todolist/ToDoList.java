package org.example.todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList implements ToDoListInterface{
    List<String> tasks = new ArrayList<>(); //Liskov Substitution -> Any parent class reference can hold a child object
    //i.e. a subclass can be substituted for any superclass

    @Override
    public void addTask(String task) {
        tasks.add(task);
    }

    @Override
    public void markTaskAsCompleted(int index) {
        tasks.set(index, tasks.get(index) + " (completed)");
    }

    @Override
    public List<String> getIncompleteTasks() {
        List<String> incompleteTasks = new ArrayList<>();
        for(String task : tasks){
            if(!task.endsWith("(completed)"))
                incompleteTasks.add(task);
        }

        return incompleteTasks;
    }
}
