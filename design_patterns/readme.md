Sure, here is the information formatted in Markdown:

### Composite Pattern
The Composite pattern is used to treat individual objects and compositions of objects uniformly.

```plaintext
Composite Pattern UML Diagram

+----------------+       +----------------+       +----------------+
|    Component   |<------+   Composite    |<------+    Leaf        |
|----------------|       |----------------|       |----------------|
|+ operation()   |       |+ operation()   |       |+ operation()   |
+----------------+       |+ add(Component)|       +----------------+
                         |+ remove(Component)     |
                         |+ getChild(int)         |
                         +------------------------+
```

### Observer Pattern
The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

```plaintext
Observer Pattern UML Diagram

+----------------+       +----------------+       +----------------+
|   Subject      |       |   Observer     |       | ConcreteObserver|
|----------------|       |----------------|       |----------------|
|+ attach(Observer)|<----|+ update()      |<------|+ update()      |
|+ detach(Observer)|     +----------------+       +----------------+
|+ notify()      |
+----------------+
```

### Singleton Pattern
The Singleton pattern ensures a class has only one instance and provides a global point of access to it.

```plaintext
Singleton Pattern UML Diagram

+----------------+
|   Singleton    |
|----------------|
|+ getInstance() |
|+ operation()   |
+----------------+
```

### Strategy Pattern
The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

```plaintext
Strategy Pattern UML Diagram

+----------------+       +----------------+       +----------------+
|   Context      |       |   Strategy     |       | ConcreteStrategy|
|----------------|       |----------------|       |----------------|
|+ setStrategy() |<------|+ algorithm()   |<------|+ algorithm()   |
|+ execute()     |       +----------------+       +----------------+
+----------------+
```

### Singleton Pattern Example in Java

#### Singleton.java
```java
package org.rest;

// Interface - Classe Singleton
public class Singleton {

    // A única instância do Singleton
    private static Singleton uniqueInstance;

    // Construtor privado para impedir instanciamento externo
    private Singleton() {
        // Código de inicialização
    }

    // Método que retorna a única instância da classe
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Exemplo de um método que a instância do Singleton pode ter
    public void showMessage() {
        System.out.println("Olá do Singleton!");
    }
}
```

#### SingletonPatternDemo.java
```java
package org.rest;

// Cliente
public class SingletonPatternDemo {
    public static void main(String[] args) {

        // Obter a única instância do Singleton
        Singleton singleton = Singleton.getInstance();

        // Usar o Singleton
        singleton.showMessage();
    }
}
```