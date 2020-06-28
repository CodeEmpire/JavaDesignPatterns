package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.singleton;

public class Client {

    public static void main(String[] args) {
        Preferences.getInstance().helloSingleton();

        MyPreferences.getInstance().helloSingleton();
    }

}
