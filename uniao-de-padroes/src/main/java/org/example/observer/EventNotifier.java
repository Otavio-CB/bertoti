package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class EventNotifier {
    private final List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String event) {
        observers.forEach(observer -> observer.update(event));
    }
}
