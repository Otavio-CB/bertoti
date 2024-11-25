package org.example.composite;

import org.example.strategy.NotificationStrategy;

public class SingleNotification implements NotificationComponent {
    private final NotificationStrategy strategy;

    public SingleNotification(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void notify(String message) {
        strategy.send(message);
    }
}
