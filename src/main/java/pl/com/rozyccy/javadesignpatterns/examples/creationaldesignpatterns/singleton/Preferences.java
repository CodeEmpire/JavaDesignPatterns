package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.singleton;

/**
 * Singleton class
 */
public class Preferences {
    private static Preferences instance = null;

    protected Preferences() { }

    private synchronized static void createInstance() {
        if (instance == null)
            instance = new Preferences();
    }

    public static Preferences getInstance() {
        if (instance == null) {
            createInstance();
        }
        return instance;
    }

    public void helloSingleton() {
        System.out.println("Hello I'm singleton");
    }
}
