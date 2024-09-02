package org.rest;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("observer 1");
        Observer observer2 = new ConcreteObserver("observer 2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("first state change");
        subject.setState("second state change");

        subject.detach(observer1);
        subject.setState("third state change");
    }
}