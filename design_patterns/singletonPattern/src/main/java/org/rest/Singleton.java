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

