package com.rewa.taskmanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaskService service = new TaskService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- TASK MANAGER ---");
            System.out.println("1. Add Task");
            System.out.println("2. Complete Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();
                    service.createTask(title);
                    break;

                case 2:
                    System.out.print("Enter task ID: ");
                    int id = sc.nextInt();
                    service.completeTask(id);
                    break;

                case 3:
                    service.listTasks();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
