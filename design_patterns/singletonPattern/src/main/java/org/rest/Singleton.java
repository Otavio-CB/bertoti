public class Singleton {

    private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public void showMessage() {
        System.out.println("Olá do Singleton!");
    }
}
