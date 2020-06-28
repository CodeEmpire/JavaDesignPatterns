package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void initializeGUI(Scrollbar bar, Window window) {
        log.info("Do initialize logic here with {} and {}", bar.getClass().getName(), window.getClass().getName());
    }

    public static void initializeGUI(WidgetFactory factory) {
        initializeGUI(factory.createScrollbar(), factory.createWindow());
    }

    public static void main(String[] args) {
        WidgetFactory factory = new PinkThemeWidgetFactory();
        initializeGUI(factory);

        factory = new YellowThemeWidgetFactory();
        initializeGUI(factory);
    }
}
