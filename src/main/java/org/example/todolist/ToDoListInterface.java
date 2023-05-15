package org.example.todolist;

import java.util.List;

public interface ToDoListInterface {
    void addTask(String task);
    void markTaskAsCompleted(int index);
    List<String> getIncompleteTasks();
}
