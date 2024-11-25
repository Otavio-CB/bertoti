package org.example;

import org.example.composite.NotificationComponent;
import org.example.composite.NotificationGroup;
import org.example.composite.SingleNotification;
import org.example.observer.EventNotifier;
import org.example.observer.User;
import org.example.singleton.NotificationManager;
import org.example.strategy.EmailNotification;
import org.example.strategy.NotificationStrategy;
import org.example.strategy.PushNotification;
import org.example.strategy.SMSNotification;

public class Main {
    public static void main(String[] args) {
        NotificationStrategy email = new EmailNotification();
        NotificationStrategy sms = new SMSNotification();
        NotificationStrategy push = new PushNotification();

        NotificationComponent emailNotification = new SingleNotification(email);
        NotificationComponent smsNotification = new SingleNotification(sms);
        NotificationComponent pushNotification = new SingleNotification(push);

        NotificationGroup group = new NotificationGroup();
        group.add(emailNotification);
        group.add(smsNotification);
        group.add(pushNotification);

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        EventNotifier notifier = new EventNotifier();
        notifier.subscribe(user1);
        notifier.subscribe(user2);

        NotificationManager manager = NotificationManager.getInstance();

        manager.notifyAll(notifier, "Novo leilão disponível!");

        group.notify("Lembrete: O leilão termina em 1 hora!");
    }
}
