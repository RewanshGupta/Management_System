package com.rewa.taskmanager;

public class TaskService {

    private TaskRepository repository = new TaskRepository();
    private int taskCounter = 1;

    public void createTask(String title) {
        Task task = new Task(taskCounter++, title);
        repository.addTask(task);
        System.out.println("Task added: " + title);
    }

    public void completeTask(int id) {
        Task task = repository.getTaskById(id);

        if (task == null) {
            System.out.println("Task not found.");
            return;
        }

        task.markAsCompleted();
        System.out.println("Task marked as completed: " + task.getTitle());
    }

    public void listTasks() {
        System.out.println("\n--- All Tasks ---");
        repository.getAllTasks().forEach(System.out::println);
    }
}
