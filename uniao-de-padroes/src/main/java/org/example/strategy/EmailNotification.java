package org.example.strategy;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
