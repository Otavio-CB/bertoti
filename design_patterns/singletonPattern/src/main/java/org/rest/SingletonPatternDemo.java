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
