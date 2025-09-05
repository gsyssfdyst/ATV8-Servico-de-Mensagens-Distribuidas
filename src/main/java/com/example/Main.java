package com.example;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MessageService messageService = new MessageService();

        // Novo: mapa de usuários de teste e AuthService
        Map<String, String> users = new HashMap<>();
        users.put("user1", "pass1");
        users.put("user2", "pass2");
        AuthService authService = new AuthService(users);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command (post/view/exit): ");
            String command = scanner.nextLine();

            switch (command) {
                case "post":
                    System.out.print("User: ");
                    String user = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();
                    if (authService.authenticate(user, password)) {
                        System.out.print("Message: ");
                        String message = scanner.nextLine();
                        messageService.postMessage(user, message);
                        System.out.println("Message posted.");
                    } else {
                        System.out.println("Authentication failed. Message not posted.");
                    }
                    break;
                case "view":
                    System.out.print("User: ");
                    String viewUser = scanner.nextLine();
                    System.out.print("Password: ");
                    String viewPassword = scanner.nextLine();
                    if (authService.authenticate(viewUser, viewPassword)) {
                        System.out.println("Messages:");
                        for (String msg : messageService.getMessages(viewUser)) {
                            System.out.println(msg);
                        }
                    } else {
                        System.out.println("Authentication failed. Cannot view messages.");
                    }
                    break;
                case "exit":
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }
}