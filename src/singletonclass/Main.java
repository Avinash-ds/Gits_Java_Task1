package singletonclass;

public class Main {
    public static void main(String[] args) {
        // Access the Singleton instance using getInstance() method
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Both instances will be the same
        System.out.println(singleton1 == singleton2); // Output: true

        // Use the Singleton instance
        singleton1.printMessage();
    }
}
