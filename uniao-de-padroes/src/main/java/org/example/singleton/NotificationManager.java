package org.example.singleton;

import org.example.observer.EventNotifier;

public class NotificationManager {
    private static NotificationManager instance;

    private NotificationManager() {}

    public static synchronized NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    public void notifyAll(EventNotifier notifier, String message) {
        notifier.notifyObservers(message);
    }
}
