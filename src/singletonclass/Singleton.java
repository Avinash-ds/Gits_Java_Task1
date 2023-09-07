package singletonclass;

public class Singleton {
    // Private static instance of the Singleton class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // Initialization code, if needed
    }

    // Public method to provide access to the Singleton instance
    public static Singleton getInstance() {
        // create the instance if it doesn't exist
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and attributes of the Singleton class
    public void printMessage() {
        System.out.println("This is a Singleton class.");
    }
}
