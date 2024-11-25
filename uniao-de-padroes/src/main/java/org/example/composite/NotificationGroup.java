package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class NotificationGroup implements NotificationComponent {
    private final List<NotificationComponent> components = new ArrayList<>();

    public void add(NotificationComponent component) {
        components.add(component);
    }

    public void remove(NotificationComponent component) {
        components.remove(component);
    }

    @Override
    public void notify(String message) {
        components.forEach(component -> component.notify(message));
    }
}