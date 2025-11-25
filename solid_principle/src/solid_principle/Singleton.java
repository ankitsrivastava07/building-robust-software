package solid_principle;

public class Singleton {

    // Step 1: Create a private static instance variable
    private static volatile Singleton instance;

    // Step 2: Private constructor to prevent external instantiation
    private Singleton() {
    }

    // Step 3: Public method to provide global access (thread-safe)
    public static synchronized Singleton getInstance() {
        if (instance == null) {                     // First check (no locking)
            synchronized (Singleton.class) {
                if (instance == null) {             // Second check
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance created!");
    }
}
